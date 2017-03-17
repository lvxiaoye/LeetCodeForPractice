/**
 * TinyURL is a URL shortening service where you enter a URL such as https://leetcode.com/problems/design-tinyurl and it returns a short URL such as http://tinyurl.com/4e9iAk.

Design the encode and decode methods for the TinyURL service. There is no restriction on how your encode/decode algorithm should work. You just need to ensure that a URL can be encoded to a tiny URL and the tiny URL can be decoded to the original URL.
 */
package Medium;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class EncodeandDecodeTinyURL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Codec codec = new Codec();
		String en = codec.encode("https://leetcode.com/problems/design-tinyurl");
		System.out.println(en);
		String dn =codec.decode(en);
		System.out.println(dn);
		
	}
	public static class Codec {
		 Map<Integer, String> map = new HashMap<>();
		    Random r=new Random();
		    int key=r.nextInt(10000);
		    public String encode(String longUrl) {
		        while(map.containsKey(key))
		            key= r.nextInt(10000);
		        map.put(key,longUrl);
		        return "http://tinyurl.com/"+key;
		    }
		    public String decode(String shortUrl) {
		        return map.get(Integer.parseInt(shortUrl.replace("http://tinyurl.com/", "")));
		    }
	}
	/*public class Codec {
	    Map<Integer, String> map = new HashMap<>();
	    public String encode(String longUrl) {
	        map.put(longUrl.hashCode(),longUrl);
	        return "http://tinyurl.com/"+longUrl.hashCode();
	    }
	    public String decode(String shortUrl) {
	        return map.get(Integer.parseInt(shortUrl.replace("http://tinyurl.com/", "")));
	    }
	}*/
	/*
	 * public class Codec {
    Map<Integer, String> map = new HashMap<>();
    int i=0;
    public String encode(String longUrl) {
        map.put(i,longUrl);
        return "http://tinyurl.com/"+i++;
    }
    public String decode(String shortUrl) {
        return map.get(Integer.parseInt(shortUrl.replace("http://tinyurl.com/", "")));
    }
}
	 */
	/*
	 * public class Codec {
    List<String> urls = new ArrayList<String>();
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        urls.add(longUrl);
        return String.valueOf(urls.size()-1);
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        int index = Integer.valueOf(shortUrl);
        return (index<urls.size())?urls.get(index):"";
    }
}
	 */
	/*
	 * public class Codec {
Long counter = 1L;
Map<Long, String> indexToUrl = new HashMap<Long, String>();
Map<String, Long> urlToIndex = new HashMap<String, Long>();
String base62 = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

// Encodes a URL to a shortened URL.
public String encode(String longUrl) {
    if (urlToIndex.containsKey(longUrl)) {
        return "http://tinyurl.com/"+base62Encode(urlToIndex.get(longUrl));
    }
    else {
        indexToUrl.put(counter, longUrl);
        urlToIndex.put(longUrl, counter);
        counter++;
        return "http://tinyurl.com/"+base62Encode(urlToIndex.get(longUrl));
    }
}

// Decodes a shortened URL to its original URL.
public String decode(String shortUrl) {
    String base62Encoded = shortUrl.substring(shortUrl.lastIndexOf("/") + 1);
    long decode = 0;
    for(int i = 0; i < base62Encoded.length(); i++) {
        decode = decode * 62 + base62.indexOf("" + base62Encoded.charAt(i));
    }
    return indexToUrl.get(decode);
}

private String base62Encode(long value) {
    StringBuilder sb = new StringBuilder();
    while (value != 0) {
        sb.append(base62.charAt((int)(value % 62)));
        value /= 62;
    }
    while (sb.length() < 6) {
        sb.append(0);
    }
    return sb.reverse().toString();
}
	 */

}

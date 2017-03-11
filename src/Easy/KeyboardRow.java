package Easy;

import java.util.Scanner;
import java.util.stream.Stream;

public class KeyboardRow {
	
	public static void main(String[] args) {
		String[] words = {"asdfg","qwer","zsef","mnbv","ooOOO","njikK"};
		KeyboardRow kr = new KeyboardRow();
		String[] result = kr.findWords(words);
		for(String r:result){
			System.out.println(r);
		}
	}
	

	public boolean contain(String s1,String s2){
		return (s1.contains(s2) || s1.toUpperCase().contains(s2));
	}

	
    public String[] findWords(String[] words) {
    	if(words == null){
    		return null;
    	}
    	String ss1 = "qwertyuiop";
    	String ss2 = "asdfghjkl";
    	String ss3 = "zxcvbnm";
    	
    	String[] result = new String[words.length];
    	int index =0;
    	for(String w:words){
        	String firstLetter = w.substring(0, 1);    	 
        	//System.out.println(firstLetter);
        	if(contain(ss1,firstLetter)){
        		for(int i =0;i<w.length();i++){
        			if(!contain(ss1,w.substring(i,i+1))){
        				break;
        			}
        			if(i == w.length()-1){
        				result[index] = w;
        				index++;
        			}
        		}
        	}else if(contain(ss2,firstLetter)){
        		for(int i =0;i<w.length();i++){
        			if(!contain(ss2,w.substring(i,i+1))){
        				break;
        			}
        			if(i == w.length()-1){
        				result[index] = w;
        				index++;
        			}
        		}
        	}else if(contain(ss3,firstLetter)){
        		for(int i =0;i<w.length();i++){
        			if(!contain(ss3,w.substring(i,i+1))){
        				break;
        			}
        			if(i == w.length()-1){
        				result[index] = w;
        				index++;
        			}
        		}
             }    	
        }
    	String[] r = new String[index];
    	for(int i =0;i<index;i++){
    		r[i]=result[i];
    	}
        return r;

    }
    
    
/* java one-line solution: ~~~~(>_<)~~~~    
 * public String[] findWords(String[] words) {
        return Stream.of(words).filter(s -> s.toLowerCase().matches("[qwertyuiop]*|[asdfghjkl]*|[zxcvbnm]*")).toArray(String[]::new);
    }*/
}

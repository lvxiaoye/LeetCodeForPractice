/**
 * Input: [5, 4, 3, 2, 1]
Output: ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
Explanation: The first three athletes got the top three highest scores, so they got "Gold Medal", "Silver Medal" and "Bronze Medal". 
For the left two athletes, you just need to output their relative ranks according to their scores.
 */

package Easy;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

public class RelativeRanks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] input = {7,100,3,0,222,45};
		String[] result = findRelativeRanks(input);
		for(String s :result){
			System.out.print(s+" ");
		}
		
		
	}    
	public static String[] findRelativeRanks(int[] nums) {
        Comparator<Integer> keyCompar = new Comparator<Integer>(){
        	public int compare(Integer o1, Integer o2) {
        		return o2.compareTo(o1);
        	}
        };
        
        if(nums == null){
        	return null;
        }
		TreeMap<Integer,Integer> tm = new TreeMap<>(keyCompar);
		String[] result = new String[nums.length];

        for(int i=0;i<nums.length;i++){
        	tm.put(nums[i],i);
        }

        Iterator<Entry<Integer, Integer>> iter = tm.entrySet().iterator();
        int i=0;
        while(iter.hasNext()){
        	if(i == 0){
        		result[iter.next().getValue()] = "Gold Medal";
        	}else if(i==1){
        		result[iter.next().getValue()] = "Silver Medal";
        	}else if(i ==2){
        		result[iter.next().getValue()] = "Bronze Medal";
        	}
        	else
        		result[iter.next().getValue()] = i+1+"";
        	i++;
        }
        return result;
        
    }
	
	/**maybe sorting will be faster.
	 * public class Solution {
    public String[] findRelativeRanks(int[] nums) {
        int[] ranks = nums.clone(); 
        Arrays.sort(ranks);
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<ranks.length; i++){
            map.put(ranks[i], nums.length-i);
        }
        String[] res = new String[nums.length];
        for(int i = 0; i<nums.length; i++){
            int rank = map.get(nums[i]);
            String rankStr = rank+"";
            if(rank==1) rankStr = "Gold Medal";
            else if(rank==2) rankStr = "Silver Medal";
            else if(rank==3) rankStr = "Bronze Medal";
            res[i] = rankStr; 
        }
        return res; 
    }
}
	 */

}

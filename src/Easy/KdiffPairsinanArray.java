/**
 * Given an array of integers and an integer k, you need to find the number of unique k-diff pairs in the array. Here a k-diff pair is defined as an integer pair (i, j), where i and j are both numbers in the array and their absolute difference is k.

Example 1:
Input: [3, 1, 4, 1, 5], k = 2
Output: 2
Explanation: There are two 2-diff pairs in the array, (1, 3) and (3, 5).
Although we have two 1s in the input, we should only return the number of unique pairs.
Example 2:
Input:[1, 2, 3, 4, 5], k = 1
Output: 4
Explanation: There are four 1-diff pairs in the array, (1, 2), (2, 3), (3, 4) and (4, 5).
Example 3:
Input: [1, 3, 1, 5, 4], k = 0
Output: 1
Explanation: There is one 0-diff pair in the array, (1, 1).
Note:
The pairs (i, j) and (j, i) count as the same pair.
The length of the array won't exceed 10,000.
All the integers in the given input belong to the range: [-1e7, 1e7].
 */
package Easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class KdiffPairsinanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums ={281,119,96,8,310,482,400,258,226,435,140,466,348,440,13,492,42,278,344,40,132,294,336,293,386,488,167,519,165,439,297,522,250,520,494,4,187,364,132,151,477,452,270,288,405,312,295,35,96,33,106,262,277,156,55,429,209,118,326,112,422,450,273,213,441,382,300,408,274,392,362,128,187,303,400,86,285,249,124,132,363,39,452,2,476,241,326,352,280,370,336,494,216,265,426,448,243,283,142,210,151,156,61,305,389,155,48,373,331,82,122,41,497,282,88,127,385,305,334,405,360,268,309,91,148,221,341,260,426,88,523,170,381,313,52,193,176,300,49,2,483,86,214,295,174,62,54,86,254,522,501,269,495,88,508,250,137,27,459,219,241,269,318,328,273,339,225,397,398,115,183,210,486,253,338,321,454,494,335,262,460,213,265,515,444,426,461,135,353,488,396,107,513,108,115,345,155,80,435,329,150,380,372,322,9,31,500,98,509,164,298,333,281,188,384,143,290,143,139,161,14,308,358,228,259,312,348,84,487,170,228,96,17,257,268,318,64,191,20,233,27,391,481,424,161,59,211,50,37,420,366,377,122,95,296,80,255,119,395,371,504,211,323,220,273,384,433,245,366,48,382,154,396,121,348,105,327,448,155,101,20,461,114,263,439,471,102,170,490,525,469,111,206,406,206,27,487,424,224,323,267,371,2,119,116,167,465,131,425,9,421,456,270,498,510,119,248,450,449,167,132,60,306,479,162,454,274,36,492,267,415,103,299,439,104,442,326,418,130,103,338,56,372,148,367,127,455,482,146,99,269,299,75,60,12,235,277,350,464,111,373,438,121,82,359,504,482,396,347,450,266,315,163,124,332,406,56,384,438,275,181,302,197,493,524,513,130,110,240,471,479,191,486,52,103,522,93,501,423,305,201,90,203,203,151,177,244,130,86,202,72,3,390,339,405,467,352,461,52,332,186,471,225,461,438,511,203,222,503,89,517,420,432,243,292,372,381,117,487,120,425,410,408,64,253,175,478,277,50,516,371,315,502,370,271,516,215,210,190,44,26,503,229,263,480,402,520,388,325,229,161,28,119,62,357,424,229,45,453,525,437,324,348,476,362,206,50,239,331,412,150,407,351,424,464,49,86,159,122,124,344,463,101,194,256,222,72,335,256,521,239,475,451,149,67,245,381,478,328,77,149,294,7,304,240,258,2,461,253,237,504,51,120,262,240,203,154,17,463,294,322,0,413,187,336,518,281,517,354,261,443,103,236,199,496,88,77,502,48,315,282,90,513,159,280,62,437,149,260,129,503,486,220,360,7,442,206,481,72,324,373,86,347,426,133,384,350,93,209,94,251,167,282,452,439,45,42,468,191,371,116,68,273,22,418,182,432,143,482,461,295,297,472,56,385,266,55,476,267,368,14,167,403,232,14,288,6,190,32,64,230,525,440,443,192,79,107,337,212,133,74,466,197,297,491,128,489,140,322,224,401,30,122,56,221,512,1,162,5,336,334,415,182,285,143,109,134,156,257,503,197,208,233,110,290,44,30,30,452,34,308,117,183,8,46,166,90,61,349,490,303,114,505,324,138,219,485,103,374,490,297,369,240,454,30,424,238,133,175,93,150,315,511,271,185,428,76,126,286,302,352,340,400,98,135,457,512,334,325,153,80,479,24,189,471,417,409,45,208,248,493,491,38,49,103,331,241,21,300,281,287,373,16,251,213,87,425,335,276,25,399,311,147,149,191,447,467,349,74,284,52,188,377,299,525,496,342,203,144,142,128,89,246,488,490,512,127,367,260,496,502,289,338,435,99,232,416,115,109,141,86,384,75,487,195,221,94,81,412,358,385,130,338,147,131,360,41,238,263,281,411,364,391,40,331,107,255,105,126,27,47,53,302,363,432,299,311,79,128,366,176,42,516,517,43,340,143,74,29,287,177,368,99,295,83,415,256,153,301,407,405,377,367,178,53,139,247,258,422,109,419,402,27,137,463,225,449,462,261,231,241,253,467,242,503,82,186,140,483,424,75,58,220,317,288,56,490,402,6,513,274,418,71,277,2,355,498,189,25,16,70,479,423,505,307,256,514,409,462,216,43,272,510,207,386,116,215,333,305,446,471,256,441,251,495,204,465,433,459,456,111,473,70,313,28,323,453,478,498,68,309,282,45,390,501,401,469,65,14,345,24,222,248,498,456,433,332,130,440,466,157,371,33,443,180,320,123,429,313,389,334,414,437,17,514,181,136,79,268,399,347,407,382,19,401,164,216,313,190,324};
		System.out.println(findPairs(nums,163));

	}
/* time limit exceed:  
 *  public static int findPairs(int[] nums, int k) {
        List<String> l = new ArrayList<String>();
        for(int i=0;i<nums.length;i++){
        labelA:
        	for(int j=i+1;j<nums.length;j++){
    			String s1=nums[i]+" "+nums[j];
    			String s2 =nums[j]+" "+ nums[i];
        		if(Math.abs(nums[i]-nums[j])==k){
        			for(String s:l){
        				if(s.equals(s1)||s.equals(s2))
        					continue labelA;
        			}
        			l.add(s1);
        			l.add(s2);
        		}
        	}
        }
        for(String s:l){
        	System.out.print(s+" ");
        }
        System.out.println("\n");
        return l.size()/2;
    }*/

	
	    public static int findPairs(int[] nums, int k) {
	        if (k < 0) { return 0; }

	        Set<Integer> starters = new HashSet<Integer>();
	        Set<Integer> uniqs = new HashSet<Integer>();
	        for (int i = 0; i < nums.length; i++) {
	            if (uniqs.contains(nums[i] - k)) starters.add(nums[i] - k);
	            if (uniqs.contains(nums[i] + k)) starters.add(nums[i]);
	            uniqs.add(nums[i]);
	        }

	        return starters.size();
	    }
	    /*
	     * public class Solution {
    public int findPairs(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 0)   return 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (k == 0) {
                //count how many elements in the array that appear more than twice.
                if (entry.getValue() >= 2) {
                    count++;
                } 
            } else {
                if (map.containsKey(entry.getKey() + k)) {
                    count++;
                }
            }
        }
        
        return count;
    }
}
	     */
	
	    /*
	     * public int findPairs(int[] nums, int k) {
    int ans = 0;
    Arrays.sort(nums);
    for (int i = 0, j = 0; i < nums.length; i++) {
        for (j = Math.max(j, i + 1); j < nums.length && (long) nums[j] - nums[i] < k; j++) ;
        if (j < nums.length && (long) nums[j] - nums[i] == k) ans++;
        while (i + 1 < nums.length && nums[i] == nums[i + 1]) i++;
    }
    return ans;
}
	     */
	    /*
	     * public class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        Set<Integer> seenNum = new HashSet<>();
        Set<String> seenPair = new HashSet<>();
        int result = 0;
        
        for (int i = 0; i < nums.length; i++) {
            int prev = nums[i] - k;
            if (seenNum.contains(prev) && !seenPair.contains(prev + "," + nums[i])) {
                result++;
                seenPair.add(prev + "," + nums[i]);
            }
            seenNum.add(nums[i]);
        }
        return result;
    }
}
	     */
}

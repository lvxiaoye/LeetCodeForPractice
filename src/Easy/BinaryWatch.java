/**
 * A binary watch has 4 LEDs on the top which represent the hours (0-11), and the 6 LEDs on the bottom represent the minutes (0-59).

Each LED represents a zero or one, with the least significant bit on the right.
For example, the above binary watch reads "3:25".

Given a non-negative integer n which represents the number of LEDs that are currently on, return all possible times the watch could represent.

Example:

Input: n = 1
Return: ["1:00", "2:00", "4:00", "8:00", "0:01", "0:02", "0:04", "0:08", "0:16", "0:32"]
Note:
The order of output does not matter.
The hour must not contain a leading zero, for example "01:00" is not valid, it should be "1:00".
The minute must be consist of two digits and may contain a leading zero, for example "10:2" is not valid, it should be "10:02"
 */
package Easy;

import java.util.List;
import java.util.ArrayList;

public class BinaryWatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 0;
		List<String> result = readBinaryWatch(num);
		for(int i=0;i<result.size();i++){
			System.out.print(result.get(i)+" ");
		}
				
		
		
	}
    public static List<String> readBinaryWatch(int num) {
    	List<String> result = new ArrayList<String>();
    	if(num<0 ||num>8){
    		return result;
    	}
    	int[] hour = {1,2,4,8};
    	int[] minute = {1,2,4,8,16,32};
    	ArrayList<Integer> h = new ArrayList<>();
    	ArrayList<Integer> m = new ArrayList<>();
    	for(int a = 0;a<=3;a++){
    		int b = num - a;
   			if(b>5||b<0){
   				continue;
   			}
   			h.add(a);
   			m.add(b);
    	}
    	
    	for(int i=0;i<h.size();i++){
    		List<Integer> l1 = generateDigit(hour,h.get(i));
    		List<Integer> l2 = generateDigit(minute, m.get(i));
    		for(int a:l1){
    			if(a>=12){
    				continue;
    			}
    			for(int b:l2){
    				if(b>=60){
    					continue;
    				}
    				result.add(a+":"+((b<10)?"0"+b:b));
    			}
    		}
    		
    	}

    	
    	
    	return result;
    	
        
    }
    private static List<Integer> generateDigit(int[] nums, int count) {
        List<Integer> res = new ArrayList<>();
        generateDigitHelper(nums, count, 0, 0, res);
        return res;
    }

    private static void generateDigitHelper(int[] nums, int count, int pos, int sum, List<Integer> res) {
        if(count == 0) {
            res.add(sum);
            return;
        }
        
        for(int i = pos; i < nums.length; i++) {
            generateDigitHelper(nums, count - 1, i + 1, sum + nums[i], res);    
        }
    }
    /**Integer.bitCount() 返回的是此整数在二进制表达形式下1的个数
     * 
     * public List<String> readBinaryWatch(int num) {
    List<String> times = new ArrayList<>();
    for (int h=0; h<12; h++)
        for (int m=0; m<60; m++)
            if (Integer.bitCount(h * 64 + m) == num)   //相当于Integer.bitCount(m)+Integer.bitCount(h) 或者 Integer.bitCount(m+h<<6)
                times.add(String.format("%d:%02d", h, m));
    return times;        
}
     */
    /**the most briliant one:
     * 
     * public class Solution {
    public List<String> readBinaryWatch(int num) {
        List<String> res = new ArrayList<>();
        int[] nums1 = new int[]{8, 4, 2, 1}, nums2 = new int[]{32, 16, 8, 4, 2, 1};
        for(int i = 0; i <= num; i++) {
            List<Integer> list1 = generateDigit(nums1, i);
            List<Integer> list2 = generateDigit(nums2, num - i);
            for(int num1: list1) {
                if(num1 >= 12) continue;
                for(int num2: list2) {
                    if(num2 >= 60) continue;
                    res.add(num1 + ":" + (num2 < 10 ? "0" + num2 : num2));
                }
            }
        }
        return res;
    }

    private List<Integer> generateDigit(int[] nums, int count) {
        List<Integer> res = new ArrayList<>();
        generateDigitHelper(nums, count, 0, 0, res);
        return res;
    }

    private void generateDigitHelper(int[] nums, int count, int pos, int sum, List<Integer> res) {
        if(count == 0) {
            res.add(sum);
            return;
        }
        
        for(int i = pos; i < nums.length; i++) {
            generateDigitHelper(nums, count - 1, i + 1, sum + nums[i], res);    
        }
    }
}
     * 
     */

}

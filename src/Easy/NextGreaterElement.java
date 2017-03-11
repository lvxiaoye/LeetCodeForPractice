package Easy;

import java.util.HashMap;

public class NextGreaterElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums1 = {4,1,2};
		int[] nums2 = {1,3,4,2};
		int[] nums3 = {2,4};
		int[] nums4 = {1,2,3,4};
		NextGreaterElement nge = new NextGreaterElement();
		int[] result = nge.nextGreaterElement(nums3,nums4);
		for(int i=0;i<result.length;i++){
			System.out.print(result[i]+" ");
		}
				
	}
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
    	if(findNums == null || nums == null){
    		return null;
    	}
    	//HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
    	int[] result = new int[findNums.length];
        int index = 0;
    	for(int i=0;i<findNums.length;i++){
    		labelB:
        	for(int j=0;j<nums.length;j++){     		
        		if(nums[j] == findNums[i]){
        			if(j == nums.length-1){
        				result[index] = -1;
        				index++;
        			}
        			for(int k=j+1;k<nums.length;k++){
        				if(nums[k]>findNums[i]){
        					result[index] = nums[k];
        					index++;
        					break labelB;
        				}else if(k == nums.length-1){
        					result[index] = -1;
        					index++;
        					break labelB;
        				}     					
        			}
        		}
        	}
        }
    	return result;
    }
    
    
      //  运用stack这种特殊的数据结构使效率提高代码量减少
      // stack只有push和pop两个操作，先进后出，总对堆顶的数据进行操作
      //hashMap 的  getOrDefault(Key, defaultValue), 检查map中是否包含有所查询的key，如果没有返回默认值，如果有返回原值    
    /*  public int[] nextGreaterElement(int[] findNums, int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(); // map from x to next greater element of x
        Stack<Integer> stack = new Stack<>();
        for (int num : nums) {
            while (!stack.isEmpty() && stack.peek() < num)
                map.put(stack.pop(), num);
            stack.push(num);
        }   
        for (int i = 0; i < findNums.length; i++)
            findNums[i] = map.getOrDefault(findNums[i], -1);
        return findNums;
    }
     */

}

/**
 * Given an index k, return the kth row of the Pascal's triangle.

For example, given k = 3,
Return [1,3,3,1].

Note:
Could you optimize your algorithm to use only O(k) extra space?
 */
package Easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PascalsTriangleII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List<Integer> l = getRow(3);
		
		//一下为其他人算法每一步步骤， 在list相同index上加入数字的时候，再在index0上面加的数字会插入原index的数字之前，其他数字index
		//依次后退
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(0, 1);
		l1.add(0, 1);		
		l1.add(0, 1);		
		//System.out.print(l1.size());
		
		for(int i=0;i<l1.size();i++){
			System.out.println(i+" " +l1.get(i));
		}
		System.out.println("\n");
		l1.set(1,l1.get(1)+l1.get(2));
		for(int i=0;i<l1.size();i++){
			System.out.println(i+" " +l1.get(i));
		}
		System.out.println("\n");
		l1.add(0,1);
		for(int i=0;i<l1.size();i++){
			System.out.println(i+" " +l1.get(i));
		}
		System.out.println("\n");
		l1.set(1, l1.get(1)+l1.get(2));
		for(int i=0;i<l1.size();i++){
			System.out.println(i+" " +l1.get(i));
		}
		System.out.println("\n");
		l1.set(2, l1.get(2)+l1.get(3));
		for(int i=0;i<l1.size();i++){
			System.out.println(i+" " +l1.get(i));
		}
		System.out.println("\n");
		l1.add(0,1);
		for(int i=0;i<l1.size();i++){
			System.out.println(i+" " +l1.get(i));
		}
		System.out.println("\n");
		l1.set(1, l1.get(1)+l1.get(2));
		for(int i=0;i<l1.size();i++){
			System.out.println(i+" " +l1.get(i));
		}
		System.out.println("\n");
		l1.set(2, l1.get(2)+l1.get(3));
		for(int i=0;i<l1.size();i++){
			System.out.println(i+" " +l1.get(i));
		}
		System.out.println("\n");
		l1.set(3,l1.get(3)+l1.get(4));
		for(int i=0;i<l1.size();i++){
			System.out.println(i+" " +l1.get(i));
		}
		System.out.println("\n");
		l1.add(1,7);
		l1.add(1,6);
		for(int i=0;i<l1.size();i++){
			System.out.println(i+" " +l1.get(i));
		}
	}
    public static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
      	for(int i=0;i<rowIndex+1;i++){
          	if(i==0){
          		List<Integer> list = new LinkedList<Integer>();
          		list.add(1);
          		result.add(i,list);
          	}else{
          		List<Integer> prev = result.get(i-1);
          		List<Integer> list = new LinkedList<Integer>();
          		for(int j=0;j<prev.size()+1;j++){
          			if(j==0){
          				list.add(j,1);
          				continue;
          			}
          			if(j==prev.size()){
          				list.add(prev.size(),1);
          				continue;
          			}else{
          				list.add(j, prev.get(j-1)+prev.get(j));
          			}
          		}
          		result.add(list);
          	
          	}
          }
      	return result.get(rowIndex);
    }
    /**
     *   public List<Integer> getRow(int rowIndex) {
	List<Integer> list = new ArrayList<Integer>();
	if (rowIndex < 0)
		return list;

	for (int i = 0; i < rowIndex + 1; i++) {
		list.add(0, 1);
		for (int j = 1; j < list.size() - 1; j++) {
			list.set(j, list.get(j) + list.get(j + 1));
		}
	}
	return list;
}
     */

}

/**
 * Given numRows, generate the first numRows of Pascal's triangle.

For example, given numRows = 5,
Return

[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
 */
package Easy;

import java.util.LinkedList;
import java.util.List;

public class PascalsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<List<Integer>> result = generate(5);
		for(List<Integer> l :result){
			for(int i=0;i<l.size();i++){
				System.out.print(l.get(i)+" ");
			}
			System.out.println("\n");
		}
	}
    public static List<List<Integer>> generate(int numRows) {
       List<List<Integer>> result = new LinkedList<List<Integer>>();
    	for(int i=0;i<numRows;i++){
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
    	return result;
    }
    /*
     * public class Solution {
public List<List<Integer>> generate(int numRows)
{
	List<List<Integer>> allrows = new ArrayList<List<Integer>>();
	ArrayList<Integer> row = new ArrayList<Integer>();
	for(int i=0;i<numRows;i++)
	{
		row.add(0, 1);
		for(int j=1;j<row.size()-1;j++)
			row.set(j, row.get(j)+row.get(j+1));
		allrows.add(new ArrayList<Integer>(row));
	}
	return allrows;
	
}
     */

}

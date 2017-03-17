/**
 * Suppose you have a random list of people standing in a queue. Each person is described by a pair of integers (h, k), where h is the height of the person and k is the number of people in front of this person who have a height greater than or equal to h. Write an algorithm to reconstruct the queue.

Note:
The number of people is less than 1,100.

Example

Input:
[[7,0], [4,4], [7,1], [5,0], [6,1], [5,2]]

Output:
[[5,0], [7,0], [5,2], [6,1], [4,4], [7,1]]
 */
package Medium;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class QueueReconstructionbyHeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] people = {{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
		int[][] res=reconstructQueue(people);
		//Arrays.sort(people);
		for(int[] person:res){
			System.out.println(person[0]+","+person[1]);
		}
	}
    public static int[][] reconstructQueue(int[][] people) {
        if(people == null ||people.length==0){
        	return null;
        }
        Arrays.sort(people,new Comparator<int[]>(){

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				return o1[0]==o2[0]?o1[1]-o2[1]:o2[0]-o1[0]; //在这里，如果o1与o2身高不等，倘若o20-o10>0,实则说明o2身高高，但>0则说明o1>o2,所以把o2放在前面，个高的先出去
			}
        	
        });
        List<int[]> l = new ArrayList<>();
        for(int[] p:people){
        	l.add(p[1],p);
        }
        return l.toArray(new int[people.length][]);
    }

}

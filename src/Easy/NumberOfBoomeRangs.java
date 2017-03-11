/**
 * Given n points in the plane that are all pairwise distinct, a "boomerang" is a tuple of points (i, j, k) such that the distance between i and j equals the distance between i and k (the order of the tuple matters).

Find the number of boomerangs. You may assume that n will be at most 500 and coordinates of points are all in the range [-10000, 10000] (inclusive).

Example:
Input:
[[0,0],[1,0],[2,0]]

Output:
2

Explanation:
The two boomerangs are [[1,0],[0,0],[2,0]] and [[1,0],[2,0],[0,0]]
 */
package Easy;

import java.util.HashMap;

public class NumberOfBoomeRangs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] points = {{0,0},{1,0},{2,0}};
		System.out.print(numberOfBoomerangs(points));

	}
    public static int numberOfBoomerangs(int[][] points) {
    	if(points == null || points.length == 0){
    		return 0;
    	}
    	HashMap<Double,Integer> map = new HashMap<>();
    	int count = 0;
        for(int i=0;i<points.length;i++){
        	for(int j=0;j<points.length;j++){
        		if(i == j){
        			continue;
        		}
        		double dis = distance(points[i],points[j]);
        		if(map.containsKey(dis)){
        			map.put(dis, map.get(dis)+1);
        		}else
        			map.put(dis, 1);
        	}
        	for(int val:map.values()){
        		count+=val*(val-1);
        		
        	}
        	
        	map.clear();
        	
        }
        
    	return count;
    }
    
    public static double distance(int[] point1,int[] point2){
    	return Math.sqrt(Math.pow(point1[1]-point2[1], 2)+Math.pow(point1[0]-point2[0], 2));
    }
    /**
     * distance 可以被简化成不开根号
     */
}

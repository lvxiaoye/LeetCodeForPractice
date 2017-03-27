/**
 * Given a matrix of M x N elements (M rows, N columns), return all elements of the matrix in diagonal order as shown in the below image.

Example:
Input:
[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]
Output:  [1,2,4,7,5,3,6,8,9]
Explanation:

Note:
The total number of elements of the given matrix will not exceed 10,000.
 */
package Medium;

import java.util.ArrayList;
import java.util.List;

public class DiagonalTraverse {


	public static void main(String[] args){
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		int[] res = findDiagonalOrder(matrix);
		for(int i:res){
			System.out.println(i+" ");
		}
	}
   /* doesn't work.
    * public static int[] findDiagonalOrder(int[][] matrix) {
    	int m=matrix.length, n=matrix[0].length;
    	int[] res = new int[m*n];
    	if(matrix.length==0 || matrix[0].length==0){
    		return res;
    	}
    	List<Integer> l = new ArrayList<>();
    	l.add(matrix[0][0]);
    	int limit = m+n-2;
    	int i=0, j=1;
    	while(i<m & i>=0 & j<n & j>=0 & i+j < limit){
    		int tmp = i+j;
    		if(i==0 && j<n){
    			i+=1;
				j=tmp-i;
    			labelA:
    			while(i<m && j>=0 && i+j<limit){
    				i+=1;
    				j=tmp-i;
    				l.add(matrix[i][j]);
    				System.out.print(matrix[i][j]+" ");
    				if(j==0){
    					tmp+=1;
    					break labelA;
    				}
    			}
    			System.out.println("\n");
    		}
    		if(j==0 && i<m){
    			while(j<n & i>=0 & i+j<=limit){
    				j+=1;
    				i=tmp-j;
    				System.out.print(matrix[i][j]+" ");
    				l.add(matrix[i][j]);
    				if(i==0){
    					tmp+=1;
    					break;
    				}
    			}
    			System.out.println("\n");
    		}
    	}
    	l.add(matrix[m-1][n-1]);
    	for(int k=0;k<l.size();k++){
    		res[k+1]=l.get(k);
    	}
    	return res;

        
    }*/
    public static int[] findDiagonalOrder(int[][] matrix) {
 if (matrix.length == 0) return new int[0];
        int r = 0, c = 0, m = matrix.length, n = matrix[0].length, arr[] = new int[m * n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = matrix[r][c];
            if ((r + c) % 2 == 0) { // moving up
                if      (c == n - 1) { r++; }
                else if (r == 0)     { c++; }
                else            { r--; c++; }
            } else {                // moving down
                if      (r == m - 1) { c++; }
                else if (c == 0)     { r++; }
                else            { r++; c--; }
            }   
        }   
        return arr;       
    }
	
	/*
	 * public class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if(matrix.length == 0)
            return new int[0];
        int c = matrix[0].length, r = matrix.length;
        int[] res = new int[r*c];
        boolean flip = true;
        int count = 0;
        for(int sum = 0; sum <= r + c - 2; sum++){
            int rr,cc;
            if(flip == true){                               // Direction: to up-right
                rr = Math.min(sum, r-1);                    // if before diagonal, rr = sum; else rr = r-1
                cc = sum - rr;
                while(rr >= 00 && cc < c)                   // reach matrix upper or right bound
                    res[count++] = matrix[rr--][cc++];
            }
            else{                                           // Direction: to bottom-left
                cc = Math.min(sum, c-1);                    // if before diagonal, cc = sum; else cc = c-1
                rr = sum - cc;
                while(cc >= 00 && rr < r)                   // reach matrix bottom or left bound
                    res[count++] = matrix[rr++][cc--];
            }
            flip = !flip;           
        }
        return res;
    }
}
	 */
    /*
     * public class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return new int[0];
        int m = matrix.length, n = matrix[0].length;
        
        int[] result = new int[m * n];
        int row = 0, col = 0, d = 1;

        for (int i = 0; i < m * n; i++) {
            result[i] = matrix[row][col];
            row -= d;
            col += d;
            
            if (row >= m) { row = m - 1; col += 2; d = -d;}
            if (col >= n) { col = n - 1; row += 2; d = -d;}
            if (row < 0)  { row = 0; d = -d;}
            if (col < 0)  { col = 0; d = -d;}
        }
        
        return result;
    }
}
     */
}

/**
 * A sequence of number is called arithmetic if it consists of at least three elements and if the difference between any two consecutive elements is the same.

For example, these are arithmetic sequence:

1, 3, 5, 7, 9
7, 7, 7, 7
3, -1, -5, -9
The following sequence is not arithmetic.

1, 1, 2, 5, 7

A zero-indexed array A consisting of N numbers is given. A slice of that array is any pair of integers (P, Q) such that 0 <= P < Q < N.

A slice (P, Q) of array A is called arithmetic if the sequence:
A[P], A[p + 1], ..., A[Q - 1], A[Q] is arithmetic. In particular, this means that P + 1 < Q.

The function should return the number of arithmetic slices in the array A.


Example:

A = [1, 2, 3, 4]

return: 3, for 3 arithmetic slices in A: [1, 2, 3], [2, 3, 4] and [1, 2, 3, 4] itself.
 */
package Medium;

public class ArithmeticSlices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A={1,2,3,4,5,8,9,10};
		System.out.println(numberOfArithmeticSlices(A));
	}
	
    public static int numberOfArithmeticSlices(int[] A) {
        if(A==null||A.length<3){
        	return 0;
        }
        int res=0,sum=0;
        for(int i=2;i<A.length;i++){
        	if(A[i]-A[i-1]==A[i-1]-A[i-2]){
        		res+=1;
        	}else
        		res=0;
        	sum+=res;
        }
        return sum;
        
    }
    /*
     * class Solution {
public:
    int numberOfArithmeticSlices(vector<int>& A) {
        if (A.size() < 3) return 0;
        int size = (int) A.size();
        for (int i = 0; i < size - 1; i++) {
            A[i] = A[i + 1] - A[i];
        }
        A.resize(size - 1);
        size--;
        
        int res = 0;
        int len = 1;
        for (int i = 1; i < size; i++) {
            if (A[i] != A[i - 1]) {
                res += len * (len - 1) / 2;
                len = 1;
            } else {
                len++;
            }
        }
        if (len > 1) res += len * (len - 1) / 2;
        return res;
    }
};
     */
    /*
     * public int numberOfArithmeticSlices(int[] A) {
        if(A == null || A.length < 3)
            return 0;
        int sum = 0;
        int len = 2;

        for(int i=2;i<A.length;i++) {

            // keep increasing the splice
            if(A[i] - A[i-1] == A[i-1] - A[i-2]) {
                len++;
            }
            else {
                if(len > 2) {
                    sum += calculateSlices(len);
                }
                // reset the length of new slice
                len = 2;
            }
        }
        // add up the slice in the rear
        if(len>2)
            sum += calculateSlices(len);

        return sum;
    }

    private int calculateSlices(int n){
        return (n-1)*(n-2)/2;
    }
     */

}

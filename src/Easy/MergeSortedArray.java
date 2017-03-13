/**
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

Note:
You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2. The number of elements initialized in nums1 and nums2 are m and n respectively.
 */
package Easy;

public class MergeSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] nums1={1,3,5,7,0,0,0,0,0,0,0,0,0,0,0};
		int[] nums2={2,4,6,8,10};
		int[] nums3 ={11,12,13,0,0,0,0,0,0,0,0};
		//merge(nums1,4,nums2,5);
		//merge(nums3,3,nums2,5);
		int[] nums4={-1,0,1,1,0,0,0,0,0};
		int[] nums5={-1,0,2,2,3};
		int[] a={0,0,3,0,0,0,0,0,0};
		int[] b ={-1,1,1,1,2,3};
		merge(a,3,b,6);
		for(int i:a){
			System.out.print(i+" ");
		}
	}
//我要哭啦！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
    	if(nums1==null||m==0){
    		//nums1 = new int[n];
    		for(int i=0;i<n;i++){
    			nums1[i]=nums2[i];
    		}
    		return;
    	}else if(nums2 ==null||n==0){
    		nums1=nums1;
    		return;
    	}
/*    	if(m==1 & n==1){
    		int min = Math.min(nums1[0], nums2[0]);
    		int max = Math.max(nums1[0], nums2[0]);
    		nums1= new int[2];
    		nums1[0]=min;
    		nums1[1] =max;
    		return;
    	}*/
        if(nums1[m-1]<nums2[0]){
        	for(int i=m,j=0;i<m+n & j<n;i++,j++){
        		nums1[i]=nums2[j];
        	}
        }else if(nums1[0]>nums2[n-1]){
        	for(int i=m+n-1;i>=n;i--){
        		nums1[i]=nums1[i-n];
        	}
        	for(int i=0;i<n;i++){
        		nums1[i]=nums2[i];
        	}
        }else{
        	int i=0,j=0;
        	while(i<m+n & j<n){
        		if(nums2[j]<nums1[i]){
        			for(int k=m+j;k>i;k--){
        				nums1[k]=nums1[k-1];
        			}
        			nums1[i]=nums2[j];
        			i++;
        			j++;
        		}else{
        			i++;
        		}
        	}
        	if(j!=n-1){
        		System.out.println(j);
        		for(int k=j;k<n;k++){
        			System.out.println(i+" " +nums2[k]);
        			nums1[i-(n-j)]=nums2[k];
        			i++;
        		}
        	}
        }
    }
    /*
     * public:
    void merge(int A[], int m, int B[], int n) {
        int i=m-1;
		int j=n-1;
		int k = m+n-1;
		while(i >=0 && j>=0)
		{
			if(A[i] > B[j])
				A[k--] = A[i--];
			else
				A[k--] = B[j--];
		}
		while(j>=0)
			A[k--] = B[j--];
    }
     */
    /*
     * public void merge(int A[], int m, int B[], int n) {
    int i=m-1, j=n-1, k=m+n-1;
    while (i>-1 && j>-1) A[k--]= (A[i]>B[j]) ? A[i--] : B[j--];
    while (j>-1)         A[k--]=B[j--];
}
     */
}

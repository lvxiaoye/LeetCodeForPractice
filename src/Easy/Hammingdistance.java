package Easy;

import java.util.HashMap;
import java.util.Iterator;

public class Hammingdistance {
	public static void main(String[] args) {
		int x=1,y=4;
		Hammingdistance hd = new Hammingdistance();
		//int result = hd.hammingDistance(x,y);
		int result =hd.hdistance(x, y);
		System.out.println(result);
	}
    public int hammingDistance(int x, int y) {
        HashMap<Integer,Integer> n1 = new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> n2 = new HashMap<Integer,Integer>();
        for(int i=0;i<31;i++){
        	n1.put(i, 0);
        	n2.put(i, 0);
        }
        calculator(x,0, n1);
        Iterator iter = n1.entrySet().iterator();
        while(iter.hasNext()){
        	System.out.print(iter.next().toString()+"\n");
        }
        calculator(y,0, n2);
        Iterator iter2 = n2.entrySet().iterator();
        while(iter2.hasNext()){
        	System.out.print(iter2.next().toString()+"\n");
        }
        int count =0;
        for(int i=0;i<31;i++){
        	if(n1.get(i) != n2.get(i)){
        		count +=1;       		
        		//System.out.println("count = "+count);
        	}
        }
        return count;
    }
    public void calculator(int x, int i,HashMap<Integer, Integer>  n){
    	if(x==0){
    		return;
    	}
    	int b = x%2;
    	n.put(i++, b);	
    	calculator(x/2,i,n);
    }
  //one-line solution
/*    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }*/
    
//three -line solution
  public int hdistance(int x, int y){
  int xor = x ^ y; //(或非运算，相同则返回0，否则为1)
  int count=0;
/*  for (int i=0;i<32;i++) 
	  count += (xor >> i) & 1;*/
  while(xor !=0){
	  count += xor &1;
	  xor >>=1;
  }
  return count;
  }
}

package Easy;

import java.util.Scanner;

public class NumberComplement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input a positive Integer: ");
		int number = sc.nextInt();
		NumberComplement nc = new NumberComplement();
		int result = nc.findComplement(number);
		System.out.println(result);

	}
    public int findComplement(int num) {
    	String m = Integer.toBinaryString(num);
       	String n = Integer.toBinaryString(~num);
       	String s = n.substring(n.length()-m.length());

    	System.out.println(m);
    	System.out.println(n);
    	System.out.println(s);
    	int i = Integer.parseInt(s,2);
    	return i;
        
    }

}

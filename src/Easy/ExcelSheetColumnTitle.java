/**
 * Given a positive integer, return its corresponding column title as appear in an Excel sheet.

For example:

    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB 
 */
package Easy;

public class ExcelSheetColumnTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convertToTitle(53));
	}

    public static String convertToTitle(int n) {
    	String s="";
    	if(n==0){
        	return s;
        }else{
        	s+=convertToTitle(n--/26)+(char)('A'+(n%26));
        }
        return s;
    }
}

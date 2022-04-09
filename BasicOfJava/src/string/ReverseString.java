package string;

public class ReverseString {
	public static void main(String[] args) {
		//Using for loop
		String s = "Akshay";
//		int len = s.length();
//		String rev = "";
//		for(int i =len-1;i>=0;i--) {
//			rev = rev + s.charAt(i);
//			
//		}
//		System.out.println(rev);
		//Using stringBuffer
		StringBuffer sf = new StringBuffer(s);
		StringBuffer rev = sf.reverse();
		System.out.println(rev);
		
	}
	
}

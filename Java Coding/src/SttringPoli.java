
public class SttringPoli {
	
	public static void main (String[]arg){
		
		String s1="reder";
		StringBuffer sb=new StringBuffer(s1);
		String s2=sb.reverse().toString();
		if(s1.equals(s2)) {
			System.out.println("Is Palindrome");
			
		} else {
			System.out.println("Not Palindrome");
		}
		
		
		
	}

}

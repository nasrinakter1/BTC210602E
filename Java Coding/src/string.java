import org.junit.Test;

public class string {
	@Test
	public void stringManu() {
		String s="12abc24";
		s.toString();
		String seperate[]=s.split("abc");
		//System.out.println(seperate[0]);
		//System.out.println(seperate[1]);
		
		int convert=Integer.parseInt(seperate[0]);
		int convertsecond=Integer.parseInt(seperate[1]);
		
		
		
		System.out.println(convert+convertsecond+"This number is now added together");
		
	}

}

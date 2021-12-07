import org.junit.Test;

public class polindrom {
	@Test
	public void isPolindrom() {
		
		String s ="reder";
		char []c=s.toCharArray();
		int j=c.length-1;
		boolean flag=false;
		for(int i=0;i<c.length;i++,j--) {
			if(c[i]!=c[j]) {
				System.out.println("is not polindrom");
				flag=true;
			}
		}
		if(flag==false) {
			System.out.println("polindrom");
		}
		}
	@Test
	public void notPolindrom() {
		String s="121";
		char[]c=s.toCharArray();
		int j=c.length-1;
		boolean flag=false;
		
		for(int i=0; i<c.length;i++,j--) {
			if(c[i]!=c[j]);{
				
			
			System.out.println("is invalid");
			flag=true;
		}
		}
	if(flag==false) {
		System.out.println("valid");
		
	}
	
	}
}





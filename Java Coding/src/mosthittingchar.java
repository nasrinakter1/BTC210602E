import org.junit.Test;

public class mosthittingchar {
	
	@Test
	public void hittingChar() {
		int localcount=0;
		int hcount=1;
		String s = "The United State of America";
		char [] c=s.toCharArray();
		char ch=c[0];
		for(int i=0; i<c.length;i++) {
			for(int j=i+1;j<c.length;j++) {
				if(c[i]==c[j]) {
					localcount++;
					
				}
				if(localcount>hcount) {
				hcount=localcount;
				ch=c[i];
			}
			localcount=1;
		}
		
		System.out.println(ch + " hitted "+hcount+"times");
		
	} 
		}
	

	}
	
	
	

import org.junit.Test;

public class condition {
	
	@Test
	public void ifStatement() {
		
		
		for(int i=1;i<100;i++) {
			if(i%3==0) {
				
			}
		
		 else if(i%5==0) {
			 System.out.println(i+"Hello");
			 
		}
		 else if(i%3==i%5) {
			 System.out.println(i+ "Hi Hello");
			
		 }
		}
	}
	
}



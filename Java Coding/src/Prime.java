

public class Prime {
	
	public static void main(String[] args) {
		
		
		int a=11;
		int count=0;
		
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				count++;
				break;
			}
		}
		if(count==0) {
			System.out.println("prime");
	
			
		}else {
			System.out.println("Not prime");
		}
		
	

		}
		
		
	}

	


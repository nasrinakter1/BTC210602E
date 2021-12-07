package addingJar;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import org.junit.Test;

public class ExceptionHandle {
	
	FileReader f;
	BufferedReader bf;
	
	@Test
	public void test1() {
		try {
			System.out.println(10/1);
			 f= new FileReader(new File("/Users/mito/eclipse-workspace/Java Coding/block.txt"));
			 bf=new BufferedReader(f);
			String line=bf.readLine();
			while(line!=null) {
				System.out.println(line);
				line=bf.readLine();
			}
			}catch(I0Exception e){
			System.out.println("Break");
			System.out.println();
			//e.getMessage();
			//e.printStackTrace();
			
		}finally {
			if(f!=null) {
				try {
					f.close();
				}catch(I0Exception e){
					
				}
				
				}
			}
		
	
		
		//System.out.println("continue");
	}



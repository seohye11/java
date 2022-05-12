package ex3_work;

public class PrintGraph {
	
	public void print(int[] ar) {
		
		for(int i = 0; i < ar.length; i++) {
			
			System.out.print(i + "의 갯수 : "); 
			
			for(int j = 0; j < ar[i]; j++) {
				
				System.out.print("#");			
				
			}//inner
			
			System.out.println(" "+ ar[i]);
			
		}//outer
		
	}

}

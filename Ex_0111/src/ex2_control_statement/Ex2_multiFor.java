package ex2_control_statement;

public class Ex2_multiFor {
	public static void main(String[] args) {
		
		//이중 for문 : for문 안에 for문이 한 개 더 포함되어 있는 경우
		//1 2 3 4 5
		//1 2 3 4 5 
		//1 2 3 4 5
		//1 2 3 4 5
	
		for( int i = 1; i <= 4; i++ ) {//y축(행)
			
			for( int j = 1; j <= 5; j++ ) {//x축(열)
				
				System.out.print(j+" ");
				
			}//inner
			
			System.out.println();//줄바꿈
			
		}//outer
		
		
		
		
	}//main

}

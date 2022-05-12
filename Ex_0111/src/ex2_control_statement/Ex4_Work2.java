package ex2_control_statement;

public class Ex4_Work2 {
	public static void main(String[] args) {
		
		//2중 for문을 이용하여 아래와 같은 결과를 도출하는 코드를 구현
				//1 2 3 4 5 6 7 8 9 10
				//2 3 4 5 6 7 8 9 10 1
				//3 4 5 6 7 8 9 10 1 2
				//4 5 6 7 8 9 10 1 2 3
				//5 6 7 8 9 10 1 2 3 4
				//6 7 8 9 10 1 2 3 4 5
				//7 8 9 10 1 2 3 4 5 6
				//8 9 10 1 2 3 4 5 6 7
				//9 10 1 2 3 4 5 6 7 8
				//10 1 2 3 4 5 6 7 8 9		
				
		for(int i= 1; i <= 10; i++) {
			
			for(int j = 0; j < 10; j++) {
				
				int num = i + j;
				
			    if (num > 10) {
			    	num -= 10;
			    }
			    
				System.out.print(num + " ");
				
			}//inner
			
			System.out.println();
			
		}//outer			
		
	}//main

}

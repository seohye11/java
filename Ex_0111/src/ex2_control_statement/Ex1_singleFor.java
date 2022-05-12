package ex2_control_statement;

public class Ex1_singleFor {
	public static void main(String[] args) {
		
		//for문 : 특정 명령을 원하는 만큼 반복적으로 처리하고자 할 때 사용
		//for( 초기식; 조건식; 증감식 ){
		//  조건식이 참일 때 실행되는 영역
		//}
		
		for( int i = 1;  i <= 5; i++ ) {
			
			//i는 for문 안에서 생성된 지역변수
			System.out.println(i);
			
		}
		
		System.out.println("------------------------");
		
		//10 ~ 1까지 감소되는 값을 출력하는 for문을 생성
		for( int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
		
		System.out.println("------------------------");
		
		//1~100까지 반복되는 for문을 생성하되, 4의 배수만 화면에 출력
		for( int i = 1; i <= 100; i++ ) {
			
			if( i % 4 == 0 ) {
				System.out.println(i);
			}
			
		}
	  
		System.out.println("------------------------");
		
		//dan에 해당되는 구구단을 출력하시오
		
		int dan = 2;
		for(int i = 1; i <= 9; i++) {
			
			System.out.println(dan + "*" + i +"=" + (i*dan));
		}

	}//main

}

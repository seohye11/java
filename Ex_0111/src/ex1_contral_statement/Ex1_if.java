package ex1_contral_statement;

public class Ex1_if {
    public static void main(String[] args) {
		
		//제어문 : 프로그램의 흐름을 제어하는 문장
		//분기문과 반복문으로 나뉜다
		//분기문 : if, switch
		//반복문 : for, while
		
		//if : 하나의 조건식을 정의하고 해당 조건식이 참일 때만 동작하는 제어문
		//if( 조건식 ){
		//   조건식이 참일 때 실행되는 영역
		//}
		
		int n = 55;
		
		//String은 쌍따옴표 안에 여러글자(문자열)를 저장할 수 있도록 하는 자료형
		String str = "";
		
		if( n == 50 ) {
			str = "50입니다";		
		}
		
		if( n != 50 ) {
			str = "50이 아닙니다";
		}
		
		System.out.println(str);
		
	}//main

}

package ex1_contral_statement;

public class Ex5_switch {
	public static void main(String[] args) {
		
		//** 스위치문의 비교값으로 사용 가능한 타입
		//byte, short, int, char, String(정수, 문자, 문장열)의 세 종료만 비교값으로 사용 가능
		
		char str = '수';
		
		switch( str ) {//비교값
		
		case'수'://조건값
			System.out.println("90~100");
			break;
			
		case'우':
			System.out.println("80~89");
			break;
			
		case'미':
			System.out.println("70~79");
			break;
			
		case'양':
			System.out.println("60~69");
			break;
			
		case'가':
			System.out.println("59점 이하");
			break;
			
			default:
				//비교값과 조건값이 일치하는 것이 한 개도 없을 때 반드시 호출되는 영역
				System.out.println("올바른 성적이 아닙니다");
				break;
		}//switch
		
	}//main

}

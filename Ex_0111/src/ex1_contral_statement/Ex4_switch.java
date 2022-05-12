package ex1_contral_statement;

public class Ex4_switch {
	public static void main(String[] args) {
		
		//switch문 : 조건식이 아닌 비교값을 가지고 연산을 수행하는 제어문
		
		//switch( 비교값 ){
		//  case 조건값:
		//       비교값과 조건값이 일치하면 실행되는 영역
		//       break;
		//}
		
		int n = 2;
		
		switch( n ) {//비교값
		
		case 1://조건값(조건값은 반드시 비교값과 자료형 타입이 같아야 한다.)
			System.out.println("1.게임시작");
			break;//switch문을 통째로 빠져나오면서 종료
			
		case 2://조건값은 중복되지 않아아야 한다.
			System.out.println("2.게임소개");
			break;
			
		case 3:
			System.out.println("3.종료");
			break;
		
		}//switch
		
	}//main


}

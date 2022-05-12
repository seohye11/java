package ex2_value_type;

public class Ex1_valueType {
	 public static void main(String[] args) {
			
		   //기본 자료형 : 데이터를 저장하기 위한 일종의 그릇과 같은 개념(소문자로만 만들어져 있음)
		   /*
		   논리형 : boolean - 1bit
		   문자형 : char - 2byte 
		   정수형 : byte - 1byte ........ -128 ~ 127
		          short - 2byte ........ -32768 ~ 32767
		          int - 4byte .......... -2147483648 ~ 21747483637
		          long - 8byte ......... -900경 ~ 900경
		   실수형 : float - 4byte 
		          double - 8byte
		   */
		   
		   //변수 : 자료형을 통해 실제로 값을 저장하기 위한 영역
		   //변수선언 규칙
		   //1) _를 제외하고는 특수문자를 포함할 수 없다.
		   //2) 변수명은 반드시 소문자로 시작한다.
		   //3) 변수명은 절대로 한글로 작성하지 않는다.
		   
		   //자료형 변수명;(선언)
		   //변수명 = 값;(대입)
		   //자료형 변수명 = 값;(초기화)
		   
		   //논리형(boolean) : 참과 거짓(true, false)형태의 데이터만을 저장할 수 있는 자료형
		   boolean b; //선언
		   //b = 100; <-- 자료형의 타입과 저장되는 값의 타입이 다르면 오류
		   b = false; //대입
		   
		   //하나의 영역안에서는 같은 이름을 가진 변수를 여러개 선언할 수 없다.
		   //단, 선언이 완료된 변수는 언제든지 재활용이 가능
		   b = true;
		   
		   System.out.println("b에 담긴 값 : "+ b);
		   
		   System.out.println("-------------------------");
		   
		   //문자형 : 홑따옴표 안에 딱 한글자만 저장 가능한 자료형(문자 자료형)
		   char ch = 'A';
		   System.out.println("ch : " + ch);
		   
		   ch = 'B';
		   System.out.println(ch);
		   
		   //char타입의 자료형은 한글자의 문자만 저장 가능하지만
		   //대입된 정수값이 아스키코드를 통해 한글자로 변환 가능한 값이라면 정상출력
		   ch = 97 + 1;
		   System.out.println(ch);
		   
		   System.out.println("-------------------------");
		   
		   //정수형
		   byte b1 = 127;
		   int n = 2100000000;
		   long lo = 2200000000L;
		   System.out.println("long :" + lo);
		   
		   //실수형 : 소수점을 가지고 있는 데이터를 저장하기 위한 자료형
		   float f = 3.14F;
		   double d = 3.14;
		   
		   f = 10;
		   d = 20;
		   
		   System.out.println(f);
		   System.out.println(d);
		   System.out.println(f + d);
		   
	  }//main

}

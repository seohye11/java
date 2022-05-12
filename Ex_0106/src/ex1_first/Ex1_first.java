package ex1_first;

public class Ex1_first {
	public static void main( String[] args) {
		
		  //주석 : 프로그램(JVM)은 인지하지 못하는 개발자간의 의사소통을 위해
		  //작성하는 메모
		  
		  //main메서드 : 프로그램이 실행되면 가장 먼저 호출되는 영역
		  
		  //자바의 출력 형식
		  System.out.println( 100 );
		  System.out.println( 200 );
		  System.out.println( 10+20 );
		  System.out.println( "안녕하세요" );
		  
		  //""(문장, 문자열) 뒤에 있는 +는 기호는 10을 더한다가 아닌
		  //10을 이어붙인다의 의미로써 사용이 된다
		  System.out.println("hi"+10 );

		  System.out.println(100 + "안녕" + 100);
		  
		  System.out.println(10 + 10 + "hi");
		  
		  System.out.println(1 + 1 +"hi" + 2 + 2);
		  
		  System.out.println("1 + 1 = "+ (1 + 1));
		}

}

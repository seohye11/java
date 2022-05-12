package ex1_string;

public class Ex1_String {
	public static void main(String[] args) {
		
		//자바의 클래스 중 가장 대표적인 String 클래스
		//String 클래스는 두가지 특징을 가지고 있다.
		//1) 객체 생성법이 두가지(암시적, 명시적)
		//2) 한 번 생성된 문자열의 내용은 변하지 않는다(불변의 특징)
		
		String s1 = "abc";//암시적 객체생성
		String s2 = "abc";
		
		String s3 = new String("abc");//명시적 객체생성
		
		//==연산자는 기본 자료형을 비교할 때는 값을 비교
		//그러나 객체를 비교할 때는 주소값을 비교		
		if(s1 == s3) {
			System.out.println(" 주소가 같습니다 ");	
		}
		
		//String 클래스 간의 값을 비교하고 싶다면 ==이 아닌 equals()기능을 사용해야 한다.
		if(s1.equals(s3)) {
			System.out.println("값이 같습니다");
		}
		
		String greet = "안녕";
		greet += "하세요";
		
		System.out.println(greet);	
		
	}//main

}







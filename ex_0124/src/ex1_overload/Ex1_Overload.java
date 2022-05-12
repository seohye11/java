package ex1_overload;

public class Ex1_Overload {
	
	//메서드의 오버로딩 : 메서드의 중복 정의
	//하나의 클래스 내에서 같은 이름을 가진 메서드가 여러개 정의 되는 것
	
	//오버로딩을 가능하게 하는 규칙
	//1) 메서드의 이름은 같지만 파라미터의 갯 수가 다른 경우
	//2) 파라미터의 갯 수가 같다면 타입이 다른 경우
	//3) 파라미터의 갯 수가 같으며, 타입까지 같을 경우 피라미터의 순서가 다르다면 오버로딩 가능	
	
	public void result() {
		System.out.println("인자가 없는 메서드");
	}
	
	public void result(int n) {
		System.out.println("정수를 인자로 받는 메서드");
	}
	
	public void result(char c) {
		System.out.println("문자를 인자로 받는 메서드");		
	}
	
	public void result(int n, String s) {
		System.out.println("정수, 문자열을 인자로 받는 메서드");
	}
	
	public void result(String s, int n) {
		System.out.println("문자열, 정수를 인자로 받는 메서드");
	}

}

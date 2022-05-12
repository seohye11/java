package ex1_static;

public class Bank {
	
	//static : 같은 클래스의 객체가 아무리 많이 생성되어도 메모리상에 딱 한 개만 만들어지는 변수나 메서드
	
	private String brand = "길동은행";
	String point = "";
	static float interest = 10;//이자율
	
	public void getBank() {
		System.out.println("브랜드 : "+ brand);
		System.out.println("지점 : "+ point);
		System.out.println("이자율 : "+ interest + "%");
		System.out.println("---------------------------");
	}

}

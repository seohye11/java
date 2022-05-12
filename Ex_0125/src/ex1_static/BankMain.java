package ex1_static;

public class BankMain {
	public static void main(String[] args) {
		
		Bank b1 = new Bank();
		b1.point = "신촌";
		
		//static형식의 변수나 메서드는 클래스명, 스테틱 <-- 구조로 클래스를 통해 바로 접근하는 것이 가능
		Bank.interest = 0.1f;//=  b1.interest = 0.1f;
		
		Bank b2 = new Bank();
		b2.point = "홍대";
		
		Bank b3 = new Bank();
		b3.point = "이대";
		
		b1.getBank();
		b2.getBank();
		b3.getBank();
	
	}//main

}

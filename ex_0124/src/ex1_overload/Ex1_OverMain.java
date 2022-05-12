package ex1_overload;

public class Ex1_OverMain {
	public static void main(String[] args) {
		
		Ex1_Overload over = new Ex1_Overload();
		over.result();
		over.result(10);
		over.result('A');
		over.result(100, "hi");
		over.result("hello", 30);
		
		
	}//main

}

package ex2_method;

public class Ex1_main {
	public static void main(String[] args) {
		
		//저의 이름은 홍길동 이고 나이는 20이고 혈액형은 A형 입니다
		
		String s1 = "홍";
		String s2 = "길동";
 		int age = 20;
		char bt = 'A';
		
		Ex1_method me = new Ex1_method();
		String res = me.yourName(s1, s2, age, bt);
		System.out.println(res);
		
		System.out.println("-------------------");
		
		//5*1 = 5
		//...
		//5*9 = 45
		
		int dan = 5;
		me.showTable(dan);
		
	}//main

}

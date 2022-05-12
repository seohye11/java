package ex1_contral_statement;

public class Ex6_switch_work {
	public static void main(String[] args) {
		
		//n1과 n2에 담긴 값을 연산하여 결과를 출력(switch문으로 작성할 것)
		//-------------------
		//
		
		int n1 = 10;
		int n2 = 20;
		String op = "+";//+ - * / % 중 선택
		
		switch(op) {
		case "+":
			System.out.println(n1+n2);
			break;
			
		case "-":
			System.out.println(n1-n2);
			break;
			
		case "*":
			System.out.println(n1*n2);
			break;
			
		case "/":
			System.out.println(n1/n2);
			break;
	
		case"%":
			System.out.println(n1%n2);
			break;
		}
	
	}// main

}

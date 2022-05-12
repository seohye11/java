package ex1_operator;

public class Ex3_opeator {
     public static void main(String[] args) {
		
		//삼항(조건)연산자(? :)
		//하나 이상의 조건을 정의하여 그 조건이 참일 때, 거짓일 때에 따라
		//다른 결과를 얻을 수 있도록 해 주는 연산자
		int a = 10;
		int b = 15;
		
		boolean res = ++a >= b ? true : false;
		System.out.println(res);
		
		int n1 = 10;
		int n2 = 20;
		int rs = (n1 += n1) == n2 ? 10 : 20;
		System.out.println(rs);
		
		  System.out.println("----------------------------");
		
		a = 10;
		b = 12;
	//++a >= b || 2 +(a-3) <= b && 13-b >= 0 && (a += b)-(a % b) > 10 ? 'O':'X';
	//11>=12   || 10       <= 12 && 1   >=0  && 23      -(23%12) 22>10 참 = O
		char res2 = ++a >= b || 2 + (a-3) <= b && 13 - b >= 0 && (a += b)-(a % b) > 10? 'O':'X';
		System.out.println(res2);
		
	}//main
	

}

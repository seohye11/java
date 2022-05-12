package ex4_continue;

public class Ex2_continue {
	public static void main(String[] args) {
		
		//3의 배수를 제외한 n 값을 화면에 출력
		
		int n = 0;
		while(n < 10) {
			n++;
			
			if( n % 3 == 0) {
				//while문 안에서 continue를 만나면 해당 while문의 조건식으로 이동
				continue;
			}
			
			System.out.println(n);
		}
		
	}//main

}

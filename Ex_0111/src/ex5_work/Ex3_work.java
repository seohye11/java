package ex5_work;

public class Ex3_work {
	public static void main(String[] args) {
		
		//n1 ~ n2까지의 합을 출력하시오
		//단, n1의 값이 n2보다 더 큰 경우에도 결과를 정상적으로 출력
		
		int n1 = 8;
		int n2 = 5;
		int result = 0;
		
		//두 변수의 값을 서로 바꾸기 위한 방법
		if(n1 > n2) {
			int n3 = n1;
			n1 = n2;
			n2 = n3;
		}
		
		for(int i = n1; i <= n2; i++) {
			
			result += i;			
		}
		
		System.out.println(result);
				
	}//main


}

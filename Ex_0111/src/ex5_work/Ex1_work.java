package ex5_work;

public class Ex1_work {
	public static void main(String[] args) {
		
		//1부터 n까지의 합을 계산하여 결과를 출력
		int n = 3;
		
		int result = 0;
		
		for(int i = 1; i <= n; i++) {
			result += i;
		}
		
		System.out.println(result);
			
	}//main

}

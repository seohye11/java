package ex2_random;

import java.util.Random;

public class Ex1_random {
	public static void main(String[] args) {
		
		
		//난수 발생을 위한 클래스
		Random rnd = new Random();
		
		//133 ~ 3127 사이의 난수	
		//rnd.nextInt( 발생시킬 난수의 범위 ) + 시작수;
		//rnd.nextInt( 끝 수 - 시작 수 + 1 ) + 시작수;
		int num = rnd.nextInt( 3127 - 1133 + 1 ) + 133;
		System.out.println(num);
		
		
		
		
		
		
	}//main

}

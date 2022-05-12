package ex2_random;

import java.util.Random;

public class Ex2_random {
	public static void main(String[] args) {
		
		//2 ~ 9사이의 난수를 발생시킨 후 발생한 난수에 해당하는 구구단을 출력
		
		Random rnd = new Random();
		int dan = rnd.nextInt(8) + 2;
		System.out.println(dan+"단");
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan +" * "+ i +" = "+ (i*dan));
		}
		
	
		
	}//main

}

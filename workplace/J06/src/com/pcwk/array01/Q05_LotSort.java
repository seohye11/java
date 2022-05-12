package com.pcwk.array01;

import java.util.Arrays;

public class Q05_LotSort {

	public static void main(String[] args) {
		
		// 로또번호추출 (1 ~ 45 숫자 중 중복되지 않게 숫자 6개 추출)
		
		// 1) 숫자 1 ~ 45를 할당		
		int [] ball = new int [45];
		
		for(int i = 0; i < ball.length; i++) {
			ball[i] = i + 1;
		}
		System.out.println(Arrays.toString(ball));
		
		// 2) shuffle 6개 추출
		for(int i = 0; i < 6; i++) {
			//         0.0 <= x < 1.0
			// *45     0.0 <= x < 45.0
			// (int)   0 <= x < 45
			int n = (int)(Math.random()*45);
			System.out.println("n = "+ n);
			
			int tmp = ball[i];//ball[i], ball[n] 자리교환
			ball[i] = ball[n];
			ball[n] = tmp;
		}
		// 3) 중복되지 않는 6개 숫자
		System.out.println(Arrays.toString(ball));
		
		for(int i = 0; i < 6; i++) {
			System.out.print(ball[i]+", ");
		}
		
		System.out.println("-------------------------------------");
		
		// 1)ball 배열 0번지부터 6개 copy
		int [] sortBall = new int[6];
		System.arraycopy(ball,0,sortBall,0,sortBall.length);
		System.out.println("before sortBall : "+ Arrays.toString(sortBall));
		
		// 2)sort
		for(int i = 0; i < sortBall.length-1; i++) {
			for(int j = 0; j <sortBall.length-1-i; j++) {
				if(sortBall[j] > sortBall[j+1]) {
					int tmp = sortBall[j];
					sortBall[j] = sortBall[j+1];
					sortBall[j+1] = tmp;
				}
			}
		}
		System.out.println("sort Lotto = "+ Arrays.toString(sortBall));
	}

}





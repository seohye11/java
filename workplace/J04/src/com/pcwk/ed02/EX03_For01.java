package com.pcwk.ed02;

public class EX03_For01 {

	public static void main(String[] args) {
		
		// for문 : 특정한 횟수동안 작업을 반복하고 싶을 때 사용, 반복횟수를 알고 있을 때 사용
		
		// 1부터 10까지 누적
		
		int i;
		int sum;
		
		//초기화
		for(i = 1, sum = 0; i <= 10; i++) {
			sum = sum+i;
		}
		System.out.println("1-10까지 = "+ sum);

	}

}

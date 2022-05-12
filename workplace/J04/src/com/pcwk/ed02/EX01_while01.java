package com.pcwk.ed02;

public class EX01_while01 {

	public static void main(String[] args) {
		
		// 1부터 100까지 합
		
		int num;//숫자
		int sum;//합계
		
		num = 1;
		sum = 0;
		
		while(num <= 100){
			sum += num;
			System.out.println(num);
			++num;
		}
		System.out.println("sum = "+ sum);
		

	}

}

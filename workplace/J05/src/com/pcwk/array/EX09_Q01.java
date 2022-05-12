package com.pcwk.array;

public class EX09_Q01 {

	public static void main(String[] args) {
		
		//총 합과 평균
		int[] score = {100,88,100,100,90};
		int sum = 0;	
		
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		System.out.println("합계 = " + sum);
		System.out.println("평균 = "+(float)sum/score.length);
		
		System.out.println("------------------------------");
		
		int s = 0;
		float avg = 0.0f;
		
		for(int num :score) {
			s += num;
		}
		System.out.println("합계 = "+ s);
		avg = s/(float)score.length;
		
		System.out.println("평균 = "+ avg);

	}

}

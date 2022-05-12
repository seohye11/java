package com.pcwk.array01;

public class Q01_MaxMin {

	public static void main(String[] args) {
		
		// 최대값과 최소값 구하기
		
		int[] score = {79,88,91,33,100,55,95};
		
		int max = score[0];
		int min = score[0];
		
		for(int i = 1; i < score.length; i++) {
			if(max < score[i]) {
				max = score[i];
			}
			if(min > score[i]) {
				min = score[i];
			}
		}
		System.out.println("최대값 = "+ max);
		System.out.println("최소값 = "+ min);
		
	}
}

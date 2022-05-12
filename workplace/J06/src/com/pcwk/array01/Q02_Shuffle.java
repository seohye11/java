package com.pcwk.array01;

import java.util.Arrays;

public class Q02_Shuffle {

	public static void main(String[] args) {
		
		// shuffle
		// 배열의 요소의 순서를 반복해서 바꾼다
		// numArr 값을 0~9까지 할당
		
		int numArr[] = new int[10];
		
		for(int i = 0; i < numArr.length; i++) {
			numArr[i] = i;
		}
		System.out.println(Arrays.toString(numArr));
		
		for(int i = 0; i <= 88; i++) {
			int n = (int)(Math.random()*10);
			System.out.println("n = "+ n);
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp; //numArr[0],  numArr[n] 값이 교환
		}
		System.out.println(Arrays.toString(numArr));
	
		

		
	}

}

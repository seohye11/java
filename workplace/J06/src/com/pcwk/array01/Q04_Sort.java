package com.pcwk.array01;

import java.util.Arrays;

public class Q04_Sort {

	public static void main(String[] args) {
		
		// Sort : 서로 인접한 두 원소를 검사하여 정렬
		//        인접한 2개의 레코드를 비교하여 크기가 순서대로 되어 있지 않으면 서로 교환
		
		int[] numArr = {7,4,5,1,3};
		
		//sort 전 데이터
		for(int n :numArr) {
			System.out.print(n+ ",");
		}
		System.out.println();
		
		for(int i = 0; i < numArr.length-1; i++) {
			for(int j = 0; j < numArr.length-1-i; j++) {
				if(numArr[j] > numArr[j+1]) {//앞에 값이 크면 : ASC
			  //if(numArr[j] < numArr[j+1]) {//뒤에 값이 크면 : DESC 
					int tmp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = tmp;
				}
			}
			System.out.println((i + 1)+ "," + Arrays.toString(numArr));
		}

	}

}

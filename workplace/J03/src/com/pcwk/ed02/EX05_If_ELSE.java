package com.pcwk.ed02;

public class EX05_If_ELSE {

	public static void main(String[] args) {
		
		// 조건문과 조건 연산자 : 간단한 if-else문은 삼항연산자로 구현 가능
		
		int a = 77;
		int b = 88;
		
		int max = 0;//최대값
		if(a > b) {
			max = a;
		}else {
			max = b;
		}
		 System.out.println("max = "+ max);
		 
		 max = (a > b)?a:b;
		 System.out.println("max = "+ max);

	}

}

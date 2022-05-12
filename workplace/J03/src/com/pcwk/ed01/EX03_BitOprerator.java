package com.pcwk.ed01;

public class EX03_BitOprerator {

	public static void main(String[] args) {
		
		//비트연산자 : 개발자가 직접 비트를 조작할 수 있는 연산자
	    //          연산하는 수를 이진수로 표현했을 때 규칙에 따라 알맞은 결과를 반환
		
		//   0 0 0 0 0 1 0 1
		// & 0 0 0 0 1 0 1 0 
		//===================
		//   0 0 0 0 0 0 0 0
		
		int num1 = 5;
		int num2 = 10;
		
		int result = num1 & num2;//같으면 1
		System.out.println("num1 & num2 = "+ result);
		
		//   0 0 0 0 0 1 0 1
		// & 0 0 0 0 1 0 1 0 
		//===================
		//   0 0 0 0 1 1 1 1
		
		result = num1 | num2;
		System.out.println("num1 | num2 = "+ result);
		
	     //   0 0 0 0 0 1 0 1
		 // & 0 0 0 0 1 0 1 0 
		 //===================
		 //   0 0 0 0 1 1 1 1
		
		result = num1 ^ num2;
		System.out.println("num1 ^ num2 = "+ result);
		
	}

}

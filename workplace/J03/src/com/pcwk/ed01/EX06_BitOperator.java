package com.pcwk.ed01;

public class EX06_BitOperator {

	public static void main(String[] args) {
		
		//(좌 shift) : 비트를 왼쪽으로 이동 ->2의 n승 곱하기
		
		int num1 = 5;
		int result = num1 << 2;
		System.out.println("num1 << 2 = "+ result);
		
		//(우 shift) : 비트를 오른쪽으로 이동 -> 2의 n승 나누기
		
		int num2 = 10;
		result = num2 >> 2;
		System.out.println("num2 >> 2 = "+ result);
		System.out.println(10/4);
		
		//부호화 우 shift; 우 shift와 동일, 밀려 나간 남은 공간을 부호 비트가 아닌 0으로 채움
		num2 = 10;
		result = num2 >>> 2;
		System.out.println("num2 >>> 2 = "+result);

	}

}

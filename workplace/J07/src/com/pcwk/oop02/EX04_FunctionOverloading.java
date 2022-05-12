package com.pcwk.oop02;

public class EX04_FunctionOverloading {

	public static void main(String[] args) {
		
		System.out.println(sum(1, 3));
		
		System.out.println(sum(1.5, 2.3));

	}
	/**
	 * double sum
	 * @param num1
	 * @param num2
	 * @return num1 + num2
	 */
	static double sum(double num1, double num2) {
		System.out.println("인자가 두 개인 경우 호출");
		System.out.println("double type 파람");
		return num1 + num2;
	}
	/**
	 * 인자 3개 sum
	 * @param a
	 * @param b
	 * @param c
	 * @return a + b + c
	 */
	static int sum(int a, int b, int c) {
		System.out.println("인자가 세 개인 경우 호출");
		return a + b + c;
	}
	
	/**
	 * 인자 2개 sum
	 * @param a
	 * @param b
	 * @return a + b
	 */
	static int sum(int a, int b) {
		int result = 0 ;
		System.out.println("인자가 두 개인 경우 호출");
		result = a + b;
		
		return result;
	}

}

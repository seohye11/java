package com.pcwk.loop;

import java.util.Scanner;

public class Q05_02 {

	public static void main(String[] args) {
		
		// 두 수를 입력받아 사칙 연산을 수행하는 프로그램 작성
		
		System.out.print("num1을 입력>>");
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		
		System.out.print("num2를 입력>>");
		int num2 = scanner.nextInt();
		
		System.out.print("연산자를 입력>>");
		String operator = scanner.next();
		double result = 0;
		
		switch(operator) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / num2;
			break;
		default:
			System.out.println("연산자를 확인하세요");
			return;
		}
		System.out.println(num1 + (""+ operator)+ num2 + "=" + result);

	}

}

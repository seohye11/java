package com.pcwk.loop;

import java.util.Scanner;

public class Q05_01 {

	public static void main(String[] args) {
		
		// 두 수를 입력받아 사칙 연산을 수행하는 프로그램 작성
		
		System.out.println("num1을 입력하세요>>");		
		Scanner scanner = new Scanner(System.in);		
		int num1 = scanner.nextInt();
		
		System.out.println("num2를 입력하세요>>");		
		int num2 = scanner.nextInt();
		
		String operator = "";	
		double result = 0;
		
		System.out.println("연산기호를 입력하세요>>");
		operator = scanner.next();
		
		if(operator.equals("+")) {
			result = num1 + num2;
		}else if(operator.equals("-")){
			result = num1 - num2;
		}else if(operator.equals("*")){
			result = num1 * num2;
		}else if(operator.equals("/")){
			result = num1 / num2;
		}else {
			System.out.println("연산자를 확인하세요");
			return;
		}
		
		System.out.println(num1+(""+operator)+num2+"="+result);		

	}

}

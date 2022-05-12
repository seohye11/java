package com.pcwk.oop04.inter;

import java.util.Arrays;

public class CalculatorMain {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 0;
		
		//약한 결합
		Calc cal = new Calculator();
		
		System.out.println("add : "+ cal.add(num1, num2));
		System.out.println("substract : "+ cal.substract(num1, num2));
		System.out.println("times : "+ cal.times(num1, num2));
		System.out.println("divide : "+ cal.divide(num1, num2));
		
		System.out.println("-----------------------------------");
		
		//default 메서드 콜
		cal.description();
		
		//static 메서드 콜
		int[] arr = {1,2,3,4,5};
		System.out.println(Arrays.toString(arr));
		System.out.println(Calc.total(arr));
		
	}

}

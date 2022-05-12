package com.pcwk.array;

public class EX07_Array07 {

	public static void main(String[] args) {
		
		// 향상된 for : 배열 요소의 처음부터 끝까지 모든 요소를 참조할 때 편리한 반복문
		
		int[] score = {100,88,98,90};
		
		for(int num :score) {
			System.out.println(num);
		}
		
		System.out.println("------------------------");
		
		String[] a = {"Hello", "world", "PCWK"};
		//for(배열의 타입변수 변수이름 : 배열이름)
		for(String str :a) {
			System.out.println(str);
		}

	}

}

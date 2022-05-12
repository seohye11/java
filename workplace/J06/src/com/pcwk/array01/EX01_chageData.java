package com.pcwk.array01;

public class EX01_chageData {

	public static void main(String[] args) {
		
		// 섞기(shuffle) : 배열의 요소의 순서를 반복해서 바꿈 ex)카드게임, 로또
		
		// x, y 값 교환(자리 바꾸기)
		
		int x = 10;
		int y = 20;
		int tmp;
		
		System.out.println("x = "+ x);
		System.out.println("y = "+ y);
		
		tmp = x;
		x = y;
		y = tmp;
		
		System.out.println("x = "+ x);
		System.out.println("y = "+ y);

	}

}

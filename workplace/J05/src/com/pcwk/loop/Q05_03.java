package com.pcwk.loop;

public class Q05_03 {

	public static void main(String[] args) {
		
		// 구구단의 짝수단만 출력
		
		for(int i = 2; i <= 9; i++) {
			if(i % 2 != 0) {
				continue;
			}
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + (i*j));
			}
			System.out.println();
		}

	}

}

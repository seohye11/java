package com.pcwk.ed02;

public class EX07_Break {

	public static void main(String[] args) {
		
		// break문 : 반복문에서 break문을 만나면 더 이상 반복을 수행하지 않고 
		//          하나의 반복문을 빠져 나옴
		
		//0부터 1씩 늘리면서 합할 때 숫자를 몇까지 더하면 100이 넘는지
		
		int sum = 0;//합계
		int i = 0;//증가
		
		for(i = 0; true; i++) {
			sum += i;
			if(sum >= 100) {
				break;
			}
		}
		System.out.println("sum = "+ sum);
		System.out.println("i = "+ i);

	}

}

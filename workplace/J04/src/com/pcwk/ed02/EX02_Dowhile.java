package com.pcwk.ed02;

public class EX02_Dowhile {

	public static void main(String[] args) {
		
		// do-while문 : 먼저 수행문을 1회 수행하고 조건식 체크
		//             반복문이 반드시 1회 이상 수행되어야 하는 경우 사용 
		
		int num = 1;
		int sum = 0;
		
		do {
			sum += num;
			System.out.println("num = "+ num);
			num++;
		}while (num <= 10);//무조건 1회는 수행
	  //}while (num > 10);//무조건 1회는 수행
		
		System.out.println("1-10까지 합 = "+ sum);

	}

}

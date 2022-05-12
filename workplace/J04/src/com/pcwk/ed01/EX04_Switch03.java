package com.pcwk.ed01;

import java.util.Scanner;

public class EX04_Switch03 {

	public static void main(String[] args) {
		
		//console입력
		Scanner scanner = new Scanner(System.in);
		System.out.println("월 입력>");
		int year = 2042;//년도		
		int month = 1;//월
		month = scanner.nextInt();
		
		// 월을 입력 받아서 해당월의 일수 출력 + 윤달계산
			
		int day = 0;//일수
		
		switch(month) {
		case 4: case 6:
		case 9: case 11:
			day = 30;
			break;
		case 2:
			//4로 나누어 떨어지면 윤년
			//100으로 나누어 떨어지지 않으면 윤년
			//year % 4 == 0 && year % 100 != 0
			//||
			//400으로 나누어 떨어지면 윤년
			//year % 400 == 0			
			if((year % 4 == 0 && year % 100 != 0)||(year % 400 == 0)) {//윤달
				day = 29;		
			}else {//평달
				day = 28;
			}
			break;
		default:
			day = 31;
			break;	
		}
		System.out.println("월 : "+ month);
		System.out.println("일수 : "+ day);
		
		//4로 나누어 떨어지면 윤년
		//100으로 나누어 떨어지지 않으면 윤년
		//year % 4 == 0 && year % 100 != 0
		
		//400으로 나누어 떨어지면 윤년
		//year % 400 == 0

	}

}
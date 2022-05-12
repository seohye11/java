package com.pcwk.ed01;

import java.util.Scanner;

public class EX06_Switch05 {

	public static void main(String[] args) {
		
		// 점수를 입력 받아서 학점 구하기
		//100-90 A /89-80 B /79-70 C /69-60 D /60 F
				
		System.out.println("점수 입력(1~100)>>");
		Scanner scanner = new Scanner(System.in);
		
		int score = scanner.nextInt();
		char grade = ' ';
		
		switch(score/10) {
		case 10: case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;
			
		}
		System.out.println("점수 : "+ score);
		System.out.println("학점 : "+ grade);

	}

}

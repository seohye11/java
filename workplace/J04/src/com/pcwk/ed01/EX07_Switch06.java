package com.pcwk.ed01;

import java.util.Scanner;

public class EX07_Switch06 {

	public static void main(String[] args) {
		
		// 점수를 입력 받아서 학점 구하기
		//100-90 A /89-80 B /79-70 C /69-60 D /60 F
		
		//95점이상이면 +
				
		System.out.println("점수 입력(1~100)>>");
		Scanner scanner = new Scanner(System.in);
		
		int score = scanner.nextInt();
		char grade = ' ';
		char plus = ' ';
		
		switch(score/10) {
		case 10: 
	    case 9:
	    	if(score >= 95) {
	    		plus = '+';
	    	}
			grade = 'A';
			break;
		case 8:
	    	if(score >= 85) {
	    		plus = '+';
	    	}
			grade = 'B';
			break;
		case 7:
	    	if(score >= 75) {
	    		plus = '+';
	    	}
			grade = 'C';
			break;
		case 6:
	    	if(score >= 65) {
	    		plus = '+';
	    	}
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;
			
		}
		System.out.println("점수 : "+ score);
		System.out.println("학점 : "+ grade + plus);

	}

}

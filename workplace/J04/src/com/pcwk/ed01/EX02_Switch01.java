package com.pcwk.ed01;

public class EX02_Switch01 {

	public static void main(String[] args) {
		
		// switch-case : 하나의 조건식으로 많은 경우의 수를 처리하는 조건문
		//               조건식의 결과가 정수 또는 문자열의 값이고 그 값에 따라 수행문이 결정
		
		int rank = 2;
		char medalColor = ' ';
		/*
		if(1 == rank) {
			medalColor = 'G';
		}else if (2 == rank) {
			medalColor = 'S';
		}else if(3 == rank) {
			medalColor = 'B';
		}else {
			medalColor = ' ';
		}
		*/
	
		switch(rank) {
		case 1:
			medalColor = 'G';
			break;
		case 2:
			medalColor = 'S';
			break;
		case 3:
			medalColor = 'B';
			break;
		default:
			medalColor = ' ';
			break;
		}
		System.out.println("Ranking : "+ rank);
		System.out.println("medalColor : "+ medalColor);

	}

}

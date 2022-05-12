package com.pcwk.ed02;

public class EX03_If_elseif_else {

	public static void main(String[] args) {

		// if~else if~else if else : 조건이 여러가지일 경우 조건에 따라 각각 다른 작업을
		// 수행하고 싶을 때 사용
		// if(조건식){
		// 수행문1
		// }else if(조건식2){
		// 수행문2
		// }else if(조건식3){
		// 수행문3
		// }else{
		// 수행문4
		// }

		// 공원입장료계산
		/*
		 * 취학전 아동 : 1000원 8살미만 / 초등학생 : 2000원 14살미만 중/고등학생 : 2500원 20살미만 / 성인 : 3000원
		 */

		int age = 5;
		int charge = 0;

		if (age < 8) {
			charge = 1000;
		} else if (age < 14) {
			charge = 2000;
		} else if (age < 19) {
			charge = 2500;
		} else {
			charge = 3000;
		}
		System.out.println("나이는 : " + age);
		System.out.println("요금은 : " + charge);

		// 성적에 따라 학점 부여하기
		// 100 ~ 90점 : A
		// 89 ~ 80점 : B
		// 79 ~ 70점 : C
		// 69 ~ 60점 : D
		// 60점 미만 : F

		int score = 30;
		char grade = ' ';

		if (90 <= score) {
			grade = 'A';
		} else if (80 <= score) {
			grade = 'B';
		} else if (70 <= score) {
			grade = 'C';
		} else if (60 <= score) {
			grade = 'D';
		} else {
			grade = 'F';
		}

		System.out.println("점수는 : " + score);
		System.out.println("학점은 : " + grade);
	}

}

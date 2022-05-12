package ex1_scanner;

import java.util.Scanner;

public class Ex1_scanner {
	public static void main(String[] args) {
		
		//키보드에서 값을 직접 입력받아 변수에 저장해보자
		Scanner sc = new Scanner(System.in);//키보드에서 넘어온 값을 받는 클래스 생성
		System.out.println("정수 : ");
		
		int num = sc.nextInt();//정수를 입력받기 위한 메서드
		System.out.println("입력받은정수 : "+ num);
		
		System.out.println("문자열 : ");
		String str = sc.next();//문자열을 입력받기 위한 메서드
		System.out.println("입력받은 문장 : "+ str);
		
		System.out.println("실수 : ");
		float f = sc.nextFloat();
		
		
		
	}//main

}

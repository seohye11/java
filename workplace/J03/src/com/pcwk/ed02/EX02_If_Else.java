package com.pcwk.ed02;

public class EX02_If_Else {

	public static void main(String[] args) {
		
		// if~else문 : if문의 조건식이 false일 경우 실행되는 문장이 추가된 구문
		//       if(조건식){
		//            수행문
		//       }else{
		//            수행문
		
		int age = 7;
		
		//둘 중 1개는 반드시 수행된다.
		if(age >= 8) {
			System.out.println("교육센터에 온다.");
		}else {
			System.out.println("집에 있는다.");
		}

	}

}

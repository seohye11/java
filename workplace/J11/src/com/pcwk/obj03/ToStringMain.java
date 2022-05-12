package com.pcwk.obj03;

public class ToStringMain {

	public static void main(String[] args) {
		
		//toString()이 문자열이 반환되도록 오버라이딩 되어 있다
		String str = new String("KOREA IT");
		
		System.out.println(str);
		System.out.println(str.toString());

		
		//toString()이 날짜 문자열이 반환되도록 오버라이딩 되어 있다
		//import 없이 클래스 사용
		java.util.Date today = new java.util.Date();
		
		System.out.println(today);
		System.out.println(today.toString());
		

	}

}

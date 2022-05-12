package com.pcwk.obj11.string;

public class StringEx01Main {
	
	public static void main(String[] args) {
		
		String str01 = new String("청춘");
		String str02 = new String("청춘");
		
		System.out.println(str01.equals(str02));//데이터 비교할 때는 equals
		
		System.out.println(str01 == str02);//주소 비교
		
		String str03 = "청춘";
		String str04 = "청춘";
		
		System.out.println(str03 == str04);
		System.out.println(str03.equals(str04));
		//String에 동등 비교는 항상 equals사용하기
		
		
		
	}

	
	
	
	
	
	

}

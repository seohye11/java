package com.pcwk.oop02;

public class StaticTestCalss {
	
	    /* 클래스 멤버(static)와 인스턴스 멤버간의 참조 및 호출       
		 *   1) 클래스를 설계할 때, 멤버변수 중 모든 인스턴스를 공통으로 사용하는 것에 static을 붙임
		 *   2) 클래스 변수(static 변수)는 인스턴스를 생성하지 않아도 사용할 수 있음
		 *      클래스 변수는 클래스가 메모리에 올라갈 때 자동으로 생성
		 *   3) 클래스 메서드(static 변수)는 인스턴스 변수를 사용할 수 없음
		 *   4) 메서드 내에서 인스턴스 변수를 사용하지 않는다면, static을 붙이는 것을 고려함
		 */
	
	int iv;//인스턴스 변수
	static int cv;//클래스 변수
	
	void instanceMethod() {
		System.out.println(iv);//인스턴스 변수 사용 가능
		System.out.println(cv);//클래스 변수를 사용 가능
	}
	
	static void staticMethod() {
		//Cannot make a static reference to the non-static field iv
		//System.out.println(iv);//인스턴스 변수 사용 불가
		System.out.println(cv);//클래스 변수 사용 가능
		
	}

}

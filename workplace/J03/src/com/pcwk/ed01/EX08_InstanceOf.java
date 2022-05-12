package com.pcwk.ed01;

public class EX08_InstanceOf {

	public static void main(String[] args) {
		
		// instanceof연산자 : 객체의 타입을 확인하는 연산자 
		
		A a = new A();
		B b = new B();
		
		//왼쪽에는 참조 변수 오른쪽에는 클래스명을 두고 연산
		System.out.println("a instanceof A => "+ (a instanceof A));
		System.out.println("b instanceof A => "+ (b instanceof A));//B가 A를 상속
		
		System.out.println("a instanceof B => "+ (a instanceof B));

	}

}

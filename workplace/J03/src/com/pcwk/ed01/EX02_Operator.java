package com.pcwk.ed01;

public class EX02_Operator {

	public static void main(String[] args) {
		//논리연산자(&&, ||) : 여러가지 조건을 동시에 검사할 때 사용, 두 항의 값이 boolean 값일 경우에 사용
		//          연산의 결과가 true / false
		
		int age01 = 11;
		int age02 = 13;
		
		//               true    &&   true  ->  true
		//               false   &&   true  ->  flase
		boolean flag = (age01>0) && (age02>0);
		System.out.println("(age01>0) && (age02>0): "+flag);
		
		//       true    ||  false
		flag = (age01>0) || (age02<0);
		System.out.println("(age01>0) || (age02<0): "+flag);

	}

}

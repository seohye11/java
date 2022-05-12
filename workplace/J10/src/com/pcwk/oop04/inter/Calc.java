package com.pcwk.oop04.inter;

public interface Calc {
	
	//인터페이스
	//모든 메서드가 추상 메서드(abstract), 모든 변수는 상수(public final)
	//변수에 public final 생략가능
	//메서드에 public abstract 생략가능
	
	//public final double PI = 3.14; (public final 생략가능)
	double PI = 3.14;
	
	int ERROR = -999999;
	
	//public abstract int add(int num1, int num2); (public abstract 생략가능)
	/**
	 * 더하기
	 * @param num1
	 * @param num2
	 * @return num1 + num2
	 */
	int add(int num1, int num2);	
	int substract(int num1, int num2);
	int divide(int num1, int num2);
	int times(int num1, int num2);
	
	//추가적인 메서드를 넣으면 implements받은 클래스에서 @Override필요
	//int nothing();
	
	//jdk1.8이 후 추가 : default 메서드
	default void description() {
		System.out.println("정수 계산기를 구현합니다");
	}
	
	//static 메서드
	static int total(int[]arr) {
		int total = 0;
		
		//향상된 for
		for(int i : arr) {
			total += i;
		}
		return total;
	}
	
	
	//Abstract methods do not specify a body
//	public void disp() {
//		
//	}
//	
	
	
	

}

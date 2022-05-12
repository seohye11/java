package com.pcwk.oop08.poly;

public class PolyCastingMain {

	public static void main(String[] args) {
		
		FireEngine f = new FireEngine();
		Ambulance a = new Ambulance();
		
		//형제간의 관계 f = a; error 형변환 불가 
		
		Car car = null;
		FireEngine fe01 = new FireEngine();
		
	    //)자손타입 -> 조상타입(Up-casting) : 형변환 생략 가능
		car = fe01;
		car.drive();
		//car.water(); error
		
		FireEngine fe02 = new FireEngine();
		
		//)조상타입 -> 자손타입(Down-casting) : 형변환 생략 불가
		fe02 = (FireEngine) car;
		fe02.water();
		

		
		

	}

}

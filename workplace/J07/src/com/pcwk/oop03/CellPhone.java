package com.pcwk.oop03;

public class CellPhone {
	
	String model;
	String color;
	int capacity;
	
	//default 생성자
	public CellPhone () {}
	
	//생성자의 역할
	//멤버변수 초기화
	//생성자 오버로딩
	public CellPhone(String parModel, String parColor, int parCapacity) {
		model = parModel;
		color = parColor;
		capacity = parCapacity;
	}

}

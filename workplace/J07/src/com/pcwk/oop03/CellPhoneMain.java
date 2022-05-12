package com.pcwk.oop03;

public class CellPhoneMain {

	public static void main(String[] args) {
		
		//Default 생성자
		CellPhone cellPhone = new CellPhone();
		
		//인자 3개 생성자
		CellPhone cel02 = new CellPhone("iPhone13", "Sliver", 512);
		
		System.out.println(cel02.model);
		System.out.println(cel02.color);
		System.out.println(cel02.capacity);

	}

}

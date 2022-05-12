package com.pcwk.oop01;

public class MyDate {
	
	private int day;
	public int month;
	public int year;
	
	public MyDate() {}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		
		if(month == 2) {
			if(day < 1 || day > 28 ) {
				System.out.println("일수를 확인하세요");
			}else {
				this.day = day;
			}
		}	
	}
	
	
	
	
	
	
	
	

}

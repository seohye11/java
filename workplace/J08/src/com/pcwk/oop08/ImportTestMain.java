package com.pcwk.oop08;

import java.text.SimpleDateFormat;
import java.util.Date;

//Ctrl + Shift + O  import 정리
//Ctrl + Shift + F  소스정리
//import문 정리

public class ImportTestMain {

	public ImportTestMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Date today = new Date();
		
		SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");
		
		System.out.println("today : "+ today);
		System.out.println("오늘 날짜 : "+ date.format(today));
		System.out.println("현재 시간 : "+ time.format(today));		

	}

}

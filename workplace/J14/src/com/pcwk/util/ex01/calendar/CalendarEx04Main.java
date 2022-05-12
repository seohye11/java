/**
* <pre>
* com.pcwk.util.ex01.calendar
* Class Name : CalendarEx04Main.java
* Description:
* Author: ITSC
* Since: 2022/02/22
* Version 0.1
* Copyright (c) by H.R.KIM All right reserved.
* Modification Information
* 수정일   수정자    수정내용
*-----------------------------------------------------
*2022/02/22 최초생성
*-----------------------------------------------------
* </pre>
*/
package com.pcwk.util.ex01.calendar;

import java.util.Calendar;

/**
 * 년, 월을 출력하는 달력
 *
 */
public class CalendarEx04Main {

	public static void main(String[] args) {
		
		//param 읽기
		if(args.length != 2) {
			System.out.println("사용법 : 2022 2");
			return;
		}
		
		//param읽기
		for(int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		
		System.out.println("년도 : "+ args[0]);
		System.out.println("월 : " + args[1]);
		
		//년, 월
		int year = Integer.parseInt(args[0]);//년도
		int month = Integer.parseInt(args[1]);//월
		
		int START_DAY_OF_WEEK = 0;//시작 요일
		int END_DAY = 0;//마지막날
		
		Calendar sDay = Calendar.getInstance();//시작일
		Calendar eDay = Calendar.getInstance();//종료일
		
		//월은 0~11까지의 값을 가지므로 1을 빼주어야 한다
		sDay.set(year, month-1, 1);//(2022, 1, 1)
		eDay.set(year, month, 1);//(2022, 3, 1)
		
		System.out.println(toString(eDay));
		
		//그 달 마지막 일 - > 2022/03/01 -1
		eDay.add(Calendar.DATE, -1);
		
		System.out.println(toString(sDay));
		System.out.println(toString(eDay));	
		
		//시작요일
		START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);
		System.out.println("시작요일 : "+ START_DAY_OF_WEEK);
		
		//마지막날
		END_DAY = eDay.get(Calendar.DATE);
		System.out.println("마지막날 : "+ END_DAY);
		
		//달력출력
		System.out.println("     "+year+"년"+month+"월");
		System.out.println(" SU MO TU WE TH FR SA");
		
		for(int i =1; i < START_DAY_OF_WEEK; i++) {	
			System.out.print("   ");			
		}
		
		for(int i = 1, n=START_DAY_OF_WEEK; i <= END_DAY; i++, n++) {
			//1자리, 2자리 구분
			System.out.print((i < 10) ? "  "+i : " "+i);
			//DAY_OF_WEEK가 토요일이면 Enter("\n")
			if(n % 7 == 0) {
				System.out.println();
			}
		}	
	}
	//년월일
	public static String toString(Calendar today) {

		return today.get(Calendar.YEAR)+"년 "+ (today.get(Calendar.MONTH)+1)+
		       "월 "+ today.get(Calendar.DATE)+ "일";
	}

}

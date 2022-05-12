/**
* <pre>
* com.pcwk.util.ex01.calendar
* Class Name : CalendarEx01Main.java
* Description: 캘린더
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

import java.util.*;

import com.pcwk.cmn.LoggerManager;

public class CalendarEx01Main implements LoggerManager{

	/**
	 * Calendar
	 */
	public static void main(String[] args) {
		
		//Calendar는 추상 클래스로 스스로 객체를 생성할 수 없다
		//메서드를 통해 생성
		//싱글톤으로 객체를 생성
		//Calendar cal = new Calendar();
		//타임존은 동일한 로컬 시간을 따르는 지역을 의미 주로 해당 국가에 의해 법적으로 지정
		
		Calendar cal01 = Calendar.getInstance();
		Calendar cal02 = Calendar.getInstance();
		
		//싱글톤 여부
		LOG.debug("cal01 : "+ cal01.toString());
		LOG.debug("cal02 : "+ cal02.toString());
		
		//객체동일성 확인
		LOG.debug("cal01 : "+ System.identityHashCode(cal01));
		LOG.debug("cal02 : "+ System.identityHashCode(cal02));
		
		CalendarEx01Main c01 = new CalendarEx01Main();
		System.out.println(c01);

	}

}

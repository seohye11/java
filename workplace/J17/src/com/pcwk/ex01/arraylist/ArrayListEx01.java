/**
* <pre>
* com.pcwk.ex01.arraylist
* Class Name : ArrayListEx01.java
* Description:
* Author: ITSC
* Since: 2022/02/25
* Version 0.1
* Copyright (c) by H.R.KIM All right reserved.
* Modification Information
* 수정일   수정자    수정내용
*-----------------------------------------------------
*2022/02/25 최초생성
*-----------------------------------------------------
* </pre>
*/
package com.pcwk.ex01.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx01 {

	public static void main(String[] args) {
		
		//순서보장
		List<String> list01 = new ArrayList<>();//타입 생략
		
		//객체 추가 : 리스트의 끝에 추가
		list01.add("JAVA");
		list01.add("ORACLE");
		
		//특정 index에 추가 : 그 인덱스부터의 값들이 1칸씩 밀린다
		list01.add(0, "C");
		
		//값 변경 : set
		list01.set(0, "B");
		
		System.out.println("list01 : "+ list01.toString());	

	}

}

/**
* <pre>
* com.pcwk.ex02.linkedlist
* Class Name : LinkedList.java
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
package com.pcwk.ex02.linkedlist;

import java.util.*;

public class LinkedListEx01 {
	
	//LinkdeList나 ArrayList사용 방법은 동일
	//추가 변경
	public static void main(String[] args) {
		
		LinkedList<String> likedList01 = new LinkedList<>();
		
		//객체 추가 : 리스트의 끝에 추가
		likedList01.add("JAVA");
		likedList01.add("ORACLE");
		likedList01.add("WEB");
		System.out.println("likedList01 : "+ likedList01);
		
		//특정위치에 추가
		likedList01.add(0, "C");
		System.out.println("likedList01 : "+ likedList01);
		
		//값 변경 : set
		likedList01.set(0, "B");
		System.out.println("likedList01 : "+ likedList01);
				
		
	}

}

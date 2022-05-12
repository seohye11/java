/**
* <pre>
* com.pcwk.collection.ex02.queue
* Class Name : StackEx01.java
* Description:
* Author: ITSC
* Since: 2022/02/28
* Version 0.1
* Copyright (c) by H.R.KIM All right reserved.
* Modification Information
* 수정일   수정자    수정내용
*-----------------------------------------------------
*2022/02/28 최초생성
*-----------------------------------------------------
* </pre>
*/
package com.pcwk.collection.ex02.stack;

import java.util.*;

public class StackEx01 {
	
//	  stack
//	   : 자료 구조 중 하나인 stack은, 상자에 물건을 쌓아 올리듯이 데이터를 쌓는 자료 구조
//       stack의 가장 큰 특징은 나중에 들어간 것이 먼저 나오는(LIFO Last In First Out)

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack();
		
		//추가
		stack.push("JAVA");
		stack.push("ORACLE");
		stack.push("WEB");
		stack.push("SPRING");
		stack.push("C");
		
		//꺼내기
		while(!stack.empty()) {//stack이 비워져 있지 않을 때까지
			System.out.println(stack.pop());
			
		}
		
		
		
		
		
		
		

	}

}























/**
* <pre>
* com.pcwk.ex02.linkedlist
* Class Name : ArrayListVSLinkedlist.java
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

public class ArrayListVSLinkedlist {

	public static void main(String[] args) {
		
		//순차적인 추가/삭제 : ArrayList
		//중간에 추가/삭제 : LinkedList
		
		//순차적인 추가
		//ArrayList VS LinkedList = ArrayList		
		ArrayList<String> arrayList = new ArrayList<>(1_000_000);
		LinkedList<String> likedList = new LinkedList<>();
		
		System.out.println("순차적인 추가");
		System.out.println("ArrayList : "+ addSequential(arrayList));
		System.out.println("LikedList : "+ addSequential(likedList));
		
		
		//중간에 추가
		//ArrayList VS LinkedList = LinkedList
		System.out.println("중간에 추가");
		System.out.println("ArrayList : "+ addMiddle(arrayList));
		System.out.println("LikedList : "+ addMiddle(likedList));
		System.out.println("LikedList : "+ addMiddle(likedList));
		
		
		//★뒤에서부터 삭제
		System.out.println("뒤에서부터 삭제");
		System.out.println("ArrayList : "+ removeArrayList(arrayList));
		System.out.println("LikedList : "+ removeArrayList(likedList));
		
		
		
	}
	/**
	 * 뒤에서부터 삭제
	 * @param list
	 * @return
	 */
	public static long removeArrayList(List<String> list) {
		
		long start = System.currentTimeMillis();
		for(int i = list.size()-1; i >= 0; i--) {
			list.remove(i);
		}
		long end = System.currentTimeMillis();
		return end - start;
	}
	
	/**
	 * 중간에 추가
	 * @param list
	 * @return long
	 */
	public static long addMiddle(List<String>list) {
		
		long start = System.currentTimeMillis();
		for(int i = 0; i < 100_000; i++) {
			list.add(999, String.valueOf(i));//String.valueOf(i) == i+""
		}
		long end = System.currentTimeMillis();
		return end - start;
	}

	/**
	 * 순차적인 추가
	 * @param list
	 * @return long
	 */
	public static long addSequential(List<String>list) {
		
		long start = System.currentTimeMillis();
		//1000000 => 1_000_000 천단위구분자
		for(int i = 0; i < 1_000_000; i++) {
			list.add(i+"");
		}
		long end = System.currentTimeMillis();
		return end - start;
		
	}

}

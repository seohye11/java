/**
* <pre>
* com.pcwk.util.ex03.singleton
* Class Name : SingleToneMain.java
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
package com.pcwk.util.ex03.singleton;

/**
 * @author ITSC
 *
 */
public class SingleToneMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//The constructor SingleTone() is not visible
		//SingleTone s01 = new SingleTone();
		SingleTone s01 = SingleTone.getInstance();//1)
		SingleTone s02 = SingleTone.getInstance();//2)
		
		                                         // 1),2) => 주소같음
		System.out.println("s01 : "+ s01);
		System.out.println("s02 : "+ s02);
		
	}

}

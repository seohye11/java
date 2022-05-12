package com.pcwk.time.ex04.decimalformat;

import java.text.*;

public class DecimalFormatMain {

	public static void main(String[] args) {
		
		//DecimalFormat : 숫자를 형식화하는 클래스
		
		double number = 1234567.89;
		
		// 0 : 10진수(값이 없는 경우 0)
		// # : 10진수(있으면 출력)
		// . : 소수점 출력
		// - : 음수
		// , : 천단위 구분자
		// E : 지수기호
		// % : 퍼센트
		// \u00A4 : 통화 -> W
		
		String[] pattern = {
				"0",
				"#",
				"0.0",
				"#.#",
				"000000000.0000",
				"#########.####",
				"###,###,###.###",
				"#.#%",
				"\u00A4 ###,###,###.###"
		};
		
		for(int i = 0; i < pattern.length; i++) {
			DecimalFormat df = new DecimalFormat(pattern[i]);
			System.out.printf("%19s : %s \n", pattern[i], df.format(number));
		}

	}

}














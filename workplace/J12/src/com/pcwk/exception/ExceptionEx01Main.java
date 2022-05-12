package com.pcwk.exception;

import com.pcwk.api.string.LoggerManager;

public class ExceptionEx01Main implements LoggerManager{

	public static void main(String[] args) {
		
		//예외처리 전
		int number = 100;
		int result = 0;
		
		for(int i = 0; i <= 20; i++) {
			//0.0 <= x < 1.0
			result = number / (int)(Math.random()*10);
			LOG.debug("result : "+ result);		
		}
		
		LOG.debug("프로그램 종료!");//프로그램이 비정상 종료
		
		
		
		
		

	}

}

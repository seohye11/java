package com.pcwk.api.string;

public class StringBuilderMain implements LoggerManager{

	public static void main(String[] args) {
		
		LOG.debug("================");
		//StringBuiler : 가변 배열
		
		//String char[]로 데이터를 저장한다
		//배열은 한 번 크기를 정하면 변경 불가		
		//동기화 되지 않음, 연산 속도 우수
		StringBuilder sb = new StringBuilder();//16
		LOG.debug(sb.capacity());
		
		sb.append("01_java   \n");
		sb.append("02_oracle \n");
		sb.append("03_html   \n");
		
		LOG.debug(sb.capacity());
		LOG.debug(sb.toString());
		

	}

}

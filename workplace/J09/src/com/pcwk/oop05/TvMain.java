package com.pcwk.oop05;

public class TvMain {

	public static void main(String[] args) {
		
		//조상타입의 참조변수로 자손타입의 인스턴스를 참조할 수 있다
		//반대로 자손타입의 참조변수를 조상타입의 인스턴스를 참조할 수는 없다
		
		CaptionTv cTv = new CaptionTv();
		//CaptionTv cTv02 = new Tv(); error
		
		Tv t = new CaptionTv();

	}

}

package com.pcwk.oop03.inter;

public class InterMain {

	public static void main(String[] args) {
		
		MyCellPhone phone01 = new MyCellPhone();
		
		//다형성
		Camera camera = new MyCellPhone();
		Call call = new MyCellPhone();
		Memo memo = new MyCellPhone();
		Clock clock = new MyCellPhone();
		
		PhoneUser phoneUser = new PhoneUser();
		phoneUser.call(phone01);
		
		phoneUser.call(call);	

	}

}

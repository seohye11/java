package com.pcwk.oop10.abstracted;

public class AbstractMain {

	public static void main(String[] args) {
		
		//추상 클래스는 스스로 객체를 생성할 수 없다-> 상속받은 자식을 통해 생성
		//ex) Play play = new Play(); error
		
		Play play = new AudioPlay();
		
		play.play(5);//추상메서드 호출
		play.disp();//play일반 메서드

	}

}

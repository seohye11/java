package com.pcwk.oop01;

public class Tv {

	// TV클래스로 모델링
	// 속성 : 크기, 길이, 높이, 색상, 볼륨, 채널 등
	// 기능 : 켜기, 끄기, 볼륨높이기, 볼륨낮추기, 채널변경
	
	//인스턴스 변수
	public boolean power;
	public int volume;
	public int channel ;
	
	void channelUp() {
		channel ++;
	}
	void channelDown() {
		channel --;
	}
	void power() {
		power = !power;
	}

}

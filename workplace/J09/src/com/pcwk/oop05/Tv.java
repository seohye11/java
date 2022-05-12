package com.pcwk.oop05;

public class Tv {
	
	boolean power;
	int channel;
	
	void power() {
		power = !power;
	}
	void channelUp() {
		this.channel++;
	}
	void channlDown() {
		this.channel--;
	}
	

}

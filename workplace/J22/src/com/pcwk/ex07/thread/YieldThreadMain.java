package com.pcwk.ex07.thread;

public class YieldThreadMain {

	public static void main(String[] args) {
		
		YieldThread yieldThread = new YieldThread();
		NormThread NormThread = new NormThread();
		
		Thread t01 = new Thread(yieldThread);
		Thread t02 = new Thread(NormThread);
		
		t02.start();
		t01.start();
		
		

	}

}

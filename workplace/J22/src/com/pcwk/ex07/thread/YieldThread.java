package com.pcwk.ex07.thread;

public class YieldThread implements Runnable {
	
	@Override
	public void run() {
		
		for(int i = 0; i < 100; i++) {
			//자음+한자
			System.out.print("★");
			
			//실행 중에 자신에게 주어진 실행시간을 다른 스레드에서 양보한다  
			Thread.yield();
			
		}

	}

}

package com.pcwk.ex05.thread;

public class MyThreadMain {

	public static void main(String[] args) {
		
		Runnable th01 = new MyThread();
		Thread thread01 = new Thread(th01, "thread01");
		thread01.setPriority(1);//MIN_PRIORTY
		
		System.out.println("thread01 우선순위 : "+ thread01.getPriority());
		
		Thread thread02 = new Thread(th01, "tread02");
		//thread02.setPriority(5);//NORM_PRIORITY, 생략하면 NORM_PRIORITY
		System.out.println("thread02 우선순위 : "+ thread02.getPriority());
		
		Thread thread03 = new Thread(th01, "thrad03");
		thread02.setPriority(10);//MAX_PRIORTY
		System.out.println("thread03 우선순위 : "+ thread03.getPriority());
		
		//스레드 start
		thread01.start();
		thread02.start();
		thread03.start();
		
		
		
		

	}

}

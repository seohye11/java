package com.pcwk.oop01;

public class Person {
	
	//인자있는 생성자를 생성하면 default 생성자는 JVM을 만들지 않음
	
	String name;
	float height;
	float weight;
	
	public Person () {}
	
	public Person(String name) {
		this.name = name;
	}

}

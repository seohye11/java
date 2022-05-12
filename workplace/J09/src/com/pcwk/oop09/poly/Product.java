package com.pcwk.oop09.poly;

public class Product {
	
	int price;
	int bonusPoint;
	
	public Product() {}
	
	public Product(int price) {
		this.price = price;
		//bounspoint = 10%로 적립
		this.bonusPoint = (int)(price/10.0);
	}
	

}

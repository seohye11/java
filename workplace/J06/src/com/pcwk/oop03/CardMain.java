package com.pcwk.oop03;

public class CardMain {

	public static void main(String[] args) {
		
		System.out.println("Card.width : "+ Card.width);
		System.out.println("Card.heigth : "+ Card.heigth);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 2;
		
		System.out.println("c1 : "+ c1.kind + ", " + c1.number);
		System.out.println("c1 : "+ c1.width + ", " + c1.heigth);
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 7;

		System.out.println("c2 : "+ c2.kind + ", " + c2.number);
		System.out.println("c2 : "+ c2.width + ", " + c2.heigth);
		
		c1.width = 88;
		c1.heigth = 99;
		System.out.println("----------------------------");
		
		System.out.println("c1 : "+ c1.width + ", " + c1.heigth);
		System.out.println("c2 : "+ c2.width + ", " + c2.heigth);
		
	}

}

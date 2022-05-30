package com.gth.javabasic;

public class Slisp {
	public static void main(String[] args) {
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.height = " + Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1은  " + c1.kind + ", " + c1.number
				+ "이며, 크기는 (" + c1.width + ", " + c1.height + ") ");
		
		System.out.println("c2은  " + c2.kind + ", " + c2.number
				+ "이며, 크기는 (" + c2.width + ", " + c2.height + ") ");
		
		System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
		Card.width = 50; // cv 클래스 변수는 공유 변수이다. 그래서 표기법을 클래스이름.변수 이름으로 구별한다.
		Card.height = 80;
		
		System.out.println("c1은  " + c1.kind + ", " + c1.number
				+ "이며, 크기는 (" + c1.width + ", " + c1.height + ") ");
		
		System.out.println("c2은  " + c2.kind + ", " + c2.number
				+ "이며, 크기는 (" + c2.width + ", " + c2.height + ") ");
	}
}

class Card{
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
}
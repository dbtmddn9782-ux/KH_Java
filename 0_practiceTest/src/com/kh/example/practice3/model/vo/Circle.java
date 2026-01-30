package com.kh.example.practice3.model.vo;

public class Circle {
	public static final double PI = 3.14;
	private static int radius = 1;
	
	
	public void incrementRadius() {
		radius ++;
		System.out.println("증가한 원의 넓이 : "+PI*(radius*radius));
		System.out.println("증가한 원의 둘레 : "+2*PI*radius);
	}
	public void getAreaOfCircle() {
		System.out.println("원의 넓이 : "+PI*(radius*radius));
		
	}
	public void getSizeOfCircle() {
		System.out.println("원의 둘레 : "+2*PI*radius);
	}

}

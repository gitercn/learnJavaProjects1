package com.ti1;

public class TestCircle {
	public static void main(String[] args) {
		Circle circle1 = new Circle();
		circle1.setR(10.1);
		double testArea = circle1.getArea();
		System.out.println(testArea);
		double testPerimeter = circle1.getPerimeter();
		System.out.println(testPerimeter);
		
	}

}

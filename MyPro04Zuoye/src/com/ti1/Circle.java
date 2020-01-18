package com.ti1;

public class Circle {
	private double r;
	
	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	double getArea() {
		double area = Math.PI*r*r;
		return area;
		
	}
	
	double getPerimeter() {
		double perimeter = 2*Math.PI*r;
		return perimeter;
	}

}

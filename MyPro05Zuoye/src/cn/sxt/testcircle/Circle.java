package cn.sxt.testcircle;

public class Circle {
	private double radius;
	Circle(){
		
	}
	Circle(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		double area = Math.PI*Math.PI*radius;
		return area;
	}
	public double getPerimeter() {
		double perimeter = 2*Math.PI*radius;
		return perimeter;
	}
	void show() {
		System.out.println(radius);
		System.out.println(getArea());
		System.out.println(getPerimeter());
	}

}

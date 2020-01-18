package cn.sxt.testcircle;

public class Cylinder extends Circle{
	private double height;
	Cylinder(){
		super();
	}
	Cylinder(double radius, double height){
		super(radius);
		this.height = height;
		
	}
	public double getVolume() {
//		;
		return getArea()*height;
	}
	public void showVolume() {
		System.out.println(getVolume());
	}
	
	public static void main(String[] args) {
		Cylinder c = new Cylinder(10, 10);
		c.showVolume();
		Circle c2 = (Circle) c;
		c2.show();
	}

}

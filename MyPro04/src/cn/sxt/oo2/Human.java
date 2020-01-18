package cn.sxt.oo2;
public class Human{
	private int age;
	String name; //，可以被本报下面的类访问
	protected int height = 1;
	public int height2 = 2;
	
	public void sayAge() {
		System.out.println(age);
	}
}
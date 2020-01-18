package test;

class Fu2 {
	static {
		System.out.println("静态代码块Fu");
	}
	{
		System.out.println("构造代码块Fu");
	}

	public Fu2() {
		System.out.println("构造方法Fu");
	}
}

class Zi2 extends Fu2 {
	static {
		System.out.println("静态代码块Zi");
	}
	{
		System.out.println("构造代码块Zi");
		System.out.println("普通代码Zi");
	}

	public Zi2() {
		super();
		System.out.println("构造方法Zi");
	}
}

public class Test2 {
	public static void main(String[] args) {
		Zi2 z = new Zi2();
	}

}

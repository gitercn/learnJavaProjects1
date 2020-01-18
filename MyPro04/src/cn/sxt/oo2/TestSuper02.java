package cn.sxt.oo2;

public class TestSuper02 {
	public static void main(String[] args) {
		System.out.println("开始创建一个ChildClass对象。。");
		new ChildClass2();
	}
}

class FatherClass2 {
	public FatherClass2() {
		System.out.println("正在创建FatherClass");
	}
}

class ChildClass2 extends FatherClass2 {
	public ChildClass2() {
		super(); //，写与不写都一样
		System.out.println("正在创建ChildClass");
	}
}
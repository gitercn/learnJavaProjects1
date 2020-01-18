package cn.sxt.oop;

abstract public class Animal {
	abstract public void shout();
	
	//在抽象类中也可以定义普通方法
	public void run() {
		System.out.println("跑啊跑！");
	}
	
	public static void main(String[] args) {
		Animal a = new Dog();
		
		Integer in;
	}

}

class Dog extends Animal {

	@Override
	public void shout() {
		System.out.println("汪汪汪！");
		
	}
	
	public void seeDoor() {
		
	}
	
	
}

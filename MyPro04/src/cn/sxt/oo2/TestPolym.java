package cn.sxt.oo2;

/**
 * 测试多态
 * @author YunBoWei
 *
 */
public class TestPolym {
	public static void main(String[] args) {
		
		TestPolym m1 = new TestPolym();
		
		
		Animal a = new Animal();
//		animalCry(a);
		m1.animalCry(a);
		
		Dog d = new Dog();
//		animalCry(d);
		m1.animalCry(d);
		
		Animal c = new Cat();
//		animalCry(c);
		m1.animalCry(c);
		
		Animal dcast = new Dog();//，测试转型
//		animalCry(d2);
		m1.animalCry(dcast);
		
		
		
		Dog d2 = (Dog) dcast;
		d2.seeDoor();
		
		Dog d3 = (Dog) c;
		d3.seeDoor();
		
	}
	
	void animalCry(Animal a) {
		a.shout();
	}
}

class Animal{
	public void shout() {
		System.out.println("叫了一声");
	}
}

class Dog extends Animal{
	public void shout() {
		System.out.println("汪汪汪");
	}
	
	public void seeDoor() {
		System.out.println("看门");
	}
}

class Cat extends Animal{
	public void shout() {
		System.out.println("喵喵喵");
	}
}
package cn.sxt.oop;

public class TestInterface {
	public static void main(String[] args) {
		Volant v = new Angel();
		
		Honest h = new GoodMan();
		h.helpOther();
	}

}

interface Volant{
	int FLY_HEIGHT = 100;
	void fly();
}

interface Honest {
	void helpOther();
}

class Angel implements Volant, Honest{
	public void fly() {
		System.out.println("我是天使飞起来了"); 
	}

	@Override
	public void helpOther() {
		System.out.println("扶老奶奶过马路"); 
		
	}
}

class GoodMan implements Honest {

	@Override
	public void helpOther() {
		System.out.println("GoodMan.helpOther()"); 
		
	}
	
}

class BirdMan implements Volant {

	@Override
	public void fly() {
		System.out.println("Volant.fly()"); 
		
	}
	
}
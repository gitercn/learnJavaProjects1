package cn.sxt.exception;

public class Test01 {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		if(a!=0) {
			System.out.println(b/a);
		}
		
		String str = null;
		if(str!=null) {
			str.length();
			
		}
		
		Animal ani = new Dog();
		System.out.println(ani instanceof Cat);
		System.out.println(ani instanceof Dog);
		if (ani instanceof Cat) {
			System.out.println("i");
			Cat cat = (Cat) ani;
			
		}
	}
	
	

}

class Animal{
	
}

class Dog extends Animal{
	
}

class Cat extends Animal{
	
}


package cn.sxt.oo;

import cn.sxt.oo2.Human;

public class TestEncapsulation2 {
	public static void main(String[] args) {
		Human h = new Human();
//		h.age = 13;
//		h.name = "gao";
		h.sayAge();
		
		Girl g = new Girl();
		g.sayGood();
	}

}

//class Boy extends Human {
//	void sayHello() {
////		System.out.println(age);
//		System.out.println(name);
//	}
//
//}

class Girl extends Human {
	void sayGood() {
		System.out.println(height);
		System.out.println(height2);
	}
}
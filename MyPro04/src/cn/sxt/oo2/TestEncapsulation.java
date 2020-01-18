package cn.sxt.oo2;

/**
 * 测试封装
 * @author YunBoWei
 *
 */
public class TestEncapsulation {
	public static void main(String[] args) {
		Human h = new Human();
//		h.age = 13;
		h.name = "gao";
		h.height = 230;
		
		Person4 p4 = new Person4();
		p4.setAge(-10);
		System.out.println(p4.getAge());
	}
}



class Boy extends Human {
	void sayHello() {
//		System.out.println(age);
		System.out.println(name);
	}

}
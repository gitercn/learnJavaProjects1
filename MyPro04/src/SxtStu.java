
public class SxtStu {
	//，这是属性，也叫成员变量
	int id;
	String name;
	int age;
	
	//， 类也可以嵌套（）互相引用，学生类可以含有Computer类
	Computer comp;
	
	//， 方法
	void study() {
		System.out.println("我在认真学习！！，使用电脑："+comp.brand);
	}
	
	void play() {
		System.out.println("我在玩游戏！王者农药！");
	}
	
	//， 构造方法，用于创建这个类的对象无参数的构造方法可以由系统自动创建。方法名必须和类名一致，大小写都要一样
	SxtStu(){
	}
	
	// main方法程序执行的入口，必须要有
	public static void main(String[] args) {
		SxtStu stu = new SxtStu();
		stu.id=1001;
		stu.name="名字1";
		stu.age=18;
		
		Computer c1 = new Computer();
		c1.brand = "联想";
		
		stu.comp = c1;
		
		stu.play();
		stu.study();
	}
}

//， 一个java文件可以写多个类，但只能有一个public修饰的类
class Computer {
	String brand; // 电脑品牌
}
package cn.sxt.oo2;

/**
 * 测试继承
 * @author YunBoWei
 *
 */

public class TestExtends {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.name = "高";
		stu.height = 172;
		stu.rest();
		
		Student stu2 = new Student("haha", 99, "hellom");
		
		System.out.println(stu2 instanceof Student);
		System.out.println(stu2 instanceof Person);
		System.out.println(stu2 instanceof Object);
		System.out.println(new Person() instanceof Student);
	}

}

class Person extends Object{
	String name;
	int height;
	
	public void rest() {
		System.out.println("休息一会！");
	}
}

class Student extends Person {
//	String name;
//	int height;
	String major;
	
	public void study() {
		System.out.println("学习两小时！");
	}
	
//	public void rest() {
//		System.out.println("休息一会！stu");
//	}
	
	public Student(String name, int height, String marjor) {
		this.name = name;
		this.height = height;
		this.major = major;
	}
	
	public Student() {
		
	}
}
package cn.sxt.oo2;
/**
 * 测试重写（Override）/覆盖
 * @author YunBoWei
 *
 */

public class TestOverride {
	public static void main(String[] args) {
		Horse h = new Horse();
		h.run();
		
	}

}

class Vehicle{ //，交通工具类
	public void run() {
		System.out.println("跑...");
	}
	
	public void stop() {
		System.out.println("停止！");
	}
	
	//，把同包不同类中的Person对象作为返回值类型
	public Person whoIsPsg() {
		return new Person();
	}
}

class Horse extends Vehicle{
	public void run() {
		System.out.println("四蹄翻飞，得得得。。");
	}
	
	public Student whoIsPsg() {
		return new Student();
	}
}
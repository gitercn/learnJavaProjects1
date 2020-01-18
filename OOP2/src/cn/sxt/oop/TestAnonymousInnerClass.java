package cn.sxt.oop;

public class TestAnonymousInnerClass {
	public static void test01(AA a) {
		System.out.println("在这里调用不是在下面调用");
		a.aa();
	}
	
	public static void main(String[] args) {
		TestAnonymousInnerClass.test01(new AA() {

			@Override
			public void aa() {
				System.out.println("12");
				
			}
		});
	}

}

interface AA {
	void aa();
}



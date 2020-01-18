package cn.sxt.test;

public class TestAutoBox {
	public static void main(String[] args) {
		Integer a = 234;
		Integer a1 = Integer.valueOf(234);
		
		int b = a;
		int b1 = a.intValue();
		
		Integer c = null;
		int d = c;
	}

}

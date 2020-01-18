package cn.sxt.test;

public class TestWrappedClass {
	public static void main(String[] args) {
		Integer a = new Integer(3);
		Integer b = Integer.valueOf(30);
		
		int c = b;
		int c1 = b.intValue();
		
		Integer e = new Integer("9999");
		Integer f = Integer.parseInt("909888");
		
		String str = f.toString();
		System.out.println(Integer.MAX_VALUE);
	}

}

package cn.sxt.testprivate;

import cn.sxt.myprozuoye05.t1;

public class testprivate extends t1{
	
	public void method() {
		System.out.println(a1);
		System.out.println(a2);
	}
	
	public static void main(String[] args) {
		testprivate t = new testprivate();
		t.method();
	}

}
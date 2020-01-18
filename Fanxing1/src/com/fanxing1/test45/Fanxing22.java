package com.fanxing1.test45;

public class Fanxing22 {
	public static void main(String[] args) {
		//泛型的类型参数只能是类类型（包括自定义类），不能是简单类型
		//传入的实参类型需与泛型的类型参数类型相同，即为Integer.
		Fanxing21<Integer> fanxing21Integer = new Fanxing21<Integer>(123456);
		
		//传入的实参类型需与泛型的类型参数类型相同，即为String.
		Fanxing21<String> fanxing21String = new Fanxing21<String>("stringvalue");
		System.out.println("Integer key is" + fanxing21Integer.getKey());
		System.out.println("String key is" + fanxing21String.getKey());
		
		Fanxing21 fanxing211 = new Fanxing21("111111");
		Fanxing21 fanxing212 = new Fanxing21(1234);
		Fanxing21 fanxing213 = new Fanxing21(55.55);
		Fanxing21 fanxing214 = new Fanxing21(false);
		
		System.out.println("fanxing211 is" + fanxing211.getKey());
		System.out.println("fanxing212 is" + fanxing212.getKey());
		System.out.println("fanxing213 is" + fanxing213.getKey());
		System.out.println("fanxing214 is" + fanxing214.getKey());
	}

}

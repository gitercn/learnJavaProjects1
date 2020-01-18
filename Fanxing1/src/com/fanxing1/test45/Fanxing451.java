package com.fanxing1.test45;

public class Fanxing451 {
	
	public static void showKeyValue(Fanxing21<?> obj) {
		System.out.println("泛型测试 key value is " + obj.getKey());
	}
	
	public static void main(String[] args){
		Fanxing21<Integer> gInteger = new Fanxing21<Integer>(123);
		Fanxing21<Number> gNumber = new Fanxing21<Number>(456);
		
		showKeyValue(gInteger);
		showKeyValue(gNumber);
	}
		
}

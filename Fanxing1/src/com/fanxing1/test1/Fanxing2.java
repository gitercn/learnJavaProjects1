package com.fanxing1.test1;

import java.util.ArrayList;
import java.util.List;

public class Fanxing2 {
	public static void main(String[] args) {
		List<String> stringArrayList = new ArrayList<String>();
		List<Integer> integerArrayList = new ArrayList<Integer>();
		
		Class classStringArrayList = stringArrayList.getClass();
		Class classIntegerArrayList = integerArrayList.getClass();
		
		if(classStringArrayList.equals(classIntegerArrayList)) {
			System.out.println("泛型测试类型相同");
		}
	}

}

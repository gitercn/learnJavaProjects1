package com.fanxing1.test1;

import java.util.ArrayList;
import java.util.List;

public class Fanxing1 {
	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("aaaa");
		arrayList.add("100");
		
		for(int i = 0; i<arrayList.size(); i++) {
			String item = (String)arrayList.get(i);
//			Object item = arrayList.get(i);
			System.out.println("泛型测试 item = " + item);
		}
	}
	
}

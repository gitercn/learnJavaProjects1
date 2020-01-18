package cn.sxt.collection;

import java.util.*;

public class TestList {
	public static void main(String[] args) {
		test03();
	}
	
	public static void test01() {
		Collection<String> c = new ArrayList<>();
		
		System.out.println(c.size());
		System.out.println(c.isEmpty());
		
		c.add("gao1");
		c.add("gao2");
		
		System.out.println(c);
		System.out.println(c.size());
		
		System.out.println(c.contains("gao2"));
		
		Object[] objs = c.toArray();
		System.out.println(objs);
		
		c.remove("gao2");
		System.out.println(c);
		System.out.println(c.size());
		
		c.clear();
		System.out.println(c);
		System.out.println(c.size());

	}
	
	public static void test02() {
		List<String> list01 = new ArrayList<>();
		list01.add("aa");
		list01.add("bb");
		list01.add("cc");
		
		List<String> list02 = new ArrayList<>();
		list02.add("aa");
		list02.add("dd");
		list02.add("ee");
		
		System.out.println("list01:"+list01);
		
//		list01.addAll(list02);
//		list01.removeAll(list02);
		list01.retainAll(list02);

		System.out.println("list01:"+list01);
		
		System.out.println(list01.containsAll(list02));
		
	}
	
	public static void test03() {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		
		System.out.println("list:"+list);
		
		list.add(2, "gao");
		System.out.println("list:"+list);
		
		list.remove(2);
		System.out.println("list:"+list);
		
		list.set(2, "gao2");
		System.out.println("list:"+list);
		
		System.out.println(list.get(2));
		
		list.add("C");
		list.add("B");
		list.add("A");
		System.out.println("list:"+list);
		System.out.println(list.indexOf("B"));
		System.out.println(list.lastIndexOf("B"));
		
	}

}

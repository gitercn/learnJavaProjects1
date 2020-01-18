package cn.sxt.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestGenerics {
	public static void main(String[] args) {
	MyCollection<String> mc = new MyCollection<String>();
	mc.set("gao1", 0);
//	mc.set(888, 1);
	
//	Integer a = (Integer)mc.get(1);
	String b = mc.get(0);
	
	List list = new ArrayList();
	Map map = new HashMap();
	}
}

class MyCollection<E> {
	Object[] objs = new Object[5];

	public void set(E e, int index) {
		objs[index] = e;
	}
	
	public E get (int index) {
		return (E)objs[index];
	}
	
	
}
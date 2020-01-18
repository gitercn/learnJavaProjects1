package cn.sxt.mycollection;
/*
 * 自定义实现ArrayList体会底层原理
 */
public class SxtArrayList01 {
	private Object[] elementData;
	private int size;
	
	private static final int DEFAULT_CAPACITY = 10;
	
	public SxtArrayList01() {
		elementData = new Object[DEFAULT_CAPACITY];
	}
	
	public SxtArrayList01(int capacity) {
		elementData = new Object[capacity];
	}
	
	public void add(Object obj) {
		System.out.println("sizeoriginal="+size);
		elementData[size++] = obj;
		System.out.println("size="+size);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		//[a,b,c]
		sb.append("[");
		for(int i=0;i<size;i++) {
			sb.append(elementData[i]);
			sb.append(",");
		}
//		sb.append("]"); 
		sb.setCharAt(sb.length()-1, ']');
		return sb.toString();
	}
	
	public static void main(String[] args) {
		SxtArrayList01 s1 = new SxtArrayList01(20);
		s1.add("aa");
		s1.add("bb");
		
		System.out.println(s1);
	}
}

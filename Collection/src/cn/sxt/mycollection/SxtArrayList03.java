package cn.sxt.mycollection;
/*
 * 自定义实现ArrayList体会底层原理
 * 增加泛型
 * 增加数组扩容
 */
public class SxtArrayList03<E> {
	private Object[] elementData;
	private int size;
	
	private static final int DEFAULT_CAPACITY = 10;
	
	public SxtArrayList03() {
		elementData = new Object[DEFAULT_CAPACITY];
	}
	
	public SxtArrayList03(int capacity) {
		elementData = new Object[capacity];
	}
	
	public void add(E element) {
		
		//，什么时候扩容？？
		if(size == elementData.length) {
			//，怎么扩容？？
			Object[] newArray = new Object[elementData.length+elementData.length>>1];//，左移一位<<1等于*2，右移一位>>1等于除以2
			System.arraycopy(elementData, 0, newArray, 0, elementData.length);
			elementData = newArray;
		}
		
		System.out.println("sizeoriginal="+size);
		elementData[size++] = element;
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
		SxtArrayList03 s1 = new SxtArrayList03(20);
//		s1.add("aa");
//		s1.add("bb");
		for(int i=0; i<40 ;i++) {
			s1.add("gao"+i);
		}
		
		
		System.out.println(s1);
	}
}

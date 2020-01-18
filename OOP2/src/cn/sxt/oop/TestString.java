package cn.sxt.oop;

public class TestString {
	public static void main(String[] args) {
//		String s1 = "core Java";
//		String s2 = "Core java";
//		System.out.println(s1.charAt(3));
//		
//		System.out.println(s2.length());
//		System.out.println(s1.equals(s2));
//		System.out.println(s1.equalsIgnoreCase(s2));
//		
//		System.out.println(s1.indexOf("Java"));
//		System.out.println(s1.indexOf("Java3"));
//		
//		String s = s1.replace(" ","&");
//		System.out.println(s);
//		System.out.println(s1);
		
		String s = "";
		String s1 = "How are you";
		System.out.println(s1.startsWith("How"));
		System.out.println(s1.endsWith("you"));
		
		s = s1.substring(4);
		System.out.println(s);
		s = s1.substring(4,7);
		System.out.println(s);
		s = s1.toLowerCase();
		System.out.println(s);
		s = s1.toUpperCase();
		System.out.println(s);
		String s2 = " How ";
		s = s2.trim();
		System.out.println(s);
		System.out.println(s2);
	}

}

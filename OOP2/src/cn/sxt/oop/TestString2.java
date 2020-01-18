package cn.sxt.oop;

public class TestString2 {
	public static void main(String[] args) {
		String str;
		String str2 = new String("def");
		String str3 = "abc"+"defgh";
		String str4 = "18"+19;
		System.out.println(str4);
		
		System.out.println("############");
		String str10 = "gaoqi";
		String str11 = "gaoqi";
		String str12 = new String("gaoqi");
		
		System.out.println(str10 == str11);
		System.out.println(str12 == str11); //，使用equals比较
	}

}

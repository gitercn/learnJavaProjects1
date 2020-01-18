package test;

public class StaticDemo {
	
	private static int i = 10;
	private int j = 5;
	public String a()
	{
		return "i="+i+" j="+j;
	}
	
	public static void main(String[] args) {
		
		StaticDemo b = new StaticDemo();
		System.out.println(b.a());
	}

}

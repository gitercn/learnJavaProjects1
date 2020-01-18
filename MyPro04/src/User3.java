
public class User3 {
	int id;
	String name;
	static String company;
	
	static {
		System.out.println("执行类的初始化工作");
		company = "hellohello";
		printCompany();
	}
	
	public static void printCompany() {
		System.out.println(company);
	}
	
	public static void main(String[] args) {
		User3 u3 = new User3();
	}
}
/**
 *	测试static关键字的用法
 * @author YunBoWei
 *
 */
public class User2 {
	int id;// id
	String name; // 账户名
	String pwd; // 密码
	
	static String company = "hello1"; // 公司名称
	
	public User2(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void login() {
		printCompany("login"); //，非静态方法调用静态方法没有问题
		System.out.println(company);//调用静态属性没有问题
		System.out.println("登录："+name);
	}
	
	public static void printCompany() { //，用了static修饰之后属于类的而不是对象的
		//login();// 调用非静态成员，编译就会报错
		//this.login();也报错，this代表对象
		System.out.println(company);
	}
	
	public static void printCompany(String who) { //，用了static修饰之后属于类的而不是对象的
		//login();// 调用非静态成员，编译就会报错
		//this.login();也报错，this代表对象
		System.out.println(who+company);
	}
	
	public static void main(String[] args) {
		User2 u = new User2(101, "高");
		u.printCompany("静态方法可以用类名，也可以用对象名");
		User2.printCompany();
		User2.printCompany("User2.printCompany");
		String testString1 = User2.company;
		User2.company = "北京";
		System.out.println("testString1="+testString1);
		User2.printCompany();
		User2.printCompany("User2.printCompany北京set");
		//login(); 也报错
		printCompany(); // 不报错
		printCompany("printCompany");
		//User2.login(); 也报错，非静态方法不能用类名调用
		//this.login();也报错，this代表对象
		u.login(); // 对象名.方法名
	}

}

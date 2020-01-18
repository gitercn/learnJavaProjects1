/**
 * 4.6 构造方法的重载
 * @author YunBoWei
 *
 */
public class User {
	int id; //id
	String name; //，账户名
	String pwd;  //，密码
	
	public User(){
		
	}
	
	public User(int id, String name){
		//super()可以不写编译器自动加上
		System.out.println("正在初始化已经创建好的对象："+this);
		this.id = id;    //，不写this无法区分局部变量和成员变量
		this.name = name;
	}
	
	public User(int id, String name, String pwd){
		this.id = id;
		this.name = name;
		this.pwd = pwd;
	}
	
	public void login(){
		System.out.println(this.name+"要登陆"); //，不屑this效果一样
		System.out.println(name+"要登陆2"); 
	}
	
	public static void main(String[] args){
		User u1 = new User();
		User u2 = new User(101, "高小七");
		User u3 = new User(100, "高琪", "123456");
		System.out.println("打印高小七对象："+u2);
		u2.login();
	}

}

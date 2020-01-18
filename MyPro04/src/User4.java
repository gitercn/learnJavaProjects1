/**
 * 测试参数传值机制
 * @author YunBoWei
 *
 */
public class User4 {
	int id; //id
	String name; // 账户名
	String pwd; // 密码
	
//	public User4(int id, String name) {
//		this.id = id;
//		this.name = name;
//	}
	
	public void testParameterTransfer01(User4 u01) {
		u01.name = "test01";
	}
	
	public void testParameterTransfer02(User4 u02) {
//		u = new User4(200, "test02");
		u02 = new User4();
		u02.name = "test02";
	}
	
	public static void main(String[] args) {
//		User4 u1 = new User4(100, "u1");
		User4 u1 = new User4();
		u1.id = 100;
		u1.name = "u1";
		System.out.println(u1.name);
		
		u1.testParameterTransfer01(u1);
		System.out.println(u1.name);
		
		u1.testParameterTransfer02(u1);//，执行完02之后没有变化，因为新建了一个对象
		System.out.println(u1.name);
	}

}

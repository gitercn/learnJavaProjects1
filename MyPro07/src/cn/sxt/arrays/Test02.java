package cn.sxt.arrays;

/**
 * 测试数组的三种初始化方式
 * @author YunBoWei
 *
 */
public class Test02 {
	public static void main(String[] args) {
		int[] a = {2, 5, 8};
		User[] b = {
				new User(1001, "gao1"),
				new User(1002, "gao2"),
		};
	}

}

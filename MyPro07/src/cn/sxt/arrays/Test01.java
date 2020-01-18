package cn.sxt.arrays;

public class Test01 {
	public static void main(String args[]) {
		int[] arr01 = new int[10];
		String[] arr02 = new String[5];
		
		arr01[0] = 13;
		
		//通过循环初始化数组
		for(int i=0; i<arr01.length; i++) {
			arr01[i] = 10*i;
		}
		//通过循环遍历打印
		for(int i=0;i<arr01.length;i++) {
			System.out.println(arr01[i]);
		}
		
		User[] arr03 = new User[5];
		arr03[0] = new User(1001,"gao1");
		arr03[1] = new User(1002,"gao2");
		arr03[2] = new User(1003,"gao3");
		arr03[3] = arr03[2];
		
		System.out.println(arr03[3].getId());
		arr03[2].setId(1000);
		System.out.println(arr03[3].getId());
	}

}


package cn.sxt.array2;

public class Test2DimensionArray {
	public static void main(String[] args) {
		int[][] a = new int[3][];
		a[0] = new int[]{20, 30};
		a[1] = new int[]{10, 20, 30};
		a[2] = new int[]{1000, 222200};
		
		System.out.println(a[1][2]);
		
		int[][] b = {
				{20,30,30},
				{20,30,30},
				{20,30,30}
		};
		
		System.out.println(b[1][2]);
	}

}

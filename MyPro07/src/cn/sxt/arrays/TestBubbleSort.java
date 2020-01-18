package cn.sxt.arrays;

import java.util.Arrays;

public class TestBubbleSort {
	public static void main(String[] args) {
		int[] values = { 3, 1, 6, 2, 9, 0, 7, 4, 5, 8 }; 
		int temp = 0;
		for(int i = 0; i<values.length-1;i++) {
			boolean flag = true;
			for(int j = 0; j<values.length-1-i; j++) {
				//比较大小换顺序
				if(values[j]>values[j+1]) {
					temp = values[j];
					values[j] = values[j+1];
					values[j+1] = temp;
					
					flag = false;
				}
				System.out.println(Arrays.toString(values));
			}
			
			System.out.println("#######");
			if(flag) {
				System.out.println(flag);
				break;
			}
		}
		
	}

}

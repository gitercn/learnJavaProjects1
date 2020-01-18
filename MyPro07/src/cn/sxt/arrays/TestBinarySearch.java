package cn.sxt.arrays;

import java.util.Arrays;

public class TestBinarySearch {
	public static void main(String[] args) {
		int[] arr = { 30,20,50,10,80,9,7,12,100,40,8};
		Arrays.sort(arr);
		
		int value = 10;//要查找的值
		int a[]={1,2,3,4};
//		int b[4]={1,2,3,4};
		int c[];
//		c={1,2,3,4};
		int d[];
		d=new int[]{1,2,3,4};
		int [] m={0,1,2,3,4,5,6};
		
//		int  t[10]=new int[ ];
		
		char [ ]a1=new char[5]; 
		char []a2={'a','b'};
		
		String [ ] s = new String [10];
		
		double[ ] d1 [ ]=new double [4][ ]; 
		double[][] d2;
		double d3[][];
		
		int [ ] numbers=new int[ ]{1,2,3};
        System.out.println(Arrays.binarySearch(numbers, 2));
		
		System.out.println(Arrays.toString(a));
//		System.out.println(Arrays.toString(b));
//		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(d));
		System.out.println(Arrays.toString(arr));
		System.out.println(m.length);
		System.out.println(myBinarySearch(arr, 10));
		
		
	}
	
	public static int myBinarySearch(int[] arr, int value) {
		
		int low = 0;
		int high = arr.length - 1;
		
		while(low<=high) {
			int mid = (low+high)/2;
			
			if(value==arr[mid]) {
				return mid;				
			}
			
			if(value>arr[mid]) {
				low = mid+1;
			}
			
			if(value<arr[mid]) {
				high = mid-1;
			}
		}
		return -1;
		
	}

}

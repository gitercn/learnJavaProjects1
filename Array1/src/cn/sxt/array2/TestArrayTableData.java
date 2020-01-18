package cn.sxt.array2;

import java.util.Arrays;

public class TestArrayTableData {
	public static void main(String[] args) {
		Object[] emp1 = {1001, "gao1", 18, "jiangshi", "2006.6.6"};
		Object[] emp2 = {1002, "gao2", 18, "jiangshi", "2006.6.6"};
		Object[] emp3 = {1003, "gao3", 18, "jiangshi", "2006.6.6"};
		
		Object[][] emps = new Object[3][];
		emps[0] = emp1;
		emps[1] = emp2;
		emps[2] = emp3;
		
		for(Object[] temp:emps) {
			System.out.println(Arrays.toString(temp));
		}
	}

}

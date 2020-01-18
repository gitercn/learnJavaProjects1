package cn.sxt.array2;

public class TestArrayCopy {
	public static void main(String[] args) {
		String[] s1 = { "aa", "bb", "cc", "dd", "ee" };
		TestBasicCopy2(s1, 2);

	}

	public static String[] TestBasicCopy2(String[] s, int index) {
		String[] s1 = { "aa", "bb", "cc", "dd", "ee" };
//String[] s2 = new String[10];
		System.arraycopy(s, index, s, index - 1, s.length - index);

		s[s.length-1] = null;
		for (int i = 0; i < s.length; i++) {
			System.out.println(i + " " + s[i]);
		}
		return s;
	}
}
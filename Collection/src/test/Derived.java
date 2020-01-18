package test;

/** * ，控制台打印 */
class Log {
	/* 3.2 */ public static String baseFieldInit() {
		System.out.println("Base Normal Field");
		return "";
	}

	/* 1.2 */ public static String baseStaticFieldInit() {
		System.out.println("Base Static Field");
		return "";
	}

	/* 5.2 */ public static String fieldInit() {
		System.out.println("Normal Field");
		return "";
	}

	/* 2.2 */ public static String staticFieldInit() {
		System.out.println("Static Field");
		return "";
	}
}

/** * ，基类 */
class Base {
	/* 1.1 */ static {
		System.out.println("Base Static Block 1");
	}
	/* 1.2 */ private static String staticValue = Log.baseStaticFieldInit();
	/* 1.3 */ static {
		System.out.println("Base Static Block 2");
	}
	/* 3.1 */ {
		System.out.println("Base Normal Block 1");
	}
	/* 3.2 */ private String value = Log.baseFieldInit();
	/* 3.3 */ {
		System.out.println("Base Normal Block 2");
	}

	/* 4 */ Base() {
		System.out.println("Base Constructor");
	}
}

/** * ，派生类 */
public class Derived extends Base {
	/* 2.1 */ static {
		System.out.println("Static Block 1");
	}
	/* 2.2 */ private static String staticValue = Log.staticFieldInit();
	/* 2.3 */ static {
		System.out.println("Static Block 2");
	}
	/* 5.1 */ {
		System.out.println("Normal Block 1");
	}
	/* 5.2 */ private String value = Log.fieldInit();
	/* 5.3 */ {
		System.out.println("Normal Block 2");
	}

	/* 6 */ Derived() {
		System.out.println("Derived Constructor");
	}

	/** * MAIN 主线程 */
	public static void main(String[] args) {
		Derived d = new Derived();
	}
}
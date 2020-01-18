public class TestGC{

	public static void main(String[] args){
		new TestGC();
		System.out.println("testGC");
		System.gc();
		System.runFinalization();
	
	}

}
package cn.sxt.oop;

public class TestInterface2 {
	
	interface A {
		void testa();
	}
	interface B {
		void testb();
	}
	interface C extends A, B {
		void testc();
	}
	
	public class Test implements C {

		@Override
		public void testa() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void testb() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void testc() {
			// TODO Auto-generated method stub
			
		}
		
	}

}

package test;

class X {
	Y b = new Y();

	X() {
		System.out.print("X");
	}
}

class Y {
	Y() {
		System.out.print("Y");
	}
}

public class Test3 extends X {
	Y y = new Y();

	Test3() {
		// super();
		System.out.print("Z");
	}

	public static void main(String[] args) {
		new Test3();
	}

}

/*
调用顺序
new Test3()调用第20行Test3(){
Test3(){调用第6行X(){
X(){调用Object（可能是创建对象X？）然后调用第4行Y b = new Y();
Y b = new Y();调用ClassLoader（加载类Y？）然后调用第12行Y(){
Y(){调用Object（可能是创建对象Y？）然后调用第13行System.out.print("Y");打印第一个Y
然后执行到14行，
然后回到第4行，
然后执行第7行System.out.print("X");打印一个X
然后执行第8行
然后执行第18行Y y = new Y()；调用调用第12行Y(){（注意这回没有调用ClassLoader，说明上面加载完这次不用加载了？）
Y(){调用Object（可能是创建对象Y？）然后调用第13行System.out.print("Y");打印第二个Y
然后执行第22行
*
*/
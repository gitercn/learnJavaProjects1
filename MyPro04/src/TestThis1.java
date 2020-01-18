public class TestThis1 {
    int a, b, c;
    
    TestThis1(){
    	System.out.println("正在使用构造方法初始化第一个Hello对象");
    }
    TestThis1(int a, int b){
    	//TestThis1();//，无法这样调用构造方法，只能使用this调用
    	this();//调用无参的构造方法，而且必须位于第一行！
    	a = a; //，这里都是值得局部变量而不是成员变量，成员变量就是上面类的属性的变量
    	//，这样就区分了成员变量和局部变量，这种情况占了this使用情况的大多数
    	this.a = a;
    	this.b = b;
    	c = a + b;
    }
    
    TestThis1(int a, int b, int c){
    	this(a,b);
    	this.c = c;
    }
    
    //，普通方法
    void sing() {
    	System.out.println("a="+a);
    	System.out.println("b="+b);
    	System.out.println("c="+c);
    }
    void eat() {
    	this.sing();
    	System.out.println("你妈妈喊你回家吃饭！");
    }
    
    public static void main(String[] args) {
    	TestThis1 hi = new TestThis1(2, 3);
    	hi.eat();
    }

}

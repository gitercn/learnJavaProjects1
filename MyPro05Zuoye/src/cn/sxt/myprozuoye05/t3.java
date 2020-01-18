package cn.sxt.myprozuoye05;
class Base {
    public void method(){
        System.out.print ("Base method");
    }
}
class Child extends t1{   
    public void methodB(){
        System.out.print ("Child methodB");
    }
}
public class t3 {
    public static void main(String[] args) {
        t1 base= new Child();
//        base.methodB();
        Child cbase = (Child) base;
        cbase.methodB();
    }
}
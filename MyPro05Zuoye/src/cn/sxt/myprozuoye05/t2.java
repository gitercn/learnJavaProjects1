package cn.sxt.myprozuoye05;
class Person {   
    public Person() {
        System.out.println("execute Person()");
    }
}
class Student extends Person { 
    public Student() {       
        System.out.println("execute Student() ");
    }  
}
class PostGraduate extends Student {   
    public PostGraduate() {  
        System.out.println("execute PostGraduate()");
    }  
}
public class t2 {
    public static void main(String[] args) {
        new PostGraduate();       
    }
}
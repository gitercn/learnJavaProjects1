public class Test {
    int count=9;
    public void count1(){
        this.count=10;
        System.out.print("count1="+count);
    }
    public void count2(){
        System.out.print("count2="+count);
    }
    public static void main(String[ ] args) {
        Test t=new Test();
        t.count1();
        t.count2();
        
        Test t2 = new Test();
        t2.count2();
    }
}

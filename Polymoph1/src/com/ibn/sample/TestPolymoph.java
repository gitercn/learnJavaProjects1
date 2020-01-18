package com.ibn.sample;

class Animal {
    /**
     * 声明一个私有的成员变量name。
     */
    private String name;

    /**
     * 在Animal类自定义的构造方法
     * 
     * @param name
     */
    Animal(String name) {
        this.name = name;
    }

    /**
     * 在Animal类里面自定义一个方法makeNoises
     */
    public void makeNoises() {
        System.out.println("动物的叫声……");
    }
}




/**
 * 子类Cat从父类Animal继承下来，Cat类拥有了Animal类所有的属性和方法。
 */
class Cat extends Animal {
    /**
     * 在子类Cat里面定义自己的私有成员变量
     */
    private String eyesColor;

    /**
     * 在子类Cat里面定义Cat类的构造方法
     * 
     * @param name
     * @param color
     */
    Cat(String name, String color) {
        /**
         * 在构造方法的实现里面首先使用super调用父类Animal的构造方法Animal(String name)。 
         * 把子类对象里面的父类对象先造出来。
         */
        super(name);
        eyesColor = color;
    }




    /**
     * 子类Cat对从父类Animal继承下来的makeNoises方法不满意，在这里重写了makeNoises方法。
     */
    @Override
    public void makeNoises() {
        System.out.println("我养的猫叫了一声……meow");
    }

    // overloading
    public void makeNoises(String voice) {
        System.out.println("我养的猫叫了一声……" + voice);
    }
}














/**
 * 子类Dog从父类Animal继承下来，Dog类拥有了Animal类所有的属性和方法。
 */
class Dog extends Animal {
    /**
     * 在子类Dog里面定义自己的私有成员变量
     */
    private String furColor;

    /**
     * 在子类Dog里面定义Dog类的构造方法
     * 
     * @param name
     * @param color
     */
    Dog(String name, String color) {
        /**
         * 在构造方法的实现里面首先使用super调用父类Animal的构造方法Animal(String name)。 
         * 把子类对象里面的父类对象先造出来。
         */
        super(name);
        furColor = color;
    }

    /**
     * 子类Dog对从父类Animal继承下来的makeNoises方法不满意，在这里重写了makeNoises方法。
     */
    public void makeNoises() {
        System.out.println("我养的狗叫了一声……woof");
    }
}









/**
 * 子类Frog从父类Animal继承下来，Frog类拥有Animal类所有的属性和方法
 */
class Frog extends Animal {
    /**
     * 在子类Frog里面定义Frog类的构造方法
     */
    Frog() {
        /**
         * 在构造方法的实现里面首先使用super调用父类Animal的构造方法Animal(String name)。 
         * 把子类对象里面的父类对象先造出来。
         */
        super("Frog");
    }

    /**
     * 子类Frog对从父类Animal继承下来的makeNoises方法不满意，在这里重写了makeNoises方法。
     */
    public void makeNoises() {
        System.out.println("我养的青蛙叫了一声……croak");
    }
}




/**
 * 定义一个类(人)
 */
class NoOne {
    /**
     * 定义NoOne类的私有成员变量name和pet
     */
    private String name;
    private Animal pet;

    /**
     * 在NoOne类里面定义自己的构造方法NoOne()， 这个构造方法有两个参数， 
     * 分别为String类型的name和Animal类型的pet， 
     * 这里的第二个参数设置成Animal类型可以给我们的程序带来最大的灵活性。
     * 
     * 因为作为养宠物来说，可以养猫，养狗，养鸟，只要是你喜欢的都可以养， 
     * 因此把它设置为父类对象的引用最为灵活。
     * 
     * 因为这个Animal类型的参数是父类对象的引用类型，
     * 因此当我们传参数的时候， 
     * 可以把这个父类的子类对象传过去，即传Dog、Cat和Frog等都可以。
     * 
     * @param name
     * @param pet
     */
    NoOne(String name, Animal pet) {
        this.name = name;
        this.pet = pet;
    }

    /**
     * 在NoOne类里面自定义一个方法myPetmakeNoises() 方法,
     * 让NoOne对象养的宠物自己调用自己的makeNoises()方法发出自己的叫声。
     */
    public void myPetmakeNoises() {
        pet.makeNoises();
    }
}




public class TestPolymoph {
    public static void main(String args[]) {
        /**
         * 在堆内存里面new了一只蓝猫对象出来，这个蓝猫对象里面包含有一个父类对象Animal。
         */
        Cat c = new Cat("Catname", "blue");
        
        /**
         * 在堆内存里面new了一只黑狗对象出来，这个黑狗对象里面包含有一个父类对象Animal。
         */
        Dog d = new Dog("Dogname", "black");
        /**
         * 在堆内存里面new了一只小鸟对象出来，这个小鸟对象里面包含有一个父类对象Animal。
         */
        Frog f = new Frog();

        /**
         * 在堆内存里面new出来3个人，名字分别是l1，l2，l3。 
         * l1养了一只宠物是c(Cat)，l2养了一只宠物是d(Dog)，l3养了一只宠物是f(Frog)。
         * 注意：调用NoOne类的构造方法时，传递过来的c，d，b是当成Animal来传递的， 
         * 因此使用c，d，f这三个引用对象只能访问父类Animal里面的makeNoises()方法。
         */
        NoOne l1 = new NoOne("l1", c);
        NoOne l2 = new NoOne("l2", d);
        NoOne l3 = new NoOne("l3", f);
        /**
         * 这三个人都调用myPetmakeNoises()方法使自己养的宠物叫起来。
         */
        l1.myPetmakeNoises();
        l2.myPetmakeNoises();
        l3.myPetmakeNoises();
    }
}

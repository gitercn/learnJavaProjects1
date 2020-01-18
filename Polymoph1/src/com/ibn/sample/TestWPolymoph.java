package com.ibn.sample;

// Class Potion Definition
class Potion {

    void effect() {
        System.out.println("!!!!!----- potion used -----!!!!!");
    }
}

// Class RedPotion Definition
class RedPotion2 extends Potion {//，要有继承

    int size;

    RedPotion2(int num) {
        this.size = num;
    }

    void effect() {
        System.out.println("!!!!! HP " + this.size + " added !!!!!");//，要有重写
    }
}

// Class BluePotion Definition
class BluePotion2 extends Potion {

    int size;

    BluePotion2(int num) {
        this.size = num;
    }

    void effect() {
        System.out.println("----- MP " + this.size + " added -----");
    }
}

// Class TestNoPolymoph Definition
public class TestWPolymoph {
    public String name;
    protected float hp;

//    public void useLifePotion(RedPotion lp) {
//        lp.effect();
//    }
//
//    public void useMagicPotion(BluePotion mp) {
//        mp.effect();
//    }

    public void usePotion(Potion p) { //，父类引用指向子类对象
        p.effect();
    }

    public static void main(String[] args) {

        TestWPolymoph hero = new TestWPolymoph();
        hero.name = "teemooooo";

        RedPotion2 rp = new RedPotion2(100);
        BluePotion2 bp = new BluePotion2(200);

        // hero.useLifePotion(rp);
        // hero.useMagicPotion(bp);
        hero.usePotion(rp);
        hero.usePotion(bp);

    }
}

package com.ibn.sample;

// Class RedPotion Definition
class RedPotion {

    int size;

    RedPotion(int num) {
        this.size = num;
    }

    void effect() {
        System.out.println("!!!!! HP " + this.size + " added !!!!!");
    }
}

//Class BluePotion Definition
class BluePotion {

    int size;

    BluePotion(int num) {
        this.size = num;
    }

    void effect() {
        System.out.println("----- MP " + this.size + " added -----");
    }
}

//Class TestNoPolymoph Definition
public class TestNoPolymoph {
    public String name;
    protected float hp;

    public void useLifePotion(RedPotion lp) {
        lp.effect();
    }

    public void useMagicPotion(BluePotion mp) {
        mp.effect();
    }

    public static void main(String[] args) {

        TestNoPolymoph hero = new TestNoPolymoph();
        hero.name = "teemooooo";

        RedPotion rp = new RedPotion(100);
        BluePotion bp = new BluePotion(200);

        hero.useLifePotion(rp);
        hero.useMagicPotion(bp);

        // ，如果再吃个加速逃跑的药呢？

    }
}

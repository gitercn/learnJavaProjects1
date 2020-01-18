package com.Lorenzo.test;

import com.Lorenzo.animal.Cats;
import com.Lorenzo.animal.Dogs;
import com.Silvia.box.Box;
import com.Silvia.box.Children;
import com.Silvia.box.JewelBox;

public class test {
	public static void main(String[] args) {
		Cats one = new Cats();
		one.setName("Lele");
		one.setSpecies("Cheshire cat");
		one.eat();
		one.run();
		System.out.println("-----------------");
		Dogs two = new Dogs();
		two.setName("Keke");
		two.setAge(1);
		two.eat();
		two.sleep();
		
		System.out.println("------------------");
		Box box = new Box();
		box.open();
		JewelBox jbox = new JewelBox();
		jbox.look();
		System.out.println("-----------------");
		Children jbox1 = new Children();
		jbox1.getName();
		
	}

}

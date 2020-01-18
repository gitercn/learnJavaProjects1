package com.ti1;

public class Person {
	private String name;
	private int age;
	
	public Person(String nameForCall, int ageForCall) {
		name = nameForCall;
		age = ageForCall;
	}
	
	void display(){
		System.out.println("name="+name+"age="+age);
	}
	
	public static void main(String[] args) {
		Person person1 = new Person("person111", 18);
		person1.display();
	}

}

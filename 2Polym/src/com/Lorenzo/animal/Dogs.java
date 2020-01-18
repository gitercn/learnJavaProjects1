package com.Lorenzo.animal;

public class Dogs extends animal {
	private String sex;
	public Dogs() {
		
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public void sleep() {
		System.out.println(this.getName()+" is "+this.getAge()+" year old this which is sleeping now.");
	}

}

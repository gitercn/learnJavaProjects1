package com.Lorenzo.animal;

public class Cats extends animal {
	private double weight;
	public Cats() {
		
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void run() {
		System.out.println(this.getName()+" is a "+this.getSpecies()+" which is running happily. ");
	}

}

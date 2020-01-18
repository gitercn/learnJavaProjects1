package cn.sxt.testinstrument;

public class Instrument {
	public void makeSound(){
		System.out.println("makeSound");
	}
}

class Erhu extends Instrument{
	public void makeSound(){
		System.out.println("makeSoundErhu");
	}
}

class Piano extends Instrument{
	public void makeSound(){
		System.out.println("makeSoundPiano");
	}
}

class Violin extends Instrument{
	public void makeSound(){
		System.out.println("makeSoundViolin");
	}
}
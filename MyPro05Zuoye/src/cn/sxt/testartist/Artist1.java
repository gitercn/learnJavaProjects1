package cn.sxt.testartist;

public class Artist1 implements Interface1, Interface2, Interface3{
	
	private String name;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Artist1(String name) {
		super();
		this.name = name;
	}

	@Override
	public void Sing() {
		System.out.println("Sing");
		
	}

	@Override
	public void TV() {
		System.out.println("TV");
		
	}

	@Override
	public void Film() {
		System.out.println("Film");
		
	}
	
	public void showName() {
		System.out.println(name);
	}

}

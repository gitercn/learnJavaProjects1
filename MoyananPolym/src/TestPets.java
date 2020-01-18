
public class TestPets {
	public static void main(String[] args) {
		PetStore pt1 = new PetStore();
		pt1.getPet("Cat").hello();
		pt1.getPet("Dog").hello();
		pt1.getPet("hahaha");
	}

}

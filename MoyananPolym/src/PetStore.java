public class PetStore {
	 public  Pet getPet(String name){
		if (name.equals("Cat")){
			return new Cat();
		}else if (name.equals("Dog")){
			return new Dog();
		}else {
			System.out.print("缺货");
			return null;
		}
	}  
}

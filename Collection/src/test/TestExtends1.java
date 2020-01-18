package test;
class Vehicle {
    String type = "4w";
    int maxSpeeed = 100;

    Vehicle() {
    }

    Vehicle(String type, int maxSpeed) {
        this.type = type;
        this.maxSpeeed = maxSpeed;
    }
}

class Car extends Vehicle {
    String trans = "";

    Car() {
    }

    Car(String trans) { // n1
        this.trans = trans;
    }

    Car(String type, int maxSpeed, String trans) {
        super(type, maxSpeed); // n2
        this.trans = trans; 
    }

    @Override
    public String toString() {
        return "Car [type=" + type + ", maxSpeeed=" + maxSpeeed + ", trans=" + trans + " ]";
    }
}


public class TestExtends1{
	public static void main (String[] args) {
		Car c1 = new Car("Audi");
		Car c2 = new Car("4w", 150, "Honda");
		System.out.println(c1);
		System.out.println(c2);
		
        StringBuilder sbi = new StringBuilder(5);
        String str = "";
        System.out.println(sbi.getClass());
        System.out.println(str.getClass());
        
        if (sbi.equals(str)) {
            System.out.println("Match1");
        } else if (sbi.toString().equals(str.toString())) {
            System.out.println("Match2");
        } else {
            System.out.println("No Match");
        }

	}
}


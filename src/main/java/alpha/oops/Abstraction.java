package alpha.oops;

public class Abstraction {
	public static void main(String[] args) {
		Animals a = new Animals() {
			@Override
			void walk() {
				System.out.println("Walks ");
			}
		};
		a.walk();
		Animals b = new Hen();
		b.walk();
		Mustang c = new Mustang();
		c.walk();
		c.eat();
		
//		c.walk();

	}
}

abstract class Animals {
	String color;

	public Animals() {
		System.out.println("Animal Constructor called");
		this.color = "brown";
	}

	void eat() {
		System.out.println("Eats");
	}

	abstract void walk();
}

class Hen extends Animals {

	Hen() {
		System.out.println("Hen Constructor called");
	}

	void changeColor() {
		this.color = "Yellow";
	}
	
	void eat() {
		System.out.println(" Hen Eats");
	}

	@Override
	void walk() {
		System.out.println("Walks with 2 legs");
	}

}

class Horse extends Animals {
	Horse() {
		System.out.println("Horse Constructor called");
	}

	void changeColor() {
		this.color = "White";
	}

	@Override
	void walk() {
		System.out.println("Walks with 4 legs");
	}

}

class Mustang extends Horse {
	Mustang() {
		System.out.println("Mustang Constructor called");
	}
	@Override
	void walk() {
		System.out.println("Walks with 5 legs");
	}
}

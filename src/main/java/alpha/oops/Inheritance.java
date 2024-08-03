package alpha.oops;

public class Inheritance {

//	public static void main(String[] args) {
//		Animal f1 = new Fish();
//		f1.eat();
//		f1.walk();
//		Fish f2 = new Fish();
//		f2.walk();
//	}

	public static void main(String[] args) {
		Dog f1 = new Dog();
		f1.eat();
		f1.walk();

	}

}

class Animal {

	void eat() {
		System.out.println("Eats");
	}

	void walk() {
		System.out.println("Walks");
	}
}

class Fish extends Animal {

	void swim() {
		System.out.println("Swims");
	}

	void eat() {
		System.out.println(" Fish Eats");
	}
}

class Mammal extends Animal {

}

class Dog extends Mammal {

}

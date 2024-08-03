package alpha.oops;

public class Interfaces {

	public static void main(String[] args) {
//		ChessKey q = new Queen();
//		q.move();

//		Carnivore b = new Bear();
//		b.eatGrass();
//		B b = new B();
	}

}


//Java program to illustrate Constructor Chaining to
//other class using super() keyword
class Base
{
	String name;

	// constructor 1
	Base()
	{
		this("");
		System.out.println("No-argument constructor of" +
										" base class");
	}

	// constructor 2
	Base(String name)
	{
		this.name = name;
		System.out.println("Calling parameterized constructor"
											+ " of base");
	}
}

class Derived extends Base
{
	// constructor 3
	Derived()
	{
		System.out.println("No-argument constructor " +
						"of derived");
	}

	// parameterized constructor 4
	Derived(String name)
	{
		// invokes base class constructor 2
		super(name);
		System.out.println("Calling parameterized " +
						"constructor of derived");
	}

	public static void main(String args[])
	{
		// calls parameterized constructor 4
		Derived obj = new Derived("test");

		// Calls No-argument constructor
		// Derived obj = new Derived();
	}
}




class A {
	A() {
		System.out.println("A- Constructor");
	}
}

class B extends A{
	B() {
		System.out.println("B- Constructor");
	}
}

class Bear implements Herbivore, Carnivore {

	@Override
	public void eatMeat() {
		System.out.println("Eat Meat");
	}

	@Override
	public void eatGrass() {
		System.out.println("Eat Grass");

	}

}

interface Herbivore {
	void eatGrass();
}

interface Carnivore {
	void eatMeat();

	void eatGrass();
}

interface ChessKey {
	void move();
}

class Queen implements ChessKey {
	@Override
	public void move() {
		System.out.println("Up, Down, Diagonal");
	}
}

class Rook implements ChessKey {
	@Override
	public void move() {
		System.out.println("Up, Down");
	}
}

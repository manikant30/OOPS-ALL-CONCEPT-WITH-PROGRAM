package ABSTRACTION;

// Abstract class → cannot create object, contains incomplete (abstract) methods
abstract class Birds
{
	abstract void eat();   // abstract method → no body
	abstract void fly();   // abstract method → must be overridden
}

// Eagle is still abstract because eat() is not implemented here
abstract class Eagle extends Birds
{
	@Override
	void fly()   // common fly() for all eagle types
	{
		System.out.println("Eagle is flying over the clouds..");
	}
}

// Concrete class → must override all abstract methods
class SerpentEagle extends Eagle
{
	@Override
	void eat()
	{
		System.out.println("SerpentEagle is eating serpent!!!");
	}
}

class GoldenEagle extends Eagle
{
	@Override
	void eat()
	{
		System.out.println("GoldenEagle is eating Goldenfish");
	}
}

public class Demo02 {
	public static void main(String[] args)
	{
		// Upcasting → parent reference, child object
		Birds eagle = new SerpentEagle();
		eagle.fly();   // from Eagle class
		eagle.eat();   // from SerpentEagle class
		
		Birds eagle2 = new GoldenEagle();
		eagle2.fly();  // from Eagle class
		eagle2.eat();  // from GoldenEagle class (fixed)
	}
}

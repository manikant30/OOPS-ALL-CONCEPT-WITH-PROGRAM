package INHERITANCE;

//inheritance assignment HW 


class Animal
{
	void Breath()
	{
		System.out.println("Animal takes Breath");
	}
	
	void Eat()
	{
		System.out.println("Animal eat foods");
	}
	
	void Sleep()
	{
		System.out.println("Animal sleep");
	}
}

class Deerr11 extends Animal
{
	@Override
	void Eat()
	{
		System.out.println("Deer eats leaf");
	}
	
	@Override
	void Sleep()
	{
		System.out.println("Deer sleep in forest");
	}
	
	//specilized
	void RunFast()
	{
		System.out.println("Deer run fast");
	}
	
	//specilized
	void LiveInForest()
	{
		System.out.println("Deer live in forest");
	}
}


class Lionn22 extends Animal
{
	@Override
	void Breath()
	{
		System.out.println("Lion Breath");
	}
	
	@Override
	void Eat()
	{
		System.out.println("Lion eats Meats");
	}
	
	//specilized
	void RunFast()
	{
		System.out.println("Lion run fast");
	}
	
}

class Monkeyy33 extends Animal
{
	@Override
	void Breath()
	{
	    System.out.println("Monkey breath ");	
	}
	@Override
	void Eat()
	{
		System.out.println("Monkey eats Banana");
	}
	
	@Override
	void Sleep()
	{
		System.out.println("Monkey sleep in forest");
	}
	
	//specilized
	void RunFast()
	{
		System.out.println("Monkey run fast");
	}
	
	//specilized
	void LiveInForest()
	{
		System.out.println("Monkey live in forest");
	}
}

public class Demo17 {
	public static void main(String[] args)
	{
		Deerr11 d=new Deerr11();
		d.Breath();
		d.Eat();
		d.Sleep();
		d.RunFast();
		d.LiveInForest();
		System.out.println("--------------------------------------");
		
		Lionn22 l=new Lionn22();
		l.Breath();
		l.Eat();
		l.Sleep();
		l.RunFast();
		System.out.println("--------------------------------------");
		
		Monkeyy33 m=new Monkeyy33();
		m.Breath();
		m.Eat();
		m.Sleep();
		m.RunFast();
		m.LiveInForest();
		
	}

}

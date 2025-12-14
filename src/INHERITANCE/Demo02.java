package INHERITANCE;

//1. SINGLE-LEVEL INHERITANCE


class Parent90
{

	float height=5.8f;

	void readBooks()
	{
		System.out.println("I love reading books");
	}
	
}

class Child90 extends Parent90
{ 

	
	
}

public class Demo02 {
	public static void main(String[] args)
	{
		Child90 c=new Child90();
		
		System.out.println(c.height);
		c.readBooks();
	}

}

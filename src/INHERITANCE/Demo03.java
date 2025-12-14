package INHERITANCE;

//2. MULTI-LEVEL INHERITANCE


class GrandParent01
{
	float height=5.8f;

	void readBooks()
	{
		System.out.println("I love reading books");
	}
	
}


class Parent68 extends GrandParent01
{
	
	
}


class Child19 extends Parent68
{ 

	
	
}

public class Demo03 {
	public static void main(String[] args)
	{
		Child19 c=new Child19();
		System.out.println(c.height);
		c.readBooks();
	}

}

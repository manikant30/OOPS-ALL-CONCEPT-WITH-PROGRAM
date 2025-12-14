package INHERITANCE;

//3.HIERARCHY

//one parent many child

class parent21
{
	float height=5.4f;
	
	public void readBooks()
	{
		System.out.println("I love reading books");
	}
}

class child10 extends parent21
{
	
}

class child20 extends parent21
{
	
}

class child30 extends parent21
{
	
}

public class Demo04 {
	public static void main(String[] args)
	{
		child10 c1=new child10();
		System.out.println(c1.height);
		c1.readBooks();
		
		child20 c2=new child20();
		System.out.println(c2.height);
		c2.readBooks();
		
		child30 c3=new child30();
		System.out.println(c3.height);
		c3.readBooks();
	}

}

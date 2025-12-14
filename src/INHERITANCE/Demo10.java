package INHERITANCE;

//CONSTUCTOR NEVER EVER INHERITATE WITH ONE CLASS TO ANOTHER CLASS

class papa
{
	papa()
	{
		System.out.println("Inside parent const...");
	}
}

class Child9 extends papa
{
	Child9()
	{
		System.out.println("Inside child const..");
	}
}

public class Demo10 {
	public static void main(String[] args)
	{
		
	}

}

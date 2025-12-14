package STATICS;

class Alpha
{
	static int a=10;

	static void method()
	{
		System.out.println("Static method");	
	}
}



public class Demo3 {
	public static void main(String[] args)
	{
		//System.out.println(Alpha.a);
		Alpha.method();
	}

}

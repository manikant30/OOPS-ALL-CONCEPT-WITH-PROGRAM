package INHERITANCE;

//constructor chaining and local chaining both are in same program.

//super() = one class constructor to another class constructor call with the help of super().


//class Object
//{
//	13 method
//}

class test8 //extends Object
{
	int x,y;
	test8()
	{
		x=100;
		y=200;
	}
	
	test8(int x,int y)
	{
		this();
		this.x=x;
		this.y=y;
	}
}

class test7 extends test8
{
	int a,b;
	test7()
	{
		super(8,88);
		a=300;
		b=400;
	}
	
	test7(int a, int b)
	{
		this();
		this.a=a;
		this.b=b;
	}
	
	void disp()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(a);
		System.out.println(b);
	}
}

public class Demo15 {
	public static void main(String[] args)
	{
		test7 t=new test7(9,99);
		t.disp();
	}

}

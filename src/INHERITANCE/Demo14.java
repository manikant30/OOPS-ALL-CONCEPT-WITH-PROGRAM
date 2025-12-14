package INHERITANCE;

//constructor chaining and local chaining both are in same program.

//super() = one class constructor to another class constructor call with the help of super().


//class Object
//{
//	13 method
//}

class test4 //extends Object
{
	int x,y;
	test4()
	{
		//super() ,given by JVM
		x=100;
		y=200;
	}
	
	test4(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
}

class test5 extends test4
{
	int a,b;
	test5()
	{
		this(9,99);
		a=300;
		b=400;
	}
	
	test5(int a, int b)
	{
		//super() given by the JVM
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

public class Demo14 {
	public static void main(String[] args)
	{
		test5 t=new test5();
		t.disp();
	}

}

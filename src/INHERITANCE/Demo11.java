package INHERITANCE;

//constructor chaining

//super() = one class constructor to another class constructor call with the help of super().


//class Object
//{
//	13 method
//}

class Test //extends Object
{
	int x,y;
	Test()
	{
	  //super() ,given by JVM
		x=100;
		y=200;
	}
	
	Test(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
}

class Test99 extends Test
{
	int a,b;
	Test99()
	{
	  //super() ,JVM give the super.when you not give the super().
		a=300;
		b=400;
	}
	
	Test99(int a, int b)
	{
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

public class Demo11 {
	public static void main(String[] args)
	{
		Test99 t=new Test99();
		t.disp();
	}

}

package INHERITANCE;

//constructor chaining

//super() = one class constructor to another class constructor call with the help of super().


//class Object
//{
//	13 method
//}

class Test02 //extends Object
{
	int x,y;
	Test02()
	{
	  //super() ,given by JVM
		x=100;
		y=200;
	}
	
	Test02(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
}

class test31 extends Test02
{
	int a,b;
	test31()
	{
		a=300;
		b=400;
	}
	
	test31(int a, int b)
	{
		//super() ,JVM give the super.when you not give the super().
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

public class Demo12 {
	public static void main(String[] args)
	{
		test31 t=new test31(9,99);
		t.disp();
	}

}

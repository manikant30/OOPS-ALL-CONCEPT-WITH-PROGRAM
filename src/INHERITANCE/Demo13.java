package INHERITANCE;

//constructor chaining

//super() = one class constructor to another class constructor call with the help of super().


//class Object
//{
//	13 method
//}

class ttest02 //extends Object
{
	int x,y;
	ttest02()
	{
		x=100;
		y=200;
	}
	
	ttest02(int x,int y)
	{
		//super() ,given by JVM
		this.x=x;
		this.y=y;
	}
}

class testt39 extends ttest02
{
	int a,b;
	testt39()
	{
		a=300;
		b=400;
	}
	
	testt39(int a, int b)
	{
		super(a,b); //super given by programmer
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

public class Demo13 {
	public static void main(String[] args)
	{
		testt39 t=new testt39(9,99);
		t.disp();
	}

}

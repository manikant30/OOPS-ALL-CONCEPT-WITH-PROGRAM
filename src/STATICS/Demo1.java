package STATICS;

class Test
{
	static int a,b;    //static variable   
	
	static   //static block  
	{
		System.out.println("Inside static block");
        a=10;
        b=20;
	}
	
	static void fun1()  //static method    
	{
		System.out.println("Inside static method");
	}
	
	int x,y;  //Instance block    
	
	{
		System.out.println("Inside instance block");
	}
	
	void fun2()   //Instance method   
	{
		System.out.println("Inside instance method");
	}
	
	Test()   //constructor  
	{
		System.out.println("Inside Constructor");
		x=30;
		y=40;		
	}
}



public class Demo1 {

	public static void main(String[] args)   
	{
		Test.fun1();    //fun1 is a static method , static method  directly execute with the help of class name . static method.  -> Test.fun1();   
        Test t = new Test();
	    t.fun2();
	    
	}
}

package STATICS;
import java.util.Scanner;

class BusinessMan
{
	float si;
	float p;
	float t;
	static float r;
	
	static
	{
		r=15.2f;
	}
	
	void acceptInput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the principal amount");
		p= scan.nextFloat();
		System.out.println("Enter the time period");
		t= scan.nextFloat();			
	}
	
	void calcIntrest()
	{
		si=(p*t*r)/100;
	}
	
	void disp()
	{
		System.out.println(si);
	}
}




public class Demo2 {
	
	public static void main(String [] args)
	{
		BusinessMan b1= new BusinessMan();
		b1.acceptInput();
		b1.calcIntrest();
		b1.disp();
		
		
		BusinessMan b2= new BusinessMan();
		b2.acceptInput();
		b2.calcIntrest();
		b2.disp();
		
		
		BusinessMan b3= new BusinessMan();
		b3.acceptInput();
		b3.calcIntrest();
		b3.disp();
	}

}

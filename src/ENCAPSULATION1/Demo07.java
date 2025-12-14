package ENCAPSULATION1;
//CONSTRUCTORS

//Definition = constructor is a specialized setter whose name is same of class name who don't have any return type.


//2.Zero parameterized constructor
class Customer2
{
	private int cId;
	private String cName;
	private int cNum;
	
	Customer2() 
	{
		
		
		
	}
	
	public int getcId() 
	{
		return cId;
	}
	
	public String getcName() 
	{
		return cName;
	}

	public int getcNum() 
	{
		return cNum;
	}
	
}

public class Demo07 {
	public static void main(String[] args)
	{
		 Customer2 c=new Customer2();//constructor calling during object creation.
		 
		 System.out.println(c.getcId());   //default output
		 System.out.println(c.getcName());
		 System.out.println(c.getcNum());
	}

}

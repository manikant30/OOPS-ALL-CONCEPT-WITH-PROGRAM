package ENCAPSULATION1;
//CONSTRUCTORS

//Definition = constructor is a specialized setter whose name is same of class name who don't have any return type.


//3.Default constructor created by java complier.
class Customer3
{
	private int cId;
	private String cName;
	private int cNum;
	

    //default constructor=java complier do give default constructor when programmer can't create any constructor in class.
	
	
	
	
	
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

public class Demo08 {
	public static void main(String[] args)
	{
		 Customer3 c=new Customer3();//constructor calling during object creation.
		 
		 System.out.println(c.getcId());  //default output 
		 System.out.println(c.getcName());
		 System.out.println(c.getcNum());
	}

}

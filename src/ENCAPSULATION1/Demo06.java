package ENCAPSULATION1;
//CONSTRUCTORS

//Definition = constructor is a specialized setter whose name is same of class name who don't have any return type.

//1.parameterized constructor.

class Customer11
{
	private int cId;
	private String cName;
	private int cNum;
	
	Customer11(int cId,String cName,int cNum) 
	{
		this.cId = cId;
		this.cName=cName;
		this.cNum=cNum;
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

public class Demo06 {
	public static void main(String[] args)
	{
		 Customer11 c=new Customer11(1,"Aman",735213);//constructor calling during object creation.
		 
		 System.out.println(c.getcId());   
		 System.out.println(c.getcName());
		 System.out.println(c.getcNum());
	}

}

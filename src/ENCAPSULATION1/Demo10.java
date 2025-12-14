package ENCAPSULATION1;

//CONSTRUCTOR LOCAL CHAINING USING this();


//Definition = calling to one constructor to another constructor within the same class.


class Customer5
{
	private int cId;
	private String cName;
	private int cNum;
	
    public Customer5()
    {	
    	cId=1;
    	cName="Manikant";
    	cNum=9304989;
    	
    }
    
    public Customer5(int cId,String cName,int cNum)
    {	
    	this();//local chaining can be achieve using this() method.
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

public class Demo10 {
	public static void main(String[] args)
	{
		 
		 Customer5 c1=new Customer5(2,"Aman",735213);//constructor calling during object creation.
		 System.out.println(c1.getcId());  
		 System.out.println(c1.getcName());
		 System.out.println(c1.getcNum());
	}

}

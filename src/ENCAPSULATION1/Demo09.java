package ENCAPSULATION1;

//CONSTRUCTORS OVERLOADING

//Definition = creating multiple constructor within the same class is known as constructor overloading.



class Customer4
{
	private int cId;
	private String cName;
	private int cNum;
	
    public Customer4()
    {
    	cId=1;
    	cName="Manikant";
    	cNum=9304985;
    }
    
    public Customer4(int cId,String cName,int cNum)
    {
    	this.cId=cId;
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

public class Demo09 {
	public static void main(String[] args)
	{
		 Customer4 c=new Customer4();//constructor calling during object creation.
		 System.out.println(c.getcId());  
		 System.out.println(c.getcName());
		 System.out.println(c.getcNum());
		 
		 Customer4 c1=new Customer4(2,"Aman",735213);//constructor calling during object creation.
		 System.out.println(c1.getcId());  
		 System.out.println(c1.getcName());
		 System.out.println(c1.getcNum());
	}

}

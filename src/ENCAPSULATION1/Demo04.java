package ENCAPSULATION1;

//shadowing problem happen

//definition =shadowing problem means in setter of java both members behave like a local variable.

class Customer
{
	private int cId;
	private String cName;
	private int cNum;
	
	public void setData(int cId, String cName, int cNum)//in parameter are local variable.
	{
		cId=cId;  //shadowing problem JVM confuse which is instance variable and local variable because both instance variable and local variable name is same.
		cName=cName;
		cNum=cNum; //left side is instance variable and Right side is local variable.
	}
	
	public int getcid()
	{
		return cId;
	}
	
	public String getcname()
	{
		return cName;
	}
	
	public int getcNum()
	{
		return cNum;
	}
}


public class Demo04 {
	public static void main(String[] args)
	{
		Customer cu=new Customer();
		cu.setData(01, "Manikant", 93049);
		System.out.println(cu.getcid());   //output is by default of integer,string,integer because of shadowing problem
		System.out.println(cu.getcname());
		System.out.println(cu.getcNum());
	}

}

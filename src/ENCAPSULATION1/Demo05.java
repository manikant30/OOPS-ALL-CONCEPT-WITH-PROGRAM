package ENCAPSULATION1;

//shadowing problem solution

//this keyword to use and overcome from the shadowing problem.

class Customer1
{
	private int cId;
	private String cName;
	private int cNum;
	
	//in encapsulation we have to use only one setter and multiple getter.
	public void setData(int cId, String cName, int cNum)//in parameter are local variable.
	{
		this.cId=cId;  //shadowing problem JVM confuse which is instance variable and local variable because both instance variable and local variable name is same.
		this.cName=cName;
		this.cNum=cNum; //left side is instance variable and Right side is local variable.
	                    //we use to this to JVM not confuse for instance variable.
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


public class Demo05 {
	public static void main(String[] args)
	{
		Customer1 cu=new Customer1();
		cu.setData(01, "Manikant", 93049);
		System.out.println(cu.getcId());   
		System.out.println(cu.getcName());
		System.out.println(cu.getcNum());
	}

}

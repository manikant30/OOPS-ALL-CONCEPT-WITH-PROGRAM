package ENCAPSULATION1;

//definition = every object in this world is having a important part and to the important part we give the security so direct access is prevented and control access is given help of setter and getters. 

//Achieve ENCAPSULATION using member private and set , get method use.

class BankAccount2
{
	private int bal = 10000;  // Add private to instance variable because no one can access directly.
	private int atmpin = 12345;
	
	public void setBalance(int x) //set is a method to set the value through parameter.
	{
		if(x>0)
		{
		    bal=x;
		}
		else
		{
			System.out.println("INVALID VALUE");
		}
	}
	
	public void setAtmpin(int y)
	{
		atmpin=y;
	}
	
	public int getBalance()  // getter and setter method name is same.
	{
		return bal;
	}
	
	public int getAtmpin()
	{
		return atmpin;
	}
	
}


public class Demo03 {
	public static void main(String[] args)
	{
		BankAccount2 ba=new BankAccount2();
		ba.setBalance(-100000); // add the value 
		ba.setAtmpin(54321);
		System.out.println("UPDATED BALANCE " + ba.getBalance()); //updated value get it.
		System.out.println("NEW ATM PIN UPDATED "+ba.getAtmpin());
		
	}

}

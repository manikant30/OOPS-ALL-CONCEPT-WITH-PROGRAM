package ENCAPSULATION1;

class BankAccount1
{
	private int bal = 10000;  // Add private to instance variable because no one can access directly.
	private int atmpin = 12345;
	
	public void setBalance(int x) //set is a method to set the value through parameter.
	{	
		bal=x;
	}
	
	public void setAtmpin(int y)
	{
		atmpin=y;
	}
	
	public int getBalance()  // get is a method to get the updated value with the help of zero parameter
	{
		return bal;
	}
	
	public int getAtmpin()
	{
		return atmpin;
	}
	
}


public class Demo02 {
	public static void main(String[] args)
	{
		BankAccount1 ba=new BankAccount1();
		ba.setBalance(-100000); // when u add the value negative value then output come invalid input. 
		ba.setAtmpin(54321);
		System.out.println("UPDATED BALANCE " + ba.getBalance()); //updated value get it.
		System.out.println("NEW ATM PIN UPDATED "+ba.getAtmpin());
		
	}

}

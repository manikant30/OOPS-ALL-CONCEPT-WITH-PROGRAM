package ENCAPSULATION1;

class BankAccount
{
	long accNo = 9304989510L;
	int bal = 10000;
	int atmpin = 12345;
}


public class Demo01 {
	public static void main(String[] args)
	{
		BankAccount ba=new BankAccount();
		System.out.println(ba.accNo);
		System.out.println(ba.bal);
		System.out.println(ba.atmpin);
	}

}

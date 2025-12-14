package INHERITANCE;

//PRIVATE MEMBER NOT INHERITANCE

class YourBank91
{
	private int pin=12345;
}

class Hacker79 extends YourBank91
{
	void change()
	{
		pin=9304989;
		System.out.println(pin);
	}
}

public class Demo09 {
	public static void main(String[] args)
	{
		Hacker79 h=new Hacker79();
		h.change();
		
	}

}

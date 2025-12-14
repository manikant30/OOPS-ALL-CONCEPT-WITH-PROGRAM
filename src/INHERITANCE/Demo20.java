package INHERITANCE;

//FINAL
//3.FINAL CLASS-IN CLASS NOTHING CAN CHANGE WHEN WE USE THE FINAL KEY WORD.
//we can't inherited the final class.
final class Parentttt1
{
	int a=10;
	float b=45.5f;
	char c='A';
	
	void disp1()
	{
		System.out.println("hi");
	}
	
	void disp2()
	{
		System.out.println("hello");
	}
}

public class Demo20 {
	public static void main(String[] args)
	{
		Parentttt1 p=new Parentttt1();
		p.disp1();
		p.disp2();
	}

}

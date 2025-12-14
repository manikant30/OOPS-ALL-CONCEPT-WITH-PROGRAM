package INHERITANCE;

//FINAL IS A KEY WORD
//FINAL WE GIVE TO THREE PEOPLE
//1.VARIABLE
//2.METHOD
//3.CLASS


//1.FINAL VARIABLE
class Pparentt
{
	 final float pi=3.142f; //when we use the final key word means we can't change the value.
	
	void change()
	{
//		pi=4.1f;//error because we can't change the value of pi.
//		System.out.println(pi);
	}
}
 
public class Demo18 {
	public static void main(String[] args)
	{
		Pparentt p=new Pparentt();
	    p.change();
	}

}

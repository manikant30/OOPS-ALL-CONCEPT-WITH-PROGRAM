package INTERFACE;

//⭐ Rule No. 07:
//An Interface cannot implement another Interface because
//interfaces cannot provide method bodies. 
//(Interfaces can ONLY EXTEND other interfaces.)

//👉 First Interface
interface Addable
{
 void add();   // no body → always public & abstract
}

//👉 Second Interface (cannot implement the first)
interface Subtractable
{
 void sub();   // no body → always public & abstract
}

//👉 A class implements both interfaces (allowed)
class Calc implements Addable, Subtractable
{
 @Override
 public void add()
 {
     System.out.println("Performing addition...");
 }

 @Override
 public void sub()
 {
     System.out.println("Performing subtraction...");
 }
}

 public class Demo08{
 public static void main(String[] args)
 {
     Calc obj = new Calc();

     // ✔ Calling methods from both interfaces
     obj.add();   // from Addable
     obj.sub();   // from Subtractable
 }
}

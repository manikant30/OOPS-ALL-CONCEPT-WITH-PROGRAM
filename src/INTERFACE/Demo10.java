package INTERFACE;

//⭐ Rule No. 09:
//An interface can EXTEND another interface.
//A class cannot extend an interface, it can only IMPLEMENT it.
//Extending means inheriting abstract methods, and interfaces can do this freely.

//👉 Parent Interface
interface CalcOperations   
{
 void mul();
 void div();
}

//👉 Child Interface EXTENDS parent interface
interface SuperCalculator extends CalcOperations   
{
 void add();
 void sub();
}

//👉 Class IMPLEMENTS the child interface
class MySuperCalculator implements SuperCalculator   
{
 @Override
 public void add()
 {
     System.out.println("Addition executed!");
 }

 @Override
 public void sub()
 {
     System.out.println("Subtraction executed!");
 }

 @Override
 public void mul()
 {
     System.out.println("Multiplication executed!");
 }

 @Override
 public void div()
 {
     System.out.println("Division executed!");
 }
}


public class Demo10
{
 public static void main(String[] args)
 {
     // Creating object of our calculator class
     MySuperCalculator calc = new MySuperCalculator();

     // Calling all methods
     calc.add();
     calc.sub();
     calc.mul();
     calc.div();
 }
}


package INTERFACE;

//⭐ Rule No. 08:
//An interface can extend another interface. It can also extend
//MULTIPLE interfaces because interfaces do NOT have method bodies.
//So, no diamond problem in multiple inheritance with interfaces.

//👉 First parent interface
interface Calculator1
{
 void add();   // abstract method (no body)
}

//👉 Second parent interface
interface Calculator3
{
 void mul();   // abstract method (no body)
}

//👉 Middle interface EXTENDS two interfaces (Multiple Inheritance)
interface Calculator2 extends Calculator1, Calculator3
{
 void sub();   // its own abstract method
}

//👉 A class IMPLEMENTS Calculator2 (must give body to all methods)
class MyCalculator implements Calculator2
{
 @Override
 public void add()
 {
     System.out.println("Addition performed!");
 }

 @Override
 public void sub()
 {
     System.out.println("Subtraction performed!");
 }

 @Override
 public void mul()
 {
     System.out.println("Multiplication performed!");
 }
}


public class Demo09
{
 public static void main(String[] args)
 {
     // Creating object of MyCalculator (human-friendly approach)
     MyCalculator calc = new MyCalculator();

     // Calling all inherited and implemented methods
     calc.add();   // from Calculator1
     calc.sub();   // from Calculator2
     calc.mul();   // from Calculator3
 }
}


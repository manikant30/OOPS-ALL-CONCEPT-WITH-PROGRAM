package INTERFACE;

//⭐ Rule No. 06:
//A class can implement multiple interfaces because there is NO diamond problem.
//Interfaces do not carry state or constructor, so no ambiguity occurs.

interface Walkable   // First Interface
{
 void walk();     // automatically public & abstract
}

interface Runnable   // Second Interface
{
 void run();      // automatically public & abstract
}

//👉 A class can implement multiple interfaces safely
class Healthy implements Walkable, Runnable
{
 @Override
 public void walk()
 {
     System.out.println("Walking slowly like a human...");
 }

 @Override
 public void run()
 {
     System.out.println("Running fast like an athlete!");
 }
}
 
 public class Demo07{

 public static void main(String[] args)
 {
     Healthy obj = new Healthy();
     
     // Calling methods of both interfaces
     obj.walk();   // from Walkable
     obj.run();    // from Runnable
 }
}


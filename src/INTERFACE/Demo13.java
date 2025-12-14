package INTERFACE;

//⭐ Rule No: 12
//An object of an Interface CANNOT be created because an interface
//contains only abstract methods (no body).
//BUT an interface reference CAN be created for loose coupling
//and polymorphism.

//👉 Interface with abstract methods
interface Vehicle
{
 void start();   // no body → abstract
 void stop();    // no body → abstract
}

//👉 First implementation of Vehicle
class Car implements Vehicle
{
 @Override
 public void start()
 {
     System.out.println("Car started with key ignition.");
 }

 @Override
 public void stop()
 {
     System.out.println("Car stopped.");
 }
}

//👉 Second implementation of Vehicle
class Bike implements Vehicle
{
 @Override
 public void start()
 {
     System.out.println("Bike started with self-start.");
 }

 @Override
 public void stop()
 {
     System.out.println("Bike stopped.");
 }
}

//👉 Separate class for object creation
public class Demo13
{
 public static void main(String[] args)
 {
     // ❌ Vehicle v = new Vehicle();   // Not allowed → Interface object cannot be created

     // ✔ Interface reference → points to Car object (polymorphism)
     Vehicle v = new Car();
     v.start();
     v.stop();

     System.out.println("--------------------");

     // ✔ Same interface reference → now points to Bike object (loose coupling)
     v = new Bike();
     v.start();
     v.stop();
 }
}

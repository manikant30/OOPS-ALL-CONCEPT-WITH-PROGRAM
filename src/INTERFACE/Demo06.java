package INTERFACE;

//Rule No. 5:
//If a class partially implements an interface,
//then that class MUST be declared as abstract.

//===== Interface =====
interface Shape {
 void draw();     // abstract method
 void color();    // abstract method
}

//===== Abstract Class (Partial Implementation) =====
abstract class Circle implements Shape {

 // ✔ This class provides implementation of ONE method
 @Override
 public void draw() {
     System.out.println("Drawing a Circle...");
 }

 // ❌ It does NOT provide implementation of color()
 // Therefore, this class MUST be abstract
}

//===== Concrete Class (Full Implementation) =====
class RedCircle extends Circle {

 // ✔ Now we provide the remaining implementation
 @Override
 public void color() {
     System.out.println("Coloring Circle Red...");
 }
}

//===== Main Class =====
public class Demo06 {
 public static void main(String[] args) {

     // ✔ Creating object of concrete class
     Shape obj = new RedCircle();
     obj.draw();
     obj.color();
 }
}


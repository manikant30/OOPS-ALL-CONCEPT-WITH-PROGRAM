package INTERFACE;

//rule no 11
//⭐ Definition:
//An empty interface in Java is called a Marker (or Tag) Interface.
//It provides special instructions or special properties to the
//objects of the class that implements it.

//👉 Marker Interface (EMPTY — no methods)
interface SpecialTag
{
 // No methods → acts as a marker
}

//👉 Class implementing the Marker Interface
// This class will now get special property because it is "marked"
class Product implements SpecialTag
{
 void display()
 {
     System.out.println("This product is marked as SPECIAL.");
 }
}


public class Demo12
{
 public static void main(String[] args)
 {
     // Creating object of Product
     Product p = new Product();

     // Marker interface logic (simple example)
     if (p instanceof SpecialTag)   // checking marker
     {
         System.out.println("SpecialTag detected → apply special features!");
     }

     p.display();
 }
}


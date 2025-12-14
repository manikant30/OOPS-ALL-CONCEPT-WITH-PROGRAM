package INTERFACE;

//Rule No. 2: Interfaces promote polymorphism by allowing an interface type
//reference to point to objects of implementing classes. This achieves
//loose coupling, reduces code, and provides flexibility.

interface OperationX {
 void perform();   // contract method
}

class AdditionX implements OperationX {

 @Override
 public void perform() {
     System.out.println("Performing Addition: 10 + 5 = " + (10 + 5));
 }
}

class SubtractionX implements OperationX {

 @Override
 public void perform() {
     System.out.println("Performing Subtraction: 10 - 5 = " + (10 - 5));
 }
}

public class Demo03 {

 public static void main(String[] args) {

     // IMPORTANT:
     // Interface reference promotes loose coupling
     OperationX op;

     op = new AdditionX();   // polymorphism
     op.perform();

     op = new SubtractionX(); // same reference → different object
     op.perform();
 }
}

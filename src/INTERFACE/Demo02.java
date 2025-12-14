package INTERFACE;

//Rule No. 1: An interface is like a contract that, when implemented,
//helps to achieve standardization.

interface Operation {
 void calculate();   // contract method (no parameters)
}

class Add implements Operation {

 @Override   // overriding the contract method
 public void calculate() {
     int a = 10, b = 5;
     System.out.println("Addition = " + (a + b));
 }
}

class Sub implements Operation {

 @Override   // overriding the same method
 public void calculate() {
     int a = 10, b = 5;
     System.out.println("Subtraction = " + (a - b));
 }
}

class Mul implements Operation {

 @Override   // overriding the same method
 public void calculate() {
     int a = 10, b = 5;
     System.out.println("Multiplication = " + (a * b));
 }
}

public class Demo02 {

 public static void main(String[] args) {

     // Creating objects of classes that follow the interface contract
     Add a = new Add();
     Sub s = new Sub();
     Mul m = new Mul();

     // calling the implemented methods
     a.calculate();
     s.calculate();
     m.calculate();
 }
}


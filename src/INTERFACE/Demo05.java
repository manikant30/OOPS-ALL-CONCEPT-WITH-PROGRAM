package INTERFACE;

//Rule No. 4: Specialised methods cannot be accessed directly using
//an interface type reference. An interface reference can call only
//the methods declared inside the interface.

interface Animal {
 void sound();  
 // Interface reference can access ONLY this method
}

class Dog implements Animal {

 @Override
 public void sound() {
     System.out.println("Dog: Barking...");
 }

 void guard() {
     // SPECIALISED METHOD of Dog class
     System.out.println("Dog: Guarding the house...");
 }
}

class Cat implements Animal {

 @Override
 public void sound() {
     System.out.println("Cat: Meowing...");
 }

 void scratch() {
     // SPECIALISED METHOD of Cat class
     System.out.println("Cat: Scratching the sofa...");
 }
}

public class Demo05 {

 public static void main(String[] args) {

     // Interface reference
     Animal a;

     a = new Dog();
     a.sound();   // allowed
     
     // a.guard();   // ❌ NOT allowed → specialised method

     a = new Cat();
     a.sound();   // allowed

     // a.scratch(); // ❌ NOT allowed → specialised method

 }
}


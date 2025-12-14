package INTERFACE;

//Rule No. 3: Methods inside an interface are automatically public and abstract,
//even if we do NOT write public or abstract.

//Interface
interface Task {
 void show();  
 // IMPORTANT:
 // This method is automatically:
 // public abstract void show();
}

class PrintTask implements Task {

 @Override   // implementing the abstract method
 public void show() {
     System.out.println("PrintTask: Showing message...");
 }
}

class MessageTask implements Task {

 @Override   // implementing the same method
 public void show() {
     System.out.println("MessageTask: Displaying message...");
 }
}

public class Demo04 {

 public static void main(String[] args) {

     // IMPORTANT:
     // Interface reference storing different object → polymorphism
     Task t;

     t = new PrintTask();
     t.show();

     t = new MessageTask();
     t.show();
 }
}


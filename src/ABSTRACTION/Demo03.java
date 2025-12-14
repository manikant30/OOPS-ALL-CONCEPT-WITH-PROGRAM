package ABSTRACTION;

import java.util.Scanner;

// Abstract class → cannot create object, contains abstract + concrete methods
abstract class Shape
{
	double area;

	abstract void acceptInput();     // incomplete method → must be overridden
	abstract void calculateArea();   // different formulas in child classes

	// common method for all shapes
	void displayArea()
	{
		System.out.println("Area : " + area);
	}
}

// Square class gives its own implementation
class Square extends Shape
{
	int side;

	@Override
	void acceptInput()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the side");
		side = scanner.nextInt();
	}

	@Override
	void calculateArea()
	{
		area = side * side;   // formula for square
	}
}

// Rectangle class gives its own implementation
class Rectangular extends Shape
{
	int length;
	int breadth;

	@Override
	void acceptInput()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Length");
		length = scanner.nextInt();
		System.out.println("Enter the Breadth");
		breadth = scanner.nextInt();
	}

	@Override
	void calculateArea()
	{
		area = length * breadth;   // formula for rectangle
	}
}

// Circle class gives its own implementation
class Circle extends Shape
{
	int radius;

	@Override
	void acceptInput()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the radius");
		radius = scanner.nextInt();
	}

	@Override
	void calculateArea()
	{
		area = 3.14 * radius * radius;   // formula for circle
	}
}

public class Demo03 {
	public static void main(String[] args)
	{
		// Upcasting → parent reference, child object
		// Shape can point to any shape (Square, Rectangle, Circle)
		Shape myShape = new Square();

		myShape.acceptInput();     // calls Square version
		myShape.calculateArea();   // call depends on object (runtime polymorphism)
		myShape.displayArea();     // common method
	}
}

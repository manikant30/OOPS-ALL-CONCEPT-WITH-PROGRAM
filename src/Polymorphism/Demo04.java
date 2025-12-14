package Polymorphism;

// Loose Coupling → Parent type reference and Child type object.
// Because of this, Airport can accept any type of Plane (flexibility).

class PlaneLC1
{
	// common method → overridden in all child classes
	void fly()
	{
		System.out.println("Plane flies");
	}
}

class CargoPlaneLC1 extends PlaneLC1
{
	@Override
	void fly()
	{
		System.out.println("CargoPlane flies at lower heights");
	}
}

class PassengerPlaneLC1 extends PlaneLC1
{
	@Override
	void fly()
	{
		System.out.println("PassengerPlane flies at medium heights");
	}
}

class FighterPlaneLC1 extends PlaneLC1
{
	@Override
	void fly()
	{
		System.out.println("FighterPlane flies at any heights");
	}
}

class Airport
{
	// Loose Coupling → method accepts parent type reference
	void permit(PlaneLC1 ref)
	{
		ref.fly();   // runtime polymorphism
	}
}

public class Demo04 {

	public static void main(String[] args)
	{
		CargoPlaneLC1 cp = new CargoPlaneLC1();        // child objects
		PassengerPlaneLC1 pp = new PassengerPlaneLC1();
		FighterPlaneLC1 fp = new FighterPlaneLC1();

		Airport a = new Airport();

		a.permit(cp);   // Loose Coupling: parent ref → child object
		a.permit(pp);
		a.permit(fp);
	}
}

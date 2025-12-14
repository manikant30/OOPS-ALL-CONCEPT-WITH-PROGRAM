/*
 * Loose Coupling → Parent type reference and Child type object.
 * Loose Coupling gives flexibility (can change object easily).
 */

package Polymorphism;

class PlaneA
{
    // common method (runtime polymorphism)
    void fly()
    {
        System.out.println("Plane flies");
    }
}

class CargoPlaneA extends PlaneA
{
    @Override
    void fly()
    {
        System.out.println("CargoPlane flies at lower heights");
    }
}

class PassengerPlaneA extends PlaneA
{
    @Override
    void fly()
    {
        System.out.println("PassengerPlane flies at medium heights");
    }
}

class FighterPlaneA extends PlaneA
{
    @Override
    void fly()
    {
        System.out.println("FighterPlane flies at any heights");
    }
}

public class Demo02 {
	
    public static void main(String[] args)
    {
        PlaneA ref;   // loose coupling → parent reference
        
        CargoPlaneA cp = new CargoPlaneA();      // child objects
        PassengerPlaneA pp = new PassengerPlaneA();
        FighterPlaneA fp = new FighterPlaneA();
        
        ref = cp;   // parent reference → child object
        ref.fly();
        
        ref = pp;
        ref.fly();
        
        ref = fp;
        ref.fly();
    }
}

/*
 * Tight Coupling → Child type reference and Child type object.
 * It is not flexible because every class depends directly on child types.
 */

package Polymorphism;

class Plane
{
    // common method → overridden in child classes
    void fly()
    {
        System.out.println("Plane flies");
    }
}

class CargoPlane extends Plane
{
    @Override
    void fly()
    {
        System.out.println("CargoPlane flies at lower heights");
    }
}

class PassengerPlane extends Plane
{
    @Override
    void fly()
    {
        System.out.println("PassengerPlane flies at medium heights");
    }
}

class FighterPlane extends Plane
{
    @Override
    void fly()
    {
        System.out.println("FighterPlane flies at any heights");
    }
}

public class Demo01 {
	
    public static void main(String[] args)
    {
        CargoPlane cp = new CargoPlane();       // tight coupling
        PassengerPlane pp = new PassengerPlane();
        FighterPlane fp = new FighterPlane();
        
        cp.fly();
        pp.fly();
        fp.fly();
    }
}

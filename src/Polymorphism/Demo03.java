package Polymorphism;

/*
 * Loose Coupling → Parent type reference and Child type object.
 * 
 * What we achieve in Loose Coupling:
 * 1) Method Overriding (same method, different outputs)
 * 2) Specialized Methods (child has extra methods)
 * 3) Parent Methods can be extended (child adds new behavior)
 * 4) Program becomes flexible (can change objects easily)
 */


class PlaneLC
{
    // common method → runtime polymorphism
    void fly()
    {
        System.out.println("Plane flies");
    }
    
    void takeOff()
    {
        System.out.println("Plane takeOff");
    }
}

class CargoPlaneLC extends PlaneLC
{
    @Override
    void fly()
    {
        System.out.println("CargoPlane flies at lower heights");
    }
    
    void carryCargoLC()
    {
        System.out.println("carry goods");
    }
}

class PassengerPlaneLC extends PlaneLC
{
    @Override
    void fly()
    {
        System.out.println("PassengerPlane flies at medium heights");
    }
    
    void carryPassengersLC()
    {
        System.out.println("carry passengers");
    }
}

class FighterPlaneLC extends PlaneLC
{
    @Override
    void fly()
    {
        System.out.println("FighterPlane flies at any heights");
    }
    
    void fighterWeaponsLC()
    {
        System.out.println("carry weapons");
    }
}

public class Demo03 {
	
    public static void main(String[] args)
    {
        PlaneLC ref;     // loose coupling → parent reference
        
        CargoPlaneLC cp = new CargoPlaneLC();
        PassengerPlaneLC pp = new PassengerPlaneLC();
        FighterPlaneLC fp = new FighterPlaneLC();
        
        ref = cp;        // parent reference → child object
        ref.takeOff();
        ref.fly();

        // Downcasting → accessing child-specific method
        ((CargoPlaneLC)ref).carryCargoLC();  
        
        ref = pp;
        ref.takeOff();
        ref.fly();
        ((PassengerPlaneLC)ref).carryPassengersLC();  // downcasting
        
        ref = fp;
        ref.takeOff();
        ref.fly();
        ((FighterPlaneLC)ref).fighterWeaponsLC();     // downcasting
    }
}

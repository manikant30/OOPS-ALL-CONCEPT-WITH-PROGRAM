package ABSTRACTION;


abstract class PlaneLC
{
	abstract void takeOff();
    
	abstract void land();
	
	abstract void fly();
    
}

class CargoPlaneLC extends PlaneLC
{
    @Override
    void fly()
    {
        System.out.println("CargoPlane flies at lower heights");
    }
    
    @Override
    void takeOff()
    {
        System.out.println("CargoPlane is takingoff");
    }
    
    @Override
    void land()
	{
		System.out.println("CargoPlane is landing");
	}
}

class PassengerPlaneLC extends PlaneLC
{
    @Override
    void fly()
    {
        System.out.println("PassengerPlane flies at medium heights");
    }
    
    @Override
    void takeOff()
    {
        System.out.println("PassengerPlane is takingoff");
    }
    
    @Override
    void land()
	{
		System.out.println("PassengerPlane is landing");
	}
}

class FighterPlaneLC extends PlaneLC
{
    @Override
    void fly()
    {
        System.out.println("FighterPlane flies at any heights");
    }
    
    @Override
    void takeOff()
    {
        System.out.println("FighterPlaneLC is takingoff");
    }
    
    @Override
    void land()
	{
		System.out.println("FighterPlaneLC is landing");
	}
    
}

class Airport
{
	// Loose Coupling → method accepts parent type reference
	void permit(PlaneLC ref)
	{
		ref.takeOff();
		ref.fly();   // runtime polymorphism
		ref.land();
	}
}

public class Demo01 {
	
    public static void main(String[] args)
    {
    	CargoPlaneLC cp = new CargoPlaneLC();        // child objects
        PassengerPlaneLC pp = new PassengerPlaneLC();
        FighterPlaneLC fp = new FighterPlaneLC();
        
        Airport a = new Airport();
        
        a.permit(cp);   // Loose Coupling: parent ref → child object
        a.permit(pp);
        a.permit(fp);
    }
}

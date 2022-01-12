package junitnesstest;
interface Bike
{
	public String getName();
}

class Engine{
	Engine()
	{
		System.out.println("Engine is Created!!");
	}
}

interface NewBike
{
	public Engine getEngine();
}

public class DoubleCloneOperator {
	public static String printname()
	{
		return "Honda is static method";
	}
	
	public String displayName()
	{
		return "Honda is non-static method instance method";
	}
public static void main(String[] args) {
	Bike b=()->"Honda";
	System.out.println(b.getName());
	
	// method reference for static methods
	// classname::methodname
	Bike b1=DoubleCloneOperator::printname;
	System.out.println(b1.getName());
	
	// method reference for non static methods
	// objectreference::methodname
	DoubleCloneOperator dc=new DoubleCloneOperator();
	Bike b2=dc::displayName;
	System.out.println(b2.getName());
	
	// Constructor reference
	//classname::new
	NewBike nb=Engine::new;
	nb.getEngine();
}
}

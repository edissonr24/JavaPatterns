package co.com.implementacion;

/**
 * Client code
 */
public class PrototypeTest {
	
	public static void main(String args[]) throws CloneNotSupportedException {
		
		Prototype prototype = new PrototypeImpl(1000);
 
        for (int i = 1; i < 10; i++) {
    
        	Prototype tempotype = (Prototype) prototype.clone();
 
            // Usage of values in prototype to derive a new value.
            tempotype.setX( tempotype.getX() * i);
            tempotype.printX();
        }
    }
}


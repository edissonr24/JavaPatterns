package co.com.implementacion;

public class Example {

	public static void main(String args[]){
	    Creator aCreator;
	    aCreator = new ConcreteCreator();
	    Product producto = aCreator.factoryMethod();
	    producto.operacion();
	}

	
}

package co.com.implementacion;

public class ConcreteCreator extends Creator{
    protected Product factoryMethod() {
        return new ConcreteProduct();
    }
}


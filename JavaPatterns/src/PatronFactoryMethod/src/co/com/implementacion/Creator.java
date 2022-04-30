package co.com.implementacion;

public abstract class Creator {
    // Operación que realiza 
    public Product  anOperation() {
 
        return factoryMethod();
    }
 
    // Definimos método abstracto
    protected abstract Product factoryMethod();
}

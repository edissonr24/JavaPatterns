package co.com.implementacion;

public abstract class Creator {
    // Operaci�n que realiza 
    public Product  anOperation() {
 
        return factoryMethod();
    }
 
    // Definimos m�todo abstracto
    protected abstract Product factoryMethod();
}

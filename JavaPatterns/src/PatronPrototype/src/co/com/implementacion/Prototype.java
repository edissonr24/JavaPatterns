package co.com.implementacion;

/**
 * Prototype class
 */
abstract class Prototype implements Cloneable {
        @Override
        public Object clone() throws CloneNotSupportedException {
                return super.clone();
        }
 
        public abstract void setX(int x);
 
        public abstract void printX();
 
        public abstract int getX();
}


package co.com.implementacion;

public class Builder {

	 private final Pizza obj = new Pizza();
     private boolean done;

     public Builder() {}

     public Pizza build() {
             done = true;
             return obj;
     }

     public Builder setDough(String dough) {
             check();
             obj.dough = dough;
             return this;
     }

     public Builder setSauce(String sauce) {
             check();
             obj.sauce = sauce;
             return this;
     }

     public Builder setTopping(String topping) {
             check();
             obj.topping = topping;
             return this;
     }

     private void check() {
             if (done)
                     throw new IllegalArgumentException("Do use other builder to create new instance");
     }

	
}

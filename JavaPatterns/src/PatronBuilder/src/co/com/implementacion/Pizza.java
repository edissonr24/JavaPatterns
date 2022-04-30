package co.com.implementacion;

public class Pizza {

	 public String dough;
     public String sauce;
     public String topping;
     public String str;

     public Pizza() {}

     public static Builder createBuilder() {
             return new Builder();
     }

     public String getDough() {
             return dough;
     }

     public String getSauce() {
             return sauce;
     }

     public String getTopping() {
             return topping;
     }

     @Override
     public String toString() {
             if (str == null)
                     str = "Dough:" + dough + " Topping:" + topping + " Sauce:" + sauce;
             return str;
     }

	
}

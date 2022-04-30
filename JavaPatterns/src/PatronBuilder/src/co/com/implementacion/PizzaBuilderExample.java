package co.com.implementacion;

public class PizzaBuilderExample {

	public static void main(String[] args) {
		Pizza hawaiianPizza = Pizza.createBuilder()
                                    .setDough("cross")
                                    .setTopping("ham+pineapple")
                                    .setSauce("mild")
                                    .build();

        System.out.println("Hawaiian Pizza: " + hawaiianPizza);
	}

	
}

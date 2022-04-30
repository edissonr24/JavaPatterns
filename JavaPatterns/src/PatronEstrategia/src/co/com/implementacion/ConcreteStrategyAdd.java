package co.com.implementacion;

//Implements the algorithm using the strategy interface
public class ConcreteStrategyAdd implements Strategy {

	public int execute(int a, int b) {
		System.out.println("Called ConcreteStrategyAdd's execute()");
		return a + b;  // Do an addition with a and b
	}
}


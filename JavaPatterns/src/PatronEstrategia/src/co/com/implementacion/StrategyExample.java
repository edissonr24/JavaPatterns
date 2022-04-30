package co.com.implementacion;

//Test application
class StrategyExample {

	public static void main(String[] args) {

		Context context;

		// Three contexts following different strategies
		context = new Context(new ConcreteStrategyAdd());
		int resultA = context.executeStrategy(3,4);
		System.out.println("Result A: " + resultA);

		context = new Context(new ConcreteStrategySubtract());
		int resultB = context.executeStrategy(3,4);
		System.out.println("Result B: " + resultB);

		context = new Context(new ConcreteStrategyMultiply());
		int resultC = context.executeStrategy(3,4);
		System.out.println("Result C: " + resultC);
	}
}


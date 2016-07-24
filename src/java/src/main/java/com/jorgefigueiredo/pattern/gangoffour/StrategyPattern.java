package com.jorgefigueiredo.pattern.gangoffour;

public class StrategyPattern {

	public static void main(String[] args) {
		
		Context context;
		
		context = new Context(new ConcreteStrategyA());
		context.contextInterface();
		
		context = new Context(new ConcreteStrategyB());
		context.contextInterface();
		
		context = new Context(new ConcreteStrategyC());
		context.contextInterface();
		
	}
	
	static abstract class Strategy {
		
		abstract void algorithmInterface();
		
	}
	
	static class ConcreteStrategyA extends Strategy {

		@Override
		void algorithmInterface() {
			System.out.println("ContreteStrategyA.AlgorithmInterface()");
		}
	}
	
	static class ConcreteStrategyB extends Strategy {

		@Override
		void algorithmInterface() {
			System.out.println("ConcreteStrategyB.AlgorithmInterface()");
		}
		
	}
	
	static class ConcreteStrategyC extends Strategy {
		
		@Override
		void algorithmInterface() {
			System.out.println("ConcreteStrategyC.AlgorithmInterface()");
		}
	}

	
	static class Context {
		
		private Strategy strategy;
		
		public Context(Strategy strategy) {
			this.strategy = strategy;
		}
		
		public void contextInterface() {
			strategy.algorithmInterface();
		}
		
	}
	
}

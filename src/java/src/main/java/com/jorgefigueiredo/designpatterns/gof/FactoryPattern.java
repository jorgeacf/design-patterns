package com.jorgefigueiredo.designpatterns.gof;

public class FactoryPattern {

	public static void main(String[] args) {
		
		Creator[] creators = new Creator[2];
		
		creators[0] = new CreatorA();
		creators[1] = new CreatorB();
		
		for(Creator creator : creators) {
			
			Target target = creator.factoryMethod();
			System.out.println(String.format("Created %s.", target.getClass().getName()));
			
		}
		
	}
	
	static abstract class Target {
		
	}
	
	static class TargetA extends Target {
		
	}
	
	static class TargetB extends Target {
		
	}
	
	
	static abstract class Creator {
		abstract Target factoryMethod();
	}

	static class CreatorA extends Creator {
		
		@Override
		public Target factoryMethod() {
			return new TargetA();
		}
		
	}
	
	static class CreatorB extends Creator {
		
		@Override
		public Target factoryMethod() {
			return new TargetB();
		}
		
	}
	
}

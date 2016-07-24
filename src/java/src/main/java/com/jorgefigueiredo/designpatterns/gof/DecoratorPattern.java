package com.jorgefigueiredo.designpatterns.gof;

public class DecoratorPattern {

	public static void main(String[] args) {
		
		ConcreteComponent c = new ConcreteComponent();
		
		ConcreteDecoratorA a = new ConcreteDecoratorA();
		ConcreteDecoratorB b = new ConcreteDecoratorB();
		
		a.setComponent(c);
		b.setComponent(a);
		
		b.operation();
		
	}
	
	
	
	static abstract class Component {
		abstract void operation();
	}

	static class ConcreteComponent extends Component {

		@Override
		void operation() {
			System.out.println("ConcreteComponent.Operation()");
		}
		
	}
	
	static abstract class Decorator extends Component {
		
		protected Component component;
		
		public void setComponent(Component component) {
			this.component = component;
		}
		
		@Override
		public void operation() {
			if(component != null) {
				component.operation();
			}
		}
		
	}
	
	static class ConcreteDecoratorA extends Decorator {
		
		@Override
		public void operation() {
			super.operation();
			System.out.println("ConcreteDecoratorA.Operation()");
		}
		
	}
	
	static class ConcreteDecoratorB extends Decorator {
		
		@Override
		public void operation() {
			super.operation();
			AdditionalBehavior();
			System.out.println("ConcreteDecoratorB.Operation()");
		}
		
		private void AdditionalBehavior() {
			System.out.println("ConcreteDecoratorB.AdditionalBehavior()");
		}
		
	}
	
}


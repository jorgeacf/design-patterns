package com.jorgefigueiredo.pattern.gangoffour;

public class BridgePattern {

	public static void main(String[] args) {

		Abstraction abstraction = new ImprovedAbstraction();
		
		abstraction.setImplementor(new ImplementorA());
		abstraction.operation();
		
		abstraction.setImplementor(new ImplementorB());
		abstraction.operation();
		
	}
	
}

class Abstraction {
	
	protected Implementor implementor;
	
	public void setImplementor(Implementor implementor) {
		this.implementor = implementor;
	}
	
	public void operation() {
		this.implementor.operation();
	}
	
}

abstract class Implementor {
	abstract void operation();
}

class ImprovedAbstraction extends Abstraction {
	
	@Override
	public void operation() {
		implementor.operation();
	}
	
}


class ImplementorA extends Implementor {

	@Override
	void operation() {
		System.out.println("ImplementorA Operation");
	}
	
}

class ImplementorB extends Implementor {

	@Override
	void operation() {
		System.out.println("ImplementorB Operation");
		
	}
	
}
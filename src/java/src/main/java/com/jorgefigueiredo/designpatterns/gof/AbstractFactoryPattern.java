package com.jorgefigueiredo.designpatterns.gof;

public class AbstractFactoryPattern {

	public static void main(String[] args) {

		Factory factory1 = new ConcreteFactory1();
		Client client1 = new Client(factory1);
		client1.run();
		
		Factory factory2 = new ConcreteFactory2();
		Client client2 = new Client(factory2);
		client2.run();
		
	}

}

interface Factory {
	
	ObjectA createA();
	ObjectB createB();
	
}

class ConcreteFactory1 implements Factory {

	public ObjectA createA() {
		return new ConcreteA1();
	}

	public ObjectB createB() {
		return new ConcreteB1();
	}
	
}

class ConcreteFactory2 implements Factory {

	public ObjectA createA() {
		return new ConcreteA2();
	}

	public ObjectB createB() {
		return new ConcreteB2();
	}
	
}


interface ObjectA {
	
}

interface ObjectB {
	
	void interact(ObjectA a);
	
}

class ConcreteA1 implements ObjectA {
	
}

class ConcreteB1 implements ObjectB {

	public void interact(ObjectA a) {
		System.out.println(String.format("%s interacts with %s.", this.getClass().getName(), a.getClass().getName()));
	}
	
}

class ConcreteA2 implements ObjectA {
	
}

class ConcreteB2 implements ObjectB {

	public void interact(ObjectA a) {
		System.out.println(String.format("%s interacts with %s.", this.getClass().getName(), a.getClass().getName()));
	}
	
}


class Client {
	
	private final ObjectA a;
	private final ObjectB b;
	
	public Client(Factory factory) {
		a = factory.createA();
		b = factory.createB();
	}
	
	public void run() {
		b.interact(a);
	}
	
}






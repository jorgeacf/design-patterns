package com.jorgefigueiredo.pattern.gangoffour;

public class ChainPattern {

	public static void main(String[] args) {

		Handler handler1 = new ConcreteHandler1();
		Handler handler2 = new ConcreteHandler2();
		Handler handler3 = new ConcreteHandler3();
		
		handler1.setSucessor(handler2);
		handler2.setSucessor(handler3);
		
		int[] requests = new int[] { 2, 29, 13, 9, 23, 34 };
		
		for(int r : requests) {
			handler1.handleRequest(r);
		}
		
	}

}

abstract class Handler {
	
	protected Handler sucessor;
	
	public void setSucessor(Handler sucessor) {
		this.sucessor = sucessor;
	}
	
	abstract void handleRequest(int request);
	
}

class ConcreteHandler1 extends Handler {

	@Override
	void handleRequest(int request) {
		
		if(request >= 0 && request < 10) {
			System.out.println(String.format("%s handled request %s.", this.getClass().getName(), request));
		}
		else if (sucessor != null) {
			sucessor.handleRequest(request);
		}
		
	}
	
}

class ConcreteHandler2 extends Handler {

	@Override
	void handleRequest(int request) {
		
		if(request >= 10 && request < 20) {
			System.out.println(String.format("%s handled request %s.", this.getClass().getName(), request));
		}
		else if (sucessor != null) {
			sucessor.handleRequest(request);
		}
		
	}
	
}

class ConcreteHandler3 extends Handler {

	@Override
	void handleRequest(int request) {
		
		if(request >= 20 && request < 30) {
			System.out.println(String.format("%s handled request %s.", this.getClass().getName(), request));
		}
		else if (sucessor != null) {
			sucessor.handleRequest(request);
		}
		
	}
	
}


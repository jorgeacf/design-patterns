package com.jorgefigueiredo.designpatterns.gof;

public class FacadePattern {

	public static void main(String[] args) {
		
		Facade facade = new Facade();
		
		facade.methodA();
		facade.methodB();
		
	}
	
	
	
	static class SubSystemOne {
		
		public void methodOne() {
			System.out.println("Method 1");
		}
		
	}
	
	static class SubSystemTwo {
		
		public void methodTwo() {
			System.out.println("Method 2");
		}
	}
	
	static class SubSystemThree {
		
		public void methodThree() {
			System.out.println("Method 3");
		}
	}
	
	static class SubSystemFour {
		
		public void methodFour() {
			System.out.println("Method 4");
		}
	}
	
	static class Facade {
		
		private SubSystemOne one;
		private SubSystemTwo two;
		private SubSystemThree three;
		private SubSystemFour four;
		
		public Facade() {
			one = new SubSystemOne();
			two = new SubSystemTwo();
			three = new SubSystemThree();
			four = new SubSystemFour();
		}
		
		public void methodA() {
			System.out.println("MethodA()");
			one.methodOne();
			two.methodTwo();
			four.methodFour();
		}
		
		public void methodB() {
			System.out.println("MethodB()");
			two.methodTwo();
			three.methodThree();
		}
		
	}

}

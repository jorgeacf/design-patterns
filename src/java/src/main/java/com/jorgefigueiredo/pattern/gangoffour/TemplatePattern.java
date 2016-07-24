package com.jorgefigueiredo.pattern.gangoffour;

public class TemplatePattern {

	public static void main(String[] args) {
		
		AbstractClass a = new ConcreteClassA();
		a.templateMethod();
		
		AbstractClass b = new ConcreteClassB();
		b.templateMethod();
		
	}
	
	
	
	static abstract class AbstractClass {
		
		abstract void primitiveOperation1();
		abstract void primitiveOperation2();
		
		public void templateMethod() {
			
			System.out.println("templateMethod()");
			primitiveOperation1();
			primitiveOperation2();
			
		}
		
	}

	static class ConcreteClassA extends AbstractClass {

		@Override
		void primitiveOperation1() {
			System.out.println("ConcreateClassA.primitiveOperation1()");
		}

		@Override
		void primitiveOperation2() {
			System.out.println("ConcreateClassA.primitiveOperation2()");
		}
		
	}

	static class ConcreteClassB extends AbstractClass {

		@Override
		void primitiveOperation1() {
			System.out.println("ConcreateClassB.primitiveOperation1()");
		}

		@Override
		void primitiveOperation2() {
			System.out.println("ConcreateClassB.primitiveOperation2()");
		}
		
	}
	
}

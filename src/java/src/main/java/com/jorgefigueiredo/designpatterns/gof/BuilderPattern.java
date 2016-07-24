package com.jorgefigueiredo.designpatterns.gof;

import java.util.LinkedList;

public class BuilderPattern {

	public static void main(String[] args) {
		
		ComplexObject complexObject = new ComplexObject();

		Builder builder1 = new ConcreteBuilder1();
		Builder builder2 = new ConcreteBuilder2();
		
		complexObject.construct(builder1);
		Result result1 = builder1.getResult();
		result1.display();
		
		complexObject.construct(builder2);
		Result result2 = builder2.getResult();
		result2.display();
		
	}

}


class ComplexObject {
	
	public void construct(Builder builder) {
		
		builder.buildPart1();
		builder.buildPart2();
		builder.buildPart3();
		
	}
	
}


abstract class Builder {
	
	abstract void buildPart1();
	abstract void buildPart2();
	abstract void buildPart3();
	
	abstract Result getResult();
	
}

class ConcreteBuilder1 extends Builder {

	private Result result = new Result();
	
	@Override
	void buildPart1() {
		result.add("Builder1-Part1");
	}

	@Override
	void buildPart2() {
		result.add("Builder1-Part2");
	}

	@Override
	void buildPart3() {
		result.add("Builder1-Part3");
	}

	@Override
	Result getResult() {
		
		return result;
	}
	
}

class ConcreteBuilder2 extends Builder {

	private Result result = new Result();
	
	@Override
	void buildPart1() {
		result.add("Builder2-Part1");
	}

	@Override
	void buildPart2() {
		result.add("Builder2-Part2");
	}

	@Override
	void buildPart3() {
		result.add("Builder2-Part3");
	}

	@Override
	Result getResult() {
		
		return result;
	}
	
}


class Result {
	
	private LinkedList<String> parts = new LinkedList<String>();
	
	public void add(String part) {
		parts.add(part);
	}
	
	public void display() {
		System.out.println(String.format("The result parts are [%s].", String.join(",", parts)));
	}
}
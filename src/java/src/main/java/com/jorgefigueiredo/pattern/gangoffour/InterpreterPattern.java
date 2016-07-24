package com.jorgefigueiredo.pattern.gangoffour;

import java.util.LinkedList;
import java.util.List;

public class InterpreterPattern {

	public static void main(String[] args) {
		
		Context context = new Context();
		
		List<Expression> expressions = new LinkedList<Expression>();
	
		expressions.add(new TerminalExpression());
		expressions.add(new NonTerminalExpression());
		expressions.add(new TerminalExpression());
		expressions.add(new TerminalExpression());
		
		for(Expression expression : expressions) {
			expression.interpret(context);
		}
	}
	
	static class Context {
		
	}
	
	static abstract class Expression {
		abstract void interpret(Context context);
	}
	
	static class TerminalExpression extends Expression {

		@Override
		void interpret(Context context) {
			System.out.println("Terminal.interpret() called!");
		}
		
	}
	
	static class NonTerminalExpression extends Expression {

		@Override
		void interpret(Context context) {
			System.out.println("NonTerminal.interpret() called!");
		}
		
		
		
	}

}

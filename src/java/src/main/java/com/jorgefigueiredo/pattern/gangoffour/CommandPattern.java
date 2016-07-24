package com.jorgefigueiredo.pattern.gangoffour;

public class CommandPattern {

	public static void main(String[] args) {
		
		Receiver receiver = new Receiver();
		Command command = new ConcreteCommand(receiver);
		Invoker invoker = new Invoker();
		
		invoker.setCommand(command);
		invoker.executeCommand();
		
	}

}


abstract class Command {
	
	protected Receiver receiver;
	
	public Command(Receiver receiver) {
		this.receiver = receiver;
	}
	
	abstract void execute();
}

class ConcreteCommand extends Command {

	public ConcreteCommand(Receiver receiver) {
		super(receiver);
	}
	
	@Override
	public void execute() {
		receiver.action();
	}
	
}


class Receiver {
	
	public void action() {
		System.out.println("Called Receiver.Action() method.");
	}
	
}

class Invoker {
	
	private Command command;

	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void executeCommand() {
		command.execute();
	}
	
}

package com.jorgefigueiredo.pattern.gangoffour;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CompositePattern {

	public static void main(String[] args) {
	
		Composite root = new Composite("root");
		root.add(new Leaf("Leaf A"));
		root.add(new Leaf("Leaf B"));
		
		Composite comp = new Composite("Composite X");
		comp.add(new Leaf("Leaf XA"));
		comp.add(new Leaf("Leaf XB"));
		
		root.add(comp);
		root.add(new Leaf("Leaf C"));
		
		root.display(1);
		
		Leaf leaf = new Leaf("Leaf D");
		root.add(leaf);
		
		root.display(1);
		
		root.remove(leaf);
		
		root.display(1);
		
	}

}


abstract class Component {
	
	protected String name;
	
	public Component(String name) {
		this.name = name;
	}
	
	abstract void add(Component c);
	abstract void remove(Component c);
	abstract void display(int depth);
	
}

class Composite extends Component {

	private List<Component> children = new LinkedList<Component>();
	
	public Composite(String name) {
		super(name);
		
	}

	@Override
	void add(Component c) {
		children.add(c);
	}

	@Override
	void remove(Component c) {
		children.remove(c);
	}

	@Override
	void display(int depth) {
		
		char[] chars = new char[depth];
		Arrays.fill(chars, '-');
		System.out.println(new String(chars) + name);
		
		for(Component c : children) {
			c.display(depth + 2); 
		}
		
		System.out.println("");
	}
	
}

class Leaf extends Component {

	public Leaf(String name) {
		super(name);
	}

	@Override
	void add(Component c) {
		System.out.println("Cannot add to a leaf");
	}

	@Override
	void remove(Component c) {
		System.out.println("Cannot remove from a leaf");
	}

	@Override
	void display(int depth) {
		
		char[] chars = new char[depth];
		Arrays.fill(chars, '-');
		System.out.println(new String(chars) + name);
		
	}

}




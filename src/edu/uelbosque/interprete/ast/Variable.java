package edu.uelbosque.interprete.ast;

public class Variable extends ValueString {
	
	private String name;
	
	public Variable(String name) {	
		this.name = name;
	}
	
	public String interpret() {		
		return this.name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {		
		return "[" + this.name + ":" + this.name + "]";
	}


}

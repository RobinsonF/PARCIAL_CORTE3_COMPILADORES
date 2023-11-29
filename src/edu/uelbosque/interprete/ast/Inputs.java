package edu.uelbosque.interprete.ast;

public class Inputs implements AST{

	private InputList l;
	
	public Inputs(InputList l) {
		this.l = l;
	}

	public void interpret() {
		this.l.interpret();
	}
}

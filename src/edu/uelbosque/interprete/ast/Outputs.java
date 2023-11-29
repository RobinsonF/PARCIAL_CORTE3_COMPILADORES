package edu.uelbosque.interprete.ast;

public class Outputs implements AST{

	private OutputList o;
	
	public Outputs(OutputList o) {
		this.o = o;
	}
	
	public void interpret() {
		this.o.interpret();
	}

}

package edu.uelbosque.interprete.ast;

public class OutputType {

	private OutputTypeName o;
	
	public OutputType(OutputTypeName o) {
		this.o = o;
	}

	public void interpret() {
		this.o.interpret();
	}

}

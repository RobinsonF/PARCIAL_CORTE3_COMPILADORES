package edu.uelbosque.interprete.ast;

public class InputType {

	private InputTypeName i;
	
	public InputType(InputTypeName i) {
		this.i = i;
	}

	public void interpret() {
		this.i.interpret();
	}

}

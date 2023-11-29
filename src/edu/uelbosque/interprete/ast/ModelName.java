package edu.uelbosque.interprete.ast;


public class ModelName implements AST {

	private String v;

	public ModelName(String v) {
		this.v = v;
	}

	public ModelName() {
		
	}

	public String interpret() {
		return v;
	}

}

package edu.uelbosque.interprete.ast;

public class ModelType implements AST{

	private ModelTypeName n;
	
	public ModelType(ModelTypeName n) {
		this.n = n;
	}
	
	public void interpret() {
		this.n.interpret();
	}

}

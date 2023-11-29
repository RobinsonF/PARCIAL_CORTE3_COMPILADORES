package edu.uelbosque.interprete.ast;

public class Model implements AST{
	
	private LayersTList l;

	public Model(LayersTList l) {
		this.l = l;
	}
	
	public void interpret() {
		this.l.interpret();
	}

}

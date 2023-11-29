package edu.uelbosque.interprete.ast;

public class Document implements AST{
	
	private ModelName mn;
	private ModelType mt;
	private Inputs i;
	private Outputs o;
	private Model m;
	
	public Document(ModelName mn, ModelType mt, Inputs i, Outputs o, Model m) {
		this.mn = mn;
		this.mt = mt;
		this.i = i;
		this.o = o;
		this.m = m;
	}

	public void interpret() {
		this.mn.interpret();
		this.mt.interpret();
		this.i.interpret();
		this.o.interpret();
		this.m.interpret();
	}

}

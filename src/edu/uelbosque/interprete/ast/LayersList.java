package edu.uelbosque.interprete.ast;

import java.util.ArrayList;

public class LayersList {

	private LayerList ln;
	
	public LayersList(LayerList ln) {
		this.ln = ln;
		
	}

	public void interpret() {
		this.ln.interpret();
	}

	public LayerList getLn() {
		return ln;
	}

	public void setLn(LayerList ln) {
		this.ln = ln;
	}

}

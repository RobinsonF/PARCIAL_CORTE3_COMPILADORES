package edu.uelbosque.interprete.ast;

public class Layers {

	private LayersList l;
	
	public Layers(LayersList l) {
		this.l = l;
	}

	public void interpret() {
		this.l.interpret();
	}

}

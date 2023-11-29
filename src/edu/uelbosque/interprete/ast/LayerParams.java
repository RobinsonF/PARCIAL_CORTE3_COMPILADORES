package edu.uelbosque.interprete.ast;

public class LayerParams {

	private Numbers ns;
	
	public LayerParams(Numbers ns) {
		this.ns = ns;
	}

	public void interpret() {
		this.ns.interpret();
	}

	public Numbers getNs() {
		return ns;
	}

	public void setNs(Numbers ns) {
		this.ns = ns;
	}
	
}

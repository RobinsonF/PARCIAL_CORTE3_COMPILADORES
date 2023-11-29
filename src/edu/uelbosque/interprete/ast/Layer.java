package edu.uelbosque.interprete.ast;

public class Layer {

	private LayerName ln;
	private LayerParams lp;
	
	public Layer(LayerName ln, LayerParams lp) {
		this.ln = ln;
		this.lp = lp;
	}

	public void interpret() {
		this.ln.interpret();
		this.lp.interpret();
	}

	public LayerName getLn() {
		return ln;
	}

	public void setLn(LayerName ln) {
		this.ln = ln;
	}

	public LayerParams getLp() {
		return lp;
	}

	public void setLp(LayerParams lp) {
		this.lp = lp;
	}
	
	

}

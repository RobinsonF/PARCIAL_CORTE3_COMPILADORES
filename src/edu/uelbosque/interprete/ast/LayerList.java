package edu.uelbosque.interprete.ast;

public class LayerList {

	private LayerList ll;
	private Layer ln;
	
	public LayerList(LayerList ll, Layer ln) {
		this.ll = ll;
		this.ln = ln;
	}

	public LayerList(Layer ln) {
		this.ln = ln;
	}

	public void interpret() {
		if (ll!=null) {
			ll.interpret();
		}		
		ln.interpret();
		
	}

	public LayerList getLl() {
		return ll;
	}

	public void setLl(LayerList ll) {
		this.ll = ll;
	}

	public Layer getLn() {
		return ln;
	}

	public void setLn(Layer ln) {
		this.ln = ln;
	}
	
	

}

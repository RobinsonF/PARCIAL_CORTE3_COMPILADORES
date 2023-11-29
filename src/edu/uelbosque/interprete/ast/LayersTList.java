package edu.uelbosque.interprete.ast;

public class LayersTList {

	private LayersTList ll;
	private Layers ln;

	public LayersTList(LayersTList ll, Layers ln) {
		this.ll = ll;
		this.ln = ln;
	}
	
	public LayersTList(Layers ln) {
		this.ln = ln;
	}

	public void interpret() {
		if (ll!=null) {
			ll.interpret();
		}		
		ln.interpret();	
	}

}

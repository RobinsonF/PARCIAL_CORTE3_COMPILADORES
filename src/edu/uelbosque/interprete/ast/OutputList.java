package edu.uelbosque.interprete.ast;

public class OutputList {

	private OutputList ol;
	private Output o;
	
	public OutputList(OutputList ol, Output o) {
		this.ol = ol;
		this.o = o;
	}

	public OutputList(Output o) {
		this.o = o;
	}

	public void interpret() {
		if (ol!=null) {
			ol.interpret();
		}		
		o.interpret();
	}

	public OutputList getOl() {
		return ol;
	}

	public void setOl(OutputList ol) {
		this.ol = ol;
	}

	public Output getO() {
		return o;
	}

	public void setO(Output o) {
		this.o = o;
	}
	
	

}

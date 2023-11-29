package edu.uelbosque.interprete.ast;

public class OutputName {

	private String v;

	public OutputName(String v) {
		this.v = v;
	}

	public String interpret() {
		return v;
	}

}

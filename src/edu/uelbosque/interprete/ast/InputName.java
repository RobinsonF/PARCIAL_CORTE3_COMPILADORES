package edu.uelbosque.interprete.ast;

import java.util.Scanner;

public class InputName implements AST{

	private String v;

	public InputName(String v) {
		this.v = v;
	}

	public InputName() {
		// TODO Auto-generated constructor stub
	}

	public String interpret() {
		return v;
	}

}

package edu.uelbosque.interprete.ast;

import javax.swing.JOptionPane;

public class Input implements AST{
	
	private InputName in;
	private InputType it;
	private int value;

	public Input(InputName in, InputType it) {
		this.in = in;
		this.it = it;
		this.value = 0;
	}
	
	public void interpret() {
		this.in.interpret();
		this.it.interpret();
		String inputValue = JOptionPane.showInputDialog("Enter input value " + this.in.interpret() + ": ");
		int n = Integer.parseInt(inputValue);
		this.value = n;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}	
	

}

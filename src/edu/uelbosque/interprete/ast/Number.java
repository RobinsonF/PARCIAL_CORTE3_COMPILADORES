package edu.uelbosque.interprete.ast;

import java.util.Scanner;

public class Number extends ValueInteger{
	
	private int N; 

	public Number(String s) {
		try {
			this.N = Integer.parseInt(s);
		} catch (NumberFormatException e) {
			this.N = -1;
		}		
	}

	public int interpret() {
		return this.N;
	}

	public String toString() {
		return ("" + this.N);
	}
	
	public int getN() {
		return N;
	}

	public void setN(int n) {
		N = n;
	}
	
	
}

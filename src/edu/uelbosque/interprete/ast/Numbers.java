package edu.uelbosque.interprete.ast;

import java.util.ArrayList;

public class Numbers {

	private Numbers ns;
	private Number n;
	
	public Numbers(Numbers ns, Number n) {
		this.ns = ns;
		this.n = n;
	}

	public Numbers(Number n) {
		this.n = n;
	}

	public ArrayList<Integer> interpret() {
		ArrayList<Integer> numbers = new ArrayList<>();
		if (ns!=null) {
			numbers.addAll(ns.interpret());
		}		
		numbers.add(n.interpret());
		return numbers;
	}

	public Numbers getNs() {
		return ns;
	}

	public void setNs(Numbers ns) {
		this.ns = ns;
	}

	public Number getN() {
		return n;
	}

	public void setN(Number n) {
		this.n = n;
	}

	
}

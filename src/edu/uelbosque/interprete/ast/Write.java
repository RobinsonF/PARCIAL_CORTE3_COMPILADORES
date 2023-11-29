package edu.uelbosque.interprete.ast;

public class Write {

	private Variable v;
	
	public Write(Variable v) {		
		this.v = v;
	}

	public int interpret() {
		System.out.print("\n>> "  + this.v.getName() + " = " + this.v.interpret());			
		return 0;
	}

}

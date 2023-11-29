package edu.uelbosque.interprete.ast;

public class Output {

	private OutputName on;
	private OutputType ot;
	
	public Output(OutputName on, OutputType ot) {
		this.on = on;
		this.ot = ot;
	}

	public void interpret() {
		this.on.interpret();
		this.ot.interpret();
	}

	public OutputName getOn() {
		return on;
	}

	public void setOn(OutputName on) {
		this.on = on;
	}

	public OutputType getOt() {
		return ot;
	}

	public void setOt(OutputType ot) {
		this.ot = ot;
	}
	
	

}

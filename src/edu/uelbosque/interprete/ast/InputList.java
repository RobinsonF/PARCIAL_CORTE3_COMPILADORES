package edu.uelbosque.interprete.ast;

public class InputList {
	
	private InputList li;
	private Input i;

	public InputList(InputList li, Input i) {
		this.li = li;
		this.i = i;
	}

	public InputList(Input i) {
		this.i = i;
	}
	
	
	public void interpret() {
		if (li!=null) {
			li.interpret();
		}		
		i.interpret();	
	}

	public InputList getLi() {
		return li;
	}

	public void setLi(InputList li) {
		this.li = li;
	}

	public Input getI() {
		return i;
	}

	public void setI(Input i) {
		this.i = i;
	}	
	
	

}

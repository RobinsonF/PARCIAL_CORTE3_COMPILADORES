package edu.uelbosque.interprete.ast;

import java.util.ArrayList;

public class SymbolTable {

	private ArrayList<InputList> inputsList;
	private ArrayList<OutputList> outputsList;
	private ArrayList<LayerParams> layerParams;


	public SymbolTable() {
		this.inputsList = new ArrayList<InputList>();
		this.layerParams = new ArrayList<LayerParams>();
		this.outputsList = new ArrayList<OutputList>();
	}

	public void addInputList(InputList e) {
		this.inputsList.add(e);
	}
	
	public void addOutputList(OutputList e) {
		this.outputsList.add(e);
	}
	
	public void addLayerParams(LayerParams e) {
		this.layerParams.add(e);
	}
	

	public ArrayList<InputList> getInputsList() {
		return inputsList;
	}

	public void setInputsList(ArrayList<InputList> inputsList) {
		this.inputsList = inputsList;
	}


	public ArrayList<LayerParams> getLayerParams() {
		return layerParams;
	}

	public void setLayerParams(ArrayList<LayerParams> layerParams) {
		this.layerParams = layerParams;
	}

	public ArrayList<OutputList> getOutputsList() {
		return outputsList;
	}

	public void setOutputsList(ArrayList<OutputList> outputsList) {
		this.outputsList = outputsList;
	}
	
}

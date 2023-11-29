package edu.uelbosque.interprete.view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class SelectionPanel extends JPanel{
	
	private final String COMMAND_UPLOAD_CODE = "UPLOADCODE";
	private final String COMMAND_VIEW_PARSER = "PARSER";


	private JButton btnUploadCode, btnParser;
	
	public SelectionPanel() {
		setLayout(new GridLayout(2, 1));
		btnUploadCode = new JButton("Subir código");
		btnParser = new JButton("Calcular salidas");
		add(btnUploadCode);
		add(btnParser);
		btnUploadCode.setActionCommand(COMMAND_UPLOAD_CODE);
		btnParser.setActionCommand(COMMAND_VIEW_PARSER);
	}

	public JButton getBtnUploadCode() {
		return btnUploadCode;
	}

	public void setBtnUploadCode(JButton btnUploadCode) {
		this.btnUploadCode = btnUploadCode;
	}


	public String getCOMMAND_UPLOAD_CODE() {
		return COMMAND_UPLOAD_CODE;
	}

	public JButton getBtnParser() {
		return btnParser;
	}

	public void setBtnParser(JButton btnParser) {
		this.btnParser = btnParser;
	}

	public String getCOMMAND_VIEW_PARSER() {
		return COMMAND_VIEW_PARSER;
	}
	
}

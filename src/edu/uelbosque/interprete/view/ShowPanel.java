package edu.uelbosque.interprete.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class ShowPanel extends JPanel{
	
	private JLabel labelResult;

	private JTextArea txtAreaShow;
	
	private JTextArea txtAreaShowResult;
	
	private JTextArea txtAreaShowParser;

	private JPanel panelShowCode;
	
	private JPanel panelShowResult;

	private JPanel panelShowParser;



	public ShowPanel() {
		setLayout(new GridLayout(1, 3));
		labelResult = new JLabel();
		txtAreaShow = new JTextArea();
		panelShowCode = new JPanel();
		panelShowCode.setLayout(new BorderLayout());
		panelShowCode.add(txtAreaShow);
		
		txtAreaShowResult = new JTextArea();
		panelShowResult = new JPanel();
		panelShowResult.setLayout(new BorderLayout());
		panelShowResult.add(txtAreaShowResult);
		
		txtAreaShowParser = new JTextArea();
		panelShowParser = new JPanel();
		panelShowParser.setLayout(new BorderLayout());
		panelShowParser.add(txtAreaShowParser);
		
		TitledBorder titledBorder = BorderFactory.createTitledBorder("Código");
        panelShowCode.setBorder(titledBorder);
        TitledBorder titledBorder2 = BorderFactory.createTitledBorder("Tokenizador");
        panelShowResult.setBorder(titledBorder2);
        TitledBorder titledBorder3 = BorderFactory.createTitledBorder("Salidas");
        panelShowParser.setBorder(titledBorder3);
        
        JScrollPane scrollPaneCode = new JScrollPane(panelShowCode);
        JScrollPane scrollPaneResult = new JScrollPane(panelShowResult);
        JScrollPane scrollPaneParser = new JScrollPane(panelShowParser);
        
        
		this.add(scrollPaneCode);
		this.add(scrollPaneResult);
		this.add(scrollPaneParser);

	}

	public JLabel getLabelResult() {
		return labelResult;
	}

	public void setLabelResult(JLabel labelResult) {
		this.labelResult = labelResult;
	}

	public JTextArea getTxtAreaShow() {
		return txtAreaShow;
	}

	public void setTxtAreaShow(JTextArea txtAreaShow) {
		this.txtAreaShow = txtAreaShow;
	}

	public JTextArea getTxtAreaShowResult() {
		return txtAreaShowResult;
	}

	public void setTxtAreaShowResult(JTextArea txtAreaShowResult) {
		this.txtAreaShowResult = txtAreaShowResult;
	}

	public JPanel getPanelShowCode() {
		return panelShowCode;
	}

	public void setPanelShowCode(JPanel panelShowCode) {
		this.panelShowCode = panelShowCode;
	}

	public JPanel getPanelShowResult() {
		return panelShowResult;
	}

	public void setPanelShowResult(JPanel panelShowResult) {
		this.panelShowResult = panelShowResult;
	}

	public JTextArea getTxtAreaShowParser() {
		return txtAreaShowParser;
	}

	public void setTxtAreaShowParser(JTextArea txtAreaShowParser) {
		this.txtAreaShowParser = txtAreaShowParser;
	}

	public JPanel getPanelShowParser() {
		return panelShowParser;
	}

	public void setPanelShowParser(JPanel panelShowParser) {
		this.panelShowParser = panelShowParser;
	}
	
}

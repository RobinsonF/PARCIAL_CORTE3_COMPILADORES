package edu.uelbosque.interprete.main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;

import edu.uelbosque.interprete.ast.Document;
import edu.uelbosque.interprete.lexer.Lexer;
import edu.uelbosque.interprete.parser.parser;
import edu.uelbosque.interprete.view.View;

public class Controller implements ActionListener {

	private View view;
	private Model model;
	private String codigo = "";
	private File input;
	private Reader reader = null;
	private Lexer scanner = null;
	private parser parser;
	private Document programa_axioma = null;

	public Controller() {
		this.view = new View(this);
		this.model = new Model();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		if (command.equals(view.getSelectionPanel().getCOMMAND_UPLOAD_CODE())) {
			try {
				this.input = view.connectFileChooser();
				model.uploadFile(input);
				this.codigo = model.getAllFile();
				this.codigo = model.removeComments(this.codigo);
				this.view.getShowPanel().getShowPanel().getTxtAreaShow().setText(this.codigo);
			    this.reader = new FileReader(input);
			} catch (Exception ex) {
				ex.printStackTrace();
			}

		}

		if (command.equals(view.getSelectionPanel().getCOMMAND_VIEW_PARSER())) {

			try {
				if (this.scanner == null) {
				    this.scanner = new Lexer(this.reader);
				    this.parser = new parser(this.scanner);
				    this.programa_axioma = (Document) this.parser.parse().value;
				    this.programa_axioma.interpret();
				} else {
				    this.programa_axioma.interpret();
				}
				this.view.getShowPanel().getShowPanel().getTxtAreaShowResult().setText(this.scanner.getData());

			} catch (Exception ex) {
				ex.printStackTrace();
			}

			if (this.scanner.getError().length() == 0) {
				String salidas = "";
				int inputList = parser.getSt().getInputsList().size();
				int outputList = parser.getSt().getOutputsList().size();
				if (inputList == outputList) {
					int layerSize = parser.getSt().getLayerParams().size();
					int salida = 0;
					for (int i = 0; i < parser.getSt().getInputsList().size(); i++) {
						int num = parser.getSt().getInputsList().get(i).getI().getValue();
						int valor = 0;
						if (layerSize == 0) {
							salidas += "Output " + (i + 1) + " = " + num + "\n";
						} else {
							for (int k = 0; k < parser.getSt().getLayerParams().size(); k++) {
								for (int l = 0; l < parser.getSt().getLayerParams().get(k).getNs().interpret()
										.size(); l++) {
									valor += num * parser.getSt().getLayerParams().get(k).getNs().interpret().get(l);
								}
								num = valor;
								salida = valor;
								valor = 0;
							}
						}
						salidas += "Output " + (parser.getSt().getOutputsList().get(i).getO().getOn().interpret()) + " = " + salida + "\n";
					}
					this.view.getShowPanel().getShowPanel().getTxtAreaShowParser().setText(salidas);

				} else {
					view.showErrorMessage("The number of inputs matches the number of outputs");
				}
			} else {
				this.view.getShowPanel().getShowPanel().getTxtAreaShowParser().setText(this.scanner.getError());
			}
		}

	}

	static int contexterror = 0;

	public static void error(String s) {
		System.out.println((contexterror++) + ". " + s);
	}

}

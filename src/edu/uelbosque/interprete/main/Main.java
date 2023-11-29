package edu.uelbosque.interprete.main;

import edu.uelbosque.interprete.ast.Document;
import edu.uelbosque.interprete.ast.Layer;
import edu.uelbosque.interprete.lexer.*;
import edu.uelbosque.interprete.parser.*;

import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		Controller controller = new Controller();
//		Reader reader = null;
//
//		File input = new File("CodigoPrueba.txt");
//
//		reader = new FileReader(input);
//
//		Lexer scanner = new Lexer(reader);
//
//		parser parser = new parser(scanner);
//
//		Document programa_axioma = null;
//
//		try {
//			programa_axioma = (Document) parser.parse().value;
//			programa_axioma.interpret();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		int inputList = parser.getSt().getInputsList().size();
//		int outputList = parser.getSt().getOutputsList().size();
//		if(inputList == outputList) {
//			int layerSize = parser.getSt().getLayerParams().size();
//			for (int i = 0; i < parser.getSt().getInputsList().size(); i++) {
//				int num = parser.getSt().getInputsList().get(i).getI().getValue();
//				int valor = 0;
//				int salida = 0;
//				if (layerSize == 0) {
//					System.out.println("Salida " + (i + 1) + " = " + num);
//				} else {
//					for (int k = 0; k < parser.getSt().getLayerParams().size(); k++) {
//						for (int l = 0; l < parser.getSt().getLayerParams().get(k).getNs().interpret().size(); l++) {
//							valor += num * parser.getSt().getLayerParams().get(k).getNs().interpret().get(l);
//						}
//						num = valor;
//						salida = valor;
//						valor = 0;
//					}
//				}
//				System.out.println("Output " + (i + 1) + " = " + salida );
//			}
//
//		}else {
//			System.out.print("La cantidad de inputs con coincide con la cantidad de outputs");
//		}
		
		
	}

	static int contexterror = 0;

	public static void error(String s) {
		System.out.println((contexterror++) + ". " + s);
	}
}

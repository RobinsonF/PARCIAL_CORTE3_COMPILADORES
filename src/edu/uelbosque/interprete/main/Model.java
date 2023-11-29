package edu.uelbosque.interprete.main;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import edu.uelbosque.interprete.persistence.ReadFileClass;

public class Model {
	
	private String allFile;
		
	private File file;
	
	private ReadFileClass readFileClass;
		
	public Model(){
		file = null;
	}
	
	public void uploadFile(File file) {
		this.file = file;
		if (file != null) {
			readFileClass = new ReadFileClass(file);
			allFile = readFileClass.readFile();
		}
	}
	
	 public String removeComments(String line) {
	        line = line.replaceAll("//.*", "");
	        Pattern pattern = Pattern.compile("#.*?(?=\\n|\\Z)", Pattern.DOTALL);
	        Matcher matcher = pattern.matcher(line);
	        line = matcher.replaceAll("");
			return line;
	    }

	public String getAllFile() {
		return allFile;
	}

	public void setAllFile(String allFile) {
		this.allFile = allFile;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

}

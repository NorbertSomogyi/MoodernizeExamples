package application;

public class tr2_cfg_data {
	private Object file;
	private int line;
	
	public tr2_cfg_data(Object file, int line) {
		setFile(file);
		setLine(line);
	}
	public tr2_cfg_data() {
	}
	
	public Object getFile() {
		return file;
	}
	public void setFile(Object newFile) {
		file = newFile;
	}
	public int getLine() {
		return line;
	}
	public void setLine(int newLine) {
		line = newLine;
	}
}

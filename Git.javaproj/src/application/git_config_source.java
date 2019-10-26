package application;

public class git_config_source {
	private int use_stdin;
	private Object file;
	private Object blob;
	
	public git_config_source(int use_stdin, Object file, Object blob) {
		setUse_stdin(use_stdin);
		setFile(file);
		setBlob(blob);
	}
	public git_config_source() {
	}
	
	public int getUse_stdin() {
		return use_stdin;
	}
	public void setUse_stdin(int newUse_stdin) {
		use_stdin = newUse_stdin;
	}
	public Object getFile() {
		return file;
	}
	public void setFile(Object newFile) {
		file = newFile;
	}
	public Object getBlob() {
		return blob;
	}
	public void setBlob(Object newBlob) {
		blob = newBlob;
	}
}

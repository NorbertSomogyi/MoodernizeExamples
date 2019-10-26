package application;

public class upload_status {
	private int lines_read;
	
	public upload_status(int lines_read) {
		setLines_read(lines_read);
	}
	public upload_status() {
	}
	
	public int getLines_read() {
		return lines_read;
	}
	public void setLines_read(int newLines_read) {
		lines_read = newLines_read;
	}
}

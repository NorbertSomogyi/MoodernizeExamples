package application;

public class ftp_wc {
	private Object parser;
	private  backup;
	
	public ftp_wc(Object parser,  backup) {
		setParser(parser);
		setBackup(backup);
	}
	public ftp_wc() {
	}
	
	public Object getParser() {
		return parser;
	}
	public void setParser(Object newParser) {
		parser = newParser;
	}
	public  getBackup() {
		return backup;
	}
	public void setBackup( newBackup) {
		backup = newBackup;
	}
}

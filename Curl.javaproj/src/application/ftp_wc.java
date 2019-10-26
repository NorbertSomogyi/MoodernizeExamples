package application;

public class ftp_wc {
	private ftp_parselist_data parser;
	private  backup;
	
	public ftp_wc(ftp_parselist_data parser,  backup) {
		setParser(parser);
		setBackup(backup);
	}
	public ftp_wc() {
	}
	
	public ftp_parselist_data getParser() {
		return parser;
	}
	public void setParser(ftp_parselist_data newParser) {
		parser = newParser;
	}
	public  getBackup() {
		return backup;
	}
	public void setBackup( newBackup) {
		backup = newBackup;
	}
}

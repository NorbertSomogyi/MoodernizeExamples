package application;

public class logfile_ctx {
	private boolean enabled;
	private Byte logfile;
	private Byte topid;
	private Byte subid;
	
	public logfile_ctx(boolean enabled, Byte logfile, Byte topid, Byte subid) {
		setEnabled(enabled);
		setLogfile(logfile);
		setTopid(topid);
		setSubid(subid);
	}
	public logfile_ctx() {
	}
	
	public boolean getEnabled() {
		return enabled;
	}
	public void setEnabled(boolean newEnabled) {
		enabled = newEnabled;
	}
	public Byte getLogfile() {
		return logfile;
	}
	public void setLogfile(Byte newLogfile) {
		logfile = newLogfile;
	}
	public Byte getTopid() {
		return topid;
	}
	public void setTopid(Byte newTopid) {
		topid = newTopid;
	}
	public Byte getSubid() {
		return subid;
	}
	public void setSubid(Byte newSubid) {
		subid = newSubid;
	}
}

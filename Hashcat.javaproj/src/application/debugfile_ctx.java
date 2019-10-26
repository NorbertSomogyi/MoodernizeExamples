package application;

public class debugfile_ctx {
	private hc_fp fp;
	private boolean enabled;
	private Byte filename;
	private Object mode;
	
	public debugfile_ctx(hc_fp fp, boolean enabled, Byte filename, Object mode) {
		setFp(fp);
		setEnabled(enabled);
		setFilename(filename);
		setMode(mode);
	}
	public debugfile_ctx() {
	}
	
	public hc_fp getFp() {
		return fp;
	}
	public void setFp(hc_fp newFp) {
		fp = newFp;
	}
	public boolean getEnabled() {
		return enabled;
	}
	public void setEnabled(boolean newEnabled) {
		enabled = newEnabled;
	}
	public Byte getFilename() {
		return filename;
	}
	public void setFilename(Byte newFilename) {
		filename = newFilename;
	}
	public Object getMode() {
		return mode;
	}
	public void setMode(Object newMode) {
		mode = newMode;
	}
}

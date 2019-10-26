package application;

public class loopback_ctx {
	private hc_fp fp;
	private boolean enabled;
	private boolean unused;
	private Byte filename;
	
	public loopback_ctx(hc_fp fp, boolean enabled, boolean unused, Byte filename) {
		setFp(fp);
		setEnabled(enabled);
		setUnused(unused);
		setFilename(filename);
	}
	public loopback_ctx() {
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
	public boolean getUnused() {
		return unused;
	}
	public void setUnused(boolean newUnused) {
		unused = newUnused;
	}
	public Byte getFilename() {
		return filename;
	}
	public void setFilename(Byte newFilename) {
		filename = newFilename;
	}
}

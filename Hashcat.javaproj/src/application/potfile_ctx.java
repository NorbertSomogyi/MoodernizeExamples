package application;

public class potfile_ctx {
	private hc_fp fp;
	private boolean enabled;
	private Byte filename;
	private Object out_buf;
	private Object tmp_buf;
	
	public potfile_ctx(hc_fp fp, boolean enabled, Byte filename, Object out_buf, Object tmp_buf) {
		setFp(fp);
		setEnabled(enabled);
		setFilename(filename);
		setOut_buf(out_buf);
		setTmp_buf(tmp_buf);
	}
	public potfile_ctx() {
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
	public Object getOut_buf() {
		return out_buf;
	}
	public void setOut_buf(Object newOut_buf) {
		out_buf = newOut_buf;
	}
	public Object getTmp_buf() {
		return tmp_buf;
	}
	public void setTmp_buf(Object newTmp_buf) {
		tmp_buf = newTmp_buf;
	}
}

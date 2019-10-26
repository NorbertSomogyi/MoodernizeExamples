package application;

public class outfile_ctx {
	private hc_fp fp;
	private Object outfile_format;
	private boolean outfile_autohex;
	private Byte filename;
	
	public outfile_ctx(hc_fp fp, Object outfile_format, boolean outfile_autohex, Byte filename) {
		setFp(fp);
		setOutfile_format(outfile_format);
		setOutfile_autohex(outfile_autohex);
		setFilename(filename);
	}
	public outfile_ctx() {
	}
	
	public hc_fp getFp() {
		return fp;
	}
	public void setFp(hc_fp newFp) {
		fp = newFp;
	}
	public Object getOutfile_format() {
		return outfile_format;
	}
	public void setOutfile_format(Object newOutfile_format) {
		outfile_format = newOutfile_format;
	}
	public boolean getOutfile_autohex() {
		return outfile_autohex;
	}
	public void setOutfile_autohex(boolean newOutfile_autohex) {
		outfile_autohex = newOutfile_autohex;
	}
	public Byte getFilename() {
		return filename;
	}
	public void setFilename(Byte newFilename) {
		filename = newFilename;
	}
}

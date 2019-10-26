package application;

public class argentry {
	private Object ae_fname;
	private int ae_fnum;
	
	public argentry(Object ae_fname, int ae_fnum) {
		setAe_fname(ae_fname);
		setAe_fnum(ae_fnum);
	}
	public argentry() {
	}
	
	public Object alist_name() {
		buf_T bp = new buf_T();
		int generatedAe_fnum = this.getAe_fnum();
		file_buffer file_buffer = new file_buffer();
		// Use the name from the associated buffer if it exists.// Use the name from the associated buffer if it exists.bp = file_buffer.buflist_findnr(generatedAe_fnum);
		Object generatedB_fname = bp.getB_fname();
		Object generatedAe_fname = this.getAe_fname();
		if (bp == ((Object)0) || generatedB_fname == ((Object)0)) {
			return generatedAe_fname;
		} 
		return generatedB_fname;
	}
	public Object getAe_fname() {
		return ae_fname;
	}
	public void setAe_fname(Object newAe_fname) {
		ae_fname = newAe_fname;
	}
	public int getAe_fnum() {
		return ae_fnum;
	}
	public void setAe_fnum(int newAe_fnum) {
		ae_fnum = newAe_fnum;
	}
}

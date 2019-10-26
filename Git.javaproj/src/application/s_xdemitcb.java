package application;

public class s_xdemitcb {
	private Object priv;
	private Object out_hunk;
	private Object out_line;
	
	public s_xdemitcb(Object priv, Object out_hunk, Object out_line) {
		setPriv(priv);
		setOut_hunk(out_hunk);
		setOut_line(out_line);
	}
	public s_xdemitcb() {
	}
	
	public int xdl_emit_diffrec(Object rec, long size, Object pre, long psize) {
		int i = 2;
		mmbuffer_t[] mb = new mmbuffer_t();
		mb[0].setPtr((byte)pre);
		mb[0].setSize(psize);
		mb[1].setPtr((byte)rec);
		mb[1].setSize(size);
		if (size > 0 && rec[size - 1] != (byte)'\n') {
			mb[2].setPtr((byte)"\n\\ No newline at end of file\n");
			mb[2].setSize(.strlen(mb[2].getPtr()));
			i++;
		} 
		Object generatedPriv = this.getPriv();
		if (.UNRECOGNIZEDFUNCTIONNAME(generatedPriv, mb, i) < 0) {
			return -1;
		} 
		return 0;
	}
	public int xdl_format_hunk_hdr(long s1, long c1, long s2, long c2, Object func, long funclen) {
		int nb = 0;
		mmbuffer_t mb = new mmbuffer_t();
		byte[] buf = new byte[128];
		.memcpy(buf, "@@ -", 4);
		nb += 4;
		nb += ModernizedCProgram.xdl_num_out(buf + nb, c1 ? s1 : s1 - 1);
		if (c1 != 1) {
			.memcpy(buf + nb, ",", 1);
			nb += 1;
			nb += ModernizedCProgram.xdl_num_out(buf + nb, c1);
		} 
		.memcpy(buf + nb, " +", 2);
		nb += 2;
		nb += ModernizedCProgram.xdl_num_out(buf + nb, c2 ? s2 : s2 - 1);
		if (c2 != 1) {
			.memcpy(buf + nb, ",", 1);
			nb += 1;
			nb += ModernizedCProgram.xdl_num_out(buf + nb, c2);
		} 
		.memcpy(buf + nb, " @@", 3);
		nb += 3;
		if (func && funclen) {
			buf[nb++] = (byte)' ';
			if (funclen >  - nb - 1) {
				funclen =  - nb - 1;
			} 
			.memcpy(buf + nb, func, funclen);
			nb += funclen;
		} 
		buf[nb++] = (byte)'\n';
		mb.setPtr(buf);
		mb.setSize(nb);
		Object generatedPriv = this.getPriv();
		if (.UNRECOGNIZEDFUNCTIONNAME(generatedPriv, mb, 1) < 0) {
			return -1;
		} 
		return 0;
	}
	public int xdl_emit_hunk_hdr(long s1, long c1, long s2, long c2, Object func, long funclen) {
		Object generatedOut_hunk = this.getOut_hunk();
		if (!generatedOut_hunk) {
			return ecb.xdl_format_hunk_hdr(s1, c1, s2, c2, func, funclen);
		} 
		Object generatedPriv = this.getPriv();
		if (.UNRECOGNIZEDFUNCTIONNAME(generatedPriv, c1 ? s1 : s1 - 1, c1, c2 ? s2 : s2 - 1, c2, func, funclen) < 0) {
			return -1;
		} 
		return 0;
	}
	public Object getPriv() {
		return priv;
	}
	public void setPriv(Object newPriv) {
		priv = newPriv;
	}
	public Object getOut_hunk() {
		return out_hunk;
	}
	public void setOut_hunk(Object newOut_hunk) {
		out_hunk = newOut_hunk;
	}
	public Object getOut_line() {
		return out_line;
	}
	public void setOut_line(Object newOut_line) {
		out_line = newOut_line;
	}
}

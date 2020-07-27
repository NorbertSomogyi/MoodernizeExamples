package application;

public class s_xdemitcb {
	private Object priv;
	private Object outf;
	
	public s_xdemitcb(Object priv, Object outf) {
		setPriv(priv);
		setOutf(outf);
	}
	public s_xdemitcb() {
	}
	
	public int xdl_emit_diffrec(Object[] rec, long size, Object pre, long psize) {
		int i = 2;
		mmbuffer_t[] mb = new mmbuffer_t();
		mb[0].setPtr((byte)pre);
		mb[0].setSize(psize);
		mb[1].setPtr((byte)rec);
		mb[1].setSize(size);
		if (size > 0 && rec[size - 1] != (byte)'\n') {
			mb[2].setPtr((byte)"\n\\ No newline at end of file\n");
			mb[2].setSize((long)/*Error: Function owner not recognized*/strlen(mb[2].getPtr()));
			i++;
		} 
		Object generatedPriv = this.getPriv();
		if (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedPriv, mb, i) < 0) {
			return -1;
		} 
		return 0;
	}
	public int xdl_emit_hunk_hdr(long s1, long c1, long s2, long c2, Object func, long funclen) {
		int nb = 0;
		mmbuffer_t mb = new mmbuffer_t();
		byte[] buf = new byte[128];
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(buf, "@@ -", 4);
		nb += 4;
		nb += ModernizedCProgram.xdl_num_out(buf + nb, c1 ? s1 : s1 - 1);
		if (c1 != 1) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(buf + nb, ",", 1);
			nb += 1;
			nb += ModernizedCProgram.xdl_num_out(buf + nb, c1);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(buf + nb, " +", 2);
		nb += 2;
		nb += ModernizedCProgram.xdl_num_out(buf + nb, c2 ? s2 : s2 - 1);
		if (c2 != 1) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(buf + nb, ",", 1);
			nb += 1;
			nb += ModernizedCProgram.xdl_num_out(buf + nb, c2);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(buf + nb, " @@", 3);
		nb += 3;
		if (func && funclen) {
			buf[nb++] = (byte)' ';
			if (funclen > (long)/*Error: sizeof expression not supported yet*/ - nb - 1) {
				funclen = /*Error: sizeof expression not supported yet*/ - nb - 1;
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(buf + nb, func, funclen);
			nb += funclen;
		} 
		buf[nb++] = (byte)'\n';
		mb.setPtr(buf);
		mb.setSize(nb);
		Object generatedPriv = this.getPriv();
		if (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedPriv, mb, 1) < 0) {
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
	public Object getOutf() {
		return outf;
	}
	public void setOutf(Object newOutf) {
		outf = newOutf;
	}
}

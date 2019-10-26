package application;

public class update_info_ctx {
	private _iobuf cur_fp;
	private _iobuf old_fp;
	private strbuf cur_sb;
	private strbuf old_sb;
	
	public update_info_ctx(_iobuf cur_fp, _iobuf old_fp, strbuf cur_sb, strbuf old_sb) {
		setCur_fp(cur_fp);
		setOld_fp(old_fp);
		setCur_sb(cur_sb);
		setOld_sb(old_sb);
	}
	public update_info_ctx() {
	}
	
	public void uic_mark_stale() {
		_iobuf generatedOld_fp = this.getOld_fp();
		.fclose(generatedOld_fp);
		this.setOld_fp(((Object)0));
	}
	public int uic_printf(Object fmt) {
		va_list ap = new va_list();
		int ret = -1;
		.__builtin_va_start(ap, fmt);
		_iobuf generatedCur_fp = this.getCur_fp();
		strbuf generatedCur_sb = this.getCur_sb();
		strbuf generatedOld_sb = this.getOld_sb();
		Object generatedLen = cur.getLen();
		byte generatedBuf = old.getBuf();
		_iobuf generatedOld_fp = this.getOld_fp();
		if (ModernizedCProgram.uic_is_stale(uic)) {
			ret = .vfprintf(generatedCur_fp, fmt, ap);
		} else {
				ssize_t r = new ssize_t();
				strbuf cur = generatedCur_sb;
				strbuf old = generatedOld_sb;
				cur.strbuf_setlen(0);
				cur.strbuf_vinsertf(0, fmt, ap);
				old.strbuf_setlen(0);
				old.strbuf_grow(generatedLen);
				r = .fread(generatedBuf, 1, generatedLen, generatedOld_fp);
				if (r != generatedLen || .memcmp(generatedBuf, generatedBuf, r)) {
					uic.uic_mark_stale();
				} 
				if (.fwrite(generatedBuf, 1, generatedLen, generatedCur_fp) == generatedLen) {
					ret = 0;
				} 
		} 
		.__builtin_va_end(ap);
		return ret/*
		 * Create the file "path" by writing to a temporary file and renaming
		 * it into place. The contents of the file come from "generate", which
		 * should return non-zero if it encounters an error.
		 */;
	}
	public int generate_info_refs() {
		return ModernizedCProgram.for_each_ref(add_info_ref, uic);
	}
	public int write_pack_info_file() {
		int i;
		for (i = 0; i < ModernizedCProgram.num_pack; i++) {
			if (uic.uic_printf("P %s\n", info[i].getP().pack_basename()) < 0) {
				return -1;
			} 
		}
		if (uic.uic_printf("\n") < 0) {
			return -1;
		} 
		return 0;
	}
	public _iobuf getCur_fp() {
		return cur_fp;
	}
	public void setCur_fp(_iobuf newCur_fp) {
		cur_fp = newCur_fp;
	}
	public _iobuf getOld_fp() {
		return old_fp;
	}
	public void setOld_fp(_iobuf newOld_fp) {
		old_fp = newOld_fp;
	}
	public strbuf getCur_sb() {
		return cur_sb;
	}
	public void setCur_sb(strbuf newCur_sb) {
		cur_sb = newCur_sb;
	}
	public strbuf getOld_sb() {
		return old_sb;
	}
	public void setOld_sb(strbuf newOld_sb) {
		old_sb = newOld_sb;
	}
}

package application;

public class dirent_prec_psx {
	private Object d_ino;
	private Object max_name_len;
	private byte d_type;
	private Object d_name;
	
	public dirent_prec_psx(Object d_ino, Object max_name_len, byte d_type, Object d_name) {
		setD_ino(d_ino);
		setMax_name_len(max_name_len);
		setD_type(d_type);
		setD_name(d_name);
	}
	public dirent_prec_psx() {
	}
	
	public dirent_prec_psx precompose_utf8_readdir( prec_dir) {
		dirent res = new dirent();
		Object generatedDirp = prec_dir.getDirp();
		dirent dirent = new dirent();
		res = dirent.readdir(generatedDirp);
		Object generatedD_name = res.getD_name();
		Object generatedDirent_nfc = prec_dir.getDirent_nfc();
		Object generatedD_ino = res.getD_ino();
		byte generatedD_type = res.getD_type();
		Object generatedIc_precompose = prec_dir.getIc_precompose();
		if (res) {
			size_t namelenz = .strlen(generatedD_name) + /* \0 */1;
			size_t new_maxlen = namelenz;
			int ret_errno = (._errno());
			if (new_maxlen > generatedDirent_nfc.getMax_name_len()) {
				size_t new_len =  + new_maxlen - ;
				prec_dir.setDirent_nfc(ModernizedCProgram.xrealloc(generatedDirent_nfc, new_len));
				generatedDirent_nfc.setMax_name_len(new_maxlen);
			} 
			generatedDirent_nfc.setD_ino(generatedD_ino);
			generatedDirent_nfc.setD_type(generatedD_type);
			if ((ModernizedCProgram.precomposed_unicode == 1) && ModernizedCProgram.has_non_ascii(generatedD_name, (size_t)-1, ((Object)0))) {
				if (generatedIc_precompose == (iconv_t) - 1) {
					ModernizedCProgram.die("iconv_open(%s,%s) failed, but needed:\n    precomposed unicode is not supported.\n    If you want to use decomposed unicode, run\n    \"git config core.precomposeunicode false\"\n", ModernizedCProgram.repo_encoding, ModernizedCProgram.path_encoding);
				} else {
						iconv_ibp cp = (iconv_ibp)generatedD_name;
						size_t inleft = namelenz;
						byte outpos = generatedD_name[0];
						size_t outsz = generatedDirent_nfc.getMax_name_len();
						(._errno()) = 0;
						.iconv(generatedIc_precompose, cp, inleft, outpos, outsz);
						if ((._errno()) || inleft/*
											 * iconv() failed and errno could be E2BIG, EILSEQ, EINVAL, EBADF
											 * MacOS X avoids illegal byte sequences.
											 * If they occur on a mounted drive (e.g. NFS) it is not worth to
											 * die() for that, but rather let the user see the original name
											*/) {
							namelenz = /* trigger strlcpy */0;
						} 
				} 
			} else {
					namelenz = 0;
			} 
			if (!namelenz) {
				.strlcpy(generatedD_name, generatedD_name, generatedDirent_nfc.getMax_name_len());
			} 
			(._errno()) = ret_errno;
			return generatedDirent_nfc;
		} 
		return ((Object)0);
	}
	public Object getD_ino() {
		return d_ino;
	}
	public void setD_ino(Object newD_ino) {
		d_ino = newD_ino;
	}
	public Object getMax_name_len() {
		return max_name_len;
	}
	public void setMax_name_len(Object newMax_name_len) {
		max_name_len = newMax_name_len;
	}
	public byte getD_type() {
		return d_type;
	}
	public void setD_type(byte newD_type) {
		d_type = newD_type;
	}
	public Object getD_name() {
		return d_name;
	}
	public void setD_name(Object newD_name) {
		d_name = newD_name;
	}
}

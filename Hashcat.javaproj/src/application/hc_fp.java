package application;

// file handling
public class hc_fp {
	private int fd;
	private _iobuf pfp;
	private Object gfp;
	private Object ufp;
	private boolean is_gzip;
	private boolean is_zip;
	private Byte mode;
	private Object path;
	
	public hc_fp(int fd, _iobuf pfp, Object gfp, Object ufp, boolean is_gzip, boolean is_zip, Byte mode, Object path) {
		setFd(fd);
		setPfp(pfp);
		setGfp(gfp);
		setUfp(ufp);
		setIs_gzip(is_gzip);
		setIs_zip(is_zip);
		setMode(mode);
		setPath(path);
	}
	public hc_fp() {
	}
	
	/**
	 * Author......: See docs/credits.txt
	 * License.....: MIT
	 */
	/* Needs this loop because a signal may interrupt a wait for lock */
	public int hc_lockfile() {
		// we should put windows specific code herereturn 0;
	}
	public int hc_unlockfile() {
		// we should put windows specific code herereturn 0;// F_SETLKW
	}
	/**
	 * Author......: See docs/credits.txt
	 * License.....: MIT
	 */
	// workaround for zlib with cygwin build
	public boolean hc_fopen(Object path, Byte mode) {
		if (path == ((Object)0) || mode == ((Object)0)) {
			return 0;
		} 
		int oflag = -1;
		int fmode = -1024 | -1024;
		if (.strncmp(mode, "a", 1) == 0 || .strncmp(mode, "ab", 2) == 0) {
			oflag = 1 | -1024 | -1024;
			if (.strncmp(mode, "ab", 2) == 0) {
				oflag |=  -1024;
			} 
		}  else if (.strncmp(mode, "r", 1) == 0 || .strncmp(mode, "rb", 2) == 0) {
			oflag = 0;
			fmode = -1;
			if (.strncmp(mode, "rb", 2) == 0) {
				oflag |=  -1024;
			} 
		}  else if (.strncmp(mode, "w", 1) == 0 || .strncmp(mode, "wb", 2) == 0) {
			oflag = 1 | -1024 | -1024;
			if (.strncmp(mode, "wb", 2) == 0) {
				oflag |=  -1024;
			} 
		} else {
				return 0;
		} 
		this.setPfp(((Object)0));
		this.setIs_gzip(0);
		this.setIs_zip(0);
		byte[] check = new byte[]{0};
		int fd_tmp = ModernizedCProgram.open(path, 0);
		if (fd_tmp != -1) {
			.lseek(fd_tmp, 0, 0);
			if (.read(fd_tmp, check, ) > 0) {
				if (check[0] == -1024 && check[1] == -1024 && check[2] == -1024 && check[3] == -1024) {
					this.setIs_gzip(1);
				} 
				if (check[0] == -1024 && check[1] == -1024 && check[2] == -1024 && check[3] == -1024) {
					this.setIs_zip(1);
				} 
			} 
			ModernizedCProgram.close(fd_tmp);
		} 
		if (fmode == -1) {
			this.setFd(ModernizedCProgram.open(path, oflag));
		} else {
				this.setFd(ModernizedCProgram.open(path, oflag, fmode));
		} 
		int generatedFd = this.getFd();
		boolean generatedIs_zip = this.getIs_zip();
		if (generatedFd == -1 && generatedIs_zip == false) {
			return 0;
		} 
		boolean generatedIs_gzip = this.getIs_gzip();
		Object generatedUfp = this.getUfp();
		if (generatedIs_gzip) {
			if ((this.setGfp(ModernizedCProgram.gzdopen(generatedFd, mode))) == ((Object)0)) {
				return 0;
			} 
		}  else if (generatedIs_zip) {
			if ((this.setUfp(ModernizedCProgram.unzOpen64(path))) == ((Object)0)) {
				return 0;
			} 
			if (ModernizedCProgram.unzOpenCurrentFile(generatedUfp) != UNZ_OK) {
				return 0;
			} 
		} else {
				if ((this.setPfp(.fdopen(generatedFd, mode))) == ((Object)0)) {
					return 0;
				} 
		} 
		this.setPath(path);
		this.setMode(mode);
		return 1;
	}
	public Object hc_fread(Object ptr, Object size, Object nmemb) {
		size_t n = -1;
		if (fp == ((Object)0)) {
			return n;
		} 
		boolean generatedIs_gzip = this.getIs_gzip();
		Object generatedGfp = this.getGfp();
		boolean generatedIs_zip = this.getIs_zip();
		Object generatedUfp = this.getUfp();
		_iobuf generatedPfp = this.getPfp();
		if (generatedIs_gzip) {
			n = ModernizedCProgram.gzfread(ptr, size, nmemb, generatedGfp);
		}  else if (generatedIs_zip) {
			int s = size * nmemb;
			n = ModernizedCProgram.unzReadCurrentFile(generatedUfp, ptr, s);
		} else {
				n = .fread(ptr, size, nmemb, generatedPfp);
		} 
		return n;
	}
	public Object hc_fwrite(Object ptr, Object size, Object nmemb) {
		size_t n = -1;
		if (fp == ((Object)0)) {
			return n;
		} 
		boolean generatedIs_gzip = this.getIs_gzip();
		Object generatedGfp = this.getGfp();
		boolean generatedIs_zip = this.getIs_zip();
		_iobuf generatedPfp = this.getPfp();
		if (generatedIs_gzip) {
			n = ModernizedCProgram.gzfwrite(ptr, size, nmemb, generatedGfp);
		}  else if (generatedIs_zip) {
		} else {
				n = .fwrite(ptr, size, nmemb, generatedPfp);
		} 
		if (n != nmemb) {
			return -1;
		} 
		return n;
	}
	public int hc_fseek(Object offset, int whence) {
		int r = -1;
		if (fp == ((Object)0)) {
			return r;
		} 
		boolean generatedIs_gzip = this.getIs_gzip();
		Object generatedGfp = this.getGfp();
		boolean generatedIs_zip = this.getIs_zip();
		_iobuf generatedPfp = this.getPfp();
		if (generatedIs_gzip) {
			r = ModernizedCProgram.gzseek(generatedGfp, offset, whence);
		}  else if (generatedIs_zip) {
		} else {
				r = .fseeko(generatedPfp, offset, whence);
		} 
		return r;
	}
	public void hc_rewind() {
		if (fp == ((Object)0)) {
			return ;
		} 
		boolean generatedIs_gzip = this.getIs_gzip();
		Object generatedGfp = this.getGfp();
		boolean generatedIs_zip = this.getIs_zip();
		Object generatedUfp = this.getUfp();
		_iobuf generatedPfp = this.getPfp();
		if (generatedIs_gzip) {
			ModernizedCProgram.gzrewind(generatedGfp);
		}  else if (generatedIs_zip) {
			ModernizedCProgram.unzGoToFirstFile(generatedUfp);
		} else {
				.rewind(generatedPfp);
		} 
	}
	public Object hc_ftell() {
		off_t n = 0;
		if (fp == ((Object)0)) {
			return -1;
		} 
		boolean generatedIs_gzip = this.getIs_gzip();
		Object generatedGfp = this.getGfp();
		boolean generatedIs_zip = this.getIs_zip();
		Object generatedUfp = this.getUfp();
		_iobuf generatedPfp = this.getPfp();
		if (generatedIs_gzip) {
			n = (off_t)ModernizedCProgram.gztell(generatedGfp);
		}  else if (generatedIs_zip) {
			n = ModernizedCProgram.unztell(generatedUfp);
		} else {
				n = .ftello(generatedPfp);
		} 
		return n;
	}
	public int hc_fputc(int c) {
		int r = -1;
		if (fp == ((Object)0)) {
			return r;
		} 
		boolean generatedIs_gzip = this.getIs_gzip();
		Object generatedGfp = this.getGfp();
		boolean generatedIs_zip = this.getIs_zip();
		_iobuf generatedPfp = this.getPfp();
		if (generatedIs_gzip) {
			r = ModernizedCProgram.gzputc(generatedGfp, c);
		}  else if (generatedIs_zip) {
		} else {
				r = .fputc(c, generatedPfp);
		} 
		return r;
	}
	public int hc_fgetc() {
		int r = -1;
		if (fp == ((Object)0)) {
			return r;
		} 
		boolean generatedIs_gzip = this.getIs_gzip();
		Object generatedGfp = this.getGfp();
		boolean generatedIs_zip = this.getIs_zip();
		Object generatedUfp = this.getUfp();
		_iobuf generatedPfp = this.getPfp();
		if (generatedIs_gzip) {
			r = ((generatedGfp).getHave() ? () : .UNRECOGNIZEDFUNCTIONNAME(generatedGfp));
		}  else if (generatedIs_zip) {
			byte c = 0;
			if (ModernizedCProgram.unzReadCurrentFile(generatedUfp, c, 1) == 1) {
				r = (int)c;
			} 
		} else {
				r = .fgetc(generatedPfp);
		} 
		return r;
	}
	public Byte hc_fgets(Byte buf, int len) {
		byte r = ((Object)0);
		if (fp == ((Object)0)) {
			return r;
		} 
		boolean generatedIs_gzip = this.getIs_gzip();
		Object generatedGfp = this.getGfp();
		boolean generatedIs_zip = this.getIs_zip();
		Object generatedUfp = this.getUfp();
		_iobuf generatedPfp = this.getPfp();
		if (generatedIs_gzip) {
			r = ModernizedCProgram.gzgets(generatedGfp, buf, len);
		}  else if (generatedIs_zip) {
			if (ModernizedCProgram.unzReadCurrentFile(generatedUfp, buf, len) > 0) {
				r = buf;
			} 
		} else {
				r = .fgets(buf, len, generatedPfp);
		} 
		return r;
	}
	public int hc_vfprintf(Object format, Object ap) {
		int r = -1;
		if (fp == ((Object)0)) {
			return r;
		} 
		boolean generatedIs_gzip = this.getIs_gzip();
		Object generatedGfp = this.getGfp();
		boolean generatedIs_zip = this.getIs_zip();
		_iobuf generatedPfp = this.getPfp();
		if (generatedIs_gzip) {
			r = ModernizedCProgram.gzvprintf(generatedGfp, format, ap);
		}  else if (generatedIs_zip) {
		} else {
				r = .vfprintf(generatedPfp, format, ap);
		} 
		return r;
	}
	public int hc_fprintf(Object format) {
		int r = -1;
		if (fp == ((Object)0)) {
			return r;
		} 
		va_list ap = new va_list();
		.__builtin_va_start(ap, format);
		boolean generatedIs_gzip = this.getIs_gzip();
		Object generatedGfp = this.getGfp();
		boolean generatedIs_zip = this.getIs_zip();
		_iobuf generatedPfp = this.getPfp();
		if (generatedIs_gzip) {
			r = ModernizedCProgram.gzvprintf(generatedGfp, format, ap);
		}  else if (generatedIs_zip) {
		} else {
				r = .vfprintf(generatedPfp, format, ap);
		} 
		.__builtin_va_end(ap);
		return r;
	}
	public int hc_fscanf(Object format, Object ptr) {
		if (fp == ((Object)0)) {
			return -1;
		} 
		byte buf = (byte)ModernizedCProgram.hcmalloc(-1024);
		if (buf == ((Object)0)) {
			return -1;
		} 
		byte b = fp.hc_fgets(buf, -1024 - 1);
		if (b == ((Object)0)) {
			ModernizedCProgram.hcfree(buf);
			return -1;
		} 
		.sscanf(b, format, ptr);
		ModernizedCProgram.hcfree(buf);
		return 1;
	}
	public int hc_fileno() {
		if (fp == ((Object)0)) {
			return 1;
		} 
		int generatedFd = this.getFd();
		return generatedFd;
	}
	public int hc_feof() {
		int r = -1;
		if (fp == ((Object)0)) {
			return r;
		} 
		boolean generatedIs_gzip = this.getIs_gzip();
		Object generatedGfp = this.getGfp();
		boolean generatedIs_zip = this.getIs_zip();
		Object generatedUfp = this.getUfp();
		_iobuf generatedPfp = this.getPfp();
		Object generated_flag = (generatedPfp).get_flag();
		if (generatedIs_gzip) {
			r = ModernizedCProgram.gzeof(generatedGfp);
		}  else if (generatedIs_zip) {
			r = ModernizedCProgram.unzeof(generatedUfp);
		} else {
				r = (generated_flag & -1024);
		} 
		return r;
	}
	public void hc_fflush() {
		if (fp == ((Object)0)) {
			return ;
		} 
		boolean generatedIs_gzip = this.getIs_gzip();
		Object generatedGfp = this.getGfp();
		boolean generatedIs_zip = this.getIs_zip();
		_iobuf generatedPfp = this.getPfp();
		if (generatedIs_gzip) {
			ModernizedCProgram.gzflush(generatedGfp, 2);
		}  else if (generatedIs_zip) {
		} else {
				.fflush(generatedPfp);
		} 
	}
	public void hc_fclose() {
		if (fp == ((Object)0)) {
			return ;
		} 
		boolean generatedIs_gzip = this.getIs_gzip();
		Object generatedGfp = this.getGfp();
		boolean generatedIs_zip = this.getIs_zip();
		Object generatedUfp = this.getUfp();
		_iobuf generatedPfp = this.getPfp();
		if (generatedIs_gzip) {
			ModernizedCProgram.gzclose(generatedGfp);
		}  else if (generatedIs_zip) {
			ModernizedCProgram.unzCloseCurrentFile(generatedUfp);
			ModernizedCProgram.unzClose(generatedUfp);
		} else {
				.fclose(generatedPfp);
		} 
		int generatedFd = this.getFd();
		ModernizedCProgram.close(generatedFd);
		this.setFd(-1);
		this.setPfp(((Object)0));
		this.setIs_gzip(0);
		this.setIs_zip(0);
		this.setPath(((Object)0));
		this.setMode(((Object)0));
	}
	public Object fgetl(Byte line_buf, Object line_sz) {
		size_t line_truncated = 0;
		size_t line_len = 0;
		while (!fp.hc_feof()) {
			int c = fp.hc_fgetc();
			if (c == (true)) {
				break;
			} 
			if (line_len == line_sz) {
				line_truncated++;
				continue;
			} 
			line_buf[line_len] = (byte)c;
			line_len++;
			if (c == (byte)'\n') {
				break;
			} 
		}
		if (line_truncated > 0) {
			.fprintf((_iob[2]), "\nOversized line detected! Truncated %I64u bytes\n", line_truncated);
		} 
		if (line_len == 0) {
			return 0;
		} 
		while (line_len) {
			if (line_buf[line_len - 1] == (byte)'\n') {
				line_len--;
				continue;
			} 
			if (line_buf[line_len - 1] == (byte)'\r') {
				line_len--;
				continue;
			} 
			break;
		}
		line_buf[line_len] = 0;
		return (line_len);
	}
	public Object count_lines() {
		u64 cnt = 0;
		byte buf = (byte)ModernizedCProgram.hcmalloc(-1024 + 1);
		byte prev = (byte)'\n';
		while (!fp.hc_feof()) {
			size_t nread = fp.hc_fread(buf, , -1024);
			if (nread < 1) {
				continue;
			} 
			size_t i = new size_t();
			for (i = 0; i < nread; i++) {
				if (prev == (byte)'\n') {
					cnt++;
				} 
				prev = buf[i];
			}
		}
		ModernizedCProgram.hcfree(buf);
		return cnt;
	}
	public int getFd() {
		return fd;
	}
	public void setFd(int newFd) {
		fd = newFd;
	}
	public _iobuf getPfp() {
		return pfp;
	}
	public void setPfp(_iobuf newPfp) {
		pfp = newPfp;
	}
	public Object getGfp() {
		return gfp;
	}
	public void setGfp(Object newGfp) {
		gfp = newGfp;
	}
	public Object getUfp() {
		return ufp;
	}
	public void setUfp(Object newUfp) {
		ufp = newUfp;
	}
	public boolean getIs_gzip() {
		return is_gzip;
	}
	public void setIs_gzip(boolean newIs_gzip) {
		is_gzip = newIs_gzip;
	}
	public boolean getIs_zip() {
		return is_zip;
	}
	public void setIs_zip(boolean newIs_zip) {
		is_zip = newIs_zip;
	}
	public Byte getMode() {
		return mode;
	}
	public void setMode(Byte newMode) {
		mode = newMode;
	}
	public Object getPath() {
		return path;
	}
	public void setPath(Object newPath) {
		path = newPath;
	}
}

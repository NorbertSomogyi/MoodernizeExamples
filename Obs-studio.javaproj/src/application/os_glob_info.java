package application;

public class os_glob_info {
	private Object gl_pathc;
	private os_globent[] gl_pathv;
	
	public os_glob_info(Object gl_pathc, os_globent[] gl_pathv) {
		setGl_pathc(gl_pathc);
		setGl_pathv(gl_pathv);
	}
	public os_glob_info() {
	}
	
	public int os_glob(Object pattern, int flags) {
		Object files;
		HANDLE handle = new HANDLE();
		WIN32_FIND_DATA wfd = new WIN32_FIND_DATA();
		int ret = -1;
		wchar_t w_path = new wchar_t();
		Object generatedDa = files.getDa();
		generatedDa.darray_init();
		Byte generatedPath = ent.getPath();
		Object generatedArray = files.getArray();
		Object generatedNum = files.getNum();
		if (ModernizedCProgram.os_utf8_to_wcs_ptr(pattern, 0, w_path) > 0) {
			handle = /*Error: Function owner not recognized*/FindFirstFileW(w_path, wfd);
			if (handle != (HANDLE)(true)) {
				do {
					os_globent ent = new os_globent(0);
					ent.make_globent(wfd, pattern);
					if (generatedPath) {
						generatedDa.darray_push_back(/*Error: sizeof expression not supported yet*/, ent);
					} 
				} while (/*Error: Function owner not recognized*/FindNextFileA(handle, wfd));
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/FindClose(handle);
				pglob = ModernizedCProgram.bmalloc(/*Error: sizeof expression not supported yet*/);
				(pglob).setGl_pathc(generatedNum);
				(pglob).setGl_pathv(generatedArray);
				ret = 0;
			} 
			ModernizedCProgram.bfree(w_path);
		} 
		if (ret != 0) {
			pglob = ((Object)0);
		} 
		(Object)flags;
		return ret;
		posix_glob_info pgi = new posix_glob_info();
		Object generatedGl = pgi.getGl();
		int ret = /*Error: Function owner not recognized*/glob(pattern, 0, ((Object)0), generatedGl);
		Object generatedDa = list.getDa();
		Byte generatedPath = ent.getPath();
		Object generatedArray = list.getArray();
		Object generatedNum = list.getNum();
		os_glob_info generatedBase = pgi.getBase();
		if (ret == 0) {
			Object list;
			generatedDa.darray_init();
			for (size_t i = 0;
			 i < generatedGl.getGl_pathc(); i++) {
				os_globent ent = new os_globent(0);
				ent.setPath(generatedGl.getGl_pathv()[i]);
				ent.setDirectory(ModernizedCProgram.is_dir(generatedPath));
				generatedDa.darray_push_back(/*Error: sizeof expression not supported yet*/, ent);
			}
			generatedBase.setGl_pathc(generatedNum);
			generatedBase.setGl_pathv(generatedArray);
			pglob = ModernizedCProgram.bmemdup(pgi, /*Error: sizeof expression not supported yet*/);
		} else {
				pglob = ((Object)0);
		} 
		(Object)flags;
		return ret;
	}
	public void os_globfree() {
		Object generatedGl_pathc = this.getGl_pathc();
		os_globent[] generatedGl_pathv = this.getGl_pathv();
		if (pglob) {
			for (size_t i = 0;
			 i < generatedGl_pathc; i++) {
				ModernizedCProgram.bfree(generatedGl_pathv[i].getPath());
			}
			ModernizedCProgram.bfree(generatedGl_pathv);
			ModernizedCProgram.bfree(pglob);
		} 
		Object generatedGl = pgi.getGl();
		os_glob_info generatedBase = pgi.getBase();
		os_globent[] generatedGl_pathv = generatedBase.getGl_pathv();
		if (pglob) {
			posix_glob_info pgi = (posix_glob_info)pglob;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/globfree(generatedGl);
			ModernizedCProgram.bfree(generatedGl_pathv);
			ModernizedCProgram.bfree(pgi);
		} 
	}
	public Object getGl_pathc() {
		return gl_pathc;
	}
	public void setGl_pathc(Object newGl_pathc) {
		gl_pathc = newGl_pathc;
	}
	public os_globent[] getGl_pathv() {
		return gl_pathv;
	}
	public void setGl_pathv(os_globent[] newGl_pathv) {
		gl_pathv = newGl_pathv;
	}
}
/* currently no flags available */

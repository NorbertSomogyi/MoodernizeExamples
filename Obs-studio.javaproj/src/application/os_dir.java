package application;

public class os_dir {
	private Object handle;
	private Object wfd;
	private boolean first;
	private os_dirent out;
	
	public os_dir(Object handle, Object wfd, boolean first, os_dirent out) {
		setHandle(handle);
		setWfd(wfd);
		setFirst(first);
		setOut(out);
	}
	public os_dir() {
	}
	
	public os_dir os_opendir(Object path) {
		dstr path_str = new dstr(0);
		os_dir dir = ((Object)0);
		WIN32_FIND_DATA wfd = new WIN32_FIND_DATA();
		HANDLE handle = new HANDLE();
		wchar_t w_path = new wchar_t();
		path_str.dstr_copy(path);
		path_str.dstr_cat("/*.*");
		byte[] generatedArray = path_str.getArray();
		Object generatedLen = path_str.getLen();
		if (ModernizedCProgram.os_utf8_to_wcs_ptr(generatedArray, generatedLen, w_path) > 0) {
			handle = /*Error: Function owner not recognized*/FindFirstFileW(w_path, wfd);
			if (handle != (HANDLE)(true)) {
				dir = ModernizedCProgram.bzalloc(/*Error: Unsupported expression*/);
				dir.setHandle(handle);
				dir.setFirst(1);
				dir.setWfd(wfd);
			} 
			ModernizedCProgram.bfree(w_path);
		} 
		path_str.dstr_free();
		return dir;
		os_dir dir = new os_dir();
		DIR dir_val = new DIR();
		dir_val = /*Error: Function owner not recognized*/opendir(path);
		if (!dir_val) {
			return ((Object)0);
		} 
		dir = ModernizedCProgram.bzalloc(/*Error: Unsupported expression*/);
		dir.setDir(dir_val);
		dir.setPath(path);
		return dir;
	}
	public void os_closedir() {
		Object generatedHandle = this.getHandle();
		if (dir) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/FindClose(generatedHandle);
			ModernizedCProgram.bfree(dir);
		} 
		Object generatedDir = this.getDir();
		if (dir) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/closedir(generatedDir);
			ModernizedCProgram.bfree(dir);
		} 
	}
	public Object getHandle() {
		return handle;
	}
	public void setHandle(Object newHandle) {
		handle = newHandle;
	}
	public Object getWfd() {
		return wfd;
	}
	public void setWfd(Object newWfd) {
		wfd = newWfd;
	}
	public boolean getFirst() {
		return first;
	}
	public void setFirst(boolean newFirst) {
		first = newFirst;
	}
	public os_dirent getOut() {
		return out;
	}
	public void setOut(os_dirent newOut) {
		out = newOut;
	}
}

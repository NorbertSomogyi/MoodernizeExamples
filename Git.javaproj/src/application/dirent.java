package application;

public class dirent {
	private byte d_type;
	private Object d_name;
	
	public dirent(byte d_type, Object d_name) {
		setD_type(d_type);
		setD_name(d_name);
	}
	public dirent() {
	}
	
	public dirent readdir( dir) {
		if (!dir) {
			(._errno()) = /* No set_errno for mingw */9;
			return ((Object)0);
		} 
		Object generatedDd_stat = dir.getDd_stat();
		Object generatedDd_handle = dir.getDd_handle();
		Object generatedDd_dir = dir.getDd_dir();
		if (generatedDd_stat) {
			WIN32_FIND_DATAW fdata = new WIN32_FIND_DATAW();
			if (.FindNextFileW(generatedDd_handle, fdata)) {
				ModernizedCProgram.finddata2dirent(generatedDd_dir, fdata);
			} else {
					DWORD lasterr = .GetLastError();
					if (lasterr != -1024) {
						(._errno()) = ModernizedCProgram.err_win_to_posix(lasterr);
					} 
					return ((Object)0);
			} 
		} 
		++generatedDd_stat;
		return generatedDd_dir;
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

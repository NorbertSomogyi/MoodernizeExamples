package application;

public class os_dirent {
	private Object d_name;
	private boolean directory;
	
	public os_dirent(Object d_name, boolean directory) {
		setD_name(d_name);
		setDirectory(directory);
	}
	public os_dirent() {
	}
	
	public os_dirent os_readdir(os_dir dir) {
		if (!dir) {
			return ((Object)0);
		} 
		boolean generatedFirst = dir.getFirst();
		Object generatedHandle = dir.getHandle();
		Object generatedWfd = dir.getWfd();
		if (generatedFirst) {
			dir.setFirst(0);
		} else {
				if (!/*Error: Function owner not recognized*/FindNextFileW(generatedHandle, generatedWfd)) {
					return ((Object)0);
				} 
		} 
		os_dirent generatedOut = dir.getOut();
		Object generatedD_name = generatedOut.getD_name();
		ModernizedCProgram.os_wcs_to_utf8(generatedWfd.getCFileName(), 0, generatedD_name, /*Error: sizeof expression not supported yet*/);
		generatedOut.setDirectory(ModernizedCProgram.is_dir(generatedWfd));
		return generatedOut;
		dstr file_path = new dstr(0);
		if (!dir) {
			return ((Object)0);
		} 
		Object generatedDir = dir.getDir();
		dir.setCur_dirent(/*Error: Function owner not recognized*/readdir(generatedDir));
		Object generatedCur_dirent = dir.getCur_dirent();
		if (!generatedCur_dirent) {
			return ((Object)0);
		} 
		os_dirent generatedOut = dir.getOut();
		Object generatedD_name = generatedOut.getD_name();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strncpy(generatedD_name, generatedD_name, 255);
		Object generatedPath = dir.getPath();
		file_path.dstr_copy(generatedPath);
		file_path.dstr_cat("/");
		file_path.dstr_cat(generatedD_name);
		byte[] generatedArray = file_path.getArray();
		generatedOut.setDirectory(ModernizedCProgram.is_dir(generatedArray));
		file_path.dstr_free();
		return generatedOut;
	}
	public Object getD_name() {
		return d_name;
	}
	public void setD_name(Object newD_name) {
		d_name = newD_name;
	}
	public boolean getDirectory() {
		return directory;
	}
	public void setDirectory(boolean newDirectory) {
		directory = newDirectory;
	}
}

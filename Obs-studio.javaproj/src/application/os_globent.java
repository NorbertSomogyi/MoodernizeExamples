package application;

public class os_globent {
	private Byte path;
	private boolean directory;
	
	public os_globent(Byte path, boolean directory) {
		setPath(path);
		setDirectory(directory);
	}
	public os_globent() {
	}
	
	public void make_globent(Object wfd, Object pattern) {
		dstr name = new dstr(0);
		dstr path = new dstr(0);
		byte slash;
		name.dstr_from_wcs(wfd.getCFileName());
		path.dstr_copy(pattern);
		byte[] generatedArray = path.getArray();
		slash = /*Error: Function owner not recognized*/strrchr(generatedArray, (byte)'/');
		if (slash) {
			path.dstr_resize(slash + 1 - generatedArray);
		} else {
				path.dstr_free();
		} 
		path.dstr_cat_dstr(name);
		this.setPath(generatedArray);
		this.setDirectory(ModernizedCProgram.is_dir(wfd));
		name.dstr_free();
	}
	public Byte getPath() {
		return path;
	}
	public void setPath(Byte newPath) {
		path = newPath;
	}
	public boolean getDirectory() {
		return directory;
	}
	public void setDirectory(boolean newDirectory) {
		directory = newDirectory;
	}
}

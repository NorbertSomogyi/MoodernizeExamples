package application;

/* used when the code does not know or care what the default abbrev is */
public class object_context {
	private int mode;
	private strbuf symlink_path;
	private Byte path;
	
	public object_context(int mode, strbuf symlink_path, Byte path) {
		setMode(mode);
		setSymlink_path(symlink_path);
		setPath(path);
	}
	public object_context() {
	}
	
	public int getMode() {
		return mode;
	}
	public void setMode(int newMode) {
		mode = newMode;
	}
	public strbuf getSymlink_path() {
		return symlink_path;
	}
	public void setSymlink_path(strbuf newSymlink_path) {
		symlink_path = newSymlink_path;
	}
	public Byte getPath() {
		return path;
	}
	public void setPath(Byte newPath) {
		path = newPath;
	}
}

package application;

public class object_array_entry {
	private object item;
	private Byte name;
	private Byte path;
	private int mode;
	
	public object_array_entry(object item, Byte name, Byte path, int mode) {
		setItem(item);
		setName(name);
		setPath(path);
		setMode(mode);
	}
	public object_array_entry() {
	}
	
	public Object blob_path() {
		Byte generatedPath = this.getPath();
		Byte generatedName = this.getName();
		return generatedPath ? generatedPath : generatedName;
	}
	public void object_array_release_entry() {
		Byte generatedName = this.getName();
		if (generatedName != ModernizedCProgram.object_array_slopbuf) {
			ModernizedCProgram.free(generatedName);
		} 
		Byte generatedPath = this.getPath();
		ModernizedCProgram.free(generatedPath);
	}
	/*
	 * Return true for entries that have not yet been shown.  (This is an
	 * object_array_each_func_t.)
	 */
	public int entry_unshown(Object cb_data_unused) {
		object generatedItem = this.getItem();
		int generatedFlags = generatedItem.getFlags();
		return !(generatedFlags & (-1024 << 3/*
		 * If array is on the verge of a realloc, garbage-collect any entries
		 * that have already been shown to try to free up some space.
		 */));
	}
	public object getItem() {
		return item;
	}
	public void setItem(object newItem) {
		item = newItem;
	}
	public Byte getName() {
		return name;
	}
	public void setName(Byte newName) {
		name = newName;
	}
	public Byte getPath() {
		return path;
	}
	public void setPath(Byte newPath) {
		path = newPath;
	}
	public int getMode() {
		return mode;
	}
	public void setMode(int newMode) {
		mode = newMode;
	}
}
/*
 * Apply want to each entry in array, retaining only the entries for
 * which the function returns true.  Preserve the order of the entries
 * that are retained.
 */

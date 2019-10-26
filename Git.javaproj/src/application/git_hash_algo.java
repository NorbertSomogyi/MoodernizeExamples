package application;

public class git_hash_algo {
	private Object name;
	private Object format_id;
	private Object rawsz;
	private Object hexsz;
	private Object blksz;
	private Object init_fn;
	private Object update_fn;
	private Object final_fn;
	private Object empty_tree;
	private Object empty_blob;
	
	public git_hash_algo(Object name, Object format_id, Object rawsz, Object hexsz, Object blksz, Object init_fn, Object update_fn, Object final_fn, Object empty_tree, Object empty_blob) {
		setName(name);
		setFormat_id(format_id);
		setRawsz(rawsz);
		setHexsz(hexsz);
		setBlksz(blksz);
		setInit_fn(init_fn);
		setUpdate_fn(update_fn);
		setFinal_fn(final_fn);
		setEmpty_tree(empty_tree);
		setEmpty_blob(empty_blob);
	}
	public git_hash_algo() {
	}
	
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
	public Object getFormat_id() {
		return format_id;
	}
	public void setFormat_id(Object newFormat_id) {
		format_id = newFormat_id;
	}
	public Object getRawsz() {
		return rawsz;
	}
	public void setRawsz(Object newRawsz) {
		rawsz = newRawsz;
	}
	public Object getHexsz() {
		return hexsz;
	}
	public void setHexsz(Object newHexsz) {
		hexsz = newHexsz;
	}
	public Object getBlksz() {
		return blksz;
	}
	public void setBlksz(Object newBlksz) {
		blksz = newBlksz;
	}
	public Object getInit_fn() {
		return init_fn;
	}
	public void setInit_fn(Object newInit_fn) {
		init_fn = newInit_fn;
	}
	public Object getUpdate_fn() {
		return update_fn;
	}
	public void setUpdate_fn(Object newUpdate_fn) {
		update_fn = newUpdate_fn;
	}
	public Object getFinal_fn() {
		return final_fn;
	}
	public void setFinal_fn(Object newFinal_fn) {
		final_fn = newFinal_fn;
	}
	public Object getEmpty_tree() {
		return empty_tree;
	}
	public void setEmpty_tree(Object newEmpty_tree) {
		empty_tree = newEmpty_tree;
	}
	public Object getEmpty_blob() {
		return empty_blob;
	}
	public void setEmpty_blob(Object newEmpty_blob) {
		empty_blob = newEmpty_blob;
	}
}
/*
	 * The name of the algorithm, as appears in the config file and in
	 * messages.
	 */

package application;

/*
 * A level in the reference hierarchy that is currently being iterated
 * through.
 */
public class cache_ref_iterator_level {
	private ref_dir dir;
	private prefix_state prefix_state;
	private int index;
	
	public cache_ref_iterator_level(ref_dir dir, prefix_state prefix_state, int index) {
		setDir(dir);
		setPrefix_state(prefix_state);
		setIndex(index);
	}
	public cache_ref_iterator_level() {
	}
	
	public ref_dir getDir() {
		return dir;
	}
	public void setDir(ref_dir newDir) {
		dir = newDir;
	}
	public prefix_state getPrefix_state() {
		return prefix_state;
	}
	public void setPrefix_state(prefix_state newPrefix_state) {
		prefix_state = newPrefix_state;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int newIndex) {
		index = newIndex;
	}
}
/*
	 * The ref_dir being iterated over at this level. The ref_dir
	 * is sorted before being stored here.
	 */

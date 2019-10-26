package application;

/*
 * An array of lazy_entry items is used by the n threads in
 * the directory parse (first) phase to (lock-free) store the
 * intermediate results.  These values are then referenced by
 * the 2 threads in the second phase.
 */
public class lazy_entry {
	private dir_entry dir;
	private int hash_dir;
	private int hash_name;
	
	public lazy_entry(dir_entry dir, int hash_dir, int hash_name) {
		setDir(dir);
		setHash_dir(hash_dir);
		setHash_name(hash_name);
	}
	public lazy_entry() {
	}
	
	public dir_entry getDir() {
		return dir;
	}
	public void setDir(dir_entry newDir) {
		dir = newDir;
	}
	public int getHash_dir() {
		return hash_dir;
	}
	public void setHash_dir(int newHash_dir) {
		hash_dir = newHash_dir;
	}
	public int getHash_name() {
		return hash_name;
	}
	public void setHash_name(int newHash_name) {
		hash_name = newHash_name;
	}
}

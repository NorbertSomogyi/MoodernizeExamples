package application;

public class set_gitdir_args {
	private Object commondir;
	private Object object_dir;
	private Object graft_file;
	private Object index_file;
	private Object alternate_db;
	
	public set_gitdir_args(Object commondir, Object object_dir, Object graft_file, Object index_file, Object alternate_db) {
		setCommondir(commondir);
		setObject_dir(object_dir);
		setGraft_file(graft_file);
		setIndex_file(index_file);
		setAlternate_db(alternate_db);
	}
	public set_gitdir_args() {
	}
	
	public Object getCommondir() {
		return commondir;
	}
	public void setCommondir(Object newCommondir) {
		commondir = newCommondir;
	}
	public Object getObject_dir() {
		return object_dir;
	}
	public void setObject_dir(Object newObject_dir) {
		object_dir = newObject_dir;
	}
	public Object getGraft_file() {
		return graft_file;
	}
	public void setGraft_file(Object newGraft_file) {
		graft_file = newGraft_file;
	}
	public Object getIndex_file() {
		return index_file;
	}
	public void setIndex_file(Object newIndex_file) {
		index_file = newIndex_file;
	}
	public Object getAlternate_db() {
		return alternate_db;
	}
	public void setAlternate_db(Object newAlternate_db) {
		alternate_db = newAlternate_db;
	}
}

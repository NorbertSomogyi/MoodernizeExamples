package application;

public class path_and_oids_entry {
	private hashmap_entry ent;
	private Byte path;
	private oidset trees;
	
	public path_and_oids_entry(hashmap_entry ent, Byte path, oidset trees) {
		setEnt(ent);
		setPath(path);
		setTrees(trees);
	}
	public path_and_oids_entry() {
	}
	
	public hashmap_entry getEnt() {
		return ent;
	}
	public void setEnt(hashmap_entry newEnt) {
		ent = newEnt;
	}
	public Byte getPath() {
		return path;
	}
	public void setPath(Byte newPath) {
		path = newPath;
	}
	public oidset getTrees() {
		return trees;
	}
	public void setTrees(oidset newTrees) {
		trees = newTrees;
	}
}

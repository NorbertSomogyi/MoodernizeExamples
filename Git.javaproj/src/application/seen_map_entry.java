package application;

public class seen_map_entry {
	private oidmap_entry base;
	private Object depth;
	
	public seen_map_entry(oidmap_entry base, Object depth) {
		setBase(base);
		setDepth(depth);
	}
	public seen_map_entry() {
	}
	
	public oidmap_entry getBase() {
		return base;
	}
	public void setBase(oidmap_entry newBase) {
		base = newBase;
	}
	public Object getDepth() {
		return depth;
	}
	public void setDepth(Object newDepth) {
		depth = newDepth;
	}
}

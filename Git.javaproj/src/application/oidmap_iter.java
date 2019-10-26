package application;

public class oidmap_iter {
	private hashmap_iter h_iter;
	
	public oidmap_iter(hashmap_iter h_iter) {
		setH_iter(h_iter);
	}
	public oidmap_iter() {
	}
	
	public Object oidmap_iter_next() {
		hashmap_iter generatedH_iter = this.getH_iter();
		hashmap_entry hashmap_entry = new hashmap_entry();
		return (Object)hashmap_entry.hashmap_iter_next(generatedH_iter);
	}
	public hashmap_iter getH_iter() {
		return h_iter;
	}
	public void setH_iter(hashmap_iter newH_iter) {
		h_iter = newH_iter;
	}
}

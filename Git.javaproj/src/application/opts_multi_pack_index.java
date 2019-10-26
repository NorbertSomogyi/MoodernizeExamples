package application;

public class opts_multi_pack_index {
	private Object object_dir;
	private long batch_size;
	
	public opts_multi_pack_index(Object object_dir, long batch_size) {
		setObject_dir(object_dir);
		setBatch_size(batch_size);
	}
	public opts_multi_pack_index() {
	}
	
	public Object getObject_dir() {
		return object_dir;
	}
	public void setObject_dir(Object newObject_dir) {
		object_dir = newObject_dir;
	}
	public long getBatch_size() {
		return batch_size;
	}
	public void setBatch_size(long newBatch_size) {
		batch_size = newBatch_size;
	}
}

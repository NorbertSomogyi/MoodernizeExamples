package application;

public class cached_object {
	private object_id oid;
	private object_type type;
	private Object buf;
	private long size;
	
	public cached_object(object_id oid, object_type type, Object buf, long size) {
		setOid(oid);
		setType(type);
		setBuf(buf);
		setSize(size);
	}
	public cached_object() {
	}
	
	public cached_object find_cached_object(Object oid) {
		int i;
		cached_object co = cached_objects;
		object_id generatedOid = co.getOid();
		for (i = 0; i < ModernizedCProgram.cached_object_nr; ) {
			if (ModernizedCProgram.oideq(generatedOid, oid)) {
				return co;
			} 
		}
		if (ModernizedCProgram.oideq(oid, ModernizedCProgram.the_repository.getHash_algo().getEmpty_tree())) {
			return ModernizedCProgram.empty_tree;
		} 
		return ((Object)0);
	}
	public object_id getOid() {
		return oid;
	}
	public void setOid(object_id newOid) {
		oid = newOid;
	}
	public object_type getType() {
		return type;
	}
	public void setType(object_type newType) {
		type = newType;
	}
	public Object getBuf() {
		return buf;
	}
	public void setBuf(Object newBuf) {
		buf = newBuf;
	}
	public long getSize() {
		return size;
	}
	public void setSize(long newSize) {
		size = newSize;
	}
}

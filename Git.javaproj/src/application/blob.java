package application;

public class blob {
	private object object;
	
	public blob(object object) {
		setObject(object);
	}
	public blob() {
	}
	
	public int fill_mmfile_blob(Object f) {
		Object buf;
		long size;
		object_type type;
		object generatedObject = this.getObject();
		object_id generatedOid = generatedObject.getOid();
		buf = ModernizedCProgram.the_repository.repo_read_object_file(generatedOid, object_type.type, size);
		if (!buf) {
			return -1;
		} 
		if (object_type.type != object_type.OBJ_BLOB) {
			ModernizedCProgram.free(buf);
			return -1;
		} 
		f.setPtr(buf);
		f.setSize(size);
		return 0;
	}
	public blob lookup_blob(repository r, Object oid) {
		object object = new object();
		object obj = object.lookup_object(r, oid);
		if (!obj) {
			return r.create_object(oid, r.alloc_blob_node());
		} 
		return ModernizedCProgram.object_as_type(r, obj, object_type.OBJ_BLOB, 0);
	}
	public int parse_blob_buffer(Object buffer, long size) {
		object generatedObject = this.getObject();
		generatedObject.setParsed(1);
		return 0;
	}
	public void mark_blob_uninteresting() {
		if (!blob) {
			return ;
		} 
		object generatedObject = this.getObject();
		int generatedFlags = generatedObject.getFlags();
		if (generatedFlags & (-1024 << 1)) {
			return ;
		} 
		generatedFlags |=  (-1024 << 1);
	}
	public object getObject() {
		return object;
	}
	public void setObject(object newObject) {
		object = newObject;
	}
}

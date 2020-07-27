package application;

public class expand_data {
	private object_id oid;
	private object_type type;
	private long size;
	private Object disk_size;
	private object_id delta_base_oid;
	private Object content;
	private object_info info;
	
	public expand_data(object_id oid, object_type type, long size, Object disk_size, object_id delta_base_oid, Object content, object_info info) {
		setOid(oid);
		setType(type);
		setSize(size);
		setDisk_size(disk_size);
		setDelta_base_oid(delta_base_oid);
		setContent(content);
		setInfo(info);
	}
	public expand_data() {
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
	public long getSize() {
		return size;
	}
	public void setSize(long newSize) {
		size = newSize;
	}
	public Object getDisk_size() {
		return disk_size;
	}
	public void setDisk_size(Object newDisk_size) {
		disk_size = newDisk_size;
	}
	public object_id getDelta_base_oid() {
		return delta_base_oid;
	}
	public void setDelta_base_oid(object_id newDelta_base_oid) {
		delta_base_oid = newDelta_base_oid;
	}
	public Object getContent() {
		return content;
	}
	public void setContent(Object newContent) {
		content = newContent;
	}
	public object_info getInfo() {
		return info;
	}
	public void setInfo(object_info newInfo) {
		info = newInfo;
	}
}

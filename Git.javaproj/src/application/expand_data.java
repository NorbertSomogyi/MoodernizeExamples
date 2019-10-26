package application;

public class expand_data {
	private object_id oid;
	private object_type type;
	private long size;
	private Object disk_size;
	private Object rest;
	private object_id delta_base_oid;
	private int mark_query;
	private int split_on_whitespace;
	private object_info info;
	private int skip_object_info;
	
	public expand_data(object_id oid, object_type type, long size, Object disk_size, Object rest, object_id delta_base_oid, int mark_query, int split_on_whitespace, object_info info, int skip_object_info) {
		setOid(oid);
		setType(type);
		setSize(size);
		setDisk_size(disk_size);
		setRest(rest);
		setDelta_base_oid(delta_base_oid);
		setMark_query(mark_query);
		setSplit_on_whitespace(split_on_whitespace);
		setInfo(info);
		setSkip_object_info(skip_object_info);
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
	public Object getRest() {
		return rest;
	}
	public void setRest(Object newRest) {
		rest = newRest;
	}
	public object_id getDelta_base_oid() {
		return delta_base_oid;
	}
	public void setDelta_base_oid(object_id newDelta_base_oid) {
		delta_base_oid = newDelta_base_oid;
	}
	public int getMark_query() {
		return mark_query;
	}
	public void setMark_query(int newMark_query) {
		mark_query = newMark_query;
	}
	public int getSplit_on_whitespace() {
		return split_on_whitespace;
	}
	public void setSplit_on_whitespace(int newSplit_on_whitespace) {
		split_on_whitespace = newSplit_on_whitespace;
	}
	public object_info getInfo() {
		return info;
	}
	public void setInfo(object_info newInfo) {
		info = newInfo;
	}
	public int getSkip_object_info() {
		return skip_object_info;
	}
	public void setSkip_object_info(int newSkip_object_info) {
		skip_object_info = newSkip_object_info;
	}
}

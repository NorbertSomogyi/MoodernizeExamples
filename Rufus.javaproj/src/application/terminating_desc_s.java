package application;

/** Terminating Descriptor (ECMA 167r3 3/10.9) */
public class terminating_desc_s {
	private udf_tag_s tag;
	private Object[] reserved;
	
	public terminating_desc_s(udf_tag_s tag, Object[] reserved) {
		setTag(tag);
		setReserved(reserved);
	}
	public terminating_desc_s() {
	}
	
	public udf_tag_s getTag() {
		return tag;
	}
	public void setTag(udf_tag_s newTag) {
		tag = newTag;
	}
	public Object[] getReserved() {
		return reserved;
	}
	public void setReserved(Object[] newReserved) {
		reserved = newReserved;
	}
}

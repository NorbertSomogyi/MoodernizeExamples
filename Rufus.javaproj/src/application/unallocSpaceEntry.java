package application;

/** Unallocated Space Entry (ECMA 167r3 4/14.11) */
public class unallocSpaceEntry {
	private udf_tag_s tag;
	private udf_icbtag_s icb_tag;
	private Object lengthAllocDescs;
	private Object allocDescs;
	
	public unallocSpaceEntry(udf_tag_s tag, udf_icbtag_s icb_tag, Object lengthAllocDescs, Object allocDescs) {
		setTag(tag);
		setIcb_tag(icb_tag);
		setLengthAllocDescs(lengthAllocDescs);
		setAllocDescs(allocDescs);
	}
	public unallocSpaceEntry() {
	}
	
	public udf_tag_s getTag() {
		return tag;
	}
	public void setTag(udf_tag_s newTag) {
		tag = newTag;
	}
	public udf_icbtag_s getIcb_tag() {
		return icb_tag;
	}
	public void setIcb_tag(udf_icbtag_s newIcb_tag) {
		icb_tag = newIcb_tag;
	}
	public Object getLengthAllocDescs() {
		return lengthAllocDescs;
	}
	public void setLengthAllocDescs(Object newLengthAllocDescs) {
		lengthAllocDescs = newLengthAllocDescs;
	}
	public Object getAllocDescs() {
		return allocDescs;
	}
	public void setAllocDescs(Object newAllocDescs) {
		allocDescs = newAllocDescs;
	}
}

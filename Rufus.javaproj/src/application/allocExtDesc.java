package application;

/** Allocation Ext Descriptor (ECMA 167r3 4/14.5) */
public class allocExtDesc {
	private udf_tag_s tag;
	private Object previous_alloc_ext_loc;
	private Object i_alloc_descs;
	
	public allocExtDesc(udf_tag_s tag, Object previous_alloc_ext_loc, Object i_alloc_descs) {
		setTag(tag);
		setPrevious_alloc_ext_loc(previous_alloc_ext_loc);
		setI_alloc_descs(i_alloc_descs);
	}
	public allocExtDesc() {
	}
	
	public udf_tag_s getTag() {
		return tag;
	}
	public void setTag(udf_tag_s newTag) {
		tag = newTag;
	}
	public Object getPrevious_alloc_ext_loc() {
		return previous_alloc_ext_loc;
	}
	public void setPrevious_alloc_ext_loc(Object newPrevious_alloc_ext_loc) {
		previous_alloc_ext_loc = newPrevious_alloc_ext_loc;
	}
	public Object getI_alloc_descs() {
		return i_alloc_descs;
	}
	public void setI_alloc_descs(Object newI_alloc_descs) {
		i_alloc_descs = newI_alloc_descs;
	}
}

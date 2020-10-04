package application;

/** Unallocated Space Descriptor (ECMA 167r3 3/10.8) */
public class unalloc_space_desc_s {
	private udf_tag_s tag;
	private Object vol_desc_seq_num;
	private Object i_alloc_descs;
	private Object[] allocDescs;
	
	public unalloc_space_desc_s(udf_tag_s tag, Object vol_desc_seq_num, Object i_alloc_descs, Object[] allocDescs) {
		setTag(tag);
		setVol_desc_seq_num(vol_desc_seq_num);
		setI_alloc_descs(i_alloc_descs);
		setAllocDescs(allocDescs);
	}
	public unalloc_space_desc_s() {
	}
	
	public udf_tag_s getTag() {
		return tag;
	}
	public void setTag(udf_tag_s newTag) {
		tag = newTag;
	}
	public Object getVol_desc_seq_num() {
		return vol_desc_seq_num;
	}
	public void setVol_desc_seq_num(Object newVol_desc_seq_num) {
		vol_desc_seq_num = newVol_desc_seq_num;
	}
	public Object getI_alloc_descs() {
		return i_alloc_descs;
	}
	public void setI_alloc_descs(Object newI_alloc_descs) {
		i_alloc_descs = newI_alloc_descs;
	}
	public Object[] getAllocDescs() {
		return allocDescs;
	}
	public void setAllocDescs(Object[] newAllocDescs) {
		allocDescs = newAllocDescs;
	}
}

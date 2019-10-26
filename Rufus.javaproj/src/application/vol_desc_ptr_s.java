package application;

/** Volume Descriptor Pointer (ECMA 167r3 3/10.3) */
public class vol_desc_ptr_s {
	private udf_tag_s tag;
	private Object vol_desc_seq_num;
	private udf_extent_ad_s next_vol_desc_set_ext;
	private Object reserved;
	
	public vol_desc_ptr_s(udf_tag_s tag, Object vol_desc_seq_num, udf_extent_ad_s next_vol_desc_set_ext, Object reserved) {
		setTag(tag);
		setVol_desc_seq_num(vol_desc_seq_num);
		setNext_vol_desc_set_ext(next_vol_desc_set_ext);
		setReserved(reserved);
	}
	public vol_desc_ptr_s() {
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
	public udf_extent_ad_s getNext_vol_desc_set_ext() {
		return next_vol_desc_set_ext;
	}
	public void setNext_vol_desc_set_ext(udf_extent_ad_s newNext_vol_desc_set_ext) {
		next_vol_desc_set_ext = newNext_vol_desc_set_ext;
	}
	public Object getReserved() {
		return reserved;
	}
	public void setReserved(Object newReserved) {
		reserved = newReserved;
	}
}

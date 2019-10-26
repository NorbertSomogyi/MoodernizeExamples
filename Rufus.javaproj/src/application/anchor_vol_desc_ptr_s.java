package application;

/** Anchor Volume Descriptor Pointer (ECMA 167r3 3/10.2) */
public class anchor_vol_desc_ptr_s {
	private udf_tag_s tag;
	private udf_extent_ad_s main_vol_desc_seq_ext;
	private udf_extent_ad_s reserve_vol_desc_seq_ext;
	private Object reserved;
	
	public anchor_vol_desc_ptr_s(udf_tag_s tag, udf_extent_ad_s main_vol_desc_seq_ext, udf_extent_ad_s reserve_vol_desc_seq_ext, Object reserved) {
		setTag(tag);
		setMain_vol_desc_seq_ext(main_vol_desc_seq_ext);
		setReserve_vol_desc_seq_ext(reserve_vol_desc_seq_ext);
		setReserved(reserved);
	}
	public anchor_vol_desc_ptr_s() {
	}
	
	public udf_tag_s getTag() {
		return tag;
	}
	public void setTag(udf_tag_s newTag) {
		tag = newTag;
	}
	public udf_extent_ad_s getMain_vol_desc_seq_ext() {
		return main_vol_desc_seq_ext;
	}
	public void setMain_vol_desc_seq_ext(udf_extent_ad_s newMain_vol_desc_seq_ext) {
		main_vol_desc_seq_ext = newMain_vol_desc_seq_ext;
	}
	public udf_extent_ad_s getReserve_vol_desc_seq_ext() {
		return reserve_vol_desc_seq_ext;
	}
	public void setReserve_vol_desc_seq_ext(udf_extent_ad_s newReserve_vol_desc_seq_ext) {
		reserve_vol_desc_seq_ext = newReserve_vol_desc_seq_ext;
	}
	public Object getReserved() {
		return reserved;
	}
	public void setReserved(Object newReserved) {
		reserved = newReserved;
	}
}

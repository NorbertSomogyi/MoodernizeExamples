package application;

/** Implementation Use Volume Descriptor (ECMA 167r3 3/10.4) */
public class imp_use_vol_desc_s {
	private udf_tag_s tag;
	private Object vol_desc_seq_num;
	private udf_regid_s imp_id;
	private Object imp_use;
	
	public imp_use_vol_desc_s(udf_tag_s tag, Object vol_desc_seq_num, udf_regid_s imp_id, Object imp_use) {
		setTag(tag);
		setVol_desc_seq_num(vol_desc_seq_num);
		setImp_id(imp_id);
		setImp_use(imp_use);
	}
	public imp_use_vol_desc_s() {
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
	public udf_regid_s getImp_id() {
		return imp_id;
	}
	public void setImp_id(udf_regid_s newImp_id) {
		imp_id = newImp_id;
	}
	public Object getImp_use() {
		return imp_use;
	}
	public void setImp_use(Object newImp_use) {
		imp_use = newImp_use;
	}
}

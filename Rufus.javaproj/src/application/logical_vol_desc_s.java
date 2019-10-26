package application;

/** Logical Volume Descriptor (ECMA 167r3 3/10.6) */
public class logical_vol_desc_s {
	private udf_tag_s tag;
	private Object seq_num;
	private udf_charspec_s desc_charset;
	private Object logvol_id;
	private Object logical_blocksize;
	private udf_regid_s domain_id;
	private  lvd_use;
	private Object logvol_contents_use;
	private Object maptable_len;
	private Object i_partition_maps;
	private udf_regid_s imp_id;
	private Object imp_use;
	private udf_extent_ad_s integrity_seq_ext;
	private Object partition_maps;
	
	public logical_vol_desc_s(udf_tag_s tag, Object seq_num, udf_charspec_s desc_charset, Object logvol_id, Object logical_blocksize, udf_regid_s domain_id,  lvd_use, Object logvol_contents_use, Object maptable_len, Object i_partition_maps, udf_regid_s imp_id, Object imp_use, udf_extent_ad_s integrity_seq_ext, Object partition_maps) {
		setTag(tag);
		setSeq_num(seq_num);
		setDesc_charset(desc_charset);
		setLogvol_id(logvol_id);
		setLogical_blocksize(logical_blocksize);
		setDomain_id(domain_id);
		setLvd_use(lvd_use);
		setLogvol_contents_use(logvol_contents_use);
		setMaptable_len(maptable_len);
		setI_partition_maps(i_partition_maps);
		setImp_id(imp_id);
		setImp_use(imp_use);
		setIntegrity_seq_ext(integrity_seq_ext);
		setPartition_maps(partition_maps);
	}
	public logical_vol_desc_s() {
	}
	
	public udf_tag_s getTag() {
		return tag;
	}
	public void setTag(udf_tag_s newTag) {
		tag = newTag;
	}
	public Object getSeq_num() {
		return seq_num;
	}
	public void setSeq_num(Object newSeq_num) {
		seq_num = newSeq_num;
	}
	public udf_charspec_s getDesc_charset() {
		return desc_charset;
	}
	public void setDesc_charset(udf_charspec_s newDesc_charset) {
		desc_charset = newDesc_charset;
	}
	public Object getLogvol_id() {
		return logvol_id;
	}
	public void setLogvol_id(Object newLogvol_id) {
		logvol_id = newLogvol_id;
	}
	public Object getLogical_blocksize() {
		return logical_blocksize;
	}
	public void setLogical_blocksize(Object newLogical_blocksize) {
		logical_blocksize = newLogical_blocksize;
	}
	public udf_regid_s getDomain_id() {
		return domain_id;
	}
	public void setDomain_id(udf_regid_s newDomain_id) {
		domain_id = newDomain_id;
	}
	public  getLvd_use() {
		return lvd_use;
	}
	public void setLvd_use( newLvd_use) {
		lvd_use = newLvd_use;
	}
	public Object getLogvol_contents_use() {
		return logvol_contents_use;
	}
	public void setLogvol_contents_use(Object newLogvol_contents_use) {
		logvol_contents_use = newLogvol_contents_use;
	}
	public Object getMaptable_len() {
		return maptable_len;
	}
	public void setMaptable_len(Object newMaptable_len) {
		maptable_len = newMaptable_len;
	}
	public Object getI_partition_maps() {
		return i_partition_maps;
	}
	public void setI_partition_maps(Object newI_partition_maps) {
		i_partition_maps = newI_partition_maps;
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
	public udf_extent_ad_s getIntegrity_seq_ext() {
		return integrity_seq_ext;
	}
	public void setIntegrity_seq_ext(udf_extent_ad_s newIntegrity_seq_ext) {
		integrity_seq_ext = newIntegrity_seq_ext;
	}
	public Object getPartition_maps() {
		return partition_maps;
	}
	public void setPartition_maps(Object newPartition_maps) {
		partition_maps = newPartition_maps;
	}
}

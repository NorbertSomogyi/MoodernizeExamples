package application;

/** Partition Descriptor (ECMA 167r3 3/10.5) */
public class partition_desc_s {
	private udf_tag_s tag;
	private Object vol_desc_seq_num;
	private Object flags;
	private Object number;
	private udf_regid_s contents;
	private Object contents_use;
	private Object access_type;
	private Object start_loc;
	private Object part_len;
	private udf_regid_s imp_id;
	private Object imp_use;
	private Object reserved;
	
	public partition_desc_s(udf_tag_s tag, Object vol_desc_seq_num, Object flags, Object number, udf_regid_s contents, Object contents_use, Object access_type, Object start_loc, Object part_len, udf_regid_s imp_id, Object imp_use, Object reserved) {
		setTag(tag);
		setVol_desc_seq_num(vol_desc_seq_num);
		setFlags(flags);
		setNumber(number);
		setContents(contents);
		setContents_use(contents_use);
		setAccess_type(access_type);
		setStart_loc(start_loc);
		setPart_len(part_len);
		setImp_id(imp_id);
		setImp_use(imp_use);
		setReserved(reserved);
	}
	public partition_desc_s() {
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
	public Object getFlags() {
		return flags;
	}
	public void setFlags(Object newFlags) {
		flags = newFlags;
	}
	public Object getNumber() {
		return number;
	}
	public void setNumber(Object newNumber) {
		number = newNumber;
	}
	public udf_regid_s getContents() {
		return contents;
	}
	public void setContents(udf_regid_s newContents) {
		contents = newContents;
	}
	public Object getContents_use() {
		return contents_use;
	}
	public void setContents_use(Object newContents_use) {
		contents_use = newContents_use;
	}
	public Object getAccess_type() {
		return access_type;
	}
	public void setAccess_type(Object newAccess_type) {
		access_type = newAccess_type;
	}
	public Object getStart_loc() {
		return start_loc;
	}
	public void setStart_loc(Object newStart_loc) {
		start_loc = newStart_loc;
	}
	public Object getPart_len() {
		return part_len;
	}
	public void setPart_len(Object newPart_len) {
		part_len = newPart_len;
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
	public Object getReserved() {
		return reserved;
	}
	public void setReserved(Object newReserved) {
		reserved = newReserved;
	}
}
/** Partition Flags (ECMA 167r3 3/10.5.3) */
/** Partition Contents (ECMA 167r2 3/10.5.3) */
/** Partition Contents (ECMA 167r3 3/10.5.5) */

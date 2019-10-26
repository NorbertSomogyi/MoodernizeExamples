package application;

/** File Entry (ECMA 167r3 4/14.9) */
public class udf_file_entry_s {
	private udf_tag_s tag;
	private udf_icbtag_s icb_tag;
	private Object uid;
	private Object gid;
	private Object permissions;
	private Object link_count;
	private Object rec_format;
	private Object rec_disp_attr;
	private Object rec_len;
	private Object info_len;
	private Object logblks_recorded;
	private udf_timestamp_s access_time;
	private udf_timestamp_s modification_time;
	private udf_timestamp_s attribute_time;
	private Object checkpoint;
	private udf_long_ad_s ext_attr_ICB;
	private udf_regid_s imp_id;
	private Object unique_ID;
	private Object i_extended_attr;
	private Object i_alloc_descs;
	private  u;
	
	public udf_file_entry_s(udf_tag_s tag, udf_icbtag_s icb_tag, Object uid, Object gid, Object permissions, Object link_count, Object rec_format, Object rec_disp_attr, Object rec_len, Object info_len, Object logblks_recorded, udf_timestamp_s access_time, udf_timestamp_s modification_time, udf_timestamp_s attribute_time, Object checkpoint, udf_long_ad_s ext_attr_ICB, udf_regid_s imp_id, Object unique_ID, Object i_extended_attr, Object i_alloc_descs,  u) {
		setTag(tag);
		setIcb_tag(icb_tag);
		setUid(uid);
		setGid(gid);
		setPermissions(permissions);
		setLink_count(link_count);
		setRec_format(rec_format);
		setRec_disp_attr(rec_disp_attr);
		setRec_len(rec_len);
		setInfo_len(info_len);
		setLogblks_recorded(logblks_recorded);
		setAccess_time(access_time);
		setModification_time(modification_time);
		setAttribute_time(attribute_time);
		setCheckpoint(checkpoint);
		setExt_attr_ICB(ext_attr_ICB);
		setImp_id(imp_id);
		setUnique_ID(unique_ID);
		setI_extended_attr(i_extended_attr);
		setI_alloc_descs(i_alloc_descs);
		setU(u);
	}
	public udf_file_entry_s() {
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
	public Object getUid() {
		return uid;
	}
	public void setUid(Object newUid) {
		uid = newUid;
	}
	public Object getGid() {
		return gid;
	}
	public void setGid(Object newGid) {
		gid = newGid;
	}
	public Object getPermissions() {
		return permissions;
	}
	public void setPermissions(Object newPermissions) {
		permissions = newPermissions;
	}
	public Object getLink_count() {
		return link_count;
	}
	public void setLink_count(Object newLink_count) {
		link_count = newLink_count;
	}
	public Object getRec_format() {
		return rec_format;
	}
	public void setRec_format(Object newRec_format) {
		rec_format = newRec_format;
	}
	public Object getRec_disp_attr() {
		return rec_disp_attr;
	}
	public void setRec_disp_attr(Object newRec_disp_attr) {
		rec_disp_attr = newRec_disp_attr;
	}
	public Object getRec_len() {
		return rec_len;
	}
	public void setRec_len(Object newRec_len) {
		rec_len = newRec_len;
	}
	public Object getInfo_len() {
		return info_len;
	}
	public void setInfo_len(Object newInfo_len) {
		info_len = newInfo_len;
	}
	public Object getLogblks_recorded() {
		return logblks_recorded;
	}
	public void setLogblks_recorded(Object newLogblks_recorded) {
		logblks_recorded = newLogblks_recorded;
	}
	public udf_timestamp_s getAccess_time() {
		return access_time;
	}
	public void setAccess_time(udf_timestamp_s newAccess_time) {
		access_time = newAccess_time;
	}
	public udf_timestamp_s getModification_time() {
		return modification_time;
	}
	public void setModification_time(udf_timestamp_s newModification_time) {
		modification_time = newModification_time;
	}
	public udf_timestamp_s getAttribute_time() {
		return attribute_time;
	}
	public void setAttribute_time(udf_timestamp_s newAttribute_time) {
		attribute_time = newAttribute_time;
	}
	public Object getCheckpoint() {
		return checkpoint;
	}
	public void setCheckpoint(Object newCheckpoint) {
		checkpoint = newCheckpoint;
	}
	public udf_long_ad_s getExt_attr_ICB() {
		return ext_attr_ICB;
	}
	public void setExt_attr_ICB(udf_long_ad_s newExt_attr_ICB) {
		ext_attr_ICB = newExt_attr_ICB;
	}
	public udf_regid_s getImp_id() {
		return imp_id;
	}
	public void setImp_id(udf_regid_s newImp_id) {
		imp_id = newImp_id;
	}
	public Object getUnique_ID() {
		return unique_ID;
	}
	public void setUnique_ID(Object newUnique_ID) {
		unique_ID = newUnique_ID;
	}
	public Object getI_extended_attr() {
		return i_extended_attr;
	}
	public void setI_extended_attr(Object newI_extended_attr) {
		i_extended_attr = newI_extended_attr;
	}
	public Object getI_alloc_descs() {
		return i_alloc_descs;
	}
	public void setI_alloc_descs(Object newI_alloc_descs) {
		i_alloc_descs = newI_alloc_descs;
	}
	public  getU() {
		return u;
	}
	public void setU( newU) {
		u = newU;
	}
}
/** Permissions (ECMA 167r3 4/14.9.5) */

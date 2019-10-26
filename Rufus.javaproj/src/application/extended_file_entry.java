package application;

/** File Entry (ECMA 167r3 4/14.17) */
public class extended_file_entry {
	private udf_tag_s tag;
	private udf_icbtag_s icb_tag;
	private Object uid;
	private Object gid;
	private Object permissions;
	private Object link_count;
	private Object rec_format;
	private Object rec_display_attr;
	private Object record_len;
	private Object info_len;
	private Object object_size;
	private Object logblks_recorded;
	private udf_timestamp_s access_time;
	private udf_timestamp_s modification_time;
	private udf_timestamp_s create_time;
	private udf_timestamp_s attribute_time;
	private Object checkpoint;
	private Object reserved;
	private udf_long_ad_s ext_attr_ICB;
	private udf_long_ad_s stream_directory_ICB;
	private udf_regid_s imp_id;
	private Object unique_ID;
	private Object length_extended_attr;
	private Object length_alloc_descs;
	private  u;
	
	public extended_file_entry(udf_tag_s tag, udf_icbtag_s icb_tag, Object uid, Object gid, Object permissions, Object link_count, Object rec_format, Object rec_display_attr, Object record_len, Object info_len, Object object_size, Object logblks_recorded, udf_timestamp_s access_time, udf_timestamp_s modification_time, udf_timestamp_s create_time, udf_timestamp_s attribute_time, Object checkpoint, Object reserved, udf_long_ad_s ext_attr_ICB, udf_long_ad_s stream_directory_ICB, udf_regid_s imp_id, Object unique_ID, Object length_extended_attr, Object length_alloc_descs,  u) {
		setTag(tag);
		setIcb_tag(icb_tag);
		setUid(uid);
		setGid(gid);
		setPermissions(permissions);
		setLink_count(link_count);
		setRec_format(rec_format);
		setRec_display_attr(rec_display_attr);
		setRecord_len(record_len);
		setInfo_len(info_len);
		setObject_size(object_size);
		setLogblks_recorded(logblks_recorded);
		setAccess_time(access_time);
		setModification_time(modification_time);
		setCreate_time(create_time);
		setAttribute_time(attribute_time);
		setCheckpoint(checkpoint);
		setReserved(reserved);
		setExt_attr_ICB(ext_attr_ICB);
		setStream_directory_ICB(stream_directory_ICB);
		setImp_id(imp_id);
		setUnique_ID(unique_ID);
		setLength_extended_attr(length_extended_attr);
		setLength_alloc_descs(length_alloc_descs);
		setU(u);
	}
	public extended_file_entry() {
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
	public Object getRec_display_attr() {
		return rec_display_attr;
	}
	public void setRec_display_attr(Object newRec_display_attr) {
		rec_display_attr = newRec_display_attr;
	}
	public Object getRecord_len() {
		return record_len;
	}
	public void setRecord_len(Object newRecord_len) {
		record_len = newRecord_len;
	}
	public Object getInfo_len() {
		return info_len;
	}
	public void setInfo_len(Object newInfo_len) {
		info_len = newInfo_len;
	}
	public Object getObject_size() {
		return object_size;
	}
	public void setObject_size(Object newObject_size) {
		object_size = newObject_size;
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
	public udf_timestamp_s getCreate_time() {
		return create_time;
	}
	public void setCreate_time(udf_timestamp_s newCreate_time) {
		create_time = newCreate_time;
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
	public Object getReserved() {
		return reserved;
	}
	public void setReserved(Object newReserved) {
		reserved = newReserved;
	}
	public udf_long_ad_s getExt_attr_ICB() {
		return ext_attr_ICB;
	}
	public void setExt_attr_ICB(udf_long_ad_s newExt_attr_ICB) {
		ext_attr_ICB = newExt_attr_ICB;
	}
	public udf_long_ad_s getStream_directory_ICB() {
		return stream_directory_ICB;
	}
	public void setStream_directory_ICB(udf_long_ad_s newStream_directory_ICB) {
		stream_directory_ICB = newStream_directory_ICB;
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
	public Object getLength_extended_attr() {
		return length_extended_attr;
	}
	public void setLength_extended_attr(Object newLength_extended_attr) {
		length_extended_attr = newLength_extended_attr;
	}
	public Object getLength_alloc_descs() {
		return length_alloc_descs;
	}
	public void setLength_alloc_descs(Object newLength_alloc_descs) {
		length_alloc_descs = newLength_alloc_descs;
	}
	public  getU() {
		return u;
	}
	public void setU( newU) {
		u = newU;
	}
}

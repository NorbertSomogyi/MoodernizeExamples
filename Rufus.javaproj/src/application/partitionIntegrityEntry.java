package application;

/** Partition Integrity Entry (ECMA 167r3 4/14.13) */
public class partitionIntegrityEntry {
	private udf_tag_s tag;
	private udf_icbtag_s icb_tag;
	private udf_timestamp_s recording_time;
	private Object integrityType;
	private Object reserved;
	private udf_regid_s imp_id;
	private Object imp_use;
	
	public partitionIntegrityEntry(udf_tag_s tag, udf_icbtag_s icb_tag, udf_timestamp_s recording_time, Object integrityType, Object reserved, udf_regid_s imp_id, Object imp_use) {
		setTag(tag);
		setIcb_tag(icb_tag);
		setRecording_time(recording_time);
		setIntegrityType(integrityType);
		setReserved(reserved);
		setImp_id(imp_id);
		setImp_use(imp_use);
	}
	public partitionIntegrityEntry() {
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
	public udf_timestamp_s getRecording_time() {
		return recording_time;
	}
	public void setRecording_time(udf_timestamp_s newRecording_time) {
		recording_time = newRecording_time;
	}
	public Object getIntegrityType() {
		return integrityType;
	}
	public void setIntegrityType(Object newIntegrityType) {
		integrityType = newIntegrityType;
	}
	public Object getReserved() {
		return reserved;
	}
	public void setReserved(Object newReserved) {
		reserved = newReserved;
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

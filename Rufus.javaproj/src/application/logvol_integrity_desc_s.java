package application;

/** Logical Volume Integrity Descriptor (ECMA 167r3 3/10.10) */
public class logvol_integrity_desc_s {
	private udf_tag_s tag;
	private udf_timestamp_s recording_time;
	private Object integrity_type;
	private udf_extent_ad_s next_integrity_ext;
	private Object[] logvol_contents_use;
	private Object i_partitions;
	private  u;
	
	public logvol_integrity_desc_s(udf_tag_s tag, udf_timestamp_s recording_time, Object integrity_type, udf_extent_ad_s next_integrity_ext, Object[] logvol_contents_use, Object i_partitions,  u) {
		setTag(tag);
		setRecording_time(recording_time);
		setIntegrity_type(integrity_type);
		setNext_integrity_ext(next_integrity_ext);
		setLogvol_contents_use(logvol_contents_use);
		setI_partitions(i_partitions);
		setU(u);
	}
	public logvol_integrity_desc_s() {
	}
	
	public udf_tag_s getTag() {
		return tag;
	}
	public void setTag(udf_tag_s newTag) {
		tag = newTag;
	}
	public udf_timestamp_s getRecording_time() {
		return recording_time;
	}
	public void setRecording_time(udf_timestamp_s newRecording_time) {
		recording_time = newRecording_time;
	}
	public Object getIntegrity_type() {
		return integrity_type;
	}
	public void setIntegrity_type(Object newIntegrity_type) {
		integrity_type = newIntegrity_type;
	}
	public udf_extent_ad_s getNext_integrity_ext() {
		return next_integrity_ext;
	}
	public void setNext_integrity_ext(udf_extent_ad_s newNext_integrity_ext) {
		next_integrity_ext = newNext_integrity_ext;
	}
	public Object[] getLogvol_contents_use() {
		return logvol_contents_use;
	}
	public void setLogvol_contents_use(Object[] newLogvol_contents_use) {
		logvol_contents_use = newLogvol_contents_use;
	}
	public Object getI_partitions() {
		return i_partitions;
	}
	public void setI_partitions(Object newI_partitions) {
		i_partitions = newI_partitions;
	}
	public  getU() {
		return u;
	}
	public void setU( newU) {
		u = newU;
	}
}

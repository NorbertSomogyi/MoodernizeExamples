package application;

/** Tag Identifier (ECMA 167r3 4/7.2.1) */
/** File Set Descriptor (ECMA 167r3 4/14.1) */
public class udf_fsd_s {
	private udf_tag_s tag;
	private udf_timestamp_s recording_time;
	private Object interchange_lvl;
	private Object maxInterchange_lvl;
	private Object charset_list;
	private Object max_charset_list;
	private Object fileset_num;
	private Object udf_fsd_num;
	private udf_charspec_s logical_vol_id_charset;
	private Object[] logical_vol_id;
	private udf_charspec_s fileset_charset;
	private Object[] fileSet_id;
	private Object[] copyright_file_id;
	private Object[] abstract_file_id;
	private udf_long_ad_s root_icb;
	private udf_regid_s domain_id;
	private udf_long_ad_s next_ext;
	private udf_long_ad_s stream_directory_ICB;
	private Object[] reserved;
	
	public udf_fsd_s(udf_tag_s tag, udf_timestamp_s recording_time, Object interchange_lvl, Object maxInterchange_lvl, Object charset_list, Object max_charset_list, Object fileset_num, Object udf_fsd_num, udf_charspec_s logical_vol_id_charset, Object[] logical_vol_id, udf_charspec_s fileset_charset, Object[] fileSet_id, Object[] copyright_file_id, Object[] abstract_file_id, udf_long_ad_s root_icb, udf_regid_s domain_id, udf_long_ad_s next_ext, udf_long_ad_s stream_directory_ICB, Object[] reserved) {
		setTag(tag);
		setRecording_time(recording_time);
		setInterchange_lvl(interchange_lvl);
		setMaxInterchange_lvl(maxInterchange_lvl);
		setCharset_list(charset_list);
		setMax_charset_list(max_charset_list);
		setFileset_num(fileset_num);
		setUdf_fsd_num(udf_fsd_num);
		setLogical_vol_id_charset(logical_vol_id_charset);
		setLogical_vol_id(logical_vol_id);
		setFileset_charset(fileset_charset);
		setFileSet_id(fileSet_id);
		setCopyright_file_id(copyright_file_id);
		setAbstract_file_id(abstract_file_id);
		setRoot_icb(root_icb);
		setDomain_id(domain_id);
		setNext_ext(next_ext);
		setStream_directory_ICB(stream_directory_ICB);
		setReserved(reserved);
	}
	public udf_fsd_s() {
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
	public Object getInterchange_lvl() {
		return interchange_lvl;
	}
	public void setInterchange_lvl(Object newInterchange_lvl) {
		interchange_lvl = newInterchange_lvl;
	}
	public Object getMaxInterchange_lvl() {
		return maxInterchange_lvl;
	}
	public void setMaxInterchange_lvl(Object newMaxInterchange_lvl) {
		maxInterchange_lvl = newMaxInterchange_lvl;
	}
	public Object getCharset_list() {
		return charset_list;
	}
	public void setCharset_list(Object newCharset_list) {
		charset_list = newCharset_list;
	}
	public Object getMax_charset_list() {
		return max_charset_list;
	}
	public void setMax_charset_list(Object newMax_charset_list) {
		max_charset_list = newMax_charset_list;
	}
	public Object getFileset_num() {
		return fileset_num;
	}
	public void setFileset_num(Object newFileset_num) {
		fileset_num = newFileset_num;
	}
	public Object getUdf_fsd_num() {
		return udf_fsd_num;
	}
	public void setUdf_fsd_num(Object newUdf_fsd_num) {
		udf_fsd_num = newUdf_fsd_num;
	}
	public udf_charspec_s getLogical_vol_id_charset() {
		return logical_vol_id_charset;
	}
	public void setLogical_vol_id_charset(udf_charspec_s newLogical_vol_id_charset) {
		logical_vol_id_charset = newLogical_vol_id_charset;
	}
	public Object[] getLogical_vol_id() {
		return logical_vol_id;
	}
	public void setLogical_vol_id(Object[] newLogical_vol_id) {
		logical_vol_id = newLogical_vol_id;
	}
	public udf_charspec_s getFileset_charset() {
		return fileset_charset;
	}
	public void setFileset_charset(udf_charspec_s newFileset_charset) {
		fileset_charset = newFileset_charset;
	}
	public Object[] getFileSet_id() {
		return fileSet_id;
	}
	public void setFileSet_id(Object[] newFileSet_id) {
		fileSet_id = newFileSet_id;
	}
	public Object[] getCopyright_file_id() {
		return copyright_file_id;
	}
	public void setCopyright_file_id(Object[] newCopyright_file_id) {
		copyright_file_id = newCopyright_file_id;
	}
	public Object[] getAbstract_file_id() {
		return abstract_file_id;
	}
	public void setAbstract_file_id(Object[] newAbstract_file_id) {
		abstract_file_id = newAbstract_file_id;
	}
	public udf_long_ad_s getRoot_icb() {
		return root_icb;
	}
	public void setRoot_icb(udf_long_ad_s newRoot_icb) {
		root_icb = newRoot_icb;
	}
	public udf_regid_s getDomain_id() {
		return domain_id;
	}
	public void setDomain_id(udf_regid_s newDomain_id) {
		domain_id = newDomain_id;
	}
	public udf_long_ad_s getNext_ext() {
		return next_ext;
	}
	public void setNext_ext(udf_long_ad_s newNext_ext) {
		next_ext = newNext_ext;
	}
	public udf_long_ad_s getStream_directory_ICB() {
		return stream_directory_ICB;
	}
	public void setStream_directory_ICB(udf_long_ad_s newStream_directory_ICB) {
		stream_directory_ICB = newStream_directory_ICB;
	}
	public Object[] getReserved() {
		return reserved;
	}
	public void setReserved(Object[] newReserved) {
		reserved = newReserved;
	}
}

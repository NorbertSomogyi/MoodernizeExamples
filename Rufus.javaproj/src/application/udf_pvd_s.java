package application;

/** Primary Volume Descriptor (ECMA 167r3 3/10.1) */
public class udf_pvd_s {
	private udf_tag_s tag;
	private Object vol_desc_seq_num;
	private Object primary_vol_desc_num;
	private Object vol_ident;
	private Object vol_seq_num;
	private Object max_vol_seqnum;
	private Object interchange_lvl;
	private Object max_interchange_lvl;
	private Object charset_list;
	private Object max_charset_list;
	private Object volset_id;
	private udf_charspec_s desc_charset;
	private udf_charspec_s explanatory_charset;
	private udf_extent_ad_s vol_abstract;
	private udf_extent_ad_s vol_copyright;
	private udf_regid_s app_ident;
	private udf_timestamp_s recording_time;
	private udf_regid_s imp_ident;
	private Object imp_use;
	private Object predecessor_vol_desc_seq_location;
	private Object flags;
	private Object reserved;
	
	public udf_pvd_s(udf_tag_s tag, Object vol_desc_seq_num, Object primary_vol_desc_num, Object vol_ident, Object vol_seq_num, Object max_vol_seqnum, Object interchange_lvl, Object max_interchange_lvl, Object charset_list, Object max_charset_list, Object volset_id, udf_charspec_s desc_charset, udf_charspec_s explanatory_charset, udf_extent_ad_s vol_abstract, udf_extent_ad_s vol_copyright, udf_regid_s app_ident, udf_timestamp_s recording_time, udf_regid_s imp_ident, Object imp_use, Object predecessor_vol_desc_seq_location, Object flags, Object reserved) {
		setTag(tag);
		setVol_desc_seq_num(vol_desc_seq_num);
		setPrimary_vol_desc_num(primary_vol_desc_num);
		setVol_ident(vol_ident);
		setVol_seq_num(vol_seq_num);
		setMax_vol_seqnum(max_vol_seqnum);
		setInterchange_lvl(interchange_lvl);
		setMax_interchange_lvl(max_interchange_lvl);
		setCharset_list(charset_list);
		setMax_charset_list(max_charset_list);
		setVolset_id(volset_id);
		setDesc_charset(desc_charset);
		setExplanatory_charset(explanatory_charset);
		setVol_abstract(vol_abstract);
		setVol_copyright(vol_copyright);
		setApp_ident(app_ident);
		setRecording_time(recording_time);
		setImp_ident(imp_ident);
		setImp_use(imp_use);
		setPredecessor_vol_desc_seq_location(predecessor_vol_desc_seq_location);
		setFlags(flags);
		setReserved(reserved);
	}
	public udf_pvd_s() {
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
	public Object getPrimary_vol_desc_num() {
		return primary_vol_desc_num;
	}
	public void setPrimary_vol_desc_num(Object newPrimary_vol_desc_num) {
		primary_vol_desc_num = newPrimary_vol_desc_num;
	}
	public Object getVol_ident() {
		return vol_ident;
	}
	public void setVol_ident(Object newVol_ident) {
		vol_ident = newVol_ident;
	}
	public Object getVol_seq_num() {
		return vol_seq_num;
	}
	public void setVol_seq_num(Object newVol_seq_num) {
		vol_seq_num = newVol_seq_num;
	}
	public Object getMax_vol_seqnum() {
		return max_vol_seqnum;
	}
	public void setMax_vol_seqnum(Object newMax_vol_seqnum) {
		max_vol_seqnum = newMax_vol_seqnum;
	}
	public Object getInterchange_lvl() {
		return interchange_lvl;
	}
	public void setInterchange_lvl(Object newInterchange_lvl) {
		interchange_lvl = newInterchange_lvl;
	}
	public Object getMax_interchange_lvl() {
		return max_interchange_lvl;
	}
	public void setMax_interchange_lvl(Object newMax_interchange_lvl) {
		max_interchange_lvl = newMax_interchange_lvl;
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
	public Object getVolset_id() {
		return volset_id;
	}
	public void setVolset_id(Object newVolset_id) {
		volset_id = newVolset_id;
	}
	public udf_charspec_s getDesc_charset() {
		return desc_charset;
	}
	public void setDesc_charset(udf_charspec_s newDesc_charset) {
		desc_charset = newDesc_charset;
	}
	public udf_charspec_s getExplanatory_charset() {
		return explanatory_charset;
	}
	public void setExplanatory_charset(udf_charspec_s newExplanatory_charset) {
		explanatory_charset = newExplanatory_charset;
	}
	public udf_extent_ad_s getVol_abstract() {
		return vol_abstract;
	}
	public void setVol_abstract(udf_extent_ad_s newVol_abstract) {
		vol_abstract = newVol_abstract;
	}
	public udf_extent_ad_s getVol_copyright() {
		return vol_copyright;
	}
	public void setVol_copyright(udf_extent_ad_s newVol_copyright) {
		vol_copyright = newVol_copyright;
	}
	public udf_regid_s getApp_ident() {
		return app_ident;
	}
	public void setApp_ident(udf_regid_s newApp_ident) {
		app_ident = newApp_ident;
	}
	public udf_timestamp_s getRecording_time() {
		return recording_time;
	}
	public void setRecording_time(udf_timestamp_s newRecording_time) {
		recording_time = newRecording_time;
	}
	public udf_regid_s getImp_ident() {
		return imp_ident;
	}
	public void setImp_ident(udf_regid_s newImp_ident) {
		imp_ident = newImp_ident;
	}
	public Object getImp_use() {
		return imp_use;
	}
	public void setImp_use(Object newImp_use) {
		imp_use = newImp_use;
	}
	public Object getPredecessor_vol_desc_seq_location() {
		return predecessor_vol_desc_seq_location;
	}
	public void setPredecessor_vol_desc_seq_location(Object newPredecessor_vol_desc_seq_location) {
		predecessor_vol_desc_seq_location = newPredecessor_vol_desc_seq_location;
	}
	public Object getFlags() {
		return flags;
	}
	public void setFlags(Object newFlags) {
		flags = newFlags;
	}
	public Object getReserved() {
		return reserved;
	}
	public void setReserved(Object newReserved) {
		reserved = newReserved;
	}
}
/** Flags (ECMA 167r3 3/10.1.21) */

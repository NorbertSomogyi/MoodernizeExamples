package application;

/** File Identifier Descriptor (ECMA 167r3 4/14.4) */
public class udf_fileid_desc_s {
	private udf_tag_s tag;
	private Object file_version_num;
	private Object file_characteristics;
	private Object i_file_id;
	private udf_long_ad_s icb;
	private  u;
	
	public udf_fileid_desc_s(udf_tag_s tag, Object file_version_num, Object file_characteristics, Object i_file_id, udf_long_ad_s icb,  u) {
		setTag(tag);
		setFile_version_num(file_version_num);
		setFile_characteristics(file_characteristics);
		setI_file_id(i_file_id);
		setIcb(icb);
		setU(u);
	}
	public udf_fileid_desc_s() {
	}
	
	public udf_tag_s getTag() {
		return tag;
	}
	public void setTag(udf_tag_s newTag) {
		tag = newTag;
	}
	public Object getFile_version_num() {
		return file_version_num;
	}
	public void setFile_version_num(Object newFile_version_num) {
		file_version_num = newFile_version_num;
	}
	public Object getFile_characteristics() {
		return file_characteristics;
	}
	public void setFile_characteristics(Object newFile_characteristics) {
		file_characteristics = newFile_characteristics;
	}
	public Object getI_file_id() {
		return i_file_id;
	}
	public void setI_file_id(Object newI_file_id) {
		i_file_id = newI_file_id;
	}
	public udf_long_ad_s getIcb() {
		return icb;
	}
	public void setIcb(udf_long_ad_s newIcb) {
		icb = newIcb;
	}
	public  getU() {
		return u;
	}
	public void setU( newU) {
		u = newU;
	}
}
/** File Characteristics (ECMA 167r3 4/14.4.3) 

    Imagine the below enumeration values are \#defines to be used in a
    bitmask rather than distinct values of an enum.
*/

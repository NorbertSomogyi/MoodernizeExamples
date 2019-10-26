package application;

/** Terminal Entry (ECMA 167r3 4/14.8) */
public class terminal_entry_s {
	private udf_tag_s tag;
	private udf_icbtag_s icb_tag;
	
	public terminal_entry_s(udf_tag_s tag, udf_icbtag_s icb_tag) {
		setTag(tag);
		setIcb_tag(icb_tag);
	}
	public terminal_entry_s() {
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
}

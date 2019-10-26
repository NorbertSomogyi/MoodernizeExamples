package application;

/** Indirect Entry (ECMA 167r3 4/14.7) */
public class indirect_entry_s {
	private udf_tag_s tag;
	private udf_icbtag_s icb_tag;
	private udf_long_ad_s indirect_ICB;
	
	public indirect_entry_s(udf_tag_s tag, udf_icbtag_s icb_tag, udf_long_ad_s indirect_ICB) {
		setTag(tag);
		setIcb_tag(icb_tag);
		setIndirect_ICB(indirect_ICB);
	}
	public indirect_entry_s() {
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
	public udf_long_ad_s getIndirect_ICB() {
		return indirect_ICB;
	}
	public void setIndirect_ICB(udf_long_ad_s newIndirect_ICB) {
		indirect_ICB = newIndirect_ICB;
	}
}

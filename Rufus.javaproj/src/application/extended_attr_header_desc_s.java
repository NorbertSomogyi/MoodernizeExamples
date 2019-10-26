package application;

/** Record Format (ECMA 167r3 4/14.9.7) */
/** Record Display Attributes (ECMA 167r3 4/14.9.8) */
/** Extended Attribute Header Descriptor (ECMA 167r3 4/14.10.1) */
public class extended_attr_header_desc_s {
	private udf_tag_s tag;
	private Object imp_attr_location;
	private Object app_attr_location;
	
	public extended_attr_header_desc_s(udf_tag_s tag, Object imp_attr_location, Object app_attr_location) {
		setTag(tag);
		setImp_attr_location(imp_attr_location);
		setApp_attr_location(app_attr_location);
	}
	public extended_attr_header_desc_s() {
	}
	
	public udf_tag_s getTag() {
		return tag;
	}
	public void setTag(udf_tag_s newTag) {
		tag = newTag;
	}
	public Object getImp_attr_location() {
		return imp_attr_location;
	}
	public void setImp_attr_location(Object newImp_attr_location) {
		imp_attr_location = newImp_attr_location;
	}
	public Object getApp_attr_location() {
		return app_attr_location;
	}
	public void setApp_attr_location(Object newApp_attr_location) {
		app_attr_location = newApp_attr_location;
	}
}

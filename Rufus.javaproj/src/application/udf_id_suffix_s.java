package application;

public class udf_id_suffix_s {
	private Object udf_revision;
	private Object os_class;
	private Object os_identifier;
	private Object reserved;
	
	public udf_id_suffix_s(Object udf_revision, Object os_class, Object os_identifier, Object reserved) {
		setUdf_revision(udf_revision);
		setOs_class(os_class);
		setOs_identifier(os_identifier);
		setReserved(reserved);
	}
	public udf_id_suffix_s() {
	}
	
	public Object getUdf_revision() {
		return udf_revision;
	}
	public void setUdf_revision(Object newUdf_revision) {
		udf_revision = newUdf_revision;
	}
	public Object getOs_class() {
		return os_class;
	}
	public void setOs_class(Object newOs_class) {
		os_class = newOs_class;
	}
	public Object getOs_identifier() {
		return os_identifier;
	}
	public void setOs_identifier(Object newOs_identifier) {
		os_identifier = newOs_identifier;
	}
	public Object getReserved() {
		return reserved;
	}
	public void setReserved(Object newReserved) {
		reserved = newReserved;
	}
}

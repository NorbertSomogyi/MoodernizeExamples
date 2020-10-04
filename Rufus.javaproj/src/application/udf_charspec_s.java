package application;

/** Character set specification (ECMA 167r3 1/7.2.1) */
public class udf_charspec_s {
	private Object charset_type;
	private Object[] charset_info;
	
	public udf_charspec_s(Object charset_type, Object[] charset_info) {
		setCharset_type(charset_type);
		setCharset_info(charset_info);
	}
	public udf_charspec_s() {
	}
	
	public Object getCharset_type() {
		return charset_type;
	}
	public void setCharset_type(Object newCharset_type) {
		charset_type = newCharset_type;
	}
	public Object[] getCharset_info() {
		return charset_info;
	}
	public void setCharset_info(Object[] newCharset_info) {
		charset_info = newCharset_info;
	}
}

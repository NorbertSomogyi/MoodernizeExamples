package application;

/** Entity identifier (ECMA 167r3 1/7.4) */
public class udf_regid_s {
	private Object flags;
	private Object id;
	private udf_id_suffix_s id_suffix;
	
	public udf_regid_s(Object flags, Object id, udf_id_suffix_s id_suffix) {
		setFlags(flags);
		setId(id);
		setId_suffix(id_suffix);
	}
	public udf_regid_s() {
	}
	
	public Object getFlags() {
		return flags;
	}
	public void setFlags(Object newFlags) {
		flags = newFlags;
	}
	public Object getId() {
		return id;
	}
	public void setId(Object newId) {
		id = newId;
	}
	public udf_id_suffix_s getId_suffix() {
		return id_suffix;
	}
	public void setId_suffix(udf_id_suffix_s newId_suffix) {
		id_suffix = newId_suffix;
	}
}
/** Flags (ECMA 167r3 1/7.4.1) */

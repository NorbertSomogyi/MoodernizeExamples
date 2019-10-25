package application;

/* Content encoding writer. */
public class content_encoding_s {
	private Object name;
	private Object alias;
	private Object init_writer;
	private Object unencode_write;
	private Object close_writer;
	private Object paramsize;
	
	public content_encoding_s(Object name, Object alias, Object init_writer, Object unencode_write, Object close_writer, Object paramsize) {
		setName(name);
		setAlias(alias);
		setInit_writer(init_writer);
		setUnencode_write(unencode_write);
		setClose_writer(close_writer);
		setParamsize(paramsize);
	}
	public content_encoding_s() {
	}
	
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
	public Object getAlias() {
		return alias;
	}
	public void setAlias(Object newAlias) {
		alias = newAlias;
	}
	public Object getInit_writer() {
		return init_writer;
	}
	public void setInit_writer(Object newInit_writer) {
		init_writer = newInit_writer;
	}
	public Object getUnencode_write() {
		return unencode_write;
	}
	public void setUnencode_write(Object newUnencode_write) {
		unencode_write = newUnencode_write;
	}
	public Object getClose_writer() {
		return close_writer;
	}
	public void setClose_writer(Object newClose_writer) {
		close_writer = newClose_writer;
	}
	public Object getParamsize() {
		return paramsize;
	}
	public void setParamsize(Object newParamsize) {
		paramsize = newParamsize;
	}
}

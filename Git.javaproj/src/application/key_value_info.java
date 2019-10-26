package application;

public class key_value_info {
	private Object filename;
	private int linenr;
	private config_origin_type origin_type;
	private config_scope scope;
	
	public key_value_info(Object filename, int linenr, config_origin_type origin_type, config_scope scope) {
		setFilename(filename);
		setLinenr(linenr);
		setOrigin_type(origin_type);
		setScope(scope);
	}
	public key_value_info() {
	}
	
	public Object getFilename() {
		return filename;
	}
	public void setFilename(Object newFilename) {
		filename = newFilename;
	}
	public int getLinenr() {
		return linenr;
	}
	public void setLinenr(int newLinenr) {
		linenr = newLinenr;
	}
	public config_origin_type getOrigin_type() {
		return origin_type;
	}
	public void setOrigin_type(config_origin_type newOrigin_type) {
		origin_type = newOrigin_type;
	}
	public config_scope getScope() {
		return scope;
	}
	public void setScope(config_scope newScope) {
		scope = newScope;
	}
}

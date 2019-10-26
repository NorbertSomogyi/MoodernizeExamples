package application;

public class path_data {
	private Byte filter;
	private Byte default_path;
	private obs_path_type type;
	
	public path_data(Byte filter, Byte default_path, obs_path_type type) {
		setFilter(filter);
		setDefault_path(default_path);
		setType(type);
	}
	public path_data() {
	}
	
	public void path_data_free() {
		ModernizedCProgram.bfree(ModernizedCProgram.data.getDefault_path());
		if (ModernizedCProgram.data.getType() == obs_path_type.OBS_PATH_FILE) {
			ModernizedCProgram.bfree(ModernizedCProgram.data.getFilter());
		} 
	}
	public Byte getFilter() {
		return filter;
	}
	public void setFilter(Byte newFilter) {
		filter = newFilter;
	}
	public Byte getDefault_path() {
		return default_path;
	}
	public void setDefault_path(Byte newDefault_path) {
		default_path = newDefault_path;
	}
	public obs_path_type getType() {
		return type;
	}
	public void setType(obs_path_type newType) {
		type = newType;
	}
}

package application;

public class editable_list_data {
	private obs_editable_list_type type;
	private Byte filter;
	private Byte default_path;
	
	public editable_list_data(obs_editable_list_type type, Byte filter, Byte default_path) {
		setType(type);
		setFilter(filter);
		setDefault_path(default_path);
	}
	public editable_list_data() {
	}
	
	public void editable_list_data_free() {
		ModernizedCProgram.bfree(ModernizedCProgram.data.getDefault_path());
		ModernizedCProgram.bfree(ModernizedCProgram.data.getFilter());
	}
	public obs_editable_list_type getType() {
		return type;
	}
	public void setType(obs_editable_list_type newType) {
		type = newType;
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
}

package application;

public class group_data {
	private obs_group_type type;
	private obs_properties content;
	
	public group_data(obs_group_type type, obs_properties content) {
		setType(type);
		setContent(content);
	}
	public group_data() {
	}
	
	public void group_data_free() {
		ModernizedCProgram.data.getContent().obs_properties_destroy();
	}
	public obs_group_type getType() {
		return type;
	}
	public void setType(obs_group_type newType) {
		type = newType;
	}
	public obs_properties getContent() {
		return content;
	}
	public void setContent(obs_properties newContent) {
		content = newContent;
	}
}

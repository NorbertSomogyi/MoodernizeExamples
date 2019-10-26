package application;

public class text_data {
	private obs_text_type type;
	
	public text_data(obs_text_type type) {
		setType(type);
	}
	public text_data() {
	}
	
	public obs_text_type getType() {
		return type;
	}
	public void setType(obs_text_type newType) {
		type = newType;
	}
}

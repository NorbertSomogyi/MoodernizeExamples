package application;

public class cut_info {
	private obs_source source;
	
	public cut_info(obs_source source) {
		setSource(source);
	}
	public cut_info() {
	}
	
	public obs_source getSource() {
		return source;
	}
	public void setSource(obs_source newSource) {
		source = newSource;
	}
}

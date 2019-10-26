package application;

public class image_file_data {
	private Byte path;
	private obs_source source;
	
	public image_file_data(Byte path, obs_source source) {
		setPath(path);
		setSource(source);
	}
	public image_file_data() {
	}
	
	public Byte getPath() {
		return path;
	}
	public void setPath(Byte newPath) {
		path = newPath;
	}
	public obs_source getSource() {
		return source;
	}
	public void setSource(obs_source newSource) {
		source = newSource;
	}
}

package application;

public class test_filter {
	private obs_source source;
	private Object whatever;
	
	public test_filter(obs_source source, Object whatever) {
		setSource(source);
		setWhatever(whatever);
	}
	public test_filter() {
	}
	
	public obs_source getSource() {
		return source;
	}
	public void setSource(obs_source newSource) {
		source = newSource;
	}
	public Object getWhatever() {
		return whatever;
	}
	public void setWhatever(Object newWhatever) {
		whatever = newWhatever;
	}
}

package application;

public class walker_data {
	private Object url;
	private int got_alternates;
	private alt_base alt;
	
	public walker_data(Object url, int got_alternates, alt_base alt) {
		setUrl(url);
		setGot_alternates(got_alternates);
		setAlt(alt);
	}
	public walker_data() {
	}
	
	public Object getUrl() {
		return url;
	}
	public void setUrl(Object newUrl) {
		url = newUrl;
	}
	public int getGot_alternates() {
		return got_alternates;
	}
	public void setGot_alternates(int newGot_alternates) {
		got_alternates = newGot_alternates;
	}
	public alt_base getAlt() {
		return alt;
	}
	public void setAlt(alt_base newAlt) {
		alt = newAlt;
	}
}

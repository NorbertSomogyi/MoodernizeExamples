package application;

public class ingest {
	private Byte name;
	private Byte url;
	
	public ingest(Byte name, Byte url) {
		setName(name);
		setUrl(url);
	}
	public ingest() {
	}
	
	public Byte getName() {
		return name;
	}
	public void setName(Byte newName) {
		name = newName;
	}
	public Byte getUrl() {
		return url;
	}
	public void setUrl(Byte newUrl) {
		url = newUrl;
	}
}

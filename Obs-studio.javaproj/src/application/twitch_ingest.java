package application;

public class twitch_ingest {
	private Object name;
	private Object url;
	
	public twitch_ingest(Object name, Object url) {
		setName(name);
		setUrl(url);
	}
	public twitch_ingest() {
	}
	
	public twitch_ingest twitch_ingest(Object idx) {
		twitch_ingest ingest = new twitch_ingest();
		if (ModernizedCProgram.cur_ingests.getNum() <= idx) {
			ingest.setName(((Object)0));
			ingest.setUrl(((Object)0));
		} else {
				ingest = (twitch_ingest)(ModernizedCProgram.cur_ingests.getArray() + idx);
		} 
		return ingest;
	}
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
	public Object getUrl() {
		return url;
	}
	public void setUrl(Object newUrl) {
		url = newUrl;
	}
}

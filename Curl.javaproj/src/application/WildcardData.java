package application;

/* struct keeping information about wildcard download process */
public class WildcardData {
	private  state;
	private Object path;
	private Object pattern;
	private curl_llist filelist;
	private Object protdata;
	private Object dtor;
	private Object customptr;
	
	public WildcardData( state, Object path, Object pattern, curl_llist filelist, Object protdata, Object dtor, Object customptr) {
		setState(state);
		setPath(path);
		setPattern(pattern);
		setFilelist(filelist);
		setProtdata(protdata);
		setDtor(dtor);
		setCustomptr(customptr);
	}
	public WildcardData() {
	}
	
	public  getState() {
		return state;
	}
	public void setState( newState) {
		state = newState;
	}
	public Object getPath() {
		return path;
	}
	public void setPath(Object newPath) {
		path = newPath;
	}
	public Object getPattern() {
		return pattern;
	}
	public void setPattern(Object newPattern) {
		pattern = newPattern;
	}
	public curl_llist getFilelist() {
		return filelist;
	}
	public void setFilelist(curl_llist newFilelist) {
		filelist = newFilelist;
	}
	public Object getProtdata() {
		return protdata;
	}
	public void setProtdata(Object newProtdata) {
		protdata = newProtdata;
	}
	public Object getDtor() {
		return dtor;
	}
	public void setDtor(Object newDtor) {
		dtor = newDtor;
	}
	public Object getCustomptr() {
		return customptr;
	}
	public void setCustomptr(Object newCustomptr) {
		customptr = newCustomptr;
	}
}

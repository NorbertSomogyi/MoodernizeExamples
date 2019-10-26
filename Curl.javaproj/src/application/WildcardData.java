package application;

/* struct keeping information about wildcard download process */
public class WildcardData {
	private  state;
	private Byte path;
	private Byte pattern;
	private curl_llist filelist;
	private Object protdata;
	private Object dtor;
	private Object customptr;
	
	public WildcardData( state, Byte path, Byte pattern, curl_llist filelist, Object protdata, Object dtor, Object customptr) {
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
	
	public Object Curl_wildcard_init() {
		curl_llist generatedFilelist = this.getFilelist();
		generatedFilelist.Curl_llist_init(fileinfo_dtor);
		this.setState(.CURLWC_INIT);
		return CURLE_OK;
	}
	public void Curl_wildcard_dtor() {
		if (!wc) {
			return ;
		} 
		Object generatedDtor = this.getDtor();
		Object generatedProtdata = this.getProtdata();
		if (generatedDtor) {
			.UNRECOGNIZEDFUNCTIONNAME(generatedProtdata);
			this.setDtor(0);
			this.setProtdata(((Object)0));
		} 
		do {
		} while (0);
		curl_llist generatedFilelist = this.getFilelist();
		generatedFilelist.Curl_llist_destroy(((Object)0));
		Byte generatedPath = this.getPath();
		.Curl_cfree(generatedPath);
		this.setPath(((Object)0));
		Byte generatedPattern = this.getPattern();
		.Curl_cfree(generatedPattern);
		this.setPattern(((Object)0));
		this.setCustomptr(((Object)0));
		this.setState(.CURLWC_INIT/* if disabled */);
	}
	public  getState() {
		return state;
	}
	public void setState( newState) {
		state = newState;
	}
	public Byte getPath() {
		return path;
	}
	public void setPath(Byte newPath) {
		path = newPath;
	}
	public Byte getPattern() {
		return pattern;
	}
	public void setPattern(Byte newPattern) {
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

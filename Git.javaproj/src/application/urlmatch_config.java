package application;

public class urlmatch_config {
	private string_list vars;
	private url_info url;
	private Object section;
	private Object key;
	private Object cb;
	private Object collect_fn;
	private Object cascade_fn;
	
	public urlmatch_config(string_list vars, url_info url, Object section, Object key, Object cb, Object collect_fn, Object cascade_fn) {
		setVars(vars);
		setUrl(url);
		setSection(section);
		setKey(key);
		setCb(cb);
		setCollect_fn(collect_fn);
		setCascade_fn(cascade_fn);
	}
	public urlmatch_config() {
	}
	
	public string_list getVars() {
		return vars;
	}
	public void setVars(string_list newVars) {
		vars = newVars;
	}
	public url_info getUrl() {
		return url;
	}
	public void setUrl(url_info newUrl) {
		url = newUrl;
	}
	public Object getSection() {
		return section;
	}
	public void setSection(Object newSection) {
		section = newSection;
	}
	public Object getKey() {
		return key;
	}
	public void setKey(Object newKey) {
		key = newKey;
	}
	public Object getCb() {
		return cb;
	}
	public void setCb(Object newCb) {
		cb = newCb;
	}
	public Object getCollect_fn() {
		return collect_fn;
	}
	public void setCollect_fn(Object newCollect_fn) {
		collect_fn = newCollect_fn;
	}
	public Object getCascade_fn() {
		return cascade_fn;
	}
	public void setCascade_fn(Object newCascade_fn) {
		cascade_fn = newCascade_fn;
	}
}

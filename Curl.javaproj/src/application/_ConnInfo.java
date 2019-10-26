package application;

/* Information associated with a specific easy handle */
public class _ConnInfo {
	private Object easy;
	private Byte url;
	private _GlobalInfo global;
	private Object error;
	
	public _ConnInfo(Object easy, Byte url, _GlobalInfo global, Object error) {
		setEasy(easy);
		setUrl(url);
		setGlobal(global);
		setError(error);
	}
	public _ConnInfo() {
	}
	
	public Object getEasy() {
		return easy;
	}
	public void setEasy(Object newEasy) {
		easy = newEasy;
	}
	public Byte getUrl() {
		return url;
	}
	public void setUrl(Byte newUrl) {
		url = newUrl;
	}
	public _GlobalInfo getGlobal() {
		return global;
	}
	public void setGlobal(_GlobalInfo newGlobal) {
		global = newGlobal;
	}
	public Object getError() {
		return error;
	}
	public void setError(Object newError) {
		error = newError;
	}
}

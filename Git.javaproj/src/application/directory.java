package application;

public class directory {
	private directory up;
	private object_id oid;
	private int baselen;
	private int len;
	private int mode;
	private int stage;
	private Object path;
	
	public directory(directory up, object_id oid, int baselen, int len, int mode, int stage, Object path) {
		setUp(up);
		setOid(oid);
		setBaselen(baselen);
		setLen(len);
		setMode(mode);
		setStage(stage);
		setPath(path);
	}
	public directory() {
	}
	
	public directory getUp() {
		return up;
	}
	public void setUp(directory newUp) {
		up = newUp;
	}
	public object_id getOid() {
		return oid;
	}
	public void setOid(object_id newOid) {
		oid = newOid;
	}
	public int getBaselen() {
		return baselen;
	}
	public void setBaselen(int newBaselen) {
		baselen = newBaselen;
	}
	public int getLen() {
		return len;
	}
	public void setLen(int newLen) {
		len = newLen;
	}
	public int getMode() {
		return mode;
	}
	public void setMode(int newMode) {
		mode = newMode;
	}
	public int getStage() {
		return stage;
	}
	public void setStage(int newStage) {
		stage = newStage;
	}
	public Object getPath() {
		return path;
	}
	public void setPath(Object newPath) {
		path = newPath;
	}
}

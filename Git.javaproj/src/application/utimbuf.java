package application;

/* NOTE: Must be the same as _utimbuf above. */
/* NOTE: Must be the same as _utimbuf above. */
public class utimbuf {
	private Object actime;
	private Object modtime;
	
	public utimbuf(Object actime, Object modtime) {
		setActime(actime);
		setModtime(modtime);
	}
	public utimbuf() {
	}
	
	public Object getActime() {
		return actime;
	}
	public void setActime(Object newActime) {
		actime = newActime;
	}
	public Object getModtime() {
		return modtime;
	}
	public void setModtime(Object newModtime) {
		modtime = newModtime;
	}
}

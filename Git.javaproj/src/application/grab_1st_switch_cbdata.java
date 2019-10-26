package application;

public class grab_1st_switch_cbdata {
	private strbuf buf;
	private object_id noid;
	
	public grab_1st_switch_cbdata(strbuf buf, object_id noid) {
		setBuf(buf);
		setNoid(noid);
	}
	public grab_1st_switch_cbdata() {
	}
	
	public strbuf getBuf() {
		return buf;
	}
	public void setBuf(strbuf newBuf) {
		buf = newBuf;
	}
	public object_id getNoid() {
		return noid;
	}
	public void setNoid(object_id newNoid) {
		noid = newNoid;
	}
}

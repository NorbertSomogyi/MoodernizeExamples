package application;

public class warn_if_dangling_data {
	private _iobuf fp;
	private Object refname;
	private Object refnames;
	private Object msg_fmt;
	
	public warn_if_dangling_data(_iobuf fp, Object refname, Object refnames, Object msg_fmt) {
		setFp(fp);
		setRefname(refname);
		setRefnames(refnames);
		setMsg_fmt(msg_fmt);
	}
	public warn_if_dangling_data() {
	}
	
	public _iobuf getFp() {
		return fp;
	}
	public void setFp(_iobuf newFp) {
		fp = newFp;
	}
	public Object getRefname() {
		return refname;
	}
	public void setRefname(Object newRefname) {
		refname = newRefname;
	}
	public Object getRefnames() {
		return refnames;
	}
	public void setRefnames(Object newRefnames) {
		refnames = newRefnames;
	}
	public Object getMsg_fmt() {
		return msg_fmt;
	}
	public void setMsg_fmt(Object newMsg_fmt) {
		msg_fmt = newMsg_fmt;
	}
}

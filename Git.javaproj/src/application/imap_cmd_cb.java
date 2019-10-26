package application;

public class imap_cmd_cb {
	private Object cont;
	private Object done;
	private Object ctx;
	private Byte data;
	private int dlen;
	private int uid;
	
	public imap_cmd_cb(Object cont, Object done, Object ctx, Byte data, int dlen, int uid) {
		setCont(cont);
		setDone(done);
		setCtx(ctx);
		setData(data);
		setDlen(dlen);
		setUid(uid);
	}
	public imap_cmd_cb() {
	}
	
	public Object getCont() {
		return cont;
	}
	public void setCont(Object newCont) {
		cont = newCont;
	}
	public Object getDone() {
		return done;
	}
	public void setDone(Object newDone) {
		done = newDone;
	}
	public Object getCtx() {
		return ctx;
	}
	public void setCtx(Object newCtx) {
		ctx = newCtx;
	}
	public Byte getData() {
		return data;
	}
	public void setData(Byte newData) {
		data = newData;
	}
	public int getDlen() {
		return dlen;
	}
	public void setDlen(int newDlen) {
		dlen = newDlen;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int newUid) {
		uid = newUid;
	}
}

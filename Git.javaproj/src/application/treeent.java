package application;

/*
 * GIT - the stupid content tracker
 *
 * Copyright (c) Junio C Hamano, 2006, 2009
 */
public class treeent {
	private int mode;
	private object_id oid;
	private int len;
	private Object name;
	
	public treeent(int mode, object_id oid, int len, Object name) {
		setMode(mode);
		setOid(oid);
		setLen(len);
		setName(name);
	}
	public treeent() {
	}
	
	public int getMode() {
		return mode;
	}
	public void setMode(int newMode) {
		mode = newMode;
	}
	public object_id getOid() {
		return oid;
	}
	public void setOid(object_id newOid) {
		oid = newOid;
	}
	public int getLen() {
		return len;
	}
	public void setLen(int newLen) {
		len = newLen;
	}
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
}

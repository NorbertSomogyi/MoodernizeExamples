package application;

/* the host to connect to. valid only if
                                   bits.conn_to_host is set */
public class hostname {
	private Object rawalloc;
	private Object encalloc;
	private Object name;
	private Object dispname;
	
	public hostname(Object rawalloc, Object encalloc, Object name, Object dispname) {
		setRawalloc(rawalloc);
		setEncalloc(encalloc);
		setName(name);
		setDispname(dispname);
	}
	public hostname() {
	}
	
	public Object getRawalloc() {
		return rawalloc;
	}
	public void setRawalloc(Object newRawalloc) {
		rawalloc = newRawalloc;
	}
	public Object getEncalloc() {
		return encalloc;
	}
	public void setEncalloc(Object newEncalloc) {
		encalloc = newEncalloc;
	}
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
	public Object getDispname() {
		return dispname;
	}
	public void setDispname(Object newDispname) {
		dispname = newDispname;
	}
}

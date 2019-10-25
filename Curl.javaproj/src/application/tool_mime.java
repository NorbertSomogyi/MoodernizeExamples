package application;

public class tool_mime {
	private  kind;
	private Object parent;
	private Object prev;
	private Object data;
	private Object name;
	private Object filename;
	private Object type;
	private Object encoder;
	private Object headers;
	private Object subparts;
	private Object origin;
	private Object size;
	private Object curpos;
	private Object config;
	
	public tool_mime( kind, Object parent, Object prev, Object data, Object name, Object filename, Object type, Object encoder, Object headers, Object subparts, Object origin, Object size, Object curpos, Object config) {
		setKind(kind);
		setParent(parent);
		setPrev(prev);
		setData(data);
		setName(name);
		setFilename(filename);
		setType(type);
		setEncoder(encoder);
		setHeaders(headers);
		setSubparts(subparts);
		setOrigin(origin);
		setSize(size);
		setCurpos(curpos);
		setConfig(config);
	}
	public tool_mime() {
	}
	
	public  getKind() {
		return kind;
	}
	public void setKind( newKind) {
		kind = newKind;
	}
	public Object getParent() {
		return parent;
	}
	public void setParent(Object newParent) {
		parent = newParent;
	}
	public Object getPrev() {
		return prev;
	}
	public void setPrev(Object newPrev) {
		prev = newPrev;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object newData) {
		data = newData;
	}
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
	public Object getFilename() {
		return filename;
	}
	public void setFilename(Object newFilename) {
		filename = newFilename;
	}
	public Object getType() {
		return type;
	}
	public void setType(Object newType) {
		type = newType;
	}
	public Object getEncoder() {
		return encoder;
	}
	public void setEncoder(Object newEncoder) {
		encoder = newEncoder;
	}
	public Object getHeaders() {
		return headers;
	}
	public void setHeaders(Object newHeaders) {
		headers = newHeaders;
	}
	public Object getSubparts() {
		return subparts;
	}
	public void setSubparts(Object newSubparts) {
		subparts = newSubparts;
	}
	public Object getOrigin() {
		return origin;
	}
	public void setOrigin(Object newOrigin) {
		origin = newOrigin;
	}
	public Object getSize() {
		return size;
	}
	public void setSize(Object newSize) {
		size = newSize;
	}
	public Object getCurpos() {
		return curpos;
	}
	public void setCurpos(Object newCurpos) {
		curpos = newCurpos;
	}
	public Object getConfig() {
		return config;
	}
	public void setConfig(Object newConfig) {
		config = newConfig;
	}
}
/* Structural fields. */

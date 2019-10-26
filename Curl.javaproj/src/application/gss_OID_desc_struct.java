package application;

public class gss_OID_desc_struct {
	private Object length;
	private Object elements;
	
	public gss_OID_desc_struct(Object length, Object elements) {
		setLength(length);
		setElements(elements);
	}
	public gss_OID_desc_struct() {
	}
	
	public Object getLength() {
		return length;
	}
	public void setLength(Object newLength) {
		length = newLength;
	}
	public Object getElements() {
		return elements;
	}
	public void setElements(Object newElements) {
		elements = newElements;
	}
}

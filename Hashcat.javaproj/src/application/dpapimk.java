package application;

public class dpapimk {
	private Object context;
	private Object[] SID;
	private Object SID_len;
	private Object SID_offset;
	private Object[] iv;
	private Object contents_len;
	private Object[] contents;
	
	public dpapimk(Object context, Object[] SID, Object SID_len, Object SID_offset, Object[] iv, Object contents_len, Object[] contents) {
		setContext(context);
		setSID(SID);
		setSID_len(SID_len);
		setSID_offset(SID_offset);
		setIv(iv);
		setContents_len(contents_len);
		setContents(contents);
	}
	public dpapimk() {
	}
	
	public Object getContext() {
		return context;
	}
	public void setContext(Object newContext) {
		context = newContext;
	}
	public Object[] getSID() {
		return SID;
	}
	public void setSID(Object[] newSID) {
		SID = newSID;
	}
	public Object getSID_len() {
		return SID_len;
	}
	public void setSID_len(Object newSID_len) {
		SID_len = newSID_len;
	}
	public Object getSID_offset() {
		return SID_offset;
	}
	public void setSID_offset(Object newSID_offset) {
		SID_offset = newSID_offset;
	}
	public Object[] getIv() {
		return iv;
	}
	public void setIv(Object[] newIv) {
		iv = newIv;
	}
	public Object getContents_len() {
		return contents_len;
	}
	public void setContents_len(Object newContents_len) {
		contents_len = newContents_len;
	}
	public Object[] getContents() {
		return contents;
	}
	public void setContents(Object[] newContents) {
		contents = newContents;
	}
}

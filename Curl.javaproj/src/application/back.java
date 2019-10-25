package application;

public class back {
	private Object fread_func;
	private Object fread_in;
	private Object postdata;
	private Object postsize;
	
	public back(Object fread_func, Object fread_in, Object postdata, Object postsize) {
		setFread_func(fread_func);
		setFread_in(fread_in);
		setPostdata(postdata);
		setPostsize(postsize);
	}
	public back() {
	}
	
	public Object getFread_func() {
		return fread_func;
	}
	public void setFread_func(Object newFread_func) {
		fread_func = newFread_func;
	}
	public Object getFread_in() {
		return fread_in;
	}
	public void setFread_in(Object newFread_in) {
		fread_in = newFread_in;
	}
	public Object getPostdata() {
		return postdata;
	}
	public void setPostdata(Object newPostdata) {
		postdata = newPostdata;
	}
	public Object getPostsize() {
		return postsize;
	}
	public void setPostsize(Object newPostsize) {
		postsize = newPostsize;
	}
}

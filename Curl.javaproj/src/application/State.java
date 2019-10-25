package application;

/* for create_transfer() */
public class State {
	private Object urlnode;
	private Object inglob;
	private Object urls;
	private Object outfiles;
	private Object httpgetfields;
	private Object uploadfile;
	private long infilenum;
	private long up;
	private long urlnum;
	private long li;
	
	public State(Object urlnode, Object inglob, Object urls, Object outfiles, Object httpgetfields, Object uploadfile, long infilenum, long up, long urlnum, long li) {
		setUrlnode(urlnode);
		setInglob(inglob);
		setUrls(urls);
		setOutfiles(outfiles);
		setHttpgetfields(httpgetfields);
		setUploadfile(uploadfile);
		setInfilenum(infilenum);
		setUp(up);
		setUrlnum(urlnum);
		setLi(li);
	}
	public State() {
	}
	
	public Object getUrlnode() {
		return urlnode;
	}
	public void setUrlnode(Object newUrlnode) {
		urlnode = newUrlnode;
	}
	public Object getInglob() {
		return inglob;
	}
	public void setInglob(Object newInglob) {
		inglob = newInglob;
	}
	public Object getUrls() {
		return urls;
	}
	public void setUrls(Object newUrls) {
		urls = newUrls;
	}
	public Object getOutfiles() {
		return outfiles;
	}
	public void setOutfiles(Object newOutfiles) {
		outfiles = newOutfiles;
	}
	public Object getHttpgetfields() {
		return httpgetfields;
	}
	public void setHttpgetfields(Object newHttpgetfields) {
		httpgetfields = newHttpgetfields;
	}
	public Object getUploadfile() {
		return uploadfile;
	}
	public void setUploadfile(Object newUploadfile) {
		uploadfile = newUploadfile;
	}
	public long getInfilenum() {
		return infilenum;
	}
	public void setInfilenum(long newInfilenum) {
		infilenum = newInfilenum;
	}
	public long getUp() {
		return up;
	}
	public void setUp(long newUp) {
		up = newUp;
	}
	public long getUrlnum() {
		return urlnum;
	}
	public void setUrlnum(long newUrlnum) {
		urlnum = newUrlnum;
	}
	public long getLi() {
		return li;
	}
	public void setLi(long newLi) {
		li = newLi;
	}
}

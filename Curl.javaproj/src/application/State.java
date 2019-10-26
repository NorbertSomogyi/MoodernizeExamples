package application;

/* for create_transfer() */
public class State {
	private getout urlnode;
	private  inglob;
	private  urls;
	private Byte outfiles;
	private Byte httpgetfields;
	private Byte uploadfile;
	private long infilenum;
	private long up;
	private long urlnum;
	private long li;
	
	public State(getout urlnode,  inglob,  urls, Byte outfiles, Byte httpgetfields, Byte uploadfile, long infilenum, long up, long urlnum, long li) {
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
	
	public getout getUrlnode() {
		return urlnode;
	}
	public void setUrlnode(getout newUrlnode) {
		urlnode = newUrlnode;
	}
	public  getInglob() {
		return inglob;
	}
	public void setInglob( newInglob) {
		inglob = newInglob;
	}
	public  getUrls() {
		return urls;
	}
	public void setUrls( newUrls) {
		urls = newUrls;
	}
	public Byte getOutfiles() {
		return outfiles;
	}
	public void setOutfiles(Byte newOutfiles) {
		outfiles = newOutfiles;
	}
	public Byte getHttpgetfields() {
		return httpgetfields;
	}
	public void setHttpgetfields(Byte newHttpgetfields) {
		httpgetfields = newHttpgetfields;
	}
	public Byte getUploadfile() {
		return uploadfile;
	}
	public void setUploadfile(Byte newUploadfile) {
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

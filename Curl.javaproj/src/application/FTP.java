package application;

public class FTP {
	private Object user;
	private Object passwd;
	private Object path;
	private Object pathalloc;
	private  transfer;
	private Object downloadsize;
	
	public FTP(Object user, Object passwd, Object path, Object pathalloc,  transfer, Object downloadsize) {
		setUser(user);
		setPasswd(passwd);
		setPath(path);
		setPathalloc(pathalloc);
		setTransfer(transfer);
		setDownloadsize(downloadsize);
	}
	public FTP() {
	}
	
	public Object getUser() {
		return user;
	}
	public void setUser(Object newUser) {
		user = newUser;
	}
	public Object getPasswd() {
		return passwd;
	}
	public void setPasswd(Object newPasswd) {
		passwd = newPasswd;
	}
	public Object getPath() {
		return path;
	}
	public void setPath(Object newPath) {
		path = newPath;
	}
	public Object getPathalloc() {
		return pathalloc;
	}
	public void setPathalloc(Object newPathalloc) {
		pathalloc = newPathalloc;
	}
	public  getTransfer() {
		return transfer;
	}
	public void setTransfer( newTransfer) {
		transfer = newTransfer;
	}
	public Object getDownloadsize() {
		return downloadsize;
	}
	public void setDownloadsize(Object newDownloadsize) {
		downloadsize = newDownloadsize;
	}
}

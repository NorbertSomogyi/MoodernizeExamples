package application;

public class FTP {
	private Byte user;
	private Byte passwd;
	private Byte path;
	private Byte pathalloc;
	private  transfer;
	private Object downloadsize;
	
	public FTP(Byte user, Byte passwd, Byte path, Byte pathalloc,  transfer, Object downloadsize) {
		setUser(user);
		setPasswd(passwd);
		setPath(path);
		setPathalloc(pathalloc);
		setTransfer(transfer);
		setDownloadsize(downloadsize);
	}
	public FTP() {
	}
	
	public Byte getUser() {
		return user;
	}
	public void setUser(Byte newUser) {
		user = newUser;
	}
	public Byte getPasswd() {
		return passwd;
	}
	public void setPasswd(Byte newPasswd) {
		passwd = newPasswd;
	}
	public Byte getPath() {
		return path;
	}
	public void setPath(Byte newPath) {
		path = newPath;
	}
	public Byte getPathalloc() {
		return pathalloc;
	}
	public void setPathalloc(Byte newPathalloc) {
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

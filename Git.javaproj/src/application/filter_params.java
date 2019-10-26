package application;

public class filter_params {
	private Object src;
	private long size;
	private int fd;
	private Object cmd;
	private Object path;
	
	public filter_params(Object src, long size, int fd, Object cmd, Object path) {
		setSrc(src);
		setSize(size);
		setFd(fd);
		setCmd(cmd);
		setPath(path);
	}
	public filter_params() {
	}
	
	public Object getSrc() {
		return src;
	}
	public void setSrc(Object newSrc) {
		src = newSrc;
	}
	public long getSize() {
		return size;
	}
	public void setSize(long newSize) {
		size = newSize;
	}
	public int getFd() {
		return fd;
	}
	public void setFd(int newFd) {
		fd = newFd;
	}
	public Object getCmd() {
		return cmd;
	}
	public void setCmd(Object newCmd) {
		cmd = newCmd;
	}
	public Object getPath() {
		return path;
	}
	public void setPath(Object newPath) {
		path = newPath;
	}
}

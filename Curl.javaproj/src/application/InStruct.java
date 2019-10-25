package application;

public class InStruct {
	private int fd;
	private Object config;
	
	public InStruct(int fd, Object config) {
		setFd(fd);
		setConfig(config);
	}
	public InStruct() {
	}
	
	public int getFd() {
		return fd;
	}
	public void setFd(int newFd) {
		fd = newFd;
	}
	public Object getConfig() {
		return config;
	}
	public void setConfig(Object newConfig) {
		config = newConfig;
	}
}

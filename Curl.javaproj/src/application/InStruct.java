package application;

public class InStruct {
	private int fd;
	private OperationConfig config;
	
	public InStruct(int fd, OperationConfig config) {
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
	public OperationConfig getConfig() {
		return config;
	}
	public void setConfig(OperationConfig newConfig) {
		config = newConfig;
	}
}

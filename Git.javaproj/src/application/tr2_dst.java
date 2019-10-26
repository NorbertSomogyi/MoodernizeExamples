package application;

public class tr2_dst {
	private tr2_sysenv_variable sysenv_var;
	private int fd;
	private int initialized;
	private int need_close;
	private int too_many_files;
	
	public tr2_dst(tr2_sysenv_variable sysenv_var, int fd, int initialized, int need_close, int too_many_files) {
		setSysenv_var(sysenv_var);
		setFd(fd);
		setInitialized(initialized);
		setNeed_close(need_close);
		setToo_many_files(too_many_files);
	}
	public tr2_dst() {
	}
	
	public tr2_sysenv_variable getSysenv_var() {
		return sysenv_var;
	}
	public void setSysenv_var(tr2_sysenv_variable newSysenv_var) {
		sysenv_var = newSysenv_var;
	}
	public int getFd() {
		return fd;
	}
	public void setFd(int newFd) {
		fd = newFd;
	}
	public int getInitialized() {
		return initialized;
	}
	public void setInitialized(int newInitialized) {
		initialized = newInitialized;
	}
	public int getNeed_close() {
		return need_close;
	}
	public void setNeed_close(int newNeed_close) {
		need_close = newNeed_close;
	}
	public int getToo_many_files() {
		return too_many_files;
	}
	public void setToo_many_files(int newToo_many_files) {
		too_many_files = newToo_many_files;
	}
}

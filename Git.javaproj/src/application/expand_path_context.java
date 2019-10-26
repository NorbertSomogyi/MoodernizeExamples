package application;

public class expand_path_context {
	private Object directory;
	private hostinfo hostinfo;
	
	public expand_path_context(Object directory, hostinfo hostinfo) {
		setDirectory(directory);
		setHostinfo(hostinfo);
	}
	public expand_path_context() {
	}
	
	public Object getDirectory() {
		return directory;
	}
	public void setDirectory(Object newDirectory) {
		directory = newDirectory;
	}
	public hostinfo getHostinfo() {
		return hostinfo;
	}
	public void setHostinfo(hostinfo newHostinfo) {
		hostinfo = newHostinfo;
	}
}

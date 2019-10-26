package application;

public class folder_config {
	private Byte cwd;
	private Byte install_dir;
	private Byte profile_dir;
	private Byte session_dir;
	private Byte shared_dir;
	private Byte cpath_real;
	
	public folder_config(Byte cwd, Byte install_dir, Byte profile_dir, Byte session_dir, Byte shared_dir, Byte cpath_real) {
		setCwd(cwd);
		setInstall_dir(install_dir);
		setProfile_dir(profile_dir);
		setSession_dir(session_dir);
		setShared_dir(shared_dir);
		setCpath_real(cpath_real);
	}
	public folder_config() {
	}
	
	public Byte getCwd() {
		return cwd;
	}
	public void setCwd(Byte newCwd) {
		cwd = newCwd;
	}
	public Byte getInstall_dir() {
		return install_dir;
	}
	public void setInstall_dir(Byte newInstall_dir) {
		install_dir = newInstall_dir;
	}
	public Byte getProfile_dir() {
		return profile_dir;
	}
	public void setProfile_dir(Byte newProfile_dir) {
		profile_dir = newProfile_dir;
	}
	public Byte getSession_dir() {
		return session_dir;
	}
	public void setSession_dir(Byte newSession_dir) {
		session_dir = newSession_dir;
	}
	public Byte getShared_dir() {
		return shared_dir;
	}
	public void setShared_dir(Byte newShared_dir) {
		shared_dir = newShared_dir;
	}
	public Byte getCpath_real() {
		return cpath_real;
	}
	public void setCpath_real(Byte newCpath_real) {
		cpath_real = newCpath_real;
	}
}

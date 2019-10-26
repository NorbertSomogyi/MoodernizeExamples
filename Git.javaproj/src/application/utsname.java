package application;

public class utsname {
	private Object sysname;
	private Object nodename;
	private Object release;
	private Object version;
	private Object machine;
	
	public utsname(Object sysname, Object nodename, Object release, Object version, Object machine) {
		setSysname(sysname);
		setNodename(nodename);
		setRelease(release);
		setVersion(version);
		setMachine(machine);
	}
	public utsname() {
	}
	
	public Object getSysname() {
		return sysname;
	}
	public void setSysname(Object newSysname) {
		sysname = newSysname;
	}
	public Object getNodename() {
		return nodename;
	}
	public void setNodename(Object newNodename) {
		nodename = newNodename;
	}
	public Object getRelease() {
		return release;
	}
	public void setRelease(Object newRelease) {
		release = newRelease;
	}
	public Object getVersion() {
		return version;
	}
	public void setVersion(Object newVersion) {
		version = newVersion;
	}
	public Object getMachine() {
		return machine;
	}
	public void setMachine(Object newMachine) {
		machine = newMachine;
	}
}

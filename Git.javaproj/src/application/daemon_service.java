package application;

public class daemon_service {
	private Object name;
	private Object config_name;
	private Object fn;
	private int enabled;
	private int overridable;
	
	public daemon_service(Object name, Object config_name, Object fn, int enabled, int overridable) {
		setName(name);
		setConfig_name(config_name);
		setFn(fn);
		setEnabled(enabled);
		setOverridable(overridable);
	}
	public daemon_service() {
	}
	
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
	public Object getConfig_name() {
		return config_name;
	}
	public void setConfig_name(Object newConfig_name) {
		config_name = newConfig_name;
	}
	public Object getFn() {
		return fn;
	}
	public void setFn(Object newFn) {
		fn = newFn;
	}
	public int getEnabled() {
		return enabled;
	}
	public void setEnabled(int newEnabled) {
		enabled = newEnabled;
	}
	public int getOverridable() {
		return overridable;
	}
	public void setOverridable(int newOverridable) {
		overridable = newOverridable;
	}
}

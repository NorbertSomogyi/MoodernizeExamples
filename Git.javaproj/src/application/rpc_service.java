package application;

public class rpc_service {
	private Object name;
	private Object config_name;
	private int buffer_input;
	private int enabled;
	
	public rpc_service(Object name, Object config_name, int buffer_input, int enabled) {
		setName(name);
		setConfig_name(config_name);
		setBuffer_input(buffer_input);
		setEnabled(enabled);
	}
	public rpc_service() {
	}
	
	public rpc_service select_service(strbuf hdr, Object name) {
		byte svc_name;
		rpc_service svc = ((Object)0);
		int i;
		if (!ModernizedCProgram.skip_prefix(name, "git-", svc_name)) {
			hdr.forbidden("Unsupported service: '%s'", name);
		} 
		Object generatedName = s.getName();
		for (i = 0; i < ( /  + ( - 1)); i++) {
			rpc_service s = ModernizedCProgram.rpc_service[i];
			if (!.strcmp(generatedName, svc_name)) {
				svc = s;
				break;
			} 
		}
		if (!svc) {
			hdr.forbidden("Unsupported service: '%s'", name);
		} 
		int generatedEnabled = svc.getEnabled();
		if (generatedEnabled < 0) {
			byte user = .getenv("REMOTE_USER");
			svc.setEnabled((user && user) ? 1 : 0);
		} 
		if (!generatedEnabled) {
			hdr.forbidden("Service not enabled: '%s'", generatedName);
		} 
		return svc;
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
	public int getBuffer_input() {
		return buffer_input;
	}
	public void setBuffer_input(int newBuffer_input) {
		buffer_input = newBuffer_input;
	}
	public int getEnabled() {
		return enabled;
	}
	public void setEnabled(int newEnabled) {
		enabled = newEnabled;
	}
}

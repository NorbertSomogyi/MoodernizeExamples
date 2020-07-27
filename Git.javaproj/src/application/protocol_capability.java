package application;

public class protocol_capability {
	private Object name;
	private Object advertise;
	private Object command;
	
	public protocol_capability(Object name, Object advertise, Object command) {
		setName(name);
		setAdvertise(advertise);
		setCommand(command);
	}
	public protocol_capability() {
	}
	
	public protocol_capability get_capability(Object key) {
		int i;
		if (!key) {
			return ((Object)0);
		} 
		Object generatedName = c.getName();
		for (i = 0; i < (/*Error: sizeof expression not supported yet*/ / /*Error: sizeof expression not supported yet*/ + (/*Error: Unsupported expression*/ - 1)); i++) {
			protocol_capability c = ModernizedCProgram.capabilities[i];
			byte out;
			if (ModernizedCProgram.skip_prefix(key, generatedName, out) && (!out || out == (byte)'=')) {
				return c;
			} 
		}
		return ((Object)0);
	}
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
	public Object getAdvertise() {
		return advertise;
	}
	public void setAdvertise(Object newAdvertise) {
		advertise = newAdvertise;
	}
	public Object getCommand() {
		return command;
	}
	public void setCommand(Object newCommand) {
		command = newCommand;
	}
}
/*
	 * The name of the capability.  The server uses this name when
	 * advertising this capability, and the client uses this name to
	 * specify this capability.
	 */

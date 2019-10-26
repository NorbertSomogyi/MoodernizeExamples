package application;

public class submodule_update_strategy {
	private submodule_update_type type;
	private Object command;
	
	public submodule_update_strategy(submodule_update_type type, Object command) {
		setType(type);
		setCommand(command);
	}
	public submodule_update_strategy() {
	}
	
	public int parse_submodule_update_strategy(Object value) {
		submodule_update_type type;
		Object generatedCommand = this.getCommand();
		ModernizedCProgram.free((Object)generatedCommand);
		this.setCommand(((Object)0));
		submodule_update_type.type = ModernizedCProgram.parse_submodule_update_type(value);
		if (submodule_update_type.type == submodule_update_type.SM_UPDATE_UNSPECIFIED) {
			return -1;
		} 
		this.setType(submodule_update_type.type);
		if (submodule_update_type.type == submodule_update_type.SM_UPDATE_COMMAND) {
			this.setCommand(ModernizedCProgram.xstrdup(value + 1));
		} 
		return 0;
	}
	public submodule_update_type getType() {
		return type;
	}
	public void setType(submodule_update_type newType) {
		type = newType;
	}
	public Object getCommand() {
		return command;
	}
	public void setCommand(Object newCommand) {
		command = newCommand;
	}
}

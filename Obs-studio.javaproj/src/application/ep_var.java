package application;

/* struct ep_var */
public class ep_var {
	private Byte type;
	private Byte name;
	private Byte mapping;
	private ep_var_type var_type;
	
	public ep_var(Byte type, Byte name, Byte mapping, ep_var_type var_type) {
		setType(type);
		setName(name);
		setMapping(mapping);
		setVar_type(var_type);
	}
	public ep_var() {
	}
	
	public void ep_var_init() {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(epv, 0, /*Error: Unsupported expression*/);
	}
	public void ep_var_free() {
		Byte generatedType = this.getType();
		ModernizedCProgram.bfree(generatedType);
		Byte generatedName = this.getName();
		ModernizedCProgram.bfree(generatedName);
		Byte generatedMapping = this.getMapping();
		ModernizedCProgram.bfree(generatedMapping);
	}
	public Byte getType() {
		return type;
	}
	public void setType(Byte newType) {
		type = newType;
	}
	public Byte getName() {
		return name;
	}
	public void setName(Byte newName) {
		name = newName;
	}
	public Byte getMapping() {
		return mapping;
	}
	public void setMapping(Byte newMapping) {
		mapping = newMapping;
	}
	public ep_var_type getVar_type() {
		return var_type;
	}
	public void setVar_type(ep_var_type newVar_type) {
		var_type = newVar_type;
	}
}

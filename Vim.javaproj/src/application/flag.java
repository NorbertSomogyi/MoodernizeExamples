package application;

public class flag {
	private Byte name;
	private int argtype;
	private int flags;
	
	public flag(Byte name, int argtype, int flags) {
		setName(name);
		setArgtype(argtype);
		setFlags(flags);
	}
	public flag() {
	}
	
	public Byte getName() {
		return name;
	}
	public void setName(Byte newName) {
		name = newName;
	}
	public int getArgtype() {
		return argtype;
	}
	public void setArgtype(int newArgtype) {
		argtype = newArgtype;
	}
	public int getFlags() {
		return flags;
	}
	public void setFlags(int newFlags) {
		flags = newFlags;
	}
}

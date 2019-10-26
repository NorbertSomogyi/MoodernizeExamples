package application;

public class name_list {
	private int flag;
	private Byte name;
	
	public name_list(int flag, Byte name) {
		setFlag(flag);
		setName(name);
	}
	public name_list() {
	}
	
	public void syn_list_flags(int flags, int attr) {
		int i;
		for (i = 0; nlist[i].getFlag() != 0; ++i) {
			if (flags & nlist[i].getFlag()) {
				ModernizedCProgram.msg_puts_attr(nlist[i].getName(), attr);
				ModernizedCProgram.msg_putchar((byte)' '/*
				 * List one syntax cluster, for ":syntax" or "syntax list syntax_name".
				 */);
			} 
		}
	}
	/*
	 * List one syntax item, for ":syntax" or "syntax list syntax_name".
	 */
	public int getFlag() {
		return flag;
	}
	public void setFlag(int newFlag) {
		flag = newFlag;
	}
	public Byte getName() {
		return name;
	}
	public void setName(Byte newName) {
		name = newName;
	}
}

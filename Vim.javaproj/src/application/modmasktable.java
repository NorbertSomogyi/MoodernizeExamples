package application;

/*
 * Some useful tables.
 */
public class modmasktable {
	private int mod_mask;
	private int mod_flag;
	private Object name;
	
	public modmasktable(int mod_mask, int mod_flag, Object name) {
		setMod_mask(mod_mask);
		setMod_flag(mod_flag);
		setName(name);
	}
	public modmasktable() {
	}
	
	public int getMod_mask() {
		return mod_mask;
	}
	public void setMod_mask(int newMod_mask) {
		mod_mask = newMod_mask;
	}
	public int getMod_flag() {
		return mod_flag;
	}
	public void setMod_flag(int newMod_flag) {
		mod_flag = newMod_flag;
	}
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
}

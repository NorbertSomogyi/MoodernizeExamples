package application;

public class used_atom {
	private Object name;
	private  type;
	private  source;
	private  u;
	
	public used_atom(Object name,  type,  source,  u) {
		setName(name);
		setType(type);
		setSource(source);
		setU(u);
	}
	public used_atom() {
	}
	
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
	public  getType() {
		return type;
	}
	public void setType( newType) {
		type = newType;
	}
	public  getSource() {
		return source;
	}
	public void setSource( newSource) {
		source = newSource;
	}
	public  getU() {
		return u;
	}
	public void setU( newU) {
		u = newU;
	}
}
/*
 * Used to parse format string and sort specifiers
 */

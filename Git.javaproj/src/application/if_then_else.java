package application;

public class if_then_else {
	private  cmp_status;
	private Object str;
	private int then_atom_seen;
	private int else_atom_seen;
	private int condition_satisfied;
	
	public if_then_else( cmp_status, Object str, int then_atom_seen, int else_atom_seen, int condition_satisfied) {
		setCmp_status(cmp_status);
		setStr(str);
		setThen_atom_seen(then_atom_seen);
		setElse_atom_seen(else_atom_seen);
		setCondition_satisfied(condition_satisfied);
	}
	public if_then_else() {
	}
	
	public  getCmp_status() {
		return cmp_status;
	}
	public void setCmp_status( newCmp_status) {
		cmp_status = newCmp_status;
	}
	public Object getStr() {
		return str;
	}
	public void setStr(Object newStr) {
		str = newStr;
	}
	public int getThen_atom_seen() {
		return then_atom_seen;
	}
	public void setThen_atom_seen(int newThen_atom_seen) {
		then_atom_seen = newThen_atom_seen;
	}
	public int getElse_atom_seen() {
		return else_atom_seen;
	}
	public void setElse_atom_seen(int newElse_atom_seen) {
		else_atom_seen = newElse_atom_seen;
	}
	public int getCondition_satisfied() {
		return condition_satisfied;
	}
	public void setCondition_satisfied(int newCondition_satisfied) {
		condition_satisfied = newCondition_satisfied;
	}
}

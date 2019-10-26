package application;

public class credential_operation {
	private Byte name;
	private Object op;
	
	public credential_operation(Byte name, Object op) {
		setName(name);
		setOp(op);
	}
	public credential_operation() {
	}
	
	public Byte getName() {
		return name;
	}
	public void setName(Byte newName) {
		name = newName;
	}
	public Object getOp() {
		return op;
	}
	public void setOp(Object newOp) {
		op = newOp;
	}
}

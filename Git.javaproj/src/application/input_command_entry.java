package application;

public class input_command_entry {
	private Object name;
	private Object fn;
	private byte batchable;
	
	public input_command_entry(Object name, Object fn, byte batchable) {
		setName(name);
		setFn(fn);
		setBatchable(batchable);
	}
	public input_command_entry() {
	}
	
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
	public Object getFn() {
		return fn;
	}
	public void setFn(Object newFn) {
		fn = newFn;
	}
	public byte getBatchable() {
		return batchable;
	}
	public void setBatchable(byte newBatchable) {
		batchable = newBatchable;
	}
}

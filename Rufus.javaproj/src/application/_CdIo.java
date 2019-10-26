package application;

/*! Implementation of CdIo type */
public class _CdIo {
	private Object driver_id;
	private  op;
	private Object env;
	
	public _CdIo(Object driver_id,  op, Object env) {
		setDriver_id(driver_id);
		setOp(op);
		setEnv(env);
	}
	public _CdIo() {
	}
	
	public Object getDriver_id() {
		return driver_id;
	}
	public void setDriver_id(Object newDriver_id) {
		driver_id = newDriver_id;
	}
	public  getOp() {
		return op;
	}
	public void setOp( newOp) {
		op = newOp;
	}
	public Object getEnv() {
		return env;
	}
	public void setEnv(Object newEnv) {
		env = newEnv;
	}
}

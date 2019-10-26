package application;

public class cdio_dvd_copyright {
	private Object type;
	private Object layer_num;
	private Object cpst;
	private Object rmi;
	
	public cdio_dvd_copyright(Object type, Object layer_num, Object cpst, Object rmi) {
		setType(type);
		setLayer_num(layer_num);
		setCpst(cpst);
		setRmi(rmi);
	}
	public cdio_dvd_copyright() {
	}
	
	public Object getType() {
		return type;
	}
	public void setType(Object newType) {
		type = newType;
	}
	public Object getLayer_num() {
		return layer_num;
	}
	public void setLayer_num(Object newLayer_num) {
		layer_num = newLayer_num;
	}
	public Object getCpst() {
		return cpst;
	}
	public void setCpst(Object newCpst) {
		cpst = newCpst;
	}
	public Object getRmi() {
		return rmi;
	}
	public void setRmi(Object newRmi) {
		rmi = newRmi;
	}
}

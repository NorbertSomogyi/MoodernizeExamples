package application;

public class cdio_dvd_disckey {
	private Object type;
	private int agid;
	private Object value;
	
	public cdio_dvd_disckey(Object type, int agid, Object value) {
		setType(type);
		setAgid(agid);
		setValue(value);
	}
	public cdio_dvd_disckey() {
	}
	
	public Object getType() {
		return type;
	}
	public void setType(Object newType) {
		type = newType;
	}
	public int getAgid() {
		return agid;
	}
	public void setAgid(int newAgid) {
		agid = newAgid;
	}
	public Object getValue() {
		return value;
	}
	public void setValue(Object newValue) {
		value = newValue;
	}
}

package application;

public class cdio_dvd_physical {
	private Object type;
	private Object layer_num;
	private Object[] layer;
	
	public cdio_dvd_physical(Object type, Object layer_num, Object[] layer) {
		setType(type);
		setLayer_num(layer_num);
		setLayer(layer);
	}
	public cdio_dvd_physical() {
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
	public Object[] getLayer() {
		return layer;
	}
	public void setLayer(Object[] newLayer) {
		layer = newLayer;
	}
}

package application;

public class prunedead {
	private Object data;
	private Object extracted;
	
	public prunedead(Object data, Object extracted) {
		setData(data);
		setExtracted(extracted);
	}
	public prunedead() {
	}
	
	public Object getData() {
		return data;
	}
	public void setData(Object newData) {
		data = newData;
	}
	public Object getExtracted() {
		return extracted;
	}
	public void setExtracted(Object newExtracted) {
		extracted = newExtracted;
	}
}

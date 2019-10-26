package application;

public class mark_set {
	private  data;
	private int shift;
	
	public mark_set( data, int shift) {
		setData(data);
		setShift(shift);
	}
	public mark_set() {
	}
	
	public  getData() {
		return data;
	}
	public void setData( newData) {
		data = newData;
	}
	public int getShift() {
		return shift;
	}
	public void setShift(int newShift) {
		shift = newShift;
	}
}

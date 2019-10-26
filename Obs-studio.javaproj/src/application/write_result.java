package application;

public class write_result {
	private Byte data;
	private int pos;
	
	public write_result(Byte data, int pos) {
		setData(data);
		setPos(pos);
	}
	public write_result() {
	}
	
	public Byte getData() {
		return data;
	}
	public void setData(Byte newData) {
		data = newData;
	}
	public int getPos() {
		return pos;
	}
	public void setPos(int newPos) {
		pos = newPos;
	}
}

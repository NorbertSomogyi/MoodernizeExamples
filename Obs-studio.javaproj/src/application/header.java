package application;

public class header {
	private Object data;
	private int size;
	
	public header(Object data, int size) {
		setData(data);
		setSize(size);
	}
	public header() {
	}
	
	public void header_free() {
		Object generatedData = this.getData();
		.free(generatedData);
	}
	public void set_header(Object data, Object size) {
		this.setSize((int)size);
		this.setData(.malloc(size));
		Object generatedData = this.getData();
		.memcpy(generatedData, data, size);
	}
	public Object getData() {
		return data;
	}
	public void setData(Object newData) {
		data = newData;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int newSize) {
		size = newSize;
	}
}

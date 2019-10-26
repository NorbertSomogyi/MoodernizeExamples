package application;

public class info {
	private Object zs;
	private Object ctx;
	private int first;
	private int zlib;
	private int size;
	
	public info(Object zs, Object ctx, int first, int zlib, int size) {
		setZs(zs);
		setCtx(ctx);
		setFirst(first);
		setZlib(zlib);
		setSize(size);
	}
	public info() {
	}
	
	public Object getZs() {
		return zs;
	}
	public void setZs(Object newZs) {
		zs = newZs;
	}
	public Object getCtx() {
		return ctx;
	}
	public void setCtx(Object newCtx) {
		ctx = newCtx;
	}
	public int getFirst() {
		return first;
	}
	public void setFirst(int newFirst) {
		first = newFirst;
	}
	public int getZlib() {
		return zlib;
	}
	public void setZlib(int newZlib) {
		zlib = newZlib;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int newSize) {
		size = newSize;
	}
}

package application;

public class config_include_data {
	private int depth;
	private Object fn;
	private Object data;
	private Object opts;
	
	public config_include_data(int depth, Object fn, Object data, Object opts) {
		setDepth(depth);
		setFn(fn);
		setData(data);
		setOpts(opts);
	}
	public config_include_data() {
	}
	
	public int getDepth() {
		return depth;
	}
	public void setDepth(int newDepth) {
		depth = newDepth;
	}
	public Object getFn() {
		return fn;
	}
	public void setFn(Object newFn) {
		fn = newFn;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object newData) {
		data = newData;
	}
	public Object getOpts() {
		return opts;
	}
	public void setOpts(Object newOpts) {
		opts = newOpts;
	}
}

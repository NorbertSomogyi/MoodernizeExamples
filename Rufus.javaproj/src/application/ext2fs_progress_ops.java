package application;

public class ext2fs_progress_ops {
	private Object init;
	private Object update;
	private Object close;
	
	public ext2fs_progress_ops(Object init, Object update, Object close) {
		setInit(init);
		setUpdate(update);
		setClose(close);
	}
	public ext2fs_progress_ops() {
	}
	
	public Object getInit() {
		return init;
	}
	public void setInit(Object newInit) {
		init = newInit;
	}
	public Object getUpdate() {
		return update;
	}
	public void setUpdate(Object newUpdate) {
		update = newUpdate;
	}
	public Object getClose() {
		return close;
	}
	public void setClose(Object newClose) {
		close = newClose;
	}
}

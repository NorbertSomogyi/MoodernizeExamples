package application;

public class obs_tex_frame {
	private Object tex;
	private Object tex_uv;
	private Object handle;
	private Object timestamp;
	private Object lock_key;
	private int count;
	private Object released;
	
	public obs_tex_frame(Object tex, Object tex_uv, Object handle, Object timestamp, Object lock_key, int count, Object released) {
		setTex(tex);
		setTex_uv(tex_uv);
		setHandle(handle);
		setTimestamp(timestamp);
		setLock_key(lock_key);
		setCount(count);
		setReleased(released);
	}
	public obs_tex_frame() {
	}
	
	public Object getTex() {
		return tex;
	}
	public void setTex(Object newTex) {
		tex = newTex;
	}
	public Object getTex_uv() {
		return tex_uv;
	}
	public void setTex_uv(Object newTex_uv) {
		tex_uv = newTex_uv;
	}
	public Object getHandle() {
		return handle;
	}
	public void setHandle(Object newHandle) {
		handle = newHandle;
	}
	public Object getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Object newTimestamp) {
		timestamp = newTimestamp;
	}
	public Object getLock_key() {
		return lock_key;
	}
	public void setLock_key(Object newLock_key) {
		lock_key = newLock_key;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int newCount) {
		count = newCount;
	}
	public Object getReleased() {
		return released;
	}
	public void setReleased(Object newReleased) {
		released = newReleased;
	}
}

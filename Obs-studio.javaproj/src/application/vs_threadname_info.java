package application;

public class vs_threadname_info {
	private Object type;
	private Object name;
	private Object thread_id;
	private Object flags;
	
	public vs_threadname_info(Object type, Object name, Object thread_id, Object flags) {
		setType(type);
		setName(name);
		setThread_id(thread_id);
		setFlags(flags);
	}
	public vs_threadname_info() {
	}
	
	public Object getType() {
		return type;
	}
	public void setType(Object newType) {
		type = newType;
	}
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
	public Object getThread_id() {
		return thread_id;
	}
	public void setThread_id(Object newThread_id) {
		thread_id = newThread_id;
	}
	public Object getFlags() {
		return flags;
	}
	public void setFlags(Object newFlags) {
		flags = newFlags;
	}
}

package application;

public class calldata {
	private Object stack;
	private Object size;
	private Object capacity;
	private Object fixed;
	
	public calldata(Object stack, Object size, Object capacity, Object fixed) {
		setStack(stack);
		setSize(size);
		setCapacity(capacity);
		setFixed(fixed);
	}
	public calldata() {
	}
	
	public void cd_set_first_param(Object name, Object in, Object size) {
		 pos = new ();
		size_t capacity = new size_t();
		size_t name_len = /*Error: Function owner not recognized*/strlen(name) + 1;
		capacity = /*Error: Unsupported expression*/ * 3 + name_len + size;
		ModernizedCProgram.data.setSize(capacity);
		if (capacity < 128) {
			capacity = 128;
		} 
		ModernizedCProgram.data.setCapacity(capacity);
		ModernizedCProgram.data.setStack(ModernizedCProgram.bmalloc(capacity));
		pos = ModernizedCProgram.data.getStack();
		ModernizedCProgram.cd_copy_string(pos, name, name_len);
		ModernizedCProgram.cd_copy_data(pos, in, size);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(pos, 0, /*Error: Unsupported expression*/);
	}
	public Object cd_ensure_capacity(Object pos, Object new_size) {
		size_t offset = new size_t();
		size_t new_capacity = new size_t();
		if (new_size < ModernizedCProgram.data.getCapacity()) {
			return true;
		} 
		if (ModernizedCProgram.data.getFixed()) {
			ModernizedCProgram.blog(LOG_ERROR, "Tried to go above fixed calldata stack size!");
			return false;
		} 
		offset = pos - ModernizedCProgram.data.getStack();
		new_capacity = ModernizedCProgram.data.getCapacity() * 2;
		if (new_capacity < new_size) {
			new_capacity = new_size;
		} 
		ModernizedCProgram.data.setStack(ModernizedCProgram.brealloc(ModernizedCProgram.data.getStack(), new_capacity));
		ModernizedCProgram.data.setCapacity(new_capacity);
		pos = ModernizedCProgram.data.getStack() + offset;
		return true;
	}
	public void calldata_set_data(Object name, Object in, Object size) {
		 pos = ((Object)0);
		if (!ModernizedCProgram.data || !name || !name) {
			return /*Error: Unsupported expression*/;
		} 
		if (!ModernizedCProgram.data.getFixed() && !ModernizedCProgram.data.getStack()) {
			ModernizedCProgram.data.cd_set_first_param(name, in, size);
			return /*Error: Unsupported expression*/;
		} 
		if (ModernizedCProgram.cd_getparam(ModernizedCProgram.data, name, pos)) {
			size_t cur_size = new size_t();
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(cur_size, pos, /*Error: Unsupported expression*/);
			if (cur_size < size) {
				size_t offset = size - cur_size;
				size_t bytes = ModernizedCProgram.data.getSize();
				if (!ModernizedCProgram.data.cd_ensure_capacity(pos, bytes + offset)) {
					return /*Error: Unsupported expression*/;
				} 
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memmove(pos + offset, pos, bytes - (pos - ModernizedCProgram.data.getStack()));
				ModernizedCProgram.data.getSize() += offset;
			}  else if (cur_size > size) {
				size_t offset = cur_size - size;
				size_t bytes = ModernizedCProgram.data.getSize() - offset;
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memmove(pos, pos + offset, bytes - (pos - ModernizedCProgram.data.getStack()));
				ModernizedCProgram.data.getSize() -= offset;
			} 
			ModernizedCProgram.cd_copy_data(pos, in, size);
		} else {
				size_t name_len = /*Error: Function owner not recognized*/strlen(name) + 1;
				size_t offset = name_len + size + /*Error: Unsupported expression*/ * 2;
				if (!ModernizedCProgram.data.cd_ensure_capacity(pos, ModernizedCProgram.data.getSize() + offset)) {
					return /*Error: Unsupported expression*/;
				} 
				ModernizedCProgram.data.getSize() += offset;
				ModernizedCProgram.cd_copy_string(pos, name, 0);
				ModernizedCProgram.cd_copy_data(pos, in, size);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(pos, 0, /*Error: Unsupported expression*/);
		} 
	}
	public void calldata_init() {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(ModernizedCProgram.data, 0, /*Error: Unsupported expression*/);
	}
	public void calldata_init_fixed(Object stack, Object size) {
		ModernizedCProgram.data.setStack(stack);
		ModernizedCProgram.data.setCapacity(size);
		ModernizedCProgram.data.setFixed(true);
		ModernizedCProgram.data.setSize(0);
		ModernizedCProgram.data.calldata_clear();
	}
	public void calldata_free() {
		if (!ModernizedCProgram.data.getFixed()) {
			ModernizedCProgram.bfree(ModernizedCProgram.data.getStack());
		} 
	}
	public void calldata_clear() {
		if (ModernizedCProgram.data.getStack()) {
			ModernizedCProgram.data.setSize(/*Error: Unsupported expression*/);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(ModernizedCProgram.data.getStack(), 0, /*Error: Unsupported expression*/);
		} 
	}
	public calldata calldata_create() {
		return (calldata_t)ModernizedCProgram.bzalloc(/*Error: Unsupported expression*/);
	}
	public void calldata_destroy() {
		cd.calldata_free();
		ModernizedCProgram.bfree(cd/* ------------------------------------------------------------------------- */);
	}
	/* ------------------------------------------------------------------------- */
	public void calldata_set_int(Object name, int val) {
		ModernizedCProgram.data.calldata_set_data(name, val, /*Error: sizeof expression not supported yet*/);
	}
	public void calldata_set_float(Object name, double val) {
		ModernizedCProgram.data.calldata_set_data(name, val, /*Error: sizeof expression not supported yet*/);
	}
	public void calldata_set_bool(Object name, Object val) {
		ModernizedCProgram.data.calldata_set_data(name, val, /*Error: sizeof expression not supported yet*/);
	}
	public void calldata_set_ptr(Object name, Object ptr) {
		ModernizedCProgram.data.calldata_set_data(name, ptr, /*Error: sizeof expression not supported yet*/);
	}
	public void calldata_set_string(Object name, Object str) {
		if (str) {
			ModernizedCProgram.data.calldata_set_data(name, str, /*Error: Function owner not recognized*/strlen(str) + 1);
		} else {
				ModernizedCProgram.data.calldata_set_data(name, ((Object)0), 0);
		} 
	}
	public Object getStack() {
		return stack;
	}
	public void setStack(Object newStack) {
		stack = newStack;
	}
	public Object getSize() {
		return size;
	}
	public void setSize(Object newSize) {
		size = newSize;
	}
	public Object getCapacity() {
		return capacity;
	}
	public void setCapacity(Object newCapacity) {
		capacity = newCapacity;
	}
	public Object getFixed() {
		return fixed;
	}
	public void setFixed(Object newFixed) {
		fixed = newFixed;
	}
}

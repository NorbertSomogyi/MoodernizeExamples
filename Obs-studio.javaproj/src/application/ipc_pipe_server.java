package application;

/*
 * Copyright (c) 2014 Hugh Bailey <obs.jim@gmail.com>
 *
 * Permission to use, copy, modify, and distribute this software for any
 * purpose with or without fee is hereby granted, provided that the above
 * copyright notice and this permission notice appear in all copies.
 *
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES
 * WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR
 * ANY SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
 * WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN
 * ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF
 * OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 */
public class ipc_pipe_server {
	private _OVERLAPPED overlap;
	private Object handle;
	private Object ready_event;
	private Object thread;
	private Object read_data;
	private Object size;
	private Object capacity;
	private Object read_callback;
	private Object param;
	
	public ipc_pipe_server(_OVERLAPPED overlap, Object handle, Object ready_event, Object thread, Object read_data, Object size, Object capacity, Object read_callback, Object param) {
		setOverlap(overlap);
		setHandle(handle);
		setReady_event(ready_event);
		setThread(thread);
		setRead_data(read_data);
		setSize(size);
		setCapacity(capacity);
		setRead_callback(read_callback);
		setParam(param);
	}
	public ipc_pipe_server() {
	}
	
	/*
	 * Copyright (c) 2014 Hugh Bailey <obs.jim@gmail.com>
	 *
	 * Permission to use, copy, modify, and distribute this software for any
	 * purpose with or without fee is hereby granted, provided that the above
	 * copyright notice and this permission notice appear in all copies.
	 *
	 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES
	 * WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
	 * MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR
	 * ANY SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
	 * WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN
	 * ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF
	 * OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
	 */
	public boolean ipc_pipe_internal_create_events() {
		ModernizedCProgram.pipe.setReady_event(/*Error: Function owner not recognized*/CreateEventA(((Object)0), 0, 0, ((Object)0)));
		return !!ModernizedCProgram.pipe.getReady_event();
	}
	public boolean ipc_pipe_internal_create_pipe(Object name) {
		SECURITY_ATTRIBUTES sa = new SECURITY_ATTRIBUTES();
		byte[] new_name = new byte[512];
		Object sd;
		DWORD access = 3 | 1073741824;
		DWORD flags = 4 | 2 | 0;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy_s(new_name, /*Error: sizeof expression not supported yet*/, "\\\\.\\pipe\\");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcat_s(new_name, /*Error: sizeof expression not supported yet*/, name);
		sd = ModernizedCProgram.create_full_access_security_descriptor();
		if (!sd) {
			return 0;
		} 
		sa.setNLength(/*Error: sizeof expression not supported yet*/);
		sa.setLpSecurityDescriptor(sd);
		sa.setBInheritHandle(0);
		ModernizedCProgram.pipe.setHandle(/*Error: Function owner not recognized*/CreateNamedPipeA(new_name, access, flags, 1, 1024, 1024, 0, sa));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(sd);
		return ModernizedCProgram.pipe.getHandle() != (HANDLE)(true);
	}
	public void ipc_pipe_internal_ensure_capacity(Object new_size) {
		if (ModernizedCProgram.pipe.getCapacity() >= new_size) {
			return /*Error: Unsupported expression*/;
		} 
		ModernizedCProgram.pipe.setRead_data(/*Error: Function owner not recognized*/realloc(ModernizedCProgram.pipe.getRead_data(), new_size));
		ModernizedCProgram.pipe.setCapacity(new_size);
	}
	public void ipc_pipe_internal_append_bytes(Object bytes, Object size) {
		size_t new_size = ModernizedCProgram.pipe.getSize() + size;
		ModernizedCProgram.pipe.ipc_pipe_internal_ensure_capacity(new_size);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(ModernizedCProgram.pipe.getRead_data() + ModernizedCProgram.pipe.getSize(), bytes, size);
		ModernizedCProgram.pipe.setSize(new_size);
	}
	public boolean ipc_pipe_internal_start_server_thread() {
		ModernizedCProgram.pipe.setThread(/*Error: Function owner not recognized*/CreateThread(((Object)0), 0, ipc_pipe_internal_server_thread, ModernizedCProgram.pipe, 0, ((Object)0)));
		return ModernizedCProgram.pipe.getThread() != ((Object)0);
	}
	public boolean ipc_pipe_internal_wait_for_connection() {
		boolean success;
		ModernizedCProgram.pipe.getOverlap().setHEvent(ModernizedCProgram.pipe.getReady_event());
		success = !!/*Error: Function owner not recognized*/ConnectNamedPipe(ModernizedCProgram.pipe.getHandle(), ModernizedCProgram.pipe.getOverlap());
		return success || (!success && ModernizedCProgram.ipc_pipe_internal_io_pending());
	}
	/* ------------------------------------------------------------------------- */
	public boolean ipc_pipe_server_start(Object name, Object read_callback, Object param) {
		ModernizedCProgram.pipe.setRead_callback(read_callback);
		ModernizedCProgram.pipe.setParam(param);
		if (!ModernizedCProgram.pipe.ipc_pipe_internal_create_events()) {
			;
		} 
		if (!ModernizedCProgram.pipe.ipc_pipe_internal_create_pipe(name)) {
			;
		} 
		if (!ModernizedCProgram.pipe.ipc_pipe_internal_wait_for_connection()) {
			;
		} 
		if (!ModernizedCProgram.pipe.ipc_pipe_internal_start_server_thread()) {
			;
		} 
		return 1;
		return 0;
	}
	public void ipc_pipe_server_free() {
		if (!ModernizedCProgram.pipe) {
			return /*Error: Unsupported expression*/;
		} 
		if (ModernizedCProgram.pipe.getThread()) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CancelIoEx(ModernizedCProgram.pipe.getHandle(), ModernizedCProgram.pipe.getOverlap());
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/SetEvent(ModernizedCProgram.pipe.getReady_event());
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/WaitForSingleObject(ModernizedCProgram.pipe.getThread(), -1024);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CloseHandle(ModernizedCProgram.pipe.getThread());
		} 
		if (ModernizedCProgram.pipe.getReady_event()) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CloseHandle(ModernizedCProgram.pipe.getReady_event());
		} 
		if (ModernizedCProgram.pipe.getHandle()) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CloseHandle(ModernizedCProgram.pipe.getHandle());
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(ModernizedCProgram.pipe.getRead_data());
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(ModernizedCProgram.pipe, 0, /*Error: sizeof expression not supported yet*/);
	}
	public _OVERLAPPED getOverlap() {
		return overlap;
	}
	public void setOverlap(_OVERLAPPED newOverlap) {
		overlap = newOverlap;
	}
	public Object getHandle() {
		return handle;
	}
	public void setHandle(Object newHandle) {
		handle = newHandle;
	}
	public Object getReady_event() {
		return ready_event;
	}
	public void setReady_event(Object newReady_event) {
		ready_event = newReady_event;
	}
	public Object getThread() {
		return thread;
	}
	public void setThread(Object newThread) {
		thread = newThread;
	}
	public Object getRead_data() {
		return read_data;
	}
	public void setRead_data(Object newRead_data) {
		read_data = newRead_data;
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
	public Object getRead_callback() {
		return read_callback;
	}
	public void setRead_callback(Object newRead_callback) {
		read_callback = newRead_callback;
	}
	public Object getParam() {
		return param;
	}
	public void setParam(Object newParam) {
		param = newParam;
	}
}

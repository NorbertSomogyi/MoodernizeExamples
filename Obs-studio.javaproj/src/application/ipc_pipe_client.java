package application;

public class ipc_pipe_client {
	private Object handle;
	
	public ipc_pipe_client(Object handle) {
		setHandle(handle);
	}
	public ipc_pipe_client() {
	}
	
	public boolean ipc_pipe_internal_open_pipe(Object name) {
		DWORD mode = 2;
		byte[] new_name = new byte[512];
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcpy_s(new_name, /*Error: sizeof expression not supported yet*/, "\\\\.\\pipe\\");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strcat_s(new_name, /*Error: sizeof expression not supported yet*/, name);
		ModernizedCProgram.pipe.setHandle(/*Error: Function owner not recognized*/CreateFileA(new_name, -1024 | -1024, 0, ((Object)0), 3, 0, ((Object)0)));
		if (ModernizedCProgram.pipe.getHandle() == (HANDLE)(true)) {
			return 0;
		} 
		return !!/*Error: Function owner not recognized*/SetNamedPipeHandleState(ModernizedCProgram.pipe.getHandle(), mode, ((Object)0), ((Object)0));
	}
	public boolean ipc_pipe_client_open(Object name) {
		if (!ModernizedCProgram.pipe.ipc_pipe_internal_open_pipe(name)) {
			ModernizedCProgram.pipe.ipc_pipe_client_free();
			return 0;
		} 
		return 1;
	}
	public void ipc_pipe_client_free() {
		if (!ModernizedCProgram.pipe) {
			return /*Error: Unsupported expression*/;
		} 
		if (ModernizedCProgram.pipe.getHandle()) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CloseHandle(ModernizedCProgram.pipe.getHandle());
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(ModernizedCProgram.pipe, 0, /*Error: sizeof expression not supported yet*/);
	}
	public boolean ipc_pipe_client_write(Object data, Object size) {
		DWORD bytes = new DWORD();
		if (!ModernizedCProgram.pipe) {
			return 0;
		} 
		if (!ModernizedCProgram.pipe.getHandle() || ModernizedCProgram.pipe.getHandle() == (HANDLE)(true)) {
			return 0;
		} 
		return !!/*Error: Function owner not recognized*/WriteFile(ModernizedCProgram.pipe.getHandle(), data, (DWORD)size, bytes, ((Object)0));
	}
	public Object getHandle() {
		return handle;
	}
	public void setHandle(Object newHandle) {
		handle = newHandle;
	}
}

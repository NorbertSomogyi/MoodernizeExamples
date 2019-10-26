package application;

public class shtex_data {
	private Object tex_handle;
	
	public shtex_data(Object tex_handle) {
		setTex_handle(tex_handle);
	}
	public shtex_data() {
	}
	
	public boolean capture_init_shtex(Object window, Object base_cx, Object base_cy, Object cx, Object cy, Object format, boolean flip, Object handle) {
		if (!ModernizedCProgram.init_shared_info()) {
			ModernizedCProgram.hlog("capture_init_shtex: Failed to initialize memory");
			return 0;
		} 
		ModernizedCProgram.data = ModernizedCProgram.shmem_info;
		(ModernizedCProgram.data).setTex_handle((uint32_t)handle);
		ModernizedCProgram.global_hook_info.setWindow((uint32_t)(uintptr_t)window);
		ModernizedCProgram.global_hook_info.setType(capture_type.CAPTURE_TYPE_TEXTURE);
		ModernizedCProgram.global_hook_info.setFormat(format);
		ModernizedCProgram.global_hook_info.setFlip(flip);
		ModernizedCProgram.global_hook_info.setMap_id(ModernizedCProgram.shmem_id_counter);
		ModernizedCProgram.global_hook_info.setMap_size();
		ModernizedCProgram.global_hook_info.setCx(cx);
		ModernizedCProgram.global_hook_info.setCy(cy);
		ModernizedCProgram.global_hook_info.setBase_cx(base_cx);
		ModernizedCProgram.global_hook_info.setBase_cy(base_cy);
		if (!.SetEvent(ModernizedCProgram.signal_ready)) {
			ModernizedCProgram.hlog("capture_init_shtex: Failed to signal ready: %d", .GetLastError());
			return 0;
		} 
		ModernizedCProgram.active = 1;
		return 1;
	}
	public Object getTex_handle() {
		return tex_handle;
	}
	public void setTex_handle(Object newTex_handle) {
		tex_handle = newTex_handle;
	}
}

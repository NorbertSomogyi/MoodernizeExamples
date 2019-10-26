package application;

public class shmem_data {
	private Object last_tex;
	private Object tex1_offset;
	private Object tex2_offset;
	
	public shmem_data(Object last_tex, Object tex1_offset, Object tex2_offset) {
		setLast_tex(last_tex);
		setTex1_offset(tex1_offset);
		setTex2_offset(tex2_offset);
	}
	public shmem_data() {
	}
	
	public boolean capture_init_shmem(Object window, Object base_cx, Object base_cy, Object cx, Object cy, Object pitch, Object format, boolean flip) {
		uint32_t tex_size = cy * pitch;
		uint32_t aligned_header = ((() + ((true) - 1)) & ~((true) - 1));
		uint32_t aligned_tex = (((tex_size) + ((true) - 1)) & ~((true) - 1));
		uint32_t total_size = aligned_header + aligned_tex * 2 + 32;
		uintptr_t align_pos = new uintptr_t();
		if (!ModernizedCProgram.init_shared_info(total_size)) {
			ModernizedCProgram.hlog("capture_init_shmem: Failed to initialize memory");
			return 0;
		} 
		ModernizedCProgram.data = ModernizedCProgram.shmem_info;
		align_pos = (uintptr_t)/* to ensure fast copy rate, align texture data to 256bit addresses */ModernizedCProgram.shmem_info;
		align_pos += aligned_header;
		align_pos &=  ~(32 - 1);
		align_pos -= (uintptr_t)ModernizedCProgram.shmem_info;
		if (align_pos < ) {
			align_pos += 32;
		} 
		(ModernizedCProgram.data).setLast_tex(-1);
		(ModernizedCProgram.data).setTex1_offset((uint32_t)align_pos);
		(ModernizedCProgram.data).setTex2_offset((ModernizedCProgram.data).getTex1_offset() + aligned_tex);
		ModernizedCProgram.global_hook_info.setWindow((uint32_t)(uintptr_t)window);
		ModernizedCProgram.global_hook_info.setType(capture_type.CAPTURE_TYPE_MEMORY);
		ModernizedCProgram.global_hook_info.setFormat(format);
		ModernizedCProgram.global_hook_info.setFlip(flip);
		ModernizedCProgram.global_hook_info.setMap_id(ModernizedCProgram.shmem_id_counter);
		ModernizedCProgram.global_hook_info.setMap_size(total_size);
		ModernizedCProgram.global_hook_info.setPitch(pitch);
		ModernizedCProgram.global_hook_info.setCx(cx);
		ModernizedCProgram.global_hook_info.setCy(cy);
		ModernizedCProgram.global_hook_info.setBase_cx(base_cx);
		ModernizedCProgram.global_hook_info.setBase_cy(base_cy);
		if (!ModernizedCProgram.init_shmem_thread(pitch, cy)) {
			return 0;
		} 
		if (!.SetEvent(ModernizedCProgram.signal_ready)) {
			ModernizedCProgram.hlog("capture_init_shmem: Failed to signal ready: %d", .GetLastError());
			return 0;
		} 
		ModernizedCProgram.active = 1;
		return 1;
	}
	public Object getLast_tex() {
		return last_tex;
	}
	public void setLast_tex(Object newLast_tex) {
		last_tex = newLast_tex;
	}
	public Object getTex1_offset() {
		return tex1_offset;
	}
	public void setTex1_offset(Object newTex1_offset) {
		tex1_offset = newTex1_offset;
	}
	public Object getTex2_offset() {
		return tex2_offset;
	}
	public void setTex2_offset(Object newTex2_offset) {
		tex2_offset = newTex2_offset;
	}
}

package application;

public class gs_texture {
	private Object device;
	private gs_texture_type type;
	private gs_color_format format;
	private Object gl_format;
	private Object gl_target;
	private Object gl_internal_format;
	private Object gl_type;
	private Object texture;
	private Object levels;
	private Object is_dynamic;
	private Object is_render_target;
	private Object is_dummy;
	private Object gen_mipmaps;
	private Object cur_sampler;
	private fbo_info fbo;
	
	public gs_texture(Object device, gs_texture_type type, gs_color_format format, Object gl_format, Object gl_target, Object gl_internal_format, Object gl_type, Object texture, Object levels, Object is_dynamic, Object is_render_target, Object is_dummy, Object gen_mipmaps, Object cur_sampler, fbo_info fbo) {
		setDevice(device);
		setType(type);
		setFormat(format);
		setGl_format(gl_format);
		setGl_target(gl_target);
		setGl_internal_format(gl_internal_format);
		setGl_type(gl_type);
		setTexture(texture);
		setLevels(levels);
		setIs_dynamic(is_dynamic);
		setIs_render_target(is_render_target);
		setIs_dummy(is_dummy);
		setGen_mipmaps(gen_mipmaps);
		setCur_sampler(cur_sampler);
		setFbo(fbo);
	}
	public gs_texture() {
	}
	
	public gs_texture gs_texrender_get_texture(Object texrender) {
		return texrender ? texrender.getTarget() : NULL;
	}
	public void apply_swizzle() {
		gs_color_format generatedFormat = this.getFormat();
		Object generatedGl_target = this.getGl_target();
		if (generatedFormat == GS_A8) {
			ModernizedCProgram.gl_tex_param_i(generatedGl_target, GL_TEXTURE_SWIZZLE_R, GL_ONE);
			ModernizedCProgram.gl_tex_param_i(generatedGl_target, GL_TEXTURE_SWIZZLE_G, GL_ONE);
			ModernizedCProgram.gl_tex_param_i(generatedGl_target, GL_TEXTURE_SWIZZLE_B, GL_ONE);
			ModernizedCProgram.gl_tex_param_i(generatedGl_target, GL_TEXTURE_SWIZZLE_A, GL_RED);
		} 
	}
	public Object gl_copy_fbo(Object dst_x, Object dst_y, gs_texture src, Object src_x, Object src_y, Object width, Object height) {
		fbo_info fbo_info = new fbo_info();
		fbo_info fbo = fbo_info.get_fbo(src, width, height);
		 last_fbo = new ();
		 success = false;
		if (!fbo) {
			return false;
		} 
		if (!ModernizedCProgram.gl_get_integer_v(GL_READ_FRAMEBUFFER_BINDING, last_fbo)) {
			return false;
		} 
		Object generatedFbo = fbo.getFbo();
		if (!ModernizedCProgram.gl_bind_framebuffer(GL_READ_FRAMEBUFFER, generatedFbo)) {
			return false;
		} 
		Object generatedGl_target = this.getGl_target();
		Object generatedTexture = this.getTexture();
		if (!ModernizedCProgram.gl_bind_texture(generatedGl_target, generatedTexture)) {
			;
		} 
		.glFramebufferTexture2D(GL_READ_FRAMEBUFFER, GL_COLOR_ATTACHMENT0 + 0, generatedGl_target, generatedTexture, 0);
		if (!ModernizedCProgram.gl_success("glFrameBufferTexture2D")) {
			;
		} 
		.glReadBuffer(GL_COLOR_ATTACHMENT0 + 0);
		if (!ModernizedCProgram.gl_success("glReadBuffer")) {
			;
		} 
		.glCopyTexSubImage2D(generatedGl_target, 0, dst_x, dst_y, src_x, src_y, width, height);
		if (!ModernizedCProgram.gl_success("glCopyTexSubImage2D")) {
			;
		} 
		success = true;
		if (!ModernizedCProgram.gl_bind_framebuffer(GL_READ_FRAMEBUFFER, last_fbo)) {
			success = false;
		} 
		return success;
	}
	public gs_texture gs_texture_create_from_file(Object file) {
		gs_color_format format;
		 cx = new ();
		 cy = new ();
		 data = ModernizedCProgram.gs_create_texture_file_data(file, gs_color_format.format, cx, cy);
		gs_texture_t tex = ((Object)0);
		gs_texture gs_texture = new gs_texture();
		if (data) {
			tex = gs_texture.gs_texture_create(cx, cy, gs_color_format.format, 1, ()data, 0);
			ModernizedCProgram.bfree(data);
		} 
		return tex;
	}
	public void gs_draw_sprite(Object flip, Object width, Object height) {
		graphics_t graphics = thread_graphics;
		double fcx;
		double fcy;
		gs_vb_data data = new gs_vb_data();
		if (tex) {
			if (ModernizedCProgram.gs_get_texture_type(tex) != gs_texture_type.GS_TEXTURE_2D) {
				ModernizedCProgram.blog(LOG_ERROR, "A sprite must be a 2D texture");
				return ;
			} 
		} else {
				if (!width || !height) {
					ModernizedCProgram.blog(LOG_ERROR, "A sprite cannot be drawn without a width/height");
					return ;
				} 
		} 
		fcx = width ? (double)width : (double)ModernizedCProgram.gs_texture_get_width(tex);
		fcy = height ? (double)height : (double)ModernizedCProgram.gs_texture_get_height(tex);
		gs_vertex_buffer generatedSprite_buffer = graphics.getSprite_buffer();
		gs_vb_data gs_vb_data = new gs_vb_data();
		data = gs_vb_data.gs_vertexbuffer_get_data(generatedSprite_buffer);
		if (tex && ModernizedCProgram.gs_texture_is_rect(tex)) {
			ModernizedCProgram.build_sprite_rect(data, tex, fcx, fcy, flip);
		} else {
				data.build_sprite_norm(fcx, fcy, flip);
		} 
		ModernizedCProgram.gs_vertexbuffer_flush(generatedSprite_buffer);
		generatedSprite_buffer.gs_load_vertexbuffer();
		((Object)0).gs_load_indexbuffer();
		ModernizedCProgram.gs_draw(gs_draw_mode.GS_TRISTRIP, 0, 0);
	}
	public void gs_draw_sprite_subregion(Object flip, Object sub_x, Object sub_y, Object sub_cx, Object sub_cy) {
		graphics_t graphics = thread_graphics;
		double fcx;
		double fcy;
		gs_vb_data data = new gs_vb_data();
		if (tex) {
			if (ModernizedCProgram.gs_get_texture_type(tex) != gs_texture_type.GS_TEXTURE_2D) {
				ModernizedCProgram.blog(LOG_ERROR, "A sprite must be a 2D texture");
				return ;
			} 
		} 
		fcx = (double)ModernizedCProgram.gs_texture_get_width(tex);
		fcy = (double)ModernizedCProgram.gs_texture_get_height(tex);
		gs_vertex_buffer generatedSprite_buffer = graphics.getSprite_buffer();
		gs_vb_data gs_vb_data = new gs_vb_data();
		data = gs_vb_data.gs_vertexbuffer_get_data(generatedSprite_buffer);
		data.build_subsprite_norm((double)sub_x, (double)sub_y, (double)sub_cx, (double)sub_cy, fcx, fcy, flip);
		ModernizedCProgram.gs_vertexbuffer_flush(generatedSprite_buffer);
		generatedSprite_buffer.gs_load_vertexbuffer();
		((Object)0).gs_load_indexbuffer();
		ModernizedCProgram.gs_draw(gs_draw_mode.GS_TRISTRIP, 0, 0);
	}
	public void gs_draw_cube_backdrop(Object rot, double left, double right, double top, double bottom, double znear) {
		.UNUSED_PARAMETER(/* TODO */cubetex);
		.UNUSED_PARAMETER(rot);
		.UNUSED_PARAMETER(left);
		.UNUSED_PARAMETER(right);
		.UNUSED_PARAMETER(top);
		.UNUSED_PARAMETER(bottom);
		.UNUSED_PARAMETER(znear);
	}
	public void gs_texture_set_image(Object data, Object linesize, Object flip) {
		 ptr = new ();
		 linesize_out = new ();
		 row_copy = new ();
		 height = new ();
		 y = new ();
		if (!(ModernizedCProgram.gs_valid("gs_texture_set_image") && ModernizedCProgram.gs_obj_valid(tex, "gs_texture_set_image", "tex") && ModernizedCProgram.gs_obj_valid(data, "gs_texture_set_image", "data"))) {
			return ;
		} 
		height = ()ModernizedCProgram.gs_texture_get_height(tex);
		if (!ModernizedCProgram.gs_texture_map(tex, ptr, linesize_out)) {
			return ;
		} 
		row_copy = (linesize < linesize_out) ? linesize : linesize_out;
		if (flip) {
			for (y = height - 1; y >= 0; y--) {
				.memcpy(ptr + ()y * linesize_out, data + .UNRECOGNIZEDFUNCTIONNAME(height - y - 1) * linesize, row_copy);
			}
		}  else if (linesize == linesize_out) {
			.memcpy(ptr, data, row_copy * height);
		} else {
				for (y = 0; y < height; y++) {
					.memcpy(ptr + ()y * linesize_out, data + ()y * linesize, row_copy);
				}
		} 
		ModernizedCProgram.gs_texture_unmap(tex);
	}
	public void gs_cubetexture_set_image(Object side, Object data, Object linesize, Object invert) {
		.UNUSED_PARAMETER(/* TODO */cubetex);
		.UNUSED_PARAMETER(side);
		.UNUSED_PARAMETER(data);
		.UNUSED_PARAMETER(linesize);
		.UNUSED_PARAMETER(invert);
	}
	public gs_texture gs_texture_create(Object width, Object height, gs_color_format color_format, Object levels, Object data, Object flags) {
		graphics_t graphics = thread_graphics;
		 pow2tex = ModernizedCProgram.is_pow2(width) && ModernizedCProgram.is_pow2(height);
		 uses_mipmaps = (flags & (1 << 0) || levels != 1);
		if (!ModernizedCProgram.gs_valid("gs_texture_create")) {
			return ((Object)0);
		} 
		if (uses_mipmaps && !pow2tex) {
			ModernizedCProgram.blog(LOG_WARNING, "Cannot use mipmaps with a non-power-of-two texture.  Disabling mipmaps for this texture.");
			uses_mipmaps = false;
			flags &=  ~(1 << 0);
			levels = 1;
		} 
		if (uses_mipmaps && flags & (1 << 2)) {
			ModernizedCProgram.blog(LOG_WARNING, "Cannot use mipmaps with render targets.  Disabling mipmaps for this texture.");
			flags &=  ~(1 << 0);
			levels = 1;
		} 
		gs_device generatedDevice = graphics.getDevice();
		return .UNRECOGNIZEDFUNCTIONNAME(generatedDevice, width, height, gs_color_format.color_format, levels, data, flags);
	}
	public gs_texture gs_cubetexture_create(Object size, gs_color_format color_format, Object levels, Object data, Object flags) {
		graphics_t graphics = thread_graphics;
		 pow2tex = ModernizedCProgram.is_pow2(size);
		 uses_mipmaps = (flags & (1 << 0) || levels != 1);
		if (!ModernizedCProgram.gs_valid("gs_cubetexture_create")) {
			return ((Object)0);
		} 
		if (uses_mipmaps && !pow2tex) {
			ModernizedCProgram.blog(LOG_WARNING, "Cannot use mipmaps with a non-power-of-two texture.  Disabling mipmaps for this texture.");
			uses_mipmaps = false;
			flags &=  ~(1 << 0);
			levels = 1;
		} 
		if (uses_mipmaps && flags & (1 << 2)) {
			ModernizedCProgram.blog(LOG_WARNING, "Cannot use mipmaps with render targets.  Disabling mipmaps for this texture.");
			flags &=  ~(1 << 0);
			levels = 1;
			data = ((Object)0);
		} 
		gs_device generatedDevice = graphics.getDevice();
		return .UNRECOGNIZEDFUNCTIONNAME(generatedDevice, size, gs_color_format.color_format, levels, data, flags);
	}
	public gs_texture gs_voltexture_create(Object width, Object height, Object depth, gs_color_format color_format, Object levels, Object data, Object flags) {
		graphics_t graphics = thread_graphics;
		if (!ModernizedCProgram.gs_valid("gs_voltexture_create")) {
			return ((Object)0);
		} 
		gs_device generatedDevice = graphics.getDevice();
		return .UNRECOGNIZEDFUNCTIONNAME(generatedDevice, width, height, depth, gs_color_format.color_format, levels, data, flags);
	}
	public void gs_load_texture(int unit) {
		graphics_t graphics = thread_graphics;
		if (!ModernizedCProgram.gs_valid("gs_load_texture")) {
			return ;
		} 
		gs_device generatedDevice = graphics.getDevice();
		.UNRECOGNIZEDFUNCTIONNAME(generatedDevice, tex, unit);
	}
	public gs_texture gs_get_render_target() {
		graphics_t graphics = thread_graphics;
		if (!ModernizedCProgram.gs_valid("gs_get_render_target")) {
			return ((Object)0);
		} 
		gs_device generatedDevice = graphics.getDevice();
		return .UNRECOGNIZEDFUNCTIONNAME(generatedDevice);
	}
	public void gs_copy_texture(gs_texture src) {
		graphics_t graphics = thread_graphics;
		if (!(ModernizedCProgram.gs_valid("gs_copy_texture") && ModernizedCProgram.gs_obj_valid(dst, "gs_copy_texture", "dst") && ModernizedCProgram.gs_obj_valid(src, "gs_copy_texture", "src"))) {
			return ;
		} 
		gs_device generatedDevice = graphics.getDevice();
		.UNRECOGNIZEDFUNCTIONNAME(generatedDevice, dst, src);
	}
	public void gs_copy_texture_region(Object dst_x, Object dst_y, gs_texture src, Object src_x, Object src_y, Object src_w, Object src_h) {
		graphics_t graphics = thread_graphics;
		if (!(ModernizedCProgram.gs_valid("gs_copy_texture_region") && ModernizedCProgram.gs_obj_valid(dst, "gs_copy_texture_region", "dst"))) {
			return ;
		} 
		gs_device generatedDevice = graphics.getDevice();
		.UNRECOGNIZEDFUNCTIONNAME(generatedDevice, dst, dst_x, dst_y, src, src_x, src_y, src_w, src_h);
	}
	public void gs_cubetexture_destroy() {
		graphics_t graphics = thread_graphics;
		if (!ModernizedCProgram.gs_valid("gs_cubetexture_destroy")) {
			return ;
		} 
		if (!cubetex) {
			return ;
		} 
		.UNRECOGNIZEDFUNCTIONNAME(cubetex);
		if (!tex) {
			return ;
		} 
		if (tex.getTexture()) {
			ModernizedCProgram.gl_delete_textures(1, tex.getTexture());
		} 
		if (tex.getFbo()) {
			tex.getFbo().fbo_info_destroy();
		} 
		ModernizedCProgram.bfree(tex);
	}
	public gs_texture gs_duplicator_get_texture(gs_duplicator duplicator) {
		if (!(ModernizedCProgram.gs_valid("gs_duplicator_get_texture") && ModernizedCProgram.gs_obj_valid(duplicator, "gs_duplicator_get_texture", "duplicator"))) {
			return ((Object)0);
		} 
		if (!thread_graphics.getExports().getGs_duplicator_get_texture()) {
			return ((Object)0);
		} 
		return .UNRECOGNIZEDFUNCTIONNAME(duplicator);
	}
	/** creates a windows GDI-lockable texture */
	public gs_texture gs_texture_create_gdi(Object width, Object height) {
		graphics_t graphics = thread_graphics;
		if (!ModernizedCProgram.gs_valid("gs_texture_create_gdi")) {
			return ((Object)0);
		} 
		gs_exports generatedExports = graphics.getExports();
		Object generatedDevice_texture_create_gdi = generatedExports.getDevice_texture_create_gdi();
		gs_device generatedDevice = graphics.getDevice();
		if (generatedDevice_texture_create_gdi) {
			return .UNRECOGNIZEDFUNCTIONNAME(generatedDevice, width, height);
		} 
		return ((Object)0);
	}
	public Object gs_texture_get_dc() {
		if (!(ModernizedCProgram.gs_valid("gs_texture_release_dc") && ModernizedCProgram.gs_obj_valid(gdi_tex, "gs_texture_release_dc", "gdi_tex"))) {
			return ((Object)0);
		} 
		if (thread_graphics.getExports().getGs_texture_get_dc()) {
			return .UNRECOGNIZEDFUNCTIONNAME(gdi_tex);
		} 
		return ((Object)0);
	}
	public void gs_texture_release_dc() {
		if (!(ModernizedCProgram.gs_valid("gs_texture_release_dc") && ModernizedCProgram.gs_obj_valid(gdi_tex, "gs_texture_release_dc", "gdi_tex"))) {
			return ;
		} 
		if (thread_graphics.getExports().getGs_texture_release_dc()) {
			.UNRECOGNIZEDFUNCTIONNAME(gdi_tex);
		} 
	}
	public gs_texture gs_texture_open_shared(Object handle) {
		graphics_t graphics = thread_graphics;
		if (!ModernizedCProgram.gs_valid("gs_texture_open_shared")) {
			return ((Object)0);
		} 
		gs_exports generatedExports = graphics.getExports();
		Object generatedDevice_texture_open_shared = generatedExports.getDevice_texture_open_shared();
		gs_device generatedDevice = graphics.getDevice();
		if (generatedDevice_texture_open_shared) {
			return .UNRECOGNIZEDFUNCTIONNAME(generatedDevice, handle);
		} 
		return ((Object)0);
	}
	public Object gs_texture_get_shared_handle() {
		graphics_t graphics = thread_graphics;
		if (!ModernizedCProgram.gs_valid("gs_texture_get_shared_handle")) {
			return (ModernizedCProgram.uint32_t) - 1;
		} 
		gs_exports generatedExports = graphics.getExports();
		Object generatedDevice_texture_get_shared_handle = generatedExports.getDevice_texture_get_shared_handle();
		if (generatedDevice_texture_get_shared_handle) {
			return .UNRECOGNIZEDFUNCTIONNAME(tex);
		} 
		return (ModernizedCProgram.uint32_t) - 1;
	}
	public int gs_texture_acquire_sync(Object key, Object ms) {
		graphics_t graphics = thread_graphics;
		if (!ModernizedCProgram.gs_valid("gs_texture_acquire_sync")) {
			return -1;
		} 
		gs_exports generatedExports = graphics.getExports();
		Object generatedDevice_texture_acquire_sync = generatedExports.getDevice_texture_acquire_sync();
		if (generatedDevice_texture_acquire_sync) {
			return .UNRECOGNIZEDFUNCTIONNAME(tex, key, ms);
		} 
		return -1;
	}
	public int gs_texture_release_sync(Object key) {
		graphics_t graphics = thread_graphics;
		if (!ModernizedCProgram.gs_valid("gs_texture_release_sync")) {
			return -1;
		} 
		gs_exports generatedExports = graphics.getExports();
		Object generatedDevice_texture_release_sync = generatedExports.getDevice_texture_release_sync();
		if (generatedDevice_texture_release_sync) {
			return .UNRECOGNIZEDFUNCTIONNAME(tex, key);
		} 
		return -1;
	}
	public Object gs_texture_create_nv12(gs_texture tex_uv, Object width, Object height, Object flags) {
		graphics_t graphics = thread_graphics;
		 success = false;
		if (!ModernizedCProgram.gs_valid("gs_texture_create_nv12")) {
			return false;
		} 
		if ((width & 1) == 1 || (height & 1) == 1) {
			ModernizedCProgram.blog(LOG_ERROR, "NV12 textures must have dimensions divisible by 2.");
			return false;
		} 
		gs_exports generatedExports = graphics.getExports();
		Object generatedDevice_texture_create_nv12 = generatedExports.getDevice_texture_create_nv12();
		gs_device generatedDevice = graphics.getDevice();
		if (generatedDevice_texture_create_nv12) {
			success = .UNRECOGNIZEDFUNCTIONNAME(generatedDevice, tex_y, tex_uv, width, height, flags);
			if (success) {
				return true;
			} 
		} 
		gs_texture gs_texture = new gs_texture();
		tex_y = gs_texture.gs_texture_create(width, height, gs_color_format.GS_R8, 1, ((Object)0), flags);
		tex_uv = gs_texture.gs_texture_create(width / 2, height / 2, gs_color_format.GS_R8G8, 1, ((Object)0), flags);
		if (!tex_y || !tex_uv) {
			if (tex_y) {
				ModernizedCProgram.gs_texture_destroy(tex_y);
			} 
			if (tex_uv) {
				ModernizedCProgram.gs_texture_destroy(tex_uv);
			} 
			tex_y = ((Object)0);
			tex_uv = ((Object)0);
			return false;
		} 
		return true;
	}
	public Object getDevice() {
		return device;
	}
	public void setDevice(Object newDevice) {
		device = newDevice;
	}
	public gs_texture_type getType() {
		return type;
	}
	public void setType(gs_texture_type newType) {
		type = newType;
	}
	public gs_color_format getFormat() {
		return format;
	}
	public void setFormat(gs_color_format newFormat) {
		format = newFormat;
	}
	public Object getGl_format() {
		return gl_format;
	}
	public void setGl_format(Object newGl_format) {
		gl_format = newGl_format;
	}
	public Object getGl_target() {
		return gl_target;
	}
	public void setGl_target(Object newGl_target) {
		gl_target = newGl_target;
	}
	public Object getGl_internal_format() {
		return gl_internal_format;
	}
	public void setGl_internal_format(Object newGl_internal_format) {
		gl_internal_format = newGl_internal_format;
	}
	public Object getGl_type() {
		return gl_type;
	}
	public void setGl_type(Object newGl_type) {
		gl_type = newGl_type;
	}
	public Object getTexture() {
		return texture;
	}
	public void setTexture(Object newTexture) {
		texture = newTexture;
	}
	public Object getLevels() {
		return levels;
	}
	public void setLevels(Object newLevels) {
		levels = newLevels;
	}
	public Object getIs_dynamic() {
		return is_dynamic;
	}
	public void setIs_dynamic(Object newIs_dynamic) {
		is_dynamic = newIs_dynamic;
	}
	public Object getIs_render_target() {
		return is_render_target;
	}
	public void setIs_render_target(Object newIs_render_target) {
		is_render_target = newIs_render_target;
	}
	public Object getIs_dummy() {
		return is_dummy;
	}
	public void setIs_dummy(Object newIs_dummy) {
		is_dummy = newIs_dummy;
	}
	public Object getGen_mipmaps() {
		return gen_mipmaps;
	}
	public void setGen_mipmaps(Object newGen_mipmaps) {
		gen_mipmaps = newGen_mipmaps;
	}
	public Object getCur_sampler() {
		return cur_sampler;
	}
	public void setCur_sampler(Object newCur_sampler) {
		cur_sampler = newCur_sampler;
	}
	public fbo_info getFbo() {
		return fbo;
	}
	public void setFbo(fbo_info newFbo) {
		fbo = newFbo;
	}
}

package application;

public class gs_device {
	private gl_platform plat;
	private copy_type copy_type;
	private Object empty_vao;
	private Object cur_render_target;
	private Object cur_zstencil_buffer;
	private int cur_render_side;
	private Object cur_textures;
	private Object cur_samplers;
	private Object cur_vertex_buffer;
	private Object cur_index_buffer;
	private Object cur_vertex_shader;
	private Object cur_pixel_shader;
	private Object cur_swap;
	private gs_program cur_program;
	private gs_program first_program;
	private gs_cull_mode cur_cull_mode;
	private gs_rect cur_viewport;
	private matrix4 cur_proj;
	private matrix4 cur_view;
	private matrix4 cur_viewproj;
	private Object ;
	private fbo_info cur_fbo;
	
	public gs_device(gl_platform plat, copy_type copy_type, Object empty_vao, Object cur_render_target, Object cur_zstencil_buffer, int cur_render_side, Object cur_textures, Object cur_samplers, Object cur_vertex_buffer, Object cur_index_buffer, Object cur_vertex_shader, Object cur_pixel_shader, Object cur_swap, gs_program cur_program, gs_program first_program, gs_cull_mode cur_cull_mode, gs_rect cur_viewport, matrix4 cur_proj, matrix4 cur_view, matrix4 cur_viewproj, Object,  fbo_info cur_fbo) {
		setPlat(plat);
		setCopy_type(copy_type);
		setEmpty_vao(empty_vao);
		setCur_render_target(cur_render_target);
		setCur_zstencil_buffer(cur_zstencil_buffer);
		setCur_render_side(cur_render_side);
		setCur_textures(cur_textures);
		setCur_samplers(cur_samplers);
		setCur_vertex_buffer(cur_vertex_buffer);
		setCur_index_buffer(cur_index_buffer);
		setCur_vertex_shader(cur_vertex_shader);
		setCur_pixel_shader(cur_pixel_shader);
		setCur_swap(cur_swap);
		setCur_program(cur_program);
		setFirst_program(first_program);
		setCur_cull_mode(cur_cull_mode);
		setCur_viewport(cur_viewport);
		setCur_proj(cur_proj);
		setCur_view(cur_view);
		setCur_viewproj(cur_viewproj);
		set();
		setCur_fbo(cur_fbo);
	}
	public gs_device() {
	}
	
	public Object gl_init_extensions() {
		if (!ModernizedCProgram.GLAD_GL_VERSION_3_3) {
			ModernizedCProgram.blog(LOG_ERROR, "obs-studio requires OpenGL version 3.3 or higher.");
			return false;
		} 
		ModernizedCProgram.gl_enable_debug();
		ModernizedCProgram.gl_enable(GL_TEXTURE_CUBE_MAP_SEAMLESS);
		if (ModernizedCProgram.GLAD_GL_VERSION_4_3 || ModernizedCProgram.GLAD_GL_ARB_copy_image) {
			this.setCopy_type(copy_type.COPY_TYPE_ARB);
		}  else if (ModernizedCProgram.GLAD_GL_NV_copy_image) {
			this.setCopy_type(copy_type.COPY_TYPE_NV);
		} else {
				this.setCopy_type(copy_type.COPY_TYPE_FBO_BLIT);
		} 
		return true;
		if (!ModernizedCProgram.gladLoadWGL(hdc)) {
			ModernizedCProgram.blog(LOG_ERROR, "Failed to load WGL entry functions.");
			return false;
		} 
		if (!ModernizedCProgram.GLAD_WGL_ARB_pixel_format) {
			ModernizedCProgram.required_extension_error("ARB_pixel_format");
			return false;
		} 
		if (!ModernizedCProgram.GLAD_WGL_ARB_create_context) {
			ModernizedCProgram.required_extension_error("ARB_create_context");
			return false;
		} 
		if (!ModernizedCProgram.GLAD_WGL_ARB_create_context_profile) {
			ModernizedCProgram.required_extension_error("ARB_create_context_profile");
			return false;
		} 
		return true;
	}
	public void clear_textures() {
		 i = new ();
		Object generatedCur_textures = this.getCur_textures();
		for (i = 0; i < GS_MAX_TEXTURES; i++) {
			if (generatedCur_textures[i]) {
				ModernizedCProgram.gl_active_texture(GL_TEXTURE0 + i);
				ModernizedCProgram.gl_bind_texture(generatedCur_textures[i].getGl_target(), 0);
				generatedCur_textures[i] = NULL;
			} 
		}
	}
	public void update_viewproj_matrix() {
		Object generatedCur_vertex_shader = this.getCur_vertex_shader();
		gs_shader vs = generatedCur_vertex_shader;
		matrix4 cur_proj = new matrix4();
		matrix4 generatedCur_view = this.getCur_view();
		generatedCur_view.gs_matrix_get();
		matrix4 generatedCur_proj = this.getCur_proj();
		cur_proj.matrix4_copy(generatedCur_proj);
		fbo_info generatedCur_fbo = this.getCur_fbo();
		Object generatedMatrix4 = cur_proj.getMatrix4();
		if (generatedCur_fbo) {
			generatedMatrix4.setY(-generatedMatrix4.getY());
			generatedMatrix4.setY(-generatedMatrix4.getY());
			generatedMatrix4.setY(-generatedMatrix4.getY());
			generatedMatrix4.setY(-generatedMatrix4.getY());
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/glFrontFace(GL_CW);
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/glFrontFace(GL_CCW);
		} 
		ModernizedCProgram.gl_success("glFrontFace");
		matrix4 generatedCur_viewproj = this.getCur_viewproj();
		generatedCur_viewproj.matrix4_mul(generatedCur_view, cur_proj);
		generatedCur_viewproj.matrix4_transpose(generatedCur_viewproj);
		gs_shader_param generatedViewproj = vs.getViewproj();
		if (generatedViewproj) {
			generatedViewproj.gs_shader_set_matrix4(generatedCur_viewproj);
		} 
	}
	public gl_platform getPlat() {
		return plat;
	}
	public void setPlat(gl_platform newPlat) {
		plat = newPlat;
	}
	public copy_type getCopy_type() {
		return copy_type;
	}
	public void setCopy_type(copy_type newCopy_type) {
		copy_type = newCopy_type;
	}
	public Object getEmpty_vao() {
		return empty_vao;
	}
	public void setEmpty_vao(Object newEmpty_vao) {
		empty_vao = newEmpty_vao;
	}
	public Object getCur_render_target() {
		return cur_render_target;
	}
	public void setCur_render_target(Object newCur_render_target) {
		cur_render_target = newCur_render_target;
	}
	public Object getCur_zstencil_buffer() {
		return cur_zstencil_buffer;
	}
	public void setCur_zstencil_buffer(Object newCur_zstencil_buffer) {
		cur_zstencil_buffer = newCur_zstencil_buffer;
	}
	public int getCur_render_side() {
		return cur_render_side;
	}
	public void setCur_render_side(int newCur_render_side) {
		cur_render_side = newCur_render_side;
	}
	public Object getCur_textures() {
		return cur_textures;
	}
	public void setCur_textures(Object newCur_textures) {
		cur_textures = newCur_textures;
	}
	public Object getCur_samplers() {
		return cur_samplers;
	}
	public void setCur_samplers(Object newCur_samplers) {
		cur_samplers = newCur_samplers;
	}
	public Object getCur_vertex_buffer() {
		return cur_vertex_buffer;
	}
	public void setCur_vertex_buffer(Object newCur_vertex_buffer) {
		cur_vertex_buffer = newCur_vertex_buffer;
	}
	public Object getCur_index_buffer() {
		return cur_index_buffer;
	}
	public void setCur_index_buffer(Object newCur_index_buffer) {
		cur_index_buffer = newCur_index_buffer;
	}
	public Object getCur_vertex_shader() {
		return cur_vertex_shader;
	}
	public void setCur_vertex_shader(Object newCur_vertex_shader) {
		cur_vertex_shader = newCur_vertex_shader;
	}
	public Object getCur_pixel_shader() {
		return cur_pixel_shader;
	}
	public void setCur_pixel_shader(Object newCur_pixel_shader) {
		cur_pixel_shader = newCur_pixel_shader;
	}
	public Object getCur_swap() {
		return cur_swap;
	}
	public void setCur_swap(Object newCur_swap) {
		cur_swap = newCur_swap;
	}
	public gs_program getCur_program() {
		return cur_program;
	}
	public void setCur_program(gs_program newCur_program) {
		cur_program = newCur_program;
	}
	public gs_program getFirst_program() {
		return first_program;
	}
	public void setFirst_program(gs_program newFirst_program) {
		first_program = newFirst_program;
	}
	public gs_cull_mode getCur_cull_mode() {
		return cur_cull_mode;
	}
	public void setCur_cull_mode(gs_cull_mode newCur_cull_mode) {
		cur_cull_mode = newCur_cull_mode;
	}
	public gs_rect getCur_viewport() {
		return cur_viewport;
	}
	public void setCur_viewport(gs_rect newCur_viewport) {
		cur_viewport = newCur_viewport;
	}
	public matrix4 getCur_proj() {
		return cur_proj;
	}
	public void setCur_proj(matrix4 newCur_proj) {
		cur_proj = newCur_proj;
	}
	public matrix4 getCur_view() {
		return cur_view;
	}
	public void setCur_view(matrix4 newCur_view) {
		cur_view = newCur_view;
	}
	public matrix4 getCur_viewproj() {
		return cur_viewproj;
	}
	public void setCur_viewproj(matrix4 newCur_viewproj) {
		cur_viewproj = newCur_viewproj;
	}
	public Object get() {
		return ;
	}
	public void set(Object new) {
		 = new;
	}
	public fbo_info getCur_fbo() {
		return cur_fbo;
	}
	public void setCur_fbo(fbo_info newCur_fbo) {
		cur_fbo = newCur_fbo;
	}
}

package application;

public class fbo_info {
	private Object fbo;
	private Object width;
	private Object height;
	private gs_color_format format;
	private Object cur_render_target;
	private int cur_render_side;
	private Object cur_zstencil_buffer;
	
	public fbo_info(Object fbo, Object width, Object height, gs_color_format format, Object cur_render_target, int cur_render_side, Object cur_zstencil_buffer) {
		setFbo(fbo);
		setWidth(width);
		setHeight(height);
		setFormat(format);
		setCur_render_target(cur_render_target);
		setCur_render_side(cur_render_side);
		setCur_zstencil_buffer(cur_zstencil_buffer);
	}
	public fbo_info() {
	}
	
	public void fbo_info_destroy() {
		Object generatedFbo = this.getFbo();
		if (fbo) {
			.glDeleteFramebuffers(1, generatedFbo);
			ModernizedCProgram.gl_success("glDeleteFramebuffers");
			ModernizedCProgram.bfree(fbo);
		} 
	}
	public fbo_info get_fbo(Object tex, Object width, Object height) {
		if (tex.getFbo() && tex.getFbo().getWidth() == width && tex.getFbo().getHeight() == height && tex.getFbo().getFormat() == tex.getFormat()) {
			return tex.getFbo();
		} 
		 fbo = new ();
		.glGenFramebuffers(1, fbo);
		if (!ModernizedCProgram.gl_success("glGenFramebuffers")) {
			return NULL;
		} 
		tex.setFbo(ModernizedCProgram.bmalloc());
		tex.getFbo().setFbo(fbo);
		tex.getFbo().setWidth(width);
		tex.getFbo().setHeight(height);
		tex.getFbo().setFormat(tex.getFormat());
		tex.getFbo().setCur_render_target(NULL);
		tex.getFbo().setCur_render_side(0);
		tex.getFbo().setCur_zstencil_buffer(NULL);
		return tex.getFbo();
	}
	public fbo_info get_fbo_by_tex(Object tex) {
		 width = new ();
		 height = new ();
		if (!ModernizedCProgram.get_tex_dimensions(tex, width, height)) {
			return NULL;
		} 
		fbo_info fbo_info = new fbo_info();
		return fbo_info.get_fbo(tex, width, height);
	}
	public Object set_current_fbo(Object device) {
		Object generatedFbo = this.getFbo();
		if (device.getCur_fbo() != fbo) {
			 fbo_obj = fbo ? generatedFbo : 0;
			if (!ModernizedCProgram.gl_bind_framebuffer(GL_DRAW_FRAMEBUFFER, fbo_obj)) {
				return false;
			} 
			if (device.getCur_fbo()) {
				device.getCur_fbo().setCur_render_target(NULL);
				device.getCur_fbo().setCur_zstencil_buffer(NULL);
			} 
		} 
		device.setCur_fbo(fbo);
		return true;
	}
	public Object attach_rendertarget(Object tex, int side) {
		Object generatedCur_render_target = this.getCur_render_target();
		if (generatedCur_render_target == tex) {
			return true;
		} 
		this.setCur_render_target(tex);
		if (tex.getType() == GS_TEXTURE_2D) {
			.glFramebufferTexture2D(GL_DRAW_FRAMEBUFFER, GL_COLOR_ATTACHMENT0, GL_TEXTURE_2D, tex.getTexture(), 0);
		}  else if (tex.getType() == GS_TEXTURE_CUBE) {
			.glFramebufferTexture2D(GL_DRAW_FRAMEBUFFER, GL_COLOR_ATTACHMENT0, GL_TEXTURE_CUBE_MAP_POSITIVE_X + side, tex.getTexture(), 0);
		} else {
				return false;
		} 
		return ModernizedCProgram.gl_success("glFramebufferTexture2D");
	}
	public Object attach_zstencil(Object zs) {
		 zsbuffer = 0;
		 zs_attachment = GL_DEPTH_STENCIL_ATTACHMENT;
		Object generatedCur_zstencil_buffer = this.getCur_zstencil_buffer();
		if (generatedCur_zstencil_buffer == zs) {
			return true;
		} 
		this.setCur_zstencil_buffer(zs);
		if (zs) {
			zsbuffer = zs.getBuffer();
			zs_attachment = zs.getAttachment();
		} 
		.glFramebufferRenderbuffer(GL_DRAW_FRAMEBUFFER, zs_attachment, GL_RENDERBUFFER, zsbuffer);
		if (!ModernizedCProgram.gl_success("glFramebufferRenderbuffer")) {
			return false;
		} 
		return true;
	}
	public Object getFbo() {
		return fbo;
	}
	public void setFbo(Object newFbo) {
		fbo = newFbo;
	}
	public Object getWidth() {
		return width;
	}
	public void setWidth(Object newWidth) {
		width = newWidth;
	}
	public Object getHeight() {
		return height;
	}
	public void setHeight(Object newHeight) {
		height = newHeight;
	}
	public gs_color_format getFormat() {
		return format;
	}
	public void setFormat(gs_color_format newFormat) {
		format = newFormat;
	}
	public Object getCur_render_target() {
		return cur_render_target;
	}
	public void setCur_render_target(Object newCur_render_target) {
		cur_render_target = newCur_render_target;
	}
	public int getCur_render_side() {
		return cur_render_side;
	}
	public void setCur_render_side(int newCur_render_side) {
		cur_render_side = newCur_render_side;
	}
	public Object getCur_zstencil_buffer() {
		return cur_zstencil_buffer;
	}
	public void setCur_zstencil_buffer(Object newCur_zstencil_buffer) {
		cur_zstencil_buffer = newCur_zstencil_buffer;
	}
}

package application;

public class gpu_delay_filter_data {
	private obs_source context;
	private circlebuf frames;
	private Object delay_ns;
	private Object interval_ns;
	private Object cx;
	private Object cy;
	private Object target_valid;
	private Object processed_frame;
	
	public gpu_delay_filter_data(obs_source context, circlebuf frames, Object delay_ns, Object interval_ns, Object cx, Object cy, Object target_valid, Object processed_frame) {
		setContext(context);
		setFrames(frames);
		setDelay_ns(delay_ns);
		setInterval_ns(interval_ns);
		setCx(cx);
		setCy(cy);
		setTarget_valid(target_valid);
		setProcessed_frame(processed_frame);
	}
	public gpu_delay_filter_data() {
	}
	
	public void free_textures() {
		ModernizedCProgram.obs_enter_graphics();
		circlebuf generatedFrames = this.getFrames();
		Object generatedCirclebuf = generatedFrames.getCirclebuf();
		Object generatedRender = frame.getRender();
		while (generatedCirclebuf) {
			frame frame = new frame();
			generatedFrames.circlebuf_pop_front(frame, /*Error: sizeof expression not supported yet*/);
			generatedRender.gs_texrender_destroy();
		}
		generatedFrames.circlebuf_free();
		ModernizedCProgram.obs_leave_graphics();
	}
	public void update_interval(Object new_interval_ns) {
		Object generatedTarget_valid = this.getTarget_valid();
		if (!generatedTarget_valid) {
			f.free_textures();
			return /*Error: Unsupported expression*/;
		} 
		this.setInterval_ns(new_interval_ns);
		Object generatedDelay_ns = this.getDelay_ns();
		 num = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedDelay_ns / new_interval_ns);
		circlebuf generatedFrames = this.getFrames();
		gs_texture_render gs_texture_render = new gs_texture_render();
		Object generatedRender = frame.getRender();
		if (num > generatedFrames.num_frames()) {
			 prev_num = generatedFrames.num_frames();
			ModernizedCProgram.obs_enter_graphics();
			generatedFrames.circlebuf_upsize(num * /*Error: Unsupported expression*/);
			for ( i = prev_num;
			 i < num; i++) {
				frame frame = generatedFrames.circlebuf_data(i * /*Error: sizeof expression not supported yet*/);
				frame.setRender(gs_texture_render.gs_texrender_create(GS_RGBA, GS_ZS_NONE));
			}
			ModernizedCProgram.obs_leave_graphics();
		}  else if (num < generatedFrames.num_frames()) {
			ModernizedCProgram.obs_enter_graphics();
			while (generatedFrames.num_frames() > num) {
				frame frame = new frame();
				generatedFrames.circlebuf_pop_front(frame, /*Error: sizeof expression not supported yet*/);
				generatedRender.gs_texrender_destroy();
			}
			ModernizedCProgram.obs_leave_graphics();
		} 
	}
	public void check_interval() {
		obs_video_info ovi = new obs_video_info(0);
		 interval_ns = new ();
		ovi.obs_get_video_info();
		Object generatedFps_den = ovi.getFps_den();
		Object generatedFps_num = ovi.getFps_num();
		interval_ns = ()generatedFps_den * -1024 / ()generatedFps_num;
		Object generatedInterval_ns = this.getInterval_ns();
		if (interval_ns != generatedInterval_ns) {
			f.update_interval(interval_ns);
		} 
	}
	public void reset_textures() {
		this.setInterval_ns(0);
		f.free_textures();
		f.check_interval();
	}
	public Object check_size() {
		obs_source generatedContext = this.getContext();
		obs_source obs_source = new obs_source();
		obs_source_t target = obs_source.obs_filter_get_target(generatedContext);
		 cx = new ();
		 cy = new ();
		this.setTarget_valid(!!target);
		Object generatedTarget_valid = this.getTarget_valid();
		if (!generatedTarget_valid) {
			return true;
		} 
		cx = target.obs_source_get_base_width();
		cy = target.obs_source_get_base_height();
		this.setTarget_valid(!!cx && !!cy);
		if (!generatedTarget_valid) {
			return true;
		} 
		Object generatedCx = this.getCx();
		Object generatedCy = this.getCy();
		if (cx != generatedCx || cy != generatedCy) {
			this.setCx(cx);
			this.setCy(cy);
			f.reset_textures();
			return true;
		} 
		return false;
	}
	public void draw_frame() {
		frame frame = new frame();
		circlebuf generatedFrames = this.getFrames();
		generatedFrames.circlebuf_peek_front(frame, /*Error: sizeof expression not supported yet*/);
		 effect = ModernizedCProgram.obs_get_base_effect(obs_base_effect.OBS_EFFECT_DEFAULT);
		Object generatedRender = frame.getRender();
		gs_texture gs_texture = new gs_texture();
		 tex = gs_texture.gs_texrender_get_texture(generatedRender);
		gs_effect_param gs_effect_param = new gs_effect_param();
		Object generatedCx = this.getCx();
		Object generatedCy = this.getCy();
		if (tex) {
			 image = gs_effect_param.gs_effect_get_param_by_name(effect, "image");
			ModernizedCProgram.gs_effect_set_texture(image, tex);
			while (effect.gs_effect_loop("Draw")) {
				tex.gs_draw_sprite(0, generatedCx, generatedCy);
			}
		} 
	}
	public obs_source getContext() {
		return context;
	}
	public void setContext(obs_source newContext) {
		context = newContext;
	}
	public circlebuf getFrames() {
		return frames;
	}
	public void setFrames(circlebuf newFrames) {
		frames = newFrames;
	}
	public Object getDelay_ns() {
		return delay_ns;
	}
	public void setDelay_ns(Object newDelay_ns) {
		delay_ns = newDelay_ns;
	}
	public Object getInterval_ns() {
		return interval_ns;
	}
	public void setInterval_ns(Object newInterval_ns) {
		interval_ns = newInterval_ns;
	}
	public Object getCx() {
		return cx;
	}
	public void setCx(Object newCx) {
		cx = newCx;
	}
	public Object getCy() {
		return cy;
	}
	public void setCy(Object newCy) {
		cy = newCy;
	}
	public Object getTarget_valid() {
		return target_valid;
	}
	public void setTarget_valid(Object newTarget_valid) {
		target_valid = newTarget_valid;
	}
	public Object getProcessed_frame() {
		return processed_frame;
	}
	public void setProcessed_frame(Object newProcessed_frame) {
		processed_frame = newProcessed_frame;
	}
}

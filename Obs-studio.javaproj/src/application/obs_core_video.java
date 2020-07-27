package application;

public class obs_core_video {
	private Object graphics;
	private Object copy_surfaces;
	private Object render_texture;
	private Object output_texture;
	private Object convert_textures;
	private Object texture_rendered;
	private Object textures_copied;
	private Object texture_converted;
	private Object using_nv12_tex;
	private circlebuf vframe_info_buffer;
	private circlebuf vframe_info_buffer_gpu;
	private Object default_effect;
	private Object default_rect_effect;
	private Object opaque_effect;
	private Object solid_effect;
	private Object repeat_effect;
	private Object conversion_effect;
	private Object bicubic_effect;
	private Object lanczos_effect;
	private Object area_effect;
	private Object bilinear_lowres_effect;
	private Object premultiplied_alpha_effect;
	private Object point_sampler;
	private Object mapped_surfaces;
	private int cur_texture;
	private long raw_active;
	private long gpu_encoder_active;
	private Object gpu_encoder_mutex;
	private circlebuf gpu_encoder_queue;
	private circlebuf gpu_encoder_avail_queue;
	private Object ;
	private Object gpu_encode_semaphore;
	private Object gpu_encode_inactive;
	private Object gpu_encode_thread;
	private Object gpu_encode_thread_initialized;
	private Object gpu_encode_stop;
	private Object video_time;
	private Object video_frame_interval_ns;
	private Object video_avg_frame_time_ns;
	private double video_fps;
	private Object video;
	private Object video_thread;
	private Object total_frames;
	private Object lagged_frames;
	private Object thread_initialized;
	private Object gpu_conversion;
	private Object conversion_techs;
	private Object conversion_needed;
	private double conversion_width_i;
	private Object output_width;
	private Object output_height;
	private Object base_width;
	private Object base_height;
	private Object color_matrix;
	private obs_scale_type scale_type;
	private Object transparent_texture;
	private Object deinterlace_discard_effect;
	private Object deinterlace_discard_2x_effect;
	private Object deinterlace_linear_effect;
	private Object deinterlace_linear_2x_effect;
	private Object deinterlace_blend_effect;
	private Object deinterlace_blend_2x_effect;
	private Object deinterlace_yadif_effect;
	private Object deinterlace_yadif_2x_effect;
	private obs_video_info ovi;
	
	public obs_core_video(Object graphics, Object copy_surfaces, Object render_texture, Object output_texture, Object convert_textures, Object texture_rendered, Object textures_copied, Object texture_converted, Object using_nv12_tex, circlebuf vframe_info_buffer, circlebuf vframe_info_buffer_gpu, Object default_effect, Object default_rect_effect, Object opaque_effect, Object solid_effect, Object repeat_effect, Object conversion_effect, Object bicubic_effect, Object lanczos_effect, Object area_effect, Object bilinear_lowres_effect, Object premultiplied_alpha_effect, Object point_sampler, Object mapped_surfaces, int cur_texture, long raw_active, long gpu_encoder_active, Object gpu_encoder_mutex, circlebuf gpu_encoder_queue, circlebuf gpu_encoder_avail_queue, Object,  Object gpu_encode_semaphore, Object gpu_encode_inactive, Object gpu_encode_thread, Object gpu_encode_thread_initialized, Object gpu_encode_stop, Object video_time, Object video_frame_interval_ns, Object video_avg_frame_time_ns, double video_fps, Object video, Object video_thread, Object total_frames, Object lagged_frames, Object thread_initialized, Object gpu_conversion, Object conversion_techs, Object conversion_needed, double conversion_width_i, Object output_width, Object output_height, Object base_width, Object base_height, Object color_matrix, obs_scale_type scale_type, Object transparent_texture, Object deinterlace_discard_effect, Object deinterlace_discard_2x_effect, Object deinterlace_linear_effect, Object deinterlace_linear_2x_effect, Object deinterlace_blend_effect, Object deinterlace_blend_2x_effect, Object deinterlace_yadif_effect, Object deinterlace_yadif_2x_effect, obs_video_info ovi) {
		setGraphics(graphics);
		setCopy_surfaces(copy_surfaces);
		setRender_texture(render_texture);
		setOutput_texture(output_texture);
		setConvert_textures(convert_textures);
		setTexture_rendered(texture_rendered);
		setTextures_copied(textures_copied);
		setTexture_converted(texture_converted);
		setUsing_nv12_tex(using_nv12_tex);
		setVframe_info_buffer(vframe_info_buffer);
		setVframe_info_buffer_gpu(vframe_info_buffer_gpu);
		setDefault_effect(default_effect);
		setDefault_rect_effect(default_rect_effect);
		setOpaque_effect(opaque_effect);
		setSolid_effect(solid_effect);
		setRepeat_effect(repeat_effect);
		setConversion_effect(conversion_effect);
		setBicubic_effect(bicubic_effect);
		setLanczos_effect(lanczos_effect);
		setArea_effect(area_effect);
		setBilinear_lowres_effect(bilinear_lowres_effect);
		setPremultiplied_alpha_effect(premultiplied_alpha_effect);
		setPoint_sampler(point_sampler);
		setMapped_surfaces(mapped_surfaces);
		setCur_texture(cur_texture);
		setRaw_active(raw_active);
		setGpu_encoder_active(gpu_encoder_active);
		setGpu_encoder_mutex(gpu_encoder_mutex);
		setGpu_encoder_queue(gpu_encoder_queue);
		setGpu_encoder_avail_queue(gpu_encoder_avail_queue);
		set();
		setGpu_encode_semaphore(gpu_encode_semaphore);
		setGpu_encode_inactive(gpu_encode_inactive);
		setGpu_encode_thread(gpu_encode_thread);
		setGpu_encode_thread_initialized(gpu_encode_thread_initialized);
		setGpu_encode_stop(gpu_encode_stop);
		setVideo_time(video_time);
		setVideo_frame_interval_ns(video_frame_interval_ns);
		setVideo_avg_frame_time_ns(video_avg_frame_time_ns);
		setVideo_fps(video_fps);
		setVideo(video);
		setVideo_thread(video_thread);
		setTotal_frames(total_frames);
		setLagged_frames(lagged_frames);
		setThread_initialized(thread_initialized);
		setGpu_conversion(gpu_conversion);
		setConversion_techs(conversion_techs);
		setConversion_needed(conversion_needed);
		setConversion_width_i(conversion_width_i);
		setOutput_width(output_width);
		setOutput_height(output_height);
		setBase_width(base_width);
		setBase_height(base_height);
		setColor_matrix(color_matrix);
		setScale_type(scale_type);
		setTransparent_texture(transparent_texture);
		setDeinterlace_discard_effect(deinterlace_discard_effect);
		setDeinterlace_discard_2x_effect(deinterlace_discard_2x_effect);
		setDeinterlace_linear_effect(deinterlace_linear_effect);
		setDeinterlace_linear_2x_effect(deinterlace_linear_2x_effect);
		setDeinterlace_blend_effect(deinterlace_blend_effect);
		setDeinterlace_blend_2x_effect(deinterlace_blend_2x_effect);
		setDeinterlace_yadif_effect(deinterlace_yadif_effect);
		setDeinterlace_yadif_2x_effect(deinterlace_yadif_2x_effect);
		setOvi(ovi);
	}
	public obs_core_video() {
	}
	
	public Object init_gpu_encoding() {
		obs_video_info generatedOvi = this.getOvi();
		obs_video_info ovi = generatedOvi;
		this.setGpu_encode_stop(false);
		circlebuf generatedGpu_encoder_avail_queue = this.getGpu_encoder_avail_queue();
		generatedGpu_encoder_avail_queue.circlebuf_reserve(3);
		Object generatedOutput_width = ovi.getOutput_width();
		Object generatedOutput_height = ovi.getOutput_height();
		for ( i = 0;
		 i < 3; i++) {
			 tex = new ();
			 tex_uv = new ();
			tex.gs_texture_create_nv12(tex_uv, generatedOutput_width, generatedOutput_height, GS_RENDER_TARGET | GS_SHARED_KM_TEX);
			if (!tex) {
				return false;
			} 
			 handle = tex.gs_texture_get_shared_handle();
			obs_tex_frame frame = new obs_tex_frame(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
			generatedGpu_encoder_avail_queue.circlebuf_push_back(frame, /*Error: sizeof expression not supported yet*/);
		}
		Object generatedGpu_encode_semaphore = this.getGpu_encode_semaphore();
		if (generatedGpu_encode_semaphore.os_sem_init(0) != 0) {
			return false;
		} 
		Object generatedGpu_encode_inactive = this.getGpu_encode_inactive();
		if (generatedGpu_encode_inactive.os_event_init(OS_EVENT_TYPE_MANUAL) != 0) {
			return false;
		} 
		Object generatedGpu_encode_thread = this.getGpu_encode_thread();
		if (ModernizedCProgram.pthread_create(generatedGpu_encode_thread, NULL, gpu_encode_thread, NULL) != 0) {
			return false;
		} 
		generatedGpu_encode_inactive.os_event_signal();
		this.setGpu_encode_thread_initialized(true);
		return true;
	}
	public void stop_gpu_encoding_thread() {
		Object generatedGpu_encode_thread_initialized = this.getGpu_encode_thread_initialized();
		Object generatedGpu_encode_stop = this.getGpu_encode_stop();
		Object generatedGpu_encode_semaphore = this.getGpu_encode_semaphore();
		Object generatedGpu_encode_thread = this.getGpu_encode_thread();
		if (generatedGpu_encode_thread_initialized) {
			ModernizedCProgram.os_atomic_set_bool(generatedGpu_encode_stop, true);
			generatedGpu_encode_semaphore.os_sem_post();
			ModernizedCProgram.pthread_join(generatedGpu_encode_thread, NULL);
			this.setGpu_encode_thread_initialized(false);
		} 
	}
	public void free_gpu_encoding() {
		Object generatedGpu_encode_semaphore = this.getGpu_encode_semaphore();
		if (generatedGpu_encode_semaphore) {
			generatedGpu_encode_semaphore.os_sem_destroy();
			this.setGpu_encode_semaphore(NULL);
		} 
		Object generatedGpu_encode_inactive = this.getGpu_encode_inactive();
		if (generatedGpu_encode_inactive) {
			generatedGpu_encode_inactive.os_event_destroy();
			this.setGpu_encode_inactive(NULL);
		} 
		circlebuf generatedGpu_encoder_queue = this.getGpu_encoder_queue();
		Object generatedCirclebuf = generatedGpu_encoder_queue.getCirclebuf();
		Object generatedTex = frame.getTex();
		Object generatedTex_uv = frame.getTex_uv();
		do {
			while (generatedCirclebuf) {
				obs_tex_frame frame = new obs_tex_frame();
				generatedGpu_encoder_queue.circlebuf_pop_front(frame, /*Error: sizeof expression not supported yet*/);
				ModernizedCProgram.gs_texture_destroy(generatedTex);
				ModernizedCProgram.gs_texture_destroy(generatedTex_uv);
			}
			generatedGpu_encoder_queue.circlebuf_free();
		} while (false);
		circlebuf generatedGpu_encoder_avail_queue = this.getGpu_encoder_avail_queue();
		do {
			while (generatedCirclebuf) {
				obs_tex_frame frame = new obs_tex_frame();
				generatedGpu_encoder_avail_queue.circlebuf_pop_front(frame, /*Error: sizeof expression not supported yet*/);
				ModernizedCProgram.gs_texture_destroy(generatedTex);
				ModernizedCProgram.gs_texture_destroy(generatedTex_uv);
			}
			generatedGpu_encoder_avail_queue.circlebuf_free();
		} while (false);
	}
	public void unmap_last_surface() {
		Object generatedMapped_surfaces = this.getMapped_surfaces();
		for (int c = 0;
		 c < 3; ++c) {
			if (generatedMapped_surfaces[c]) {
				generatedMapped_surfaces[c].gs_stagesurface_unmap();
				generatedMapped_surfaces[c] = ((Object)0);
			} 
		}
	}
	public void render_main_texture() {
		ModernizedCProgram.profile_start(ModernizedCProgram.render_main_texture_name);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/GS_DEBUG_MARKER_BEGIN(GS_DEBUG_COLOR_MAIN_TEXTURE, ModernizedCProgram.render_main_texture_name);
		vec4 clear_color = new vec4();
		clear_color.vec4_set(0.0, 0.0, 0.0, 0.0);
		Object generatedRender_texture = this.getRender_texture();
		ModernizedCProgram.gs_set_render_target(generatedRender_texture, ((Object)0));
		ModernizedCProgram.gs_clear(GS_CLEAR_COLOR, clear_color, 1.0, 0);
		Object generatedBase_width = this.getBase_width();
		Object generatedBase_height = this.getBase_height();
		ModernizedCProgram.set_render_size(generatedBase_width, generatedBase_height);
		ModernizedCProgram.pthread_mutex_lock(ModernizedCProgram.obs.getData().getDraw_callbacks_mutex());
		for (size_t i = ModernizedCProgram.obs.getData().getDraw_callbacks().getNum();
		 i > 0; i--) {
			draw_callback callback = new draw_callback();
			ModernizedCProgram.callback = ModernizedCProgram.obs.getData().getDraw_callbacks().getArray() + (i - 1);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(ModernizedCProgram.callback.getParam(), generatedBase_width, generatedBase_height);
		}
		ModernizedCProgram.pthread_mutex_unlock(ModernizedCProgram.obs.getData().getDraw_callbacks_mutex());
		ModernizedCProgram.obs.getData().getMain_view().obs_view_render();
		this.setTexture_rendered(true);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/GS_DEBUG_MARKER_END();
		ModernizedCProgram.profile_end(ModernizedCProgram.render_main_texture_name);
	}
	public Object get_scale_effect_internal() {
		Object generatedOutput_width = this.getOutput_width();
		Object generatedBase_width = this.getBase_width();
		Object generatedOutput_height = this.getOutput_height();
		Object generatedBase_height = this.getBase_height();
		Object generatedBilinear_lowres_effect = this.getBilinear_lowres_effect();
		if (generatedOutput_width < (generatedBase_width / 2) && generatedOutput_height < (generatedBase_height / 2)) {
			return generatedBilinear_lowres_effect;
		} 
		Object generatedDefault_effect = this.getDefault_effect();
		Object generatedLanczos_effect = this.getLanczos_effect();
		Object generatedArea_effect = this.getArea_effect();
		obs_scale_type generatedScale_type = this.getScale_type();
		switch (generatedScale_type) {
		case obs_scale_type.OBS_SCALE_AREA:
				return generatedArea_effect;
		case obs_scale_type.OBS_SCALE_BILINEAR:
				return generatedDefault_effect;
		case obs_scale_type.OBS_SCALE_LANCZOS:
				return generatedLanczos_effect;
		case obs_scale_type.OBS_SCALE_BICUBIC:
		default:
				;
		}
		Object generatedBicubic_effect = this.getBicubic_effect();
		return generatedBicubic_effect;
	}
	/* if the dimension is under half the size of the original image,
		 * bicubic/lanczos can't sample enough pixels to create an accurate
		 * image, so use the bilinear low resolution effect instead */
	public Object resolution_close(Object width, Object height) {
		Object generatedBase_width = this.getBase_width();
		long width_cmp = (long)generatedBase_width - (long)width;
		Object generatedBase_height = this.getBase_height();
		long height_cmp = (long)generatedBase_height - (long)height;
		return /*Error: Function owner not recognized*/labs(width_cmp) <= 16 && /*Error: Function owner not recognized*/labs(height_cmp) <= 16;
	}
	public Object get_scale_effect(Object width, Object height) {
		Object generatedDefault_effect = this.getDefault_effect();
		Object generatedBicubic_effect = this.getBicubic_effect();
		if (video.resolution_close(width, height)) {
			return generatedDefault_effect;
		} else {
				 effect = /* if the scale method couldn't be loaded, use either bicubic
						 * or bilinear by default */video.get_scale_effect_internal();
				if (!effect) {
					effect = !!generatedBicubic_effect ? generatedBicubic_effect : generatedDefault_effect;
				} 
				return effect;
		} 
	}
	public Object render_output_texture() {
		Object generatedRender_texture = this.getRender_texture();
		 texture = generatedRender_texture;
		Object generatedOutput_texture = this.getOutput_texture();
		 target = generatedOutput_texture;
		 width = ModernizedCProgram.gs_texture_get_width(target);
		 height = ModernizedCProgram.gs_texture_get_height(target);
		 effect = video.get_scale_effect(width, height);
		 tech = new ();
		obs_video_info generatedOvi = this.getOvi();
		video_format generatedOutput_format = generatedOvi.getOutput_format();
		gs_effect_technique gs_effect_technique = new gs_effect_technique();
		Object generatedDefault_effect = this.getDefault_effect();
		Object generatedBase_width = this.getBase_width();
		Object generatedBase_height = this.getBase_height();
		if (generatedOutput_format == VIDEO_FORMAT_RGBA) {
			tech = gs_effect_technique.gs_effect_get_technique(effect, "DrawAlphaDivide");
		} else {
				if ((effect == generatedDefault_effect) && (width == generatedBase_width) && (height == generatedBase_height)) {
					return texture;
				} 
				tech = gs_effect_technique.gs_effect_get_technique(effect, "Draw");
		} 
		ModernizedCProgram.profile_start(ModernizedCProgram.render_output_texture_name);
		gs_effect_param gs_effect_param = new gs_effect_param();
		 image = gs_effect_param.gs_effect_get_param_by_name(effect, "image");
		 bres = gs_effect_param.gs_effect_get_param_by_name(effect, "base_dimension");
		 bres_i = gs_effect_param.gs_effect_get_param_by_name(effect, "base_dimension_i");
		size_t passes = new size_t();
		size_t i = new size_t();
		ModernizedCProgram.gs_set_render_target(target, ((Object)0));
		ModernizedCProgram.set_render_size(width, height);
		if (bres) {
			vec2 base = new vec2();
			base.vec2_set((double)generatedBase_width, (double)generatedBase_height);
			bres.gs_effect_set_vec2(base);
		} 
		if (bres_i) {
			vec2 base_i = new vec2();
			base_i.vec2_set(1.0 / (double)generatedBase_width, 1.0 / (double)generatedBase_height);
			bres_i.gs_effect_set_vec2(base_i);
		} 
		ModernizedCProgram.gs_effect_set_texture(image, texture);
		ModernizedCProgram.gs_enable_blending(false);
		passes = tech.gs_technique_begin();
		for (i = 0; i < passes; i++) {
			tech.gs_technique_begin_pass(i);
			texture.gs_draw_sprite(0, width, height);
			tech.gs_technique_end_pass();
		}
		tech.gs_technique_end();
		ModernizedCProgram.gs_enable_blending(true);
		ModernizedCProgram.profile_end(ModernizedCProgram.render_output_texture_name);
		return target;
	}
	public void render_convert_texture(Object texture) {
		ModernizedCProgram.profile_start(ModernizedCProgram.render_convert_texture_name);
		Object generatedConversion_effect = this.getConversion_effect();
		 effect = generatedConversion_effect;
		gs_effect_param gs_effect_param = new gs_effect_param();
		 color_vec0 = gs_effect_param.gs_effect_get_param_by_name(effect, "color_vec0");
		 color_vec1 = gs_effect_param.gs_effect_get_param_by_name(effect, "color_vec1");
		 color_vec2 = gs_effect_param.gs_effect_get_param_by_name(effect, "color_vec2");
		 image = gs_effect_param.gs_effect_get_param_by_name(effect, "image");
		 width_i = gs_effect_param.gs_effect_get_param_by_name(effect, "width_i");
		vec4 vec0 = new vec4();
		vec4 vec1 = new vec4();
		vec4 vec2 = new vec4();
		Object generatedColor_matrix = this.getColor_matrix();
		vec0.vec4_set(generatedColor_matrix[4], generatedColor_matrix[5], generatedColor_matrix[6], generatedColor_matrix[7]);
		vec1.vec4_set(generatedColor_matrix[0], generatedColor_matrix[1], generatedColor_matrix[2], generatedColor_matrix[3]);
		vec2.vec4_set(generatedColor_matrix[8], generatedColor_matrix[9], generatedColor_matrix[10], generatedColor_matrix[11]);
		ModernizedCProgram.gs_enable_blending(false);
		Object generatedConvert_textures = this.getConvert_textures();
		Object generatedConversion_techs = this.getConversion_techs();
		double generatedConversion_width_i = this.getConversion_width_i();
		if (generatedConvert_textures[0]) {
			ModernizedCProgram.gs_effect_set_texture(image, texture);
			color_vec0.gs_effect_set_vec4(vec0);
			ModernizedCProgram.render_convert_plane(effect, generatedConvert_textures[0], generatedConversion_techs[0]);
			if (generatedConvert_textures[1]) {
				ModernizedCProgram.gs_effect_set_texture(image, texture);
				color_vec1.gs_effect_set_vec4(vec1);
				if (!generatedConvert_textures[2]) {
					color_vec2.gs_effect_set_vec4(vec2);
				} 
				width_i.gs_effect_set_float(generatedConversion_width_i);
				ModernizedCProgram.render_convert_plane(effect, generatedConvert_textures[1], generatedConversion_techs[1]);
				if (generatedConvert_textures[2]) {
					ModernizedCProgram.gs_effect_set_texture(image, texture);
					color_vec2.gs_effect_set_vec4(vec2);
					width_i.gs_effect_set_float(generatedConversion_width_i);
					ModernizedCProgram.render_convert_plane(effect, generatedConvert_textures[2], generatedConversion_techs[2]);
				} 
			} 
		} 
		ModernizedCProgram.gs_enable_blending(true);
		this.setTexture_converted(true);
		ModernizedCProgram.profile_end(ModernizedCProgram.render_convert_texture_name);
	}
	public void stage_output_texture(int cur_texture) {
		ModernizedCProgram.profile_start(ModernizedCProgram.stage_output_texture_name);
		video.unmap_last_surface();
		Object generatedGpu_conversion = this.getGpu_conversion();
		Object generatedCopy_surfaces = this.getCopy_surfaces();
		Object generatedOutput_texture = this.getOutput_texture();
		Object generatedTextures_copied = this.getTextures_copied();
		Object generatedTexture_converted = this.getTexture_converted();
		Object generatedConvert_textures = this.getConvert_textures();
		if (!generatedGpu_conversion) {
			 copy = generatedCopy_surfaces[cur_texture][0];
			if (copy) {
				ModernizedCProgram.gs_stage_texture(copy, generatedOutput_texture);
			} 
			generatedTextures_copied[cur_texture] = true;
		}  else if (generatedTexture_converted) {
			for (int i = 0;
			 i < 3; i++) {
				 copy = generatedCopy_surfaces[cur_texture][i];
				if (copy) {
					ModernizedCProgram.gs_stage_texture(copy, generatedConvert_textures[i]);
				} 
			}
			generatedTextures_copied[cur_texture] = true;
		} 
		ModernizedCProgram.profile_end(ModernizedCProgram.stage_output_texture_name);
	}
	public void output_gpu_encoders(Object raw_active) {
		ModernizedCProgram.profile_start(ModernizedCProgram.output_gpu_encoders_name);
		Object generatedTexture_converted = this.getTexture_converted();
		if (!generatedTexture_converted) {
			;
		} 
		circlebuf generatedVframe_info_buffer_gpu = this.getVframe_info_buffer_gpu();
		Object generatedCirclebuf = generatedVframe_info_buffer_gpu.getCirclebuf();
		if (!generatedCirclebuf) {
			;
		} 
		obs_vframe_info vframe_info = new obs_vframe_info();
		generatedVframe_info_buffer_gpu.circlebuf_pop_front(vframe_info, /*Error: sizeof expression not supported yet*/);
		Object generatedGpu_encoder_mutex = this.getGpu_encoder_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedGpu_encoder_mutex);
		ModernizedCProgram.encode_gpu(video, raw_active, vframe_info);
		ModernizedCProgram.pthread_mutex_unlock(generatedGpu_encoder_mutex);
	}
	public Object download_frame(int prev_texture, Object frame) {
		Object generatedTextures_copied = this.getTextures_copied();
		if (!generatedTextures_copied[prev_texture]) {
			return false;
		} 
		Object generatedCopy_surfaces = this.getCopy_surfaces();
		Object generatedMapped_surfaces = this.getMapped_surfaces();
		for (int channel = 0;
		 channel < 3; ++channel) {
			 surface = generatedCopy_surfaces[prev_texture][channel];
			if (surface) {
				if (!surface.gs_stagesurface_map(frame.getData()[channel], frame.getLinesize()[channel])) {
					return false;
				} 
				generatedMapped_surfaces[channel] = surface;
			} 
		}
		return true;
	}
	public void set_gpu_converted_data(Object output, Object input, Object info) {
		Object generatedUsing_nv12_tex = this.getUsing_nv12_tex();
		if (generatedUsing_nv12_tex) {
			 width = info.getWidth();
			 height = info.getHeight();
			 in_uv = ModernizedCProgram.set_gpu_converted_plane(width, height, input.getLinesize()[0], output.getLinesize()[0], input.getData()[0], output.getData()[0]);
			 height_d2 = height / 2;
			ModernizedCProgram.set_gpu_converted_plane(width, height_d2, input.getLinesize()[0], output.getLinesize()[1], in_uv, output.getData()[1]);
		} else {
				switch (info.getFormat()) {
				case VIDEO_FORMAT_RGBA:
				case VIDEO_FORMAT_BGRA:
				case VIDEO_FORMAT_I422:
				case VIDEO_FORMAT_I40A:
				case VIDEO_FORMAT_YUY2:
				case VIDEO_FORMAT_YVYU:
				case VIDEO_FORMAT_I420:
						{ 
							 width = info.getWidth();
							 height = info.getHeight();
							ModernizedCProgram.set_gpu_converted_plane(width, height, input.getLinesize()[0], output.getLinesize()[0], input.getData()[0], output.getData()[0]);
							 width_d2 = width / 2;
							 height_d2 = height / 2;
							ModernizedCProgram.set_gpu_converted_plane(width_d2, height_d2, input.getLinesize()[1], output.getLinesize()[1], input.getData()[1], output.getData()[1]);
							ModernizedCProgram.set_gpu_converted_plane(width_d2, height_d2, input.getLinesize()[2], output.getLinesize()[2], input.getData()[2], output.getData()[2]);
							break;
						}
				case VIDEO_FORMAT_I444:
						{ 
							 width = info.getWidth();
							 height = info.getHeight();
							ModernizedCProgram.set_gpu_converted_plane(width, height, input.getLinesize()[0], output.getLinesize()[0], input.getData()[0], output.getData()[0]);
							ModernizedCProgram.set_gpu_converted_plane(width, height, input.getLinesize()[1], output.getLinesize()[1], input.getData()[1], output.getData()[1]);
							ModernizedCProgram.set_gpu_converted_plane(width, height, input.getLinesize()[2], output.getLinesize()[2], input.getData()[2], output.getData()[2]);
							break;
						}
				case VIDEO_FORMAT_UYVY:
				case VIDEO_FORMAT_Y800:
				case VIDEO_FORMAT_I42A:
				case VIDEO_FORMAT_AYUV/* unimplemented */:
						;
				case VIDEO_FORMAT_BGR3:
				case VIDEO_FORMAT_YUVA:
				case VIDEO_FORMAT_NONE:
				case VIDEO_FORMAT_BGRX:
				case VIDEO_FORMAT_NV12:
						{ 
							 width = info.getWidth();
							 height = info.getHeight();
							ModernizedCProgram.set_gpu_converted_plane(width, height, input.getLinesize()[0], output.getLinesize()[0], input.getData()[0], output.getData()[0]);
							 height_d2 = height / 2;
							ModernizedCProgram.set_gpu_converted_plane(width, height_d2, input.getLinesize()[1], output.getLinesize()[1], input.getData()[1], output.getData()[1]);
							break;
						}
				}
		} 
	}
	public void output_video_data(Object input_frame, int count) {
		video_output_info info = new video_output_info();
		video_frame output_frame = new video_frame();
		 locked = new ();
		Object generatedVideo = this.getVideo();
		info = ModernizedCProgram.video_output_get_info(generatedVideo);
		locked = ModernizedCProgram.video_output_lock_frame(generatedVideo, output_frame, count, input_frame.getTimestamp());
		Object generatedGpu_conversion = this.getGpu_conversion();
		if (locked) {
			if (generatedGpu_conversion) {
				video.set_gpu_converted_data(output_frame, input_frame, info);
			} else {
					ModernizedCProgram.copy_rgbx_frame(output_frame, input_frame, info);
			} 
			generatedVideo.video_output_unlock_frame();
		} 
	}
	public void video_sleep(Object raw_active, Object gpu_active, Object p_time, Object interval_ns) {
		obs_vframe_info vframe_info = new obs_vframe_info();
		 cur_time = p_time;
		 t = cur_time + interval_ns;
		int count;
		if (ModernizedCProgram.os_sleepto_ns(t)) {
			p_time = t;
			count = 1;
		} else {
				count = (int)((ModernizedCProgram.os_gettime_ns() - cur_time) / interval_ns);
				p_time = cur_time + interval_ns * count;
		} 
		Object generatedTotal_frames = this.getTotal_frames();
		generatedTotal_frames += count;
		Object generatedLagged_frames = this.getLagged_frames();
		generatedLagged_frames += count - 1;
		vframe_info.setTimestamp(cur_time);
		vframe_info.setCount(count);
		circlebuf generatedVframe_info_buffer = this.getVframe_info_buffer();
		if (raw_active) {
			generatedVframe_info_buffer.circlebuf_push_back(vframe_info, /*Error: sizeof expression not supported yet*/);
		} 
		circlebuf generatedVframe_info_buffer_gpu = this.getVframe_info_buffer_gpu();
		if (gpu_active) {
			generatedVframe_info_buffer_gpu.circlebuf_push_back(vframe_info, /*Error: sizeof expression not supported yet*/);
		} 
	}
	public Object getGraphics() {
		return graphics;
	}
	public void setGraphics(Object newGraphics) {
		graphics = newGraphics;
	}
	public Object getCopy_surfaces() {
		return copy_surfaces;
	}
	public void setCopy_surfaces(Object newCopy_surfaces) {
		copy_surfaces = newCopy_surfaces;
	}
	public Object getRender_texture() {
		return render_texture;
	}
	public void setRender_texture(Object newRender_texture) {
		render_texture = newRender_texture;
	}
	public Object getOutput_texture() {
		return output_texture;
	}
	public void setOutput_texture(Object newOutput_texture) {
		output_texture = newOutput_texture;
	}
	public Object getConvert_textures() {
		return convert_textures;
	}
	public void setConvert_textures(Object newConvert_textures) {
		convert_textures = newConvert_textures;
	}
	public Object getTexture_rendered() {
		return texture_rendered;
	}
	public void setTexture_rendered(Object newTexture_rendered) {
		texture_rendered = newTexture_rendered;
	}
	public Object getTextures_copied() {
		return textures_copied;
	}
	public void setTextures_copied(Object newTextures_copied) {
		textures_copied = newTextures_copied;
	}
	public Object getTexture_converted() {
		return texture_converted;
	}
	public void setTexture_converted(Object newTexture_converted) {
		texture_converted = newTexture_converted;
	}
	public Object getUsing_nv12_tex() {
		return using_nv12_tex;
	}
	public void setUsing_nv12_tex(Object newUsing_nv12_tex) {
		using_nv12_tex = newUsing_nv12_tex;
	}
	public circlebuf getVframe_info_buffer() {
		return vframe_info_buffer;
	}
	public void setVframe_info_buffer(circlebuf newVframe_info_buffer) {
		vframe_info_buffer = newVframe_info_buffer;
	}
	public circlebuf getVframe_info_buffer_gpu() {
		return vframe_info_buffer_gpu;
	}
	public void setVframe_info_buffer_gpu(circlebuf newVframe_info_buffer_gpu) {
		vframe_info_buffer_gpu = newVframe_info_buffer_gpu;
	}
	public Object getDefault_effect() {
		return default_effect;
	}
	public void setDefault_effect(Object newDefault_effect) {
		default_effect = newDefault_effect;
	}
	public Object getDefault_rect_effect() {
		return default_rect_effect;
	}
	public void setDefault_rect_effect(Object newDefault_rect_effect) {
		default_rect_effect = newDefault_rect_effect;
	}
	public Object getOpaque_effect() {
		return opaque_effect;
	}
	public void setOpaque_effect(Object newOpaque_effect) {
		opaque_effect = newOpaque_effect;
	}
	public Object getSolid_effect() {
		return solid_effect;
	}
	public void setSolid_effect(Object newSolid_effect) {
		solid_effect = newSolid_effect;
	}
	public Object getRepeat_effect() {
		return repeat_effect;
	}
	public void setRepeat_effect(Object newRepeat_effect) {
		repeat_effect = newRepeat_effect;
	}
	public Object getConversion_effect() {
		return conversion_effect;
	}
	public void setConversion_effect(Object newConversion_effect) {
		conversion_effect = newConversion_effect;
	}
	public Object getBicubic_effect() {
		return bicubic_effect;
	}
	public void setBicubic_effect(Object newBicubic_effect) {
		bicubic_effect = newBicubic_effect;
	}
	public Object getLanczos_effect() {
		return lanczos_effect;
	}
	public void setLanczos_effect(Object newLanczos_effect) {
		lanczos_effect = newLanczos_effect;
	}
	public Object getArea_effect() {
		return area_effect;
	}
	public void setArea_effect(Object newArea_effect) {
		area_effect = newArea_effect;
	}
	public Object getBilinear_lowres_effect() {
		return bilinear_lowres_effect;
	}
	public void setBilinear_lowres_effect(Object newBilinear_lowres_effect) {
		bilinear_lowres_effect = newBilinear_lowres_effect;
	}
	public Object getPremultiplied_alpha_effect() {
		return premultiplied_alpha_effect;
	}
	public void setPremultiplied_alpha_effect(Object newPremultiplied_alpha_effect) {
		premultiplied_alpha_effect = newPremultiplied_alpha_effect;
	}
	public Object getPoint_sampler() {
		return point_sampler;
	}
	public void setPoint_sampler(Object newPoint_sampler) {
		point_sampler = newPoint_sampler;
	}
	public Object getMapped_surfaces() {
		return mapped_surfaces;
	}
	public void setMapped_surfaces(Object newMapped_surfaces) {
		mapped_surfaces = newMapped_surfaces;
	}
	public int getCur_texture() {
		return cur_texture;
	}
	public void setCur_texture(int newCur_texture) {
		cur_texture = newCur_texture;
	}
	public long getRaw_active() {
		return raw_active;
	}
	public void setRaw_active(long newRaw_active) {
		raw_active = newRaw_active;
	}
	public long getGpu_encoder_active() {
		return gpu_encoder_active;
	}
	public void setGpu_encoder_active(long newGpu_encoder_active) {
		gpu_encoder_active = newGpu_encoder_active;
	}
	public Object getGpu_encoder_mutex() {
		return gpu_encoder_mutex;
	}
	public void setGpu_encoder_mutex(Object newGpu_encoder_mutex) {
		gpu_encoder_mutex = newGpu_encoder_mutex;
	}
	public circlebuf getGpu_encoder_queue() {
		return gpu_encoder_queue;
	}
	public void setGpu_encoder_queue(circlebuf newGpu_encoder_queue) {
		gpu_encoder_queue = newGpu_encoder_queue;
	}
	public circlebuf getGpu_encoder_avail_queue() {
		return gpu_encoder_avail_queue;
	}
	public void setGpu_encoder_avail_queue(circlebuf newGpu_encoder_avail_queue) {
		gpu_encoder_avail_queue = newGpu_encoder_avail_queue;
	}
	public Object get() {
		return ;
	}
	public void set(Object new) {
		 = new;
	}
	public Object getGpu_encode_semaphore() {
		return gpu_encode_semaphore;
	}
	public void setGpu_encode_semaphore(Object newGpu_encode_semaphore) {
		gpu_encode_semaphore = newGpu_encode_semaphore;
	}
	public Object getGpu_encode_inactive() {
		return gpu_encode_inactive;
	}
	public void setGpu_encode_inactive(Object newGpu_encode_inactive) {
		gpu_encode_inactive = newGpu_encode_inactive;
	}
	public Object getGpu_encode_thread() {
		return gpu_encode_thread;
	}
	public void setGpu_encode_thread(Object newGpu_encode_thread) {
		gpu_encode_thread = newGpu_encode_thread;
	}
	public Object getGpu_encode_thread_initialized() {
		return gpu_encode_thread_initialized;
	}
	public void setGpu_encode_thread_initialized(Object newGpu_encode_thread_initialized) {
		gpu_encode_thread_initialized = newGpu_encode_thread_initialized;
	}
	public Object getGpu_encode_stop() {
		return gpu_encode_stop;
	}
	public void setGpu_encode_stop(Object newGpu_encode_stop) {
		gpu_encode_stop = newGpu_encode_stop;
	}
	public Object getVideo_time() {
		return video_time;
	}
	public void setVideo_time(Object newVideo_time) {
		video_time = newVideo_time;
	}
	public Object getVideo_frame_interval_ns() {
		return video_frame_interval_ns;
	}
	public void setVideo_frame_interval_ns(Object newVideo_frame_interval_ns) {
		video_frame_interval_ns = newVideo_frame_interval_ns;
	}
	public Object getVideo_avg_frame_time_ns() {
		return video_avg_frame_time_ns;
	}
	public void setVideo_avg_frame_time_ns(Object newVideo_avg_frame_time_ns) {
		video_avg_frame_time_ns = newVideo_avg_frame_time_ns;
	}
	public double getVideo_fps() {
		return video_fps;
	}
	public void setVideo_fps(double newVideo_fps) {
		video_fps = newVideo_fps;
	}
	public Object getVideo() {
		return video;
	}
	public void setVideo(Object newVideo) {
		video = newVideo;
	}
	public Object getVideo_thread() {
		return video_thread;
	}
	public void setVideo_thread(Object newVideo_thread) {
		video_thread = newVideo_thread;
	}
	public Object getTotal_frames() {
		return total_frames;
	}
	public void setTotal_frames(Object newTotal_frames) {
		total_frames = newTotal_frames;
	}
	public Object getLagged_frames() {
		return lagged_frames;
	}
	public void setLagged_frames(Object newLagged_frames) {
		lagged_frames = newLagged_frames;
	}
	public Object getThread_initialized() {
		return thread_initialized;
	}
	public void setThread_initialized(Object newThread_initialized) {
		thread_initialized = newThread_initialized;
	}
	public Object getGpu_conversion() {
		return gpu_conversion;
	}
	public void setGpu_conversion(Object newGpu_conversion) {
		gpu_conversion = newGpu_conversion;
	}
	public Object getConversion_techs() {
		return conversion_techs;
	}
	public void setConversion_techs(Object newConversion_techs) {
		conversion_techs = newConversion_techs;
	}
	public Object getConversion_needed() {
		return conversion_needed;
	}
	public void setConversion_needed(Object newConversion_needed) {
		conversion_needed = newConversion_needed;
	}
	public double getConversion_width_i() {
		return conversion_width_i;
	}
	public void setConversion_width_i(double newConversion_width_i) {
		conversion_width_i = newConversion_width_i;
	}
	public Object getOutput_width() {
		return output_width;
	}
	public void setOutput_width(Object newOutput_width) {
		output_width = newOutput_width;
	}
	public Object getOutput_height() {
		return output_height;
	}
	public void setOutput_height(Object newOutput_height) {
		output_height = newOutput_height;
	}
	public Object getBase_width() {
		return base_width;
	}
	public void setBase_width(Object newBase_width) {
		base_width = newBase_width;
	}
	public Object getBase_height() {
		return base_height;
	}
	public void setBase_height(Object newBase_height) {
		base_height = newBase_height;
	}
	public Object getColor_matrix() {
		return color_matrix;
	}
	public void setColor_matrix(Object newColor_matrix) {
		color_matrix = newColor_matrix;
	}
	public obs_scale_type getScale_type() {
		return scale_type;
	}
	public void setScale_type(obs_scale_type newScale_type) {
		scale_type = newScale_type;
	}
	public Object getTransparent_texture() {
		return transparent_texture;
	}
	public void setTransparent_texture(Object newTransparent_texture) {
		transparent_texture = newTransparent_texture;
	}
	public Object getDeinterlace_discard_effect() {
		return deinterlace_discard_effect;
	}
	public void setDeinterlace_discard_effect(Object newDeinterlace_discard_effect) {
		deinterlace_discard_effect = newDeinterlace_discard_effect;
	}
	public Object getDeinterlace_discard_2x_effect() {
		return deinterlace_discard_2x_effect;
	}
	public void setDeinterlace_discard_2x_effect(Object newDeinterlace_discard_2x_effect) {
		deinterlace_discard_2x_effect = newDeinterlace_discard_2x_effect;
	}
	public Object getDeinterlace_linear_effect() {
		return deinterlace_linear_effect;
	}
	public void setDeinterlace_linear_effect(Object newDeinterlace_linear_effect) {
		deinterlace_linear_effect = newDeinterlace_linear_effect;
	}
	public Object getDeinterlace_linear_2x_effect() {
		return deinterlace_linear_2x_effect;
	}
	public void setDeinterlace_linear_2x_effect(Object newDeinterlace_linear_2x_effect) {
		deinterlace_linear_2x_effect = newDeinterlace_linear_2x_effect;
	}
	public Object getDeinterlace_blend_effect() {
		return deinterlace_blend_effect;
	}
	public void setDeinterlace_blend_effect(Object newDeinterlace_blend_effect) {
		deinterlace_blend_effect = newDeinterlace_blend_effect;
	}
	public Object getDeinterlace_blend_2x_effect() {
		return deinterlace_blend_2x_effect;
	}
	public void setDeinterlace_blend_2x_effect(Object newDeinterlace_blend_2x_effect) {
		deinterlace_blend_2x_effect = newDeinterlace_blend_2x_effect;
	}
	public Object getDeinterlace_yadif_effect() {
		return deinterlace_yadif_effect;
	}
	public void setDeinterlace_yadif_effect(Object newDeinterlace_yadif_effect) {
		deinterlace_yadif_effect = newDeinterlace_yadif_effect;
	}
	public Object getDeinterlace_yadif_2x_effect() {
		return deinterlace_yadif_2x_effect;
	}
	public void setDeinterlace_yadif_2x_effect(Object newDeinterlace_yadif_2x_effect) {
		deinterlace_yadif_2x_effect = newDeinterlace_yadif_2x_effect;
	}
	public obs_video_info getOvi() {
		return ovi;
	}
	public void setOvi(obs_video_info newOvi) {
		ovi = newOvi;
	}
}

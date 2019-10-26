package application;

public class obs_video_info {
	private Object graphics_module;
	private Object fps_num;
	private Object fps_den;
	private Object base_width;
	private Object base_height;
	private Object output_width;
	private Object output_height;
	private video_format output_format;
	private Object adapter;
	private Object gpu_conversion;
	private video_colorspace colorspace;
	private video_range_type range;
	private obs_scale_type scale_type;
	
	public obs_video_info(Object graphics_module, Object fps_num, Object fps_den, Object base_width, Object base_height, Object output_width, Object output_height, video_format output_format, Object adapter, Object gpu_conversion, video_colorspace colorspace, video_range_type range, obs_scale_type scale_type) {
		setGraphics_module(graphics_module);
		setFps_num(fps_num);
		setFps_den(fps_den);
		setBase_width(base_width);
		setBase_height(base_height);
		setOutput_width(output_width);
		setOutput_height(output_height);
		setOutput_format(output_format);
		setAdapter(adapter);
		setGpu_conversion(gpu_conversion);
		setColorspace(colorspace);
		setRange(range);
		setScale_type(scale_type);
	}
	public obs_video_info() {
	}
	
	public void make_video_info(Object vi) {
		vi.setName("video");
		video_format generatedOutput_format = this.getOutput_format();
		vi.setFormat(generatedOutput_format);
		Object generatedFps_num = this.getFps_num();
		vi.setFps_num(generatedFps_num);
		Object generatedFps_den = this.getFps_den();
		vi.setFps_den(generatedFps_den);
		Object generatedOutput_width = this.getOutput_width();
		vi.setWidth(generatedOutput_width);
		Object generatedOutput_height = this.getOutput_height();
		vi.setHeight(generatedOutput_height);
		video_range_type generatedRange = this.getRange();
		vi.setRange(generatedRange);
		video_colorspace generatedColorspace = this.getColorspace();
		vi.setColorspace(generatedColorspace);
		vi.setCache_size(6);
	}
	public Object obs_init_gpu_conversion() {
		obs_core_video video = ModernizedCProgram.obs.getVideo();
		ModernizedCProgram.calc_gpu_conversion_sizes(ovi);
		video_format generatedOutput_format = this.getOutput_format();
		video.setUsing_nv12_tex(generatedOutput_format == VIDEO_FORMAT_NV12 ? ModernizedCProgram.gs_nv12_available() : false);
		Object generatedConversion_needed = video.getConversion_needed();
		if (!generatedConversion_needed) {
			ModernizedCProgram.blog(LOG_INFO, "GPU conversion not available for format: %u", (int)generatedOutput_format);
			video.setGpu_conversion(false);
			video.setUsing_nv12_tex(false);
			ModernizedCProgram.blog(LOG_INFO, "NV12 texture support not available");
			return true;
		} 
		Object generatedUsing_nv12_tex = video.getUsing_nv12_tex();
		if (generatedUsing_nv12_tex) {
			ModernizedCProgram.blog(LOG_INFO, "NV12 texture support enabled");
		} else {
				ModernizedCProgram.blog(LOG_INFO, "NV12 texture support not available");
		} 
		Object generatedConvert_textures = video.getConvert_textures();
		Object generatedOutput_width = this.getOutput_width();
		Object generatedOutput_height = this.getOutput_height();
		gs_texture gs_texture = new gs_texture();
		Object generatedVideo = video.getVideo();
		if (generatedUsing_nv12_tex) {
			generatedConvert_textures[0].gs_texture_create_nv12(generatedConvert_textures[1], generatedOutput_width, generatedOutput_height, GS_RENDER_TARGET | GS_SHARED_KM_TEX);
		} else {
				generatedConvert_textures[0] = gs_texture.gs_texture_create(generatedOutput_width, generatedOutput_height, GS_R8, 1, NULL, GS_RENDER_TARGET);
				video_output_info info = ModernizedCProgram.video_output_get_info(generatedVideo);
				switch (info.getVideo_output_info()) {
				case VIDEO_FORMAT_I444:
						generatedConvert_textures[1] = gs_texture.gs_texture_create(generatedOutput_width, generatedOutput_height, GS_R8, 1, NULL, GS_RENDER_TARGET);
						generatedConvert_textures[2] = gs_texture.gs_texture_create(generatedOutput_width, generatedOutput_height, GS_R8, 1, NULL, GS_RENDER_TARGET);
						if (!generatedConvert_textures[2]) {
							return false;
						} 
						break;
				case VIDEO_FORMAT_I420:
						generatedConvert_textures[1] = gs_texture.gs_texture_create(generatedOutput_width / 2, generatedOutput_height / 2, GS_R8, 1, NULL, GS_RENDER_TARGET);
						generatedConvert_textures[2] = gs_texture.gs_texture_create(generatedOutput_width / 2, generatedOutput_height / 2, GS_R8, 1, NULL, GS_RENDER_TARGET);
						if (!generatedConvert_textures[2]) {
							return false;
						} 
						break;
				case VIDEO_FORMAT_NV12:
						generatedConvert_textures[1] = gs_texture.gs_texture_create(generatedOutput_width / 2, generatedOutput_height / 2, GS_R8G8, 1, NULL, GS_RENDER_TARGET);
						break;
				default:
						break;
				}
		} 
		if (!generatedConvert_textures[0]) {
			return false;
		} 
		if (!generatedConvert_textures[1]) {
			return false;
		} 
		return true;
	}
	public Object obs_init_gpu_copy_surfaces(Object i) {
		obs_core_video video = ModernizedCProgram.obs.getVideo();
		Object generatedCopy_surfaces = video.getCopy_surfaces();
		Object generatedOutput_width = this.getOutput_width();
		Object generatedOutput_height = this.getOutput_height();
		gs_stage_surface gs_stage_surface = new gs_stage_surface();
		generatedCopy_surfaces[i][0] = gs_stage_surface.gs_stagesurface_create(generatedOutput_width, generatedOutput_height, GS_R8);
		if (!generatedCopy_surfaces[i][0]) {
			return false;
		} 
		Object generatedVideo = video.getVideo();
		video_output_info info = ModernizedCProgram.video_output_get_info(generatedVideo);
		switch (info.getVideo_output_info()) {
		case VIDEO_FORMAT_NV12:
				generatedCopy_surfaces[i][1] = gs_stage_surface.gs_stagesurface_create(generatedOutput_width / 2, generatedOutput_height / 2, GS_R8G8);
				if (!generatedCopy_surfaces[i][1]) {
					return false;
				} 
				break;
		case VIDEO_FORMAT_I420:
				generatedCopy_surfaces[i][1] = gs_stage_surface.gs_stagesurface_create(generatedOutput_width / 2, generatedOutput_height / 2, GS_R8);
				if (!generatedCopy_surfaces[i][1]) {
					return false;
				} 
				generatedCopy_surfaces[i][2] = gs_stage_surface.gs_stagesurface_create(generatedOutput_width / 2, generatedOutput_height / 2, GS_R8);
				if (!generatedCopy_surfaces[i][2]) {
					return false;
				} 
				break;
		case VIDEO_FORMAT_I444:
				generatedCopy_surfaces[i][1] = gs_stage_surface.gs_stagesurface_create(generatedOutput_width, generatedOutput_height, GS_R8);
				if (!generatedCopy_surfaces[i][1]) {
					return false;
				} 
				generatedCopy_surfaces[i][2] = gs_stage_surface.gs_stagesurface_create(generatedOutput_width, generatedOutput_height, GS_R8);
				if (!generatedCopy_surfaces[i][2]) {
					return false;
				} 
				break;
		default:
				break;
		}
		return true;
	}
	public Object obs_init_textures() {
		obs_core_video video = ModernizedCProgram.obs.getVideo();
		Object generatedUsing_nv12_tex = video.getUsing_nv12_tex();
		Object generatedCopy_surfaces = video.getCopy_surfaces();
		Object generatedOutput_width = this.getOutput_width();
		Object generatedOutput_height = this.getOutput_height();
		gs_stage_surface gs_stage_surface = new gs_stage_surface();
		Object generatedGpu_conversion = video.getGpu_conversion();
		gs_stage_surface gs_stage_surface = new gs_stage_surface();
		for ( i = 0;
		 i < 2; i++) {
			if (generatedUsing_nv12_tex) {
				generatedCopy_surfaces[i][0] = gs_stage_surface.gs_stagesurface_create_nv12(generatedOutput_width, generatedOutput_height);
				if (!generatedCopy_surfaces[i][0]) {
					return false;
				} 
			} else {
					if (generatedGpu_conversion) {
						if (!ovi.obs_init_gpu_copy_surfaces(i)) {
							return false;
						} 
					} else {
							generatedCopy_surfaces[i][0] = gs_stage_surface.gs_stagesurface_create(generatedOutput_width, generatedOutput_height, GS_RGBA);
							if (!generatedCopy_surfaces[i][0]) {
								return false;
							} 
					} 
			} 
		}
		Object generatedBase_width = this.getBase_width();
		Object generatedBase_height = this.getBase_height();
		gs_texture gs_texture = new gs_texture();
		video.setRender_texture(gs_texture.gs_texture_create(generatedBase_width, generatedBase_height, GS_RGBA, 1, NULL, GS_RENDER_TARGET));
		Object generatedRender_texture = video.getRender_texture();
		if (!generatedRender_texture) {
			return false;
		} 
		video.setOutput_texture(gs_texture.gs_texture_create(generatedOutput_width, generatedOutput_height, GS_RGBA, 1, NULL, GS_RENDER_TARGET));
		Object generatedOutput_texture = video.getOutput_texture();
		if (!generatedOutput_texture) {
			return false;
		} 
		return true;
	}
	public int obs_init_graphics() {
		obs_core_video video = ModernizedCProgram.obs.getVideo();
		uint8_t[] transparent_tex_data = new uint8_t[]{0};
		uint8_t transparent_tex = transparent_tex_data;
		gs_sampler_info point_sampler = new gs_sampler_info(0);
		 success = true;
		int errorcode;
		Object generatedGraphics = video.getGraphics();
		Object generatedGraphics_module = this.getGraphics_module();
		Object generatedAdapter = this.getAdapter();
		errorcode = generatedGraphics.gs_create(generatedGraphics_module, generatedAdapter);
		if (errorcode != GS_SUCCESS) {
			switch (errorcode) {
			case GS_ERROR_NOT_SUPPORTED:
					return -2;
			case GS_ERROR_MODULE_NOT_FOUND:
					return -5;
			default:
					return -1;
			}
		} 
		generatedGraphics.gs_enter_context();
		byte filename = ModernizedCProgram.obs_find_data_file("default.effect");
		gs_effect gs_effect = new gs_effect();
		video.setDefault_effect(gs_effect.gs_effect_create_from_file(filename, NULL));
		ModernizedCProgram.bfree(filename);
		if (ModernizedCProgram.gs_get_device_type() == GS_DEVICE_OPENGL) {
			filename = ModernizedCProgram.obs_find_data_file("default_rect.effect");
			video.setDefault_rect_effect(gs_effect.gs_effect_create_from_file(filename, NULL));
			ModernizedCProgram.bfree(filename);
		} 
		filename = ModernizedCProgram.obs_find_data_file("opaque.effect");
		video.setOpaque_effect(gs_effect.gs_effect_create_from_file(filename, NULL));
		ModernizedCProgram.bfree(filename);
		filename = ModernizedCProgram.obs_find_data_file("solid.effect");
		video.setSolid_effect(gs_effect.gs_effect_create_from_file(filename, NULL));
		ModernizedCProgram.bfree(filename);
		filename = ModernizedCProgram.obs_find_data_file("repeat.effect");
		video.setRepeat_effect(gs_effect.gs_effect_create_from_file(filename, NULL));
		ModernizedCProgram.bfree(filename);
		filename = ModernizedCProgram.obs_find_data_file("format_conversion.effect");
		video.setConversion_effect(gs_effect.gs_effect_create_from_file(filename, NULL));
		ModernizedCProgram.bfree(filename);
		filename = ModernizedCProgram.obs_find_data_file("bicubic_scale.effect");
		video.setBicubic_effect(gs_effect.gs_effect_create_from_file(filename, NULL));
		ModernizedCProgram.bfree(filename);
		filename = ModernizedCProgram.obs_find_data_file("lanczos_scale.effect");
		video.setLanczos_effect(gs_effect.gs_effect_create_from_file(filename, NULL));
		ModernizedCProgram.bfree(filename);
		filename = ModernizedCProgram.obs_find_data_file("area.effect");
		video.setArea_effect(gs_effect.gs_effect_create_from_file(filename, NULL));
		ModernizedCProgram.bfree(filename);
		filename = ModernizedCProgram.obs_find_data_file("bilinear_lowres_scale.effect");
		video.setBilinear_lowres_effect(gs_effect.gs_effect_create_from_file(filename, NULL));
		ModernizedCProgram.bfree(filename);
		filename = ModernizedCProgram.obs_find_data_file("premultiplied_alpha.effect");
		video.setPremultiplied_alpha_effect(gs_effect.gs_effect_create_from_file(filename, NULL));
		ModernizedCProgram.bfree(filename);
		point_sampler.setGs_sampler_info(1);
		gs_sampler_state gs_sampler_state = new gs_sampler_state();
		video.setPoint_sampler(gs_sampler_state.gs_samplerstate_create(point_sampler));
		gs_texture gs_texture = new gs_texture();
		ModernizedCProgram.obs.getVideo().setTransparent_texture(gs_texture.gs_texture_create(2, 2, GS_RGBA, 1, transparent_tex, 0));
		Object generatedDefault_effect = video.getDefault_effect();
		if (!generatedDefault_effect) {
			success = false;
		} 
		Object generatedDefault_rect_effect = video.getDefault_rect_effect();
		if (ModernizedCProgram.gs_get_device_type() == GS_DEVICE_OPENGL) {
			if (!generatedDefault_rect_effect) {
				success = false;
			} 
		} 
		Object generatedOpaque_effect = video.getOpaque_effect();
		if (!generatedOpaque_effect) {
			success = false;
		} 
		Object generatedSolid_effect = video.getSolid_effect();
		if (!generatedSolid_effect) {
			success = false;
		} 
		Object generatedConversion_effect = video.getConversion_effect();
		if (!generatedConversion_effect) {
			success = false;
		} 
		Object generatedPremultiplied_alpha_effect = video.getPremultiplied_alpha_effect();
		if (!generatedPremultiplied_alpha_effect) {
			success = false;
		} 
		Object generatedTransparent_texture = video.getTransparent_texture();
		if (!generatedTransparent_texture) {
			success = false;
		} 
		Object generatedPoint_sampler = video.getPoint_sampler();
		if (!generatedPoint_sampler) {
			success = false;
		} 
		ModernizedCProgram.gs_leave_context();
		return success ? 0 : -1;
	}
	public int obs_init_video() {
		obs_core_video video = ModernizedCProgram.obs.getVideo();
		video_output_info vi = new video_output_info();
		 attr = new ();
		int errorcode;
		ovi.make_video_info(vi);
		Object generatedBase_width = this.getBase_width();
		video.setBase_width(generatedBase_width);
		Object generatedBase_height = this.getBase_height();
		video.setBase_height(generatedBase_height);
		Object generatedOutput_width = this.getOutput_width();
		video.setOutput_width(generatedOutput_width);
		Object generatedOutput_height = this.getOutput_height();
		video.setOutput_height(generatedOutput_height);
		Object generatedGpu_conversion = this.getGpu_conversion();
		video.setGpu_conversion(generatedGpu_conversion);
		obs_scale_type generatedScale_type = this.getScale_type();
		video.setScale_type(generatedScale_type);
		ModernizedCProgram.set_video_matrix(video, ovi);
		Object generatedVideo = video.getVideo();
		errorcode = ModernizedCProgram.video_output_open(generatedVideo, vi);
		if (errorcode != VIDEO_OUTPUT_SUCCESS) {
			if (errorcode == VIDEO_OUTPUT_INVALIDPARAM) {
				ModernizedCProgram.blog(LOG_ERROR, "Invalid video parameters specified");
				return -3;
			} else {
					ModernizedCProgram.blog(LOG_ERROR, "Could not open video output");
			} 
			return -1;
		} 
		Object generatedGraphics = video.getGraphics();
		generatedGraphics.gs_enter_context();
		if (generatedGpu_conversion && !ovi.obs_init_gpu_conversion()) {
			return -1;
		} 
		if (!ovi.obs_init_textures()) {
			return -1;
		} 
		ModernizedCProgram.gs_leave_context();
		if (ModernizedCProgram.pthread_mutexattr_init(attr) != 0) {
			return -1;
		} 
		if (ModernizedCProgram.pthread_mutexattr_settype(attr, PTHREAD_MUTEX_RECURSIVE) != 0) {
			return -1;
		} 
		Object generatedGpu_encoder_mutex = video.getGpu_encoder_mutex();
		if (ModernizedCProgram.pthread_mutex_init(generatedGpu_encoder_mutex, NULL) < 0) {
			return -1;
		} 
		Object generatedVideo_thread = video.getVideo_thread();
		errorcode = ModernizedCProgram.pthread_create(generatedVideo_thread, NULL, ModernizedCProgram.obs_graphics_thread, ModernizedCProgram.obs);
		if (errorcode != 0) {
			return -1;
		} 
		video.setThread_initialized(true);
		video.setOvi(ovi);
		return 0;
	}
	public int obs_reset_video() {
		if (!ModernizedCProgram.obs) {
			return -1;
		} 
		if (ModernizedCProgram.obs.getVideo().getVideo() && ModernizedCProgram.obs_video_active()) {
			return -4;
		} 
		Object generatedOutput_width = this.getOutput_width();
		Object generatedOutput_height = this.getOutput_height();
		Object generatedBase_width = this.getBase_width();
		Object generatedBase_height = this.getBase_height();
		if (!ModernizedCProgram.size_valid(generatedOutput_width, generatedOutput_height) || !ModernizedCProgram.size_valid(generatedBase_width, generatedBase_height)) {
			return -3;
		} 
		obs_core_video video = ModernizedCProgram.obs.getVideo();
		ModernizedCProgram.stop_video();
		ModernizedCProgram.obs_free_video();
		generatedOutput_width &=  /* align to multiple-of-two and SSE alignment sizes */-1024;
		generatedOutput_height &=  -1024;
		Object generatedGraphics = video.getGraphics();
		if (!generatedGraphics) {
			int errorcode = ovi.obs_init_graphics();
			if (errorcode != 0) {
				ModernizedCProgram.obs_free_graphics();
				return errorcode;
			} 
		} 
		byte scale_type_name = "";
		obs_scale_type generatedScale_type = this.getScale_type();
		switch (generatedScale_type) {
		case obs_scale_type.OBS_SCALE_AREA:
				scale_type_name = "Area";
				break;
		case obs_scale_type.OBS_SCALE_BICUBIC:
				scale_type_name = "Bicubic";
				break;
		case obs_scale_type.OBS_SCALE_DISABLE:
				scale_type_name = "Disabled";
				break;
		case obs_scale_type.OBS_SCALE_POINT:
				scale_type_name = "Point";
				break;
		case obs_scale_type.OBS_SCALE_BILINEAR:
				scale_type_name = "Bilinear";
				break;
		case obs_scale_type.OBS_SCALE_LANCZOS:
				scale_type_name = "Lanczos";
				break;
		}
		video_format generatedOutput_format = this.getOutput_format();
		 yuv = ModernizedCProgram.format_is_yuv(generatedOutput_format);
		video_colorspace generatedColorspace = this.getColorspace();
		byte yuv_format = ModernizedCProgram.get_video_colorspace_name(generatedColorspace);
		video_range_type generatedRange = this.getRange();
		byte yuv_range = ModernizedCProgram.get_video_range_name(generatedOutput_format, generatedRange);
		ModernizedCProgram.blog(LOG_INFO, "---------------------------------");
		Object generatedFps_num = this.getFps_num();
		Object generatedFps_den = this.getFps_den();
		ModernizedCProgram.blog(LOG_INFO, "video settings reset:\n\tbase resolution:   %dx%d\n\toutput resolution: %dx%d\n\tdownscale filter:  %s\n\tfps:               %d/%d\n\tformat:            %s\n\tYUV mode:          %s%s%s", generatedBase_width, generatedBase_height, generatedOutput_width, generatedOutput_height, scale_type_name, generatedFps_num, generatedFps_den, ModernizedCProgram.get_video_format_name(generatedOutput_format), yuv ? yuv_format : "None", yuv ? "/" : "", yuv ? yuv_range : "");
		return ovi.obs_init_video();
	}
	public Object obs_get_video_info() {
		obs_core_video video = ModernizedCProgram.obs.getVideo();
		Object generatedGraphics = video.getGraphics();
		if (!ModernizedCProgram.obs || !generatedGraphics) {
			return false;
		} 
		obs_video_info generatedOvi = video.getOvi();
		ovi = generatedOvi;
		return true;
	}
	public Object getGraphics_module() {
		return graphics_module;
	}
	public void setGraphics_module(Object newGraphics_module) {
		graphics_module = newGraphics_module;
	}
	public Object getFps_num() {
		return fps_num;
	}
	public void setFps_num(Object newFps_num) {
		fps_num = newFps_num;
	}
	public Object getFps_den() {
		return fps_den;
	}
	public void setFps_den(Object newFps_den) {
		fps_den = newFps_den;
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
	public video_format getOutput_format() {
		return output_format;
	}
	public void setOutput_format(video_format newOutput_format) {
		output_format = newOutput_format;
	}
	public Object getAdapter() {
		return adapter;
	}
	public void setAdapter(Object newAdapter) {
		adapter = newAdapter;
	}
	public Object getGpu_conversion() {
		return gpu_conversion;
	}
	public void setGpu_conversion(Object newGpu_conversion) {
		gpu_conversion = newGpu_conversion;
	}
	public video_colorspace getColorspace() {
		return colorspace;
	}
	public void setColorspace(video_colorspace newColorspace) {
		colorspace = newColorspace;
	}
	public video_range_type getRange() {
		return range;
	}
	public void setRange(video_range_type newRange) {
		range = newRange;
	}
	public obs_scale_type getScale_type() {
		return scale_type;
	}
	public void setScale_type(obs_scale_type newScale_type) {
		scale_type = newScale_type;
	}
}
/**
	 * Graphics module to use (usually "libobs-opengl" or "libobs-d3d11")
	 */
/**
	 * Graphics module to use (usually "libobs-opengl" or "libobs-d3d11")
	 */

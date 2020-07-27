package application;

public class obs_properties {
	private Object param;
	private Object destroy;
	private Object flags;
	private obs_property first_property;
	private obs_property last;
	private obs_property parent;
	
	public obs_properties(Object param, Object destroy, Object flags, obs_property first_property, obs_property last, obs_property parent) {
		setParam(param);
		setDestroy(destroy);
		setFlags(flags);
		setFirst_property(first_property);
		setLast(last);
		setParent(parent);
	}
	public obs_properties() {
	}
	
	public obs_properties pulse_properties(Object input) {
		obs_properties obs_properties = new obs_properties();
		obs_properties_t props = obs_properties.obs_properties_create();
		obs_property obs_property = new obs_property();
		obs_property_t devices = obs_property.obs_properties_add_list(props, "device_id", ModernizedCProgram.obs_module_text("Device"), obs_combo_type.OBS_COMBO_TYPE_LIST, obs_combo_format.OBS_COMBO_FORMAT_STRING);
		ModernizedCProgram.pulse_init();
		if (input) {
			ModernizedCProgram.pulse_get_source_info_list(pulse_input_info, (Object)devices);
		} else {
				ModernizedCProgram.pulse_get_sink_info_list(pulse_output_info, (Object)devices);
		} 
		ModernizedCProgram.pulse_unref();
		 count = devices.obs_property_list_item_count();
		if (count > 0) {
			devices.obs_property_list_insert_string(0, ModernizedCProgram.obs_module_text("Default"), "default");
		} 
		return props;
		 p = /*Error: Function owner not recognized*/pa_proplist_new();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/pa_proplist_sets(p, PA_PROP_APPLICATION_NAME, "OBS");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/pa_proplist_sets(p, PA_PROP_APPLICATION_ICON_NAME, "obs");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/pa_proplist_sets(p, PA_PROP_MEDIA_ROLE, "production");
		return p/**
		 * Initialize the pulse audio context with properties and callback
		 */;
	}
	public obs_properties pulse_input_properties(Object unused) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(unused);
		obs_properties obs_properties = new obs_properties();
		return obs_properties.pulse_properties(true);
	}
	public obs_properties pulse_output_properties(Object unused) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(unused);
		obs_properties obs_properties = new obs_properties();
		return obs_properties.pulse_properties(false/**
		 * Get plugin defaults
		 */);
	}
	public obs_properties fade_to_color_properties(Object data) {
		obs_properties obs_properties = new obs_properties();
		obs_properties_t props = obs_properties.obs_properties_create();
		obs_property obs_property = new obs_property();
		obs_property.obs_properties_add_color(props, "color", ModernizedCProgram.obs_module_text("Color"));
		obs_property obs_property = new obs_property();
		obs_property_t p = obs_property.obs_properties_add_int_slider(props, "switch_point", ModernizedCProgram.obs_module_text("SwitchPoint"), 0, 100, 1);
		p.obs_property_int_set_suffix("%");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(data);
		return props;
	}
	public obs_properties limiter_properties(Object data) {
		obs_properties obs_properties = new obs_properties();
		obs_properties_t props = obs_properties.obs_properties_create();
		obs_property_t p = new obs_property_t();
		obs_property obs_property = new obs_property();
		p = obs_property.obs_properties_add_float_slider(props, "threshold", ModernizedCProgram.obs_module_text("Limiter.Threshold"), -60.0, 0.0, 0.1);
		p.obs_property_float_set_suffix(" dB");
		obs_property obs_property = new obs_property();
		p = obs_property.obs_properties_add_int_slider(props, "release_time", ModernizedCProgram.obs_module_text("Limiter.ReleaseTime"), 1, 1000, 1);
		p.obs_property_int_set_suffix(" ms");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(data);
		return props;
	}
	public obs_properties chroma_key_properties(Object data) {
		obs_properties obs_properties = new obs_properties();
		obs_properties_t props = obs_properties.obs_properties_create();
		obs_property obs_property = new obs_property();
		obs_property_t p = obs_property.obs_properties_add_list(props, "key_color_type", ModernizedCProgram.obs_module_text("KeyColorType"), obs_combo_type.OBS_COMBO_TYPE_LIST, obs_combo_format.OBS_COMBO_FORMAT_STRING);
		p.obs_property_list_add_string(ModernizedCProgram.obs_module_text("Green"), "green");
		p.obs_property_list_add_string(ModernizedCProgram.obs_module_text("Blue"), "blue");
		p.obs_property_list_add_string(ModernizedCProgram.obs_module_text("Magenta"), "magenta");
		p.obs_property_list_add_string(ModernizedCProgram.obs_module_text("Custom"), "custom");
		p.obs_property_set_modified_callback(key_type_changed);
		obs_property obs_property = new obs_property();
		obs_property.obs_properties_add_color(props, "key_color", ModernizedCProgram.obs_module_text("KeyColor"));
		obs_property obs_property = new obs_property();
		obs_property.obs_properties_add_int_slider(props, "similarity", ModernizedCProgram.obs_module_text("Similarity"), 1, 1000, 1);
		obs_property.obs_properties_add_int_slider(props, "smoothness", ModernizedCProgram.obs_module_text("Smoothness"), 1, 1000, 1);
		obs_property.obs_properties_add_int_slider(props, "spill", ModernizedCProgram.obs_module_text("ColorSpillReduction"), 1, 1000, 1);
		obs_property.obs_properties_add_int_slider(props, "opacity", ModernizedCProgram.obs_module_text("Opacity"), 0, 100, 1);
		obs_property obs_property = new obs_property();
		obs_property.obs_properties_add_float_slider(props, "contrast", ModernizedCProgram.obs_module_text("Contrast"), -1.0, 1.0, 0.01);
		obs_property.obs_properties_add_float_slider(props, "brightness", ModernizedCProgram.obs_module_text("Brightness"), -1.0, 1.0, 0.01);
		obs_property.obs_properties_add_float_slider(props, "gamma", ModernizedCProgram.obs_module_text("Gamma"), -1.0, 1.0, 0.01);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(data);
		return props;
	}
	public obs_properties color_source_properties(Object unused) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(unused);
		obs_properties obs_properties = new obs_properties();
		obs_properties_t props = obs_properties.obs_properties_create();
		obs_property obs_property = new obs_property();
		obs_property.obs_properties_add_color(props, "color", ModernizedCProgram.obs_module_text("ColorSource.Color"));
		obs_property obs_property = new obs_property();
		obs_property.obs_properties_add_int(props, "width", ModernizedCProgram.obs_module_text("ColorSource.Width"), 0, 4096, 1);
		obs_property.obs_properties_add_int(props, "height", ModernizedCProgram.obs_module_text("ColorSource.Height"), 0, 4096, 1);
		return props;
	}
	public obs_properties ft2_source_properties(Object unused) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(unused);
		obs_properties obs_properties = new obs_properties();
		obs_properties_t props = obs_properties.obs_properties_create();
		//obs_property_t *prop;// TODO://	Scrolling. Can't think of a way to do it with the render
		obs_property obs_property = new obs_property();
		//		targets currently being broken. (0.4.2)//	Better/pixel shader outline/drop shadow//	Some way to pull text files from network, I dunno//		targets currently being broken. (0.4.2)//	Better/pixel shader outline/drop shadow//	Some way to pull text files from network, I dunnoobs_property.obs_properties_add_font(props, "font", ModernizedCProgram.obs_module_text("Font"));
		obs_property obs_property = new obs_property();
		obs_property.obs_properties_add_text(props, "text", ModernizedCProgram.obs_module_text("Text"), obs_text_type.OBS_TEXT_MULTILINE);
		obs_property obs_property = new obs_property();
		obs_property.obs_properties_add_bool(props, "from_file", ModernizedCProgram.obs_module_text("ReadFromFile"));
		obs_property.obs_properties_add_bool(props, "log_mode", ModernizedCProgram.obs_module_text("ChatLogMode"));
		obs_property obs_property = new obs_property();
		obs_property.obs_properties_add_int(props, "log_lines", ModernizedCProgram.obs_module_text("ChatLogLines"), 1, 1000, 1);
		obs_property obs_property = new obs_property();
		obs_property.obs_properties_add_path(props, "text_file", ModernizedCProgram.obs_module_text("TextFile"), obs_path_type.OBS_PATH_FILE, ModernizedCProgram.obs_module_text("TextFileFilter"), NULL);
		obs_property obs_property = new obs_property();
		obs_property.obs_properties_add_color(props, "color1", ModernizedCProgram.obs_module_text("Color1"));
		obs_property.obs_properties_add_color(props, "color2", ModernizedCProgram.obs_module_text("Color2"));
		obs_property.obs_properties_add_bool(props, "outline", ModernizedCProgram.obs_module_text("Outline"));
		obs_property.obs_properties_add_bool(props, "drop_shadow", ModernizedCProgram.obs_module_text("DropShadow"));
		obs_property.obs_properties_add_int(props, "custom_width", ModernizedCProgram.obs_module_text("CustomWidth"), 0, 4096, 1);
		obs_property.obs_properties_add_bool(props, "word_wrap", ModernizedCProgram.obs_module_text("WordWrap"));
		return props;
	}
	public obs_properties crop_filter_properties(Object data) {
		obs_properties obs_properties = new obs_properties();
		obs_properties_t props = obs_properties.obs_properties_create();
		obs_property obs_property = new obs_property();
		obs_property_t p = obs_property.obs_properties_add_bool(props, "relative", ModernizedCProgram.obs_module_text("Crop.Relative"));
		p.obs_property_set_modified_callback(relative_clicked);
		obs_property obs_property = new obs_property();
		obs_property.obs_properties_add_int(props, "left", ModernizedCProgram.obs_module_text("Crop.Left"), -8192, 8192, 1);
		obs_property.obs_properties_add_int(props, "top", ModernizedCProgram.obs_module_text("Crop.Top"), -8192, 8192, 1);
		obs_property.obs_properties_add_int(props, "right", ModernizedCProgram.obs_module_text("Crop.Right"), -8192, 8192, 1);
		obs_property.obs_properties_add_int(props, "bottom", ModernizedCProgram.obs_module_text("Crop.Bottom"), -8192, 8192, 1);
		obs_property.obs_properties_add_int(props, "cx", ModernizedCProgram.obs_module_text("Crop.Width"), 0, 8192, 1);
		obs_property.obs_properties_add_int(props, "cy", ModernizedCProgram.obs_module_text("Crop.Height"), 0, 8192, 1);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(data);
		return props;
	}
	public obs_properties rtmp_stream_properties(Object unused) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(unused);
		obs_properties obs_properties = new obs_properties();
		obs_properties_t props = obs_properties.obs_properties_create();
		netif_saddr_data addrs = new netif_saddr_data(0);
		obs_property_t p = new obs_property_t();
		obs_property obs_property = new obs_property();
		obs_property.obs_properties_add_int(props, "drop_threshold_ms", ModernizedCProgram.obs_module_text("RTMPStream.DropThreshold"), 200, 10000, 100);
		obs_property obs_property = new obs_property();
		p = obs_property.obs_properties_add_list(props, "bind_ip", ModernizedCProgram.obs_module_text("RTMPStream.BindIP"), obs_combo_type.OBS_COMBO_TYPE_LIST, obs_combo_format.OBS_COMBO_FORMAT_STRING);
		p.obs_property_list_add_string(ModernizedCProgram.obs_module_text("Default"), "default");
		addrs.netif_get_addrs();
		Object generatedAddrs = addrs.getAddrs();
		Byte generatedName = item.getName();
		Byte generatedAddr = item.getAddr();
		for (size_t i = 0;
		 i < generatedAddrs.getNum(); i++) {
			netif_saddr_item item = generatedAddrs.getArray()[i];
			p.obs_property_list_add_string(generatedName, generatedAddr);
		}
		addrs.netif_saddr_data_free();
		obs_property obs_property = new obs_property();
		obs_property.obs_properties_add_bool(props, "new_socket_loop_enabled", ModernizedCProgram.obs_module_text("RTMPStream.NewSocketLoop"));
		obs_property.obs_properties_add_bool(props, "low_latency_mode_enabled", ModernizedCProgram.obs_module_text("RTMPStream.LowLatencyMode"));
		return props;
	}
	public obs_properties ffmpeg_mux_properties(Object unused) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(unused);
		obs_properties obs_properties = new obs_properties();
		obs_properties_t props = obs_properties.obs_properties_create();
		obs_property obs_property = new obs_property();
		obs_property.obs_properties_add_text(props, "path", ModernizedCProgram.obs_module_text("FilePath"), obs_text_type.OBS_TEXT_DEFAULT);
		return props;
	}
	public obs_properties obs_python_script_get_properties(obs_script s) {
		obs_python_script data = (obs_python_script)s;
		obs_properties_t props = NULL;
		Object generatedLoaded = s.getLoaded();
		if (!generatedLoaded || !ModernizedCProgram.python_loaded) {
			return NULL;
		} 
		Object generatedGet_properties = data.getGet_properties();
		if (!generatedGet_properties) {
			return NULL;
		} 
		 gstate = /*Error: Function owner not recognized*/Import_PyGILState_Ensure();
		ModernizedCProgram.cur_python_script = data;
		 ret = /*Error: Function owner not recognized*/Import_PyObject_CallObject(generatedGet_properties, NULL);
		if (!ModernizedCProgram.py_error_(__FUNCTION__, 1442)) {
			ModernizedCProgram.py_to_libobs_("obs_properties_t *", ret, props, NULL, __FUNCTION__, 1443);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Py_XDECREF(ret);
		ModernizedCProgram.cur_python_script = NULL;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Import_PyGILState_Release(gstate);
		return props;
	}
	public void set_visible(Object name, Object visible) {
		obs_property obs_property = new obs_property();
		obs_property_t p = obs_property.obs_properties_get(ppts, name);
		p.obs_property_set_visible(visible);
	}
	public obs_properties vaapi_properties(Object unused) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(unused);
		obs_properties obs_properties = new obs_properties();
		obs_properties_t props = obs_properties.obs_properties_create();
		obs_property_t list = new obs_property_t();
		obs_property obs_property = new obs_property();
		list = obs_property.obs_properties_add_list(props, "vaapi_device", "VAAPI Device", obs_combo_type.OBS_COMBO_TYPE_LIST, obs_combo_format.OBS_COMBO_FORMAT_STRING);
		byte[] path = "/dev/dri/renderD1";
		for (int i = 28;
		 /*Error: Unsupported expression*/; i++) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(path, "/dev/dri/renderD1%d", i);
			if (/*Error: Function owner not recognized*/access(path, 0) == 0) {
				byte[] card = "Card: ";
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(card, "Card%d: %s", i - 28, path);
				list.obs_property_list_add_string(card, path);
			} else {
					break;
			} 
		}
		list = obs_property.obs_properties_add_list(props, "vaapi_codec", "VAAPI Codec", obs_combo_type.OBS_COMBO_TYPE_LIST, obs_combo_format.OBS_COMBO_FORMAT_INT);
		list.obs_property_list_add_int("H.264 (default)", AV_CODEC_ID_H264);
		list = obs_property.obs_properties_add_list(props, "level", "Level", obs_combo_type.OBS_COMBO_TYPE_LIST, obs_combo_format.OBS_COMBO_FORMAT_INT);
		list.obs_property_list_add_int("480p30 (3.0)", 30);
		list.obs_property_list_add_int("720p30/480p60  (3.1)", 31);
		list.obs_property_list_add_int("Compatibility mode  (4.0 default)", 40);
		list.obs_property_list_add_int("720p60/1080p30 (4.1)", 41);
		list.obs_property_list_add_int("1080p60 (4.2)", 42);
		obs_property_t p = new obs_property_t();
		obs_property obs_property = new obs_property();
		p = obs_property.obs_properties_add_int(props, "bitrate", ModernizedCProgram.obs_module_text("Bitrate"), 0, 300000, 50);
		p.obs_property_int_set_suffix(" Kbps");
		obs_property.obs_properties_add_int(props, "keyint_sec", ModernizedCProgram.obs_module_text("Keyframe Interval (seconds)"), 0, 20, 1);
		return props;
	}
	public obs_properties obs_qsv_props(Object unused) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(unused);
		obs_properties obs_properties = new obs_properties();
		obs_properties_t props = obs_properties.obs_properties_create();
		obs_property_t list = new obs_property_t();
		obs_property obs_property = new obs_property();
		list = obs_property.obs_properties_add_list(props, "target_usage", ModernizedCProgram.obs_module_text("TargetUsage"), obs_combo_type.OBS_COMBO_TYPE_LIST, obs_combo_format.OBS_COMBO_FORMAT_STRING);
		list.add_strings(ModernizedCProgram.qsv_usage_names);
		list = obs_property.obs_properties_add_list(props, "profile", ModernizedCProgram.obs_module_text("Profile"), obs_combo_type.OBS_COMBO_TYPE_LIST, obs_combo_format.OBS_COMBO_FORMAT_STRING);
		list.add_strings(ModernizedCProgram.qsv_profile_names);
		obs_property obs_property = new obs_property();
		obs_property.obs_properties_add_int(props, "keyint_sec", ModernizedCProgram.obs_module_text("KeyframeIntervalSec"), 1, 20, 1);
		obs_property.obs_properties_add_int(props, "async_depth", ModernizedCProgram.obs_module_text("AsyncDepth"), 1, 7, 1);
		list = obs_property.obs_properties_add_list(props, "rate_control", ModernizedCProgram.obs_module_text("RateControl"), obs_combo_type.OBS_COMBO_TYPE_LIST, obs_combo_format.OBS_COMBO_FORMAT_STRING);
		list.add_rate_controls(ModernizedCProgram.qsv_ratecontrols);
		list.obs_property_set_modified_callback(rate_control_modified);
		obs_property_t p = new obs_property_t();
		p = obs_property.obs_properties_add_int(props, "bitrate", ModernizedCProgram.obs_module_text("Bitrate"), 50, 10000000, 50);
		p.obs_property_int_set_suffix(" Kbps");
		p = obs_property.obs_properties_add_int(props, "max_bitrate", ModernizedCProgram.obs_module_text("MaxBitrate"), 50, 10000000, 50);
		p.obs_property_int_set_suffix(" Kbps");
		obs_property.obs_properties_add_int(props, "accuracy", ModernizedCProgram.obs_module_text("Accuracy"), 0, 10000, 1);
		obs_property.obs_properties_add_int(props, "convergence", ModernizedCProgram.obs_module_text("Convergence"), 0, 10, 1);
		obs_property.obs_properties_add_int(props, "qpi", "QPI", 1, 51, 1);
		obs_property.obs_properties_add_int(props, "qpp", "QPP", 1, 51, 1);
		obs_property.obs_properties_add_int(props, "qpb", "QPB", 1, 51, 1);
		obs_property.obs_properties_add_int(props, "icq_quality", ModernizedCProgram.obs_module_text("ICQQuality"), 1, 51, 1);
		obs_property.obs_properties_add_int(props, "la_depth", ModernizedCProgram.obs_module_text("LookAheadDepth"), 10, 100, 1);
		obs_property.obs_properties_add_int(props, "bframes", ModernizedCProgram.obs_module_text("B Frames"), 0, 3, 1);
		obs_property obs_property = new obs_property();
		if (ModernizedCProgram.is_skl_or_greater_platform()) {
			obs_property.obs_properties_add_bool(props, "mbbrc", ModernizedCProgram.obs_module_text("Content Adaptive Quantization"));
		} 
		return props;
	}
	public obs_properties monitor_capture_properties(Object unused) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(unused);
		obs_properties obs_properties = new obs_properties();
		obs_properties_t props = obs_properties.obs_properties_create();
		obs_property obs_property = new obs_property();
		obs_property_t monitors = obs_property.obs_properties_add_list(props, "monitor", ModernizedCProgram.obs_module_text("Monitor"), obs_combo_type.OBS_COMBO_TYPE_LIST, obs_combo_format.OBS_COMBO_FORMAT_INT);
		obs_property obs_property = new obs_property();
		obs_property.obs_properties_add_bool(props, "compatibility", ModernizedCProgram.obs_module_text("Compatibility"));
		obs_property.obs_properties_add_bool(props, "capture_cursor", ModernizedCProgram.obs_module_text("CaptureCursor"));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/EnumDisplayMonitors(((Object)0), ((Object)0), enum_monitor_props, (LPARAM)monitors);
		return props;
	}
	public obs_properties rtmp_common_properties(Object unused) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(unused);
		obs_properties obs_properties = new obs_properties();
		obs_properties_t ppts = obs_properties.obs_properties_create();
		obs_property_t p = new obs_property_t();
		json_t root = new json_t();
		json_t json_t = new json_t();
		root = json_t.open_services_file();
		if (root) {
			ppts.obs_properties_set_param(root, properties_data_destroy);
		} 
		obs_property obs_property = new obs_property();
		p = obs_property.obs_properties_add_list(ppts, "service", ModernizedCProgram.obs_module_text("Service"), obs_combo_type.OBS_COMBO_TYPE_LIST, obs_combo_format.OBS_COMBO_FORMAT_STRING);
		p.obs_property_set_modified_callback(service_selected);
		obs_property obs_property = new obs_property();
		p = obs_property.obs_properties_add_bool(ppts, "show_all", ModernizedCProgram.obs_module_text("ShowAll"));
		p.obs_property_set_modified_callback(show_all_services_toggled);
		obs_property.obs_properties_add_list(ppts, "server", ModernizedCProgram.obs_module_text("Server"), obs_combo_type.OBS_COMBO_TYPE_LIST, obs_combo_format.OBS_COMBO_FORMAT_STRING);
		obs_property obs_property = new obs_property();
		obs_property.obs_properties_add_text(ppts, "key", ModernizedCProgram.obs_module_text("StreamKey"), obs_text_type.OBS_TEXT_PASSWORD);
		return ppts;
	}
	public obs_properties ffmpeg_source_getproperties(Object data) {
		ffmpeg_source s = data;
		dstr filter = new dstr(0);
		dstr path = new dstr(0);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(data);
		obs_properties obs_properties = new obs_properties();
		obs_properties_t props = obs_properties.obs_properties_create();
		props.obs_properties_set_flags((1 << 0));
		obs_property_t prop = new obs_property_t();
		// use this when obs allows non-readonly paths
		obs_property obs_property = new obs_property();
		prop = obs_property.obs_properties_add_bool(props, "is_local_file", ModernizedCProgram.obs_module_text("LocalFile"));
		prop.obs_property_set_modified_callback(is_local_file_modified);
		filter.dstr_copy(ModernizedCProgram.obs_module_text("MediaFileFilter.AllMediaFiles"));
		filter.dstr_cat(ModernizedCProgram.media_filter);
		filter.dstr_cat(ModernizedCProgram.obs_module_text("MediaFileFilter.VideoFiles"));
		filter.dstr_cat(ModernizedCProgram.video_filter);
		filter.dstr_cat(ModernizedCProgram.obs_module_text("MediaFileFilter.AudioFiles"));
		filter.dstr_cat(ModernizedCProgram.audio_filter);
		filter.dstr_cat(ModernizedCProgram.obs_module_text("MediaFileFilter.AllFiles"));
		filter.dstr_cat(" (*.*)");
		Byte generatedInput = s.getInput();
		Object generatedDstr = path.getDstr();
		if (s && generatedInput && generatedInput) {
			byte slash;
			path.dstr_copy(generatedInput);
			path.dstr_replace("\\", "/");
			slash = /*Error: Function owner not recognized*/strrchr(generatedDstr, (byte)'/');
			if (slash) {
				path.dstr_resize(slash - generatedDstr + 1);
			} 
		} 
		obs_property obs_property = new obs_property();
		obs_property.obs_properties_add_path(props, "local_file", ModernizedCProgram.obs_module_text("LocalFile"), obs_path_type.OBS_PATH_FILE, generatedDstr, generatedDstr);
		filter.dstr_free();
		path.dstr_free();
		prop = obs_property.obs_properties_add_bool(props, "looping", ModernizedCProgram.obs_module_text("Looping"));
		obs_property.obs_properties_add_bool(props, "restart_on_activate", ModernizedCProgram.obs_module_text("RestartWhenActivated"));
		obs_property obs_property = new obs_property();
		prop = obs_property.obs_properties_add_int_slider(props, "buffering_mb", ModernizedCProgram.obs_module_text("BufferingMB"), 1, 16, 1);
		prop.obs_property_int_set_suffix(" MB");
		obs_property obs_property = new obs_property();
		obs_property.obs_properties_add_text(props, "input", ModernizedCProgram.obs_module_text("Input"), obs_text_type.OBS_TEXT_DEFAULT);
		obs_property.obs_properties_add_text(props, "input_format", ModernizedCProgram.obs_module_text("InputFormat"), obs_text_type.OBS_TEXT_DEFAULT);
		obs_property.obs_properties_add_bool(props, "hw_decode", ModernizedCProgram.obs_module_text("HardwareDecode"));
		obs_property.obs_properties_add_bool(props, "clear_on_media_end", ModernizedCProgram.obs_module_text("ClearOnMediaEnd"));
		prop = obs_property.obs_properties_add_bool(props, "close_when_inactive", ModernizedCProgram.obs_module_text("CloseFileWhenInactive"));
		prop.obs_property_set_long_description(ModernizedCProgram.obs_module_text("CloseFileWhenInactive.ToolTip"));
		prop = obs_property.obs_properties_add_int_slider(props, "speed_percent", ModernizedCProgram.obs_module_text("SpeedPercentage"), 1, 200, 1);
		prop.obs_property_int_set_suffix("%");
		obs_property obs_property = new obs_property();
		prop = obs_property.obs_properties_add_list(props, "color_range", ModernizedCProgram.obs_module_text("ColorRange"), obs_combo_type.OBS_COMBO_TYPE_LIST, obs_combo_format.OBS_COMBO_FORMAT_INT);
		prop.obs_property_list_add_int(ModernizedCProgram.obs_module_text("ColorRange.Auto"), VIDEO_RANGE_DEFAULT);
		prop.obs_property_list_add_int(ModernizedCProgram.obs_module_text("ColorRange.Partial"), VIDEO_RANGE_PARTIAL);
		prop.obs_property_list_add_int(ModernizedCProgram.obs_module_text("ColorRange.Full"), VIDEO_RANGE_FULL);
		obs_property.obs_properties_add_bool(props, "seekable", ModernizedCProgram.obs_module_text("Seekable"));
		return props;
	}
	public obs_properties duplicator_capture_properties(Object unused) {
		int monitor_idx = 0;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(unused);
		obs_properties obs_properties = new obs_properties();
		obs_properties_t props = obs_properties.obs_properties_create();
		obs_property obs_property = new obs_property();
		obs_property_t monitors = obs_property.obs_properties_add_list(props, "monitor", ModernizedCProgram.obs_module_text("Monitor"), obs_combo_type.OBS_COMBO_TYPE_LIST, obs_combo_format.OBS_COMBO_FORMAT_INT);
		obs_property obs_property = new obs_property();
		obs_property.obs_properties_add_bool(props, "capture_cursor", ModernizedCProgram.obs_module_text("CaptureCursor"));
		ModernizedCProgram.obs_enter_graphics();
		while (monitors.get_monitor_props(monitor_idx++)) {
			;
		}
		ModernizedCProgram.obs_leave_graphics();
		return props;
	}
	public obs_properties gain_properties(Object data) {
		obs_properties obs_properties = new obs_properties();
		obs_properties_t ppts = obs_properties.obs_properties_create();
		obs_property obs_property = new obs_property();
		obs_property_t p = obs_property.obs_properties_add_float_slider(ppts, "db", ModernizedCProgram.obs_module_text("Gain.GainDB"), -30.0, 30.0, 0.1);
		p.obs_property_float_set_suffix(" dB");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(data);
		return ppts;
	}
	public obs_properties obs_get_source_properties(Object id) {
		obs_source_info obs_source_info = new obs_source_info();
		obs_source_info info = obs_source_info.get_source_info(id);
		if (info && (info.getGet_properties() || info.getGet_properties2())) {
			obs_data_t defaults = info.get_defaults();
			obs_properties_t props = new obs_properties_t();
			if (info.getGet_properties2()) {
				props = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(NULL, info.getType_data());
			} else {
					props = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(NULL);
			} 
			ModernizedCProgram.obs_properties_apply_settings(props, defaults);
			defaults.obs_data_release();
			return props;
		} 
		return NULL;
	}
	public obs_properties obs_source_properties(Object source) {
		if (!ModernizedCProgram.data_valid(source, "obs_source_properties")) {
			return NULL;
		} 
		if (source.getInfo().getGet_properties2()) {
			obs_properties_t props = new obs_properties_t();
			props = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(source.getContext().getData(), source.getInfo().getType_data());
			ModernizedCProgram.obs_properties_apply_settings(props, source.getContext().getSettings());
			return props;
		}  else if (source.getInfo().getGet_properties()) {
			obs_properties_t props = new obs_properties_t();
			props = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(source.getContext().getData());
			ModernizedCProgram.obs_properties_apply_settings(props, source.getContext().getSettings());
			return props;
		} 
		return NULL;
	}
	public obs_properties libfdk_properties(Object unused) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(unused);
		obs_properties obs_properties = new obs_properties();
		obs_properties_t props = obs_properties.obs_properties_create();
		obs_property obs_property = new obs_property();
		obs_property.obs_properties_add_int(props, "bitrate", ModernizedCProgram.obs_module_text("Bitrate"), 32, 1024, 32);
		obs_property obs_property = new obs_property();
		obs_property.obs_properties_add_bool(props, "afterburner", ModernizedCProgram.obs_module_text("Afterburner"));
		return props;
	}
	public obs_properties obs_script_get_properties(obs_script script) {
		obs_properties_t props = NULL;
		if (!ModernizedCProgram.pointer_valid(script, "script", __FUNCTION__)) {
			return NULL;
		} 
		return props;
	}
	public obs_properties color_correction_filter_properties(Object data) {
		obs_properties obs_properties = new obs_properties();
		obs_properties_t props = obs_properties.obs_properties_create();
		obs_property obs_property = new obs_property();
		obs_property.obs_properties_add_float_slider(props, "gamma", ModernizedCProgram.obs_module_text("Gamma"), -3.0, 3.0, 0.01);
		obs_property.obs_properties_add_float_slider(props, "contrast", ModernizedCProgram.obs_module_text("Contrast"), -2.0, 2.0, 0.01);
		obs_property.obs_properties_add_float_slider(props, "brightness", ModernizedCProgram.obs_module_text("Brightness"), -1.0, 1.0, 0.01);
		obs_property.obs_properties_add_float_slider(props, "saturation", ModernizedCProgram.obs_module_text("Saturation"), -1.0, 5.0, 0.01);
		obs_property.obs_properties_add_float_slider(props, "hue_shift", ModernizedCProgram.obs_module_text("HueShift"), -180.0, 180.0, 0.01);
		obs_property obs_property = new obs_property();
		obs_property.obs_properties_add_int_slider(props, "opacity", ModernizedCProgram.obs_module_text("Opacity"), 0, 100, 1);
		obs_property obs_property = new obs_property();
		obs_property.obs_properties_add_color(props, "color", ModernizedCProgram.obs_module_text("Color"));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(data);
		return props/*
		 * As the functions' namesake, this provides the default settings for any
		 * options you wish to provide a default for. Try to select defaults that
		 * make sense to the end user, or that don't effect the data.
		 * *NOTE* this function is completely optional, as is providing a default
		 * for any particular setting.
		 */;
	}
	public obs_properties luma_key_properties(Object data) {
		obs_properties obs_properties = new obs_properties();
		obs_properties_t props = obs_properties.obs_properties_create();
		obs_property obs_property = new obs_property();
		obs_property.obs_properties_add_float_slider(props, "luma_max", ModernizedCProgram.obs_module_text("Luma.LumaMax"), 0, 1, 0.01);
		obs_property.obs_properties_add_float_slider(props, "luma_max_smooth", ModernizedCProgram.obs_module_text("Luma.LumaMaxSmooth"), 0, 1, 0.01);
		obs_property.obs_properties_add_float_slider(props, "luma_min", ModernizedCProgram.obs_module_text("Luma.LumaMin"), 0, 1, 0.01);
		obs_property.obs_properties_add_float_slider(props, "luma_min_smooth", ModernizedCProgram.obs_module_text("Luma.LumaMinSmooth"), 0, 1, 0.01);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(data);
		return props;
	}
	public obs_properties noise_suppress_properties(Object data) {
		obs_properties obs_properties = new obs_properties();
		obs_properties_t ppts = obs_properties.obs_properties_create();
		obs_property obs_property = new obs_property();
		obs_property_t p = obs_property.obs_properties_add_int_slider(ppts, "suppress_level", ModernizedCProgram.obs_module_text("NoiseSuppress.SuppressLevel"), -60, 0, 1);
		p.obs_property_int_set_suffix(" dB");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(data);
		return ppts;
	}
	public obs_properties scroll_filter_properties(Object data) {
		obs_properties obs_properties = new obs_properties();
		obs_properties_t props = obs_properties.obs_properties_create();
		obs_property_t p = new obs_property_t();
		obs_property obs_property = new obs_property();
		obs_property.obs_properties_add_float_slider(props, "speed_x", ModernizedCProgram.obs_module_text("ScrollFilter.SpeedX"), -500.0, 500.0, 1.0);
		obs_property.obs_properties_add_float_slider(props, "speed_y", ModernizedCProgram.obs_module_text("ScrollFilter.SpeedY"), -500.0, 500.0, 1.0);
		obs_property obs_property = new obs_property();
		p = obs_property.obs_properties_add_bool(props, "limit_cx", ModernizedCProgram.obs_module_text("ScrollFilter.LimitWidth"));
		p.obs_property_set_modified_callback(limit_cx_clicked);
		obs_property obs_property = new obs_property();
		obs_property.obs_properties_add_int(props, "cx", ModernizedCProgram.obs_module_text("Crop.Width"), 1, 8192, 1);
		p = obs_property.obs_properties_add_bool(props, "limit_cy", ModernizedCProgram.obs_module_text("ScrollFilter.LimitHeight"));
		p.obs_property_set_modified_callback(limit_cy_clicked);
		obs_property.obs_properties_add_int(props, "cy", ModernizedCProgram.obs_module_text("Crop.Height"), 1, 8192, 1);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(data);
		return props;
	}
	public obs_properties flv_output_properties(Object unused) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(unused);
		obs_properties obs_properties = new obs_properties();
		obs_properties_t props = obs_properties.obs_properties_create();
		obs_property obs_property = new obs_property();
		obs_property.obs_properties_add_text(props, "path", ModernizedCProgram.obs_module_text("FLVOutput.FilePath"), obs_text_type.OBS_TEXT_DEFAULT);
		return props;
	}
	public obs_properties vlcs_properties(Object data) {
		obs_properties obs_properties = new obs_properties();
		obs_properties_t ppts = obs_properties.obs_properties_create();
		vlc_source c = data;
		dstr filter = new dstr(0);
		dstr exts = new dstr(0);
		dstr path = new dstr(0);
		obs_property_t p = new obs_property_t();
		ppts.obs_properties_set_flags((1 << 0));
		obs_property obs_property = new obs_property();
		obs_property.obs_properties_add_bool(ppts, "loop", ModernizedCProgram.obs_module_text("LoopPlaylist"));
		obs_property.obs_properties_add_bool(ppts, "shuffle", ModernizedCProgram.obs_module_text("shuffle"));
		Object generatedMutex = c.getMutex();
		Object generatedFiles = c.getFiles();
		Byte generatedPath = last.getPath();
		Object generatedDstr = path.getDstr();
		if (c) {
			ModernizedCProgram.pthread_mutex_lock(generatedMutex);
			if (generatedFiles.getNum()) {
				media_file_data last = /*Error: Function owner not recognized*/da_end(generatedFiles);
				byte slash;
				path.dstr_copy(generatedPath);
				path.dstr_replace("\\", "/");
				slash = /*Error: Function owner not recognized*/strrchr(generatedDstr, (byte)'/');
				if (slash) {
					path.dstr_resize(slash - generatedDstr + 1);
				} 
			} 
			ModernizedCProgram.pthread_mutex_unlock(generatedMutex);
		} 
		obs_property obs_property = new obs_property();
		p = obs_property.obs_properties_add_list(ppts, "playback_behavior", ModernizedCProgram.obs_module_text("PlaybackBehavior"), obs_combo_type.OBS_COMBO_TYPE_LIST, obs_combo_format.OBS_COMBO_FORMAT_STRING);
		p.obs_property_list_add_string(ModernizedCProgram.obs_module_text("PlaybackBehavior.StopRestart"), "stop_restart");
		p.obs_property_list_add_string(ModernizedCProgram.obs_module_text("PlaybackBehavior.PauseUnpause"), "pause_unpause");
		p.obs_property_list_add_string(ModernizedCProgram.obs_module_text("PlaybackBehavior.AlwaysPlay"), "always_play");
		filter.dstr_cat("Media Files (");
		exts.dstr_copy("*.3g2;*.3gp;*.3gp2;*.3gpp;*.amv;*.asf;*.avi;*.bik;*.bin;*.crf;*.divx;*.drc;*.dv;*.evo;*.f4v;*.flv;*.gvi;*.gxf;*.iso;*.m1v;*.m2v;*.m2t;*.m2ts;*.m4v;*.mkv;*.mov;*.mp2;*.mp2v;*.mp4;*.mp4v;*.mpe;*.mpeg;*.mpeg1;*.mpeg2;*.mpeg4;*.mpg;*.mpv2;*.mts;*.mtv;*.mxf;*.mxg;*.nsv;*.nuv;*.ogg;*.ogm;*.ogv;*.ogx;*.ps;*.rec;*.rm;*.rmvb;*.rpl;*.thp;*.tod;*.ts;*.tts;*.txd;*.vob;*.vro;*.webm;*.wm;*.wmv;*.wtv;*.xesc;*.3ga;*.669;*.a52;*.aac;*.ac3;*.adt;*.adts;*.aif;*.aifc;*.aiff;*.amb;*.amr;*.aob;*.ape;*.au;*.awb;*.caf;*.dts;*.flac;*.it;*.kar;*.m4a;*.m4b;*.m4p;*.m5p;*.mid;*.mka;*.mlp;*.mod;*.mpa;*.mp1;*.mp2;*.mp3;*.mpc;*.mpga;*.mus;*.oga;*.ogg;*.oma;*.opus;*.qcp;*.ra;*.rmi;*.s3m;*.sid;*.spx;*.tak;*.thd;*.tta;*.voc;*.vqf;*.w64;*.wav;*.wma;*.wv;*.xa;*.xm;*.asx;*.b4s;*.cue;*.ifo;*.m3u;*.m3u8;*.pls;*.ram;*.rar;*.sdp;*.vlc;*.xspf;*.wax;*.wvx;*.zip;*.conf");
		exts.dstr_replace(";", " ");
		filter.dstr_cat_dstr(exts);
		filter.dstr_cat(");;Video Files (");
		exts.dstr_copy("*.3g2;*.3gp;*.3gp2;*.3gpp;*.amv;*.asf;*.avi;*.bik;*.bin;*.crf;*.divx;*.drc;*.dv;*.evo;*.f4v;*.flv;*.gvi;*.gxf;*.iso;*.m1v;*.m2v;*.m2t;*.m2ts;*.m4v;*.mkv;*.mov;*.mp2;*.mp2v;*.mp4;*.mp4v;*.mpe;*.mpeg;*.mpeg1;*.mpeg2;*.mpeg4;*.mpg;*.mpv2;*.mts;*.mtv;*.mxf;*.mxg;*.nsv;*.nuv;*.ogg;*.ogm;*.ogv;*.ogx;*.ps;*.rec;*.rm;*.rmvb;*.rpl;*.thp;*.tod;*.ts;*.tts;*.txd;*.vob;*.vro;*.webm;*.wm;*.wmv;*.wtv;*.xesc");
		exts.dstr_replace(";", " ");
		filter.dstr_cat_dstr(exts);
		filter.dstr_cat(");;Audio Files (");
		exts.dstr_copy("*.3ga;*.669;*.a52;*.aac;*.ac3;*.adt;*.adts;*.aif;*.aifc;*.aiff;*.amb;*.amr;*.aob;*.ape;*.au;*.awb;*.caf;*.dts;*.flac;*.it;*.kar;*.m4a;*.m4b;*.m4p;*.m5p;*.mid;*.mka;*.mlp;*.mod;*.mpa;*.mp1;*.mp2;*.mp3;*.mpc;*.mpga;*.mus;*.oga;*.ogg;*.oma;*.opus;*.qcp;*.ra;*.rmi;*.s3m;*.sid;*.spx;*.tak;*.thd;*.tta;*.voc;*.vqf;*.w64;*.wav;*.wma;*.wv;*.xa;*.xm");
		exts.dstr_replace(";", " ");
		filter.dstr_cat_dstr(exts);
		filter.dstr_cat(");;Playlist Files (");
		exts.dstr_copy("*.asx;*.b4s;*.cue;*.ifo;*.m3u;*.m3u8;*.pls;*.ram;*.rar;*.sdp;*.vlc;*.xspf;*.wax;*.wvx;*.zip;*.conf");
		exts.dstr_replace(";", " ");
		filter.dstr_cat_dstr(exts);
		filter.dstr_cat(")");
		obs_property obs_property = new obs_property();
		obs_property.obs_properties_add_editable_list(ppts, "playlist", ModernizedCProgram.obs_module_text("Playlist"), obs_editable_list_type.OBS_EDITABLE_LIST_TYPE_FILES_AND_URLS, generatedDstr, generatedDstr);
		path.dstr_free();
		filter.dstr_free();
		exts.dstr_free();
		obs_property obs_property = new obs_property();
		obs_property.obs_properties_add_int(ppts, "network_caching", ModernizedCProgram.obs_module_text("NetworkCaching"), 100, 60000, 10);
		obs_property.obs_properties_add_int(ppts, "track", ModernizedCProgram.obs_module_text("AudioTrack"), 1, 10, 1);
		obs_property.obs_properties_add_bool(ppts, "subtitle_enable", ModernizedCProgram.obs_module_text("SubtitleEnable"));
		obs_property.obs_properties_add_int(ppts, "subtitle", ModernizedCProgram.obs_module_text("SubtitleTrack"), 1, 10, 1);
		return ppts;
	}
	public obs_properties rtmp_custom_properties(Object unused) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(unused);
		obs_properties obs_properties = new obs_properties();
		obs_properties_t ppts = obs_properties.obs_properties_create();
		obs_property_t p = new obs_property_t();
		obs_property obs_property = new obs_property();
		obs_property.obs_properties_add_text(ppts, "server", "URL", obs_text_type.OBS_TEXT_DEFAULT);
		obs_property.obs_properties_add_text(ppts, "key", ModernizedCProgram.obs_module_text("StreamKey"), obs_text_type.OBS_TEXT_PASSWORD);
		obs_property obs_property = new obs_property();
		p = obs_property.obs_properties_add_bool(ppts, "use_auth", ModernizedCProgram.obs_module_text("UseAuth"));
		obs_property.obs_properties_add_text(ppts, "username", ModernizedCProgram.obs_module_text("Username"), obs_text_type.OBS_TEXT_DEFAULT);
		obs_property.obs_properties_add_text(ppts, "password", ModernizedCProgram.obs_module_text("Password"), obs_text_type.OBS_TEXT_PASSWORD);
		p.obs_property_set_modified_callback(use_auth_modified);
		return ppts;
	}
	public obs_properties mask_filter_properties(Object data) {
		obs_properties obs_properties = new obs_properties();
		obs_properties_t props = obs_properties.obs_properties_create();
		dstr filter_str = new dstr(0);
		obs_property_t p = new obs_property_t();
		filter_str.dstr_copy(ModernizedCProgram.obs_module_text("BrowsePath.Images"));
		filter_str.dstr_cat(" (*.bmp *.jpg *.jpeg *.tga *.gif *.png);;");
		filter_str.dstr_cat(ModernizedCProgram.obs_module_text("BrowsePath.AllFiles"));
		filter_str.dstr_cat(" (*.*)");
		obs_property obs_property = new obs_property();
		p = obs_property.obs_properties_add_list(props, "type", ModernizedCProgram.obs_module_text("Type"), obs_combo_type.OBS_COMBO_TYPE_LIST, obs_combo_format.OBS_COMBO_FORMAT_STRING);
		p.obs_property_list_add_string(ModernizedCProgram.obs_module_text("MaskBlendType.MaskColor"), "mask_color_filter.effect");
		p.obs_property_list_add_string(ModernizedCProgram.obs_module_text("MaskBlendType.MaskAlpha"), "mask_alpha_filter.effect");
		p.obs_property_list_add_string(ModernizedCProgram.obs_module_text("MaskBlendType.BlendMultiply"), "blend_mul_filter.effect");
		p.obs_property_list_add_string(ModernizedCProgram.obs_module_text("MaskBlendType.BlendAddition"), "blend_add_filter.effect");
		p.obs_property_list_add_string(ModernizedCProgram.obs_module_text("MaskBlendType.BlendSubtraction"), "blend_sub_filter.effect");
		Object generatedDstr = filter_str.getDstr();
		obs_property obs_property = new obs_property();
		obs_property.obs_properties_add_path(props, "image_path", ModernizedCProgram.obs_module_text("Path"), obs_path_type.OBS_PATH_FILE, generatedDstr, NULL);
		obs_property obs_property = new obs_property();
		obs_property.obs_properties_add_color(props, "color", ModernizedCProgram.obs_module_text("Color"));
		obs_property obs_property = new obs_property();
		obs_property.obs_properties_add_int_slider(props, "opacity", ModernizedCProgram.obs_module_text("Opacity"), 0, 100, 1);
		obs_property obs_property = new obs_property();
		obs_property.obs_properties_add_bool(props, "stretch", ModernizedCProgram.obs_module_text("StretchImage"));
		filter_str.dstr_free();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(data);
		return props;
	}
	public obs_properties gpu_delay_filter_properties(Object data) {
		obs_properties obs_properties = new obs_properties();
		obs_properties_t props = obs_properties.obs_properties_create();
		obs_property obs_property = new obs_property();
		obs_property_t p = obs_property.obs_properties_add_int(props, "delay_ms", ModernizedCProgram.obs_module_text("DelayMs"), 0, 500, 1);
		p.obs_property_int_set_suffix(" ms");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(data);
		return props;
	}
	public obs_properties obs_x264_props(Object unused) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(unused);
		obs_properties obs_properties = new obs_properties();
		obs_properties_t props = obs_properties.obs_properties_create();
		obs_property_t list = new obs_property_t();
		obs_property_t p = new obs_property_t();
		obs_property obs_property = new obs_property();
		list = obs_property.obs_properties_add_list(props, "rate_control", ModernizedCProgram.obs_module_text("RateControl"), obs_combo_type.OBS_COMBO_TYPE_LIST, obs_combo_format.OBS_COMBO_FORMAT_STRING);
		list.obs_property_list_add_string("CBR", "CBR");
		list.obs_property_list_add_string("ABR", "ABR");
		list.obs_property_list_add_string("VBR", "VBR");
		list.obs_property_list_add_string("CRF", "CRF");
		list.obs_property_set_modified_callback(rate_control_modified);
		obs_property obs_property = new obs_property();
		p = obs_property.obs_properties_add_int(props, "bitrate", ModernizedCProgram.obs_module_text("Bitrate"), 50, 10000000, 50);
		p.obs_property_int_set_suffix(" Kbps");
		obs_property obs_property = new obs_property();
		p = obs_property.obs_properties_add_bool(props, "use_bufsize", ModernizedCProgram.obs_module_text("CustomBufsize"));
		p.obs_property_set_modified_callback(use_bufsize_modified);
		obs_property.obs_properties_add_int(props, "buffer_size", ModernizedCProgram.obs_module_text("BufferSize"), 0, 10000000, 1);
		obs_property.obs_properties_add_int(props, "crf", ModernizedCProgram.obs_module_text("CRF"), 0, 51, 1);
		obs_property.obs_properties_add_int(props, "keyint_sec", ModernizedCProgram.obs_module_text("KeyframeIntervalSec"), 0, 20, 1);
		list = obs_property.obs_properties_add_list(props, "preset", ModernizedCProgram.obs_module_text("CPUPreset"), obs_combo_type.OBS_COMBO_TYPE_LIST, obs_combo_format.OBS_COMBO_FORMAT_STRING);
		list.add_strings(x264_preset_names);
		list = obs_property.obs_properties_add_list(props, "profile", ModernizedCProgram.obs_module_text("Profile"), obs_combo_type.OBS_COMBO_TYPE_LIST, obs_combo_format.OBS_COMBO_FORMAT_STRING);
		list.obs_property_list_add_string(ModernizedCProgram.obs_module_text("None"), "");
		list.obs_property_list_add_string("baseline", "baseline");
		list.obs_property_list_add_string("main", "main");
		list.obs_property_list_add_string("high", "high");
		list = obs_property.obs_properties_add_list(props, "tune", ModernizedCProgram.obs_module_text("Tune"), obs_combo_type.OBS_COMBO_TYPE_LIST, obs_combo_format.OBS_COMBO_FORMAT_STRING);
		list.obs_property_list_add_string(ModernizedCProgram.obs_module_text("None"), "");
		list.add_strings(x264_tune_names);
		obs_property obs_property = new obs_property();
		obs_property.obs_properties_add_text(props, "x264opts", ModernizedCProgram.obs_module_text("EncoderOptions"), obs_text_type.OBS_TEXT_DEFAULT);
		return props;
	}
	public obs_properties obs_get_output_properties(Object id) {
		obs_output_info info = ModernizedCProgram.find_output(id);
		if (info && info.getGet_properties()) {
			obs_data_t defaults = info.get_defaults();
			obs_properties_t properties = new obs_properties_t();
			properties = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(NULL);
			ModernizedCProgram.obs_properties_apply_settings(properties, defaults);
			defaults.obs_data_release();
			return properties;
		} 
		return NULL;
	}
	public obs_properties obs_output_properties(Object output) {
		if (!ModernizedCProgram.obs_object_valid(output, "obs_output_properties", "output")) {
			return NULL;
		} 
		if (output && output.getInfo().getGet_properties()) {
			obs_properties_t props = new obs_properties_t();
			props = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(output.getContext().getData());
			ModernizedCProgram.obs_properties_apply_settings(props, output.getContext().getSettings());
			return props;
		} 
		return NULL;
	}
	public obs_properties stinger_properties(Object data) {
		obs_properties obs_properties = new obs_properties();
		obs_properties_t ppts = obs_properties.obs_properties_create();
		ppts.obs_properties_set_flags((1 << 0));
		obs_property obs_property = new obs_property();
		obs_property.obs_properties_add_path(ppts, "path", ModernizedCProgram.obs_module_text("VideoFile"), obs_path_type.OBS_PATH_FILE, "Video Files (*.mp4 *.ts *.mov *.wmv *.flv *.mkv *.avi *.gif *.webm);;", NULL);
		obs_property obs_property = new obs_property();
		obs_property_t p = obs_property.obs_properties_add_list(ppts, "tp_type", ModernizedCProgram.obs_module_text("TransitionPointType"), obs_combo_type.OBS_COMBO_TYPE_LIST, obs_combo_format.OBS_COMBO_FORMAT_INT);
		p.obs_property_list_add_int(ModernizedCProgram.obs_module_text("TransitionPointTypeTime"), 0);
		p.obs_property_list_add_int(ModernizedCProgram.obs_module_text("TransitionPointTypeFrame"), 1);
		p.obs_property_set_modified_callback(transition_point_type_modified);
		obs_property obs_property = new obs_property();
		obs_property.obs_properties_add_int(ppts, "transition_point", ModernizedCProgram.obs_module_text("TransitionPoint"), 0, 120000, 1);
		obs_property_t monitor_list = obs_property.obs_properties_add_list(ppts, "audio_monitoring", ModernizedCProgram.obs_module_text("AudioMonitoring"), obs_combo_type.OBS_COMBO_TYPE_LIST, obs_combo_format.OBS_COMBO_FORMAT_INT);
		monitor_list.obs_property_list_add_int(ModernizedCProgram.obs_module_text("AudioMonitoring.None"), obs_monitoring_type.OBS_MONITORING_TYPE_NONE);
		monitor_list.obs_property_list_add_int(ModernizedCProgram.obs_module_text("AudioMonitoring.MonitorOnly"), obs_monitoring_type.OBS_MONITORING_TYPE_MONITOR_ONLY);
		monitor_list.obs_property_list_add_int(ModernizedCProgram.obs_module_text("AudioMonitoring.Both"), obs_monitoring_type.OBS_MONITORING_TYPE_MONITOR_AND_OUTPUT);
		obs_property_t audio_fade_style = obs_property.obs_properties_add_list(ppts, "audio_fade_style", ModernizedCProgram.obs_module_text("AudioFadeStyle"), obs_combo_type.OBS_COMBO_TYPE_LIST, obs_combo_format.OBS_COMBO_FORMAT_INT);
		audio_fade_style.obs_property_list_add_int(ModernizedCProgram.obs_module_text("AudioFadeStyle.FadeOutFadeIn"), fade_style.FADE_STYLE_FADE_OUT_FADE_IN);
		audio_fade_style.obs_property_list_add_int(ModernizedCProgram.obs_module_text("AudioFadeStyle.CrossFade"), fade_style.FADE_STYLE_CROSS_FADE);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(data);
		return ppts;
	}
	public obs_properties slide_properties(Object data) {
		obs_properties obs_properties = new obs_properties();
		obs_properties_t ppts = obs_properties.obs_properties_create();
		obs_property_t p = new obs_property_t();
		obs_property obs_property = new obs_property();
		p = obs_property.obs_properties_add_list(ppts, "direction", ModernizedCProgram.obs_module_text("Direction"), obs_combo_type.OBS_COMBO_TYPE_LIST, obs_combo_format.OBS_COMBO_FORMAT_STRING);
		p.obs_property_list_add_string(ModernizedCProgram.obs_module_text("Direction.Left"), "left");
		p.obs_property_list_add_string(ModernizedCProgram.obs_module_text("Direction.Right"), "right");
		p.obs_property_list_add_string(ModernizedCProgram.obs_module_text("Direction.Up"), "up");
		p.obs_property_list_add_string(ModernizedCProgram.obs_module_text("Direction.Down"), "down");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(data);
		return ppts;
	}
	public obs_properties compressor_properties(Object data) {
		compressor_data cd = data;
		obs_properties obs_properties = new obs_properties();
		obs_properties_t props = obs_properties.obs_properties_create();
		obs_source_t parent = NULL;
		obs_property_t p = new obs_property_t();
		obs_source generatedContext = cd.getContext();
		obs_source obs_source = new obs_source();
		if (cd) {
			parent = obs_source.obs_filter_get_parent(generatedContext);
		} 
		obs_property obs_property = new obs_property();
		p = obs_property.obs_properties_add_float_slider(props, "ratio", ModernizedCProgram.obs_module_text("Compressor.Ratio"), 1.0, 32.0, 0.5);
		p.obs_property_float_set_suffix(":1");
		p = obs_property.obs_properties_add_float_slider(props, "threshold", ModernizedCProgram.obs_module_text("Compressor.Threshold"), -60.0, 0.0, 0.1);
		p.obs_property_float_set_suffix(" dB");
		obs_property obs_property = new obs_property();
		p = obs_property.obs_properties_add_int_slider(props, "attack_time", ModernizedCProgram.obs_module_text("Compressor.AttackTime"), 1, 500, 1);
		p.obs_property_int_set_suffix(" ms");
		p = obs_property.obs_properties_add_int_slider(props, "release_time", ModernizedCProgram.obs_module_text("Compressor.ReleaseTime"), 1, 1000, 1);
		p.obs_property_int_set_suffix(" ms");
		p = obs_property.obs_properties_add_float_slider(props, "output_gain", ModernizedCProgram.obs_module_text("Compressor.OutputGain"), -32.0, 32.0, 0.1);
		p.obs_property_float_set_suffix(" dB");
		obs_property obs_property = new obs_property();
		obs_property_t sources = obs_property.obs_properties_add_list(props, "sidechain_source", ModernizedCProgram.obs_module_text("Compressor.SidechainSource"), obs_combo_type.OBS_COMBO_TYPE_LIST, obs_combo_format.OBS_COMBO_FORMAT_STRING);
		sources.obs_property_list_add_string(ModernizedCProgram.obs_module_text("None"), "none");
		sidechain_prop_info info = new sidechain_prop_info(sources, parent);
		ModernizedCProgram.obs_enum_sources(add_sources, info);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(data);
		return props;
	}
	public obs_properties color_grade_filter_properties(Object data) {
		lut_filter_data s = data;
		dstr path = new dstr(0);
		byte slash;
		obs_properties obs_properties = new obs_properties();
		obs_properties_t props = obs_properties.obs_properties_create();
		dstr filter_str = new dstr(0);
		filter_str.dstr_cat("(*.png)");
		Byte generatedFile = s.getFile();
		obs_module obs_module = new obs_module();
		if (s && generatedFile && generatedFile) {
			path.dstr_copy(generatedFile);
		} else {
				byte lut_dir = obs_module.obs_current_module().obs_find_module_file("LUTs");
				path.dstr_copy(lut_dir);
				path.dstr_cat_ch((byte)'/');
				ModernizedCProgram.bfree(lut_dir);
		} 
		path.dstr_replace("\\", "/");
		Object generatedDstr = path.getDstr();
		slash = /*Error: Function owner not recognized*/strrchr(generatedDstr, (byte)'/');
		if (slash) {
			path.dstr_resize(slash - generatedDstr + 1);
		} 
		obs_property obs_property = new obs_property();
		obs_property.obs_properties_add_path(props, "image_path", ModernizedCProgram.obs_module_text("Path"), obs_path_type.OBS_PATH_FILE, generatedDstr, generatedDstr);
		obs_property obs_property = new obs_property();
		obs_property.obs_properties_add_float_slider(props, "clut_amount", ModernizedCProgram.obs_module_text("Amount"), 0, 1, 0.01);
		filter_str.dstr_free();
		path.dstr_free();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(data);
		return props;
	}
	public obs_properties ss_properties(Object data) {
		obs_properties obs_properties = new obs_properties();
		obs_properties_t ppts = obs_properties.obs_properties_create();
		slideshow ss = data;
		obs_video_info ovi = new obs_video_info();
		dstr path = new dstr(0);
		obs_property_t p = new obs_property_t();
		int cx;
		int cy;
		/* ----------------- */ovi.obs_get_video_info();
		Object generatedBase_width = ovi.getBase_width();
		cx = (int)generatedBase_width;
		Object generatedBase_height = ovi.getBase_height();
		cy = (int)generatedBase_height;
		obs_property obs_property = new obs_property();
		p = obs_property.obs_properties_add_list(ppts, "playback_behavior", ModernizedCProgram.obs_module_text(/* ----------------- */"SlideShow.PlaybackBehavior"), obs_combo_type.OBS_COMBO_TYPE_LIST, obs_combo_format.OBS_COMBO_FORMAT_STRING);
		p.obs_property_list_add_string(ModernizedCProgram.obs_module_text("SlideShow.PlaybackBehavior.AlwaysPlay"), "always_play");
		p.obs_property_list_add_string(ModernizedCProgram.obs_module_text("SlideShow.PlaybackBehavior.StopRestart"), "stop_restart");
		p.obs_property_list_add_string(ModernizedCProgram.obs_module_text("SlideShow.PlaybackBehavior.PauseUnpause"), "pause_unpause");
		p = obs_property.obs_properties_add_list(ppts, "slide_mode", ModernizedCProgram.obs_module_text("SlideShow.SlideMode"), obs_combo_type.OBS_COMBO_TYPE_LIST, obs_combo_format.OBS_COMBO_FORMAT_STRING);
		p.obs_property_list_add_string(ModernizedCProgram.obs_module_text("SlideShow.SlideMode.Auto"), "mode_auto");
		p.obs_property_list_add_string(ModernizedCProgram.obs_module_text("SlideShow.SlideMode.Manual"), "mode_manual");
		p = obs_property.obs_properties_add_list(ppts, "transition", ModernizedCProgram.obs_module_text("SlideShow.Transition"), obs_combo_type.OBS_COMBO_TYPE_LIST, obs_combo_format.OBS_COMBO_FORMAT_STRING);
		p.obs_property_list_add_string(ModernizedCProgram.obs_module_text("SlideShow.Transition.Cut"), "cut");
		p.obs_property_list_add_string(ModernizedCProgram.obs_module_text("SlideShow.Transition.Fade"), "fade");
		p.obs_property_list_add_string(ModernizedCProgram.obs_module_text("SlideShow.Transition.Swipe"), "swipe");
		p.obs_property_list_add_string(ModernizedCProgram.obs_module_text("SlideShow.Transition.Slide"), "slide");
		obs_property obs_property = new obs_property();
		obs_property.obs_properties_add_int(ppts, "slide_time", ModernizedCProgram.obs_module_text("SlideShow.SlideTime"), 50, 3600000, 50);
		obs_property.obs_properties_add_int(ppts, "transition_speed", ModernizedCProgram.obs_module_text("SlideShow.TransitionSpeed"), 0, 3600000, 50);
		obs_property obs_property = new obs_property();
		obs_property.obs_properties_add_bool(ppts, "loop", ModernizedCProgram.obs_module_text("SlideShow.Loop"));
		obs_property.obs_properties_add_bool(ppts, "hide", ModernizedCProgram.obs_module_text("SlideShow.HideWhenDone"));
		obs_property.obs_properties_add_bool(ppts, "randomize", ModernizedCProgram.obs_module_text("SlideShow.Randomize"));
		p = obs_property.obs_properties_add_list(ppts, "use_custom_size", ModernizedCProgram.obs_module_text("SlideShow.CustomSize"), obs_combo_type.OBS_COMBO_TYPE_EDITABLE, obs_combo_format.OBS_COMBO_FORMAT_STRING);
		p.obs_property_list_add_string(ModernizedCProgram.obs_module_text("SlideShow.CustomSize.Auto"), ModernizedCProgram.obs_module_text("SlideShow.CustomSize.Auto"));
		for ( i = 0;
		 i < (/*Error: sizeof expression not supported yet*/ / /*Error: Unsupported expression*/); i++) {
			p.obs_property_list_add_string(ModernizedCProgram.aspects[i], ModernizedCProgram.aspects[i]);
		}
		byte[] str = new byte[32];
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/snprintf(str, 32, "%dx%d", cx, cy);
		p.obs_property_list_add_string(str, str);
		Object generatedMutex = ss.getMutex();
		Object generatedFiles = ss.getFiles();
		Byte generatedPath = last.getPath();
		Object generatedDstr = path.getDstr();
		if (ss) {
			ModernizedCProgram.pthread_mutex_lock(generatedMutex);
			if (generatedFiles.getNum()) {
				image_file_data last = /*Error: Function owner not recognized*/da_end(generatedFiles);
				byte slash;
				path.dstr_copy(generatedPath);
				path.dstr_replace("\\", "/");
				slash = /*Error: Function owner not recognized*/strrchr(generatedDstr, (byte)'/');
				if (slash) {
					path.dstr_resize(slash - generatedDstr + 1);
				} 
			} 
			ModernizedCProgram.pthread_mutex_unlock(generatedMutex);
		} 
		obs_property obs_property = new obs_property();
		obs_property.obs_properties_add_editable_list(ppts, "files", ModernizedCProgram.obs_module_text("SlideShow.Files"), obs_editable_list_type.OBS_EDITABLE_LIST_TYPE_FILES, ModernizedCProgram.file_filter, generatedDstr);
		path.dstr_free();
		return ppts;
	}
	public obs_properties coreaudio_properties(Object input) {
		obs_properties obs_properties = new obs_properties();
		obs_properties_t props = obs_properties.obs_properties_create();
		obs_property_t property = new obs_property_t();
		device_list devices = new device_list();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(devices, 0, /*Error: Unsupported expression*/);
		obs_property obs_property = new obs_property();
		property = obs_property.obs_properties_add_list(props, "device_id", ModernizedCProgram.obs_module_text("CoreAudio.Device"), obs_combo_type.OBS_COMBO_TYPE_LIST, obs_combo_format.OBS_COMBO_FORMAT_STRING);
		devices.coreaudio_enum_devices(input);
		Object generatedItems = devices.getItems();
		if (generatedItems.getNum()) {
			property.obs_property_list_add_string(ModernizedCProgram.obs_module_text("CoreAudio.Device.Default"), "default");
		} 
		dstr generatedName = item.getName();
		Object generatedDstr = generatedName.getDstr();
		for (size_t i = 0;
		 i < generatedItems.getNum(); i++) {
			device_item item = generatedItems.getArray() + i;
			property.obs_property_list_add_string(generatedDstr, generatedDstr);
		}
		devices.device_list_free();
		return props;
	}
	public obs_properties coreaudio_input_properties(Object unused) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(unused);
		obs_properties obs_properties = new obs_properties();
		return obs_properties.coreaudio_properties(true);
	}
	public obs_properties coreaudio_output_properties(Object unused) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(unused);
		obs_properties obs_properties = new obs_properties();
		return obs_properties.coreaudio_properties(false);
	}
	public obs_properties ftl_stream_properties(Object unused) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(unused);
		obs_properties obs_properties = new obs_properties();
		obs_properties_t props = obs_properties.obs_properties_create();
		obs_property obs_property = new obs_property();
		obs_property.obs_properties_add_int(props, "peak_bitrate_kbps", ModernizedCProgram.obs_module_text("FTLStream.PeakBitrate"), 1000, 10000, 500);
		return props;
	}
	public obs_properties xshm_properties(Object vptr) {
		xshm_data data = vptr;
		;
		obs_properties obs_properties = new obs_properties();
		obs_properties_t props = obs_properties.obs_properties_create();
		obs_property obs_property = new obs_property();
		obs_property.obs_properties_add_list(props, "screen", ModernizedCProgram.obs_module_text("Screen"), obs_combo_type.OBS_COMBO_TYPE_LIST, obs_combo_format.OBS_COMBO_FORMAT_INT);
		obs_property obs_property = new obs_property();
		obs_property.obs_properties_add_bool(props, "show_cursor", ModernizedCProgram.obs_module_text("CaptureCursor"));
		obs_property_t advanced = obs_property.obs_properties_add_bool(props, "advanced", ModernizedCProgram.obs_module_text("AdvancedSettings"));
		obs_property obs_property = new obs_property();
		obs_property_t server = obs_property.obs_properties_add_text(props, "server", ModernizedCProgram.obs_module_text("XServer"), obs_text_type.OBS_TEXT_DEFAULT);
		advanced.obs_property_set_modified_callback(xshm_toggle_advanced);
		server.obs_property_set_modified_callback(xshm_server_changed);
		obs_source generatedSource = data.getSource();
		obs_data obs_data = new obs_data();
		obs_data_t settings = obs_data.obs_source_get_settings(generatedSource);
		ModernizedCProgram.obs_property_modified(server, settings);
		settings.obs_data_release();
		return props/**
		 * Destroy the capture
		 */;
	}
	public obs_properties nvenc_properties_internal(Object ffmpeg) {
		obs_properties obs_properties = new obs_properties();
		obs_properties_t props = obs_properties.obs_properties_create();
		obs_property_t p = new obs_property_t();
		obs_property obs_property = new obs_property();
		p = obs_property.obs_properties_add_list(props, "rate_control", ModernizedCProgram.obs_module_text("RateControl"), obs_combo_type.OBS_COMBO_TYPE_LIST, obs_combo_format.OBS_COMBO_FORMAT_STRING);
		p.obs_property_list_add_string("CBR", "CBR");
		p.obs_property_list_add_string("CQP", "CQP");
		p.obs_property_list_add_string("VBR", "VBR");
		p.obs_property_list_add_string(ModernizedCProgram.obs_module_text("Lossless"), "lossless");
		p.obs_property_set_modified_callback(rate_control_modified);
		obs_property obs_property = new obs_property();
		p = obs_property.obs_properties_add_int(props, "bitrate", ModernizedCProgram.obs_module_text("Bitrate"), 50, 300000, 50);
		p.obs_property_int_set_suffix(" Kbps");
		p = obs_property.obs_properties_add_int(props, "max_bitrate", ModernizedCProgram.obs_module_text("MaxBitrate"), 50, 300000, 50);
		p.obs_property_int_set_suffix(" Kbps");
		obs_property.obs_properties_add_int(props, "cqp", ModernizedCProgram.obs_module_text("NVENC.CQLevel"), 1, 30, 1);
		obs_property.obs_properties_add_int(props, "keyint_sec", ModernizedCProgram.obs_module_text("KeyframeIntervalSec"), 0, 10, 1);
		p = obs_property.obs_properties_add_list(props, "preset", ModernizedCProgram.obs_module_text("Preset"), obs_combo_type.OBS_COMBO_TYPE_LIST, obs_combo_format.OBS_COMBO_FORMAT_STRING);
		p.obs_property_list_add_string(ModernizedCProgram.obs_module_text("NVENC.Preset.mq"), "mq");
		p.obs_property_list_add_string(ModernizedCProgram.obs_module_text("NVENC.Preset.hq"), "hq");
		p.obs_property_list_add_string(ModernizedCProgram.obs_module_text("NVENC.Preset.default"), "default");
		p.obs_property_list_add_string(ModernizedCProgram.obs_module_text("NVENC.Preset.hp"), "hp");
		p.obs_property_list_add_string(ModernizedCProgram.obs_module_text("NVENC.Preset.ll"), "ll");
		p.obs_property_list_add_string(ModernizedCProgram.obs_module_text("NVENC.Preset.llhq"), "llhq");
		p.obs_property_list_add_string(ModernizedCProgram.obs_module_text("NVENC.Preset.llhp"), "llhp");
		p = obs_property.obs_properties_add_list(props, "profile", ModernizedCProgram.obs_module_text("Profile"), obs_combo_type.OBS_COMBO_TYPE_LIST, obs_combo_format.OBS_COMBO_FORMAT_STRING);
		p.obs_property_list_add_string("high", "high");
		p.obs_property_list_add_string("main", "main");
		p.obs_property_list_add_string("baseline", "baseline");
		obs_property obs_property = new obs_property();
		if (!ffmpeg) {
			p = obs_property.obs_properties_add_bool(props, "lookahead", ModernizedCProgram.obs_module_text("NVENC.LookAhead"));
			p.obs_property_set_long_description(ModernizedCProgram.obs_module_text("NVENC.LookAhead.ToolTip"));
			p = obs_property.obs_properties_add_bool(props, "psycho_aq", ModernizedCProgram.obs_module_text("NVENC.PsychoVisualTuning"));
			p.obs_property_set_long_description(ModernizedCProgram.obs_module_text("NVENC.PsychoVisualTuning.ToolTip"));
		} 
		obs_property.obs_properties_add_int(props, "gpu", ModernizedCProgram.obs_module_text("GPU"), 0, 8, 1);
		obs_property.obs_properties_add_int(props, "bf", ModernizedCProgram.obs_module_text("BFrames"), 0, 4, 1);
		return props;
	}
	public obs_properties nvenc_properties(Object unused) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(unused);
		obs_properties obs_properties = new obs_properties();
		return obs_properties.nvenc_properties_internal(false);
	}
	public obs_properties nvenc_properties_ffmpeg(Object unused) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(unused);
		obs_properties obs_properties = new obs_properties();
		return obs_properties.nvenc_properties_internal(true);
	}
	public obs_properties sharpness_properties(Object data) {
		obs_properties obs_properties = new obs_properties();
		obs_properties_t props = obs_properties.obs_properties_create();
		obs_property obs_property = new obs_property();
		obs_property.obs_properties_add_float_slider(props, "sharpness", ModernizedCProgram.obs_module_text("Sharpness"), 0.0, 1.0, 0.01);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(data);
		return props;
	}
	public obs_properties jack_input_properties(Object unused) {
		(Object)unused;
		obs_properties obs_properties = new obs_properties();
		obs_properties_t props = obs_properties.obs_properties_create();
		obs_property obs_property = new obs_property();
		obs_property.obs_properties_add_int(props, "channels", ModernizedCProgram.obs_module_text("Channels"), 1, 8, 1);
		obs_property obs_property = new obs_property();
		obs_property.obs_properties_add_bool(props, "startjack", ModernizedCProgram.obs_module_text("StartJACKServer"));
		return props;
	}
	public obs_properties scale_filter_properties(Object data) {
		obs_properties obs_properties = new obs_properties();
		obs_properties_t props = obs_properties.obs_properties_create();
		obs_video_info ovi = new obs_video_info();
		obs_property_t p = new obs_property_t();
		 cx = new ();
		 cy = new ();
		Object[] downscales = new Object[(/*Error: sizeof expression not supported yet*/ / /*Error: Unsupported expression*/)];
		/* ----------------- */ovi.obs_get_video_info();
		Object generatedBase_width = ovi.getBase_width();
		cx = generatedBase_width;
		Object generatedBase_height = ovi.getBase_height();
		cy = generatedBase_height;
		for (size_t i = 0;
		 i < (/*Error: sizeof expression not supported yet*/ / /*Error: Unsupported expression*/); i++) {
			downscales[i].setCx((int)((double)cx / ModernizedCProgram.downscale_vals[i]));
			downscales[i].setCy((int)((double)cy / ModernizedCProgram.downscale_vals[i]));
		}
		obs_property obs_property = new obs_property();
		p = obs_property.obs_properties_add_list(props, "sampling", ModernizedCProgram.obs_module_text("ScaleFiltering"), obs_combo_type.OBS_COMBO_TYPE_LIST, obs_combo_format.OBS_COMBO_FORMAT_STRING);
		p.obs_property_set_modified_callback(sampling_modified);
		p.obs_property_list_add_string(ModernizedCProgram.obs_module_text("ScaleFiltering.Point"), "point");
		p.obs_property_list_add_string(ModernizedCProgram.obs_module_text("ScaleFiltering.Bilinear"), "bilinear");
		p.obs_property_list_add_string(ModernizedCProgram.obs_module_text("ScaleFiltering.Bicubic"), "bicubic");
		p.obs_property_list_add_string(ModernizedCProgram.obs_module_text("ScaleFiltering.Lanczos"), "lanczos");
		p.obs_property_list_add_string(ModernizedCProgram.obs_module_text("ScaleFiltering.Area"), "area");
		p = obs_property.obs_properties_add_list(props, "resolution", ModernizedCProgram.obs_module_text(/* ----------------- */"Resolution"), obs_combo_type.OBS_COMBO_TYPE_EDITABLE, obs_combo_format.OBS_COMBO_FORMAT_STRING);
		p.obs_property_list_add_string(ModernizedCProgram.obs_module_text("None"), ModernizedCProgram.obs_module_text("None"));
		p.obs_property_list_add_string(ModernizedCProgram.obs_module_text("Base.Canvas"), ModernizedCProgram.obs_module_text("Base.Canvas"));
		for (size_t i = 0;
		 i < (/*Error: sizeof expression not supported yet*/ / /*Error: Unsupported expression*/); i++) {
			p.obs_property_list_add_string(ModernizedCProgram.aspects[i], ModernizedCProgram.aspects[i]);
		}
		for (size_t i = 0;
		 i < (/*Error: sizeof expression not supported yet*/ / /*Error: Unsupported expression*/); i++) {
			byte[] str = new byte[32];
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/snprintf(str, 32, "%dx%d", downscales[i].getCx(), downscales[i].getCy());
			p.obs_property_list_add_string(str, str);
		}
		obs_property obs_property = new obs_property();
		obs_property.obs_properties_add_bool(props, "undistort", ModernizedCProgram.obs_module_text("UndistortCenter"));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(/* ----------------- */data);
		return props;
	}
	public obs_properties obs_lua_script_get_properties(obs_script s) {
		obs_lua_script data = (obs_lua_script)s;
		Object generatedScript = data.getScript();
		 script = generatedScript;
		obs_properties_t props = NULL;
		Object generatedLoaded = s.getLoaded();
		if (!generatedLoaded) {
			return NULL;
		} 
		int generatedGet_properties = data.getGet_properties();
		if (generatedGet_properties == LUA_REFNIL) {
			return NULL;
		} 
		ModernizedCProgram.current_lua_script = data;
		Object generatedMutex = data.getMutex();
		ModernizedCProgram.pthread_mutex_lock(generatedMutex);
		ModernizedCProgram.call_func_(script, generatedGet_properties, 0, 1, "script_properties", __FUNCTION__);
		ModernizedCProgram.ls_get_libobs_obj_(script, "obs_properties_t *", -1, props, NULL, __FUNCTION__, 1267);
		ModernizedCProgram.pthread_mutex_unlock(generatedMutex);
		ModernizedCProgram.current_lua_script = NULL;
		return props;
	}
	public obs_properties expander_properties(Object data) {
		obs_properties obs_properties = new obs_properties();
		obs_properties_t props = obs_properties.obs_properties_create();
		obs_property_t p = new obs_property_t();
		obs_property obs_property = new obs_property();
		obs_property_t presets = obs_property.obs_properties_add_list(props, "presets", ModernizedCProgram.obs_module_text("expander.Presets"), obs_combo_type.OBS_COMBO_TYPE_LIST, obs_combo_format.OBS_COMBO_FORMAT_STRING);
		presets.obs_property_list_add_string(ModernizedCProgram.obs_module_text("expander.Presets.Expander"), "expander");
		presets.obs_property_list_add_string(ModernizedCProgram.obs_module_text("expander.Presets.Gate"), "gate");
		presets.obs_property_set_modified_callback(presets_changed);
		obs_property obs_property = new obs_property();
		p = obs_property.obs_properties_add_float_slider(props, "ratio", ModernizedCProgram.obs_module_text("expander.Ratio"), 1.0, 20.0, 0.1);
		p.obs_property_float_set_suffix(":1");
		p = obs_property.obs_properties_add_float_slider(props, "threshold", ModernizedCProgram.obs_module_text("expander.Threshold"), -60.0, 0.0, 0.1);
		p.obs_property_float_set_suffix(" dB");
		obs_property obs_property = new obs_property();
		p = obs_property.obs_properties_add_int_slider(props, "attack_time", ModernizedCProgram.obs_module_text("expander.AttackTime"), 1, 100, 1);
		p.obs_property_int_set_suffix(" ms");
		p = obs_property.obs_properties_add_int_slider(props, "release_time", ModernizedCProgram.obs_module_text("expander.ReleaseTime"), 1, 1000, 1);
		p.obs_property_int_set_suffix(" ms");
		p = obs_property.obs_properties_add_float_slider(props, "output_gain", ModernizedCProgram.obs_module_text("expander.OutputGain"), -32.0, 32.0, 0.1);
		p.obs_property_float_set_suffix(" dB");
		obs_property_t detect = obs_property.obs_properties_add_list(props, "detector", ModernizedCProgram.obs_module_text("expander.Detector"), obs_combo_type.OBS_COMBO_TYPE_LIST, obs_combo_format.OBS_COMBO_FORMAT_STRING);
		detect.obs_property_list_add_string(ModernizedCProgram.obs_module_text("expander.RMS"), "RMS");
		detect.obs_property_list_add_string(ModernizedCProgram.obs_module_text("expander.Peak"), "peak");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(data);
		return props;
	}
	public obs_properties game_capture_properties(Object data) {
		HMONITOR monitor = new HMONITOR();
		uint32_t cx = 1920;
		uint32_t cy = 1080;
		boolean success = !!/*Error: Function owner not recognized*/EnumDisplayMonitors(((Object)0), ((Object)0), /* scaling is free form, this is mostly just to provide some common
			 * values */EnumFirstMonitor, (LPARAM)monitor);
		Object generatedRcMonitor = mi.getRcMonitor();
		if (success) {
			MONITORINFO mi = new MONITORINFO(0);
			mi.setCbSize(/*Error: sizeof expression not supported yet*/);
			if (!!/*Error: Function owner not recognized*/GetMonitorInfoA(monitor, mi)) {
				cx = (uint32_t)(generatedRcMonitor.getRight() - generatedRcMonitor.getLeft());
				cy = (uint32_t)(generatedRcMonitor.getBottom() - generatedRcMonitor.getTop());
			} 
		} 
		obs_source generatedSource = gc.getSource();
		obs_data obs_data = new obs_data();
		if (/* update from deprecated settings */data) {
			game_capture gc = data;
			obs_data_t settings = obs_data.obs_source_get_settings(generatedSource);
			if (settings.using_older_non_mode_format()) {
				boolean any = settings.obs_data_get_bool("capture_any_fullscreen");
				byte mode = any ? "any_fullscreen" : "window";
				settings.obs_data_set_string("capture_mode", mode);
			} 
			settings.obs_data_release();
		} 
		obs_properties obs_properties = new obs_properties();
		obs_properties_t ppts = obs_properties.obs_properties_create();
		obs_property_t p = new obs_property_t();
		obs_property obs_property = new obs_property();
		p = obs_property.obs_properties_add_list(ppts, "capture_mode", ModernizedCProgram.obs_module_text("Mode"), obs_combo_type.OBS_COMBO_TYPE_LIST, obs_combo_format.OBS_COMBO_FORMAT_STRING);
		p.obs_property_list_add_string(ModernizedCProgram.obs_module_text("GameCapture.AnyFullscreen"), "any_fullscreen");
		p.obs_property_list_add_string(ModernizedCProgram.obs_module_text("GameCapture.CaptureWindow"), "window");
		p.obs_property_list_add_string(ModernizedCProgram.obs_module_text("GameCapture.UseHotkey"), "hotkey");
		p.obs_property_set_modified_callback(mode_callback);
		p = obs_property.obs_properties_add_list(ppts, "window", ModernizedCProgram.obs_module_text("WindowCapture.Window"), obs_combo_type.OBS_COMBO_TYPE_LIST, obs_combo_format.OBS_COMBO_FORMAT_STRING);
		p.obs_property_list_add_string("", "");
		p.fill_window_list(window_search_mode.INCLUDE_MINIMIZED, window_not_blacklisted);
		p.obs_property_set_modified_callback(window_changed_callback);
		p = obs_property.obs_properties_add_list(ppts, "priority", ModernizedCProgram.obs_module_text("WindowCapture.Priority"), obs_combo_type.OBS_COMBO_TYPE_LIST, obs_combo_format.OBS_COMBO_FORMAT_INT);
		p.obs_property_list_add_int(ModernizedCProgram.obs_module_text("WindowCapture.Priority.Title"), window_priority.WINDOW_PRIORITY_TITLE);
		p.obs_property_list_add_int(ModernizedCProgram.obs_module_text("WindowCapture.Priority.Class"), window_priority.WINDOW_PRIORITY_CLASS);
		p.obs_property_list_add_int(ModernizedCProgram.obs_module_text("WindowCapture.Priority.Exe"), window_priority.WINDOW_PRIORITY_EXE);
		obs_property obs_property = new obs_property();
		obs_property.obs_properties_add_bool(ppts, "sli_compatibility", ModernizedCProgram.obs_module_text("SLIFix"));
		p = obs_property.obs_properties_add_bool(ppts, "force_scaling", ModernizedCProgram.obs_module_text("GameCapture.ForceScaling"));
		p.obs_property_set_modified_callback(use_scaling_callback);
		p = obs_property.obs_properties_add_list(ppts, "scale_res", ModernizedCProgram.obs_module_text("GameCapture.ScaleRes"), obs_combo_type.OBS_COMBO_TYPE_EDITABLE, obs_combo_format.OBS_COMBO_FORMAT_STRING);
		for (size_t i = 0;
		 i < (/*Error: sizeof expression not supported yet*/ / /*Error: sizeof expression not supported yet*/); i++) {
			byte[] scale_str = new byte[64];
			uint32_t new_cx = (uint32_t)((double)cx / ModernizedCProgram.default_scale_vals[i]) & ~2;
			uint32_t new_cy = (uint32_t)((double)cy / ModernizedCProgram.default_scale_vals[i]) & ~2;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sprintf(scale_str, "%ux%u", new_cx, new_cy);
			p.obs_property_list_add_string(scale_str, scale_str);
		}
		p.obs_property_set_enabled(0);
		obs_property.obs_properties_add_bool(ppts, "allow_transparency", ModernizedCProgram.obs_module_text("AllowTransparency"));
		obs_property.obs_properties_add_bool(ppts, "limit_framerate", ModernizedCProgram.obs_module_text("GameCapture.LimitFramerate"));
		obs_property.obs_properties_add_bool(ppts, "capture_cursor", ModernizedCProgram.obs_module_text("CaptureCursor"));
		obs_property.obs_properties_add_bool(ppts, "anti_cheat_hook", ModernizedCProgram.obs_module_text("GameCapture.AntiCheatHook"));
		obs_property.obs_properties_add_bool(ppts, "capture_overlays", ModernizedCProgram.obs_module_text("GameCapture.CaptureOverlays"));
		p = obs_property.obs_properties_add_list(ppts, "hook_rate", ModernizedCProgram.obs_module_text("GameCapture.HookRate"), obs_combo_type.OBS_COMBO_TYPE_LIST, obs_combo_format.OBS_COMBO_FORMAT_INT);
		p.obs_property_list_add_int(ModernizedCProgram.obs_module_text("GameCapture.HookRate.Slow"), hook_rate.HOOK_RATE_SLOW);
		p.obs_property_list_add_int(ModernizedCProgram.obs_module_text("GameCapture.HookRate.Normal"), hook_rate.HOOK_RATE_NORMAL);
		p.obs_property_list_add_int(ModernizedCProgram.obs_module_text("GameCapture.HookRate.Fast"), hook_rate.HOOK_RATE_FAST);
		p.obs_property_list_add_int(ModernizedCProgram.obs_module_text("GameCapture.HookRate.Fastest"), hook_rate.HOOK_RATE_FASTEST);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(data);
		return ppts;
	}
	public obs_properties noise_gate_properties(Object data) {
		obs_properties obs_properties = new obs_properties();
		obs_properties_t ppts = obs_properties.obs_properties_create();
		obs_property_t p = new obs_property_t();
		obs_property obs_property = new obs_property();
		p = obs_property.obs_properties_add_float_slider(ppts, "close_threshold", ModernizedCProgram.obs_module_text("NoiseGate.CloseThreshold"), -96.0, 0.0, 1.0);
		p.obs_property_float_set_suffix(" dB");
		p = obs_property.obs_properties_add_float_slider(ppts, "open_threshold", ModernizedCProgram.obs_module_text("NoiseGate.OpenThreshold"), -96.0, 0.0, 1.0);
		p.obs_property_float_set_suffix(" dB");
		obs_property obs_property = new obs_property();
		p = obs_property.obs_properties_add_int(ppts, "attack_time", ModernizedCProgram.obs_module_text("NoiseGate.AttackTime"), 0, 10000, 1);
		p.obs_property_int_set_suffix(" ms");
		p = obs_property.obs_properties_add_int(ppts, "hold_time", ModernizedCProgram.obs_module_text("NoiseGate.HoldTime"), 0, 10000, 1);
		p.obs_property_int_set_suffix(" ms");
		p = obs_property.obs_properties_add_int(ppts, "release_time", ModernizedCProgram.obs_module_text("NoiseGate.ReleaseTime"), 0, 10000, 1);
		p.obs_property_int_set_suffix(" ms");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(data);
		return ppts;
	}
	public obs_properties vt_h264_properties(Object unused) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(unused);
		obs_properties obs_properties = new obs_properties();
		obs_properties_t props = obs_properties.obs_properties_create();
		obs_property_t p = new obs_property_t();
		obs_property obs_property = new obs_property();
		p = obs_property.obs_properties_add_int(props, "bitrate", ModernizedCProgram.obs_module_text("Bitrate"), 50, 10000000, 50);
		p.obs_property_int_set_suffix(" Kbps");
		obs_property obs_property = new obs_property();
		p = obs_property.obs_properties_add_bool(props, "limit_bitrate", ModernizedCProgram.obs_module_text("UseMaxBitrate"));
		p.obs_property_set_modified_callback(limit_bitrate_modified);
		p = obs_property.obs_properties_add_int(props, "max_bitrate", ModernizedCProgram.obs_module_text("MaxBitrate"), 50, 10000000, 50);
		p.obs_property_int_set_suffix(" Kbps");
		obs_property obs_property = new obs_property();
		obs_property.obs_properties_add_float(props, "max_bitrate_window", ModernizedCProgram.obs_module_text("MaxBitrateWindow"), 0.1, 10.0, 0.25);
		obs_property.obs_properties_add_int(props, "keyint_sec", ModernizedCProgram.obs_module_text("KeyframeIntervalSec"), 0, 20, 1);
		obs_property obs_property = new obs_property();
		p = obs_property.obs_properties_add_list(props, "profile", ModernizedCProgram.obs_module_text("Profile"), obs_combo_type.OBS_COMBO_TYPE_LIST, obs_combo_format.OBS_COMBO_FORMAT_STRING);
		p.obs_property_list_add_string(ModernizedCProgram.obs_module_text("None"), "");
		p.obs_property_list_add_string("baseline", "baseline");
		p.obs_property_list_add_string("main", "main");
		p.obs_property_list_add_string("high", "high");
		obs_property.obs_properties_add_bool(props, "bframes", ModernizedCProgram.obs_module_text("UseBFrames"));
		return props;
	}
	public obs_properties image_source_properties(Object data) {
		image_source s = data;
		dstr path = new dstr(0);
		obs_properties obs_properties = new obs_properties();
		obs_properties_t props = obs_properties.obs_properties_create();
		Byte generatedFile = s.getFile();
		Object generatedDstr = path.getDstr();
		if (s && generatedFile && generatedFile) {
			byte slash;
			path.dstr_copy(generatedFile);
			path.dstr_replace("\\", "/");
			slash = /*Error: Function owner not recognized*/strrchr(generatedDstr, (byte)'/');
			if (slash) {
				path.dstr_resize(slash - generatedDstr + 1);
			} 
		} 
		obs_property obs_property = new obs_property();
		obs_property.obs_properties_add_path(props, "file", ModernizedCProgram.obs_module_text("File"), obs_path_type.OBS_PATH_FILE, ModernizedCProgram.image_filter, generatedDstr);
		obs_property obs_property = new obs_property();
		obs_property.obs_properties_add_bool(props, "unload", ModernizedCProgram.obs_module_text("UnloadWhenNotShowing"));
		path.dstr_free();
		return props;
	}
	public obs_properties swipe_properties(Object data) {
		obs_properties obs_properties = new obs_properties();
		obs_properties_t ppts = obs_properties.obs_properties_create();
		obs_property_t p = new obs_property_t();
		obs_property obs_property = new obs_property();
		p = obs_property.obs_properties_add_list(ppts, "direction", ModernizedCProgram.obs_module_text("Direction"), obs_combo_type.OBS_COMBO_TYPE_LIST, obs_combo_format.OBS_COMBO_FORMAT_STRING);
		p.obs_property_list_add_string(ModernizedCProgram.obs_module_text("Direction.Left"), "left");
		p.obs_property_list_add_string(ModernizedCProgram.obs_module_text("Direction.Right"), "right");
		p.obs_property_list_add_string(ModernizedCProgram.obs_module_text("Direction.Up"), "up");
		p.obs_property_list_add_string(ModernizedCProgram.obs_module_text("Direction.Down"), "down");
		obs_property obs_property = new obs_property();
		obs_property.obs_properties_add_bool(ppts, "swipe_in", ModernizedCProgram.obs_module_text("SwipeIn"));
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(data);
		return ppts;
	}
	public obs_properties luma_wipe_properties(Object data) {
		obs_properties obs_properties = new obs_properties();
		obs_properties_t props = obs_properties.obs_properties_create();
		luma_wipe_info lwipe = data;
		obs_property_t p = new obs_property_t();
		obs_property obs_property = new obs_property();
		p = obs_property.obs_properties_add_list(props, "luma_image", ModernizedCProgram.obs_module_text("LumaWipe.Image"), obs_combo_type.OBS_COMBO_TYPE_LIST, obs_combo_format.OBS_COMBO_FORMAT_STRING);
		obs_data generatedWipes_list = lwipe.getWipes_list();
		obs_data_item obs_data_item = new obs_data_item();
		obs_data_item_t item = obs_data_item.obs_data_first(generatedWipes_list);
		for (; item != NULL; item.obs_data_item_next()) {
			byte name = item.obs_data_item_get_name();
			byte path = item.obs_data_item_get_string();
			p.obs_property_list_add_string(ModernizedCProgram.obs_module_text(name), path);
		}
		obs_property obs_property = new obs_property();
		obs_property.obs_properties_add_float(props, "luma_softness", ModernizedCProgram.obs_module_text("LumaWipe.Softness"), 0.0, 1.0, 0.05);
		obs_property obs_property = new obs_property();
		obs_property.obs_properties_add_bool(props, "luma_invert", ModernizedCProgram.obs_module_text("LumaWipe.Invert"));
		return props;
	}
	public obs_properties color_key_properties(Object data) {
		obs_properties obs_properties = new obs_properties();
		obs_properties_t props = obs_properties.obs_properties_create();
		obs_property obs_property = new obs_property();
		obs_property_t p = obs_property.obs_properties_add_list(props, "key_color_type", ModernizedCProgram.obs_module_text("KeyColorType"), obs_combo_type.OBS_COMBO_TYPE_LIST, obs_combo_format.OBS_COMBO_FORMAT_STRING);
		p.obs_property_list_add_string(ModernizedCProgram.obs_module_text("Green"), "green");
		p.obs_property_list_add_string(ModernizedCProgram.obs_module_text("Blue"), "blue");
		p.obs_property_list_add_string(ModernizedCProgram.obs_module_text("Red"), "red");
		p.obs_property_list_add_string(ModernizedCProgram.obs_module_text("Magenta"), "magenta");
		p.obs_property_list_add_string(ModernizedCProgram.obs_module_text("CustomColor"), "custom");
		p.obs_property_set_modified_callback(key_type_changed);
		obs_property obs_property = new obs_property();
		obs_property.obs_properties_add_color(props, "key_color", ModernizedCProgram.obs_module_text("KeyColor"));
		obs_property obs_property = new obs_property();
		obs_property.obs_properties_add_int_slider(props, "similarity", ModernizedCProgram.obs_module_text("Similarity"), 1, 1000, 1);
		obs_property.obs_properties_add_int_slider(props, "smoothness", ModernizedCProgram.obs_module_text("Smoothness"), 1, 1000, 1);
		obs_property.obs_properties_add_int_slider(props, "opacity", ModernizedCProgram.obs_module_text("Opacity"), 0, 100, 1);
		obs_property obs_property = new obs_property();
		obs_property.obs_properties_add_float_slider(props, "contrast", ModernizedCProgram.obs_module_text("Contrast"), -1.0, 1.0, 0.01);
		obs_property.obs_properties_add_float_slider(props, "brightness", ModernizedCProgram.obs_module_text("Brightness"), -1.0, 1.0, 0.01);
		obs_property.obs_properties_add_float_slider(props, "gamma", ModernizedCProgram.obs_module_text("Gamma"), -1.0, 1.0, 0.01);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(data);
		return props;
	}
	public obs_properties obs_get_encoder_properties(Object id) {
		obs_encoder_info obs_encoder_info = new obs_encoder_info();
		obs_encoder_info ei = obs_encoder_info.find_encoder(id);
		if (ei && (ei.getGet_properties() || ei.getGet_properties2())) {
			obs_data_t defaults = ei.get_defaults();
			obs_properties_t properties = NULL;
			if (ei.getGet_properties2()) {
				properties = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(NULL, ei.getType_data());
			}  else if (ei.getGet_properties()) {
				properties = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(NULL);
			} 
			ModernizedCProgram.obs_properties_apply_settings(properties, defaults);
			defaults.obs_data_release();
			return properties;
		} 
		return NULL;
	}
	public obs_properties obs_encoder_properties(Object encoder) {
		if (!ModernizedCProgram.obs_object_valid(encoder, "obs_encoder_properties", "encoder")) {
			return NULL;
		} 
		if (encoder.getOrig_info().getGet_properties2()) {
			obs_properties_t props = new obs_properties_t();
			props = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(encoder.getContext().getData(), encoder.getOrig_info().getType_data());
			ModernizedCProgram.obs_properties_apply_settings(props, encoder.getContext().getSettings());
			return props;
		}  else if (encoder.getOrig_info().getGet_properties()) {
			obs_properties_t props = new obs_properties_t();
			props = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(encoder.getContext().getData());
			ModernizedCProgram.obs_properties_apply_settings(props, encoder.getContext().getSettings());
			return props;
		} 
		return NULL;
	}
	public obs_properties wc_properties(Object unused) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(unused);
		obs_properties obs_properties = new obs_properties();
		obs_properties_t ppts = obs_properties.obs_properties_create();
		obs_property_t p = new obs_property_t();
		obs_property obs_property = new obs_property();
		p = obs_property.obs_properties_add_list(ppts, "window", ModernizedCProgram.obs_module_text("WindowCapture.Window"), obs_combo_type.OBS_COMBO_TYPE_LIST, obs_combo_format.OBS_COMBO_FORMAT_STRING);
		p.fill_window_list(window_search_mode.EXCLUDE_MINIMIZED, ((Object)0));
		p = obs_property.obs_properties_add_list(ppts, "priority", ModernizedCProgram.obs_module_text("WindowCapture.Priority"), obs_combo_type.OBS_COMBO_TYPE_LIST, obs_combo_format.OBS_COMBO_FORMAT_INT);
		p.obs_property_list_add_int(ModernizedCProgram.obs_module_text("WindowCapture.Priority.Title"), window_priority.WINDOW_PRIORITY_TITLE);
		p.obs_property_list_add_int(ModernizedCProgram.obs_module_text("WindowCapture.Priority.Class"), window_priority.WINDOW_PRIORITY_CLASS);
		p.obs_property_list_add_int(ModernizedCProgram.obs_module_text("WindowCapture.Priority.Exe"), window_priority.WINDOW_PRIORITY_EXE);
		obs_property obs_property = new obs_property();
		obs_property.obs_properties_add_bool(ppts, "cursor", ModernizedCProgram.obs_module_text("CaptureCursor"));
		obs_property.obs_properties_add_bool(ppts, "compatibility", ModernizedCProgram.obs_module_text("Compatibility"));
		return ppts;
	}
	public obs_properties obs_get_service_properties(Object id) {
		obs_service_info info = id.find_service();
		if (info && info.getGet_properties()) {
			obs_data_t defaults = info.get_defaults();
			obs_properties_t properties = new obs_properties_t();
			properties = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(NULL);
			ModernizedCProgram.obs_properties_apply_settings(properties, defaults);
			defaults.obs_data_release();
			return properties;
		} 
		return NULL;
	}
	public obs_properties obs_service_properties(Object service) {
		if (!ModernizedCProgram.obs_object_valid(service, "obs_service_properties", "service")) {
			return NULL;
		} 
		if (service.getInfo().getGet_properties()) {
			obs_properties_t props = new obs_properties_t();
			props = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(service.getContext().getData());
			ModernizedCProgram.obs_properties_apply_settings(props, service.getContext().getSettings());
			return props;
		} 
		return NULL;
	}
	public obs_properties obs_properties_create() {
		obs_properties props = new obs_properties();
		props = ModernizedCProgram.bzalloc(/*Error: Unsupported expression*/);
		obs_property generatedFirst_property = props.getFirst_property();
		props.setLast(generatedFirst_property);
		return props;
	}
	public void obs_properties_set_param(Object param, Object destroy) {
		if (!props) {
			return /*Error: Unsupported expression*/;
		} 
		Object generatedParam = this.getParam();
		Object generatedDestroy = this.getDestroy();
		if (generatedParam && generatedDestroy) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedParam);
		} 
		this.setParam(param);
		this.setDestroy(destroy);
	}
	public void obs_properties_set_flags(Object flags) {
		if (props) {
			this.setFlags(flags);
		} 
	}
	public Object obs_properties_get_flags() {
		Object generatedFlags = this.getFlags();
		return props ? generatedFlags : 0;
	}
	public Object obs_properties_get_param() {
		Object generatedParam = this.getParam();
		return props ? generatedParam : NULL;
	}
	public obs_properties obs_properties_create_param(Object param, Object destroy) {
		obs_properties obs_properties = new obs_properties();
		obs_properties props = obs_properties.obs_properties_create();
		props.obs_properties_set_param(param, destroy);
		return props;
	}
	public void obs_properties_destroy() {
		obs_property generatedFirst_property = this.getFirst_property();
		Object generatedDestroy = this.getDestroy();
		Object generatedParam = this.getParam();
		obs_property generatedNext = p.getNext();
		if (props) {
			obs_property p = generatedFirst_property;
			if (generatedDestroy && generatedParam) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedParam);
			} 
			while (p) {
				obs_property next = generatedNext;
				p.obs_property_destroy();
				p = next;
			}
			ModernizedCProgram.bfree(props);
		} 
	}
	public obs_properties obs_properties_get_parent() {
		obs_property generatedParent = this.getParent();
		return generatedParent ? generatedParent : NULL;
	}
	public void obs_properties_remove_by_name(Object name) {
		if (!props) {
			return /*Error: Unsupported expression*/;
		} 
		obs_property generatedFirst_property = this.getFirst_property();
		obs_property cur = generatedFirst_property;
		obs_property prev = generatedFirst_property;
		Byte generatedName = cur.getName();
		obs_property generatedNext = cur.getNext();
		obs_property_type generatedType = cur.getType();
		obs_properties obs_properties = new obs_properties();
		while (cur) {
			if (/*Error: Function owner not recognized*/strcmp(generatedName, name) == 0) {
				prev.setNext(generatedNext);
				cur.setNext(0);
				cur.obs_property_destroy();
				break;
			} 
			if (generatedType == obs_property_type.OBS_PROPERTY_GROUP) {
				obs_properties.obs_property_group_content(cur).obs_properties_remove_by_name(name);
			} 
			prev = cur;
			cur = generatedNext;
		}
	}
	public obs_properties get_topmost_parent() {
		obs_properties_t parent = props;
		obs_properties_t last_parent = parent;
		while (parent) {
			last_parent = parent;
			parent = parent.obs_properties_get_parent();
		}
		return last_parent;
	}
	public Object contains_prop(Object name) {
		obs_property generatedFirst_property = this.getFirst_property();
		obs_property p = generatedFirst_property;
		Byte generatedName = p.getName();
		obs_property_type generatedType = p.getType();
		obs_properties obs_properties = new obs_properties();
		obs_property generatedNext = p.getNext();
		while (p) {
			if (/*Error: Function owner not recognized*/strcmp(generatedName, name) == 0) {
				ModernizedCProgram.blog(LOG_WARNING, "Property '%s' exists", name);
				return true;
			} 
			if (generatedType == obs_property_type.OBS_PROPERTY_GROUP) {
				if (obs_properties.obs_property_group_content(p).contains_prop(name)) {
					return true;
				} 
			} 
			p = generatedNext;
		}
		return false;
	}
	public Object has_prop(Object name) {
		return props.get_topmost_parent().contains_prop(name);
	}
	public Object check_property_group_recursion(obs_properties group) {
		obs_property generatedFirst_property = group.getFirst_property();
		obs_property_t current_property = generatedFirst_property;
		obs_property_type generatedType = current_property.getType();
		obs_properties obs_properties = new obs_properties();
		obs_property generatedNext = current_property.getNext();
		while (current_property) {
			if (generatedType == obs_property_type.OBS_PROPERTY_GROUP) {
				obs_properties_t cprops = obs_properties.obs_property_group_content(current_property);
				if (cprops == parent) {
					return /* Contains find_props */true;
				}  else if (cprops == group/* Contains self, shouldn't be possible but
								 * lets verify anyway. */) {
					return true;
				} 
				cprops.check_property_group_recursion(group);
			} 
			current_property = generatedNext;
		}
		return false;
	}
	public Object check_property_group_duplicates(obs_properties group) {
		obs_property generatedFirst_property = group.getFirst_property();
		obs_property_t current_property = generatedFirst_property;
		Byte generatedName = current_property.getName();
		obs_property generatedNext = current_property.getNext();
		while (current_property) {
			if (parent.has_prop(generatedName)) {
				return true;
			} 
			current_property = generatedNext;
		}
		return false;
	}
	public obs_properties obs_property_group_content(obs_property p) {
		group_data data = p.get_type_data(obs_property_type.OBS_PROPERTY_GROUP);
		obs_properties generatedContent = data.getContent();
		return data ? generatedContent : NULL;
	}
	public obs_properties obs_lua_source_get_properties(Object data) {
		obs_lua_data ld = data;
		obs_lua_source generatedLs = ld.getLs();
		obs_lua_source ls = generatedLs;
		obs_properties_t props = NULL;
		Object generatedDefinition_mutex = ls.getDefinition_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedDefinition_mutex);
		Object generatedScript = ls.getScript();
		if (!generatedScript) {
			;
		} 
		int generatedFunc_get_properties = ls.getFunc_get_properties();
		if (!(generatedFunc_get_properties != LUA_REFNIL)) {
			;
		} 
		obs_lua_script generatedData = ls.getData();
		obs_lua_script __data = generatedData;
		obs_lua_script __prev_script = ModernizedCProgram.current_lua_script;
		ModernizedCProgram.current_lua_script = __data;
		Object generatedMutex = __data.getMutex();
		ModernizedCProgram.pthread_mutex_lock(generatedMutex);
		;
		int generatedLua_data_ref = ld.getLua_data_ref();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/lua_rawgeti(generatedScript, LUA_REGISTRYINDEX, generatedLua_data_ref);
		Object generatedDisplay_name = ls.getDisplay_name();
		Object generatedId = ls.getId();
		if (ModernizedCProgram.call_func_(generatedScript, generatedFunc_get_properties, 1, 1, "get_properties", generatedDisplay_name)) {
			ModernizedCProgram.ls_get_libobs_obj_(generatedScript, "obs_properties_t *", -1, props, generatedId, __FUNCTION__, 361);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/lua_pop(generatedScript, 1);
		} 
		ModernizedCProgram.pthread_mutex_unlock(generatedMutex);
		ModernizedCProgram.current_lua_script = __prev_script;
		;
		return props;
	}
	public obs_properties async_delay_filter_properties(Object data) {
		obs_properties obs_properties = new obs_properties();
		obs_properties_t props = obs_properties.obs_properties_create();
		obs_property obs_property = new obs_property();
		obs_property_t p = obs_property.obs_properties_add_int(props, "delay_ms", ModernizedCProgram.obs_module_text("DelayMs"), 0, 20000, 1);
		p.obs_property_int_set_suffix(" ms");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(data);
		return props;
	}
	public obs_properties alsa_get_properties(Object unused) {
		Object hints;
		Object hint;
		byte name = ((Object)0);
		byte descr = ((Object)0);
		byte io = ((Object)0);
		byte descr_i;
		obs_properties_t props = new obs_properties_t();
		obs_property_t devices = new obs_property_t();
		obs_property_t rate = new obs_property_t();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(unused);
		obs_properties obs_properties = new obs_properties();
		props = obs_properties.obs_properties_create();
		obs_property obs_property = new obs_property();
		devices = obs_property.obs_properties_add_list(props, "device_id", ModernizedCProgram.obs_module_text("Device"), obs_combo_type.OBS_COMBO_TYPE_LIST, obs_combo_format.OBS_COMBO_FORMAT_STRING);
		devices.obs_property_list_add_string("Default", "default");
		obs_property obs_property = new obs_property();
		obs_property.obs_properties_add_text(props, "custom_pcm", ModernizedCProgram.obs_module_text("PCM"), obs_text_type.OBS_TEXT_DEFAULT);
		rate = obs_property.obs_properties_add_list(props, "rate", ModernizedCProgram.obs_module_text("Rate"), obs_combo_type.OBS_COMBO_TYPE_LIST, obs_combo_format.OBS_COMBO_FORMAT_INT);
		devices.obs_property_set_modified_callback(ModernizedCProgram.alsa_devices_changed);
		rate.obs_property_list_add_int("32000 Hz", 32000);
		rate.obs_property_list_add_int("44100 Hz", 44100);
		rate.obs_property_list_add_int("48000 Hz", 48000);
		if (/*Error: Function owner not recognized*/snd_device_name_hint(-1, "pcm", hints) < 0) {
			return props;
		} 
		hint = hints;
		devices.obs_property_list_add_string("Custom", "__custom__");
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/snd_device_name_free_hint(hints);
		return props;
	}
	public obs_properties enc_properties(Object unused) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(unused);
		obs_properties obs_properties = new obs_properties();
		obs_properties_t props = obs_properties.obs_properties_create();
		obs_property obs_property = new obs_property();
		obs_property.obs_properties_add_int(props, "bitrate", ModernizedCProgram.obs_module_text("Bitrate"), 64, 1024, 32);
		return props;
	}
	/**
	 * Device removed callback
	 *
	 * We stop recording here so we don't block the device node
	 */
	public obs_properties v4l2_properties(Object vptr) {
		v4l2_data data = vptr;
		;
		obs_properties obs_properties = new obs_properties();
		obs_properties_t props = obs_properties.obs_properties_create();
		obs_property obs_property = new obs_property();
		obs_property_t device_list = obs_property.obs_properties_add_list(props, "device_id", ModernizedCProgram.obs_module_text("Device"), obs_combo_type.OBS_COMBO_TYPE_LIST, obs_combo_format.OBS_COMBO_FORMAT_STRING);
		obs_property_t input_list = obs_property.obs_properties_add_list(props, "input", ModernizedCProgram.obs_module_text("Input"), obs_combo_type.OBS_COMBO_TYPE_LIST, obs_combo_format.OBS_COMBO_FORMAT_INT);
		obs_property_t format_list = obs_property.obs_properties_add_list(props, "pixelformat", ModernizedCProgram.obs_module_text("VideoFormat"), obs_combo_type.OBS_COMBO_TYPE_LIST, obs_combo_format.OBS_COMBO_FORMAT_INT);
		obs_property_t standard_list = obs_property.obs_properties_add_list(props, "standard", ModernizedCProgram.obs_module_text("VideoStandard"), obs_combo_type.OBS_COMBO_TYPE_LIST, obs_combo_format.OBS_COMBO_FORMAT_INT);
		standard_list.obs_property_set_visible(false);
		obs_property_t dv_timing_list = obs_property.obs_properties_add_list(props, "dv_timing", ModernizedCProgram.obs_module_text("DVTiming"), obs_combo_type.OBS_COMBO_TYPE_LIST, obs_combo_format.OBS_COMBO_FORMAT_INT);
		dv_timing_list.obs_property_set_visible(false);
		obs_property_t resolution_list = obs_property.obs_properties_add_list(props, "resolution", ModernizedCProgram.obs_module_text("Resolution"), obs_combo_type.OBS_COMBO_TYPE_LIST, obs_combo_format.OBS_COMBO_FORMAT_INT);
		obs_property.obs_properties_add_list(props, "framerate", ModernizedCProgram.obs_module_text("FrameRate"), obs_combo_type.OBS_COMBO_TYPE_LIST, obs_combo_format.OBS_COMBO_FORMAT_INT);
		obs_property_t color_range_list = obs_property.obs_properties_add_list(props, "color_range", ModernizedCProgram.obs_module_text("ColorRange"), obs_combo_type.OBS_COMBO_TYPE_LIST, obs_combo_format.OBS_COMBO_FORMAT_INT);
		color_range_list.obs_property_list_add_int(ModernizedCProgram.obs_module_text("ColorRange.Default"), VIDEO_RANGE_DEFAULT);
		color_range_list.obs_property_list_add_int(ModernizedCProgram.obs_module_text("ColorRange.Partial"), VIDEO_RANGE_PARTIAL);
		color_range_list.obs_property_list_add_int(ModernizedCProgram.obs_module_text("ColorRange.Full"), VIDEO_RANGE_FULL);
		obs_property obs_property = new obs_property();
		obs_property.obs_properties_add_bool(props, "buffering", ModernizedCProgram.obs_module_text("UseBuffering"));
		obs_source generatedSource = data.getSource();
		obs_data obs_data = new obs_data();
		obs_data_t settings = obs_data.obs_source_get_settings(generatedSource);
		ModernizedCProgram.v4l2_device_list(device_list, settings);
		settings.obs_data_release();
		device_list.obs_property_set_modified_callback(device_selected);
		input_list.obs_property_set_modified_callback(input_selected);
		format_list.obs_property_set_modified_callback(format_selected);
		resolution_list.obs_property_set_modified_callback(resolution_selected);
		return props;
	}
	public Object getParam() {
		return param;
	}
	public void setParam(Object newParam) {
		param = newParam;
	}
	public Object getDestroy() {
		return destroy;
	}
	public void setDestroy(Object newDestroy) {
		destroy = newDestroy;
	}
	public Object getFlags() {
		return flags;
	}
	public void setFlags(Object newFlags) {
		flags = newFlags;
	}
	public obs_property getFirst_property() {
		return first_property;
	}
	public void setFirst_property(obs_property newFirst_property) {
		first_property = newFirst_property;
	}
	public obs_property getLast() {
		return last;
	}
	public void setLast(obs_property newLast) {
		last = newLast;
	}
	public obs_property getParent() {
		return parent;
	}
	public void setParent(obs_property newParent) {
		parent = newParent;
	}
}

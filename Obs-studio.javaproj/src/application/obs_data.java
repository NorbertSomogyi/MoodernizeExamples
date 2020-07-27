package application;

public class obs_data {
	private Object ref;
	private Byte json;
	private obs_data_item first_item;
	
	public obs_data(Object ref, Byte json, obs_data_item first_item) {
		setRef(ref);
		setJson(json);
		setFirst_item(first_item);
	}
	public obs_data() {
	}
	
	public void pulse_defaults() {
		settings.obs_data_set_default_string("device_id", "default"/**
		 * Returns the name of the plugin
		 */);
	}
	public void pulse_update(Object vptr) {
		pulse_data data = vptr;
		;
		 restart = false;
		byte new_device;
		new_device = settings.obs_data_get_string("device_id");
		Byte generatedDevice = data.getDevice();
		if (!generatedDevice || /*Error: Function owner not recognized*/strcmp(generatedDevice, new_device) != 0) {
			if (generatedDevice) {
				ModernizedCProgram.bfree(generatedDevice);
			} 
			data.setDevice(ModernizedCProgram.bstrdup(new_device));
			restart = true;
		} 
		if (!restart) {
			return /*Error: Unsupported expression*/;
		} 
		Object generatedStream = data.getStream();
		if (generatedStream) {
			data.pulse_stop_recording();
		} 
		data/**
		 * Create the plugin object
		 */.pulse_start_recording();
	}
	public void fade_to_color_update(Object data) {
		fade_to_color_info fade_to_color = data;
		 color = ()settings.obs_data_get_int("color");
		 swp = ()settings.obs_data_get_int("switch_point");
		color |=  -1024;
		vec4 generatedColor = fade_to_color.getColor();
		generatedColor.vec4_from_rgba(color);
		fade_to_color.setSwitch_point((double)swp / 100.0);
	}
	public void fade_to_color_defaults() {
		settings.obs_data_set_default_int("color", -1024);
		settings.obs_data_set_default_int("switch_point", 50);
	}
	public void limiter_update(Object data) {
		limiter_data cd = data;
		uint32_t sample_rate = ModernizedCProgram.audio_output_get_sample_rate(ModernizedCProgram.obs_get_audio());
		 num_channels = ModernizedCProgram.audio_output_get_channels(ModernizedCProgram.obs_get_audio());
		double attack_time_ms = 0.001;
		double release_time_ms = (double)ModernizedCProgram.s.obs_data_get_int("release_time");
		double output_gain_db = 0;
		cd.setThreshold((double)ModernizedCProgram.s.obs_data_get_double("threshold"));
		cd.setAttack_gain(ModernizedCProgram.gain_coefficient(sample_rate, attack_time_ms / ((double)1000)));
		cd.setRelease_gain(ModernizedCProgram.gain_coefficient(sample_rate, release_time_ms / ((double)1000)));
		cd.setOutput_gain(ModernizedCProgram.db_to_mul(output_gain_db));
		cd.setNum_channels(num_channels);
		cd.setSample_rate(sample_rate);
		cd.setSlope(1.0);
		 sample_len = sample_rate * 10 / 1000;
		Object generatedEnvelope_buf_len = cd.getEnvelope_buf_len();
		if (generatedEnvelope_buf_len == 0) {
			cd.resize_env_buffer(sample_len);
		} 
	}
	public void limiter_defaults() {
		ModernizedCProgram.s.obs_data_set_default_double("threshold", -6.0);
		ModernizedCProgram.s.obs_data_set_default_int("release_time", 60);
	}
	public void chroma_key_update(Object data) {
		chroma_key_filter_data filter = data;
		ModernizedCProgram.color_settings_update(filter, settings);
		ModernizedCProgram.chroma_settings_update(filter, settings);
	}
	public void chroma_key_defaults() {
		settings.obs_data_set_default_int("opacity", 100);
		settings.obs_data_set_default_double("contrast", 0.0);
		settings.obs_data_set_default_double("brightness", 0.0);
		settings.obs_data_set_default_double("gamma", 0.0);
		settings.obs_data_set_default_int("key_color", -1024);
		settings.obs_data_set_default_string("key_color_type", "green");
		settings.obs_data_set_default_int("similarity", 400);
		settings.obs_data_set_default_int("smoothness", 80);
		settings.obs_data_set_default_int("spill", 100);
	}
	public void color_source_update(Object data) {
		color_source context = data;
		 color = ()settings.obs_data_get_int("color");
		 width = ()settings.obs_data_get_int("width");
		 height = ()settings.obs_data_get_int("height");
		context.setColor(color);
		context.setWidth(width);
		context.setHeight(height);
	}
	public void color_source_defaults() {
		settings.obs_data_set_default_int("color", -1024);
		settings.obs_data_set_default_int("width", 400);
		settings.obs_data_set_default_int("height", 400);
	}
	public void ft2_source_update(Object data) {
		ft2_source srcdata = data;
		obs_data_t font_obj = settings.obs_data_get_obj("font");
		 vbuf_needs_update = false;
		 word_wrap = false;
		[] color = new ();
		 custom_width = 0;
		byte font_name = font_obj.obs_data_get_string("face");
		byte font_style = font_obj.obs_data_get_string("style");
		 font_size = ()font_obj.obs_data_get_int("size");
		 font_flags = ()font_obj.obs_data_get_int("flags");
		if (!font_obj) {
			return /*Error: Unsupported expression*/;
		} 
		srcdata.setDrop_shadow(settings.obs_data_get_bool("drop_shadow"));
		srcdata.setOutline_text(settings.obs_data_get_bool("outline"));
		word_wrap = settings.obs_data_get_bool("word_wrap");
		color[0] = ()settings.obs_data_get_int("color1");
		color[1] = ()settings.obs_data_get_int("color2");
		custom_width = ()settings.obs_data_get_int("custom_width");
		Object generatedCustom_width = srcdata.getCustom_width();
		if (custom_width >= 100) {
			if (custom_width != generatedCustom_width) {
				srcdata.setCustom_width(custom_width);
				vbuf_needs_update = true;
			} 
		} else {
				if (generatedCustom_width >= 100) {
					vbuf_needs_update = true;
				} 
				srcdata.setCustom_width(0);
		} 
		Object generatedWord_wrap = srcdata.getWord_wrap();
		if (word_wrap != generatedWord_wrap) {
			srcdata.setWord_wrap(word_wrap);
			vbuf_needs_update = true;
		} 
		Object generatedColor = srcdata.getColor();
		if (color[0] != generatedColor[0] || color[1] != generatedColor[1]) {
			generatedColor[0] = color[0];
			generatedColor[1] = color[1];
			vbuf_needs_update = true;
		} 
		 from_file = settings.obs_data_get_bool("from_file");
		 chat_log_mode = settings.obs_data_get_bool("log_mode");
		 log_lines = ()settings.obs_data_get_int("log_lines");
		Object generatedLog_lines = srcdata.getLog_lines();
		if (generatedLog_lines != log_lines) {
			srcdata.setLog_lines(log_lines);
			vbuf_needs_update = true;
		} 
		srcdata.setLog_mode(chat_log_mode);
		if (ModernizedCProgram.ft2_lib == NULL) {
			;
		} 
		Object generatedDraw_effect = srcdata.getDraw_effect();
		obs_module obs_module = new obs_module();
		gs_effect gs_effect = new gs_effect();
		if (generatedDraw_effect == NULL) {
			byte effect_file = NULL;
			byte error_string = NULL;
			effect_file = obs_module.obs_current_module().obs_find_module_file("text_default.effect");
			if (effect_file) {
				ModernizedCProgram.obs_enter_graphics();
				srcdata.setDraw_effect(gs_effect.gs_effect_create_from_file(effect_file, ModernizedCProgram.error_string));
				ModernizedCProgram.obs_leave_graphics();
				ModernizedCProgram.bfree(effect_file);
				if (ModernizedCProgram.error_string != NULL) {
					ModernizedCProgram.bfree(ModernizedCProgram.error_string);
				} 
			} 
		} 
		Object generatedFont_size = srcdata.getFont_size();
		Object generatedFrom_file = srcdata.getFrom_file();
		if (generatedFont_size != font_size || generatedFrom_file != from_file) {
			vbuf_needs_update = true;
		} 
		srcdata.setFile_load_failed(false);
		srcdata.setFrom_file(from_file);
		Byte generatedFont_name = srcdata.getFont_name();
		Byte generatedFont_style = srcdata.getFont_style();
		Object generatedFont_flags = srcdata.getFont_flags();
		if (generatedFont_name != NULL) {
			if (/*Error: Function owner not recognized*/strcmp(font_name, generatedFont_name) == 0 && /*Error: Function owner not recognized*/strcmp(font_style, generatedFont_style) == 0 && font_flags == generatedFont_flags && font_size == generatedFont_size) {
				;
			} 
			ModernizedCProgram.bfree(generatedFont_name);
			ModernizedCProgram.bfree(generatedFont_style);
			srcdata.setFont_name(NULL);
			srcdata.setFont_style(NULL);
			srcdata.setMax_h(0);
			vbuf_needs_update = true;
		} 
		srcdata.setFont_name(ModernizedCProgram.bstrdup(font_name));
		srcdata.setFont_style(ModernizedCProgram.bstrdup(font_style));
		srcdata.setFont_size(font_size);
		srcdata.setFont_flags(font_flags);
		Object generatedFont_face = srcdata.getFont_face();
		if (!srcdata.init_font() || generatedFont_face == NULL) {
			ModernizedCProgram.blog(LOG_WARNING, "FT2-text: Failed to load font %s", generatedFont_name);
			;
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/FT_Set_Pixel_Sizes(generatedFont_face, 0, generatedFont_size);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/FT_Select_Charmap(generatedFont_face, FT_ENCODING_UNICODE);
		} 
		Object[] generatedTexbuf = srcdata.getTexbuf();
		if (generatedTexbuf != NULL) {
			ModernizedCProgram.bfree(generatedTexbuf);
			srcdata.setTexbuf(NULL);
		} 
		srcdata.setTexbuf(ModernizedCProgram.bzalloc(ModernizedCProgram.texbuf_w * ModernizedCProgram.texbuf_h));
		if (generatedFont_face) {
			srcdata.cache_standard_glyphs();
		} 
		Object[] generatedText = srcdata.getText();
		if (generatedFont_face) {
			srcdata.cache_glyphs(generatedText);
			srcdata.set_up_vertex_buffer();
		} 
	}
	public void crop_filter_update(Object data) {
		crop_filter_data filter = data;
		filter.setAbsolute(!settings.obs_data_get_bool("relative"));
		filter.setLeft((int)settings.obs_data_get_int("left"));
		filter.setTop((int)settings.obs_data_get_int("top"));
		filter.setRight((int)settings.obs_data_get_int("right"));
		filter.setBottom((int)settings.obs_data_get_int("bottom"));
		filter.setAbs_cx((int)settings.obs_data_get_int("cx"));
		filter.setAbs_cy((int)settings.obs_data_get_int("cy"));
	}
	public void crop_filter_defaults() {
		settings.obs_data_set_default_bool("relative", true);
	}
	public void rtmp_stream_defaults() {
		defaults.obs_data_set_default_int("drop_threshold_ms", 700);
		defaults.obs_data_set_default_int("pframe_drop_threshold_ms", 900);
		defaults.obs_data_set_default_int("max_shutdown_time_sec", 30);
		defaults.obs_data_set_default_string("bind_ip", "default");
		defaults.obs_data_set_default_bool("new_socket_loop_enabled", false);
		defaults.obs_data_set_default_bool("low_latency_mode_enabled", false);
	}
	public void replay_buffer_defaults() {
		ModernizedCProgram.s.obs_data_set_default_int("max_time_sec", 15);
		ModernizedCProgram.s.obs_data_set_default_int("max_size_mb", 500);
		ModernizedCProgram.s.obs_data_set_default_string("format", "%CCYY-%MM-%DD %hh-%mm-%ss");
		ModernizedCProgram.s.obs_data_set_default_string("extension", "mp4");
		ModernizedCProgram.s.obs_data_set_default_bool("allow_spaces", true);
	}
	public obs_data get_item_obj(obs_data_item item) {
		if (!item) {
			return ((Object)0);
		} 
		obs_data_t data = item.get_item_data();
		if (!data) {
			return ((Object)0);
		} 
		return data;
	}
	public obs_data get_item_default_obj(obs_data_item item) {
		Object generatedDefault_size = item.getDefault_size();
		if (!item || !generatedDefault_size) {
			return ((Object)0);
		} 
		return (obs_data_t)item.get_default_data_ptr();
	}
	public obs_data get_item_autoselect_obj(obs_data_item item) {
		Object generatedAutoselect_size = item.getAutoselect_size();
		if (!item || !generatedAutoselect_size) {
			return ((Object)0);
		} 
		return (obs_data_t)item.get_autoselect_data_ptr();
	}
	/* ------------------------------------------------------------------------- */
	public obs_data obs_data_create() {
		obs_data data = ModernizedCProgram.bzalloc(/*Error: Unsupported expression*/);
		data.setRef(1);
		return data;
	}
	public obs_data obs_data_create_from_json(Object json_string) {
		obs_data obs_data = new obs_data();
		obs_data_t data = obs_data.obs_data_create();
		json_error_t error = new json_error_t();
		json_t json_t = new json_t();
		json_t root = json_t.json_loads(json_string, -1024, error);
		Object generatedLine = error.getLine();
		Object generatedText = error.getText();
		if (root) {
			ModernizedCProgram.obs_data_add_json_object_data(data, root);
			root.json_decref();
		} else {
				ModernizedCProgram.blog(LOG_ERROR, "obs-data.c: [obs_data_create_from_json] Failed reading json string (%d): %s", generatedLine, generatedText);
				data.obs_data_release();
				data = ((Object)0);
		} 
		return data;
	}
	public obs_data obs_data_create_from_json_file(Object json_file) {
		byte file_data = ModernizedCProgram.os_quick_read_utf8_file(json_file);
		obs_data_t data = ((Object)0);
		obs_data obs_data = new obs_data();
		if (file_data) {
			data = obs_data.obs_data_create_from_json(file_data);
			ModernizedCProgram.bfree(file_data);
		} 
		return data;
	}
	public obs_data obs_data_create_from_json_file_safe(Object json_file, Object backup_ext) {
		obs_data obs_data = new obs_data();
		obs_data_t file_data = obs_data.obs_data_create_from_json_file(json_file);
		Object generatedDstr = backup_file.getDstr();
		if (!file_data && backup_ext && backup_ext) {
			dstr backup_file = new dstr(0);
			backup_file.dstr_copy(json_file);
			if (backup_ext != (byte)'.') {
				backup_file.dstr_cat(".");
			} 
			backup_file.dstr_cat(backup_ext);
			if (ModernizedCProgram.os_file_exists(generatedDstr)) {
				ModernizedCProgram.blog(LOG_WARNING, "obs-data.c: [obs_data_create_from_json_file_safe] attempting backup file");
				ModernizedCProgram.os_rename(generatedDstr, /* delete current file if corrupt to prevent it from
							 * being backed up again */json_file);
				file_data = obs_data.obs_data_create_from_json_file(json_file);
			} 
			backup_file.dstr_free();
		} 
		return file_data;
	}
	public void obs_data_addref() {
		if (ModernizedCProgram.data) {
			ModernizedCProgram.os_atomic_inc_long(ModernizedCProgram.data.getRef());
		} 
	}
	public void obs_data_destroy() {
		obs_data_item item = ModernizedCProgram.data.getFirst_item();
		obs_data_item generatedNext = item.getNext();
		while (item) {
			obs_data_item next = generatedNext;
			item.obs_data_item_release();
			item = next;
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(ModernizedCProgram.data.getJson());
		ModernizedCProgram.bfree(ModernizedCProgram.data);
	}
	public void obs_data_release() {
		if (!ModernizedCProgram.data) {
			return /*Error: Unsupported expression*/;
		} 
		if (ModernizedCProgram.os_atomic_dec_long(ModernizedCProgram.data.getRef()) == 0) {
			ModernizedCProgram.data.obs_data_destroy();
		} 
	}
	public Object obs_data_get_json() {
		if (!ModernizedCProgram.data) {
			return ((Object)0);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(ModernizedCProgram.data.getJson());
		ModernizedCProgram.data.setJson(((Object)0));
		json_t json_t = new json_t();
		json_t root = json_t.obs_data_to_json(ModernizedCProgram.data);
		ModernizedCProgram.data.setJson(ModernizedCProgram.json_dumps(root, -1024 | ((true) & -1024)));
		root.json_decref();
		return ModernizedCProgram.data.getJson();
	}
	public Object obs_data_save_json(Object file) {
		byte json = ModernizedCProgram.data.obs_data_get_json();
		if (json && json) {
			return ModernizedCProgram.os_quick_write_utf8_file(file, json, /*Error: Function owner not recognized*/strlen(json), false);
		} 
		return false;
	}
	public Object obs_data_save_json_safe(Object file, Object temp_ext, Object backup_ext) {
		byte json = ModernizedCProgram.data.obs_data_get_json();
		if (json && json) {
			return ModernizedCProgram.os_quick_write_utf8_file_safe(file, json, /*Error: Function owner not recognized*/strlen(json), false, temp_ext, backup_ext);
		} 
		return false;
	}
	public void copy_obj(Object name, obs_data obj, Object callback) {
		obs_data obs_data = new obs_data();
		if (obj) {
			obs_data_t new_obj = obs_data.obs_data_create();
			new_obj.obs_data_apply(obj);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/callback(ModernizedCProgram.data, name, new_obj);
			new_obj.obs_data_release();
		} 
	}
	public void obs_data_apply(obs_data apply_data) {
		obs_data_item item = new obs_data_item();
		if (!target || !apply_data || target == apply_data) {
			return /*Error: Unsupported expression*/;
		} 
		obs_data_item generatedFirst_item = apply_data.getFirst_item();
		item = generatedFirst_item;
		obs_data_item generatedNext = item.getNext();
		while (item) {
			ModernizedCProgram.copy_item(target, item);
			item = generatedNext;
		}
	}
	public void obs_data_erase(Object name) {
		obs_data_item obs_data_item = new obs_data_item();
		obs_data_item item = obs_data_item.get_item(ModernizedCProgram.data, name);
		if (item) {
			item.obs_data_item_detach();
			item.obs_data_item_release();
		} 
	}
	public void obs_data_clear() {
		obs_data_item item = new obs_data_item();
		if (!target) {
			return /*Error: Unsupported expression*/;
		} 
		obs_data_item generatedFirst_item = this.getFirst_item();
		item = generatedFirst_item;
		obs_data_item generatedNext = item.getNext();
		while (item) {
			item.clear_item();
			item = generatedNext;
		}
	}
	public void obs_data_set_string(Object name, Object val) {
		ModernizedCProgram.obs_set_string(ModernizedCProgram.data, ((Object)0), name, val, set_item);
	}
	public void obs_data_set_int(Object name, int val) {
		ModernizedCProgram.obs_set_int(ModernizedCProgram.data, ((Object)0), name, val, set_item);
	}
	public void obs_data_set_double(Object name, double val) {
		ModernizedCProgram.obs_set_double(ModernizedCProgram.data, ((Object)0), name, val, set_item);
	}
	public void obs_data_set_bool(Object name, Object val) {
		ModernizedCProgram.obs_set_bool(ModernizedCProgram.data, ((Object)0), name, val, set_item);
	}
	public void obs_data_set_obj(Object name, obs_data obj) {
		ModernizedCProgram.obs_set_obj(ModernizedCProgram.data, ((Object)0), name, obj, set_item);
	}
	public void obs_data_set_default_string(Object name, Object val) {
		ModernizedCProgram.obs_set_string(ModernizedCProgram.data, ((Object)0), name, val, set_item_def);
	}
	public void obs_data_set_default_int(Object name, int val) {
		ModernizedCProgram.obs_set_int(ModernizedCProgram.data, ((Object)0), name, val, set_item_def);
	}
	public void obs_data_set_default_double(Object name, double val) {
		ModernizedCProgram.obs_set_double(ModernizedCProgram.data, ((Object)0), name, val, set_item_def);
	}
	public void obs_data_set_default_bool(Object name, Object val) {
		ModernizedCProgram.obs_set_bool(ModernizedCProgram.data, ((Object)0), name, val, set_item_def);
	}
	public void obs_data_set_default_obj(Object name, obs_data obj) {
		ModernizedCProgram.obs_set_obj(ModernizedCProgram.data, ((Object)0), name, obj, set_item_def);
	}
	public void obs_data_set_autoselect_string(Object name, Object val) {
		ModernizedCProgram.obs_set_string(ModernizedCProgram.data, ((Object)0), name, val, set_item_auto);
	}
	public void obs_data_set_autoselect_int(Object name, int val) {
		ModernizedCProgram.obs_set_int(ModernizedCProgram.data, ((Object)0), name, val, set_item_auto);
	}
	public void obs_data_set_autoselect_double(Object name, double val) {
		ModernizedCProgram.obs_set_double(ModernizedCProgram.data, ((Object)0), name, val, set_item_auto);
	}
	public void obs_data_set_autoselect_bool(Object name, Object val) {
		ModernizedCProgram.obs_set_bool(ModernizedCProgram.data, ((Object)0), name, val, set_item_auto);
	}
	public void obs_data_set_autoselect_obj(Object name, obs_data obj) {
		ModernizedCProgram.obs_set_obj(ModernizedCProgram.data, ((Object)0), name, obj, set_item_auto);
	}
	public Object obs_data_get_string(Object name) {
		obs_data_item obs_data_item = new obs_data_item();
		return obs_data_item.get_item(ModernizedCProgram.data, name).obs_data_item_get_string();
	}
	public int obs_data_get_int(Object name) {
		obs_data_item obs_data_item = new obs_data_item();
		return obs_data_item.get_item(ModernizedCProgram.data, name).obs_data_item_get_int();
	}
	public double obs_data_get_double(Object name) {
		obs_data_item obs_data_item = new obs_data_item();
		return obs_data_item.get_item(ModernizedCProgram.data, name).obs_data_item_get_double();
	}
	public Object obs_data_get_bool(Object name) {
		obs_data_item obs_data_item = new obs_data_item();
		return obs_data_item.get_item(ModernizedCProgram.data, name).obs_data_item_get_bool();
	}
	public obs_data obs_data_get_obj(Object name) {
		obs_data_item obs_data_item = new obs_data_item();
		obs_data obs_data = new obs_data();
		return obs_data.obs_data_item_get_obj(obs_data_item.get_item(ModernizedCProgram.data, name));
	}
	public Object obs_data_get_default_string(Object name) {
		obs_data_item obs_data_item = new obs_data_item();
		return obs_data_item.get_item(ModernizedCProgram.data, name).obs_data_item_get_default_string();
	}
	public int obs_data_get_default_int(Object name) {
		obs_data_item obs_data_item = new obs_data_item();
		return obs_data_item.get_item(ModernizedCProgram.data, name).obs_data_item_get_default_int();
	}
	public double obs_data_get_default_double(Object name) {
		obs_data_item obs_data_item = new obs_data_item();
		return obs_data_item.get_item(ModernizedCProgram.data, name).obs_data_item_get_default_double();
	}
	public Object obs_data_get_default_bool(Object name) {
		obs_data_item obs_data_item = new obs_data_item();
		return obs_data_item.get_item(ModernizedCProgram.data, name).obs_data_item_get_default_bool();
	}
	public obs_data obs_data_get_default_obj(Object name) {
		obs_data_item obs_data_item = new obs_data_item();
		obs_data obs_data = new obs_data();
		return obs_data.obs_data_item_get_default_obj(obs_data_item.get_item(ModernizedCProgram.data, name));
	}
	public Object obs_data_get_autoselect_string(Object name) {
		obs_data_item obs_data_item = new obs_data_item();
		return obs_data_item.get_item(ModernizedCProgram.data, name).obs_data_item_get_autoselect_string();
	}
	public int obs_data_get_autoselect_int(Object name) {
		obs_data_item obs_data_item = new obs_data_item();
		return obs_data_item.get_item(ModernizedCProgram.data, name).obs_data_item_get_autoselect_int();
	}
	public double obs_data_get_autoselect_double(Object name) {
		obs_data_item obs_data_item = new obs_data_item();
		return obs_data_item.get_item(ModernizedCProgram.data, name).obs_data_item_get_autoselect_double();
	}
	public Object obs_data_get_autoselect_bool(Object name) {
		obs_data_item obs_data_item = new obs_data_item();
		return obs_data_item.get_item(ModernizedCProgram.data, name).obs_data_item_get_autoselect_bool();
	}
	public obs_data obs_data_get_autoselect_obj(Object name) {
		obs_data_item obs_data_item = new obs_data_item();
		obs_data obs_data = new obs_data();
		return obs_data.obs_data_item_get_autoselect_obj(obs_data_item.get_item(ModernizedCProgram.data, name));
	}
	public obs_data obs_data_array_item(obs_data_array array, Object idx) {
		obs_data_t data = new obs_data_t();
		if (!array) {
			return ((Object)0);
		} 
		Object generatedObjects = array.getObjects();
		data = (idx < generatedObjects.getNum()) ? generatedObjects.getArray()[idx] : ((Object)0);
		Object generatedRef = data.getRef();
		if (data) {
			ModernizedCProgram.os_atomic_inc_long(generatedRef);
		} 
		return data;
	}
	/* ------------------------------------------------------------------------- */
	/* Item status inspection */
	public Object obs_data_has_user_value(Object name) {
		obs_data_item obs_data_item = new obs_data_item();
		return ModernizedCProgram.data && obs_data_item.get_item(ModernizedCProgram.data, name).obs_data_item_has_user_value();
	}
	public Object obs_data_has_default_value(Object name) {
		obs_data_item obs_data_item = new obs_data_item();
		return ModernizedCProgram.data && obs_data_item.get_item(ModernizedCProgram.data, name).obs_data_item_has_default_value();
	}
	public Object obs_data_has_autoselect_value(Object name) {
		obs_data_item obs_data_item = new obs_data_item();
		return ModernizedCProgram.data && obs_data_item.get_item(ModernizedCProgram.data, name).obs_data_item_has_autoselect_value();
	}
	/* Clearing data values */
	public void obs_data_unset_user_value(Object name) {
		obs_data_item obs_data_item = new obs_data_item();
		obs_data_item.get_item(ModernizedCProgram.data, name).obs_data_item_unset_user_value();
	}
	public void obs_data_unset_default_value(Object name) {
		obs_data_item obs_data_item = new obs_data_item();
		obs_data_item.get_item(ModernizedCProgram.data, name).obs_data_item_unset_default_value();
	}
	public void obs_data_unset_autoselect_value(Object name) {
		obs_data_item obs_data_item = new obs_data_item();
		obs_data_item.get_item(ModernizedCProgram.data, name).obs_data_item_unset_autoselect_value();
	}
	public obs_data data_item_get_obj(obs_data_item item, Object get_obj) {
		obs_data_t obj = item.item_valid(obs_data_type.OBS_DATA_OBJECT) ? /*Error: Function owner not recognized*/get_obj(item) : ((Object)0);
		Object generatedRef = obj.getRef();
		if (obj) {
			ModernizedCProgram.os_atomic_inc_long(generatedRef);
		} 
		return obj;
	}
	public obs_data obs_data_item_get_obj(obs_data_item item) {
		obs_data obs_data = new obs_data();
		return obs_data.data_item_get_obj(item, get_item_obj);
	}
	public obs_data obs_data_item_get_default_obj(obs_data_item item) {
		obs_data obs_data = new obs_data();
		return obs_data.data_item_get_obj(item, get_item_obj);
	}
	public obs_data obs_data_item_get_autoselect_obj(obs_data_item item) {
		obs_data obs_data = new obs_data();
		return obs_data.data_item_get_obj(item, get_item_autoselect_obj);
	}
	public void set_vec2(Object name, Object val, Object set_obj) {
		obs_data obs_data = new obs_data();
		obs_data_t obj = obs_data.obs_data_create();
		obj.obs_data_set_double("x", val.getVec2());
		obj.obs_data_set_double("y", val.getVec2());
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/set_obj(ModernizedCProgram.data, name, obj);
		obj.obs_data_release();
	}
	public void set_vec3(Object name, Object val, Object set_obj) {
		obs_data obs_data = new obs_data();
		obs_data_t obj = obs_data.obs_data_create();
		obj.obs_data_set_double("x", val.getVec3());
		obj.obs_data_set_double("y", val.getVec3());
		obj.obs_data_set_double("z", val.getVec3());
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/set_obj(ModernizedCProgram.data, name, obj);
		obj.obs_data_release();
	}
	public void set_vec4(Object name, Object val, Object set_obj) {
		obs_data obs_data = new obs_data();
		obs_data_t obj = obs_data.obs_data_create();
		obj.obs_data_set_double("x", val.getVec4());
		obj.obs_data_set_double("y", val.getVec4());
		obj.obs_data_set_double("z", val.getVec4());
		obj.obs_data_set_double("w", val.getVec4());
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/set_obj(ModernizedCProgram.data, name, obj);
		obj.obs_data_release();
	}
	public void set_quat(Object name, Object val, Object set_obj) {
		obs_data obs_data = new obs_data();
		obs_data_t obj = obs_data.obs_data_create();
		obj.obs_data_set_double("x", val.getQuat());
		obj.obs_data_set_double("y", val.getQuat());
		obj.obs_data_set_double("z", val.getQuat());
		obj.obs_data_set_double("w", val.getQuat());
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/set_obj(ModernizedCProgram.data, name, obj);
		obj.obs_data_release();
	}
	public void obs_data_set_vec2(Object name, Object val) {
		ModernizedCProgram.data.set_vec2(name, val, ModernizedCProgram.obs_data_set_obj);
	}
	public void obs_data_set_vec3(Object name, Object val) {
		ModernizedCProgram.data.set_vec3(name, val, ModernizedCProgram.obs_data_set_obj);
	}
	public void obs_data_set_vec4(Object name, Object val) {
		ModernizedCProgram.data.set_vec4(name, val, ModernizedCProgram.obs_data_set_obj);
	}
	public void obs_data_set_quat(Object name, Object val) {
		ModernizedCProgram.data.set_quat(name, val, ModernizedCProgram.obs_data_set_obj);
	}
	public void obs_data_set_default_vec2(Object name, Object val) {
		ModernizedCProgram.data.set_vec2(name, val, ModernizedCProgram.obs_data_set_default_obj);
	}
	public void obs_data_set_default_vec3(Object name, Object val) {
		ModernizedCProgram.data.set_vec3(name, val, ModernizedCProgram.obs_data_set_default_obj);
	}
	public void obs_data_set_default_vec4(Object name, Object val) {
		ModernizedCProgram.data.set_vec4(name, val, ModernizedCProgram.obs_data_set_default_obj);
	}
	public void obs_data_set_default_quat(Object name, Object val) {
		ModernizedCProgram.data.set_quat(name, val, ModernizedCProgram.obs_data_set_default_obj);
	}
	public void obs_data_set_autoselect_vec2(Object name, Object val) {
		ModernizedCProgram.data.set_vec2(name, val, ModernizedCProgram.obs_data_set_autoselect_obj);
	}
	public void obs_data_set_autoselect_vec3(Object name, Object val) {
		ModernizedCProgram.data.set_vec3(name, val, ModernizedCProgram.obs_data_set_autoselect_obj);
	}
	public void obs_data_set_autoselect_vec4(Object name, Object val) {
		ModernizedCProgram.data.set_vec4(name, val, ModernizedCProgram.obs_data_set_autoselect_obj);
	}
	public void obs_data_set_autoselect_quat(Object name, Object val) {
		ModernizedCProgram.data.set_quat(name, val, ModernizedCProgram.obs_data_set_autoselect_obj);
	}
	/* Helper functions for media_frames_per_seconds */
	public obs_data make_frames_per_second(Object fps, Object option) {
		obs_data obs_data = new obs_data();
		obs_data_t obj = obs_data.obs_data_create();
		if (!option) {
			obj.obs_data_set_double("numerator", fps.getNumerator());
			obj.obs_data_set_double("denominator", fps.getDenominator());
		} else {
				obj.obs_data_set_string("option", option);
		} 
		return obj;
	}
	public void obs_data_set_frames_per_second(Object name, Object fps, Object option) {
		obs_data obs_data = new obs_data();
		ModernizedCProgram.obs_take_obj(ModernizedCProgram.data, ((Object)0), name, obs_data.make_frames_per_second(fps, option), set_item);
	}
	public void obs_data_set_default_frames_per_second(Object name, Object fps, Object option) {
		obs_data obs_data = new obs_data();
		ModernizedCProgram.obs_take_obj(ModernizedCProgram.data, ((Object)0), name, obs_data.make_frames_per_second(fps, option), set_item_def);
	}
	public void obs_data_set_autoselect_frames_per_second(Object name, Object fps, Object option) {
		obs_data obs_data = new obs_data();
		ModernizedCProgram.obs_take_obj(ModernizedCProgram.data, ((Object)0), name, obs_data.make_frames_per_second(fps, option), set_item_auto);
	}
	public Object get_option(Object option) {
		if (!option) {
			return false;
		} 
		obs_data_item obs_data_item = new obs_data_item();
		obs_data_item opt = obs_data_item.obs_data_item_byname(ModernizedCProgram.data, "option");
		if (!opt) {
			return false;
		} 
		option = opt.obs_data_item_get_string();
		opt.obs_data_item_release();
		ModernizedCProgram.data.obs_data_release();
		return true;
	}
	public Object get_frames_per_second(Object fps, Object option) {
		if (!ModernizedCProgram.data) {
			return false;
		} 
		if (ModernizedCProgram.data.get_option(option)) {
			return true;
		} 
		if (!fps) {
			;
		} 
		obs_data_item obs_data_item = new obs_data_item();
		obs_data_item num = obs_data_item.obs_data_item_byname(ModernizedCProgram.data, "numerator");
		obs_data_item den = obs_data_item.obs_data_item_byname(ModernizedCProgram.data, "denominator");
		if (!num || !den) {
			num.obs_data_item_release();
			den.obs_data_item_release();
			;
		} 
		long num_ll = num.obs_data_item_get_int();
		long den_ll = den.obs_data_item_get_int();
		fps.setNumerator(/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME((num_ll) < 0 ? 0 : ((num_ll) > (long)UINT32_MAX ? (long)UINT32_MAX : (num_ll))));
		fps.setDenominator(/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME((den_ll) < 0 ? 0 : ((den_ll) > (long)UINT32_MAX ? (long)UINT32_MAX : (den_ll))));
		num.obs_data_item_release();
		den.obs_data_item_release();
		ModernizedCProgram.data.obs_data_release();
		return fps.media_frames_per_second_is_valid();
		return false;
	}
	public Object obs_data_get_frames_per_second(Object name, Object fps, Object option) {
		return ModernizedCProgram.data.obs_data_get_obj(name).get_frames_per_second(fps, option);
	}
	public Object obs_data_get_default_frames_per_second(Object name, Object fps, Object option) {
		return ModernizedCProgram.data.obs_data_get_default_obj(name).get_frames_per_second(fps, option);
	}
	public Object obs_data_get_autoselect_frames_per_second(Object name, Object fps, Object option) {
		return ModernizedCProgram.data.obs_data_get_autoselect_obj(name).get_frames_per_second(fps, option);
	}
	public Object vaapi_update(Object data) {
		vaapi_encoder enc = data;
		byte device = settings.obs_data_get_string("vaapi_device");
		int profile = (int)settings.obs_data_get_int("profile");
		int bf = (int)settings.obs_data_get_int("bf");
		int level = (int)settings.obs_data_get_int("level");
		int bitrate = (int)settings.obs_data_get_int("bitrate");
		int keyint_sec = (int)settings.obs_data_get_int("keyint_sec");
		int qp = (int)settings.obs_data_get_int("qp");
		int quality = (int)settings.obs_data_get_int("quality");
		Object generatedContext = enc.getContext();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/av_opt_set_int(generatedContext.getPriv_data(), "qp", qp, 0);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/av_opt_set_int(generatedContext.getPriv_data(), "quality", quality, 0);
		obs_encoder generatedEncoder = enc.getEncoder();
		 video = ModernizedCProgram.obs_encoder_video(generatedEncoder);
		video_output_info voi = ModernizedCProgram.video_output_get_info(video);
		video_scale_info info = new video_scale_info();
		info.setVideo_scale_info(voi.getVideo_output_info());
		info.setVideo_scale_info(voi.getVideo_output_info());
		info.setVideo_scale_info(voi.getVideo_output_info());
		ModernizedCProgram.vaapi_video_info(enc, info);
		generatedContext.setProfile(profile);
		generatedContext.setMax_b_frames(bf);
		generatedContext.setLevel(level);
		generatedContext.setBit_rate(bitrate * 1000);
		generatedContext.setRc_max_rate(bitrate * 1000);
		generatedContext.setWidth(ModernizedCProgram.obs_encoder_get_width(generatedEncoder));
		generatedContext.setHeight(ModernizedCProgram.obs_encoder_get_height(generatedEncoder));
		generatedContext.setTime_base(/*Error: Unsupported expression*/);
		Object generatedVideo_scale_info = info.getVideo_scale_info();
		generatedContext.setPix_fmt(ModernizedCProgram.obs_to_ffmpeg_video_format(generatedVideo_scale_info));
		generatedContext.setColorspace(generatedVideo_scale_info == VIDEO_CS_709 ? AVCOL_SPC_BT709 : AVCOL_SPC_BT470BG);
		generatedContext.setColor_range(generatedVideo_scale_info == VIDEO_RANGE_FULL ? AVCOL_RANGE_JPEG : AVCOL_RANGE_MPEG);
		if (keyint_sec > 0) {
			generatedContext.setGop_size(keyint_sec * voi.getVideo_output_info() / voi.getVideo_output_info());
		} else {
				generatedContext.setGop_size(120);
		} 
		enc.setHeight(generatedContext.getHeight());
		ModernizedCProgram.blog(LOG_INFO, "[FFMPEG VAAPI encoder: '%s'] settings:\n\tdevice:       %s\n\tqp:           %d\n\tquality:      %d\n\tprofile:      %d\n\tlevel:        %d\n\tbitrate:      %d\n\tkeyint:       %d\n\twidth:        %d\n\theight:       %d\n\tb-frames:     %d\n", ModernizedCProgram.obs_encoder_get_name(generatedEncoder), device, qp, quality, profile, level, bitrate, generatedContext.getGop_size(), generatedContext.getWidth(), generatedContext.getHeight(), generatedContext.getMax_b_frames());
		return enc.vaapi_init_codec(device);
	}
	public void vaapi_defaults() {
		settings.obs_data_set_default_string("vaapi_device", "/dev/dri/renderD128");
		settings.obs_data_set_default_int("vaapi_codec", AV_CODEC_ID_H264);
		settings.obs_data_set_default_int("profile", FF_PROFILE_H264_CONSTRAINED_BASELINE);
		settings.obs_data_set_default_int("level", 40);
		settings.obs_data_set_default_int("bitrate", 2500);
		settings.obs_data_set_default_int("keyint_sec", 0);
		settings.obs_data_set_default_int("bf", 0);
		settings.obs_data_set_default_int("qp", 20);
		settings.obs_data_set_default_int("quality", 0);
		settings.obs_data_set_default_int("rendermode", 0);
	}
	public void obs_qsv_defaults() {
		settings.obs_data_set_default_string("target_usage", "balanced");
		settings.obs_data_set_default_int("bitrate", 2500);
		settings.obs_data_set_default_int("max_bitrate", 3000);
		settings.obs_data_set_default_string("profile", "high");
		settings.obs_data_set_default_int("async_depth", 4);
		settings.obs_data_set_default_string("rate_control", "CBR");
		settings.obs_data_set_default_int("accuracy", 1000);
		settings.obs_data_set_default_int("convergence", 1);
		settings.obs_data_set_default_int("qpi", 23);
		settings.obs_data_set_default_int("qpp", 23);
		settings.obs_data_set_default_int("qpb", 23);
		settings.obs_data_set_default_int("icq_quality", 23);
		settings.obs_data_set_default_int("la_depth", 15);
		settings.obs_data_set_default_int("keyint_sec", 3);
		settings.obs_data_set_default_int("bframes", 3);
		settings.obs_data_set_default_bool("mbbrc", true);
	}
	public Object obs_qsv_update(Object data) {
		obs_qsv obsqsv = data;
		 success = ModernizedCProgram.update_settings(obsqsv, settings);
		int ret;
		qsv_t generatedContext = obsqsv.getContext();
		 generatedParams = obsqsv.getParams();
		obs_encoder generatedEncoder = obsqsv.getEncoder();
		if (success) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/EnterCriticalSection(ModernizedCProgram.g_QsvCs);
			ret = /*Error: Function owner not recognized*/qsv_encoder_reconfig(generatedContext, generatedParams);
			if (ret != 0) {
				ModernizedCProgram.blog(LOG_WARNING, "[qsv encoder: '%s'] Failed to reconfigure: %d", ModernizedCProgram.obs_encoder_get_name(generatedEncoder), ret);
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LeaveCriticalSection(ModernizedCProgram.g_QsvCs);
			return ret == 0;
		} 
		return false;
	}
	public void monitor_capture_defaults() {
		settings.obs_data_set_default_int("monitor", 0);
		settings.obs_data_set_default_bool("capture_cursor", true);
		settings.obs_data_set_default_bool("compatibility", false);
	}
	public void monitor_capture_update(Object data) {
		monitor_capture mc = data;
		ModernizedCProgram.update_settings(mc, settings);
	}
	public void rtmp_common_update(Object data) {
		rtmp_common service = data;
		Byte generatedService = service.getService();
		ModernizedCProgram.bfree(generatedService);
		Byte generatedServer = service.getServer();
		ModernizedCProgram.bfree(generatedServer);
		Byte generatedOutput = service.getOutput();
		ModernizedCProgram.bfree(generatedOutput);
		Byte generatedKey = service.getKey();
		ModernizedCProgram.bfree(generatedKey);
		service.setService(ModernizedCProgram.bstrdup(settings.obs_data_get_string("service")));
		service.setServer(ModernizedCProgram.bstrdup(settings.obs_data_get_string("server")));
		service.setKey(ModernizedCProgram.bstrdup(settings.obs_data_get_string("key")));
		service.setOutput(((Object)0));
		json_t json_t = new json_t();
		json_t root = json_t.open_services_file();
		json_t json_t = new json_t();
		 generatedType = (rec).getType();
		if (root) {
			byte new_name;
			json_t serv = root.find_service(generatedService, new_name);
			if (new_name) {
				ModernizedCProgram.bfree(generatedService);
				service.setService(ModernizedCProgram.bstrdup(new_name));
			} 
			if (serv) {
				json_t rec = json_t.json_object_get(serv, "recommended");
				if (((rec) && (generatedType) == .JSON_OBJECT)) {
					byte out = rec.get_string_val("output");
					if (out) {
						service.setOutput(ModernizedCProgram.bstrdup(out));
					} 
				} 
				ModernizedCProgram.ensure_valid_url(service, serv, settings);
			} 
		} 
		root.json_decref();
		if (!generatedOutput) {
			service.setOutput(ModernizedCProgram.bstrdup("rtmp_output"));
		} 
	}
	public void rtmp_common_apply_settings(Object data, obs_data audio_settings) {
		rtmp_common service = data;
		json_t json_t = new json_t();
		json_t root = json_t.open_services_file();
		if (root) {
			ModernizedCProgram.initialize_output(service, root, video_settings, audio_settings);
			root.json_decref();
		} 
	}
	public void ffmpeg_source_defaults() {
		settings.obs_data_set_default_bool("is_local_file", true);
		settings.obs_data_set_default_bool("looping", false);
		settings.obs_data_set_default_bool("clear_on_media_end", true);
		settings.obs_data_set_default_bool("restart_on_activate", true);
		settings.obs_data_set_default_int("buffering_mb", 2);
		settings.obs_data_set_default_int("speed_percent", 100);
	}
	public void ffmpeg_source_update(Object data) {
		ffmpeg_source s = data;
		 is_local_file = settings.obs_data_get_bool("is_local_file");
		byte input;
		byte input_format;
		Byte generatedInput = s.getInput();
		ModernizedCProgram.bfree(generatedInput);
		Byte generatedInput_format = s.getInput_format();
		ModernizedCProgram.bfree(generatedInput_format);
		if (is_local_file) {
			input = (byte)settings.obs_data_get_string("local_file");
			input_format = NULL;
			s.setIs_looping(settings.obs_data_get_bool("looping"));
			s.setClose_when_inactive(settings.obs_data_get_bool("close_when_inactive"));
		} else {
				input = (byte)settings.obs_data_get_string("input");
				input_format = (byte)settings.obs_data_get_string("input_format");
				s.setIs_looping(false);
				s.setClose_when_inactive(true);
		} 
		s.setInput(input ? ModernizedCProgram.bstrdup(input) : NULL);
		s.setInput_format(input_format ? ModernizedCProgram.bstrdup(input_format) : NULL);
		s.setIs_hw_decoding(settings.obs_data_get_bool("hw_decode"));
		s.setIs_clear_on_media_end(settings.obs_data_get_bool("clear_on_media_end"));
		s.setRestart_on_activate(settings.obs_data_get_bool("restart_on_activate"));
		s.setRange((video_range_type)settings.obs_data_get_int("color_range"));
		s.setBuffering_mb((int)settings.obs_data_get_int("buffering_mb"));
		s.setSpeed_percent((int)settings.obs_data_get_int("speed_percent"));
		s.setIs_local_file(is_local_file);
		s.setSeekable(settings.obs_data_get_bool("seekable"));
		int generatedSpeed_percent = s.getSpeed_percent();
		if (generatedSpeed_percent < 1 || generatedSpeed_percent > 200) {
			s.setSpeed_percent(100);
		} 
		Object generatedMedia_valid = s.getMedia_valid();
		Object generatedMedia = s.getMedia();
		if (generatedMedia_valid) {
			generatedMedia.mp_media_free();
			s.setMedia_valid(false);
		} 
		obs_source generatedSource = s.getSource();
		 active = ModernizedCProgram.obs_source_active(generatedSource);
		Object generatedClose_when_inactive = s.getClose_when_inactive();
		if (!generatedClose_when_inactive || active) {
			s.ffmpeg_source_open();
		} 
		s.dump_source_info(input, input_format);
		Object generatedRestart_on_activate = s.getRestart_on_activate();
		if (!generatedRestart_on_activate || active) {
			s.ffmpeg_source_start();
		} 
	}
	public void duplicator_capture_defaults() {
		settings.obs_data_set_default_int("monitor", 0);
		settings.obs_data_set_default_bool("capture_cursor", true);
	}
	public void duplicator_capture_update(Object data) {
		duplicator_capture mc = data;
		ModernizedCProgram.update_settings(mc, settings);
	}
	public void gain_update(Object data) {
		gain_data gf = data;
		double val = ModernizedCProgram.s.obs_data_get_double("db");
		gf.setChannels(ModernizedCProgram.audio_output_get_channels(ModernizedCProgram.obs_get_audio()));
		gf.setMultiple(ModernizedCProgram.db_to_mul((double)val));
	}
	public void gain_defaults() {
		ModernizedCProgram.s.obs_data_set_default_double("db", 0.0);
	}
	/* ------------------------------------------------------------------------- */
	/* OBS-specific functions */
	public obs_data obs_data_newref() {
		obs_data obs_data = new obs_data();
		if (ModernizedCProgram.data) {
			ModernizedCProgram.data.obs_data_addref();
		} else {
				ModernizedCProgram.data = obs_data.obs_data_create();
		} 
		return ModernizedCProgram.data;
	}
	public obs_data obs_source_settings(Object id) {
		obs_source_info obs_source_info = new obs_source_info();
		obs_source_info info = obs_source_info.get_source_info(id);
		return (info) ? info.get_defaults() : NULL;
	}
	public obs_data obs_get_source_defaults(Object id) {
		obs_source_info obs_source_info = new obs_source_info();
		obs_source_info info = obs_source_info.get_source_info(id);
		return info ? info.get_defaults() : NULL;
	}
	public obs_data obs_source_get_settings(Object source) {
		if (!ModernizedCProgram.obs_object_valid(source, "obs_source_get_settings", "source")) {
			return NULL;
		} 
		source.getContext().getSettings().obs_data_addref();
		return source.getContext().getSettings();
	}
	public obs_data obs_source_get_private_settings(obs_source source) {
		if (!ModernizedCProgram.obs_object_valid(source, "obs_source_get_private_settings", "source")) {
			return NULL;
		} 
		obs_data generatedPrivate_settings = source.getPrivate_settings();
		generatedPrivate_settings.obs_data_addref();
		return generatedPrivate_settings;
	}
	public void scene_load(Object data) {
		obs_scene scene = data;
		obs_data_array obs_data_array = new obs_data_array();
		obs_data_array_t items = obs_data_array.obs_data_get_array(settings, "items");
		 count = new ();
		 i = new ();
		scene.remove_all_items();
		if (!items) {
			return /*Error: Unsupported expression*/;
		} 
		count = items.obs_data_array_count();
		obs_data obs_data = new obs_data();
		for (i = 0; i < count; i++) {
			obs_data_t item_data = obs_data.obs_data_array_item(items, i);
			ModernizedCProgram.scene_load_item(scene, item_data);
			item_data.obs_data_release();
		}
		if (settings.obs_data_has_user_value("id_counter")) {
			scene.setId_counter(settings.obs_data_get_int("id_counter"));
		} 
		if (settings.obs_data_get_bool("custom_size")) {
			scene.setCx(()settings.obs_data_get_int("cx"));
			scene.setCy(()settings.obs_data_get_int("cy"));
			scene.setCustom_size(true);
		} 
		items.obs_data_array_release();
	}
	public void scene_save(Object data) {
		obs_scene scene = data;
		obs_data_array obs_data_array = new obs_data_array();
		obs_data_array_t array = obs_data_array.obs_data_array_create();
		obs_scene_item item = new obs_scene_item();
		scene.full_lock();
		obs_scene_item generatedFirst_item = scene.getFirst_item();
		item = generatedFirst_item;
		obs_scene_item generatedNext = item.getNext();
		while (item) {
			ModernizedCProgram.scene_save_item(array, item, NULL);
			item = generatedNext;
		}
		Object generatedId_counter = scene.getId_counter();
		settings.obs_data_set_int("id_counter", generatedId_counter);
		Object generatedCustom_size = scene.getCustom_size();
		settings.obs_data_set_bool("custom_size", generatedCustom_size);
		Object generatedCx = scene.getCx();
		Object generatedCy = scene.getCy();
		if (generatedCustom_size) {
			settings.obs_data_set_int("cx", generatedCx);
			settings.obs_data_set_int("cy", generatedCy);
		} 
		scene.full_unlock();
		ModernizedCProgram.obs_data_set_array(settings, "items", array);
		array.obs_data_array_release();
	}
	public obs_data obs_sceneitem_get_private_settings(obs_scene_item item) {
		if (!ModernizedCProgram.obs_object_valid(item, "obs_sceneitem_get_private_settings", "item")) {
			return NULL;
		} 
		obs_data generatedPrivate_settings = item.getPrivate_settings();
		generatedPrivate_settings.obs_data_addref();
		return generatedPrivate_settings;
	}
	public void libfdk_defaults() {
		settings.obs_data_set_default_int("bitrate", 128);
		settings.obs_data_set_default_bool("afterburner", true);
	}
	public obs_data obs_script_get_settings(obs_script script) {
		obs_data_t settings = new obs_data_t();
		if (!ModernizedCProgram.pointer_valid(script, "script", __FUNCTION__)) {
			return NULL;
		} 
		obs_data generatedSettings = script.getSettings();
		settings = generatedSettings;
		settings.obs_data_addref();
		return settings;
	}
	public obs_data obs_script_save(obs_script script) {
		obs_data_t settings = new obs_data_t();
		if (!ModernizedCProgram.pointer_valid(script, "script", __FUNCTION__)) {
			return NULL;
		} 
		settings.obs_data_addref();
		return settings;
	}
	public void color_correction_filter_update(Object data) {
		color_correction_filter_data filter = data;
		double gamma = settings.obs_data_get_double(/* Build our Gamma numbers. */"gamma");
		gamma = (gamma < 0.0) ? (-gamma + 1.0) : (1.0 / (gamma + 1.0));
		vec3 generatedGamma = filter.getGamma();
		generatedGamma.vec3_set((double)gamma, (double)gamma, (double)gamma);
		/* Build our contrast number. */filter.setContrast((double)settings.obs_data_get_double("contrast") + 1.0);
		double generatedContrast = filter.getContrast();
		double one_minus_con = (1.0 - generatedContrast) / 2.0;
		filter.setCon_matrix(/*Error: Unsupported expression*/);
		/* Build our brightness number. */filter.setBrightness((double)settings.obs_data_get_double("brightness"/*
			 * Now let's build our Brightness matrix.
			 * Earlier (in the function color_correction_filter_create) we set
			 * this matrix to the identity matrix, so now we only need
			 * to set the 3 variables that have changed.
			 */));
		double generatedBrightness = filter.getBrightness();
		matrix4 generatedBright_matrix = filter.getBright_matrix();
		Object generatedMatrix4 = generatedBright_matrix.getMatrix4();
		generatedMatrix4.setX(generatedBrightness);
		generatedMatrix4.setY(generatedBrightness);
		generatedMatrix4.setZ(generatedBrightness);
		/* Build our Saturation number. */filter.setSaturation((double)settings.obs_data_get_double("saturation") + 1.0);
		double generatedSaturation = filter.getSaturation();
		double one_minus_sat_red = (1.0 - generatedSaturation) * /* Factor in the selected color weights. */ModernizedCProgram.red_weight;
		double one_minus_sat_green = (1.0 - generatedSaturation) * ModernizedCProgram.green_weight;
		double one_minus_sat_blue = (1.0 - generatedSaturation) * ModernizedCProgram.blue_weight;
		double sat_val_red = one_minus_sat_red + generatedSaturation;
		double sat_val_green = one_minus_sat_green + generatedSaturation;
		double sat_val_blue = one_minus_sat_blue + generatedSaturation;
		filter.setSat_matrix(/*Error: Unsupported expression*/);
		/* Build our Hue number. */filter.setHue_shift((double)settings.obs_data_get_double("hue_shift"));
		/* Build our Transparency number. */filter.setOpacity((double)settings.obs_data_get_int("opacity") * 0.01);
		double generatedHue_shift = filter.getHue_shift();
		double half_angle = 0.5 * (double)(generatedHue_shift / (180.0 / /* Hue is the radian of 0 to 360 degrees. */M_PI));
		double rot_quad1 = ModernizedCProgram.root3 * (double)/*Error: Function owner not recognized*/sin(/* Pseudo-Quaternion To Matrix. */half_angle);
		vec3 generatedRot_quaternion = filter.getRot_quaternion();
		generatedRot_quaternion.vec3_set(rot_quad1, rot_quad1, rot_quad1);
		filter.setRot_quaternion_w((double)/*Error: Function owner not recognized*/cos(half_angle));
		vec3 generatedCross = filter.getCross();
		generatedCross.vec3_mul(generatedRot_quaternion, generatedRot_quaternion);
		vec3 generatedSquare = filter.getSquare();
		generatedSquare.vec3_mul(generatedRot_quaternion, generatedRot_quaternion);
		vec3 generatedWimag = filter.getWimag();
		double generatedRot_quaternion_w = filter.getRot_quaternion_w();
		generatedWimag.vec3_mulf(generatedRot_quaternion, generatedRot_quaternion_w);
		generatedSquare.vec3_mulf(generatedSquare, 2.0);
		vec3 generatedDiag = filter.getDiag();
		vec3 generatedHalf_unit = filter.getHalf_unit();
		generatedDiag.vec3_sub(generatedHalf_unit, generatedSquare);
		vec3 generatedA_line = filter.getA_line();
		generatedA_line.vec3_add(generatedCross, generatedWimag);
		vec3 generatedB_line = filter.getB_line();
		generatedB_line.vec3_sub(generatedCross, generatedWimag);
		filter.setHue_op_matrix(/*Error: Unsupported expression*/);
		 color = ()settings.obs_data_get_int(/* Now get the overlay color data. */"color");
		vec4 generatedColor = filter.getColor();
		generatedColor.vec4_from_rgba(color/*
			* Now let's build our Color 'overlay' matrix.
			* Earlier (in the function color_correction_filter_create) we set
			* this matrix to the identity matrix, so now we only need
			* to set the 6 variables that have changed.
			*/);
		Object generatedVec4 = generatedColor.getVec4();
		generatedMatrix4.setX(generatedVec4);
		generatedMatrix4.setY(generatedVec4);
		generatedMatrix4.setZ(generatedVec4);
		generatedMatrix4.setX(generatedVec4 * generatedVec4);
		generatedMatrix4.setY(generatedVec4 * generatedVec4);
		generatedMatrix4.setZ(generatedVec4 * generatedVec4);
		matrix4 generatedFinal_matrix = filter.getFinal_matrix();
		matrix4 generatedCon_matrix = filter.getCon_matrix();
		generatedFinal_matrix.matrix4_mul(generatedBright_matrix, generatedCon_matrix);
		matrix4 generatedSat_matrix = filter.getSat_matrix();
		generatedFinal_matrix.matrix4_mul(generatedFinal_matrix, generatedSat_matrix);
		matrix4 generatedHue_op_matrix = filter.getHue_op_matrix();
		generatedFinal_matrix.matrix4_mul(generatedFinal_matrix, generatedHue_op_matrix);
		matrix4 generatedColor_matrix = filter.getColor_matrix();
		generatedFinal_matrix.matrix4_mul(generatedFinal_matrix, generatedColor_matrix);
	}
	public void color_correction_filter_defaults() {
		settings.obs_data_set_default_double("gamma", 0.0);
		settings.obs_data_set_default_double("contrast", 0.0);
		settings.obs_data_set_default_double("brightness", 0.0);
		settings.obs_data_set_default_double("saturation", 0.0);
		settings.obs_data_set_default_double("hue_shift", 0.0);
		settings.obs_data_set_default_double("opacity", 100.0);
		settings.obs_data_set_default_int("color", -1024/*
		 * So how does OBS keep track of all these plug-ins/filters? How does OBS know
		 * which function to call when it needs to update a setting? Or a source? Or
		 * what type of source this is?
		 *
		 * OBS does it through the obs_source_info_struct. Notice how variables are
		 * assigned the name of a function? Notice how the function name has the
		 * variable name in it? While not mandatory, it helps a ton for you (and those
		 * reading your code) to follow this convention.
		 */);
	}
	public void luma_key_update(Object data) {
		luma_key_filter_data filter = data;
		double lumaMax = settings.obs_data_get_double("luma_max");
		double lumaMin = settings.obs_data_get_double("luma_min");
		double lumaMaxSmooth = settings.obs_data_get_double("luma_max_smooth");
		double lumaMinSmooth = settings.obs_data_get_double("luma_min_smooth");
		filter.setLuma_max((double)lumaMax);
		filter.setLuma_min((double)lumaMin);
		filter.setLuma_max_smooth((double)lumaMaxSmooth);
		filter.setLuma_min_smooth((double)lumaMinSmooth);
	}
	public void luma_key_defaults() {
		settings.obs_data_set_default_double("luma_max", 1.0);
		settings.obs_data_set_default_double("luma_min", 0.0);
		settings.obs_data_set_default_double("luma_max_smooth", 0.0);
		settings.obs_data_set_default_double("luma_min_smooth", 0.0);
	}
	public void noise_suppress_update(Object data) {
		noise_suppress_data ng = data;
		uint32_t sample_rate = ModernizedCProgram.audio_output_get_sample_rate(ModernizedCProgram.obs_get_audio());
		 channels = ModernizedCProgram.audio_output_get_channels(ModernizedCProgram.obs_get_audio());
		 frames = ()sample_rate / 100;
		ng.setSuppress_level((int)ModernizedCProgram.s.obs_data_get_int("suppress_level"));
		ng.setFrames(/* Process 10 millisecond segments to keep latency low */frames);
		ng.setChannels(channels);
		Object generatedStates = ng.getStates();
		if (generatedStates[/* Ignore if already allocated */0]) {
			return /*Error: Unsupported expression*/;
		} 
		Object generatedCopy_buffers = ng.getCopy_buffers();
		generatedCopy_buffers[0] = ModernizedCProgram.bmalloc(frames * channels * /*Error: Unsupported expression*//* One speex state for each channel (limit 2) */);
		Object generatedSegment_buffers = ng.getSegment_buffers();
		generatedSegment_buffers[0] = ModernizedCProgram.bmalloc(frames * channels * /*Error: Unsupported expression*/);
		for ( c = 1;
		 c < channels; ++c) {
			generatedCopy_buffers[c] = generatedCopy_buffers[c - 1] + frames;
			generatedSegment_buffers[c] = generatedSegment_buffers[c - 1] + frames;
		}
		for ( i = 0;
		 i < channels; i++) {
			ng.alloc_channel(sample_rate, i, frames);
		}
	}
	public void noise_suppress_defaults() {
		ModernizedCProgram.s.obs_data_set_default_int("suppress_level", -30);
	}
	public void scroll_filter_update(Object data) {
		scroll_filter_data filter = data;
		filter.setLimit_cx(settings.obs_data_get_bool("limit_cx"));
		filter.setLimit_cy(settings.obs_data_get_bool("limit_cy"));
		filter.setCx(()settings.obs_data_get_int("cx"));
		filter.setCy(()settings.obs_data_get_int("cy"));
		vec2 generatedScroll_speed = filter.getScroll_speed();
		generatedScroll_speed.setVec2((double)settings.obs_data_get_double("speed_x"));
		generatedScroll_speed.setVec2((double)settings.obs_data_get_double("speed_y"));
		Object generatedVec2 = generatedScroll_speed.getVec2();
		vec2 generatedOffset = filter.getOffset();
		if (generatedVec2 == 0.0) {
			generatedOffset.setVec2(0.0);
		} 
		if (generatedVec2 == 0.0) {
			generatedOffset.setVec2(0.0);
		} 
	}
	public void scroll_filter_defaults() {
		settings.obs_data_set_default_bool("limit_size", false);
		settings.obs_data_set_default_int("cx", 100);
		settings.obs_data_set_default_int("cy", 100);
	}
	public void vlcs_update(Object data) {
		 media_list = new ();
		vlc_source c = data;
		obs_data_array_t array = new obs_data_array_t();
		byte behavior;
		 count = new ();
		int network_caching;
		int track_index;
		int subtitle_index;
		 subtitle_enable = new ();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_init(new_files);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_init(old_files);
		obs_data_array obs_data_array = new obs_data_array();
		array = obs_data_array.obs_data_get_array(settings, "playlist");
		count = array.obs_data_array_count();
		c.setLoop(settings.obs_data_get_bool("loop"));
		behavior = settings.obs_data_get_string("playback_behavior");
		network_caching = (int)settings.obs_data_get_int("network_caching");
		track_index = (int)settings.obs_data_get_int("track");
		subtitle_index = (int)settings.obs_data_get_int("subtitle");
		subtitle_enable = settings.obs_data_get_bool("subtitle_enable");
		if (ModernizedCProgram.astrcmpi(behavior, "pause_unpause") == 0) {
			c.setBehavior(behavior.BEHAVIOR_PAUSE_UNPAUSE);
		}  else if (ModernizedCProgram.astrcmpi(behavior, "always_play") == 0) {
			c.setBehavior(behavior.BEHAVIOR_ALWAYS_PLAY);
		} else {
				c.setBehavior(/* S_BEHAVIOR_STOP_RESTART */behavior.BEHAVIOR_STOP_RESTART);
		} 
		obs_data obs_data = new obs_data();
		os_dir os_dir = new os_dir();
		os_dirent os_dirent = new os_dirent();
		Object generatedOs_dirent = ent.getOs_dirent();
		Object generatedDstr = dir_path.getDstr();
		for ( i = 0;
		 i < count; /* ------------------------------------- *//* create new list of sources */i++) {
			obs_data_t item = obs_data.obs_data_array_item(array, i);
			byte path = item.obs_data_get_string("value");
			 dir = os_dir.os_opendir(path);
			if (dir) {
				dstr dir_path = new dstr(0);
				os_dirent ent = new os_dirent();
				for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
					byte ext;
					ent = os_dirent.os_readdir(dir);
					if (!ent) {
						break;
					} 
					if (generatedOs_dirent) {
						continue;
					} 
					ext = ModernizedCProgram.os_get_path_extension(generatedOs_dirent);
					if (!ModernizedCProgram.valid_extension(ext)) {
						continue;
					} 
					dir_path.dstr_copy(path);
					dir_path.dstr_cat_ch((byte)'/');
					dir_path.dstr_cat(generatedOs_dirent);
					c.add_file(new_files.getDa(), generatedDstr, network_caching, track_index, subtitle_index, subtitle_enable);
				}
				dir_path.dstr_free();
				dir.os_closedir();
			} else {
					c.add_file(new_files.getDa(), path, network_caching, track_index, subtitle_index, subtitle_enable);
			} 
			item.obs_data_release();
		}
		Object generatedMedia_list_player = c.getMedia_list_player();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/libvlc_media_list_player_stop_(generatedMedia_list_player);
		Object generatedMutex = c.getMutex();
		ModernizedCProgram.pthread_mutex_lock(generatedMutex);
		Object generatedFiles = c.getFiles();
		old_files.setDa(generatedFiles.getDa());
		generatedFiles.setDa(new_files.getDa());
		ModernizedCProgram.pthread_mutex_unlock(generatedMutex);
		c.setShuffle(settings.obs_data_get_bool(/* shuffle playlist */"shuffle"));
		Object generatedShuffle = c.getShuffle();
		ModernizedCProgram.free_files(old_files.getDa());
		media_list = /*Error: Function owner not recognized*/libvlc_media_list_new_(ModernizedCProgram.libvlc);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/libvlc_media_list_lock_(media_list);
		for ( i = 0;
		 i < generatedFiles.getNum(); i++) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/libvlc_media_list_add_media_(media_list, generatedFiles.getArray()[i].getMedia());
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/libvlc_media_list_unlock_(media_list);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/libvlc_media_list_player_set_media_list_(generatedMedia_list_player, media_list);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/libvlc_media_list_release_(media_list);
		Object generatedLoop = c.getLoop();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/libvlc_media_list_player_set_playback_mode_(generatedMedia_list_player, generatedLoop ? libvlc_playback_mode_loop : libvlc_playback_mode_default);
		behavior generatedBehavior = c.getBehavior();
		obs_source generatedSource = c.getSource();
		if (generatedFiles.getNum() && (generatedBehavior == behavior.BEHAVIOR_ALWAYS_PLAY || ModernizedCProgram.obs_source_active(generatedSource))) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/libvlc_media_list_player_play_(generatedMedia_list_player);
		} else {
				generatedSource.obs_source_output_video(NULL);
		} 
		array.obs_data_array_release();
	}
	public void vlcs_defaults() {
		settings.obs_data_set_default_bool("loop", true);
		settings.obs_data_set_default_bool("shuffle", false);
		settings.obs_data_set_default_string("playback_behavior", "stop_restart");
		settings.obs_data_set_default_int("network_caching", 400);
		settings.obs_data_set_default_int("track", 1);
		settings.obs_data_set_default_bool("subtitle_enable", false);
		settings.obs_data_set_default_int("subtitle", 1);
	}
	public void rtmp_custom_update(Object data) {
		rtmp_custom service = data;
		Byte generatedServer = service.getServer();
		ModernizedCProgram.bfree(generatedServer);
		Byte generatedKey = service.getKey();
		ModernizedCProgram.bfree(generatedKey);
		service.setServer(ModernizedCProgram.bstrdup(settings.obs_data_get_string("server")));
		service.setKey(ModernizedCProgram.bstrdup(settings.obs_data_get_string("key")));
		service.setUse_auth(settings.obs_data_get_bool("use_auth"));
		service.setUsername(ModernizedCProgram.bstrdup(settings.obs_data_get_string("username")));
		service.setPassword(ModernizedCProgram.bstrdup(settings.obs_data_get_string("password")));
	}
	public void mask_filter_update(Object data) {
		mask_filter_data filter = data;
		byte path = settings.obs_data_get_string("image_path");
		byte effect_file = settings.obs_data_get_string("type");
		 color = ()settings.obs_data_get_int("color");
		int opacity = (int)settings.obs_data_get_int("opacity");
		byte effect_path;
		color &=  -1024;
		color |=  /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(((double)opacity) * 2.55) << 24;
		vec4 generatedColor = filter.getColor();
		generatedColor.vec4_from_rgba(color);
		ModernizedCProgram.obs_enter_graphics();
		Object generatedImage = filter.getImage();
		generatedImage.gs_image_file_free();
		ModernizedCProgram.obs_leave_graphics();
		generatedImage.gs_image_file_init(path);
		ModernizedCProgram.obs_enter_graphics();
		generatedImage.gs_image_file_init_texture();
		filter.setTarget(generatedImage.getTexture());
		filter.setLock_aspect(!settings.obs_data_get_bool("stretch"));
		obs_module obs_module = new obs_module();
		effect_path = obs_module.obs_current_module().obs_find_module_file(effect_file);
		Object generatedEffect = filter.getEffect();
		generatedEffect.gs_effect_destroy();
		gs_effect gs_effect = new gs_effect();
		filter.setEffect(gs_effect.gs_effect_create_from_file(effect_path, NULL));
		ModernizedCProgram.bfree(effect_path);
		ModernizedCProgram.obs_leave_graphics();
	}
	public void mask_filter_defaults() {
		settings.obs_data_set_default_string("type", "mask_color_filter.effect");
		settings.obs_data_set_default_int("color", -1024);
		settings.obs_data_set_default_int("opacity", 100);
	}
	public void gpu_delay_filter_update(Object data) {
		gpu_delay_filter_data f = data;
		f.setDelay_ns(()ModernizedCProgram.s.obs_data_get_int("delay_ms") * -1024);
		f.setCx(/* full reset */0);
		f.setCy(0);
		f.setInterval_ns(0);
		f.free_textures();
	}
	public void obs_x264_defaults() {
		settings.obs_data_set_default_int("bitrate", 2500);
		settings.obs_data_set_default_bool("use_bufsize", false);
		settings.obs_data_set_default_int("buffer_size", 2500);
		settings.obs_data_set_default_int("keyint_sec", 0);
		settings.obs_data_set_default_int("crf", 23);
		settings.obs_data_set_default_string("rate_control", "CBR");
		settings.obs_data_set_default_string("preset", "veryfast");
		settings.obs_data_set_default_string("profile", "");
		settings.obs_data_set_default_string("tune", "");
		settings.obs_data_set_default_string("x264opts", "");
	}
	public Object obs_x264_update(Object data) {
		obs_x264 obsx264 = data;
		 success = ModernizedCProgram.update_settings(obsx264, settings, true);
		int ret;
		Object generatedContext = obsx264.getContext();
		Object generatedParams = obsx264.getParams();
		obs_encoder generatedEncoder = obsx264.getEncoder();
		if (success) {
			ret = /*Error: Function owner not recognized*/x264_encoder_reconfig(generatedContext, generatedParams);
			if (ret != 0) {
				ModernizedCProgram.blog(LOG_WARNING, "[x264 encoder: '%s'] Failed to reconfigure: %d", ModernizedCProgram.obs_encoder_get_name(generatedEncoder), ret);
			} 
			return ret == 0;
		} 
		return false;
	}
	public obs_data obs_output_defaults(Object id) {
		obs_output_info info = ModernizedCProgram.find_output(id);
		return (info) ? info.get_defaults() : NULL;
	}
	public obs_data obs_output_get_settings(Object output) {
		if (!ModernizedCProgram.obs_object_valid(output, "obs_output_get_settings", "output")) {
			return NULL;
		} 
		output.getContext().getSettings().obs_data_addref();
		return output.getContext().getSettings();
	}
	public void stinger_update(Object data) {
		stinger_info s = data;
		byte path = settings.obs_data_get_string("path");
		obs_data obs_data = new obs_data();
		obs_data_t media_settings = obs_data.obs_data_create();
		media_settings.obs_data_set_string("local_file", path);
		obs_source generatedMedia_source = s.getMedia_source();
		generatedMedia_source.obs_source_release();
		obs_source obs_source = new obs_source();
		s.setMedia_source(obs_source.obs_source_create_private("ffmpeg_source", NULL, media_settings));
		media_settings.obs_data_release();
		 point = settings.obs_data_get_int("transition_point");
		s.setTransition_point_is_frame(settings.obs_data_get_int("tp_type") == 1);
		Object generatedTransition_point_is_frame = s.getTransition_point_is_frame();
		if (generatedTransition_point_is_frame) {
			s.setTransition_point_frame(()point);
		} else {
				s.setTransition_point_ns(/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(point * -1024));
		} 
		s.setMonitoring_type((int)settings.obs_data_get_int("audio_monitoring"));
		int generatedMonitoring_type = s.getMonitoring_type();
		generatedMedia_source.obs_source_set_monitoring_type(generatedMonitoring_type);
		s.setFade_style((fade_style)settings.obs_data_get_int("audio_fade_style"));
		fade_style generatedFade_style = s.getFade_style();
		switch (generatedFade_style) {
		case fade_style.FADE_STYLE_FADE_OUT_FADE_IN:
				s.setMix_a(ModernizedCProgram.mix_a_fade_in_out);
				s.setMix_b(ModernizedCProgram.mix_b_fade_in_out);
				break;
		case fade_style.FADE_STYLE_CROSS_FADE:
				s.setMix_a(ModernizedCProgram.mix_a_cross_fade);
				s.setMix_b(ModernizedCProgram.mix_b_cross_fade);
				break;
		default:
		}
	}
	public void slide_update(Object data) {
		slide_info slide = data;
		byte dir = settings.obs_data_get_string("direction");
		if (/*Error: Function owner not recognized*/strcmp(dir, "right") == 0) {
			slide.setDir(/*Error: Unsupported expression*/);
		}  else if (/*Error: Function owner not recognized*/strcmp(dir, "up") == 0) {
			slide.setDir(/*Error: Unsupported expression*/);
		}  else if (/*Error: Function owner not recognized*/strcmp(dir, "down") == 0) {
			slide.setDir(/*Error: Unsupported expression*/);
		} else {
				slide.setDir(/*Error: Unsupported expression*/);
		} 
	}
	public obs_data obs_save_source(obs_source source) {
		obs_data_array obs_data_array = new obs_data_array();
		obs_data_array_t filters = obs_data_array.obs_data_array_create();
		obs_data obs_data = new obs_data();
		obs_data_t source_data = obs_data.obs_data_create();
		obs_data obs_data = new obs_data();
		obs_data_t settings = obs_data.obs_source_get_settings(source);
		obs_context_data generatedContext = source.getContext();
		obs_data generatedHotkey_data = generatedContext.getHotkey_data();
		obs_data_t hotkey_data = generatedHotkey_data;
		obs_data_t hotkeys = new obs_data_t();
		double volume = ModernizedCProgram.obs_source_get_volume(source);
		double balance = ModernizedCProgram.obs_source_get_balance_value(source);
		uint32_t mixers = ModernizedCProgram.obs_source_get_audio_mixers(source);
		int64_t sync = ModernizedCProgram.obs_source_get_sync_offset(source);
		uint32_t flags = ModernizedCProgram.obs_source_get_flags(source);
		byte name = ModernizedCProgram.obs_source_get_name(source);
		byte id = ModernizedCProgram.obs_source_get_id(source);
		 enabled = ModernizedCProgram.obs_source_enabled(source);
		 muted = ModernizedCProgram.obs_source_muted(source);
		 push_to_mute = source.obs_source_push_to_mute_enabled();
		uint64_t ptm_delay = source.obs_source_get_push_to_mute_delay();
		 push_to_talk = source.obs_source_push_to_talk_enabled();
		uint64_t ptt_delay = source.obs_source_get_push_to_talk_delay();
		int m_type = (int)ModernizedCProgram.obs_source_get_monitoring_type(source);
		int di_mode = (int)ModernizedCProgram.obs_source_get_deinterlace_mode(source);
		int di_order = (int)ModernizedCProgram.obs_source_get_deinterlace_field_order(source);
		source.obs_source_save();
		obs_data obs_data = new obs_data();
		hotkeys = obs_data.obs_hotkeys_save_source(source);
		if (hotkeys) {
			hotkey_data.obs_data_release();
			generatedContext.setHotkey_data(hotkeys);
			hotkey_data = hotkeys;
		} 
		source_data.obs_data_set_int("prev_ver", ((24 << 24) | (0 << 16) | 3));
		source_data.obs_data_set_string("name", name);
		source_data.obs_data_set_string("id", id);
		source_data.obs_data_set_obj("settings", settings);
		source_data.obs_data_set_int("mixers", mixers);
		source_data.obs_data_set_int("sync", sync);
		source_data.obs_data_set_int("flags", flags);
		source_data.obs_data_set_double("volume", volume);
		source_data.obs_data_set_double("balance", balance);
		source_data.obs_data_set_bool("enabled", enabled);
		source_data.obs_data_set_bool("muted", muted);
		source_data.obs_data_set_bool("push-to-mute", push_to_mute);
		source_data.obs_data_set_int("push-to-mute-delay", ptm_delay);
		source_data.obs_data_set_bool("push-to-talk", push_to_talk);
		source_data.obs_data_set_int("push-to-talk-delay", ptt_delay);
		source_data.obs_data_set_obj("hotkeys", hotkey_data);
		source_data.obs_data_set_int("deinterlace_mode", di_mode);
		source_data.obs_data_set_int("deinterlace_field_order", di_order);
		source_data.obs_data_set_int("monitoring_type", m_type);
		obs_data generatedPrivate_settings = source.getPrivate_settings();
		source_data.obs_data_set_obj("private_settings", generatedPrivate_settings);
		obs_source_info generatedInfo = source.getInfo();
		obs_source_type generatedType = generatedInfo.getType();
		if (generatedType == obs_source_type.OBS_SOURCE_TYPE_TRANSITION) {
			ModernizedCProgram.obs_transition_save(source, source_data);
		} 
		Object generatedFilter_mutex = source.getFilter_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedFilter_mutex);
		Object generatedFilters = source.getFilters();
		obs_data obs_data = new obs_data();
		if (generatedFilters.getNum()) {
			for ( i = generatedFilters.getNum();
			 i > 0; i--) {
				obs_source_t filter = generatedFilters.getArray()[i - 1];
				obs_data_t filter_data = obs_data.obs_save_source(filter);
				ModernizedCProgram.obs_data_array_push_back(filters, filter_data);
				filter_data.obs_data_release();
			}
			ModernizedCProgram.obs_data_set_array(source_data, "filters", filters);
		} 
		ModernizedCProgram.pthread_mutex_unlock(generatedFilter_mutex);
		settings.obs_data_release();
		filters.obs_data_array_release();
		return source_data;
	}
	public void obs_apply_private_data() {
		if (!ModernizedCProgram.obs || !settings) {
			return /*Error: Unsupported expression*/;
		} 
		ModernizedCProgram.obs.getData().getPrivate_data().obs_data_apply(settings);
	}
	public void obs_set_private_data() {
		if (!ModernizedCProgram.obs) {
			return /*Error: Unsupported expression*/;
		} 
		ModernizedCProgram.obs.getData().getPrivate_data().obs_data_clear();
		if (settings) {
			ModernizedCProgram.obs.getData().getPrivate_data().obs_data_apply(settings);
		} 
	}
	public obs_data obs_get_private_data() {
		if (!ModernizedCProgram.obs) {
			return NULL;
		} 
		obs_data_t private_data = ModernizedCProgram.obs.getData().getPrivate_data();
		private_data.obs_data_addref();
		return private_data;
	}
	public void compressor_update(Object data) {
		compressor_data cd = data;
		uint32_t sample_rate = ModernizedCProgram.audio_output_get_sample_rate(ModernizedCProgram.obs_get_audio());
		 num_channels = ModernizedCProgram.audio_output_get_channels(ModernizedCProgram.obs_get_audio());
		double attack_time_ms = (double)ModernizedCProgram.s.obs_data_get_int("attack_time");
		double release_time_ms = (double)ModernizedCProgram.s.obs_data_get_int("release_time");
		double output_gain_db = (double)ModernizedCProgram.s.obs_data_get_double("output_gain");
		byte sidechain_name = ModernizedCProgram.s.obs_data_get_string("sidechain_source");
		cd.setRatio((double)ModernizedCProgram.s.obs_data_get_double("ratio"));
		cd.setThreshold((double)ModernizedCProgram.s.obs_data_get_double("threshold"));
		cd.setAttack_gain(ModernizedCProgram.gain_coefficient(sample_rate, attack_time_ms / ((double)1000)));
		cd.setRelease_gain(ModernizedCProgram.gain_coefficient(sample_rate, release_time_ms / ((double)1000)));
		cd.setOutput_gain(ModernizedCProgram.db_to_mul(output_gain_db));
		cd.setNum_channels(num_channels);
		cd.setSample_rate(sample_rate);
		double generatedRatio = cd.getRatio();
		cd.setSlope(1.0 - (1.0 / generatedRatio));
		 valid_sidechain = sidechain_name && /*Error: Function owner not recognized*/strcmp(sidechain_name, "none") != 0;
		obs_weak_source_t old_weak_sidechain = NULL;
		Object generatedSidechain_update_mutex = cd.getSidechain_update_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedSidechain_update_mutex);
		obs_weak_source generatedWeak_sidechain = cd.getWeak_sidechain();
		Byte generatedSidechain_name = cd.getSidechain_name();
		if (!valid_sidechain) {
			if (generatedWeak_sidechain) {
				old_weak_sidechain = generatedWeak_sidechain;
				cd.setWeak_sidechain(NULL);
			} 
			ModernizedCProgram.bfree(generatedSidechain_name);
			cd.setSidechain_name(NULL);
		} else {
				if (!generatedSidechain_name || /*Error: Function owner not recognized*/strcmp(generatedSidechain_name, sidechain_name) != 0) {
					if (generatedWeak_sidechain) {
						old_weak_sidechain = generatedWeak_sidechain;
						cd.setWeak_sidechain(NULL);
					} 
					ModernizedCProgram.bfree(generatedSidechain_name);
					cd.setSidechain_name(ModernizedCProgram.bstrdup(sidechain_name));
					cd.setSidechain_check_time(ModernizedCProgram.os_gettime_ns() - -1024);
				} 
		} 
		ModernizedCProgram.pthread_mutex_unlock(generatedSidechain_update_mutex);
		obs_source obs_source = new obs_source();
		if (old_weak_sidechain) {
			obs_source_t old_sidechain = obs_source.obs_weak_source_get_source(old_weak_sidechain);
			if (old_sidechain) {
				old_sidechain.obs_source_remove_audio_capture_callback(sidechain_capture, cd);
				old_sidechain.obs_source_release();
			} 
			old_weak_sidechain.obs_weak_source_release();
		} 
		 sample_len = sample_rate * 10 / 1000;
		Object generatedEnvelope_buf_len = cd.getEnvelope_buf_len();
		if (generatedEnvelope_buf_len == 0) {
			cd.resize_env_buffer(sample_len);
		} 
	}
	public void compressor_defaults() {
		ModernizedCProgram.s.obs_data_set_default_double("ratio", 10.0);
		ModernizedCProgram.s.obs_data_set_default_double("threshold", -18.0);
		ModernizedCProgram.s.obs_data_set_default_int("attack_time", 6);
		ModernizedCProgram.s.obs_data_set_default_int("release_time", 60);
		ModernizedCProgram.s.obs_data_set_default_double("output_gain", 0.0);
		ModernizedCProgram.s.obs_data_set_default_string("sidechain_source", "none");
	}
	public void color_grade_filter_update(Object data) {
		lut_filter_data filter = data;
		byte path = settings.obs_data_get_string("image_path");
		double clut_amount = settings.obs_data_get_double("clut_amount");
		Byte generatedFile = filter.getFile();
		ModernizedCProgram.bfree(generatedFile);
		if (path) {
			filter.setFile(ModernizedCProgram.bstrdup(path));
		} else {
				filter.setFile(NULL);
		} 
		ModernizedCProgram.obs_enter_graphics();
		Object generatedImage = filter.getImage();
		generatedImage.gs_image_file_free();
		ModernizedCProgram.obs_leave_graphics();
		generatedImage.gs_image_file_init(path);
		ModernizedCProgram.obs_enter_graphics();
		generatedImage.gs_image_file_init_texture();
		filter.setTarget(generatedImage.getTexture());
		filter.setClut_amount((double)clut_amount);
		obs_module obs_module = new obs_module();
		byte effect_path = obs_module.obs_current_module().obs_find_module_file("color_grade_filter.effect");
		Object generatedEffect = filter.getEffect();
		generatedEffect.gs_effect_destroy();
		gs_effect gs_effect = new gs_effect();
		filter.setEffect(gs_effect.gs_effect_create_from_file(effect_path, NULL));
		ModernizedCProgram.bfree(effect_path);
		ModernizedCProgram.obs_leave_graphics();
	}
	public void color_grade_filter_defaults() {
		settings.obs_data_set_default_double("clut_amount", 1);
	}
	public void load_modifier(Object modifiers, Object name, Object flag) {
		if (ModernizedCProgram.data.obs_data_get_bool(name)) {
			modifiers |=  flag;
		} 
	}
	public void save_modifier(Object modifiers, Object name, Object flag) {
		if ((modifiers & flag) == flag) {
			ModernizedCProgram.data.obs_data_set_bool(name, true);
		} 
	}
	public obs_data save_context_hotkeys(obs_context_data context) {
		Object generatedHotkeys = context.getHotkeys();
		if (!generatedHotkeys.getNum()) {
			return NULL;
		} 
		obs_data obs_data = new obs_data();
		obs_data_t result = obs_data.obs_data_create();
		context.enum_context_hotkeys(enum_save_hotkey, result);
		return result;
	}
	public obs_data obs_hotkeys_save_encoder(obs_encoder encoder) {
		obs_data_t result = NULL;
		if (!ModernizedCProgram.lock()) {
			return result;
		} 
		obs_context_data generatedContext = encoder.getContext();
		obs_data obs_data = new obs_data();
		result = obs_data.save_context_hotkeys(generatedContext);
		ModernizedCProgram.unlock();
		return result;
	}
	public obs_data obs_hotkeys_save_output(obs_output output) {
		obs_data_t result = NULL;
		if (!ModernizedCProgram.lock()) {
			return result;
		} 
		obs_context_data generatedContext = output.getContext();
		obs_data obs_data = new obs_data();
		result = obs_data.save_context_hotkeys(generatedContext);
		ModernizedCProgram.unlock();
		return result;
	}
	public obs_data obs_hotkeys_save_service(obs_service service) {
		obs_data_t result = NULL;
		if (!ModernizedCProgram.lock()) {
			return result;
		} 
		obs_context_data generatedContext = service.getContext();
		obs_data obs_data = new obs_data();
		result = obs_data.save_context_hotkeys(generatedContext);
		ModernizedCProgram.unlock();
		return result;
	}
	public obs_data obs_hotkeys_save_source(obs_source source) {
		obs_data_t result = NULL;
		if (!ModernizedCProgram.lock()) {
			return result;
		} 
		obs_context_data generatedContext = source.getContext();
		obs_data obs_data = new obs_data();
		result = obs_data.save_context_hotkeys(generatedContext);
		ModernizedCProgram.unlock();
		return result;
	}
	public Object nvenc_update(Object data) {
		nvenc_data enc = data;
		Object generatedCan_change_bitrate = enc.getCan_change_bitrate();
		Object generatedConfig = enc.getConfig();
		Object generatedParams = enc.getParams();
		Object generatedSession = enc.getSession();
		if (generatedCan_change_bitrate) {
			int bitrate = (int)settings.obs_data_get_int("bitrate");
			generatedConfig.getRcParams().setAverageBitRate(bitrate * 1000);
			generatedConfig.getRcParams().setMaxBitRate(bitrate * 1000);
			 params = new (0);
			params.setVersion(NV_ENC_RECONFIGURE_PARAMS_VER);
			params.setReInitEncodeParams(generatedParams);
			params.setResetEncoder(1);
			params.setForceIDR(1);
			if (enc.nv_failed(/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedSession, params), __FUNCTION__, "nv.nvEncReconfigureEncoder(enc->session, &params)")) {
				return false;
			} 
		} 
		return true;
		nvenc_encoder enc = data;
		byte rc = settings.obs_data_get_string("rate_control");
		int bitrate = (int)settings.obs_data_get_int("bitrate");
		int cqp = (int)settings.obs_data_get_int("cqp");
		int keyint_sec = (int)settings.obs_data_get_int("keyint_sec");
		byte preset = settings.obs_data_get_string("preset");
		byte profile = settings.obs_data_get_string("profile");
		int gpu = (int)settings.obs_data_get_int("gpu");
		 cbr_override = settings.obs_data_get_bool("cbr");
		int bf = (int)settings.obs_data_get_int("bf");
		obs_encoder generatedEncoder = enc.getEncoder();
		 video = ModernizedCProgram.obs_encoder_video(generatedEncoder);
		video_output_info voi = ModernizedCProgram.video_output_get_info(video);
		video_scale_info info = new video_scale_info();
		if (/* XXX: "cbr" setting has been deprecated */cbr_override) {
			ModernizedCProgram.blog(LOG_WARNING, "[NVENC encoder: '%s'] \"cbr\" setting has been deprecated for all encoders!  Please set \"rate_control\" to \"CBR\" instead.  Forcing CBR mode.  (Note to all: this is why you shouldn't use strings for common settings)", ModernizedCProgram.obs_encoder_get_name(generatedEncoder));
			rc = "CBR";
		} 
		info.setVideo_scale_info(voi.getVideo_output_info());
		info.setVideo_scale_info(voi.getVideo_output_info());
		info.setVideo_scale_info(voi.getVideo_output_info());
		 twopass = false;
		if (ModernizedCProgram.astrcmpi(preset, "mq") == 0) {
			twopass = true;
			preset = "hq";
		} 
		ModernizedCProgram.nvenc_video_info(enc, info);
		Object generatedContext = enc.getContext();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/av_opt_set_int(generatedContext.getPriv_data(), "cbr", false, 0);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/av_opt_set(generatedContext.getPriv_data(), "profile", profile, 0);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/av_opt_set(generatedContext.getPriv_data(), "preset", preset, 0);
		if (ModernizedCProgram.astrcmpi(rc, "cqp") == 0) {
			bitrate = 0;
			generatedContext.setGlobal_quality(cqp);
		}  else if (ModernizedCProgram.astrcmpi(rc, "lossless") == 0) {
			bitrate = 0;
			cqp = 0;
			 hp = (ModernizedCProgram.astrcmpi(preset, "hp") == 0 || ModernizedCProgram.astrcmpi(preset, "llhp") == 0);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/av_opt_set(generatedContext.getPriv_data(), "preset", hp ? "losslesshp" : "lossless", 0);
		}  else if (ModernizedCProgram.astrcmpi(rc, "vbr") != /* CBR by default */0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/av_opt_set_int(generatedContext.getPriv_data(), "cbr", true, 0);
			generatedContext.setRc_max_rate(bitrate * 1000);
			generatedContext.setRc_min_rate(bitrate * 1000);
			cqp = 0;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/av_opt_set(generatedContext.getPriv_data(), "level", "auto", 0);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/av_opt_set_int(generatedContext.getPriv_data(), "2pass", twopass, 0);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/av_opt_set_int(generatedContext.getPriv_data(), "gpu", gpu, 0);
		generatedContext.setBit_rate(bitrate * 1000);
		generatedContext.setRc_buffer_size(bitrate * 1000);
		generatedContext.setWidth(ModernizedCProgram.obs_encoder_get_width(generatedEncoder));
		generatedContext.setHeight(ModernizedCProgram.obs_encoder_get_height(generatedEncoder));
		generatedContext.setTime_base(/*Error: Unsupported expression*/);
		Object generatedVideo_scale_info = info.getVideo_scale_info();
		generatedContext.setPix_fmt(ModernizedCProgram.obs_to_ffmpeg_video_format(generatedVideo_scale_info));
		generatedContext.setColorspace(generatedVideo_scale_info == VIDEO_CS_709 ? AVCOL_SPC_BT709 : AVCOL_SPC_BT470BG);
		generatedContext.setColor_range(generatedVideo_scale_info == VIDEO_RANGE_FULL ? AVCOL_RANGE_JPEG : AVCOL_RANGE_MPEG);
		generatedContext.setMax_b_frames(bf);
		if (keyint_sec) {
			generatedContext.setGop_size(keyint_sec * voi.getVideo_output_info() / voi.getVideo_output_info());
		} else {
				generatedContext.setGop_size(250);
		} 
		enc.setHeight(generatedContext.getHeight());
		ModernizedCProgram.blog(LOG_INFO, "[NVENC encoder: '%s'] settings:\n\trate_control: %s\n\tbitrate:      %d\n\tcqp:          %d\n\tkeyint:       %d\n\tpreset:       %s\n\tprofile:      %s\n\twidth:        %d\n\theight:       %d\n\t2-pass:       %s\n\tb-frames:     %d\n\tGPU:          %d\n", ModernizedCProgram.obs_encoder_get_name(generatedEncoder), rc, bitrate, cqp, generatedContext.getGop_size(), preset, profile, generatedContext.getWidth(), generatedContext.getHeight(), twopass ? "true" : "false", generatedContext.getMax_b_frames(), gpu);
		return enc.nvenc_init_codec();
	}
	public void ss_update(Object data) {
		obs_source_t new_tr = NULL;
		obs_source_t old_tr = NULL;
		slideshow ss = data;
		obs_data_array_t array = new obs_data_array_t();
		byte tr_name;
		 new_duration = new ();
		 new_speed = new ();
		 cx = 0;
		 cy = 0;
		 count = new ();
		byte behavior;
		byte mode;
		/* ------------------------------------- */
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_init(/* get settings data */new_files);
		behavior = settings.obs_data_get_string("playback_behavior");
		if (ModernizedCProgram.astrcmpi(behavior, "pause_unpause") == 0) {
			ss.setBehavior(behavior.BEHAVIOR_PAUSE_UNPAUSE);
		}  else if (ModernizedCProgram.astrcmpi(behavior, "always_play") == 0) {
			ss.setBehavior(behavior.BEHAVIOR_ALWAYS_PLAY);
		} else {
				ss.setBehavior(/* S_BEHAVIOR_STOP_RESTART */behavior.BEHAVIOR_STOP_RESTART);
		} 
		mode = settings.obs_data_get_string("slide_mode");
		ss.setManual((ModernizedCProgram.astrcmpi(mode, "mode_manual") == 0));
		tr_name = settings.obs_data_get_string("transition");
		if (ModernizedCProgram.astrcmpi(tr_name, "cut") == 0) {
			tr_name = "cut_transition";
		}  else if (ModernizedCProgram.astrcmpi(tr_name, "swipe") == 0) {
			tr_name = "swipe_transition";
		}  else if (ModernizedCProgram.astrcmpi(tr_name, "slide") == 0) {
			tr_name = "slide_transition";
		} else {
				tr_name = "fade_transition";
		} 
		ss.setRandomize(settings.obs_data_get_bool("randomize"));
		ss.setLoop(settings.obs_data_get_bool("loop"));
		ss.setHide(settings.obs_data_get_bool("hide"));
		Object generatedTr_name = ss.getTr_name();
		obs_source obs_source = new obs_source();
		if (!generatedTr_name || /*Error: Function owner not recognized*/strcmp(tr_name, generatedTr_name) != 0) {
			new_tr = obs_source.obs_source_create_private(tr_name, NULL, NULL);
		} 
		new_duration = ()settings.obs_data_get_int("slide_time");
		new_speed = ()settings.obs_data_get_int("transition_speed");
		obs_data_array obs_data_array = new obs_data_array();
		array = obs_data_array.obs_data_get_array(settings, "files");
		count = array/* ------------------------------------- */.obs_data_array_count();
		ss.setMem_usage(/* create new list of sources */0);
		obs_data obs_data = new obs_data();
		os_dir os_dir = new os_dir();
		os_dirent os_dirent = new os_dirent();
		Object generatedOs_dirent = ent.getOs_dirent();
		Object generatedDstr = dir_path.getDstr();
		Object generatedMem_usage = ss.getMem_usage();
		for ( i = 0;
		 i < count; i++) {
			obs_data_t item = obs_data.obs_data_array_item(array, i);
			byte path = item.obs_data_get_string("value");
			 dir = os_dir.os_opendir(path);
			if (dir) {
				dstr dir_path = new dstr(0);
				os_dirent ent = new os_dirent();
				for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
					byte ext;
					ent = os_dirent.os_readdir(dir);
					if (!ent) {
						break;
					} 
					if (generatedOs_dirent) {
						continue;
					} 
					ext = ModernizedCProgram.os_get_path_extension(generatedOs_dirent);
					if (!ModernizedCProgram.valid_extension(ext)) {
						continue;
					} 
					dir_path.dstr_copy(path);
					dir_path.dstr_cat_ch((byte)'/');
					dir_path.dstr_cat(generatedOs_dirent);
					ss.add_file(new_files.getDa(), generatedDstr, cx, cy);
					if (generatedMem_usage >= (250 * (1024 * 1024))) {
						break;
					} 
				}
				dir_path.dstr_free();
				dir.os_closedir();
			} else {
					ss.add_file(new_files.getDa(), path, cx, cy);
			} 
			item.obs_data_release();
			if (generatedMem_usage >= (250 * (1024 * 1024))) {
				break;
			} 
		}
		Object generatedMutex = ss.getMutex();
		ModernizedCProgram.pthread_mutex_lock(generatedMutex);
		Object generatedFiles = ss.getFiles();
		old_files.setDa(generatedFiles.getDa());
		generatedFiles.setDa(new_files.getDa());
		obs_source generatedTransition = ss.getTransition();
		if (new_tr) {
			old_tr = generatedTransition;
			ss.setTransition(new_tr);
		} 
		if (/*Error: Function owner not recognized*/strcmp(tr_name, "cut_transition") != 0) {
			if (new_duration < 100) {
				new_duration = 100;
			} 
			new_duration += new_speed;
		} else {
				if (new_duration < 50) {
					new_duration = 50;
				} 
		} 
		ss.setTr_speed(new_speed);
		ss.setTr_name(tr_name);
		ss.setSlide_time((double)new_duration / 1000.0);
		ModernizedCProgram.pthread_mutex_unlock(generatedMutex);
		if (/* clean up and restart transition */old_tr) {
			old_tr.obs_source_release();
		} 
		ModernizedCProgram.free_files(old_files.getDa());
		byte res_str = settings.obs_data_get_string(/* ------------------------- */"use_custom_size");
		 aspect_only = false;
		 use_auto = true;
		int cx_in = 0;
		int cy_in = 0;
		if (/*Error: Function owner not recognized*/strcmp(res_str, ModernizedCProgram.obs_module_text("SlideShow.CustomSize.Auto")) != 0) {
			int ret = /*Error: Function owner not recognized*/sscanf(res_str, "%dx%d", cx_in, cy_in);
			if (ret == 2) {
				aspect_only = false;
				use_auto = false;
			} else {
					ret = /*Error: Function owner not recognized*/sscanf(res_str, "%d:%d", cx_in, cy_in);
					if (ret == 2) {
						aspect_only = true;
						use_auto = false;
					} 
			} 
		} 
		if (!use_auto) {
			double cx_f = (double)cx;
			double cy_f = (double)cy;
			double old_aspect = cx_f / cy_f;
			double new_aspect = (double)cx_in / (double)cy_in;
			if (aspect_only) {
				if (/*Error: Function owner not recognized*/fabs(old_aspect - new_aspect) > EPSILON) {
					if (new_aspect > old_aspect) {
						cx = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(cy_f * new_aspect);
					} else {
							cy = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(cx_f / new_aspect);
					} 
				} 
			} else {
					cx = ()cx_in;
					cy = ()cy_in;
			} 
		} 
		ss.setCx(/* ------------------------- */cx);
		ss.setCy(cy);
		ss.setCur_item(0);
		ss.setElapsed(0.0);
		generatedTransition.obs_transition_set_size(cx, cy);
		generatedTransition.obs_transition_set_alignment((false));
		generatedTransition.obs_transition_set_scale_type(obs_transition_scale_type.OBS_TRANSITION_SCALE_ASPECT);
		Object generatedRandomize = ss.getRandomize();
		if (generatedRandomize && generatedFiles.getNum()) {
			ss.setCur_item(ss.random_file());
		} 
		obs_source generatedSource = ss.getSource();
		if (new_tr) {
			generatedSource.obs_source_add_active_child(new_tr);
		} 
		if (generatedFiles.getNum()) {
			ModernizedCProgram.do_transition(ss, false);
		} 
		array.obs_data_array_release();
	}
	public void ss_defaults() {
		settings.obs_data_set_default_string("transition", "fade");
		settings.obs_data_set_default_int("slide_time", 8000);
		settings.obs_data_set_default_int("transition_speed", 700);
		settings.obs_data_set_default_string("use_custom_size", ModernizedCProgram.obs_module_text("SlideShow.CustomSize.Auto"));
		settings.obs_data_set_default_string("playback_behavior", "always_play");
		settings.obs_data_set_default_string("slide_mode", "mode_auto");
		settings.obs_data_set_default_bool("loop", true);
	}
	public void coreaudio_update(Object data) {
		coreaudio_data ca = data;
		ca.coreaudio_shutdown();
		Byte generatedDevice_uid = ca.getDevice_uid();
		ModernizedCProgram.bfree(generatedDevice_uid);
		ca.setDevice_uid(ModernizedCProgram.bstrdup(settings.obs_data_get_string("device_id")));
		ca.coreaudio_try_init();
	}
	public void coreaudio_defaults() {
		settings.obs_data_set_default_string("device_id", "default");
	}
	public void ftl_stream_defaults() {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(defaults);
	}
	public Object get_string_or_null(Object name) {
		byte value = settings.obs_data_get_string(name);
		if (!value || !/*Error: Function owner not recognized*/strlen(value)) {
			return NULL;
		} 
		return value;
	}
	public void xshm_update(Object vptr) {
		xshm_data data = vptr;
		;
		data.xshm_capture_stop();
		data.setScreen_id(settings.obs_data_get_int("screen"));
		data.setShow_cursor(settings.obs_data_get_bool("show_cursor"));
		data.setAdvanced(settings.obs_data_get_bool("advanced"));
		data.setServer(ModernizedCProgram.bstrdup(settings.obs_data_get_string("server")));
		data/**
		 * Get the default settings for the capture
		 */.xshm_capture_start();
	}
	public void xshm_defaults() {
		defaults.obs_data_set_default_int("screen", 0);
		defaults.obs_data_set_default_bool("show_cursor", true);
		defaults.obs_data_set_default_bool("advanced", false/**
		 * Toggle visibility of advanced settings
		 */);
	}
	public Object nvenc_reconfigure(Object data) {
		nvenc_encoder enc = data;
		int bitrate = (int)settings.obs_data_get_int("bitrate");
		byte rc = settings.obs_data_get_string("rate_control");
		 cbr = ModernizedCProgram.astrcmpi(rc, "CBR") == 0;
		 vbr = ModernizedCProgram.astrcmpi(rc, "VBR") == 0;
		Object generatedContext = enc.getContext();
		if (cbr || vbr) {
			generatedContext.setBit_rate(bitrate * 1000);
			generatedContext.setRc_max_rate(bitrate * 1000);
		} 
		return true;
	}
	public void nvenc_defaults() {
		settings.obs_data_set_default_int("bitrate", 2500);
		settings.obs_data_set_default_int("max_bitrate", 5000);
		settings.obs_data_set_default_int("keyint_sec", 0);
		settings.obs_data_set_default_int("cqp", 20);
		settings.obs_data_set_default_string("rate_control", "CBR");
		settings.obs_data_set_default_string("preset", "hq");
		settings.obs_data_set_default_string("profile", "high");
		settings.obs_data_set_default_bool("psycho_aq", true);
		settings.obs_data_set_default_int("gpu", 0);
		settings.obs_data_set_default_int("bf", 2);
	}
	public void sharpness_update(Object data) {
		sharpness_data filter = data;
		double sharpness = settings.obs_data_get_double("sharpness");
		filter.setSharpness((double)sharpness);
	}
	public void sharpness_defaults() {
		settings.obs_data_set_default_double("sharpness", 0.08);
	}
	/* ----------------------------------- */
	public void frontend_save_callback(Object saving, Object priv) {
		python_obs_callback cb = priv;
		script_callback generatedBase = cb.getBase();
		Object generatedRemoved = generatedBase.getRemoved();
		if (generatedRemoved) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/obs_frontend_remove_save_callback(frontend_save_callback, cb);
			return /*Error: Unsupported expression*/;
		} 
		 gstate = /*Error: Function owner not recognized*/Import_PyGILState_Ensure();
		ModernizedCProgram.PyObject * py_save_data;
		obs_script generatedScript = generatedBase.getScript();
		Object generatedFunc = cb.getFunc();
		if (ModernizedCProgram.libobs_to_py_("obs_data_t *", save_data, false, py_save_data, NULL, __FUNCTION__, 272)) {
			 args = /*Error: Function owner not recognized*/Import_Py_BuildValue("(Op)", py_save_data, saving);
			python_obs_callback last_cb = ModernizedCProgram.cur_python_cb;
			ModernizedCProgram.cur_python_cb = cb;
			ModernizedCProgram.cur_python_script = (obs_python_script)generatedScript;
			 py_ret = /*Error: Function owner not recognized*/Import_PyObject_CallObject(generatedFunc, args);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Py_XDECREF(py_ret);
			ModernizedCProgram.py_error_(__FUNCTION__, 281);
			ModernizedCProgram.cur_python_script = NULL;
			ModernizedCProgram.cur_python_cb = last_cb;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Py_XDECREF(args);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Py_XDECREF(py_save_data);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Import_PyGILState_Release(gstate);
		lua_obs_callback cb = priv;
		Object generatedScript = cb.getScript();
		 script = generatedScript;
		script_callback generatedBase = cb.getBase();
		Object generatedRemoved = generatedBase.getRemoved();
		if (generatedRemoved) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/obs_frontend_remove_save_callback(frontend_save_callback, cb);
			return /*Error: Unsupported expression*/;
		} 
		obs_lua_script __last_script = ModernizedCProgram.current_lua_script;
		lua_obs_callback __last_callback = ModernizedCProgram.current_lua_cb;
		ModernizedCProgram.current_lua_cb = cb;
		ModernizedCProgram.current_lua_script = (obs_lua_script)generatedScript;
		ModernizedCProgram.pthread_mutex_lock(ModernizedCProgram.current_lua_script.getMutex());
		;
		ModernizedCProgram.ls_push_libobs_obj_(script, "obs_data_t *", save_data, false, NULL, __FUNCTION__, 248);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/lua_pushboolean(script, saving);
		int generatedReg_idx = cb.getReg_idx();
		ModernizedCProgram.call_func_(script, generatedReg_idx, 2, 0, "frontend_save_callback", "frontend API");
		ModernizedCProgram.pthread_mutex_unlock(ModernizedCProgram.current_lua_script.getMutex());
		ModernizedCProgram.current_lua_script = __last_script;
		ModernizedCProgram.current_lua_cb = __last_callback;
		;
	}
	public void jack_update(Object vptr) {
		jack_data data = (jack_data)vptr;
		if (!data) {
			return /*Error: Unsupported expression*/;
		} 
		byte new_device;
		 settings_changed = false;
		 new_jack_start_server = settings.obs_data_get_bool("startjack");
		int new_channel_count = settings.obs_data_get_int("channels");
		Object generatedStart_jack_server = data.getStart_jack_server();
		if (new_jack_start_server != generatedStart_jack_server) {
			data.setStart_jack_server(new_jack_start_server);
			settings_changed = true;
		} 
		Object generatedChannels = data.getChannels();
		if (new_channel_count != generatedChannels) {
			settings_changed = true;
		} 
		obs_source generatedSource = data.getSource();
		new_device = ModernizedCProgram.obs_source_get_name(generatedSource);
		Byte generatedDevice = data.getDevice();
		if (!generatedDevice || /*Error: Function owner not recognized*/strcmp(generatedDevice, new_device) != 0) {
			if (generatedDevice) {
				ModernizedCProgram.bfree(generatedDevice);
			} 
			data.setDevice(ModernizedCProgram.bstrdup(new_device));
			settings_changed = true;
		} 
		if (settings_changed) {
			data.deactivate_jack();
			data.setChannels(new_channel_count);
			if (data.jack_init() != 0) {
				data.deactivate_jack();
			} 
		} 
	}
	public void jack_input_defaults() {
		settings.obs_data_set_default_int("channels", 2);
		settings.obs_data_set_default_bool("startjack", false/**
		 * Get plugin properties
		 */);
	}
	public void scale_filter_update(Object data) {
		scale_filter_data filter = data;
		int ret;
		byte res_str = settings.obs_data_get_string("resolution");
		byte sampling = settings.obs_data_get_string("sampling");
		filter.setValid(true);
		filter.setBase_canvas_resolution(false);
		Object generatedBase_width = ovi.getBase_width();
		Object generatedBase_height = ovi.getBase_height();
		int generatedCx_in = filter.getCx_in();
		int generatedCy_in = filter.getCy_in();
		if (/*Error: Function owner not recognized*/strcmp(res_str, ModernizedCProgram.obs_module_text("Base.Canvas")) == 0) {
			obs_video_info ovi = new obs_video_info();
			ovi.obs_get_video_info();
			filter.setAspect_ratio_only(false);
			filter.setBase_canvas_resolution(true);
			filter.setCx_in(generatedBase_width);
			filter.setCy_in(generatedBase_height);
		} else {
				ret = /*Error: Function owner not recognized*/sscanf(res_str, "%dx%d", generatedCx_in, generatedCy_in);
				if (ret == 2) {
					filter.setAspect_ratio_only(false);
				} else {
						ret = /*Error: Function owner not recognized*/sscanf(res_str, "%d:%d", generatedCx_in, generatedCy_in);
						if (ret != 2) {
							filter.setValid(false);
							return /*Error: Unsupported expression*/;
						} 
						filter.setAspect_ratio_only(true);
				} 
		} 
		if (ModernizedCProgram.astrcmpi(sampling, "point") == 0) {
			filter.setSampling(obs_scale_type.OBS_SCALE_POINT);
		}  else if (ModernizedCProgram.astrcmpi(sampling, "bilinear") == 0) {
			filter.setSampling(obs_scale_type.OBS_SCALE_BILINEAR);
		}  else if (ModernizedCProgram.astrcmpi(sampling, "lanczos") == 0) {
			filter.setSampling(obs_scale_type.OBS_SCALE_LANCZOS);
		}  else if (ModernizedCProgram.astrcmpi(sampling, "area") == 0) {
			filter.setSampling(obs_scale_type.OBS_SCALE_AREA);
		} else {
				filter.setSampling(/* S_SAMPLING_BICUBIC */obs_scale_type.OBS_SCALE_BICUBIC);
		} 
		filter.setUndistort(settings.obs_data_get_bool("undistort"));
	}
	public void scale_filter_defaults() {
		settings.obs_data_set_default_string("sampling", "bicubic");
		settings.obs_data_set_default_string("resolution", ModernizedCProgram.obs_module_text("None"));
		settings.obs_data_set_default_bool("undistort", 0);
	}
	public void expander_defaults() {
		byte presets = ModernizedCProgram.s.obs_data_get_string("presets");
		 is_expander_preset = true;
		if (/*Error: Function owner not recognized*/strcmp(presets, "gate") == 0) {
			is_expander_preset = false;
		} 
		ModernizedCProgram.s.obs_data_set_default_string("presets", is_expander_preset ? "expander" : "gate");
		ModernizedCProgram.s.obs_data_set_default_double("ratio", is_expander_preset ? 2.0 : 10.0);
		ModernizedCProgram.s.obs_data_set_default_double("threshold", -40.0);
		ModernizedCProgram.s.obs_data_set_default_int("attack_time", 10);
		ModernizedCProgram.s.obs_data_set_default_int("release_time", is_expander_preset ? 50 : 125);
		ModernizedCProgram.s.obs_data_set_default_double("output_gain", 0.0);
		ModernizedCProgram.s.obs_data_set_default_string("detector", "RMS");
	}
	public void expander_update(Object data) {
		expander_data cd = data;
		byte presets = ModernizedCProgram.s.obs_data_get_string("presets");
		Object generatedIs_gate = cd.getIs_gate();
		if (/*Error: Function owner not recognized*/strcmp(presets, "expander") == 0 && generatedIs_gate) {
			ModernizedCProgram.s.obs_data_clear();
			ModernizedCProgram.s.obs_data_set_string("presets", "expander");
			ModernizedCProgram.s.expander_defaults();
			cd.setIs_gate(false);
		} 
		if (/*Error: Function owner not recognized*/strcmp(presets, "gate") == 0 && !generatedIs_gate) {
			ModernizedCProgram.s.obs_data_clear();
			ModernizedCProgram.s.obs_data_set_string("presets", "gate");
			ModernizedCProgram.s.expander_defaults();
			cd.setIs_gate(true);
		} 
		uint32_t sample_rate = ModernizedCProgram.audio_output_get_sample_rate(ModernizedCProgram.obs_get_audio());
		 num_channels = ModernizedCProgram.audio_output_get_channels(ModernizedCProgram.obs_get_audio());
		double attack_time_ms = (double)ModernizedCProgram.s.obs_data_get_int("attack_time");
		double release_time_ms = (double)ModernizedCProgram.s.obs_data_get_int("release_time");
		double output_gain_db = (double)ModernizedCProgram.s.obs_data_get_double("output_gain");
		cd.setRatio((double)ModernizedCProgram.s.obs_data_get_double("ratio"));
		cd.setThreshold((double)ModernizedCProgram.s.obs_data_get_double("threshold"));
		cd.setAttack_gain(ModernizedCProgram.gain_coefficient(sample_rate, attack_time_ms / ((double)1000)));
		cd.setRelease_gain(ModernizedCProgram.gain_coefficient(sample_rate, release_time_ms / ((double)1000)));
		cd.setOutput_gain(ModernizedCProgram.db_to_mul(output_gain_db));
		cd.setNum_channels(num_channels);
		cd.setSample_rate(sample_rate);
		double generatedRatio = cd.getRatio();
		cd.setSlope(1.0 - generatedRatio);
		byte detect_mode = ModernizedCProgram.s.obs_data_get_string("detector");
		if (/*Error: Function owner not recognized*/strcmp(detect_mode, "RMS") == 0) {
			cd.setDetector(.RMS_DETECT);
		} 
		if (/*Error: Function owner not recognized*/strcmp(detect_mode, "peak") == 0) {
			cd.setDetector(.PEAK_DETECT);
		} 
		 sample_len = sample_rate * 10 / 1000;
		Object generatedEnvelope_buf_len = cd.getEnvelope_buf_len();
		if (generatedEnvelope_buf_len == 0) {
			cd.resize_env_buffer(sample_len);
		} 
		Object generatedRunaverage_len = cd.getRunaverage_len();
		if (generatedRunaverage_len == 0) {
			cd.resize_runaverage_buffer(sample_len);
		} 
		Object generatedEnv_in_len = cd.getEnv_in_len();
		if (generatedEnv_in_len == 0) {
			cd.resize_env_in_buffer(sample_len);
		} 
		Object generatedGaindB_len = cd.getGaindB_len();
		if (generatedGaindB_len == 0) {
			cd.resize_gaindB_buffer(sample_len);
		} 
	}
	public boolean using_older_non_mode_format() {
		return settings.obs_data_has_user_value("capture_any_fullscreen") && !settings.obs_data_has_user_value("capture_mode");
	}
	public void game_capture_update(Object data) {
		game_capture gc = data;
		game_capture_config cfg = new game_capture_config();
		boolean reset_capture = false;
		byte window = settings.obs_data_get_string("window");
		ModernizedCProgram.get_config(cfg, settings, window);
		game_capture_config generatedConfig = gc.getConfig();
		reset_capture = cfg.capture_needs_reset(generatedConfig);
		boolean generatedForce_scaling = cfg.getForce_scaling();
		Object generatedScale_cx = cfg.getScale_cx();
		Object generatedScale_cy = cfg.getScale_cy();
		obs_source generatedSource = gc.getSource();
		if (generatedForce_scaling && (generatedScale_cx == 0 || generatedScale_cy == 0)) {
			gc.setError_acquiring(1);
			ModernizedCProgram.blog(LOG_WARNING, "[game-capture: '%s'] error acquiring, scale is bad", ModernizedCProgram.obs_source_get_name(generatedSource));
		} else {
				gc.setError_acquiring(0);
		} 
		capture_mode generatedMode = cfg.getMode();
		if (generatedMode == capture_mode.CAPTURE_MODE_HOTKEY && generatedMode != capture_mode.CAPTURE_MODE_HOTKEY) {
			gc.setActivate_hook(0);
		} else {
				gc.setActivate_hook(!!window && !!window);
		} 
		generatedConfig.free_config();
		gc.setConfig(cfg);
		hook_rate generatedHook_rate = generatedConfig.getHook_rate();
		gc.setRetry_interval(2.0 * ModernizedCProgram.hook_rate_to_float(generatedHook_rate));
		gc.setWait_for_target_startup(0);
		dstr generatedTitle = gc.getTitle();
		generatedTitle.dstr_free();
		dstr generatedClass = gc.getClass();
		generatedClass.dstr_free();
		dstr generatedExecutable = gc.getExecutable();
		generatedExecutable.dstr_free();
		window_priority generatedPriority = generatedConfig.getPriority();
		if (generatedMode == capture_mode.CAPTURE_MODE_WINDOW) {
			generatedTitle.dstr_copy(generatedTitle);
			generatedClass.dstr_copy(generatedClass);
			generatedExecutable.dstr_copy(generatedExecutable);
			gc.setPriority(generatedPriority);
		} 
		boolean generatedInitial_config = gc.getInitial_config();
		if (!generatedInitial_config) {
			if (reset_capture) {
				gc.stop_capture();
			} 
		} else {
				gc.setInitial_config(0);
		} 
	}
	public void game_capture_defaults() {
		settings.obs_data_set_default_string("capture_mode", "any_fullscreen");
		settings.obs_data_set_default_int("priority", (int)window_priority.WINDOW_PRIORITY_EXE);
		settings.obs_data_set_default_bool("sli_compatibility", 0);
		settings.obs_data_set_default_bool("force_scaling", 0);
		settings.obs_data_set_default_bool("capture_cursor", 1);
		settings.obs_data_set_default_bool("allow_transparency", 0);
		settings.obs_data_set_default_string("scale_res", "0x0");
		settings.obs_data_set_default_bool("limit_framerate", 0);
		settings.obs_data_set_default_bool("capture_overlays", 0);
		settings.obs_data_set_default_bool("anti_cheat_hook", 1);
		settings.obs_data_set_default_int("hook_rate", (int)hook_rate.HOOK_RATE_NORMAL);
	}
	public void noise_gate_update(Object data) {
		noise_gate_data ng = data;
		double open_threshold_db;
		double close_threshold_db;
		double sample_rate;
		int attack_time_ms;
		int hold_time_ms;
		int release_time_ms;
		open_threshold_db = (double)ModernizedCProgram.s.obs_data_get_double("open_threshold");
		close_threshold_db = (double)ModernizedCProgram.s.obs_data_get_double("close_threshold");
		attack_time_ms = (int)ModernizedCProgram.s.obs_data_get_int("attack_time");
		hold_time_ms = (int)ModernizedCProgram.s.obs_data_get_int("hold_time");
		release_time_ms = (int)ModernizedCProgram.s.obs_data_get_int("release_time");
		sample_rate = (double)ModernizedCProgram.audio_output_get_sample_rate(ModernizedCProgram.obs_get_audio());
		ng.setSample_rate_i(1.0 / sample_rate);
		ng.setChannels(ModernizedCProgram.audio_output_get_channels(ModernizedCProgram.obs_get_audio()));
		ng.setOpen_threshold(ModernizedCProgram.db_to_mul(open_threshold_db));
		ng.setClose_threshold(ModernizedCProgram.db_to_mul(close_threshold_db));
		ng.setAttack_rate(1.0 / (ModernizedCProgram.ms_to_secf(attack_time_ms) * sample_rate));
		ng.setRelease_rate(1.0 / (ModernizedCProgram.ms_to_secf(release_time_ms) * sample_rate));
		double generatedOpen_threshold = ng.getOpen_threshold();
		double generatedClose_threshold = ng.getClose_threshold();
		double threshold_diff = generatedOpen_threshold - generatedClose_threshold;
		double min_decay_period = (1.0 / 75.0) * sample_rate;
		ng.setDecay_rate(threshold_diff / min_decay_period);
		ng.setHold_time(ModernizedCProgram.ms_to_secf(hold_time_ms));
		ng.setIs_open(false);
		ng.setAttenuation(0.0);
		ng.setLevel(0.0);
		ng.setHeld_time(0.0);
	}
	public void noise_gate_defaults() {
		ModernizedCProgram.s.obs_data_set_default_double("open_threshold", -26.0);
		ModernizedCProgram.s.obs_data_set_default_double("close_threshold", -32.0);
		ModernizedCProgram.s.obs_data_set_default_int("attack_time", 25);
		ModernizedCProgram.s.obs_data_set_default_int("hold_time", 200);
		ModernizedCProgram.s.obs_data_set_default_int("release_time", 150);
	}
	public Object vt_h264_update(Object data) {
		vt_h264_encoder enc = data;
		Object generatedBitrate = enc.getBitrate();
		 old_bitrate = generatedBitrate;
		Object generatedLimit_bitrate = enc.getLimit_bitrate();
		 old_limit_bitrate = generatedLimit_bitrate;
		ModernizedCProgram.update_params(enc, settings);
		if (old_bitrate == generatedBitrate && old_limit_bitrate == generatedLimit_bitrate) {
			return true;
		} 
		Object generatedSession = enc.getSession();
		Object generatedRc_max_bitrate = enc.getRc_max_bitrate();
		double generatedRc_max_bitrate_window = enc.getRc_max_bitrate_window();
		 code = ModernizedCProgram.session_set_bitrate(generatedSession, generatedBitrate, generatedLimit_bitrate, generatedRc_max_bitrate, generatedRc_max_bitrate_window);
		obs_encoder generatedEncoder = enc.getEncoder();
		if (code != noErr) {
			ModernizedCProgram.blog(LOG_WARNING, "[VideoToolbox %s: 'h264']: failed to set bitrate to session", ModernizedCProgram.obs_encoder_get_name(generatedEncoder));
		} 
		 n = new ();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/VTSessionCopyProperty(generatedSession, kVTCompressionPropertyKey_AverageBitRate, NULL, n);
		 session_bitrate = new ();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CFNumberGetValue(n, kCFNumberIntType, session_bitrate);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CFRelease(n);
		if (session_bitrate == old_bitrate) {
			ModernizedCProgram.blog(LOG_WARNING, "[VideoToolbox %s: 'h264']: failed to update current session  bitrate from %d->%d", ModernizedCProgram.obs_encoder_get_name(generatedEncoder), old_bitrate, generatedBitrate);
		} 
		enc.dump_encoder_info();
		return true;
	}
	public void vt_h264_defaults() {
		settings.obs_data_set_default_int("bitrate", 2500);
		settings.obs_data_set_default_bool("limit_bitrate", false);
		settings.obs_data_set_default_int("max_bitrate", 2500);
		settings.obs_data_set_default_double("max_bitrate_window", 1.5);
		settings.obs_data_set_default_int("keyint_sec", 0);
		settings.obs_data_set_default_string("profile", "");
		settings.obs_data_set_default_bool("bframes", true);
	}
	public void image_source_update(Object data) {
		image_source context = data;
		byte file = settings.obs_data_get_string("file");
		 unload = settings.obs_data_get_bool("unload");
		Byte generatedFile = context.getFile();
		if (generatedFile) {
			ModernizedCProgram.bfree(generatedFile);
		} 
		context.setFile(ModernizedCProgram.bstrdup(file));
		context.setPersistent(!unload);
		Object generatedPersistent = context.getPersistent();
		obs_source generatedSource = context.getSource();
		if (generatedPersistent || ModernizedCProgram.obs_source_showing(generatedSource)) {
			data.image_source_load();
		} else {
				data.image_source_unload();
		} 
	}
	public void image_source_defaults() {
		settings.obs_data_set_default_bool("unload", false);
	}
	public void swipe_update(Object data) {
		swipe_info swipe = data;
		byte dir = settings.obs_data_get_string("direction");
		swipe.setSwipe_in(settings.obs_data_get_bool("swipe_in"));
		if (/*Error: Function owner not recognized*/strcmp(dir, "right") == 0) {
			swipe.setDir(/*Error: Unsupported expression*/);
		}  else if (/*Error: Function owner not recognized*/strcmp(dir, "up") == 0) {
			swipe.setDir(/*Error: Unsupported expression*/);
		}  else if (/*Error: Function owner not recognized*/strcmp(dir, "down") == 0) {
			swipe.setDir(/*Error: Unsupported expression*/);
		} else {
				swipe.setDir(/*Error: Unsupported expression*/);
		} 
	}
	public void luma_wipe_update(Object data) {
		luma_wipe_info lwipe = data;
		byte name = settings.obs_data_get_string("luma_image");
		lwipe.setInvert_luma(settings.obs_data_get_bool("luma_invert"));
		lwipe.setSoftness((double)settings.obs_data_get_double("luma_softness"));
		dstr path = new dstr(0);
		path.dstr_copy("luma_wipes/");
		path.dstr_cat(name);
		obs_module obs_module = new obs_module();
		Object generatedDstr = path.getDstr();
		byte file = obs_module.obs_current_module().obs_find_module_file(generatedDstr);
		ModernizedCProgram.obs_enter_graphics();
		Object generatedLuma_image = lwipe.getLuma_image();
		generatedLuma_image.gs_image_file_free();
		ModernizedCProgram.obs_leave_graphics();
		generatedLuma_image.gs_image_file_init(file);
		ModernizedCProgram.obs_enter_graphics();
		generatedLuma_image.gs_image_file_init_texture();
		ModernizedCProgram.obs_leave_graphics();
		ModernizedCProgram.bfree(file);
		path.dstr_free();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(settings);
	}
	public void luma_wipe_defaults() {
		settings.obs_data_set_default_string("luma_image", "linear-h.png");
		settings.obs_data_set_default_double("luma_softness", 0.03);
		settings.obs_data_set_default_bool("luma_invert", false);
	}
	public void color_key_update(Object data) {
		color_key_filter_data filter = data;
		ModernizedCProgram.color_settings_update(filter, settings);
		ModernizedCProgram.key_settings_update(filter, settings);
	}
	public void color_key_defaults() {
		settings.obs_data_set_default_int("opacity", 100);
		settings.obs_data_set_default_double("contrast", 0.0);
		settings.obs_data_set_default_double("brightness", 0.0);
		settings.obs_data_set_default_double("gamma", 0.0);
		settings.obs_data_set_default_int("key_color", -1024);
		settings.obs_data_set_default_string("key_color_type", "green");
		settings.obs_data_set_default_int("similarity", 80);
		settings.obs_data_set_default_int("smoothness", 50);
	}
	public obs_data obs_encoder_defaults(Object id) {
		obs_encoder_info obs_encoder_info = new obs_encoder_info();
		obs_encoder_info info = obs_encoder_info.find_encoder(id);
		return (info) ? info.get_defaults() : NULL;
	}
	public obs_data obs_encoder_get_defaults(Object encoder) {
		if (!ModernizedCProgram.obs_object_valid(encoder, "obs_encoder_defaults", "encoder")) {
			return NULL;
		} 
		return encoder.getInfo().get_defaults();
	}
	public obs_data obs_encoder_get_settings(Object encoder) {
		if (!ModernizedCProgram.obs_object_valid(encoder, "obs_encoder_get_settings", "encoder")) {
			return NULL;
		} 
		encoder.getContext().getSettings().obs_data_addref();
		return encoder.getContext().getSettings();
	}
	public void wc_update(Object data) {
		window_capture wc = data;
		ModernizedCProgram.update_settings(wc, settings);
		wc.setWindow(((Object)/* forces a reset */0));
	}
	public void wc_defaults() {
		defaults.obs_data_set_default_bool("cursor", true);
		defaults.obs_data_set_default_bool("compatibility", false);
	}
	public obs_data obs_service_defaults(Object id) {
		obs_service_info info = id.find_service();
		return (info) ? info.get_defaults() : NULL;
	}
	public obs_data obs_service_get_settings(Object service) {
		if (!ModernizedCProgram.obs_object_valid(service, "obs_service_get_settings", "service")) {
			return NULL;
		} 
		service.getContext().getSettings().obs_data_addref();
		return service.getContext().getSettings();
	}
	public obs_data get_package(Object base_path, Object file) {
		byte full_path = ModernizedCProgram.get_path(base_path, file);
		obs_data obs_data = new obs_data();
		obs_data_t package = obs_data.obs_data_create_from_json_file(full_path);
		ModernizedCProgram.bfree(full_path);
		return package;
	}
	public void enum_files(Object enum_func, Object param) {
		obs_data_array obs_data_array = new obs_data_array();
		obs_data_array_t array = obs_data_array.obs_data_get_array(package, "files");
		 num = new ();
		if (!array) {
			return /*Error: Unsupported expression*/;
		} 
		num = array.obs_data_array_count();
		obs_data obs_data = new obs_data();
		for ( i = 0;
		 i < num; i++) {
			obs_data_t file = obs_data.obs_data_array_item(array, i);
			 continue_enum = /*Error: Function owner not recognized*/enum_func(param, file);
			file.obs_data_release();
			if (!continue_enum) {
				break;
			} 
		}
		array.obs_data_array_release();
	}
	public Object newer_than_cache(Object param) {
		file_update_data input = param;
		byte name = cache_file.obs_data_get_string("name");
		int version = (int)cache_file.obs_data_get_int("version");
		Object generatedName = input.getName();
		int generatedVersion = input.getVersion();
		if (/*Error: Function owner not recognized*/strcmp(generatedName, name) == 0) {
			input.setFound(true);
			input.setNewer(generatedVersion > version);
			return false;
		} 
		return true;
	}
	public Object update_files_to_local(Object param) {
		update_info info = param;
		file_update_data data = new file_update_data(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		obs_data generatedCache_package = info.getCache_package();
		generatedCache_package.enum_files(newer_than_cache, data);
		Object generatedNewer = data.getNewer();
		Object generatedFound = data.getFound();
		Object generatedName = data.getName();
		if (generatedNewer || !generatedFound) {
			info.copy_local_to_cache(generatedName);
		} 
		return true;
	}
	public Object update_remote_files(Object param) {
		update_info info = param;
		file_update_data data = new file_update_data(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		obs_data generatedCache_package = info.getCache_package();
		generatedCache_package.enum_files(newer_than_cache, data);
		Object generatedNewer = data.getNewer();
		Object generatedFound = data.getFound();
		if (!generatedNewer && generatedFound) {
			return true;
		} 
		Object generatedRemote_url = info.getRemote_url();
		Object generatedName = data.getName();
		if (!info.do_relative_http_request(generatedRemote_url, generatedName)) {
			return true;
		} 
		Object generatedCallback = info.getCallback();
		int generatedVersion = data.getVersion();
		Object generatedFile_data = info.getFile_data();
		Object generatedBuffer = download_data.getBuffer();
		Object generatedParam = info.getParam();
		Byte generatedLog_prefix = info.getLog_prefix();
		if (generatedCallback) {
			file_download_data download_data = new file_download_data();
			 confirm = new ();
			download_data.setName(generatedName);
			download_data.setVersion(generatedVersion);
			generatedBuffer.setDa(generatedFile_data.getDa());
			confirm = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedParam, download_data);
			generatedFile_data.setDa(generatedBuffer.getDa());
			if (!confirm) {
				ModernizedCProgram.blog(LOG_WARNING, "%sUpdate file '%s' (version %d) rejected", generatedLog_prefix, generatedName, generatedVersion);
				return true;
			} 
		} 
		Byte generatedTemp = info.getTemp();
		info.write_file_data(generatedTemp, generatedName);
		Byte generatedCache = info.getCache();
		ModernizedCProgram.replace_file(generatedTemp, generatedCache, generatedName);
		ModernizedCProgram.blog(LOG_WARNING, "%sSuccessfully updated file '%s' (version %d)", generatedLog_prefix, generatedName, generatedVersion);
		return true;
	}
	public void obs_lua_source_get_defaults(Object type_data) {
		obs_lua_source ls = type_data;
		Object generatedDefinition_mutex = ls.getDefinition_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedDefinition_mutex);
		Object generatedScript = ls.getScript();
		if (!generatedScript) {
			;
		} 
		int generatedFunc_get_defaults = ls.getFunc_get_defaults();
		if (!(generatedFunc_get_defaults != LUA_REFNIL)) {
			;
		} 
		obs_lua_script generatedData = ls.getData();
		obs_lua_script __data = generatedData;
		obs_lua_script __prev_script = ModernizedCProgram.current_lua_script;
		ModernizedCProgram.current_lua_script = __data;
		Object generatedMutex = __data.getMutex();
		ModernizedCProgram.pthread_mutex_lock(generatedMutex);
		;
		Object generatedId = ls.getId();
		ModernizedCProgram.ls_push_libobs_obj_(generatedScript, "obs_data_t *", settings, false, generatedId, __FUNCTION__, 336);
		Object generatedDisplay_name = ls.getDisplay_name();
		ModernizedCProgram.call_func_(generatedScript, generatedFunc_get_defaults, 1, 0, "get_defaults", generatedDisplay_name);
		ModernizedCProgram.pthread_mutex_unlock(generatedMutex);
		ModernizedCProgram.current_lua_script = __prev_script;
		;
	}
	public void obs_lua_source_update(Object data) {
		obs_lua_data ld = data;
		obs_lua_source generatedLs = ld.getLs();
		obs_lua_source ls = generatedLs;
		Object generatedDefinition_mutex = ls.getDefinition_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedDefinition_mutex);
		Object generatedScript = ls.getScript();
		if (!generatedScript) {
			;
		} 
		int generatedFunc_update = ls.getFunc_update();
		if (!(generatedFunc_update != LUA_REFNIL)) {
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
		Object generatedId = ls.getId();
		ModernizedCProgram.ls_push_libobs_obj_(generatedScript, "obs_data_t *", settings, false, generatedId, __FUNCTION__, 386);
		Object generatedDisplay_name = ls.getDisplay_name();
		ModernizedCProgram.call_func_(generatedScript, generatedFunc_update, 2, 0, "update", generatedDisplay_name);
		ModernizedCProgram.pthread_mutex_unlock(generatedMutex);
		ModernizedCProgram.current_lua_script = __prev_script;
		;
	}
	public void obs_lua_source_save(Object data) {
		obs_lua_data ld = data;
		obs_lua_source generatedLs = ld.getLs();
		obs_lua_source ls = generatedLs;
		Object generatedDefinition_mutex = ls.getDefinition_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedDefinition_mutex);
		Object generatedScript = ls.getScript();
		if (!generatedScript) {
			;
		} 
		int generatedFunc_save = ls.getFunc_save();
		if (!(generatedFunc_save != LUA_REFNIL)) {
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
		Object generatedId = ls.getId();
		ModernizedCProgram.ls_push_libobs_obj_(generatedScript, "obs_data_t *", settings, false, generatedId, __FUNCTION__, 473);
		Object generatedDisplay_name = ls.getDisplay_name();
		ModernizedCProgram.call_func_(generatedScript, generatedFunc_save, 2, 0, "save", generatedDisplay_name);
		ModernizedCProgram.pthread_mutex_unlock(generatedMutex);
		ModernizedCProgram.current_lua_script = __prev_script;
		;
	}
	public void obs_lua_source_load(Object data) {
		obs_lua_data ld = data;
		obs_lua_source generatedLs = ld.getLs();
		obs_lua_source ls = generatedLs;
		Object generatedDefinition_mutex = ls.getDefinition_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedDefinition_mutex);
		Object generatedScript = ls.getScript();
		if (!generatedScript) {
			;
		} 
		int generatedFunc_load = ls.getFunc_load();
		if (!(generatedFunc_load != LUA_REFNIL)) {
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
		Object generatedId = ls.getId();
		ModernizedCProgram.ls_push_libobs_obj_(generatedScript, "obs_data_t *", settings, false, generatedId, __FUNCTION__, 496);
		Object generatedDisplay_name = ls.getDisplay_name();
		ModernizedCProgram.call_func_(generatedScript, generatedFunc_load, 2, 0, "load", generatedDisplay_name);
		ModernizedCProgram.pthread_mutex_unlock(generatedMutex);
		ModernizedCProgram.current_lua_script = __prev_script;
		;
	}
	public void async_delay_filter_update(Object data) {
		async_delay_data filter = data;
		 new_interval = ()settings.obs_data_get_int("delay_ms") * -1024;
		Object generatedInterval = filter.getInterval();
		obs_source generatedContext = filter.getContext();
		obs_source obs_source = new obs_source();
		if (new_interval < generatedInterval) {
			ModernizedCProgram.free_video_data(filter, obs_source.obs_filter_get_parent(generatedContext));
		} 
		filter.setReset_audio(true);
		filter.setReset_video(true);
		filter.setInterval(new_interval);
		filter.setVideo_delay_reached(false);
		filter.setAudio_delay_reached(false);
	}
	public void alsa_update(Object vptr) {
		alsa_data data = vptr;
		byte device;
		int rate;
		 reset = false;
		device = settings.obs_data_get_string("device_id");
		if (/*Error: Function owner not recognized*/strcmp(device, "__custom__") == 0) {
			device = settings.obs_data_get_string("custom_pcm");
		} 
		Byte generatedDevice = data.getDevice();
		if (/*Error: Function owner not recognized*/strcmp(generatedDevice, device) != 0) {
			ModernizedCProgram.bfree(generatedDevice);
			data.setDevice(ModernizedCProgram.bstrdup(device));
			reset = true;
		} 
		rate = settings.obs_data_get_int("rate");
		int generatedRate = data.getRate();
		if (generatedRate != rate) {
			data.setRate(rate);
			reset = true;
		} 
		Object generatedHandle = data.getHandle();
		if (reset) {
			if (generatedHandle) {
				data._alsa_close();
			} 
			data._alsa_try_open();
		} 
	}
	public void alsa_get_defaults() {
		settings.obs_data_set_default_string("device_id", "default");
		settings.obs_data_set_default_string("custom_pcm", "default");
		settings.obs_data_set_default_int("rate", 44100);
	}
	public void enc_defaults() {
		settings.obs_data_set_default_int("bitrate", 128);
	}
	public void v4l2_defaults() {
		settings.obs_data_set_default_int("input", -1);
		settings.obs_data_set_default_int("pixelformat", -1);
		settings.obs_data_set_default_int("standard", -1);
		settings.obs_data_set_default_int("dv_timing", -1);
		settings.obs_data_set_default_int("resolution", -1);
		settings.obs_data_set_default_int("framerate", -1);
		settings.obs_data_set_default_int("color_range", VIDEO_RANGE_DEFAULT);
		settings.obs_data_set_default_bool("buffering", true/**
		 * Enable/Disable all properties for the source.
		 *
		 * @note A property that should be ignored can be specified
		 *
		 * @param props the source properties
		 * @param ignore ignore this property
		 * @param enable enable/disable all properties
		 */);
	}
	public void v4l2_update(Object vptr) {
		v4l2_data data = vptr;
		;
		data.v4l2_terminate();
		Byte generatedDevice_id = data.getDevice_id();
		if (generatedDevice_id) {
			ModernizedCProgram.bfree(generatedDevice_id);
		} 
		data.setDevice_id(ModernizedCProgram.bstrdup(settings.obs_data_get_string("device_id")));
		data.setInput(settings.obs_data_get_int("input"));
		data.setPixfmt(settings.obs_data_get_int("pixelformat"));
		data.setStandard(settings.obs_data_get_int("standard"));
		data.setDv_timing(settings.obs_data_get_int("dv_timing"));
		data.setResolution(settings.obs_data_get_int("resolution"));
		data.setFramerate(settings.obs_data_get_int("framerate"));
		data.setColor_range(settings.obs_data_get_int("color_range"));
		ModernizedCProgram.v4l2_update_source_flags(data, settings);
		data.v4l2_init();
	}
	public Object getRef() {
		return ref;
	}
	public void setRef(Object newRef) {
		ref = newRef;
	}
	public Byte getJson() {
		return json;
	}
	public void setJson(Byte newJson) {
		json = newJson;
	}
	public obs_data_item getFirst_item() {
		return first_item;
	}
	public void setFirst_item(obs_data_item newFirst_item) {
		first_item = newFirst_item;
	}
}

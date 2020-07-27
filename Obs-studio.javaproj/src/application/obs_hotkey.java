package application;

/* hotkeys */
public class obs_hotkey {
	private Object id;
	private Byte name;
	private Byte description;
	private Object func;
	private Object data;
	private int pressed;
	private obs_hotkey_registerer_type registerer_type;
	private Object registerer;
	private Object pair_partner_id;
	
	public obs_hotkey(Object id, Byte name, Byte description, Object func, Object data, int pressed, obs_hotkey_registerer_type registerer_type, Object registerer, Object pair_partner_id) {
		setId(id);
		setName(name);
		setDescription(description);
		setFunc(func);
		setData(data);
		setPressed(pressed);
		setRegisterer_type(registerer_type);
		setRegisterer(registerer);
		setPair_partner_id(pair_partner_id);
	}
	public obs_hotkey() {
	}
	
	public void replay_buffer_hotkey(Object data, Object id, Object pressed) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(id);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(hotkey);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(pressed);
		if (!pressed) {
			return /*Error: Unsupported expression*/;
		} 
		ffmpeg_muxer stream = data;
		Object generatedActive = stream.getActive();
		obs_output generatedOutput = stream.getOutput();
		obs_encoder obs_encoder = new obs_encoder();
		if (ModernizedCProgram.os_atomic_load_bool(generatedActive)) {
			obs_encoder_t vencoder = obs_encoder.obs_output_get_video_encoder(generatedOutput);
			if (ModernizedCProgram.obs_encoder_paused(vencoder)) {
				ModernizedCProgram.blog(LOG_INFO, "[ffmpeg muxer: '%s'] Could not save buffer because encoders paused", ModernizedCProgram.obs_output_get_name(generatedOutput));
				return /*Error: Unsupported expression*/;
			} 
			stream.setSave_ts(ModernizedCProgram.os_gettime_ns() / -1024);
		} 
	}
	public void hotkey_callback(Object p_cb, Object id, Object pressed) {
		python_obs_callback cb = p_cb;
		script_callback generatedBase = cb.getBase();
		Object generatedRemoved = generatedBase.getRemoved();
		if (generatedRemoved) {
			return /*Error: Unsupported expression*/;
		} 
		if (pressed) {
			ModernizedCProgram.defer_call_post(defer_hotkey_pressed, cb);
		} else {
				ModernizedCProgram.defer_call_post(defer_hotkey_unpressed, cb);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(hotkey);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(id);
		lua_obs_callback cb = p_cb;
		script_callback generatedBase = cb.getBase();
		Object generatedRemoved = generatedBase.getRemoved();
		if (generatedRemoved) {
			return /*Error: Unsupported expression*/;
		} 
		if (pressed) {
			ModernizedCProgram.defer_call_post(defer_hotkey_pressed, cb);
		} else {
				ModernizedCProgram.defer_call_post(defer_hotkey_unpressed, cb);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(hotkey);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(id);
	}
	public void restart_hotkey(Object data, Object id, Object pressed) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(id);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(hotkey);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(pressed);
		ffmpeg_source s = data;
		obs_source generatedSource = s.getSource();
		if (ModernizedCProgram.obs_source_active(generatedSource)) {
			s.ffmpeg_source_start();
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(id);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(hotkey);
		slideshow ss = data;
		obs_source generatedSource = ss.getSource();
		if (pressed && ModernizedCProgram.obs_source_active(generatedSource)) {
			ModernizedCProgram.ss_restart(ss);
		} 
	}
	public Object obs_source_hotkey_mute(Object data, Object id, Object pressed) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(id);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(ModernizedCProgram.key);
		obs_source source = data;
		if (!pressed || ModernizedCProgram.obs_source_muted(source)) {
			return false;
		} 
		source.obs_source_set_muted(true);
		return true;
	}
	public Object obs_source_hotkey_unmute(Object data, Object id, Object pressed) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(id);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(ModernizedCProgram.key);
		obs_source source = data;
		if (!pressed || !ModernizedCProgram.obs_source_muted(source)) {
			return false;
		} 
		source.obs_source_set_muted(false);
		return true;
	}
	public void obs_source_hotkey_push_to_mute(Object data, Object id, Object pressed) {
		audio_action action = new audio_action(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(id);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(ModernizedCProgram.key);
		obs_source source = data;
		Object generatedAudio_actions_mutex = source.getAudio_actions_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedAudio_actions_mutex);
		Object generatedAudio_actions = source.getAudio_actions();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_push_back(generatedAudio_actions, action);
		ModernizedCProgram.pthread_mutex_unlock(generatedAudio_actions_mutex);
		source.setUser_push_to_mute_pressed(pressed);
	}
	public void obs_source_hotkey_push_to_talk(Object data, Object id, Object pressed) {
		audio_action action = new audio_action(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(id);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(ModernizedCProgram.key);
		obs_source source = data;
		Object generatedAudio_actions_mutex = source.getAudio_actions_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedAudio_actions_mutex);
		Object generatedAudio_actions = source.getAudio_actions();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_push_back(generatedAudio_actions, action);
		ModernizedCProgram.pthread_mutex_unlock(generatedAudio_actions_mutex);
		source.setUser_push_to_talk_pressed(pressed);
	}
	public Object hotkey_show_sceneitem(Object data, Object id, Object pressed) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(id);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(hotkey);
		obs_sceneitem_t si = data.sceneitem_get_ref();
		Object generatedUser_visible = si.getUser_visible();
		if (pressed && si && !generatedUser_visible) {
			si.obs_sceneitem_set_visible(true);
			si.obs_sceneitem_release();
			return true;
		} 
		si.obs_sceneitem_release();
		return false;
	}
	public Object hotkey_hide_sceneitem(Object data, Object id, Object pressed) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(id);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(hotkey);
		obs_sceneitem_t si = data.sceneitem_get_ref();
		Object generatedUser_visible = si.getUser_visible();
		if (pressed && si && generatedUser_visible) {
			si.obs_sceneitem_set_visible(false);
			si.obs_sceneitem_release();
			return true;
		} 
		si.obs_sceneitem_release();
		return false;
	}
	public void bast_buffer_audio(Object data, Object id, Object pressed) {
		buffering_async_sync_test bast = data;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(id);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(hotkey);
		if (pressed) {
			bast.setBuffer_audio(true);
		} 
	}
	public void vlcs_play_pause_hotkey(Object data, Object id, Object pressed) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(id);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(hotkey);
		vlc_source c = data;
		obs_source generatedSource = c.getSource();
		if (pressed && ModernizedCProgram.obs_source_active(generatedSource)) {
			ModernizedCProgram.vlcs_play_pause(c);
		} 
	}
	public void vlcs_restart_hotkey(Object data, Object id, Object pressed) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(id);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(hotkey);
		vlc_source c = data;
		obs_source generatedSource = c.getSource();
		if (pressed && ModernizedCProgram.obs_source_active(generatedSource)) {
			ModernizedCProgram.vlcs_restart(c);
		} 
	}
	public void vlcs_stop_hotkey(Object data, Object id, Object pressed) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(id);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(hotkey);
		vlc_source c = data;
		obs_source generatedSource = c.getSource();
		if (pressed && ModernizedCProgram.obs_source_active(generatedSource)) {
			ModernizedCProgram.vlcs_stop(c);
		} 
	}
	public void vlcs_playlist_next_hotkey(Object data, Object id, Object pressed) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(id);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(hotkey);
		vlc_source c = data;
		obs_source generatedSource = c.getSource();
		if (pressed && ModernizedCProgram.obs_source_active(generatedSource)) {
			ModernizedCProgram.vlcs_playlist_next(c);
		} 
	}
	public void vlcs_playlist_prev_hotkey(Object data, Object id, Object pressed) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(id);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(hotkey);
		vlc_source c = data;
		obs_source generatedSource = c.getSource();
		if (pressed && ModernizedCProgram.obs_source_active(generatedSource)) {
			ModernizedCProgram.vlcs_playlist_prev(c);
		} 
	}
	public obs_hotkey obs_hotkey_binding_get_hotkey(obs_hotkey_binding binding) {
		obs_hotkey generatedHotkey = binding.getHotkey();
		return generatedHotkey;
	}
	public void hotkey_signal(Object signal) {
		 data = new ();
		data.calldata_init();
		data.calldata_set_ptr("key", hotkey);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/signal_handler_signal(ModernizedCProgram.obs.getHotkeys().getSignals(), signal, data);
		data.calldata_free();
	}
	public void obs_hotkey_pair_first_func(Object data, Object id, Object pressed) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(id);
		obs_hotkey_pair_t pair = data;
		Object generatedPressed1 = pair.getPressed1();
		if (generatedPressed1) {
			return /*Error: Unsupported expression*/;
		} 
		Object generatedPressed0 = pair.getPressed0();
		Object generatedData = pair.getData();
		Object generatedPair_id = pair.getPair_id();
		if (generatedPressed0 && !pressed) {
			pair.setPressed0(false);
		}  else if (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedData[0], generatedPair_id, hotkey, pressed)) {
			pair.setPressed0(pressed);
		} 
	}
	public void obs_hotkey_pair_second_func(Object data, Object id, Object pressed) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(id);
		obs_hotkey_pair_t pair = data;
		Object generatedPressed0 = pair.getPressed0();
		if (generatedPressed0) {
			return /*Error: Unsupported expression*/;
		} 
		Object generatedPressed1 = pair.getPressed1();
		Object generatedData = pair.getData();
		Object generatedPair_id = pair.getPair_id();
		if (generatedPressed1 && !pressed) {
			pair.setPressed1(false);
		}  else if (/*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedData[0], generatedPair_id, hotkey, pressed)) {
			pair.setPressed1(pressed);
		} 
	}
	public Object find_id_helper(Object data, Object idx) {
		obs_hotkey_internal_find_forward find = data;
		Object generatedId = this.getId();
		if (generatedId != generatedId) {
			return true;
		} 
		find.setIdx(idx);
		find.setFound(true);
		return false;
	}
	public Object enum_load_bindings(Object data, Object idx) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(idx);
		Byte generatedName = this.getName();
		obs_data_array obs_data_array = new obs_data_array();
		obs_data_array_t hotkey_data = obs_data_array.obs_data_get_array(data, generatedName);
		if (!hotkey_data) {
			return true;
		} 
		ModernizedCProgram.load_bindings(hotkey, hotkey_data);
		hotkey_data.obs_data_array_release();
		return true;
	}
	public Object enum_save_hotkey(Object data, Object idx) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(idx);
		obs_data_array obs_data_array = new obs_data_array();
		obs_data_array_t hotkey_data = obs_data_array.save_hotkey(hotkey);
		Byte generatedName = this.getName();
		ModernizedCProgram.obs_data_set_array(data, generatedName, hotkey_data);
		hotkey_data.obs_data_array_release();
		return true;
	}
	public void release_registerer() {
		Object generatedRegisterer = this.getRegisterer();
		obs_hotkey_registerer_type generatedRegisterer_type = this.getRegisterer_type();
		switch (generatedRegisterer_type) {
		case obs_hotkey_registerer_type.OBS_HOTKEY_REGISTERER_SERVICE:
				generatedRegisterer.obs_weak_service_release();
				break;
		case obs_hotkey_registerer_type.OBS_HOTKEY_REGISTERER_ENCODER:
				generatedRegisterer.obs_weak_encoder_release();
				break;
		case obs_hotkey_registerer_type.OBS_HOTKEY_REGISTERER_OUTPUT:
				generatedRegisterer.obs_weak_output_release();
				break;
		case obs_hotkey_registerer_type.OBS_HOTKEY_REGISTERER_FRONTEND:
				break;
		case obs_hotkey_registerer_type.OBS_HOTKEY_REGISTERER_SOURCE:
				generatedRegisterer.obs_weak_source_release();
				break;
		}
		this.setRegisterer(NULL);
	}
	public Object enum_hotkey(Object data, Object idx) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(idx);
		obs_hotkey_internal_enum_forward forward = data;
		Object generatedData = forward.getData();
		Object generatedId = this.getId();
		return /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedData, generatedId, hotkey);
	}
	public void play_pause_hotkey(Object data, Object id, Object pressed) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(id);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(hotkey);
		slideshow ss = data;
		obs_source generatedSource = ss.getSource();
		if (pressed && ModernizedCProgram.obs_source_active(generatedSource)) {
			ModernizedCProgram.ss_play_pause(ss);
		} 
	}
	public void stop_hotkey(Object data, Object id, Object pressed) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(id);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(hotkey);
		slideshow ss = data;
		obs_source generatedSource = ss.getSource();
		if (pressed && ModernizedCProgram.obs_source_active(generatedSource)) {
			ModernizedCProgram.ss_stop(ss);
		} 
	}
	public void next_slide_hotkey(Object data, Object id, Object pressed) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(id);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(hotkey);
		slideshow ss = data;
		Object generatedManual = ss.getManual();
		if (!generatedManual) {
			return /*Error: Unsupported expression*/;
		} 
		obs_source generatedSource = ss.getSource();
		if (pressed && ModernizedCProgram.obs_source_active(generatedSource)) {
			ModernizedCProgram.ss_next_slide(ss);
		} 
	}
	public void previous_slide_hotkey(Object data, Object id, Object pressed) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(id);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/UNUSED_PARAMETER(hotkey);
		slideshow ss = data;
		Object generatedManual = ss.getManual();
		if (!generatedManual) {
			return /*Error: Unsupported expression*/;
		} 
		obs_source generatedSource = ss.getSource();
		if (pressed && ModernizedCProgram.obs_source_active(generatedSource)) {
			ModernizedCProgram.ss_previous_slide(ss);
		} 
	}
	public boolean hotkey_start(Object data, Object id, boolean pressed) {
		game_capture gc = data;
		game_capture_config generatedConfig = gc.getConfig();
		capture_mode generatedMode = generatedConfig.getMode();
		obs_source generatedSource = gc.getSource();
		Object generatedHotkey_window = gc.getHotkey_window();
		Object generatedDeactivate_hook = gc.getDeactivate_hook();
		Object generatedActivate_hook_now = gc.getActivate_hook_now();
		if (pressed && generatedMode == capture_mode.CAPTURE_MODE_HOTKEY) {
			ModernizedCProgram.blog(LOG_INFO, "[game-capture: '%s'] Activate hotkey pressed", ModernizedCProgram.obs_source_get_name(generatedSource));
			ModernizedCProgram.os_atomic_set_long(generatedHotkey_window, (long)(uintptr_t)/*Error: Function owner not recognized*/GetForegroundWindow());
			ModernizedCProgram.os_atomic_set_bool(generatedDeactivate_hook, 1);
			ModernizedCProgram.os_atomic_set_bool(generatedActivate_hook_now, 1);
		} 
		return 1;
	}
	public boolean hotkey_stop(Object data, Object id, boolean pressed) {
		game_capture gc = data;
		game_capture_config generatedConfig = gc.getConfig();
		capture_mode generatedMode = generatedConfig.getMode();
		obs_source generatedSource = gc.getSource();
		Object generatedDeactivate_hook = gc.getDeactivate_hook();
		if (pressed && generatedMode == capture_mode.CAPTURE_MODE_HOTKEY) {
			ModernizedCProgram.blog(LOG_INFO, "[game-capture: '%s'] Deactivate hotkey pressed", ModernizedCProgram.obs_source_get_name(generatedSource));
			ModernizedCProgram.os_atomic_set_bool(generatedDeactivate_hook, 1);
		} 
		return 1;
	}
	public Object getId() {
		return id;
	}
	public void setId(Object newId) {
		id = newId;
	}
	public Byte getName() {
		return name;
	}
	public void setName(Byte newName) {
		name = newName;
	}
	public Byte getDescription() {
		return description;
	}
	public void setDescription(Byte newDescription) {
		description = newDescription;
	}
	public Object getFunc() {
		return func;
	}
	public void setFunc(Object newFunc) {
		func = newFunc;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object newData) {
		data = newData;
	}
	public int getPressed() {
		return pressed;
	}
	public void setPressed(int newPressed) {
		pressed = newPressed;
	}
	public obs_hotkey_registerer_type getRegisterer_type() {
		return registerer_type;
	}
	public void setRegisterer_type(obs_hotkey_registerer_type newRegisterer_type) {
		registerer_type = newRegisterer_type;
	}
	public Object getRegisterer() {
		return registerer;
	}
	public void setRegisterer(Object newRegisterer) {
		registerer = newRegisterer;
	}
	public Object getPair_partner_id() {
		return pair_partner_id;
	}
	public void setPair_partner_id(Object newPair_partner_id) {
		pair_partner_id = newPair_partner_id;
	}
}

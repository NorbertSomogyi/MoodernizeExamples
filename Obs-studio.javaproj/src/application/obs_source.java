package application;

/* filters */
public class obs_source {
	private obs_context_data context;
	private obs_source_info info;
	private obs_weak_source control;
	private Object flags;
	private Object default_flags;
	private Object last_obs_ver;
	private Object owns_info_id;
	private Object defer_update;
	private Object show_refs;
	private Object activate_refs;
	private Object removed;
	private Object active;
	private Object showing;
	private Object enabled;
	private Object timing_set;
	private Object timing_adjust;
	private Object resample_offset;
	private Object last_audio_ts;
	private Object next_audio_ts_min;
	private Object next_audio_sys_ts_min;
	private Object last_frame_ts;
	private Object last_sys_timestamp;
	private Object async_rendered;
	private Object audio_failed;
	private Object audio_pending;
	private Object pending_stop;
	private Object audio_active;
	private Object user_muted;
	private Object muted;
	private obs_source next_audio_source;
	private obs_source prev_next_audio_source;
	private Object audio_ts;
	private Object audio_input_buf;
	private Object last_audio_input_buf_size;
	private Object ;
	private Object audio_output_buf;
	private Object audio_mix_buf;
	private resample_info sample_info;
	private Object resampler;
	private Object audio_actions_mutex;
	private Object audio_buf_mutex;
	private Object audio_mutex;
	private Object audio_cb_mutex;
	private Object ;
	private obs_audio_data audio_data;
	private Object audio_storage_size;
	private Object audio_mixers;
	private double user_volume;
	private double volume;
	private Object sync_offset;
	private Object last_sync_offset;
	private double balance;
	private Object async_textures;
	private Object async_texrender;
	private obs_source_frame cur_async_frame;
	private Object async_gpu_conversion;
	private video_format async_format;
	private Object async_full_range;
	private video_format async_cache_format;
	private Object async_cache_full_range;
	private Object async_texture_formats;
	private int async_channel_count;
	private Object async_flip;
	private Object async_active;
	private Object async_update_texture;
	private Object async_unbuffered;
	private Object async_decoupled;
	private obs_source_frame async_preload_frame;
	private Object ;
	private Object ;
	private Object async_mutex;
	private Object async_width;
	private Object async_height;
	private Object async_cache_width;
	private Object async_cache_height;
	private Object async_convert_width;
	private Object async_convert_height;
	private Object deinterlace_offset;
	private Object deinterlace_frame_ts;
	private Object deinterlace_effect;
	private obs_source_frame prev_async_frame;
	private Object async_prev_textures;
	private Object async_prev_texrender;
	private Object deinterlace_half_duration;
	private obs_deinterlace_mode deinterlace_mode;
	private Object deinterlace_top_first;
	private Object deinterlace_rendered;
	private obs_source filter_parent;
	private obs_source filter_target;
	private Object ;
	private Object filter_mutex;
	private Object filter_texrender;
	private obs_allow_direct_render allow_direct;
	private Object rendering_filter;
	private Object mute_unmute_key;
	private Object push_to_mute_key;
	private Object push_to_talk_key;
	private Object push_to_mute_enabled;
	private Object push_to_mute_pressed;
	private Object user_push_to_mute_pressed;
	private Object push_to_talk_enabled;
	private Object push_to_talk_pressed;
	private Object user_push_to_talk_pressed;
	private Object push_to_mute_delay;
	private Object push_to_mute_stop_time;
	private Object push_to_talk_delay;
	private Object push_to_talk_stop_time;
	private Object transition_start_time;
	private Object transition_duration;
	private Object transition_tex_mutex;
	private Object transition_texrender;
	private Object transition_mutex;
	private Object transition_sources;
	private Object transitioning_video;
	private Object transitioning_audio;
	private Object transition_source_active;
	private Object transition_alignment;
	private Object transition_actual_cx;
	private Object transition_actual_cy;
	private Object transition_cx;
	private Object transition_cy;
	private Object transition_fixed_duration;
	private Object transition_use_fixed_duration;
	private obs_transition_mode transition_mode;
	private obs_transition_scale_type transition_scale_type;
	private Object transition_matrices;
	private audio_monitor monitor;
	private obs_monitoring_type monitoring_type;
	private obs_data private_settings;
	
	public obs_source(obs_context_data context, obs_source_info info, obs_weak_source control, Object flags, Object default_flags, Object last_obs_ver, Object owns_info_id, Object defer_update, Object show_refs, Object activate_refs, Object removed, Object active, Object showing, Object enabled, Object timing_set, Object timing_adjust, Object resample_offset, Object last_audio_ts, Object next_audio_ts_min, Object next_audio_sys_ts_min, Object last_frame_ts, Object last_sys_timestamp, Object async_rendered, Object audio_failed, Object audio_pending, Object pending_stop, Object audio_active, Object user_muted, Object muted, obs_source next_audio_source, obs_source prev_next_audio_source, Object audio_ts, Object audio_input_buf, Object last_audio_input_buf_size, Object,  Object audio_output_buf, Object audio_mix_buf, resample_info sample_info, Object resampler, Object audio_actions_mutex, Object audio_buf_mutex, Object audio_mutex, Object audio_cb_mutex, Object,  obs_audio_data audio_data, Object audio_storage_size, Object audio_mixers, double user_volume, double volume, Object sync_offset, Object last_sync_offset, double balance, Object async_textures, Object async_texrender, obs_source_frame cur_async_frame, Object async_gpu_conversion, video_format async_format, Object async_full_range, video_format async_cache_format, Object async_cache_full_range, Object async_texture_formats, int async_channel_count, Object async_flip, Object async_active, Object async_update_texture, Object async_unbuffered, Object async_decoupled, obs_source_frame async_preload_frame, Object,  Object,  Object async_mutex, Object async_width, Object async_height, Object async_cache_width, Object async_cache_height, Object async_convert_width, Object async_convert_height, Object deinterlace_offset, Object deinterlace_frame_ts, Object deinterlace_effect, obs_source_frame prev_async_frame, Object async_prev_textures, Object async_prev_texrender, Object deinterlace_half_duration, obs_deinterlace_mode deinterlace_mode, Object deinterlace_top_first, Object deinterlace_rendered, obs_source filter_parent, obs_source filter_target, Object,  Object filter_mutex, Object filter_texrender, obs_allow_direct_render allow_direct, Object rendering_filter, Object mute_unmute_key, Object push_to_mute_key, Object push_to_talk_key, Object push_to_mute_enabled, Object push_to_mute_pressed, Object user_push_to_mute_pressed, Object push_to_talk_enabled, Object push_to_talk_pressed, Object user_push_to_talk_pressed, Object push_to_mute_delay, Object push_to_mute_stop_time, Object push_to_talk_delay, Object push_to_talk_stop_time, Object transition_start_time, Object transition_duration, Object transition_tex_mutex, Object transition_texrender, Object transition_mutex, Object transition_sources, Object transitioning_video, Object transitioning_audio, Object transition_source_active, Object transition_alignment, Object transition_actual_cx, Object transition_actual_cy, Object transition_cx, Object transition_cy, Object transition_fixed_duration, Object transition_use_fixed_duration, obs_transition_mode transition_mode, obs_transition_scale_type transition_scale_type, Object transition_matrices, audio_monitor monitor, obs_monitoring_type monitoring_type, obs_data private_settings) {
		setContext(context);
		setInfo(info);
		setControl(control);
		setFlags(flags);
		setDefault_flags(default_flags);
		setLast_obs_ver(last_obs_ver);
		setOwns_info_id(owns_info_id);
		setDefer_update(defer_update);
		setShow_refs(show_refs);
		setActivate_refs(activate_refs);
		setRemoved(removed);
		setActive(active);
		setShowing(showing);
		setEnabled(enabled);
		setTiming_set(timing_set);
		setTiming_adjust(timing_adjust);
		setResample_offset(resample_offset);
		setLast_audio_ts(last_audio_ts);
		setNext_audio_ts_min(next_audio_ts_min);
		setNext_audio_sys_ts_min(next_audio_sys_ts_min);
		setLast_frame_ts(last_frame_ts);
		setLast_sys_timestamp(last_sys_timestamp);
		setAsync_rendered(async_rendered);
		setAudio_failed(audio_failed);
		setAudio_pending(audio_pending);
		setPending_stop(pending_stop);
		setAudio_active(audio_active);
		setUser_muted(user_muted);
		setMuted(muted);
		setNext_audio_source(next_audio_source);
		setPrev_next_audio_source(prev_next_audio_source);
		setAudio_ts(audio_ts);
		setAudio_input_buf(audio_input_buf);
		setLast_audio_input_buf_size(last_audio_input_buf_size);
		set();
		setAudio_output_buf(audio_output_buf);
		setAudio_mix_buf(audio_mix_buf);
		setSample_info(sample_info);
		setResampler(resampler);
		setAudio_actions_mutex(audio_actions_mutex);
		setAudio_buf_mutex(audio_buf_mutex);
		setAudio_mutex(audio_mutex);
		setAudio_cb_mutex(audio_cb_mutex);
		set();
		setAudio_data(audio_data);
		setAudio_storage_size(audio_storage_size);
		setAudio_mixers(audio_mixers);
		setUser_volume(user_volume);
		setVolume(volume);
		setSync_offset(sync_offset);
		setLast_sync_offset(last_sync_offset);
		setBalance(balance);
		setAsync_textures(async_textures);
		setAsync_texrender(async_texrender);
		setCur_async_frame(cur_async_frame);
		setAsync_gpu_conversion(async_gpu_conversion);
		setAsync_format(async_format);
		setAsync_full_range(async_full_range);
		setAsync_cache_format(async_cache_format);
		setAsync_cache_full_range(async_cache_full_range);
		setAsync_texture_formats(async_texture_formats);
		setAsync_channel_count(async_channel_count);
		setAsync_flip(async_flip);
		setAsync_active(async_active);
		setAsync_update_texture(async_update_texture);
		setAsync_unbuffered(async_unbuffered);
		setAsync_decoupled(async_decoupled);
		setAsync_preload_frame(async_preload_frame);
		set();
		set();
		setAsync_mutex(async_mutex);
		setAsync_width(async_width);
		setAsync_height(async_height);
		setAsync_cache_width(async_cache_width);
		setAsync_cache_height(async_cache_height);
		setAsync_convert_width(async_convert_width);
		setAsync_convert_height(async_convert_height);
		setDeinterlace_offset(deinterlace_offset);
		setDeinterlace_frame_ts(deinterlace_frame_ts);
		setDeinterlace_effect(deinterlace_effect);
		setPrev_async_frame(prev_async_frame);
		setAsync_prev_textures(async_prev_textures);
		setAsync_prev_texrender(async_prev_texrender);
		setDeinterlace_half_duration(deinterlace_half_duration);
		setDeinterlace_mode(deinterlace_mode);
		setDeinterlace_top_first(deinterlace_top_first);
		setDeinterlace_rendered(deinterlace_rendered);
		setFilter_parent(filter_parent);
		setFilter_target(filter_target);
		set();
		setFilter_mutex(filter_mutex);
		setFilter_texrender(filter_texrender);
		setAllow_direct(allow_direct);
		setRendering_filter(rendering_filter);
		setMute_unmute_key(mute_unmute_key);
		setPush_to_mute_key(push_to_mute_key);
		setPush_to_talk_key(push_to_talk_key);
		setPush_to_mute_enabled(push_to_mute_enabled);
		setPush_to_mute_pressed(push_to_mute_pressed);
		setUser_push_to_mute_pressed(user_push_to_mute_pressed);
		setPush_to_talk_enabled(push_to_talk_enabled);
		setPush_to_talk_pressed(push_to_talk_pressed);
		setUser_push_to_talk_pressed(user_push_to_talk_pressed);
		setPush_to_mute_delay(push_to_mute_delay);
		setPush_to_mute_stop_time(push_to_mute_stop_time);
		setPush_to_talk_delay(push_to_talk_delay);
		setPush_to_talk_stop_time(push_to_talk_stop_time);
		setTransition_start_time(transition_start_time);
		setTransition_duration(transition_duration);
		setTransition_tex_mutex(transition_tex_mutex);
		setTransition_texrender(transition_texrender);
		setTransition_mutex(transition_mutex);
		setTransition_sources(transition_sources);
		setTransitioning_video(transitioning_video);
		setTransitioning_audio(transitioning_audio);
		setTransition_source_active(transition_source_active);
		setTransition_alignment(transition_alignment);
		setTransition_actual_cx(transition_actual_cx);
		setTransition_actual_cy(transition_actual_cy);
		setTransition_cx(transition_cx);
		setTransition_cy(transition_cy);
		setTransition_fixed_duration(transition_fixed_duration);
		setTransition_use_fixed_duration(transition_use_fixed_duration);
		setTransition_mode(transition_mode);
		setTransition_scale_type(transition_scale_type);
		setTransition_matrices(transition_matrices);
		setMonitor(monitor);
		setMonitoring_type(monitoring_type);
		setPrivate_settings(private_settings);
	}
	public obs_source() {
	}
	
	public Object obs_hotkey_register_source(Object name, Object description, Object func, Object data) {
		obs_context_data generatedContext = this.getContext();
		Object generatedPrivate = generatedContext.getPrivate();
		if (!source || generatedPrivate || !ModernizedCProgram.lock()) {
			return (~(obs_hotkey_id)0);
		} 
		obs_weak_source obs_weak_source = new obs_weak_source();
		obs_hotkey_id id = generatedContext.obs_hotkey_register_internal(obs_hotkey_registerer_type.OBS_HOTKEY_REGISTERER_SOURCE, obs_weak_source.obs_source_get_weak_source(source), name, description, func, data);
		ModernizedCProgram.unlock();
		return id;
	}
	public Object obs_hotkey_pair_register_source(Object name0, Object description0, Object name1, Object description1, Object func0, Object func1, Object data0, Object data1) {
		if (!source) {
			return (~(obs_hotkey_pair_id)0);
		} 
		obs_context_data generatedContext = this.getContext();
		return generatedContext.register_hotkey_pair_internal(obs_hotkey_registerer_type.OBS_HOTKEY_REGISTERER_SOURCE, source, weak_source_ref, name0, description0, name1, description1, func0, func1, data0, data1);
	}
	/* -------------------------------------------- */
	public Object enum_sources_proc(Object param) {
		 list = param;
		ModernizedCProgram.PyObject * py_source;
		if (ModernizedCProgram.libobs_to_py_("obs_source_t *", source, false, py_source, NULL, __FUNCTION__, 1051)) {
			source.obs_source_get_ref();
			.Import_PyList_Append(list, py_source);
			.Py_DECREF(py_source);
		} 
		return true;
		 script = param;
		source.obs_source_get_ref();
		ModernizedCProgram.ls_push_libobs_obj_(script, "obs_source_t *", source, false, NULL, __FUNCTION__, 577);
		 idx = .lua_rawlen(script, -2);
		.lua_rawseti(script, -2, (int)idx + 1);
		return true;
	}
	public Object obs_transition_init() {
		Object generatedTransition_mutex = this.getTransition_mutex();
		ModernizedCProgram.pthread_mutex_init_value(generatedTransition_mutex);
		Object generatedTransition_tex_mutex = this.getTransition_tex_mutex();
		ModernizedCProgram.pthread_mutex_init_value(generatedTransition_tex_mutex);
		if (ModernizedCProgram.pthread_mutex_init(generatedTransition_mutex, NULL) != 0) {
			return false;
		} 
		if (ModernizedCProgram.pthread_mutex_init(generatedTransition_tex_mutex, NULL) != 0) {
			return false;
		} 
		this.setTransition_alignment((1 << 0) | (1 << 2));
		Object generatedTransition_texrender = this.getTransition_texrender();
		gs_texture_render gs_texture_render = new gs_texture_render();
		generatedTransition_texrender[0] = gs_texture_render.gs_texrender_create(GS_RGBA, GS_ZS_NONE);
		generatedTransition_texrender[1] = gs_texture_render.gs_texrender_create(GS_RGBA, GS_ZS_NONE);
		Object generatedTransition_source_active = this.getTransition_source_active();
		generatedTransition_source_active[0] = true;
		return generatedTransition_texrender[0] != NULL && generatedTransition_texrender[1] != NULL;
	}
	public void obs_transition_free() {
		Object generatedTransition_mutex = this.getTransition_mutex();
		ModernizedCProgram.pthread_mutex_destroy(generatedTransition_mutex);
		Object generatedTransition_tex_mutex = this.getTransition_tex_mutex();
		ModernizedCProgram.pthread_mutex_destroy(generatedTransition_tex_mutex);
		ModernizedCProgram.obs.getVideo().getGraphics().gs_enter_context();
		Object generatedTransition_texrender = this.getTransition_texrender();
		generatedTransition_texrender[0].gs_texrender_destroy();
		generatedTransition_texrender[1].gs_texrender_destroy();
		ModernizedCProgram.gs_leave_context();
	}
	public void obs_transition_clear() {
		obs_source_t[] s = new obs_source_t();
		[] active = new ();
		if (!ModernizedCProgram.transition_valid(transition, "obs_transition_clear")) {
			return ;
		} 
		Object generatedTransition_mutex = this.getTransition_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedTransition_mutex);
		;
		Object generatedTransition_sources = this.getTransition_sources();
		Object generatedTransition_source_active = this.getTransition_source_active();
		for ( i = 0;
		 i < 2; i++) {
			s[i] = generatedTransition_sources[i];
			active[i] = generatedTransition_source_active[i];
			generatedTransition_sources[i] = NULL;
			generatedTransition_source_active[i] = false;
		}
		this.setTransitioning_video(false);
		this.setTransitioning_audio(false);
		ModernizedCProgram.pthread_mutex_unlock(generatedTransition_mutex);
		;
		for ( i = 0;
		 i < 2; i++) {
			if (s[i] && active[i]) {
				transition.obs_source_remove_active_child(s[i]);
			} 
			s[i].obs_source_release();
		}
	}
	public Object get_cx() {
		Object generatedTransition_cx = this.getTransition_cx();
		Object generatedTransition_actual_cx = this.getTransition_actual_cx();
		return generatedTransition_cx ? generatedTransition_cx : generatedTransition_actual_cx;
	}
	public Object get_cy() {
		Object generatedTransition_cy = this.getTransition_cy();
		Object generatedTransition_actual_cy = this.getTransition_actual_cy();
		return generatedTransition_cy ? generatedTransition_cy : generatedTransition_actual_cy;
	}
	public void recalculate_transition_matrix(Object idx) {
		obs_source_t child = new obs_source_t();
		matrix4 mat = new matrix4();
		vec2 pos = new vec2();
		vec2 scale = new vec2();
		double tr_cx = (double)tr.get_cx();
		double tr_cy = (double)tr.get_cy();
		double source_cx;
		double source_cy;
		double tr_aspect = tr_cx / tr_cy;
		double source_aspect;
		obs_transition_scale_type generatedTransition_scale_type = this.getTransition_scale_type();
		obs_transition_scale_type scale_type = generatedTransition_scale_type;
		Object generatedTransition_mutex = this.getTransition_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedTransition_mutex);
		;
		Object generatedTransition_sources = this.getTransition_sources();
		child = generatedTransition_sources[idx];
		if (!child) {
			ModernizedCProgram.pthread_mutex_unlock(generatedTransition_mutex);
			;
			return ;
		} 
		source_cx = (double)child.obs_source_get_width();
		source_cy = (double)child.obs_source_get_height();
		ModernizedCProgram.pthread_mutex_unlock(generatedTransition_mutex);
		;
		if (source_cx == 0.0 || source_cy == 0.0) {
			return ;
		} 
		source_aspect = source_cx / source_cy;
		if (obs_transition_scale_type.scale_type == obs_transition_scale_type.OBS_TRANSITION_SCALE_MAX_ONLY) {
			if (source_cx > tr_cx || source_cy > tr_cy) {
				obs_transition_scale_type.scale_type = obs_transition_scale_type.OBS_TRANSITION_SCALE_ASPECT;
			} else {
					scale.setVec2(1.0);
					scale.setVec2(1.0);
			} 
		} 
		if (obs_transition_scale_type.scale_type == obs_transition_scale_type.OBS_TRANSITION_SCALE_ASPECT) {
			 use_width = tr_aspect < source_aspect;
			scale.setVec2(scale.setVec2(use_width ? tr_cx / source_cx : tr_cy / source_cy));
		}  else if (obs_transition_scale_type.scale_type == obs_transition_scale_type.OBS_TRANSITION_SCALE_STRETCH) {
			scale.setVec2(tr_cx / source_cx);
			scale.setVec2(tr_cy / source_cy);
		} 
		Object generatedVec2 = scale.getVec2();
		source_cx *= generatedVec2;
		source_cy *= generatedVec2;
		pos.vec2_zero();
		Object generatedTransition_alignment = this.getTransition_alignment();
		pos.add_alignment(generatedTransition_alignment, (int)(tr_cx - source_cx), (int)(tr_cy - source_cy));
		mat.matrix4_identity();
		mat.matrix4_scale3f(mat, generatedVec2, generatedVec2, 1.0);
		mat.matrix4_translate3f(mat, generatedVec2, generatedVec2, 0.0);
		Object generatedTransition_matrices = this.getTransition_matrices();
		generatedTransition_matrices[idx].matrix4_copy(mat);
	}
	public void recalculate_transition_matrices() {
		transition.recalculate_transition_matrix(0);
		transition.recalculate_transition_matrix(1);
	}
	public void recalculate_transition_size() {
		 cx = 0;
		 cy = 0;
		obs_source_t child = new obs_source_t();
		Object generatedTransition_mutex = this.getTransition_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedTransition_mutex);
		;
		Object generatedTransition_sources = this.getTransition_sources();
		for ( i = 0;
		 i < 2; i++) {
			child = generatedTransition_sources[i];
			if (child) {
				 new_cx = child.obs_source_get_width();
				 new_cy = child.obs_source_get_height();
				if (new_cx > cx) {
					cx = new_cx;
				} 
				if (new_cy > cy) {
					cy = new_cy;
				} 
			} 
		}
		ModernizedCProgram.pthread_mutex_unlock(generatedTransition_mutex);
		;
		this.setTransition_actual_cx(cx);
		this.setTransition_actual_cy(cy);
	}
	public void obs_transition_tick() {
		transition.recalculate_transition_size();
		transition.recalculate_transition_matrices();
		Object generatedTransition_tex_mutex = this.getTransition_tex_mutex();
		Object generatedTransition_texrender = this.getTransition_texrender();
		if (ModernizedCProgram.pthread_mutex_trylock(generatedTransition_tex_mutex) == 0) {
			generatedTransition_texrender[0].gs_texrender_reset();
			generatedTransition_texrender[1].gs_texrender_reset();
			ModernizedCProgram.pthread_mutex_unlock(generatedTransition_tex_mutex);
		} 
	}
	public void set_source(obs_transition_target target, obs_source new_child, Object callback) {
		 idx = ()obs_transition_target.target;
		obs_source_t old_child = new obs_source_t();
		 add_success = true;
		 already_active = new ();
		if (new_child) {
			new_child.obs_source_addref();
		} 
		Object generatedTransition_mutex = this.getTransition_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedTransition_mutex);
		;
		Object generatedTransition_sources = this.getTransition_sources();
		old_child = generatedTransition_sources[idx];
		if (new_child == old_child) {
			ModernizedCProgram.pthread_mutex_unlock(generatedTransition_mutex);
			;
			new_child.obs_source_release();
			return ;
		} 
		Object generatedTransition_source_active = this.getTransition_source_active();
		already_active = generatedTransition_source_active[idx];
		if (already_active) {
			if (new_child) {
				add_success = transition.obs_source_add_active_child(new_child);
			} 
			if (old_child && add_success) {
				transition.obs_source_remove_active_child(old_child);
			} 
		} 
		if (callback && add_success) {
			add_success = .callback(transition, idx, new_child);
		} 
		generatedTransition_sources[idx] = add_success ? new_child : NULL;
		ModernizedCProgram.pthread_mutex_unlock(generatedTransition_mutex);
		;
		Object generatedTransition_cx = this.getTransition_cx();
		Object generatedTransition_cy = this.getTransition_cy();
		if (add_success) {
			if (generatedTransition_cx == 0 || generatedTransition_cy == 0) {
				transition.recalculate_transition_size();
				transition.recalculate_transition_matrices();
			} 
		} else {
				new_child.obs_source_release();
		} 
		old_child.obs_source_release();
	}
	public obs_source obs_transition_get_source(obs_transition_target target) {
		 idx = ()obs_transition_target.target;
		obs_source_t ret = new obs_source_t();
		if (!ModernizedCProgram.transition_valid(transition, "obs_transition_get_source")) {
			return NULL;
		} 
		Object generatedTransition_mutex = this.getTransition_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedTransition_mutex);
		;
		Object generatedTransition_sources = this.getTransition_sources();
		ret = generatedTransition_sources[idx];
		ret.obs_source_addref();
		ModernizedCProgram.pthread_mutex_unlock(generatedTransition_mutex);
		;
		return ret;
	}
	public obs_source obs_transition_get_active_source() {
		obs_source_t ret = new obs_source_t();
		if (!ModernizedCProgram.transition_valid(transition, "obs_transition_get_source")) {
			return NULL;
		} 
		Object generatedTransition_mutex = this.getTransition_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedTransition_mutex);
		;
		Object generatedTransitioning_audio = this.getTransitioning_audio();
		Object generatedTransitioning_video = this.getTransitioning_video();
		Object generatedTransition_sources = this.getTransition_sources();
		if (generatedTransitioning_audio || generatedTransitioning_video) {
			ret = generatedTransition_sources[1];
		} else {
				ret = generatedTransition_sources[0];
		} 
		ret.obs_source_addref();
		ModernizedCProgram.pthread_mutex_unlock(generatedTransition_mutex);
		;
		return ret;
	}
	public Object activate_child(Object idx) {
		 success = true;
		Object generatedTransition_mutex = this.getTransition_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedTransition_mutex);
		;
		Object generatedTransition_sources = this.getTransition_sources();
		Object generatedTransition_source_active = this.getTransition_source_active();
		if (generatedTransition_sources[idx] && !generatedTransition_source_active[idx]) {
			success = transition.obs_source_add_active_child(generatedTransition_sources[idx]);
			if (success) {
				generatedTransition_source_active[idx] = true;
			} 
		} 
		ModernizedCProgram.pthread_mutex_unlock(generatedTransition_mutex);
		;
		return success;
	}
	public Object activate_transition(Object idx, obs_source child) {
		Object generatedTransition_source_active = this.getTransition_source_active();
		if (!generatedTransition_source_active[idx]) {
			if (!transition.obs_source_add_active_child(child)) {
				return false;
			} 
			generatedTransition_source_active[idx] = true;
		} 
		this.setTransitioning_video(true);
		this.setTransitioning_audio(true);
		return true;
	}
	public Object transition_active() {
		Object generatedTransitioning_audio = this.getTransitioning_audio();
		Object generatedTransitioning_video = this.getTransitioning_video();
		return generatedTransitioning_audio || generatedTransitioning_video;
	}
	public Object obs_transition_start(obs_transition_mode mode, Object duration_ms, obs_source dest) {
		 active = new ();
		 same_as_source = new ();
		 same_as_dest = new ();
		if (!ModernizedCProgram.transition_valid(transition, "obs_transition_start")) {
			return false;
		} 
		Object generatedTransition_mutex = this.getTransition_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedTransition_mutex);
		;
		Object generatedTransition_sources = this.getTransition_sources();
		same_as_source = dest == generatedTransition_sources[0];
		same_as_dest = dest == generatedTransition_sources[1];
		active = transition.transition_active();
		ModernizedCProgram.pthread_mutex_unlock(generatedTransition_mutex);
		;
		if (same_as_source && !active) {
			return false;
		} 
		obs_source_info generatedInfo = this.getInfo();
		Object generatedTransition_start = generatedInfo.getTransition_start();
		obs_context_data generatedContext = this.getContext();
		Object generatedData = generatedContext.getData();
		if (generatedTransition_start) {
			.UNRECOGNIZEDFUNCTIONNAME(generatedData);
		} 
		Object generatedTransition_use_fixed_duration = this.getTransition_use_fixed_duration();
		Object generatedTransition_fixed_duration = this.getTransition_fixed_duration();
		if (generatedTransition_use_fixed_duration) {
			duration_ms = generatedTransition_fixed_duration;
		} 
		if (!active || (!same_as_dest && !same_as_source)) {
			this.setTransition_start_time(ModernizedCProgram.os_gettime_ns());
			this.setTransition_duration(()duration_ms * -1024);
		} 
		transition.set_source(obs_transition_target.OBS_TRANSITION_SOURCE_B, dest, activate_transition);
		if (dest == NULL && same_as_dest && !same_as_source) {
			this.setTransitioning_video(true);
			this.setTransitioning_audio(true);
		} 
		transition.obs_source_dosignal("source_transition_start", "transition_start");
		transition.recalculate_transition_size();
		transition.recalculate_transition_matrices();
		.UNUSED_PARAMETER(/* TODO: Add mode */obs_transition_mode.mode);
		return true;
	}
	public void obs_transition_set(obs_source source) {
		obs_source_t[] s = new obs_source_t();
		[] active = new ();
		if (!ModernizedCProgram.transition_valid(transition, "obs_transition_clear")) {
			return ;
		} 
		source.obs_source_addref();
		Object generatedTransition_mutex = this.getTransition_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedTransition_mutex);
		;
		Object generatedTransition_sources = this.getTransition_sources();
		Object generatedTransition_source_active = this.getTransition_source_active();
		for ( i = 0;
		 i < 2; i++) {
			s[i] = generatedTransition_sources[i];
			active[i] = generatedTransition_source_active[i];
			generatedTransition_sources[i] = NULL;
			generatedTransition_source_active[i] = false;
		}
		generatedTransition_source_active[0] = true;
		generatedTransition_sources[0] = source;
		this.setTransitioning_video(false);
		this.setTransitioning_audio(false);
		ModernizedCProgram.pthread_mutex_unlock(generatedTransition_mutex);
		;
		for ( i = 0;
		 i < 2; i++) {
			if (s[i] && active[i]) {
				transition.obs_source_remove_active_child(s[i]);
			} 
			s[i].obs_source_release();
		}
		if (source) {
			transition.obs_source_add_active_child(source);
		} 
	}
	public double calc_time(Object ts) {
		 end = new ();
		Object generatedTransition_start_time = this.getTransition_start_time();
		if (ts <= generatedTransition_start_time) {
			return 0.0;
		} 
		Object generatedTransition_duration = this.getTransition_duration();
		end = generatedTransition_duration;
		ts -= generatedTransition_start_time;
		if (ts >= end || end == 0) {
			return 1.0;
		} 
		return (double)((double)ts / (double)end);
	}
	public double get_video_time() {
		 ts = ModernizedCProgram.obs.getVideo().getVideo_time();
		return transition.calc_time(ts);
	}
	public double obs_transition_get_time() {
		return transition.get_video_time();
	}
	public Object get_texture(obs_transition_target target) {
		 idx = ()obs_transition_target.target;
		Object generatedTransition_texrender = this.getTransition_texrender();
		gs_texture gs_texture = new gs_texture();
		return gs_texture.gs_texrender_get_texture(generatedTransition_texrender[idx]);
	}
	public void obs_transition_set_scale_type(obs_transition_scale_type type) {
		if (!ModernizedCProgram.transition_valid(transition, "obs_transition_set_scale_type")) {
			return ;
		} 
		this.setTransition_scale_type(obs_transition_scale_type.type);
	}
	public void obs_transition_set_alignment(Object alignment) {
		if (!ModernizedCProgram.transition_valid(transition, "obs_transition_set_alignment")) {
			return ;
		} 
		this.setTransition_alignment(alignment);
	}
	public void obs_transition_set_size(Object cx, Object cy) {
		if (!ModernizedCProgram.transition_valid(transition, "obs_transition_set_size")) {
			return ;
		} 
		this.setTransition_cx(cx);
		this.setTransition_cy(cy);
	}
	public void enum_child(obs_source child, Object enum_callback, Object param) {
		if (!child) {
			return ;
		} 
		obs_context_data generatedContext = child.getContext();
		Object generatedData = generatedContext.getData();
		obs_source_info generatedInfo = child.getInfo();
		Object generatedEnum_active_sources = generatedInfo.getEnum_active_sources();
		if (generatedData && generatedEnum_active_sources) {
			.UNRECOGNIZEDFUNCTIONNAME(generatedData, enum_callback, param);
		} 
		.enum_callback(tr, child, param);
	}
	public void obs_transition_enum_sources(Object cb, Object param) {
		Object generatedTransition_mutex = this.getTransition_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedTransition_mutex);
		;
		Object generatedTransition_sources = this.getTransition_sources();
		for ( i = 0;
		 i < 2; i++) {
			if (generatedTransition_sources[i]) {
				.cb(transition, generatedTransition_sources[i], param);
			} 
		}
		ModernizedCProgram.pthread_mutex_unlock(generatedTransition_mutex);
		;
	}
	public void render_child(obs_source child, Object idx) {
		 cx = transition.get_cx();
		 cy = transition.get_cy();
		vec4 blank = new vec4();
		if (!child) {
			return ;
		} 
		Object generatedTransition_texrender = this.getTransition_texrender();
		Object generatedTransition_matrices = this.getTransition_matrices();
		if (generatedTransition_texrender[idx].gs_texrender_begin(cx, cy)) {
			blank.vec4_zero();
			ModernizedCProgram.gs_clear(GS_CLEAR_COLOR, blank, 0.0, 0);
			ModernizedCProgram.gs_ortho(0.0, (double)cx, 0.0, (double)cy, -100.0, 100.0);
			ModernizedCProgram.gs_matrix_push();
			ModernizedCProgram.gs_matrix_mul(generatedTransition_matrices[idx]);
			child.obs_source_video_render();
			ModernizedCProgram.gs_matrix_pop();
			generatedTransition_texrender[idx].gs_texrender_end();
		} 
	}
	public void obs_transition_stop() {
		Object generatedTransition_sources = this.getTransition_sources();
		obs_source_t old_child = generatedTransition_sources[0];
		Object generatedTransition_source_active = this.getTransition_source_active();
		if (old_child && generatedTransition_source_active[0]) {
			transition.obs_source_remove_active_child(old_child);
		} 
		old_child.obs_source_release();
		generatedTransition_source_active[0] = true;
		generatedTransition_source_active[1] = false;
		generatedTransition_sources[0] = generatedTransition_sources[1];
		generatedTransition_sources[1] = NULL;
	}
	public void handle_stop() {
		obs_source_info generatedInfo = this.getInfo();
		Object generatedTransition_stop = generatedInfo.getTransition_stop();
		obs_context_data generatedContext = this.getContext();
		Object generatedData = generatedContext.getData();
		if (generatedTransition_stop) {
			.UNRECOGNIZEDFUNCTIONNAME(generatedData);
		} 
		transition.obs_source_dosignal("source_transition_stop", "transition_stop");
	}
	public void obs_transition_force_stop() {
		transition.handle_stop();
	}
	public void obs_transition_video_render(Object callback) {
		transition_state state = new transition_state();
		matrix4[] matrices = new matrix4();
		 locked = false;
		 stopped = false;
		 video_stopped = false;
		double t;
		if (!ModernizedCProgram.transition_valid(transition, "obs_transition_video_render")) {
			return ;
		} 
		t = transition.get_video_time();
		Object generatedTransition_mutex = this.getTransition_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedTransition_mutex);
		;
		Object generatedTransitioning_video = this.getTransitioning_video();
		Object generatedTransitioning_audio = this.getTransitioning_audio();
		if (t >= 1.0 && generatedTransitioning_video) {
			this.setTransitioning_video(false);
			video_stopped = true;
			if (!generatedTransitioning_audio) {
				transition.obs_transition_stop();
				stopped = true;
			} 
		} 
		ModernizedCProgram.copy_transition_state(transition, state);
		Object generatedTransition_matrices = this.getTransition_matrices();
		matrices[0] = generatedTransition_matrices[0];
		matrices[1] = generatedTransition_matrices[1];
		ModernizedCProgram.pthread_mutex_unlock(generatedTransition_mutex);
		;
		Object generatedTransition_tex_mutex = this.getTransition_tex_mutex();
		if (generatedTransitioning_video) {
			locked = ModernizedCProgram.pthread_mutex_trylock(generatedTransition_tex_mutex) == 0;
		} 
		Object generatedS = state.getS();
		obs_context_data generatedContext = this.getContext();
		Object generatedData = generatedContext.getData();
		if (generatedTransitioning_video && locked && callback) {
			[] tex = new ();
			 cx = new ();
			 cy = new ();
			for ( i = 0;
			 i < 2; i++) {
				if (generatedS[i]) {
					transition.render_child(generatedS[i], i);
					tex[i] = transition.get_texture(i);
					if (!tex[i]) {
						tex[i] = ModernizedCProgram.obs.getVideo().getTransparent_texture();
					} 
				} else {
						tex[i] = ModernizedCProgram.obs.getVideo().getTransparent_texture();
				} 
			}
			cx = transition.get_cx();
			cy = transition.get_cy();
			if (cx && cy) {
				ModernizedCProgram.gs_blend_state_push();
				ModernizedCProgram.gs_blend_function(GS_BLEND_ONE, GS_BLEND_INVSRCALPHA);
				.callback(generatedData, tex[0], tex[1], t, cx, cy);
				ModernizedCProgram.gs_blend_state_pop();
			} 
		}  else if (generatedTransitioning_audio) {
			if (generatedS[1]) {
				ModernizedCProgram.gs_matrix_push();
				ModernizedCProgram.gs_matrix_mul(matrices[1]);
				generatedS[1].obs_source_video_render();
				ModernizedCProgram.gs_matrix_pop();
			} 
		} else {
				if (generatedS[0]) {
					ModernizedCProgram.gs_matrix_push();
					ModernizedCProgram.gs_matrix_mul(matrices[0]);
					generatedS[0].obs_source_video_render();
					ModernizedCProgram.gs_matrix_pop();
				} 
		} 
		if (locked) {
			ModernizedCProgram.pthread_mutex_unlock(generatedTransition_tex_mutex);
		} 
		generatedS[0].obs_source_release();
		generatedS[1].obs_source_release();
		if (video_stopped) {
			transition.obs_source_dosignal("source_transition_video_stop", "transition_video_stop");
		} 
		if (stopped) {
			transition.handle_stop();
		} 
	}
	public Object obs_transition_video_render_direct(obs_transition_target target) {
		transition_state state = new transition_state();
		matrix4[] matrices = new matrix4();
		 stopped = false;
		 video_stopped = false;
		 render_b = obs_transition_target.target == obs_transition_target.OBS_TRANSITION_SOURCE_B;
		 transitioning = new ();
		double t;
		if (!ModernizedCProgram.transition_valid(transition, "obs_transition_video_render")) {
			return false;
		} 
		t = transition.get_video_time();
		Object generatedTransition_mutex = this.getTransition_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedTransition_mutex);
		;
		Object generatedTransitioning_video = this.getTransitioning_video();
		Object generatedTransitioning_audio = this.getTransitioning_audio();
		if (t >= 1.0 && generatedTransitioning_video) {
			this.setTransitioning_video(false);
			video_stopped = true;
			if (!generatedTransitioning_audio) {
				transition.obs_transition_stop();
				stopped = true;
			} 
		} 
		ModernizedCProgram.copy_transition_state(transition, state);
		transitioning = generatedTransitioning_audio || generatedTransitioning_video;
		Object generatedTransition_matrices = this.getTransition_matrices();
		matrices[0] = generatedTransition_matrices[0];
		matrices[1] = generatedTransition_matrices[1];
		ModernizedCProgram.pthread_mutex_unlock(generatedTransition_mutex);
		;
		int idx = (transitioning && render_b) ? 1 : 0;
		Object generatedS = state.getS();
		if (generatedS[idx]) {
			ModernizedCProgram.gs_matrix_push();
			ModernizedCProgram.gs_matrix_mul(matrices[idx]);
			generatedS[idx].obs_source_video_render();
			ModernizedCProgram.gs_matrix_pop();
		} 
		generatedS[0].obs_source_release();
		generatedS[1].obs_source_release();
		if (video_stopped) {
			transition.obs_source_dosignal("source_transition_video_stop", "transition_video_stop");
		} 
		if (stopped) {
			transition.handle_stop();
		} 
		return transitioning;
	}
	public double get_sample_time(Object sample_rate, Object sample, Object ts) {
		 sample_ts_offset = ()sample * -1024 / ()sample_rate;
		 i_ts = ts + sample_ts_offset;
		return transition.calc_time(i_ts);
		return ModernizedCProgram.os_gettime_ns() - ModernizedCProgram.samples_to_ns(frames, ModernizedCProgram.rate/**
		 * Callback for pulse which gets executed when new audio data is available
		 *
		 * @warning The function may be called even after disconnecting the stream
		 */);
	}
	public void mix_child(Double out, Double in, Object count, Object sample_rate, Object ts, Object mix) {
		obs_context_data generatedContext = this.getContext();
		Object generatedData = generatedContext.getData();
		Object context_data = generatedData;
		for ( i = 0;
		 i < count; i++) {
			double t = transition.get_sample_time(sample_rate, i, ts);
			out[i] += in[i] * .mix(context_data, t);
		}
	}
	public Object calc_min_ts() {
		 min_ts = 0;
		for ( i = 0;
		 i < 2; i++) {
			if (sources[i] && !sources[i].getAudio_pending()) {
				if (!min_ts || sources[i].getAudio_ts() < min_ts) {
					min_ts = sources[i].getAudio_ts();
				} 
			} 
		}
		return min_ts;
		byte buffering_name = ModernizedCProgram.data.find_min_ts(min_ts);
		if (ModernizedCProgram.data.mark_invalid_sources(sample_rate, min_ts)) {
			buffering_name = ModernizedCProgram.data.find_min_ts(min_ts);
		} 
		return buffering_name;
	}
	public Object stop_audio() {
		this.setTransitioning_audio(false);
		Object generatedTransitioning_video = this.getTransitioning_video();
		if (!generatedTransitioning_video) {
			transition.obs_transition_stop();
			return true;
		} 
		return false;
	}
	public void obs_transition_enable_fixed(Object enable, Object duration) {
		if (!ModernizedCProgram.transition_valid(transition, "obs_transition_enable_fixed")) {
			return ;
		} 
		this.setTransition_use_fixed_duration(enable);
		this.setTransition_fixed_duration(duration);
	}
	public Object obs_transition_fixed() {
		Object generatedTransition_use_fixed_duration = this.getTransition_use_fixed_duration();
		return ModernizedCProgram.transition_valid(transition, "obs_transition_fixed") ? generatedTransition_use_fixed_duration : false;
	}
	public obs_source copy_source_state(obs_source tr_source, Object idx) {
		Object generatedTransition_sources = this.getTransition_sources();
		obs_source_t old_child = generatedTransition_sources[idx];
		obs_source_t new_child = generatedTransition_sources[idx];
		Object generatedTransition_source_active = tr_source.getTransition_source_active();
		 active = generatedTransition_source_active[idx];
		if (old_child && generatedTransition_source_active[idx]) {
			tr_dest.obs_source_remove_active_child(old_child);
		} 
		generatedTransition_sources[idx] = new_child;
		generatedTransition_source_active[idx] = active;
		if (active && new_child) {
			tr_dest.obs_source_add_active_child(new_child);
		} 
		new_child.obs_source_addref();
		return old_child;
	}
	public void obs_transition_swap_begin(obs_source tr_source) {
		obs_source_t[] old_children = new obs_source_t();
		if (tr_dest == tr_source) {
			return ;
		} 
		Object generatedTransition_tex_mutex = tr_source.getTransition_tex_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedTransition_tex_mutex);
		ModernizedCProgram.pthread_mutex_lock(generatedTransition_tex_mutex);
		Object generatedTransition_mutex = tr_source.getTransition_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedTransition_mutex);
		;
		ModernizedCProgram.pthread_mutex_lock(generatedTransition_mutex);
		;
		for ( i = 0;
		 i < 2; i++) {
			old_children[i] = tr_dest.copy_source_state(tr_source, i);
		}
		ModernizedCProgram.pthread_mutex_unlock(generatedTransition_mutex);
		;
		ModernizedCProgram.pthread_mutex_unlock(generatedTransition_mutex);
		;
		for ( i = 0;
		 i < 2; i++) {
			old_children[i].obs_source_release();
		}
	}
	public void obs_transition_swap_end(obs_source tr_source) {
		if (tr_dest == tr_source) {
			return ;
		} 
		tr_source.obs_transition_clear();
		Object generatedTransition_texrender = this.getTransition_texrender();
		for ( i = 0;
		 i < 2; i++) {
			 dest = generatedTransition_texrender[i];
			 source = generatedTransition_texrender[i];
			generatedTransition_texrender[i] = source;
			generatedTransition_texrender[i] = dest;
		}
		Object generatedTransition_tex_mutex = this.getTransition_tex_mutex();
		ModernizedCProgram.pthread_mutex_unlock(generatedTransition_tex_mutex);
		ModernizedCProgram.pthread_mutex_unlock(generatedTransition_tex_mutex);
	}
	public void push_audio_tree(obs_source source, Object p) {
		obs_core_audio audio = p;
		Object generatedRender_order = audio.getRender_order();
		if (.da_find(generatedRender_order, source, 0) == DARRAY_INVALID) {
			obs_source_t s = source.obs_source_get_ref();
			if (ModernizedCProgram.s) {
				.da_push_back(generatedRender_order, ModernizedCProgram.s);
			} 
		} 
		.UNUSED_PARAMETER(parent);
	}
	public void ignore_audio(Object channels, Object sample_rate) {
		Object generatedAudio_input_buf = this.getAudio_input_buf();
		 num_floats = generatedAudio_input_buf[0].getCirclebuf() / ;
		Object generatedAudio_ts = this.getAudio_ts();
		if (num_floats) {
			for ( ch = 0;
			 ch < channels; ch++) {
				generatedAudio_input_buf[ch].circlebuf_pop_front(NULL, generatedAudio_input_buf[ch].getCirclebuf());
			}
			this.setLast_audio_input_buf_size(0);
			generatedAudio_ts += (uint64_t)num_floats * -1024 / (uint64_t)sample_rate;
		} 
	}
	public Object discard_if_stopped(Object channels) {
		 last_size = new ();
		 size = new ();
		Object generatedLast_audio_input_buf_size = this.getLast_audio_input_buf_size();
		last_size = generatedLast_audio_input_buf_size;
		Object generatedAudio_input_buf = this.getAudio_input_buf();
		size = generatedAudio_input_buf[0].getCirclebuf();
		if (!size) {
			return false;
		} 
		Object generatedPending_stop = this.getPending_stop();
		if (last_size == /* if perpetually pending data, it means the audio has stopped,
			 * so clear the audio data */size) {
			if (!generatedPending_stop) {
				this.setPending_stop(true);
				return true;
			} 
			for ( ch = 0;
			 ch < channels; ch++) {
				generatedAudio_input_buf[ch].circlebuf_pop_front(NULL, generatedAudio_input_buf[ch].getCirclebuf());
			}
			this.setPending_stop(false);
			this.setAudio_ts(0);
			this.setLast_audio_input_buf_size(0);
			return true;
		} else {
				this.setLast_audio_input_buf_size(size);
				return false;
		} 
	}
	public Object audio_buffer_insuffient(Object sample_rate, Object min_ts) {
		 total_floats = AUDIO_OUTPUT_FRAMES;
		 size = new ();
		obs_source_info generatedInfo = this.getInfo();
		Object generatedAudio_render = generatedInfo.getAudio_render();
		Object generatedAudio_pending = this.getAudio_pending();
		Object generatedAudio_ts = this.getAudio_ts();
		if (generatedAudio_render || generatedAudio_pending || !generatedAudio_ts) {
			return false;
		} 
		if (generatedAudio_ts != min_ts && generatedAudio_ts != (min_ts - 1)) {
			 start_point = ModernizedCProgram.convert_time_to_frames(sample_rate, generatedAudio_ts - min_ts);
			if (start_point >= AUDIO_OUTPUT_FRAMES) {
				return false;
			} 
			total_floats -= start_point;
		} 
		size = total_floats * ;
		Object generatedAudio_input_buf = this.getAudio_input_buf();
		if (generatedAudio_input_buf[0].getCirclebuf() < size) {
			this.setAudio_pending(true);
			return true;
		} 
		return false;
	}
	/* -------------------------------------------------------- */
	public obs_source get_sidechain(compressor_data cd) {
		obs_weak_source generatedWeak_sidechain = cd.getWeak_sidechain();
		obs_source obs_source = new obs_source();
		if (generatedWeak_sidechain) {
			return obs_source.obs_weak_source_get_source(generatedWeak_sidechain);
		} 
		return NULL;
	}
	public void sidechain_capture(Object param, Object audio_data, Object muted) {
		compressor_data cd = param;
		.UNUSED_PARAMETER(source);
		Object generatedSidechain_mutex = cd.getSidechain_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedSidechain_mutex);
		Object generatedMax_sidechain_frames = cd.getMax_sidechain_frames();
		if (generatedMax_sidechain_frames < audio_data.getFrames()) {
			cd.setMax_sidechain_frames(audio_data.getFrames());
		} 
		 expected_size = generatedMax_sidechain_frames * ;
		if (!expected_size) {
			;
		} 
		Object generatedSidechain_data = cd.getSidechain_data();
		Object generatedNum_channels = cd.getNum_channels();
		if (generatedSidechain_data[0].getCirclebuf() > expected_size * 2) {
			for ( i = 0;
			 i < generatedNum_channels; i++) {
				generatedSidechain_data[i].circlebuf_pop_front(NULL, expected_size);
			}
		} 
		if (muted) {
			for ( i = 0;
			 i < generatedNum_channels; i++) {
				generatedSidechain_data[i].circlebuf_push_back_zero(audio_data.getFrames() * );
			}
		} else {
				for ( i = 0;
				 i < generatedNum_channels; i++) {
					generatedSidechain_data[i].circlebuf_push_back(audio_data.getData()[i], audio_data.getFrames() * );
				}
		} 
	}
	public Object add_sources(Object data) {
		sidechain_prop_info info = data;
		uint32_t caps = ModernizedCProgram.obs_source_get_output_flags(source);
		obs_source generatedParent = info.getParent();
		if (source == generatedParent) {
			return true;
		} 
		if ((caps & (1 << 1)) == 0) {
			return true;
		} 
		byte name = ModernizedCProgram.obs_source_get_name(source);
		obs_property generatedSources = info.getSources();
		generatedSources.obs_property_list_add_string(name, name);
		return true;
	}
	public void obs_source_dosignal(Object signal_obs, Object signal_source) {
		calldata data = new calldata();
		[] stack = new ();
		data.calldata_init_fixed(stack, );
		data.calldata_set_ptr("source", source);
		obs_context_data generatedContext = this.getContext();
		Object generatedPrivate = generatedContext.getPrivate();
		if (signal_obs && !generatedPrivate) {
			.signal_handler_signal(ModernizedCProgram.obs.getSignals(), signal_obs, data);
		} 
		Object generatedSignals = generatedContext.getSignals();
		if (signal_source) {
			.signal_handler_signal(generatedSignals, signal_source, data/* maximum timestamp variance in nanoseconds */);
		} 
	}
	public void on_audio_playback(Object param, Object audio_data, Object muted) {
		audio_monitor monitor = param;
		Object generatedRender = monitor.getRender();
		 render = generatedRender;
		[] resample_data = new ();
		double generatedUser_volume = this.getUser_volume();
		double vol = generatedUser_volume;
		 resample_frames = new ();
		 ts_offset = new ();
		 success = new ();
		BYTE output = new BYTE();
		Object generatedPlayback_mutex = monitor.getPlayback_mutex();
		if (ModernizedCProgram.pthread_mutex_trylock(generatedPlayback_mutex) != 0) {
			return ;
		} 
		Object generatedActivate_refs = this.getActivate_refs();
		if (ModernizedCProgram.os_atomic_load_long(generatedActivate_refs) == 0) {
			;
		} 
		Object generatedResampler = monitor.getResampler();
		success = generatedResampler.audio_resampler_resample(resample_data, resample_frames, ts_offset, ()audio_data.getData(), ()audio_data.getFrames());
		if (!success) {
			;
		} 
		UINT32 pad = 0;
		Object generatedClient = monitor.getClient();
		.UNRECOGNIZEDFUNCTIONNAME(generatedClient, pad);
		Object generatedAsync_unbuffered = this.getAsync_unbuffered();
		Object generatedAsync_decoupled = this.getAsync_decoupled();
		 decouple_audio = generatedAsync_unbuffered && generatedAsync_decoupled;
		Object generatedSource_has_video = monitor.getSource_has_video();
		if (generatedSource_has_video && !decouple_audio) {
			 ts = audio_data.getTimestamp() - ts_offset;
			if (!monitor.process_audio_delay((double)(resample_data[0]), resample_frames, ts, pad)) {
				;
			} 
		} 
		HRESULT hr = .UNRECOGNIZEDFUNCTIONNAME(render, resample_frames, output);
		if (((HRESULT)(hr) < 0)) {
			;
		} 
		Object generatedChannels = monitor.getChannels();
		if (!muted) {
			if (!ModernizedCProgram.close_float(vol, 1.0, /* apply volume */EPSILON)) {
				double cur = (double)resample_data[0];
				double end = cur + resample_frames * generatedChannels;
				while (cur < end) {
					(cur++) *= vol;
				}
			} 
			.memcpy(output, resample_data[0], resample_frames * generatedChannels * );
		} 
		.UNRECOGNIZEDFUNCTIONNAME(render, resample_frames, muted ? AUDCLNT_BUFFERFLAGS_SILENT : 0);
		audio_monitor monitor = param;
		double generatedUser_volume = this.getUser_volume();
		double vol = generatedUser_volume;
		 bytes = new ();
		.UNUSED_PARAMETER(source);
		Object generatedActive = monitor.getActive();
		if (!ModernizedCProgram.os_atomic_load_bool(generatedActive)) {
			return ;
		} 
		[] resample_data = new ();
		 resample_frames = new ();
		 ts_offset = new ();
		 success = new ();
		Object generatedResampler = monitor.getResampler();
		success = generatedResampler.audio_resampler_resample(resample_data, resample_frames, ts_offset, ()audio_data.getData(), ()audio_data.getFrames());
		if (!success) {
			return ;
		} 
		Object generatedChannels = monitor.getChannels();
		bytes =  * generatedChannels * resample_frames;
		if (muted) {
			.memset(resample_data[0], 0, bytes);
		} else {
				if (!ModernizedCProgram.close_float(vol, 1.0, /* apply volume */EPSILON)) {
					double cur = (double)resample_data[0];
					double end = cur + resample_frames * generatedChannels;
					while (cur < end) {
						(cur++) *= vol;
					}
				} 
		} 
		Object generatedMutex = monitor.getMutex();
		ModernizedCProgram.pthread_mutex_lock(generatedMutex);
		Object generatedNew_data = monitor.getNew_data();
		generatedNew_data.circlebuf_push_back(resample_data[0], bytes);
		Object generatedWait_size = monitor.getWait_size();
		Object generatedEmpty_buffers = monitor.getEmpty_buffers();
		Object generatedPaused = monitor.getPaused();
		Object generatedQueue = monitor.getQueue();
		if (generatedNew_data.getCirclebuf() >= generatedWait_size) {
			monitor.setWait_size(0);
			while (generatedEmpty_buffers.getCirclebuf() > 0) {
				if (!monitor.fill_buffer()) {
					break;
				} 
			}
			if (generatedPaused) {
				.AudioQueueStart(generatedQueue, NULL);
				monitor.setPaused(false);
			} 
		} 
		ModernizedCProgram.pthread_mutex_unlock(generatedMutex);
		audio_monitor monitor = param;
		double generatedUser_volume = this.getUser_volume();
		double vol = generatedUser_volume;
		 bytes = new ();
		uint8_t[] resample_data = new uint8_t();
		uint32_t resample_frames = new uint32_t();
		uint64_t ts_offset = new uint64_t();
		 success = new ();
		Object generatedPlayback_mutex = monitor.getPlayback_mutex();
		if (ModernizedCProgram.pthread_mutex_trylock(generatedPlayback_mutex) != 0) {
			return ;
		} 
		Object generatedActivate_refs = this.getActivate_refs();
		if (ModernizedCProgram.os_atomic_load_long(generatedActivate_refs) == 0) {
			;
		} 
		Object generatedResampler = monitor.getResampler();
		success = generatedResampler.audio_resampler_resample(resample_data, resample_frames, ts_offset, (uint8_t)audio_data.getData(), (uint32_t)audio_data.getFrames());
		if (!success) {
			;
		} 
		Object generatedBytes_per_frame = monitor.getBytes_per_frame();
		bytes = generatedBytes_per_frame * resample_frames;
		if (muted) {
			.memset(resample_data[0], 0, bytes);
		} else {
				if (!ModernizedCProgram.close_float(vol, 1.0, EPSILON)) {
					ModernizedCProgram.process_volume(monitor, vol, resample_data, resample_frames);
				} 
		} 
		Object generatedNew_data = monitor.getNew_data();
		generatedNew_data.circlebuf_push_back(resample_data[0], bytes);
		Object generatedPackets = monitor.getPackets();
		generatedPackets++;
		Object generatedFrames = monitor.getFrames();
		generatedFrames += resample_frames;
		ModernizedCProgram.do_stream_write(param);
	}
	public void volmeter_source_data_received(Object vptr, Object data, Object muted) {
		obs_volmeter volmeter = (obs_volmeter)vptr;
		double mul;
		double[] magnitude = new double[MAX_AUDIO_CHANNELS];
		double[] peak = new double[MAX_AUDIO_CHANNELS];
		double[] input_peak = new double[MAX_AUDIO_CHANNELS];
		Object generatedMutex = volmeter.getMutex();
		ModernizedCProgram.pthread_mutex_lock(generatedMutex);
		volmeter.volmeter_process_audio_data(data)// Adjust magnitude/peak based on the volume level set by the user.;// Adjust magnitude/peak based on the volume level set by the user.
		double generatedCur_db = volmeter.getCur_db();
		// And convert to dB.// And convert to dB.mul = muted ? 0.0 : ModernizedCProgram.db_to_mul(generatedCur_db);
		Object generatedMagnitude = volmeter.getMagnitude();
		Object generatedPeak = volmeter.getPeak();
		for (int channel_nr = 0;
		 channel_nr < MAX_AUDIO_CHANNELS; channel_nr++) {
			magnitude[channel_nr] = ModernizedCProgram.mul_to_db(generatedMagnitude[channel_nr] * mul);
			peak[channel_nr] = ModernizedCProgram.mul_to_db(generatedPeak[channel_nr] * mul);
			input_peak[channel_nr] = ModernizedCProgram.mul_to_db(generatedPeak[/* The input-peak is NOT adjusted with volume, so that the user
					 * can check the input-gain. */channel_nr]);
		}
		ModernizedCProgram.pthread_mutex_unlock(generatedMutex);
		volmeter.signal_levels_updated(magnitude, peak, input_peak);
		.UNUSED_PARAMETER(source);
	}
	public void async_delay_filter_remove(Object data) {
		async_delay_data filter = data;
		ModernizedCProgram.free_video_data(filter, parent);
		filter/* due to the fact that we need timing information to be consistent in order to
		 * measure the current interval of data, if there is an unexpected hiccup or
		 * jump with the timestamps, reset the cached delay data and start again to
		 * ensure that the timing is consistent */.free_audio_data();
	}
	public obs_source obs_get_output_source(Object channel) {
		if (!ModernizedCProgram.obs) {
			return NULL;
		} 
		obs_source obs_source = new obs_source();
		return obs_source.obs_view_get_source(ModernizedCProgram.obs.getData().getMain_view(), channel);
	}
	public void obs_set_output_source(Object channel) {
		.assert(channel < 64);
		if (!ModernizedCProgram.obs) {
			return ;
		} 
		if (channel >= 64) {
			return ;
		} 
		obs_source prev_source = new obs_source();
		obs_view view = ModernizedCProgram.obs.getData().getMain_view();
		calldata params = new calldata(0);
		Object generatedChannels_mutex = view.getChannels_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedChannels_mutex);
		source.obs_source_addref();
		Object generatedChannels = view.getChannels();
		prev_source = generatedChannels[channel];
		params.calldata_set_int("channel", channel);
		params.calldata_set_ptr("prev_source", prev_source);
		params.calldata_set_ptr("source", source);
		.signal_handler_signal(ModernizedCProgram.obs.getSignals(), "channel_change", params);
		ModernizedCProgram.calldata_get_ptr(params, "source", source);
		params.calldata_free();
		generatedChannels[channel] = source;
		ModernizedCProgram.pthread_mutex_unlock(generatedChannels_mutex);
		if (source) {
			source.obs_source_activate(view_type.MAIN_VIEW);
		} 
		if (prev_source) {
			prev_source.obs_source_deactivate(view_type.MAIN_VIEW);
			prev_source.obs_source_release();
		} 
	}
	public obs_source obs_get_source_by_name(Object name) {
		if (!ModernizedCProgram.obs) {
			return NULL;
		} 
		return ModernizedCProgram.get_context_by_name(ModernizedCProgram.obs.getData().getFirst_source(), name, ModernizedCProgram.obs.getData().getSources_mutex(), obs_source_addref_safe_);
	}
	public obs_source obs_load_source_type(obs_data source_data) {
		obs_data_array obs_data_array = new obs_data_array();
		obs_data_array_t filters = obs_data_array.obs_data_get_array(source_data, "filters");
		obs_source_t source = new obs_source_t();
		byte name = source_data.obs_data_get_string("name");
		byte id = source_data.obs_data_get_string("id");
		obs_data_t settings = source_data.obs_data_get_obj("settings");
		obs_data_t hotkeys = source_data.obs_data_get_obj("hotkeys");
		double volume;
		double balance;
		int64_t sync = new int64_t();
		uint32_t prev_ver = new uint32_t();
		uint32_t caps = new uint32_t();
		uint32_t flags = new uint32_t();
		uint32_t mixers = new uint32_t();
		int di_order;
		int di_mode;
		int monitoring_type;
		prev_ver = (uint32_t)source_data.obs_data_get_int("prev_ver");
		obs_source obs_source = new obs_source();
		source = obs_source.obs_source_create_set_last_ver(id, name, settings, hotkeys, prev_ver);
		hotkeys.obs_data_release();
		caps = ModernizedCProgram.obs_source_get_output_flags(source);
		source_data.obs_data_set_default_double("volume", 1.0);
		volume = source_data.obs_data_get_double("volume");
		source.obs_source_set_volume((double)volume);
		source_data.obs_data_set_default_double("balance", 0.5);
		balance = source_data.obs_data_get_double("balance");
		source.obs_source_set_balance_value((double)balance);
		sync = source_data.obs_data_get_int("sync");
		source.obs_source_set_sync_offset(sync);
		source_data.obs_data_set_default_int("mixers", -1024);
		mixers = (uint32_t)source_data.obs_data_get_int("mixers");
		source.obs_source_set_audio_mixers(mixers);
		Object generatedDefault_flags = source.getDefault_flags();
		source_data.obs_data_set_default_int("flags", generatedDefault_flags);
		flags = (uint32_t)source_data.obs_data_get_int("flags");
		source.obs_source_set_flags(flags);
		source_data.obs_data_set_default_bool("enabled", true);
		source.obs_source_set_enabled(source_data.obs_data_get_bool("enabled"));
		source_data.obs_data_set_default_bool("muted", false);
		source.obs_source_set_muted(source_data.obs_data_get_bool("muted"));
		source_data.obs_data_set_default_bool("push-to-mute", false);
		source.obs_source_enable_push_to_mute(source_data.obs_data_get_bool("push-to-mute"));
		source_data.obs_data_set_default_int("push-to-mute-delay", 0);
		source.obs_source_set_push_to_mute_delay(source_data.obs_data_get_int("push-to-mute-delay"));
		source_data.obs_data_set_default_bool("push-to-talk", false);
		source.obs_source_enable_push_to_talk(source_data.obs_data_get_bool("push-to-talk"));
		source_data.obs_data_set_default_int("push-to-talk-delay", 0);
		source.obs_source_set_push_to_talk_delay(source_data.obs_data_get_int("push-to-talk-delay"));
		di_mode = (int)source_data.obs_data_get_int("deinterlace_mode");
		source.obs_source_set_deinterlace_mode((obs_deinterlace_mode)di_mode);
		di_order = (int)source_data.obs_data_get_int("deinterlace_field_order");
		source.obs_source_set_deinterlace_field_order((obs_deinterlace_field_order)di_order);
		monitoring_type = (int)source_data.obs_data_get_int("monitoring_type");
		if (prev_ver < ((23 << 24) | (2 << 16) | 2)) {
			if ((caps & (1 << 11)) != 0/* updates older sources to enable monitoring
						 * automatically if they added monitoring by default in
						 * version 24 */) {
				monitoring_type = obs_monitoring_type.OBS_MONITORING_TYPE_MONITOR_ONLY;
				source.obs_source_set_audio_mixers(-1024);
			} 
		} 
		source.obs_source_set_monitoring_type((obs_monitoring_type)monitoring_type);
		obs_data generatedPrivate_settings = source.getPrivate_settings();
		generatedPrivate_settings.obs_data_release();
		source.setPrivate_settings(source_data.obs_data_get_obj("private_settings"));
		obs_data obs_data = new obs_data();
		if (!generatedPrivate_settings) {
			source.setPrivate_settings(obs_data.obs_data_create());
		} 
		obs_data obs_data = new obs_data();
		obs_source obs_source = new obs_source();
		if (filters) {
			 count = filters.obs_data_array_count();
			for ( i = 0;
			 i < count; i++) {
				obs_data_t filter_data = obs_data.obs_data_array_item(filters, i);
				obs_source_t filter = obs_source.obs_load_source_type(filter_data);
				if (filter) {
					source.obs_source_filter_add(filter);
					filter.obs_source_release();
				} 
				filter_data.obs_data_release();
			}
			filters.obs_data_array_release();
		} 
		settings.obs_data_release();
		return source;
	}
	public obs_source obs_load_source(obs_data source_data) {
		obs_source obs_source = new obs_source();
		return obs_source.obs_load_source_type(source_data);
	}
	public Object save_source_filter(Object data) {
		.UNUSED_PARAMETER(data);
		.UNUSED_PARAMETER(source);
		return true;
	}
	/* -------------------------------------------- */
	public void source_enum_filters_proc(obs_source filter, Object param) {
		.UNUSED_PARAMETER(source);
		 script = param;
		filter.obs_source_get_ref();
		ModernizedCProgram.ls_push_libobs_obj_(script, "obs_source_t *", filter, false, NULL, __FUNCTION__, 601);
		 idx = .lua_rawlen(script, -2);
		.lua_rawseti(script, -2, (int)idx + 1);
	}
	public obs_source get_transition(slideshow ss) {
		obs_source_t tr = new obs_source_t();
		Object generatedMutex = ss.getMutex();
		ModernizedCProgram.pthread_mutex_lock(generatedMutex);
		obs_source generatedTransition = ss.getTransition();
		tr = generatedTransition;
		tr.obs_source_addref();
		ModernizedCProgram.pthread_mutex_unlock(generatedMutex);
		return tr;
	}
	public obs_source get_source(Object array, Object path) {
		obs_source_t source = NULL;
		files.setDa(array);
		for ( i = 0;
		 i < files.getNum(); i++) {
			byte cur_path = files.getArray()[i].getPath();
			if (.strcmp(path, cur_path) == 0) {
				source = files.getArray()[i].getSource();
				source.obs_source_addref();
				break;
			} 
		}
		return source;
	}
	public obs_source create_source_from_file(Object file) {
		obs_data obs_data = new obs_data();
		obs_data_t settings = obs_data.obs_data_create();
		obs_source_t source = new obs_source_t();
		settings.obs_data_set_string("file", file);
		settings.obs_data_set_bool("unload", false);
		obs_source obs_source = new obs_source();
		source = obs_source.obs_source_create_private("image_source", NULL, settings);
		settings.obs_data_release();
		return source;
	}
	public obs_source get_child_at_idx(obs_scene scene, Object idx) {
		obs_scene_item generatedFirst_item = scene.getFirst_item();
		obs_scene_item item = generatedFirst_item;
		obs_scene_item generatedNext = item.getNext();
		while (item && idx--) {
			item = generatedNext;
		}
		obs_source generatedSource = item.getSource();
		return item ? generatedSource : NULL;
	}
	public obs_source dup_child(Object array, Object idx, obs_scene new_scene, Object private) {
		obs_source_t source = new obs_source_t();
		old_items.setDa(array);
		source = old_items.getArray()[idx].getSource();
		obs_source generatedSource = item.getSource();
		obs_source obs_source = new obs_source();
		for ( i = 0;
		 i < idx; i++) {
			obs_scene_item item = old_items.getArray()[i];
			if (generatedSource == source) {
				source = obs_source.get_child_at_idx(new_scene, i);
				source.obs_source_addref();
				return source;
			} 
		}
		return source.obs_source_duplicate(NULL, private);
	}
	public obs_source new_ref() {
		source.obs_source_addref();
		return source;
	}
	public obs_source obs_scene_get_source(Object scene) {
		return scene ? scene.getSource() : NULL;
	}
	public Object source_has_audio() {
		obs_source_info generatedInfo = this.getInfo();
		Object generatedOutput_flags = generatedInfo.getOutput_flags();
		return (generatedOutput_flags & ((1 << 1) | (1 << 6))) != 0;
	}
	public obs_source obs_sceneitem_get_source(Object item) {
		return item ? item.getSource() : NULL;
	}
	public void allocate_audio_output_buffer() {
		 size =  * AUDIO_OUTPUT_FRAMES * MAX_AUDIO_CHANNELS * MAX_AUDIO_MIXES;
		double ptr = ModernizedCProgram.bzalloc(size);
		Object generatedAudio_output_buf = this.getAudio_output_buf();
		for ( mix = 0;
		 mix < MAX_AUDIO_MIXES; mix++) {
			 mix_pos = mix * AUDIO_OUTPUT_FRAMES * MAX_AUDIO_CHANNELS;
			for ( i = 0;
			 i < MAX_AUDIO_CHANNELS; i++) {
				generatedAudio_output_buf[mix][i] = ptr + mix_pos + AUDIO_OUTPUT_FRAMES * i;
			}
		}
	}
	public void allocate_audio_mix_buffer() {
		 size =  * AUDIO_OUTPUT_FRAMES * MAX_AUDIO_CHANNELS;
		double ptr = ModernizedCProgram.bzalloc(size);
		Object generatedAudio_mix_buf = this.getAudio_mix_buf();
		for ( i = 0;
		 i < MAX_AUDIO_CHANNELS; i++) {
			generatedAudio_mix_buf[i] = ptr + AUDIO_OUTPUT_FRAMES * i;
		}
	}
	/* internal initialization */
	public Object obs_source_init() {
		 attr = new ();
		this.setUser_volume(1.0);
		this.setVolume(1.0);
		this.setSync_offset(0);
		this.setBalance(0.5);
		this.setAudio_active(true);
		Object generatedFilter_mutex = this.getFilter_mutex();
		ModernizedCProgram.pthread_mutex_init_value(generatedFilter_mutex);
		Object generatedAsync_mutex = this.getAsync_mutex();
		ModernizedCProgram.pthread_mutex_init_value(generatedAsync_mutex);
		Object generatedAudio_mutex = this.getAudio_mutex();
		ModernizedCProgram.pthread_mutex_init_value(generatedAudio_mutex);
		Object generatedAudio_buf_mutex = this.getAudio_buf_mutex();
		ModernizedCProgram.pthread_mutex_init_value(generatedAudio_buf_mutex);
		Object generatedAudio_cb_mutex = this.getAudio_cb_mutex();
		ModernizedCProgram.pthread_mutex_init_value(generatedAudio_cb_mutex);
		if (ModernizedCProgram.pthread_mutexattr_init(attr) != 0) {
			return false;
		} 
		if (ModernizedCProgram.pthread_mutexattr_settype(attr, PTHREAD_MUTEX_RECURSIVE) != 0) {
			return false;
		} 
		if (ModernizedCProgram.pthread_mutex_init(generatedFilter_mutex, attr) != 0) {
			return false;
		} 
		if (ModernizedCProgram.pthread_mutex_init(generatedAudio_buf_mutex, NULL) != 0) {
			return false;
		} 
		Object generatedAudio_actions_mutex = this.getAudio_actions_mutex();
		if (ModernizedCProgram.pthread_mutex_init(generatedAudio_actions_mutex, NULL) != 0) {
			return false;
		} 
		if (ModernizedCProgram.pthread_mutex_init(generatedAudio_cb_mutex, NULL) != 0) {
			return false;
		} 
		if (ModernizedCProgram.pthread_mutex_init(generatedAudio_mutex, NULL) != 0) {
			return false;
		} 
		if (ModernizedCProgram.pthread_mutex_init(generatedAsync_mutex, NULL) != 0) {
			return false;
		} 
		if (ModernizedCProgram.is_audio_source(source) || ModernizedCProgram.is_composite_source(source)) {
			source.allocate_audio_output_buffer();
		} 
		obs_source_info generatedInfo = this.getInfo();
		Object generatedAudio_mix = generatedInfo.getAudio_mix();
		if (generatedAudio_mix) {
			source.allocate_audio_mix_buffer();
		} 
		obs_source_type generatedType = generatedInfo.getType();
		if (generatedType == obs_source_type.OBS_SOURCE_TYPE_TRANSITION) {
			if (!source.obs_transition_init()) {
				return false;
			} 
		} 
		this.setControl(ModernizedCProgram.bzalloc());
		this.setDeinterlace_top_first(true);
		obs_weak_source generatedControl = this.getControl();
		generatedControl.setSource(source);
		this.setAudio_mixers(-1024);
		obs_data obs_data = new obs_data();
		this.setPrivate_settings(obs_data.obs_data_create());
		return true;
	}
	public void obs_source_init_finalize() {
		obs_source generatedNext_audio_source = this.getNext_audio_source();
		if (ModernizedCProgram.is_audio_source(source)) {
			ModernizedCProgram.pthread_mutex_lock(ModernizedCProgram.obs.getData().getAudio_sources_mutex());
			this.setNext_audio_source(ModernizedCProgram.obs.getData().getFirst_audio_source());
			this.setPrev_next_audio_source(ModernizedCProgram.obs.getData().getFirst_audio_source());
			if (ModernizedCProgram.obs.getData().getFirst_audio_source()) {
				ModernizedCProgram.obs.getData().getFirst_audio_source().setPrev_next_audio_source(generatedNext_audio_source);
			} 
			ModernizedCProgram.obs.getData().setFirst_audio_source(source);
			ModernizedCProgram.pthread_mutex_unlock(ModernizedCProgram.obs.getData().getAudio_sources_mutex());
		} 
		obs_context_data generatedContext = this.getContext();
		generatedContext.obs_context_data_insert(ModernizedCProgram.obs.getData().getSources_mutex(), ModernizedCProgram.obs.getData().getFirst_source());
	}
	public void obs_source_init_audio_hotkeys() {
		obs_source_info generatedInfo = this.getInfo();
		Object generatedOutput_flags = generatedInfo.getOutput_flags();
		obs_source_type generatedType = generatedInfo.getType();
		if (!(generatedOutput_flags & (1 << 1)) || generatedType != obs_source_type.OBS_SOURCE_TYPE_INPUT) {
			this.setMute_unmute_key((~(obs_hotkey_id)0));
			this.setPush_to_talk_key((~(obs_hotkey_id)0));
			return ;
		} 
		this.setMute_unmute_key(source.obs_hotkey_pair_register_source("libobs.mute", ModernizedCProgram.obs.getHotkeys().getMute(), "libobs.unmute", ModernizedCProgram.obs.getHotkeys().getUnmute(), obs_source_hotkey_mute, obs_source_hotkey_unmute, source, source));
		this.setPush_to_mute_key(source.obs_hotkey_register_source("libobs.push-to-mute", ModernizedCProgram.obs.getHotkeys().getPush_to_mute(), obs_source_hotkey_push_to_mute, source));
		this.setPush_to_talk_key(source.obs_hotkey_register_source("libobs.push-to-talk", ModernizedCProgram.obs.getHotkeys().getPush_to_talk(), obs_source_hotkey_push_to_talk, source));
	}
	public obs_source obs_source_create_internal(Object id, Object name, obs_data settings, obs_data hotkey_data, Object private, Object last_obs_ver) {
		obs_source source = ModernizedCProgram.bzalloc();
		obs_source_info obs_source_info = new obs_source_info();
		obs_source_info info = obs_source_info.get_source_info(id);
		obs_source_info generatedInfo = source.getInfo();
		if (!info) {
			ModernizedCProgram.blog(LOG_ERROR, "Source ID '%s' not found", id);
			generatedInfo.setId(ModernizedCProgram.bstrdup(id));
			source.setOwns_info_id(true);
		} else {
				source.setInfo(info/* Always mark filters as private so they aren't found by
						 * source enum/search functions.
						 *
						 * XXX: Fix design flaws with filters */);
				if (info.getType() == obs_source_type.OBS_SOURCE_TYPE_FILTER) {
					private = true;
				} 
		} 
		source.setMute_unmute_key((~(obs_hotkey_pair_id)0));
		source.setPush_to_mute_key((~(obs_hotkey_id)0));
		source.setPush_to_talk_key((~(obs_hotkey_id)0));
		source.setLast_obs_ver(last_obs_ver);
		if (!ModernizedCProgram.obs_source_init_context(source, settings, name, hotkey_data, private)) {
			;
		} 
		obs_context_data generatedContext = source.getContext();
		obs_data generatedSettings = generatedContext.getSettings();
		if (info) {
			if (info.getGet_defaults()) {
				.UNRECOGNIZEDFUNCTIONNAME(generatedSettings);
			} 
			if (info.getGet_defaults2()) {
				.UNRECOGNIZEDFUNCTIONNAME(info.getType_data(), generatedSettings);
			} 
		} 
		if (!source.obs_source_init()) {
			;
		} 
		if (!private) {
			source.obs_source_init_audio_hotkeys();
		} 
		if (info && info.getCreate()) {
			generatedContext.setData(.UNRECOGNIZEDFUNCTIONNAME(generatedSettings, source));
		} 
		Object generatedData = generatedContext.getData();
		if ((!info || info.getCreate()) && !generatedData) {
			ModernizedCProgram.blog(LOG_ERROR, "Failed to create source '%s'!", name);
		} 
		ModernizedCProgram.blog(LOG_DEBUG, "%ssource '%s' (%s) created", private ? "private " : "", name, id);
		Object generatedDefault_flags = source.getDefault_flags();
		source.setFlags(generatedDefault_flags);
		source.setEnabled(true);
		if (!private) {
			source.obs_source_dosignal("source_create", NULL);
		} 
		source.obs_source_init_finalize();
		return source;
		source.obs_source_destroy();
		return NULL;
	}
	public obs_source obs_source_create(Object id, Object name, obs_data settings, obs_data hotkey_data) {
		obs_source obs_source = new obs_source();
		return obs_source.obs_source_create_internal(id, name, settings, hotkey_data, false, ((24 << 24) | (0 << 16) | 3));
	}
	public obs_source obs_source_create_private(Object id, Object name, obs_data settings) {
		obs_source obs_source = new obs_source();
		return obs_source.obs_source_create_internal(id, name, settings, NULL, true, ((24 << 24) | (0 << 16) | 3));
	}
	public obs_source obs_source_create_set_last_ver(Object id, Object name, obs_data settings, obs_data hotkey_data, Object last_obs_ver) {
		obs_source obs_source = new obs_source();
		return obs_source.obs_source_create_internal(id, name, settings, hotkey_data, false, last_obs_ver);
	}
	public Byte get_new_filter_name(Object name) {
		dstr new_name = new dstr(0);
		int inc = 0;
		new_name.dstr_copy(name);
		Object generatedDstr = new_name.getDstr();
		for (; ; ) {
			obs_source_t existing_filter = dst.obs_source_get_filter_by_name(generatedDstr);
			if (!existing_filter) {
				break;
			} 
			existing_filter.obs_source_release();
			new_name.dstr_printf("%s %d", name, ++inc + 1);
		}
		return generatedDstr;
	}
	public void duplicate_filters(obs_source src, Object private) {
		.da_init(filters);
		Object generatedFilter_mutex = src.getFilter_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedFilter_mutex);
		Object generatedFilters = src.getFilters();
		for ( i = 0;
		 i < generatedFilters.getNum(); i++) {
			generatedFilters.getArray()[i].obs_source_addref();
		}
		.da_copy(filters, generatedFilters);
		ModernizedCProgram.pthread_mutex_unlock(generatedFilter_mutex);
		obs_context_data generatedContext = src_filter.getContext();
		Byte generatedName = generatedContext.getName();
		for ( i = filters.getNum();
		 i > 0; i--) {
			obs_source_t src_filter = filters.getArray()[i - 1];
			byte new_name = dst.get_new_filter_name(generatedName);
			 enabled = ModernizedCProgram.obs_source_enabled(src_filter);
			obs_source_t dst_filter = src_filter.obs_source_duplicate(new_name, private);
			dst_filter.obs_source_set_enabled(ModernizedCProgram.enabled);
			ModernizedCProgram.bfree(new_name);
			dst.obs_source_filter_add(dst_filter);
			dst_filter.obs_source_release();
			src_filter.obs_source_release();
		}
		.da_free(filters);
	}
	public void obs_source_copy_filters(obs_source src) {
		if (!ModernizedCProgram.obs_object_valid(dst, "obs_source_copy_filters", "dst")) {
			return ;
		} 
		if (!ModernizedCProgram.obs_object_valid(src, "obs_source_copy_filters", "src")) {
			return ;
		} 
		obs_context_data generatedContext = this.getContext();
		Object generatedPrivate = generatedContext.getPrivate();
		dst.duplicate_filters(src, generatedPrivate);
	}
	public obs_source obs_source_duplicate(Object new_name, Object create_private) {
		obs_source_t new_source = new obs_source_t();
		obs_data_t settings = new obs_data_t();
		if (!ModernizedCProgram.obs_object_valid(source, "obs_source_duplicate", "source")) {
			return NULL;
		} 
		obs_source_info generatedInfo = this.getInfo();
		Object generatedOutput_flags = generatedInfo.getOutput_flags();
		if ((generatedOutput_flags & (1 << 7)) != 0) {
			source.obs_source_addref();
			return source;
		} 
		obs_source_type generatedType = generatedInfo.getType();
		obs_scene obs_scene = new obs_scene();
		obs_scene obs_scene = new obs_scene();
		obs_source obs_source = new obs_source();
		if (generatedType == obs_source_type.OBS_SOURCE_TYPE_SCENE) {
			obs_scene_t scene = obs_scene.obs_scene_from_source(source);
			if (!scene) {
				scene = obs_scene.obs_group_from_source(source);
			} 
			if (!scene) {
				return NULL;
			} 
			obs_scene_t new_scene = scene.obs_scene_duplicate(new_name, create_private ? obs_scene_duplicate_type.OBS_SCENE_DUP_PRIVATE_COPY : obs_scene_duplicate_type.OBS_SCENE_DUP_COPY);
			obs_source_t new_source = obs_source.obs_scene_get_source(new_scene);
			return new_source;
		} 
		obs_data obs_data = new obs_data();
		settings = obs_data.obs_data_create();
		obs_context_data generatedContext = this.getContext();
		obs_data generatedSettings = generatedContext.getSettings();
		settings.obs_data_apply(generatedSettings);
		Object generatedId = generatedInfo.getId();
		obs_source obs_source = new obs_source();
		obs_source obs_source = new obs_source();
		new_source = create_private ? obs_source.obs_source_create_private(generatedId, new_name, settings) : obs_source.obs_source_create(generatedId, new_name, settings, NULL);
		Object generatedAudio_mixers = this.getAudio_mixers();
		new_source.setAudio_mixers(generatedAudio_mixers);
		Object generatedSync_offset = this.getSync_offset();
		new_source.setSync_offset(generatedSync_offset);
		double generatedUser_volume = this.getUser_volume();
		new_source.setUser_volume(generatedUser_volume);
		Object generatedUser_muted = this.getUser_muted();
		new_source.setUser_muted(generatedUser_muted);
		double generatedVolume = this.getVolume();
		new_source.setVolume(generatedVolume);
		Object generatedMuted = this.getMuted();
		new_source.setMuted(generatedMuted);
		Object generatedFlags = this.getFlags();
		new_source.setFlags(generatedFlags);
		obs_data generatedPrivate_settings = new_source.getPrivate_settings();
		generatedPrivate_settings.obs_data_apply(generatedPrivate_settings);
		if (generatedType != obs_source_type.OBS_SOURCE_TYPE_FILTER) {
			new_source.duplicate_filters(source, create_private);
		} 
		settings.obs_data_release();
		return new_source;
	}
	public void obs_source_destroy() {
		 i = new ();
		if (!ModernizedCProgram.obs_object_valid(source, "obs_source_destroy", "source")) {
			return ;
		} 
		obs_source_info generatedInfo = this.getInfo();
		obs_source_type generatedType = generatedInfo.getType();
		if (generatedType == obs_source_type.OBS_SOURCE_TYPE_TRANSITION) {
			source.obs_transition_clear();
		} 
		ModernizedCProgram.pthread_mutex_lock(ModernizedCProgram.obs.getData().getAudio_sources_mutex());
		obs_source generatedPrev_next_audio_source = this.getPrev_next_audio_source();
		obs_source generatedNext_audio_source = this.getNext_audio_source();
		if (generatedPrev_next_audio_source) {
			generatedPrev_next_audio_source = generatedNext_audio_source;
			if (generatedNext_audio_source) {
				generatedNext_audio_source.setPrev_next_audio_source(generatedPrev_next_audio_source);
			} 
		} 
		ModernizedCProgram.pthread_mutex_unlock(ModernizedCProgram.obs.getData().getAudio_sources_mutex());
		obs_source generatedFilter_parent = this.getFilter_parent();
		if (generatedFilter_parent) {
			generatedFilter_parent.obs_source_filter_remove_refless(source);
		} 
		Object generatedFilters = this.getFilters();
		while (generatedFilters.getNum()) {
			source.obs_source_filter_remove(generatedFilters.getArray()[0]);
		}
		obs_context_data generatedContext = this.getContext();
		generatedContext.obs_context_data_remove();
		Object generatedPrivate = generatedContext.getPrivate();
		Byte generatedName = generatedContext.getName();
		ModernizedCProgram.blog(LOG_DEBUG, "%ssource '%s' destroyed", generatedPrivate ? "private " : "", generatedName);
		source.obs_source_dosignal("source_destroy", "destroy");
		Object generatedData = generatedContext.getData();
		if (generatedData) {
			.UNRECOGNIZEDFUNCTIONNAME(generatedData);
			generatedContext.setData(NULL);
		} 
		audio_monitor generatedMonitor = this.getMonitor();
		generatedMonitor.audio_monitor_destroy();
		Object generatedPush_to_talk_key = this.getPush_to_talk_key();
		ModernizedCProgram.obs_hotkey_unregister(generatedPush_to_talk_key);
		Object generatedPush_to_mute_key = this.getPush_to_mute_key();
		ModernizedCProgram.obs_hotkey_unregister(generatedPush_to_mute_key);
		Object generatedMute_unmute_key = this.getMute_unmute_key();
		ModernizedCProgram.obs_hotkey_pair_unregister(generatedMute_unmute_key);
		Object generatedAsync_cache = this.getAsync_cache();
		for (i = 0; i < generatedAsync_cache.getNum(); i++) {
			generatedAsync_cache.getArray()[i].getFrame().obs_source_frame_decref();
		}
		ModernizedCProgram.obs.getVideo().getGraphics().gs_enter_context();
		Object generatedAsync_texrender = this.getAsync_texrender();
		if (generatedAsync_texrender) {
			generatedAsync_texrender.gs_texrender_destroy();
		} 
		Object generatedAsync_prev_texrender = this.getAsync_prev_texrender();
		if (generatedAsync_prev_texrender) {
			generatedAsync_prev_texrender.gs_texrender_destroy();
		} 
		Object generatedAsync_textures = this.getAsync_textures();
		Object generatedAsync_prev_textures = this.getAsync_prev_textures();
		for ( c = 0;
		 c < MAX_AV_PLANES; c++) {
			ModernizedCProgram.gs_texture_destroy(generatedAsync_textures[c]);
			ModernizedCProgram.gs_texture_destroy(generatedAsync_prev_textures[c]);
		}
		Object generatedFilter_texrender = this.getFilter_texrender();
		if (generatedFilter_texrender) {
			generatedFilter_texrender.gs_texrender_destroy();
		} 
		ModernizedCProgram.gs_leave_context();
		for (i = 0; i < MAX_AV_PLANES; i++) {
			ModernizedCProgram.bfree(generatedData[i]);
		}
		Object generatedAudio_input_buf = this.getAudio_input_buf();
		for (i = 0; i < MAX_AUDIO_CHANNELS; i++) {
			generatedAudio_input_buf[i].circlebuf_free();
		}
		Object generatedResampler = this.getResampler();
		generatedResampler.audio_resampler_destroy();
		Object generatedAudio_output_buf = this.getAudio_output_buf();
		ModernizedCProgram.bfree(generatedAudio_output_buf[0][0]);
		Object generatedAudio_mix_buf = this.getAudio_mix_buf();
		ModernizedCProgram.bfree(generatedAudio_mix_buf[0]);
		obs_source_frame generatedAsync_preload_frame = this.getAsync_preload_frame();
		generatedAsync_preload_frame.obs_source_frame_destroy();
		if (generatedType == obs_source_type.OBS_SOURCE_TYPE_TRANSITION) {
			source.obs_transition_free();
		} 
		Object generatedAudio_actions = this.getAudio_actions();
		.da_free(generatedAudio_actions);
		Object generatedAudio_cb_list = this.getAudio_cb_list();
		.da_free(generatedAudio_cb_list);
		.da_free(generatedAsync_cache);
		Object generatedAsync_frames = this.getAsync_frames();
		.da_free(generatedAsync_frames);
		.da_free(generatedFilters);
		Object generatedFilter_mutex = this.getFilter_mutex();
		ModernizedCProgram.pthread_mutex_destroy(generatedFilter_mutex);
		Object generatedAudio_actions_mutex = this.getAudio_actions_mutex();
		ModernizedCProgram.pthread_mutex_destroy(generatedAudio_actions_mutex);
		Object generatedAudio_buf_mutex = this.getAudio_buf_mutex();
		ModernizedCProgram.pthread_mutex_destroy(generatedAudio_buf_mutex);
		Object generatedAudio_cb_mutex = this.getAudio_cb_mutex();
		ModernizedCProgram.pthread_mutex_destroy(generatedAudio_cb_mutex);
		Object generatedAudio_mutex = this.getAudio_mutex();
		ModernizedCProgram.pthread_mutex_destroy(generatedAudio_mutex);
		Object generatedAsync_mutex = this.getAsync_mutex();
		ModernizedCProgram.pthread_mutex_destroy(generatedAsync_mutex);
		obs_data generatedPrivate_settings = this.getPrivate_settings();
		generatedPrivate_settings.obs_data_release();
		generatedContext.obs_context_data_free();
		Object generatedOwns_info_id = this.getOwns_info_id();
		Object generatedId = generatedInfo.getId();
		if (generatedOwns_info_id) {
			ModernizedCProgram.bfree((Object)generatedId);
		} 
		ModernizedCProgram.bfree(source);
	}
	public void obs_source_addref() {
		if (!source) {
			return ;
		} 
		obs_weak_source generatedControl = this.getControl();
		obs_weak_ref generatedRef = generatedControl.getRef();
		generatedRef.obs_ref_addref();
	}
	public void obs_source_release() {
		if (!ModernizedCProgram.obs) {
			ModernizedCProgram.blog(LOG_WARNING, "Tried to release a source when the OBS core is shut down!");
			return ;
		} 
		if (!source) {
			return ;
		} 
		obs_weak_source generatedControl = this.getControl();
		obs_weak_source_t control = generatedControl;
		obs_weak_ref generatedRef = control.getRef();
		if (generatedRef.obs_ref_release()) {
			source.obs_source_destroy();
			control.obs_weak_source_release();
		} 
	}
	public obs_source obs_source_get_ref() {
		if (!source) {
			return NULL;
		} 
		obs_weak_source generatedControl = this.getControl();
		obs_source obs_source = new obs_source();
		return obs_source.obs_weak_source_get_source(generatedControl);
	}
	public obs_source obs_weak_source_get_source(obs_weak_source weak) {
		if (!weak) {
			return NULL;
		} 
		obs_weak_ref generatedRef = weak.getRef();
		obs_source generatedSource = weak.getSource();
		if (generatedRef.obs_weak_ref_get_ref()) {
			return generatedSource;
		} 
		return NULL;
	}
	public void obs_source_remove() {
		if (!ModernizedCProgram.obs_object_valid(source, "obs_source_remove", "source")) {
			return ;
		} 
		Object generatedRemoved = this.getRemoved();
		if (!generatedRemoved) {
			this.setRemoved(true);
			source.obs_source_dosignal("source_remove", "remove");
		} 
	}
	public void obs_source_deferred_update() {
		obs_context_data generatedContext = this.getContext();
		Object generatedData = generatedContext.getData();
		obs_source_info generatedInfo = this.getInfo();
		Object generatedUpdate = generatedInfo.getUpdate();
		obs_data generatedSettings = generatedContext.getSettings();
		if (generatedData && generatedUpdate) {
			.UNRECOGNIZEDFUNCTIONNAME(generatedData, generatedSettings);
		} 
		this.setDefer_update(false);
	}
	public void obs_source_update_properties() {
		if (!ModernizedCProgram.obs_object_valid(source, "obs_source_update_properties", "source")) {
			return ;
		} 
		source.obs_source_dosignal(NULL, "update_properties");
	}
	public void obs_source_send_mouse_click(Object event, Object type, Object mouse_up, Object click_count) {
		if (!ModernizedCProgram.obs_object_valid(source, "obs_source_send_mouse_click", "source")) {
			return ;
		} 
		obs_source_info generatedInfo = this.getInfo();
		Object generatedOutput_flags = generatedInfo.getOutput_flags();
		Object generatedMouse_click = generatedInfo.getMouse_click();
		obs_context_data generatedContext = this.getContext();
		Object generatedData = generatedContext.getData();
		if (generatedOutput_flags & (1 << 5)) {
			if (generatedMouse_click) {
				.UNRECOGNIZEDFUNCTIONNAME(generatedData, event, type, mouse_up, click_count);
			} 
		} 
	}
	public void obs_source_send_mouse_move(Object event, Object mouse_leave) {
		if (!ModernizedCProgram.obs_object_valid(source, "obs_source_send_mouse_move", "source")) {
			return ;
		} 
		obs_source_info generatedInfo = this.getInfo();
		Object generatedOutput_flags = generatedInfo.getOutput_flags();
		Object generatedMouse_move = generatedInfo.getMouse_move();
		obs_context_data generatedContext = this.getContext();
		Object generatedData = generatedContext.getData();
		if (generatedOutput_flags & (1 << 5)) {
			if (generatedMouse_move) {
				.UNRECOGNIZEDFUNCTIONNAME(generatedData, event, mouse_leave);
			} 
		} 
	}
	public void obs_source_send_mouse_wheel(Object event, int x_delta, int y_delta) {
		if (!ModernizedCProgram.obs_object_valid(source, "obs_source_send_mouse_wheel", "source")) {
			return ;
		} 
		obs_source_info generatedInfo = this.getInfo();
		Object generatedOutput_flags = generatedInfo.getOutput_flags();
		Object generatedMouse_wheel = generatedInfo.getMouse_wheel();
		obs_context_data generatedContext = this.getContext();
		Object generatedData = generatedContext.getData();
		if (generatedOutput_flags & (1 << 5)) {
			if (generatedMouse_wheel) {
				.UNRECOGNIZEDFUNCTIONNAME(generatedData, event, x_delta, y_delta);
			} 
		} 
	}
	public void obs_source_send_focus(Object focus) {
		if (!ModernizedCProgram.obs_object_valid(source, "obs_source_send_focus", "source")) {
			return ;
		} 
		obs_source_info generatedInfo = this.getInfo();
		Object generatedOutput_flags = generatedInfo.getOutput_flags();
		Object generatedFocus = generatedInfo.getFocus();
		obs_context_data generatedContext = this.getContext();
		Object generatedData = generatedContext.getData();
		if (generatedOutput_flags & (1 << 5)) {
			if (generatedFocus) {
				.UNRECOGNIZEDFUNCTIONNAME(generatedData, focus);
			} 
		} 
	}
	public void obs_source_send_key_click(Object event, Object key_up) {
		if (!ModernizedCProgram.obs_object_valid(source, "obs_source_send_key_click", "source")) {
			return ;
		} 
		obs_source_info generatedInfo = this.getInfo();
		Object generatedOutput_flags = generatedInfo.getOutput_flags();
		Object generatedKey_click = generatedInfo.getKey_click();
		obs_context_data generatedContext = this.getContext();
		Object generatedData = generatedContext.getData();
		if (generatedOutput_flags & (1 << 5)) {
			if (generatedKey_click) {
				.UNRECOGNIZEDFUNCTIONNAME(generatedData, event, key_up);
			} 
		} 
	}
	public void activate_source() {
		obs_context_data generatedContext = this.getContext();
		Object generatedData = generatedContext.getData();
		obs_source_info generatedInfo = this.getInfo();
		Object generatedActivate = generatedInfo.getActivate();
		if (generatedData && generatedActivate) {
			.UNRECOGNIZEDFUNCTIONNAME(generatedData);
		} 
		source.obs_source_dosignal("source_activate", "activate");
	}
	public void deactivate_source() {
		obs_context_data generatedContext = this.getContext();
		Object generatedData = generatedContext.getData();
		obs_source_info generatedInfo = this.getInfo();
		Object generatedDeactivate = generatedInfo.getDeactivate();
		if (generatedData && generatedDeactivate) {
			.UNRECOGNIZEDFUNCTIONNAME(generatedData);
		} 
		source.obs_source_dosignal("source_deactivate", "deactivate");
	}
	public void show_source() {
		obs_context_data generatedContext = this.getContext();
		Object generatedData = generatedContext.getData();
		obs_source_info generatedInfo = this.getInfo();
		Object generatedShow = generatedInfo.getShow();
		if (generatedData && generatedShow) {
			.UNRECOGNIZEDFUNCTIONNAME(generatedData);
		} 
		source.obs_source_dosignal("source_show", "show");
	}
	public void hide_source() {
		obs_context_data generatedContext = this.getContext();
		Object generatedData = generatedContext.getData();
		obs_source_info generatedInfo = this.getInfo();
		Object generatedHide = generatedInfo.getHide();
		if (generatedData && generatedHide) {
			.UNRECOGNIZEDFUNCTIONNAME(generatedData);
		} 
		source.obs_source_dosignal("source_hide", "hide");
	}
	public void activate_tree(obs_source child, Object param) {
		Object generatedActivate_refs = child.getActivate_refs();
		ModernizedCProgram.os_atomic_inc_long(generatedActivate_refs);
		.UNUSED_PARAMETER(parent);
		.UNUSED_PARAMETER(param);
	}
	public void deactivate_tree(obs_source child, Object param) {
		Object generatedActivate_refs = child.getActivate_refs();
		ModernizedCProgram.os_atomic_dec_long(generatedActivate_refs);
		.UNUSED_PARAMETER(parent);
		.UNUSED_PARAMETER(param);
	}
	public void show_tree(obs_source child, Object param) {
		Object generatedShow_refs = child.getShow_refs();
		ModernizedCProgram.os_atomic_inc_long(generatedShow_refs);
		.UNUSED_PARAMETER(parent);
		.UNUSED_PARAMETER(param);
	}
	public void hide_tree(obs_source child, Object param) {
		Object generatedShow_refs = child.getShow_refs();
		ModernizedCProgram.os_atomic_dec_long(generatedShow_refs);
		.UNUSED_PARAMETER(parent);
		.UNUSED_PARAMETER(param);
	}
	public void obs_source_activate(view_type type) {
		if (!ModernizedCProgram.obs_object_valid(source, "obs_source_activate", "source")) {
			return ;
		} 
		Object generatedShow_refs = this.getShow_refs();
		ModernizedCProgram.os_atomic_inc_long(generatedShow_refs);
		source.obs_source_enum_active_tree(show_tree, NULL);
		Object generatedActivate_refs = this.getActivate_refs();
		if (view_type.type == view_type.MAIN_VIEW) {
			ModernizedCProgram.os_atomic_inc_long(generatedActivate_refs);
			source.obs_source_enum_active_tree(activate_tree, NULL);
		} 
	}
	public void obs_source_deactivate(view_type type) {
		if (!ModernizedCProgram.obs_object_valid(source, "obs_source_deactivate", "source")) {
			return ;
		} 
		Object generatedShow_refs = this.getShow_refs();
		if (ModernizedCProgram.os_atomic_load_long(generatedShow_refs) > 0) {
			ModernizedCProgram.os_atomic_dec_long(generatedShow_refs);
			source.obs_source_enum_active_tree(hide_tree, NULL);
		} 
		Object generatedActivate_refs = this.getActivate_refs();
		if (view_type.type == view_type.MAIN_VIEW) {
			if (ModernizedCProgram.os_atomic_load_long(generatedActivate_refs) > 0) {
				ModernizedCProgram.os_atomic_dec_long(generatedActivate_refs);
				source.obs_source_enum_active_tree(deactivate_tree, NULL);
			} 
		} 
	}
	public void async_tick() {
		uint64_t sys_time = ModernizedCProgram.obs.getVideo().getVideo_time();
		Object generatedAsync_mutex = this.getAsync_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedAsync_mutex);
		obs_source_frame generatedCur_async_frame = this.getCur_async_frame();
		obs_source_frame obs_source_frame = new obs_source_frame();
		if (ModernizedCProgram.deinterlacing_enabled(source)) {
			source.deinterlace_process_last_frame(sys_time);
		} else {
				if (generatedCur_async_frame) {
					ModernizedCProgram.remove_async_frame(source, generatedCur_async_frame);
					this.setCur_async_frame(NULL);
				} 
				this.setCur_async_frame(obs_source_frame.get_closest_frame(source, sys_time));
		} 
		this.setLast_sys_timestamp(sys_time);
		ModernizedCProgram.pthread_mutex_unlock(generatedAsync_mutex);
		if (generatedCur_async_frame) {
			this.setAsync_update_texture(source.set_async_texture_size(generatedCur_async_frame));
		} 
	}
	public void obs_source_video_tick(double seconds) {
		 now_showing = new ();
		 now_active = new ();
		if (!ModernizedCProgram.obs_object_valid(source, "obs_source_video_tick", "source")) {
			return ;
		} 
		obs_source_info generatedInfo = this.getInfo();
		obs_source_type generatedType = generatedInfo.getType();
		if (generatedType == obs_source_type.OBS_SOURCE_TYPE_TRANSITION) {
			source.obs_transition_tick();
		} 
		Object generatedOutput_flags = generatedInfo.getOutput_flags();
		if ((generatedOutput_flags & (1 << 2)) != 0) {
			source.async_tick();
		} 
		Object generatedDefer_update = this.getDefer_update();
		if (generatedDefer_update) {
			source.obs_source_deferred_update();
		} 
		Object generatedFilter_texrender = this.getFilter_texrender();
		if (generatedFilter_texrender) {
			generatedFilter_texrender.gs_texrender_reset();
		} 
		Object generatedShow_refs = this.getShow_refs();
		now_showing = !!generatedShow_refs;
		Object generatedShowing = this.getShowing();
		if (now_showing != generatedShowing) {
			if (now_showing) {
				source.show_source();
			} else {
					source.hide_source();
			} 
			this.setShowing(now_showing);
		} 
		Object generatedActivate_refs = this.getActivate_refs();
		now_active = !!generatedActivate_refs;
		Object generatedActive = this.getActive();
		if (now_active != generatedActive) {
			if (now_active) {
				source.activate_source();
			} else {
					source.deactivate_source();
			} 
			this.setActive(now_active);
		} 
		obs_context_data generatedContext = this.getContext();
		Object generatedData = generatedContext.getData();
		Object generatedVideo_tick = generatedInfo.getVideo_tick();
		if (generatedData && generatedVideo_tick) {
			.UNRECOGNIZEDFUNCTIONNAME(generatedData, seconds);
		} 
		this.setAsync_rendered(false);
		this.setDeinterlace_rendered(false);
	}
	/* time threshold in nanoseconds to ensure audio timing is as seamless as
	 * possible */
	public void reset_audio_timing(Object timestamp, Object os_time) {
		this.setTiming_set(true);
		this.setTiming_adjust(os_time - timestamp);
	}
	public void reset_audio_data(Object os_time) {
		Object generatedAudio_input_buf = this.getAudio_input_buf();
		for ( i = 0;
		 i < MAX_AUDIO_CHANNELS; i++) {
			if (generatedAudio_input_buf[i].getCirclebuf()) {
				generatedAudio_input_buf[i].circlebuf_pop_front(NULL, generatedAudio_input_buf[i].getCirclebuf());
			} 
		}
		this.setLast_audio_input_buf_size(0);
		this.setAudio_ts(os_time);
		this.setNext_audio_sys_ts_min(os_time);
	}
	public void handle_ts_jump(Object expected, Object ts, Object diff, Object os_time) {
		obs_context_data generatedContext = this.getContext();
		Byte generatedName = generatedContext.getName();
		ModernizedCProgram.blog(LOG_DEBUG, "Timestamp for source '%s' jumped by '%I64u', expected value %I64u, input value %I64u", generatedName, diff, expected, ts);
		Object generatedAudio_buf_mutex = this.getAudio_buf_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedAudio_buf_mutex);
		source.reset_audio_timing(ts, os_time);
		ModernizedCProgram.pthread_mutex_unlock(generatedAudio_buf_mutex);
	}
	public void source_signal_audio_data(Object in, Object muted) {
		Object generatedAudio_cb_mutex = this.getAudio_cb_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedAudio_cb_mutex);
		Object generatedAudio_cb_list = this.getAudio_cb_list();
		Object generatedParam = info.getParam();
		for ( i = generatedAudio_cb_list.getNum();
		 i > 0; i--) {
			audio_cb_info info = generatedAudio_cb_list.getArray()[i - 1];
			.UNRECOGNIZEDFUNCTIONNAME(generatedParam, source, in, muted);
		}
		ModernizedCProgram.pthread_mutex_unlock(generatedAudio_cb_mutex);
	}
	public void source_output_audio_place(Object in) {
		 audio = ModernizedCProgram.obs.getAudio().getAudio();
		 buf_placement = new ();
		 channels = ModernizedCProgram.audio_output_get_channels(audio);
		 size = in.getFrames() * ;
		Object generatedAudio_ts = this.getAudio_ts();
		if (!generatedAudio_ts || in.getTimestamp() < generatedAudio_ts) {
			source.reset_audio_data(in.getTimestamp());
		} 
		buf_placement = ModernizedCProgram.get_buf_placement(audio, in.getTimestamp() - generatedAudio_ts) * ;
		if ((buf_placement + size) > (1000 * AUDIO_OUTPUT_FRAMES * /* do not allow the circular buffers to become too big */)) {
			return ;
		} 
		Object generatedAudio_input_buf = this.getAudio_input_buf();
		for ( i = 0;
		 i < channels; i++) {
			generatedAudio_input_buf[i].circlebuf_place(buf_placement, in.getData()[i], size);
			generatedAudio_input_buf[i].circlebuf_pop_back(NULL, generatedAudio_input_buf[i].getCirclebuf() - (buf_placement + size));
		}
		this.setLast_audio_input_buf_size(0);
	}
	public void source_output_audio_push_back(Object in) {
		 audio = ModernizedCProgram.obs.getAudio().getAudio();
		 channels = ModernizedCProgram.audio_output_get_channels(audio);
		 size = in.getFrames() * ;
		Object generatedAudio_input_buf = this.getAudio_input_buf();
		if ((generatedAudio_input_buf[0].getCirclebuf() + size) > (1000 * AUDIO_OUTPUT_FRAMES * /* do not allow the circular buffers to become too big */)) {
			return ;
		} 
		for ( i = 0;
		 i < channels; i++) {
			generatedAudio_input_buf[i].circlebuf_push_back(in.getData()[i], size);
		}
		this.setLast_audio_input_buf_size(/* reset audio input buffer size to ensure that audio doesn't get
			 * perpetually cut */0);
	}
	public Object source_muted(Object os_time) {
		Object generatedPush_to_mute_enabled = this.getPush_to_mute_enabled();
		Object generatedUser_push_to_mute_pressed = this.getUser_push_to_mute_pressed();
		Object generatedPush_to_mute_delay = this.getPush_to_mute_delay();
		if (generatedPush_to_mute_enabled && generatedUser_push_to_mute_pressed) {
			this.setPush_to_mute_stop_time(os_time + generatedPush_to_mute_delay * 1000000);
		} 
		Object generatedPush_to_talk_enabled = this.getPush_to_talk_enabled();
		Object generatedUser_push_to_talk_pressed = this.getUser_push_to_talk_pressed();
		Object generatedPush_to_talk_delay = this.getPush_to_talk_delay();
		if (generatedPush_to_talk_enabled && generatedUser_push_to_talk_pressed) {
			this.setPush_to_talk_stop_time(os_time + generatedPush_to_talk_delay * 1000000);
		} 
		Object generatedPush_to_mute_stop_time = this.getPush_to_mute_stop_time();
		 push_to_mute_active = generatedUser_push_to_mute_pressed || os_time < generatedPush_to_mute_stop_time;
		Object generatedPush_to_talk_stop_time = this.getPush_to_talk_stop_time();
		 push_to_talk_active = generatedUser_push_to_talk_pressed || os_time < generatedPush_to_talk_stop_time;
		Object generatedEnabled = this.getEnabled();
		Object generatedUser_muted = this.getUser_muted();
		return !generatedEnabled || generatedUser_muted || (generatedPush_to_mute_enabled && push_to_mute_active) || (generatedPush_to_talk_enabled && !push_to_talk_active);
	}
	public void source_output_audio_data(Object data) {
		 sample_rate = ModernizedCProgram.audio_output_get_sample_rate(ModernizedCProgram.obs.getAudio().getAudio());
		audio_data in = data;
		uint64_t diff = new uint64_t();
		uint64_t os_time = ModernizedCProgram.os_gettime_ns();
		int64_t sync_offset = new int64_t();
		 using_direct_ts = false;
		 push_back = false;
		Object generatedAudio_data = in.getAudio_data();
		if (ModernizedCProgram.uint64_diff(generatedAudio_data, os_time) < /* detects 'directly' set timestamps as long as they're within
			 * a certain threshold */-1024) {
			this.setTiming_adjust(0);
			this.setTiming_set(true);
			using_direct_ts = true;
		} 
		Object generatedTiming_set = this.getTiming_set();
		Object generatedNext_audio_ts_min = this.getNext_audio_ts_min();
		Object generatedAsync_unbuffered = this.getAsync_unbuffered();
		Object generatedAsync_decoupled = this.getAsync_decoupled();
		if (!generatedTiming_set) {
			source.reset_audio_timing(generatedAudio_data, os_time);
		}  else if (generatedNext_audio_ts_min != 0) {
			diff = ModernizedCProgram.uint64_diff(generatedNext_audio_ts_min, generatedAudio_data);
			if (diff > -1024 && !/* smooth audio if within threshold */using_direct_ts) {
				source.handle_ts_jump(generatedNext_audio_ts_min, generatedAudio_data, diff, os_time);
			}  else if (diff < -1024) {
				if (generatedAsync_unbuffered && generatedAsync_decoupled) {
					this.setTiming_adjust(os_time - generatedAudio_data);
				} 
				in.setAudio_data(generatedNext_audio_ts_min);
			} 
		} 
		this.setLast_audio_ts(generatedAudio_data);
		this.setNext_audio_ts_min(generatedAudio_data + ModernizedCProgram.conv_frames_to_time(sample_rate, generatedAudio_data));
		Object generatedTiming_adjust = this.getTiming_adjust();
		generatedAudio_data += generatedTiming_adjust;
		Object generatedAudio_buf_mutex = this.getAudio_buf_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedAudio_buf_mutex);
		Object generatedNext_audio_sys_ts_min = this.getNext_audio_sys_ts_min();
		if (generatedNext_audio_sys_ts_min == generatedAudio_data) {
			push_back = true;
		}  else if (generatedNext_audio_sys_ts_min) {
			diff = ModernizedCProgram.uint64_diff(generatedNext_audio_sys_ts_min, generatedAudio_data);
			if (diff < -1024) {
				push_back = true/* This typically only happens if used with async video when
						 * audio/video start transitioning in to a timestamp jump.
						 * Audio will typically have a timestamp jump, and then video
						 * will have a timestamp jump.  If that case is encountered,
						 * just clear the audio data in that small window and force a
						 * resync.  This handles all cases rather than just looping. */;
			}  else if (diff > -1024) {
				source.reset_audio_timing(data.getTimestamp(), os_time);
				in.setAudio_data(data.getTimestamp() + generatedTiming_adjust);
			} 
		} 
		Object generatedSync_offset = this.getSync_offset();
		sync_offset = generatedSync_offset;
		generatedAudio_data += sync_offset;
		Object generatedResample_offset = this.getResample_offset();
		generatedAudio_data -= generatedResample_offset;
		this.setNext_audio_sys_ts_min(generatedNext_audio_ts_min + generatedTiming_adjust);
		Object generatedLast_sync_offset = this.getLast_sync_offset();
		if (generatedLast_sync_offset != sync_offset) {
			if (generatedLast_sync_offset) {
				push_back = false;
			} 
			this.setLast_sync_offset(sync_offset);
		} 
		obs_monitoring_type generatedMonitoring_type = this.getMonitoring_type();
		Object generatedAudio_ts = this.getAudio_ts();
		if (generatedMonitoring_type != obs_monitoring_type.OBS_MONITORING_TYPE_MONITOR_ONLY) {
			if (push_back && generatedAudio_ts) {
				source.source_output_audio_push_back(in);
			} else {
					source.source_output_audio_place(in);
			} 
		} 
		ModernizedCProgram.pthread_mutex_unlock(generatedAudio_buf_mutex);
		source.source_signal_audio_data(data, source.source_muted(os_time));
	}
	public Object set_packed422_sizes(Object frame) {
		Object generatedAsync_convert_width = this.getAsync_convert_width();
		generatedAsync_convert_width[0] = frame.getWidth() / 2;
		Object generatedAsync_convert_height = this.getAsync_convert_height();
		generatedAsync_convert_height[0] = frame.getHeight();
		Object generatedAsync_texture_formats = this.getAsync_texture_formats();
		generatedAsync_texture_formats[0] = GS_BGRA;
		this.setAsync_channel_count(1);
		return true;
	}
	public Object set_packed444_alpha_sizes(Object frame) {
		Object generatedAsync_convert_width = this.getAsync_convert_width();
		generatedAsync_convert_width[0] = frame.getWidth();
		Object generatedAsync_convert_height = this.getAsync_convert_height();
		generatedAsync_convert_height[0] = frame.getHeight();
		Object generatedAsync_texture_formats = this.getAsync_texture_formats();
		generatedAsync_texture_formats[0] = GS_BGRA;
		this.setAsync_channel_count(1);
		return true;
	}
	public Object set_planar444_sizes(Object frame) {
		Object generatedAsync_convert_width = this.getAsync_convert_width();
		generatedAsync_convert_width[0] = frame.getWidth();
		generatedAsync_convert_width[1] = frame.getWidth();
		generatedAsync_convert_width[2] = frame.getWidth();
		Object generatedAsync_convert_height = this.getAsync_convert_height();
		generatedAsync_convert_height[0] = frame.getHeight();
		generatedAsync_convert_height[1] = frame.getHeight();
		generatedAsync_convert_height[2] = frame.getHeight();
		Object generatedAsync_texture_formats = this.getAsync_texture_formats();
		generatedAsync_texture_formats[0] = GS_R8;
		generatedAsync_texture_formats[1] = GS_R8;
		generatedAsync_texture_formats[2] = GS_R8;
		this.setAsync_channel_count(3);
		return true;
	}
	public Object set_planar444_alpha_sizes(Object frame) {
		Object generatedAsync_convert_width = this.getAsync_convert_width();
		generatedAsync_convert_width[0] = frame.getWidth();
		generatedAsync_convert_width[1] = frame.getWidth();
		generatedAsync_convert_width[2] = frame.getWidth();
		generatedAsync_convert_width[3] = frame.getWidth();
		Object generatedAsync_convert_height = this.getAsync_convert_height();
		generatedAsync_convert_height[0] = frame.getHeight();
		generatedAsync_convert_height[1] = frame.getHeight();
		generatedAsync_convert_height[2] = frame.getHeight();
		generatedAsync_convert_height[3] = frame.getHeight();
		Object generatedAsync_texture_formats = this.getAsync_texture_formats();
		generatedAsync_texture_formats[0] = GS_R8;
		generatedAsync_texture_formats[1] = GS_R8;
		generatedAsync_texture_formats[2] = GS_R8;
		generatedAsync_texture_formats[3] = GS_R8;
		this.setAsync_channel_count(4);
		return true;
	}
	public Object set_planar420_sizes(Object frame) {
		Object generatedAsync_convert_width = this.getAsync_convert_width();
		generatedAsync_convert_width[0] = frame.getWidth();
		generatedAsync_convert_width[1] = frame.getWidth() / 2;
		generatedAsync_convert_width[2] = frame.getWidth() / 2;
		Object generatedAsync_convert_height = this.getAsync_convert_height();
		generatedAsync_convert_height[0] = frame.getHeight();
		generatedAsync_convert_height[1] = frame.getHeight() / 2;
		generatedAsync_convert_height[2] = frame.getHeight() / 2;
		Object generatedAsync_texture_formats = this.getAsync_texture_formats();
		generatedAsync_texture_formats[0] = GS_R8;
		generatedAsync_texture_formats[1] = GS_R8;
		generatedAsync_texture_formats[2] = GS_R8;
		this.setAsync_channel_count(3);
		return true;
	}
	public Object set_planar420_alpha_sizes(Object frame) {
		Object generatedAsync_convert_width = this.getAsync_convert_width();
		generatedAsync_convert_width[0] = frame.getWidth();
		generatedAsync_convert_width[1] = frame.getWidth() / 2;
		generatedAsync_convert_width[2] = frame.getWidth() / 2;
		generatedAsync_convert_width[3] = frame.getWidth();
		Object generatedAsync_convert_height = this.getAsync_convert_height();
		generatedAsync_convert_height[0] = frame.getHeight();
		generatedAsync_convert_height[1] = frame.getHeight() / 2;
		generatedAsync_convert_height[2] = frame.getHeight() / 2;
		generatedAsync_convert_height[3] = frame.getHeight();
		Object generatedAsync_texture_formats = this.getAsync_texture_formats();
		generatedAsync_texture_formats[0] = GS_R8;
		generatedAsync_texture_formats[1] = GS_R8;
		generatedAsync_texture_formats[2] = GS_R8;
		generatedAsync_texture_formats[3] = GS_R8;
		this.setAsync_channel_count(4);
		return true;
	}
	public Object set_planar422_sizes(Object frame) {
		Object generatedAsync_convert_width = this.getAsync_convert_width();
		generatedAsync_convert_width[0] = frame.getWidth();
		generatedAsync_convert_width[1] = frame.getWidth() / 2;
		generatedAsync_convert_width[2] = frame.getWidth() / 2;
		Object generatedAsync_convert_height = this.getAsync_convert_height();
		generatedAsync_convert_height[0] = frame.getHeight();
		generatedAsync_convert_height[1] = frame.getHeight();
		generatedAsync_convert_height[2] = frame.getHeight();
		Object generatedAsync_texture_formats = this.getAsync_texture_formats();
		generatedAsync_texture_formats[0] = GS_R8;
		generatedAsync_texture_formats[1] = GS_R8;
		generatedAsync_texture_formats[2] = GS_R8;
		this.setAsync_channel_count(3);
		return true;
	}
	public Object set_planar422_alpha_sizes(Object frame) {
		Object generatedAsync_convert_width = this.getAsync_convert_width();
		generatedAsync_convert_width[0] = frame.getWidth();
		generatedAsync_convert_width[1] = frame.getWidth() / 2;
		generatedAsync_convert_width[2] = frame.getWidth() / 2;
		generatedAsync_convert_width[3] = frame.getWidth();
		Object generatedAsync_convert_height = this.getAsync_convert_height();
		generatedAsync_convert_height[0] = frame.getHeight();
		generatedAsync_convert_height[1] = frame.getHeight();
		generatedAsync_convert_height[2] = frame.getHeight();
		generatedAsync_convert_height[3] = frame.getHeight();
		Object generatedAsync_texture_formats = this.getAsync_texture_formats();
		generatedAsync_texture_formats[0] = GS_R8;
		generatedAsync_texture_formats[1] = GS_R8;
		generatedAsync_texture_formats[2] = GS_R8;
		generatedAsync_texture_formats[3] = GS_R8;
		this.setAsync_channel_count(4);
		return true;
	}
	public Object set_nv12_sizes(Object frame) {
		Object generatedAsync_convert_width = this.getAsync_convert_width();
		generatedAsync_convert_width[0] = frame.getWidth();
		generatedAsync_convert_width[1] = frame.getWidth() / 2;
		Object generatedAsync_convert_height = this.getAsync_convert_height();
		generatedAsync_convert_height[0] = frame.getHeight();
		generatedAsync_convert_height[1] = frame.getHeight() / 2;
		Object generatedAsync_texture_formats = this.getAsync_texture_formats();
		generatedAsync_texture_formats[0] = GS_R8;
		generatedAsync_texture_formats[1] = GS_R8G8;
		this.setAsync_channel_count(2);
		return true;
	}
	public Object set_y800_sizes(Object frame) {
		Object generatedAsync_convert_width = this.getAsync_convert_width();
		generatedAsync_convert_width[0] = frame.getWidth();
		Object generatedAsync_convert_height = this.getAsync_convert_height();
		generatedAsync_convert_height[0] = frame.getHeight();
		Object generatedAsync_texture_formats = this.getAsync_texture_formats();
		generatedAsync_texture_formats[0] = GS_R8;
		this.setAsync_channel_count(1);
		return true;
	}
	public Object set_rgb_limited_sizes(Object frame) {
		Object generatedAsync_convert_width = this.getAsync_convert_width();
		generatedAsync_convert_width[0] = frame.getWidth();
		Object generatedAsync_convert_height = this.getAsync_convert_height();
		generatedAsync_convert_height[0] = frame.getHeight();
		Object generatedAsync_texture_formats = this.getAsync_texture_formats();
		generatedAsync_texture_formats[0] = ModernizedCProgram.convert_video_format(frame.getFormat());
		this.setAsync_channel_count(1);
		return true;
	}
	public Object set_bgr3_sizes(Object frame) {
		Object generatedAsync_convert_width = this.getAsync_convert_width();
		generatedAsync_convert_width[0] = frame.getWidth() * 3;
		Object generatedAsync_convert_height = this.getAsync_convert_height();
		generatedAsync_convert_height[0] = frame.getHeight();
		Object generatedAsync_texture_formats = this.getAsync_texture_formats();
		generatedAsync_texture_formats[0] = GS_R8;
		this.setAsync_channel_count(1);
		return true;
	}
	public Object init_gpu_conversion(Object frame) {
		switch (ModernizedCProgram.get_convert_type(frame.getFormat(), frame.getFull_range())) {
		case convert_type.CONVERT_422_PACK:
				return source.set_packed422_sizes(frame);
		case convert_type.CONVERT_422:
				return source.set_planar422_sizes(frame);
		case convert_type.CONVERT_RGB_LIMITED:
				return source.set_rgb_limited_sizes(frame);
		case convert_type.CONVERT_420_A:
				return source.set_planar420_alpha_sizes(frame);
		case convert_type.CONVERT_420:
				return source.set_planar420_sizes(frame);
		case convert_type.CONVERT_444_A_PACK:
				return source.set_packed444_alpha_sizes(frame);
		case convert_type.CONVERT_422_A:
				return source.set_planar422_alpha_sizes(frame);
		case convert_type.CONVERT_BGR3:
				return source.set_bgr3_sizes(frame);
		case convert_type.CONVERT_444:
				return source.set_planar444_sizes(frame);
		case convert_type.CONVERT_NV12:
				return source.set_nv12_sizes(frame);
		case convert_type.CONVERT_800:
				return source.set_y800_sizes(frame);
		case convert_type.CONVERT_444_A:
				return source.set_planar444_alpha_sizes(frame);
		case convert_type.CONVERT_NONE:
				.assert(false && "No conversion requested");
				break;
		}
		return false;
	}
	public Object set_async_texture_size(Object frame) {
		convert_type cur = ModernizedCProgram.get_convert_type(frame.getFormat(), frame.getFull_range());
		Object generatedAsync_width = this.getAsync_width();
		Object generatedAsync_height = this.getAsync_height();
		video_format generatedAsync_format = this.getAsync_format();
		Object generatedAsync_full_range = this.getAsync_full_range();
		if (generatedAsync_width == frame.getWidth() && generatedAsync_height == frame.getHeight() && generatedAsync_format == frame.getFormat() && generatedAsync_full_range == frame.getFull_range()) {
			return true;
		} 
		this.setAsync_width(frame.getWidth());
		this.setAsync_height(frame.getHeight());
		this.setAsync_format(frame.getFormat());
		this.setAsync_full_range(frame.getFull_range());
		ModernizedCProgram.obs.getVideo().getGraphics().gs_enter_context();
		Object generatedAsync_textures = this.getAsync_textures();
		Object generatedAsync_prev_textures = this.getAsync_prev_textures();
		for ( c = 0;
		 c < MAX_AV_PLANES; c++) {
			ModernizedCProgram.gs_texture_destroy(generatedAsync_textures[c]);
			generatedAsync_textures[c] = NULL;
			ModernizedCProgram.gs_texture_destroy(generatedAsync_prev_textures[c]);
			generatedAsync_prev_textures[c] = NULL;
		}
		Object generatedAsync_texrender = this.getAsync_texrender();
		generatedAsync_texrender.gs_texrender_destroy();
		Object generatedAsync_prev_texrender = this.getAsync_prev_texrender();
		generatedAsync_prev_texrender.gs_texrender_destroy();
		this.setAsync_texrender(NULL);
		this.setAsync_prev_texrender(NULL);
		gs_color_format format = ModernizedCProgram.convert_video_format(frame.getFormat());
		 async_gpu_conversion = (convert_type.cur != convert_type.CONVERT_NONE) && source.init_gpu_conversion(frame);
		this.setAsync_gpu_conversion(async_gpu_conversion);
		gs_texture_render gs_texture_render = new gs_texture_render();
		int generatedAsync_channel_count = this.getAsync_channel_count();
		Object generatedAsync_convert_width = this.getAsync_convert_width();
		Object generatedAsync_convert_height = this.getAsync_convert_height();
		Object generatedAsync_texture_formats = this.getAsync_texture_formats();
		gs_texture gs_texture = new gs_texture();
		if (async_gpu_conversion) {
			this.setAsync_texrender(gs_texture_render.gs_texrender_create(format, GS_ZS_NONE));
			for (int c = 0;
			 c < generatedAsync_channel_count; ++c) {
				generatedAsync_textures[c] = gs_texture.gs_texture_create(generatedAsync_convert_width[c], generatedAsync_convert_height[c], generatedAsync_texture_formats[c], 1, NULL, GS_DYNAMIC);
			}
		} else {
				generatedAsync_textures[0] = gs_texture.gs_texture_create(frame.getWidth(), frame.getHeight(), format, 1, NULL, GS_DYNAMIC);
		} 
		if (ModernizedCProgram.deinterlacing_enabled(source)) {
			source.set_deinterlace_texture_size();
		} 
		ModernizedCProgram.gs_leave_context();
		return generatedAsync_textures[0] != NULL;
	}
	public Object update_async_texrender(Object frame, Object tex, Object texrender) {
		.GS_DEBUG_MARKER_BEGIN(GS_DEBUG_COLOR_CONVERT_FORMAT, "Convert Format");
		texrender.gs_texrender_reset();
		ModernizedCProgram.upload_raw_frame(tex, frame);
		Object generatedAsync_width = this.getAsync_width();
		uint32_t cx = generatedAsync_width;
		Object generatedAsync_height = this.getAsync_height();
		uint32_t cy = generatedAsync_height;
		 conv = ModernizedCProgram.obs.getVideo().getConversion_effect();
		byte tech_name = ModernizedCProgram.select_conversion_technique(frame.getFormat(), frame.getFull_range());
		gs_effect_technique gs_effect_technique = new gs_effect_technique();
		 tech = gs_effect_technique.gs_effect_get_technique(conv, tech_name);
		 success = texrender.gs_texrender_begin(cx, cy);
		gs_effect_param gs_effect_param = new gs_effect_param();
		if (success) {
			ModernizedCProgram.gs_enable_blending(false);
			tech.gs_technique_begin();
			tech.gs_technique_begin_pass(0);
			if (tex[0]) {
				ModernizedCProgram.gs_effect_set_texture(gs_effect_param.gs_effect_get_param_by_name(conv, "image"), tex[0]);
			} 
			if (tex[1]) {
				ModernizedCProgram.gs_effect_set_texture(gs_effect_param.gs_effect_get_param_by_name(conv, "image1"), tex[1]);
			} 
			if (tex[2]) {
				ModernizedCProgram.gs_effect_set_texture(gs_effect_param.gs_effect_get_param_by_name(conv, "image2"), tex[2]);
			} 
			if (tex[3]) {
				ModernizedCProgram.gs_effect_set_texture(gs_effect_param.gs_effect_get_param_by_name(conv, "image3"), tex[3]);
			} 
			ModernizedCProgram.set_eparam(conv, "width", (double)cx);
			ModernizedCProgram.set_eparam(conv, "height", (double)cy);
			ModernizedCProgram.set_eparam(conv, "width_d2", (double)cx * 0.5);
			ModernizedCProgram.set_eparam(conv, "height_d2", (double)cy * 0.5);
			ModernizedCProgram.set_eparam(conv, "width_x2_i", 0.5 / (double)cx);
			vec4 vec0 = new vec4();
			vec4 vec1 = new vec4();
			vec4 vec2 = new vec4();
			vec0.vec4_set(frame.getColor_matrix()[0], frame.getColor_matrix()[1], frame.getColor_matrix()[2], frame.getColor_matrix()[3]);
			vec1.vec4_set(frame.getColor_matrix()[4], frame.getColor_matrix()[5], frame.getColor_matrix()[6], frame.getColor_matrix()[7]);
			vec2.vec4_set(frame.getColor_matrix()[8], frame.getColor_matrix()[9], frame.getColor_matrix()[10], frame.getColor_matrix()[11]);
			gs_effect_param.gs_effect_get_param_by_name(conv, "color_vec0").gs_effect_set_vec4(vec0);
			gs_effect_param.gs_effect_get_param_by_name(conv, "color_vec1").gs_effect_set_vec4(vec1);
			gs_effect_param.gs_effect_get_param_by_name(conv, "color_vec2").gs_effect_set_vec4(vec2);
			if (!frame.getFull_range()) {
				 min_param = gs_effect_param.gs_effect_get_param_by_name(conv, "color_range_min");
				min_param.gs_effect_set_val(frame.getColor_range_min(),  * 3);
				 max_param = gs_effect_param.gs_effect_get_param_by_name(conv, "color_range_max");
				max_param.gs_effect_set_val(frame.getColor_range_max(),  * 3);
			} 
			ModernizedCProgram.gs_draw(GS_TRIS, 0, 3);
			tech.gs_technique_end_pass();
			tech.gs_technique_end();
			ModernizedCProgram.gs_enable_blending(true);
			texrender.gs_texrender_end();
		} 
		.GS_DEBUG_MARKER_END();
		return success;
	}
	public Object update_async_texture(Object frame, Object tex, Object texrender) {
		[] tex3 = new []{tex, NULL, NULL, NULL, NULL, NULL, NULL, NULL};
		return source.update_async_textures(frame, tex3, texrender);
	}
	public Object update_async_textures(Object frame, Object tex, Object texrender) {
		convert_type type;
		this.setAsync_flip(frame.getFlip());
		Object generatedAsync_gpu_conversion = this.getAsync_gpu_conversion();
		if (generatedAsync_gpu_conversion && texrender) {
			return source.update_async_texrender(frame, tex, texrender);
		} 
		convert_type.type = ModernizedCProgram.get_convert_type(frame.getFormat(), frame.getFull_range());
		if (convert_type.type == convert_type.CONVERT_NONE) {
			tex[0].gs_texture_set_image(frame.getData()[0], frame.getLinesize()[0], false);
			return true;
		} 
		return false;
	}
	public void obs_source_draw_texture(Object effect) {
		Object generatedAsync_textures = this.getAsync_textures();
		 tex = generatedAsync_textures[0];
		 param = new ();
		Object generatedAsync_texrender = this.getAsync_texrender();
		gs_texture gs_texture = new gs_texture();
		if (generatedAsync_texrender) {
			tex = gs_texture.gs_texrender_get_texture(generatedAsync_texrender);
		} 
		gs_effect_param gs_effect_param = new gs_effect_param();
		param = gs_effect_param.gs_effect_get_param_by_name(effect, "image");
		ModernizedCProgram.gs_effect_set_texture(param, tex);
		Object generatedAsync_flip = this.getAsync_flip();
		tex.gs_draw_sprite(generatedAsync_flip ? GS_FLIP_V : 0, 0, 0);
	}
	public void obs_source_draw_async_texture() {
		gs_effect gs_effect = new gs_effect();
		 effect = gs_effect.gs_get_effect();
		 def_draw = (!effect);
		 tech = NULL;
		gs_effect_technique gs_effect_technique = new gs_effect_technique();
		if (def_draw) {
			effect = ModernizedCProgram.obs_get_base_effect(obs_base_effect.OBS_EFFECT_DEFAULT);
			tech = gs_effect_technique.gs_effect_get_technique(effect, "Draw");
			tech.gs_technique_begin();
			tech.gs_technique_begin_pass(0);
		} 
		source.obs_source_draw_texture(effect);
		if (def_draw) {
			tech.gs_technique_end_pass();
			tech.gs_technique_end();
		} 
	}
	public void recreate_async_texture(gs_color_format format) {
		Object generatedAsync_textures = this.getAsync_textures();
		uint32_t cx = ModernizedCProgram.gs_texture_get_width(generatedAsync_textures[0]);
		uint32_t cy = ModernizedCProgram.gs_texture_get_height(generatedAsync_textures[0]);
		ModernizedCProgram.gs_texture_destroy(generatedAsync_textures[0]);
		gs_texture gs_texture = new gs_texture();
		generatedAsync_textures[0] = gs_texture.gs_texture_create(cx, cy, gs_color_format.format, 1, NULL, GS_DYNAMIC);
	}
	public void obs_source_update_async_video() {
		Object generatedAsync_rendered = this.getAsync_rendered();
		obs_source_frame obs_source_frame = new obs_source_frame();
		Object generatedAsync_decoupled = this.getAsync_decoupled();
		Object generatedAsync_unbuffered = this.getAsync_unbuffered();
		Object generatedTimestamp = frame.getTimestamp();
		Object generatedAsync_update_texture = this.getAsync_update_texture();
		Object generatedAsync_textures = this.getAsync_textures();
		Object generatedAsync_texrender = this.getAsync_texrender();
		if (!generatedAsync_rendered) {
			obs_source_frame frame = obs_source_frame.obs_source_get_frame(source);
			if (frame) {
				frame = frame.filter_async_video(source);
			} 
			this.setAsync_rendered(true);
			if (frame) {
				ModernizedCProgram.check_to_swap_bgrx_bgra(source, frame);
				if (!generatedAsync_decoupled || !generatedAsync_unbuffered) {
					this.setTiming_adjust(ModernizedCProgram.obs.getVideo().getVideo_time() - generatedTimestamp);
					this.setTiming_set(true);
				} 
				if (generatedAsync_update_texture) {
					source.update_async_textures(frame, generatedAsync_textures, generatedAsync_texrender);
					this.setAsync_update_texture(false);
				} 
				ModernizedCProgram.obs_source_release_frame(source, frame);
			} 
		} 
	}
	public void obs_source_render_async_video() {
		Object generatedAsync_textures = this.getAsync_textures();
		Object generatedAsync_active = this.getAsync_active();
		if (generatedAsync_textures[0] && generatedAsync_active) {
			source.obs_source_draw_async_texture();
		} 
	}
	public void obs_source_render_filters() {
		obs_source_t first_filter = new obs_source_t();
		Object generatedFilter_mutex = this.getFilter_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedFilter_mutex);
		Object generatedFilters = this.getFilters();
		first_filter = generatedFilters.getArray()[0];
		first_filter.obs_source_addref();
		ModernizedCProgram.pthread_mutex_unlock(generatedFilter_mutex);
		this.setRendering_filter(true);
		first_filter.obs_source_video_render();
		this.setRendering_filter(false);
		first_filter.obs_source_release();
	}
	public void obs_source_default_render() {
		 effect = ModernizedCProgram.obs.getVideo().getDefault_effect();
		gs_effect_technique gs_effect_technique = new gs_effect_technique();
		 tech = gs_effect_technique.gs_effect_get_technique(effect, "Draw");
		 passes = new ();
		 i = new ();
		passes = tech.gs_technique_begin();
		obs_context_data generatedContext = this.getContext();
		Object generatedData = generatedContext.getData();
		for (i = 0; i < passes; i++) {
			tech.gs_technique_begin_pass(i);
			if (generatedData) {
				.UNRECOGNIZEDFUNCTIONNAME(generatedData, effect);
			} 
			tech.gs_technique_end_pass();
		}
		tech.gs_technique_end();
	}
	public void obs_source_main_render() {
		obs_source_info generatedInfo = this.getInfo();
		Object generatedOutput_flags = generatedInfo.getOutput_flags();
		uint32_t flags = generatedOutput_flags;
		 custom_draw = (flags & (1 << 3)) != 0;
		obs_source generatedFilter_parent = this.getFilter_parent();
		Object generatedFilters = this.getFilters();
		 default_effect = !generatedFilter_parent && generatedFilters.getNum() == 0 && !custom_draw;
		obs_context_data generatedContext = this.getContext();
		Object generatedData = generatedContext.getData();
		gs_effect gs_effect = new gs_effect();
		if (default_effect) {
			source.obs_source_default_render();
		}  else if (generatedData) {
			.UNRECOGNIZEDFUNCTIONNAME(generatedData, custom_draw ? NULL : gs_effect.gs_get_effect());
		} 
	}
	public void obs_source_video_render() {
		if (!ModernizedCProgram.obs_object_valid(source, "obs_source_video_render", "source")) {
			return ;
		} 
		source.obs_source_addref();
		source.render_video();
		source.obs_source_release();
	}
	public Object get_recurse_width() {
		uint32_t width = new uint32_t();
		Object generatedFilter_mutex = this.getFilter_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedFilter_mutex);
		Object generatedFilters = this.getFilters();
		width = (generatedFilters.getNum()) ? ModernizedCProgram.get_base_width(generatedFilters.getArray()[0]) : ModernizedCProgram.get_base_width(source);
		ModernizedCProgram.pthread_mutex_unlock(generatedFilter_mutex);
		return width;
	}
	public Object get_recurse_height() {
		uint32_t height = new uint32_t();
		Object generatedFilter_mutex = this.getFilter_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedFilter_mutex);
		Object generatedFilters = this.getFilters();
		height = (generatedFilters.getNum()) ? ModernizedCProgram.get_base_height(generatedFilters.getArray()[0]) : ModernizedCProgram.get_base_height(source);
		ModernizedCProgram.pthread_mutex_unlock(generatedFilter_mutex);
		return height;
	}
	public Object obs_source_get_width() {
		if (!ModernizedCProgram.data_valid(source, "obs_source_get_width")) {
			return 0;
		} 
		obs_source_info generatedInfo = this.getInfo();
		obs_source_type generatedType = generatedInfo.getType();
		return (generatedType != obs_source_type.OBS_SOURCE_TYPE_FILTER) ? source.get_recurse_width() : ModernizedCProgram.get_base_width(source);
	}
	public Object obs_source_get_height() {
		if (!ModernizedCProgram.data_valid(source, "obs_source_get_height")) {
			return 0;
		} 
		obs_source_info generatedInfo = this.getInfo();
		obs_source_type generatedType = generatedInfo.getType();
		return (generatedType != obs_source_type.OBS_SOURCE_TYPE_FILTER) ? source.get_recurse_height() : ModernizedCProgram.get_base_height(source);
	}
	public Object obs_source_get_base_width() {
		if (!ModernizedCProgram.data_valid(source, "obs_source_get_base_width")) {
			return 0;
		} 
		return ModernizedCProgram.get_base_width(source);
	}
	public Object obs_source_get_base_height() {
		if (!ModernizedCProgram.data_valid(source, "obs_source_get_base_height")) {
			return 0;
		} 
		return ModernizedCProgram.get_base_height(source);
	}
	public obs_source obs_filter_get_parent(Object filter) {
		return ModernizedCProgram.obs_object_valid(filter, "obs_filter_get_parent", "filter") ? filter.getFilter_parent() : NULL;
	}
	public obs_source obs_filter_get_target(Object filter) {
		return ModernizedCProgram.obs_object_valid(filter, "obs_filter_get_target", "filter") ? filter.getFilter_target() : NULL;
	}
	public Object filter_compatible(obs_source filter) {
		obs_source_info generatedInfo = this.getInfo();
		Object generatedOutput_flags = generatedInfo.getOutput_flags();
		uint32_t s_caps = generatedOutput_flags;
		uint32_t f_caps = generatedOutput_flags;
		if ((f_caps & (1 << 1)) != 0 && (f_caps & (1 << 0)) == 0) {
			f_caps &=  ~(1 << 2);
		} 
		return (s_caps & f_caps) == f_caps;
	}
	public void obs_source_filter_add(obs_source filter) {
		calldata cd = new calldata();
		uint8_t[] stack = new uint8_t();
		if (!ModernizedCProgram.obs_object_valid(source, "obs_source_filter_add", "source")) {
			return ;
		} 
		if (!ModernizedCProgram.obs_object_valid(filter, "obs_source_filter_add", "filter")) {
			return ;
		} 
		Object generatedFilter_mutex = this.getFilter_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedFilter_mutex);
		Object generatedFilters = this.getFilters();
		if (.da_find(generatedFilters, filter, 0) != DARRAY_INVALID) {
			ModernizedCProgram.blog(LOG_WARNING, "Tried to add a filter that was already present on the source");
			ModernizedCProgram.pthread_mutex_unlock(generatedFilter_mutex);
			return ;
		} 
		if (!source.filter_compatible(filter)) {
			ModernizedCProgram.pthread_mutex_unlock(generatedFilter_mutex);
			return ;
		} 
		filter.obs_source_addref();
		filter.setFilter_parent(source);
		filter.setFilter_target(!generatedFilters.getNum() ? source : generatedFilters.getArray()[0]);
		.da_insert(generatedFilters, 0, filter);
		ModernizedCProgram.pthread_mutex_unlock(generatedFilter_mutex);
		cd.calldata_init_fixed(stack, );
		cd.calldata_set_ptr("source", source);
		cd.calldata_set_ptr("filter", filter);
		obs_context_data generatedContext = this.getContext();
		Object generatedSignals = generatedContext.getSignals();
		.signal_handler_signal(generatedSignals, "filter_add", cd);
		Byte generatedName = generatedContext.getName();
		obs_source_info generatedInfo = filter.getInfo();
		Object generatedId = generatedInfo.getId();
		ModernizedCProgram.blog(LOG_DEBUG, "- filter '%s' (%s) added to source '%s'", generatedName, generatedId, generatedName);
	}
	public Object obs_source_filter_remove_refless(obs_source filter) {
		calldata cd = new calldata();
		uint8_t[] stack = new uint8_t();
		 idx = new ();
		Object generatedFilter_mutex = this.getFilter_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedFilter_mutex);
		Object generatedFilters = this.getFilters();
		idx = .da_find(generatedFilters, filter, 0);
		if (idx == DARRAY_INVALID) {
			ModernizedCProgram.pthread_mutex_unlock(generatedFilter_mutex);
			return false;
		} 
		obs_source generatedFilter_target = filter.getFilter_target();
		if (idx > 0) {
			obs_source_t prev = generatedFilters.getArray()[idx - 1];
			prev.setFilter_target(generatedFilter_target);
		} 
		.da_erase(generatedFilters, idx);
		ModernizedCProgram.pthread_mutex_unlock(generatedFilter_mutex);
		cd.calldata_init_fixed(stack, );
		cd.calldata_set_ptr("source", source);
		cd.calldata_set_ptr("filter", filter);
		obs_context_data generatedContext = this.getContext();
		Object generatedSignals = generatedContext.getSignals();
		.signal_handler_signal(generatedSignals, "filter_remove", cd);
		Byte generatedName = generatedContext.getName();
		obs_source_info generatedInfo = filter.getInfo();
		Object generatedId = generatedInfo.getId();
		ModernizedCProgram.blog(LOG_DEBUG, "- filter '%s' (%s) removed from source '%s'", generatedName, generatedId, generatedName);
		Object generatedFilter_remove = generatedInfo.getFilter_remove();
		Object generatedData = generatedContext.getData();
		obs_source generatedFilter_parent = filter.getFilter_parent();
		if (generatedFilter_remove) {
			.UNRECOGNIZEDFUNCTIONNAME(generatedData, generatedFilter_parent);
		} 
		filter.setFilter_parent(NULL);
		filter.setFilter_target(NULL);
		return true;
	}
	public void obs_source_filter_remove(obs_source filter) {
		if (!ModernizedCProgram.obs_object_valid(source, "obs_source_filter_remove", "source")) {
			return ;
		} 
		if (!ModernizedCProgram.obs_object_valid(filter, "obs_source_filter_remove", "filter")) {
			return ;
		} 
		if (source.obs_source_filter_remove_refless(filter)) {
			filter.obs_source_release();
		} 
	}
	public Object find_next_filter(obs_source filter, Object cur_idx) {
		obs_source_info generatedInfo = filter.getInfo();
		Object generatedOutput_flags = generatedInfo.getOutput_flags();
		 curAsync = (generatedOutput_flags & (1 << 2)) != 0;
		 nextAsync = new ();
		obs_source_t next = new obs_source_t();
		Object generatedFilters = this.getFilters();
		if (cur_idx == generatedFilters.getNum() - 1) {
			return DARRAY_INVALID;
		} 
		next = generatedFilters.getArray()[cur_idx + 1];
		nextAsync = (generatedOutput_flags & (1 << 2));
		if (nextAsync == curAsync) {
			return cur_idx + 1;
		} else {
				return source.find_next_filter(filter, cur_idx + 1);
		} 
	}
	public Object find_prev_filter(obs_source filter, Object cur_idx) {
		obs_source_info generatedInfo = filter.getInfo();
		Object generatedOutput_flags = generatedInfo.getOutput_flags();
		 curAsync = (generatedOutput_flags & (1 << 2)) != 0;
		 prevAsync = new ();
		obs_source_t prev = new obs_source_t();
		if (cur_idx == 0) {
			return DARRAY_INVALID;
		} 
		Object generatedFilters = this.getFilters();
		prev = generatedFilters.getArray()[cur_idx - 1];
		prevAsync = (generatedOutput_flags & (1 << 2));
		if (prevAsync == curAsync) {
			return cur_idx - 1;
		} else {
				return source.find_prev_filter(filter, cur_idx - 1);
		} 
	}
	/* moves filters above/below matching filter types */
	public Object move_filter_dir(obs_source filter, obs_order_movement movement) {
		 idx = new ();
		Object generatedFilters = this.getFilters();
		idx = .da_find(generatedFilters, filter, 0);
		if (idx == DARRAY_INVALID) {
			return false;
		} 
		if (obs_order_movement.movement == obs_order_movement.OBS_ORDER_MOVE_UP) {
			 next_id = source.find_next_filter(filter, idx);
			if (next_id == DARRAY_INVALID) {
				return false;
			} 
			.da_move_item(generatedFilters, idx, next_id);
		}  else if (obs_order_movement.movement == obs_order_movement.OBS_ORDER_MOVE_DOWN) {
			 prev_id = source.find_prev_filter(filter, idx);
			if (prev_id == DARRAY_INVALID) {
				return false;
			} 
			.da_move_item(generatedFilters, idx, prev_id);
		}  else if (obs_order_movement.movement == obs_order_movement.OBS_ORDER_MOVE_TOP) {
			if (idx == generatedFilters.getNum() - 1) {
				return false;
			} 
			.da_move_item(generatedFilters, idx, generatedFilters.getNum() - 1);
		}  else if (obs_order_movement.movement == obs_order_movement.OBS_ORDER_MOVE_BOTTOM) {
			if (idx == 0) {
				return false;
			} 
			.da_move_item(generatedFilters, idx, 0);
		} 
		for ( i = 0;
		 i < generatedFilters.getNum(); /* reorder filter targets, not the nicest way of dealing with things */i++) {
			obs_source_t next_filter = (i == generatedFilters.getNum() - 1) ? source : generatedFilters.getArray()[i + 1];
			generatedFilters.getArray()[i].setFilter_target(next_filter);
		}
		return true;
	}
	public void obs_source_filter_set_order(obs_source filter, obs_order_movement movement) {
		 success = new ();
		if (!ModernizedCProgram.obs_object_valid(source, "obs_source_filter_set_order", "source")) {
			return ;
		} 
		if (!ModernizedCProgram.obs_object_valid(filter, "obs_source_filter_set_order", "filter")) {
			return ;
		} 
		Object generatedFilter_mutex = this.getFilter_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedFilter_mutex);
		success = source.move_filter_dir(filter, obs_order_movement.movement);
		ModernizedCProgram.pthread_mutex_unlock(generatedFilter_mutex);
		if (success) {
			source.obs_source_dosignal(NULL, "reorder_filters");
		} 
	}
	public Object async_texture_changed(Object frame) {
		convert_type prev;
		convert_type cur;
		video_format generatedAsync_cache_format = this.getAsync_cache_format();
		Object generatedAsync_cache_full_range = this.getAsync_cache_full_range();
		convert_type.prev = ModernizedCProgram.get_convert_type(generatedAsync_cache_format, generatedAsync_cache_full_range);
		convert_type.cur = ModernizedCProgram.get_convert_type(frame.getFormat(), frame.getFull_range());
		Object generatedAsync_cache_width = this.getAsync_cache_width();
		Object generatedAsync_cache_height = this.getAsync_cache_height();
		return generatedAsync_cache_width != frame.getWidth() || generatedAsync_cache_height != frame.getHeight() || convert_type.prev != convert_type.cur;
	}
	public void free_async_cache() {
		Object generatedAsync_cache = this.getAsync_cache();
		for ( i = 0;
		 i < generatedAsync_cache.getNum(); i++) {
			generatedAsync_cache.getArray()[i].getFrame().obs_source_frame_decref();
		}
		.da_resize(generatedAsync_cache, 0);
		Object generatedAsync_frames = this.getAsync_frames();
		.da_resize(generatedAsync_frames, 0);
		this.setCur_async_frame(NULL);
		this.setPrev_async_frame(NULL);
	}
	/* frees frame allocations if they haven't been used for a specific period
	 * of time */
	public void clean_cache() {
		Object generatedAsync_cache = this.getAsync_cache();
		Object generatedUsed = af.getUsed();
		long generatedUnused_count = af.getUnused_count();
		obs_source_frame generatedFrame = af.getFrame();
		for ( i = generatedAsync_cache.getNum();
		 i > 0; i--) {
			async_frame af = generatedAsync_cache.getArray()[i - 1];
			if (!generatedUsed) {
				if (++generatedUnused_count == 5) {
					generatedFrame.obs_source_frame_destroy();
					.da_erase(generatedAsync_cache, i - 1);
				} 
			} 
		}
	}
	public void obs_source_output_video_internal(Object frame) {
		if (!ModernizedCProgram.obs_object_valid(source, "obs_source_output_video", "source")) {
			return ;
		} 
		if (!frame) {
			this.setAsync_active(false);
			return ;
		} 
		obs_source_frame obs_source_frame = new obs_source_frame();
		obs_source_frame output = !!frame ? obs_source_frame.cache_video(source, frame) : NULL;
		Object generatedAsync_mutex = this.getAsync_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedAsync_mutex);
		Object generatedRefs = output.getRefs();
		Object generatedAsync_frames = this.getAsync_frames();
		if (output) {
			if (ModernizedCProgram.os_atomic_dec_long(generatedRefs) == 0) {
				output.obs_source_frame_destroy();
				output = NULL;
			} else {
					.da_push_back(generatedAsync_frames, output);
					this.setAsync_active(true);
			} 
		} 
		ModernizedCProgram.pthread_mutex_unlock(generatedAsync_mutex);
	}
	public void obs_source_output_video(Object frame) {
		if (!frame) {
			source.obs_source_output_video_internal(NULL);
			return ;
		} 
		obs_source_frame new_frame = frame;
		Object generatedFull_range = new_frame.getFull_range();
		new_frame.setFull_range(ModernizedCProgram.format_is_yuv(frame.getFormat()) ? generatedFull_range : true);
		source.obs_source_output_video_internal(new_frame);
	}
	public void obs_source_output_video2(Object frame) {
		if (!frame) {
			source.obs_source_output_video_internal(NULL);
			return ;
		} 
		obs_source_frame new_frame = new obs_source_frame();
		video_range_type range = ModernizedCProgram.resolve_video_range(frame.getFormat(), frame.getRange());
		Object generatedData = new_frame.getData();
		Object generatedLinesize = new_frame.getLinesize();
		for ( i = 0;
		 i < MAX_AV_PLANES; i++) {
			generatedData[i] = generatedData[i];
			generatedLinesize[i] = generatedLinesize[i];
		}
		new_frame.setWidth(frame.getWidth());
		new_frame.setHeight(frame.getHeight());
		new_frame.setTimestamp(frame.getTimestamp());
		new_frame.setFormat(frame.getFormat());
		new_frame.setFull_range(video_range_type.range == VIDEO_RANGE_FULL);
		new_frame.setFlip(frame.getFlip());
		Object generatedColor_matrix = new_frame.getColor_matrix();
		.memcpy(generatedColor_matrix, generatedColor_matrix, );
		Object generatedColor_range_min = new_frame.getColor_range_min();
		.memcpy(generatedColor_range_min, generatedColor_range_min, );
		Object generatedColor_range_max = new_frame.getColor_range_max();
		.memcpy(generatedColor_range_max, generatedColor_range_max, );
		source.obs_source_output_video_internal(new_frame);
	}
	public Object preload_frame_changed(Object in) {
		obs_source_frame generatedAsync_preload_frame = this.getAsync_preload_frame();
		if (!generatedAsync_preload_frame) {
			return true;
		} 
		Object generatedWidth = generatedAsync_preload_frame.getWidth();
		Object generatedHeight = generatedAsync_preload_frame.getHeight();
		video_format generatedFormat = generatedAsync_preload_frame.getFormat();
		return in.getWidth() != generatedWidth || in.getHeight() != generatedHeight || in.getFormat() != generatedFormat;
	}
	public void obs_source_preload_video_internal(Object frame) {
		if (!ModernizedCProgram.obs_object_valid(source, "obs_source_preload_video", "source")) {
			return ;
		} 
		if (!frame) {
			return ;
		} 
		ModernizedCProgram.obs_enter_graphics();
		obs_source_frame generatedAsync_preload_frame = this.getAsync_preload_frame();
		obs_source_frame obs_source_frame = new obs_source_frame();
		if (source.preload_frame_changed(frame)) {
			generatedAsync_preload_frame.obs_source_frame_destroy();
			this.setAsync_preload_frame(obs_source_frame.obs_source_frame_create(frame.getFormat(), frame.getWidth(), frame.getHeight()));
		} 
		generatedAsync_preload_frame.copy_frame_data(frame);
		source.set_async_texture_size(generatedAsync_preload_frame);
		Object generatedAsync_textures = this.getAsync_textures();
		Object generatedAsync_texrender = this.getAsync_texrender();
		source.update_async_textures(generatedAsync_preload_frame, generatedAsync_textures, generatedAsync_texrender);
		this.setLast_frame_ts(frame.getTimestamp());
		ModernizedCProgram.obs_leave_graphics();
	}
	public void obs_source_preload_video(Object frame) {
		if (!frame) {
			source.obs_source_preload_video_internal(NULL);
			return ;
		} 
		obs_source_frame new_frame = frame;
		Object generatedFull_range = new_frame.getFull_range();
		new_frame.setFull_range(ModernizedCProgram.format_is_yuv(frame.getFormat()) ? generatedFull_range : true);
		source.obs_source_preload_video_internal(new_frame);
	}
	public void obs_source_preload_video2(Object frame) {
		if (!frame) {
			source.obs_source_preload_video_internal(NULL);
			return ;
		} 
		obs_source_frame new_frame = new obs_source_frame();
		video_range_type range = ModernizedCProgram.resolve_video_range(frame.getFormat(), frame.getRange());
		Object generatedData = new_frame.getData();
		Object generatedLinesize = new_frame.getLinesize();
		for ( i = 0;
		 i < MAX_AV_PLANES; i++) {
			generatedData[i] = generatedData[i];
			generatedLinesize[i] = generatedLinesize[i];
		}
		new_frame.setWidth(frame.getWidth());
		new_frame.setHeight(frame.getHeight());
		new_frame.setTimestamp(frame.getTimestamp());
		new_frame.setFormat(frame.getFormat());
		new_frame.setFull_range(video_range_type.range == VIDEO_RANGE_FULL);
		new_frame.setFlip(frame.getFlip());
		Object generatedColor_matrix = new_frame.getColor_matrix();
		.memcpy(generatedColor_matrix, generatedColor_matrix, );
		Object generatedColor_range_min = new_frame.getColor_range_min();
		.memcpy(generatedColor_range_min, generatedColor_range_min, );
		Object generatedColor_range_max = new_frame.getColor_range_max();
		.memcpy(generatedColor_range_max, generatedColor_range_max, );
		source.obs_source_preload_video_internal(new_frame);
	}
	public void obs_source_show_preloaded_video() {
		uint64_t sys_ts = new uint64_t();
		if (!ModernizedCProgram.obs_object_valid(source, "obs_source_show_preloaded_video", "source")) {
			return ;
		} 
		this.setAsync_active(true);
		Object generatedAudio_buf_mutex = this.getAudio_buf_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedAudio_buf_mutex);
		obs_monitoring_type generatedMonitoring_type = this.getMonitoring_type();
		sys_ts = (generatedMonitoring_type != obs_monitoring_type.OBS_MONITORING_TYPE_MONITOR_ONLY) ? ModernizedCProgram.os_gettime_ns() : 0;
		Object generatedLast_frame_ts = this.getLast_frame_ts();
		source.reset_audio_timing(generatedLast_frame_ts, sys_ts);
		source.reset_audio_data(sys_ts);
		ModernizedCProgram.pthread_mutex_unlock(generatedAudio_buf_mutex);
	}
	public void reset_resampler(Object audio) {
		audio_output_info obs_info = new audio_output_info();
		resample_info output_info = new resample_info();
		obs_info = ModernizedCProgram.audio_output_get_info(ModernizedCProgram.obs.getAudio().getAudio());
		output_info.setResample_info(obs_info.getAudio_output_info());
		output_info.setResample_info(obs_info.getAudio_output_info());
		output_info.setResample_info(obs_info.getAudio_output_info());
		resample_info generatedSample_info = this.getSample_info();
		generatedSample_info.setResample_info(audio.getFormat());
		generatedSample_info.setResample_info(audio.getSamples_per_sec());
		generatedSample_info.setResample_info(audio.getSpeakers());
		Object generatedResampler = this.getResampler();
		generatedResampler.audio_resampler_destroy();
		this.setResampler(NULL);
		this.setResample_offset(0);
		Object generatedResample_info = generatedSample_info.getResample_info();
		if (generatedResample_info == obs_info.getAudio_output_info() && generatedResample_info == obs_info.getAudio_output_info() && generatedResample_info == obs_info.getAudio_output_info()) {
			this.setAudio_failed(false);
			return ;
		} 
		audio_resampler audio_resampler = new audio_resampler();
		this.setResampler(audio_resampler.audio_resampler_create(output_info, generatedSample_info));
		this.setAudio_failed(generatedResampler == NULL);
		if (generatedResampler == NULL) {
			ModernizedCProgram.blog(LOG_ERROR, "creation of resampler failed");
		} 
	}
	public void copy_audio_data(Object data, Object frames, Object ts) {
		 planes = ModernizedCProgram.audio_output_get_planes(ModernizedCProgram.obs.getAudio().getAudio());
		 blocksize = ModernizedCProgram.audio_output_get_block_size(ModernizedCProgram.obs.getAudio().getAudio());
		 size = ()frames * blocksize;
		Object generatedAudio_storage_size = this.getAudio_storage_size();
		 resize = generatedAudio_storage_size < size;
		obs_audio_data generatedAudio_data = this.getAudio_data();
		generatedAudio_data.setFrames(frames);
		generatedAudio_data.setTimestamp(ts);
		Object generatedData = generatedAudio_data.getData();
		for ( i = 0;
		 i < planes; i++) {
			if (/* ensure audio storage capacity */resize) {
				ModernizedCProgram.bfree(generatedData[i]);
				generatedData[i] = ModernizedCProgram.bmalloc(size);
			} 
			.memcpy(generatedData[i], data[i], size);
		}
		if (resize) {
			this.setAudio_storage_size(size);
		} 
	}
	/* TODO: SSE optimization */
	public void downmix_to_mono_planar(Object frames) {
		 channels = ModernizedCProgram.audio_output_get_channels(ModernizedCProgram.obs.getAudio().getAudio());
		double channels_i = 1.0 / (double)channels;
		obs_audio_data generatedAudio_data = this.getAudio_data();
		Object generatedData = generatedAudio_data.getData();
		double data = (double)generatedData;
		for ( channel = 1;
		 channel < channels; channel++) {
			for (uint32_t frame = 0;
			 frame < frames; frame++) {
				data[0][frame] += data[channel][frame];
			}
		}
		for (uint32_t frame = 0;
		 frame < frames; frame++) {
			data[0][frame] *= channels_i;
		}
		for ( channel = 1;
		 channel < channels; channel++) {
			for (uint32_t frame = 0;
			 frame < frames; frame++) {
				data[channel][frame] = data[0][frame];
			}
		}
	}
	public void process_audio_balancing(Object frames, double balance, obs_balance_type type) {
		obs_audio_data generatedAudio_data = this.getAudio_data();
		Object generatedData = generatedAudio_data.getData();
		double data = (double)generatedData;
		switch (obs_balance_type.type) {
		case obs_balance_type.OBS_BALANCE_TYPE_LINEAR:
				for (uint32_t frame = 0;
				 frame < frames; frame++) {
					data[0][frame] = data[0][frame] * (1.0 - balance);
					data[1][frame] = data[1][frame] * balance;
				}
				break;
		case obs_balance_type.OBS_BALANCE_TYPE_SQUARE_LAW:
				for (uint32_t frame = 0;
				 frame < frames; frame++) {
					data[0][frame] = data[0][frame] * .sqrtf(1.0 - balance);
					data[1][frame] = data[1][frame] * .sqrtf(balance);
				}
				break;
		case obs_balance_type.OBS_BALANCE_TYPE_SINE_LAW:
				for (uint32_t frame = 0;
				 frame < frames; frame++) {
					data[0][frame] = data[0][frame] * .sinf((1.0 - balance) * (3.141592653589793 / 2.0));
					data[1][frame] = data[1][frame] * .sinf(balance * (3.141592653589793 / 2.0));
				}
				break;
		default:
				break;
		}
	}
	public void obs_source_output_audio(Object audio) {
		obs_audio_data output = new obs_audio_data();
		if (!ModernizedCProgram.obs_object_valid(source, "obs_source_output_audio", "source")) {
			return ;
		} 
		if (!ModernizedCProgram.obs_object_valid(audio, "obs_source_output_audio", "audio")) {
			return ;
		} 
		ModernizedCProgram.process_audio(source, audio);
		Object generatedFilter_mutex = this.getFilter_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedFilter_mutex);
		obs_audio_data generatedAudio_data = this.getAudio_data();
		output = generatedAudio_data.filter_async_audio(source);
		Object generatedData = output.getData();
		Object generatedFrames = output.getFrames();
		Object generatedTimestamp = output.getTimestamp();
		Object generatedAudio_mutex = this.getAudio_mutex();
		if (output) {
			audio_data data = new audio_data();
			for (int i = 0;
			 i < MAX_AV_PLANES; i++) {
				generatedAudio_data[i] = generatedData[i];
			}
			ModernizedCProgram.data.setAudio_data(generatedFrames);
			ModernizedCProgram.data.setAudio_data(generatedTimestamp);
			ModernizedCProgram.pthread_mutex_lock(generatedAudio_mutex);
			source.source_output_audio_data(ModernizedCProgram.data);
			ModernizedCProgram.pthread_mutex_unlock(generatedAudio_mutex);
		} 
		ModernizedCProgram.pthread_mutex_unlock(generatedFilter_mutex);
	}
	/* #define DEBUG_ASYNC_FRAMES 1 */
	public Object ready_async_frame(Object sys_time) {
		Object generatedAsync_frames = this.getAsync_frames();
		obs_source_frame next_frame = generatedAsync_frames.getArray()[0];
		obs_source_frame frame = NULL;
		Object generatedLast_sys_timestamp = this.getLast_sys_timestamp();
		uint64_t sys_offset = sys_time - generatedLast_sys_timestamp;
		Object generatedTimestamp = next_frame.getTimestamp();
		uint64_t frame_time = generatedTimestamp;
		uint64_t frame_offset = 0;
		Object generatedAsync_unbuffered = this.getAsync_unbuffered();
		if (generatedAsync_unbuffered) {
			while (generatedAsync_frames.getNum() > 1) {
				.da_erase(generatedAsync_frames, 0);
				ModernizedCProgram.remove_async_frame(source, next_frame);
				next_frame = generatedAsync_frames.getArray()[0];
			}
			this.setLast_frame_ts(generatedTimestamp);
			return true;
		} 
		Object generatedLast_frame_ts = this.getLast_frame_ts();
		if (ModernizedCProgram.frame_out_of_bounds(source, /* account for timestamp invalidation */frame_time)) {
			this.setLast_frame_ts(generatedTimestamp);
			return true;
		} else {
				frame_offset = frame_time - generatedLast_frame_ts;
				generatedLast_frame_ts += sys_offset;
		} 
		while (generatedLast_frame_ts > generatedTimestamp) {
			if ((generatedLast_frame_ts - generatedTimestamp) < 2000000) {
				break;
			} 
			if (frame) {
				.da_erase(generatedAsync_frames, 0);
			} 
			ModernizedCProgram.remove_async_frame(source, frame);
			if (generatedAsync_frames.getNum() == 1) {
				return true;
			} 
			frame = next_frame;
			next_frame = generatedAsync_frames.getArray()[1];
			if ((generatedTimestamp - frame_time) > /* more timestamp checking and compensating */-1024) {
				this.setLast_frame_ts(generatedTimestamp - frame_offset);
			} 
			frame_time = generatedTimestamp;
			frame_offset = frame_time - generatedLast_frame_ts;
		}
		return frame != NULL;
	}
	public void obs_source_set_name(Object name) {
		if (!ModernizedCProgram.obs_object_valid(source, "obs_source_set_name", "source")) {
			return ;
		} 
		obs_context_data generatedContext = this.getContext();
		Byte generatedName = generatedContext.getName();
		Object generatedPrivate = generatedContext.getPrivate();
		Object generatedSignals = generatedContext.getSignals();
		if (!name || !name || !generatedName || .strcmp(name, generatedName) != 0) {
			calldata data = new calldata();
			byte prev_name = ModernizedCProgram.bstrdup(generatedName);
			generatedContext.obs_context_data_setname(name);
			ModernizedCProgram.data.calldata_init();
			ModernizedCProgram.data.calldata_set_ptr("source", source);
			ModernizedCProgram.data.calldata_set_string("new_name", generatedName);
			ModernizedCProgram.data.calldata_set_string("prev_name", prev_name);
			if (!generatedPrivate) {
				.signal_handler_signal(ModernizedCProgram.obs.getSignals(), "source_rename", ModernizedCProgram.data);
			} 
			.signal_handler_signal(generatedSignals, "rename", ModernizedCProgram.data);
			ModernizedCProgram.data.calldata_free();
			ModernizedCProgram.bfree(prev_name);
		} 
	}
	public void render_filter_bypass(Object effect, Object tech_name) {
		gs_effect_technique gs_effect_technique = new gs_effect_technique();
		 tech = gs_effect_technique.gs_effect_get_technique(effect, tech_name);
		 passes = new ();
		 i = new ();
		passes = tech.gs_technique_begin();
		for (i = 0; i < passes; i++) {
			tech.gs_technique_begin_pass(i);
			target.obs_source_video_render();
			tech.gs_technique_end_pass();
		}
		tech.gs_technique_end();
	}
	public Object can_bypass(obs_source parent, Object parent_flags, obs_allow_direct_render allow_direct) {
		return (target == parent) && (obs_allow_direct_render.allow_direct == obs_allow_direct_render.OBS_ALLOW_DIRECT_RENDERING) && ((parent_flags & (1 << 3)) == 0) && ((parent_flags & (1 << 2)) == 0);
	}
	public Object obs_source_process_filter_begin(gs_color_format format, obs_allow_direct_render allow_direct) {
		obs_source_t target = new obs_source_t();
		obs_source_t parent = new obs_source_t();
		uint32_t parent_flags = new uint32_t();
		int cx;
		int cy;
		if (!ModernizedCProgram.obs_object_valid(filter, "obs_source_process_filter_begin", "filter")) {
			return false;
		} 
		obs_source obs_source = new obs_source();
		target = obs_source.obs_filter_get_target(filter);
		obs_source obs_source = new obs_source();
		parent = obs_source.obs_filter_get_parent(filter);
		obs_context_data generatedContext = this.getContext();
		Byte generatedName = generatedContext.getName();
		if (!target) {
			ModernizedCProgram.blog(LOG_INFO, "filter '%s' being processed with no target!", generatedName);
			return false;
		} 
		if (!parent) {
			ModernizedCProgram.blog(LOG_INFO, "filter '%s' being processed with no parent!", generatedName);
			return false;
		} 
		obs_source_info generatedInfo = parent.getInfo();
		Object generatedOutput_flags = generatedInfo.getOutput_flags();
		parent_flags = generatedOutput_flags;
		cx = ModernizedCProgram.get_base_width(target);
		cy = ModernizedCProgram.get_base_height(target);
		this.setAllow_direct(obs_allow_direct_render.allow_direct/* if the parent does not use any custom effects, and this is the last
			 * filter in the chain for the parent, then render the parent directly
			 * using the filter effect instead of rendering to texture to reduce
			 * the total number of passes */);
		if (target.can_bypass(parent, parent_flags, obs_allow_direct_render.allow_direct)) {
			return true;
		} 
		if (!cx || !cy) {
			filter.obs_source_skip_video_filter();
			return false;
		} 
		Object generatedFilter_texrender = this.getFilter_texrender();
		gs_texture_render gs_texture_render = new gs_texture_render();
		if (!generatedFilter_texrender) {
			this.setFilter_texrender(gs_texture_render.gs_texrender_create(gs_color_format.format, GS_ZS_NONE));
		} 
		ModernizedCProgram.gs_blend_state_push();
		ModernizedCProgram.gs_blend_function(GS_BLEND_ONE, GS_BLEND_ZERO);
		if (generatedFilter_texrender.gs_texrender_begin(cx, cy)) {
			 custom_draw = (parent_flags & (1 << 3)) != 0;
			 async = (parent_flags & (1 << 2)) != 0;
			vec4 clear_color = new vec4();
			clear_color.vec4_zero();
			ModernizedCProgram.gs_clear(GS_CLEAR_COLOR, clear_color, 0.0, 0);
			ModernizedCProgram.gs_ortho(0.0, (double)cx, 0.0, (double)cy, -100.0, 100.0);
			if (target == parent && !custom_draw && !async) {
				target.obs_source_default_render();
			} else {
					target.obs_source_video_render();
			} 
			generatedFilter_texrender.gs_texrender_end();
		} 
		ModernizedCProgram.gs_blend_state_pop();
		return true;
	}
	public void obs_source_process_filter_tech_end(Object effect, Object width, Object height, Object tech_name) {
		obs_source_t target = new obs_source_t();
		obs_source_t parent = new obs_source_t();
		 texture = new ();
		uint32_t parent_flags = new uint32_t();
		if (!filter) {
			return ;
		} 
		obs_source obs_source = new obs_source();
		target = obs_source.obs_filter_get_target(filter);
		obs_source obs_source = new obs_source();
		parent = obs_source.obs_filter_get_parent(filter);
		if (!target || !parent) {
			return ;
		} 
		obs_source_info generatedInfo = parent.getInfo();
		Object generatedOutput_flags = generatedInfo.getOutput_flags();
		parent_flags = generatedOutput_flags;
		byte tech = tech_name ? tech_name : "Draw";
		obs_allow_direct_render generatedAllow_direct = this.getAllow_direct();
		Object generatedFilter_texrender = this.getFilter_texrender();
		gs_texture gs_texture = new gs_texture();
		if (target.can_bypass(parent, parent_flags, generatedAllow_direct)) {
			target.render_filter_bypass(effect, tech);
		} else {
				texture = gs_texture.gs_texrender_get_texture(generatedFilter_texrender);
				if (texture) {
					ModernizedCProgram.render_filter_tex(texture, effect, width, height, tech);
				} 
		} 
	}
	public void obs_source_process_filter_end(Object effect, Object width, Object height) {
		if (!ModernizedCProgram.obs_object_valid(filter, "obs_source_process_filter_end", "filter")) {
			return ;
		} 
		filter.obs_source_process_filter_tech_end(effect, width, height, "Draw");
	}
	public void obs_source_skip_video_filter() {
		obs_source_t target = new obs_source_t();
		obs_source_t parent = new obs_source_t();
		 custom_draw = new ();
		 async = new ();
		uint32_t parent_flags = new uint32_t();
		if (!ModernizedCProgram.obs_object_valid(filter, "obs_source_skip_video_filter", "filter")) {
			return ;
		} 
		obs_source obs_source = new obs_source();
		target = obs_source.obs_filter_get_target(filter);
		obs_source obs_source = new obs_source();
		parent = obs_source.obs_filter_get_parent(filter);
		obs_source_info generatedInfo = parent.getInfo();
		Object generatedOutput_flags = generatedInfo.getOutput_flags();
		parent_flags = generatedOutput_flags;
		custom_draw = (parent_flags & (1 << 3)) != 0;
		async = (parent_flags & (1 << 2)) != 0;
		Object generatedVideo_render = generatedInfo.getVideo_render();
		if (target == parent) {
			if (!custom_draw && !async) {
				target.obs_source_default_render();
			}  else if (generatedVideo_render) {
				target.obs_source_main_render();
			}  else if (ModernizedCProgram.deinterlacing_enabled(target)) {
				target.deinterlace_render();
			} else {
					target.obs_source_render_async_video();
			} 
		} else {
				target.obs_source_video_render();
		} 
	}
	public void obs_source_set_volume(double volume) {
		obs_context_data generatedContext = this.getContext();
		Object generatedSignals = generatedContext.getSignals();
		Object generatedPrivate = generatedContext.getPrivate();
		Object generatedAudio_actions_mutex = this.getAudio_actions_mutex();
		Object generatedAudio_actions = this.getAudio_actions();
		if (ModernizedCProgram.obs_object_valid(source, "obs_source_set_volume", "source")) {
			audio_action action = new audio_action(, , );
			calldata data = new calldata();
			uint8_t[] stack = new uint8_t();
			ModernizedCProgram.data.calldata_init_fixed(stack, );
			ModernizedCProgram.data.calldata_set_ptr("source", source);
			ModernizedCProgram.data.calldata_set_float("volume", volume);
			.signal_handler_signal(generatedSignals, "volume", ModernizedCProgram.data);
			if (!generatedPrivate) {
				.signal_handler_signal(generatedSignals, "source_volume", ModernizedCProgram.data);
			} 
			volume = (double)ModernizedCProgram.calldata_float(ModernizedCProgram.data, "volume");
			ModernizedCProgram.pthread_mutex_lock(generatedAudio_actions_mutex);
			.da_push_back(generatedAudio_actions, action);
			ModernizedCProgram.pthread_mutex_unlock(generatedAudio_actions_mutex);
			this.setUser_volume(volume);
		} 
	}
	public void obs_source_set_sync_offset(Object offset) {
		obs_context_data generatedContext = this.getContext();
		Object generatedSignals = generatedContext.getSignals();
		if (ModernizedCProgram.obs_object_valid(source, "obs_source_set_sync_offset", "source")) {
			calldata data = new calldata();
			uint8_t[] stack = new uint8_t();
			ModernizedCProgram.data.calldata_init_fixed(stack, );
			ModernizedCProgram.data.calldata_set_ptr("source", source);
			ModernizedCProgram.data.calldata_set_int("offset", offset);
			.signal_handler_signal(generatedSignals, "audio_sync", ModernizedCProgram.data);
			this.setSync_offset(ModernizedCProgram.calldata_int(ModernizedCProgram.data, "offset"));
		} 
	}
	public void enum_source_active_tree_callback(obs_source child, Object param) {
		source_enum_data data = param;
		obs_source_info generatedInfo = child.getInfo();
		obs_source_type generatedType = generatedInfo.getType();
		 is_transition = generatedType == obs_source_type.OBS_SOURCE_TYPE_TRANSITION;
		if (is_transition) {
			child.obs_transition_enum_sources(enum_source_active_tree_callback, param);
		} 
		Object generatedEnum_active_sources = generatedInfo.getEnum_active_sources();
		obs_context_data generatedContext = child.getContext();
		Object generatedData = generatedContext.getData();
		if (generatedEnum_active_sources) {
			if (generatedData) {
				.UNRECOGNIZEDFUNCTIONNAME(generatedData, enum_source_active_tree_callback, data);
			} 
		} 
		Object generatedParam = data.getParam();
		.UNRECOGNIZEDFUNCTIONNAME(parent, child, generatedParam);
	}
	public void obs_source_enum_active_sources(Object enum_callback, Object param) {
		 is_transition = new ();
		if (!ModernizedCProgram.data_valid(source, "obs_source_enum_active_sources")) {
			return ;
		} 
		obs_source_info generatedInfo = this.getInfo();
		obs_source_type generatedType = generatedInfo.getType();
		is_transition = generatedType == obs_source_type.OBS_SOURCE_TYPE_TRANSITION;
		Object generatedEnum_active_sources = generatedInfo.getEnum_active_sources();
		if (!is_transition && !generatedEnum_active_sources) {
			return ;
		} 
		source.obs_source_addref();
		if (is_transition) {
			source.obs_transition_enum_sources(enum_callback, param);
		} 
		obs_context_data generatedContext = this.getContext();
		Object generatedData = generatedContext.getData();
		if (generatedEnum_active_sources) {
			.UNRECOGNIZEDFUNCTIONNAME(generatedData, enum_callback, param);
		} 
		source.obs_source_release();
	}
	public void obs_source_enum_active_tree(Object enum_callback, Object param) {
		source_enum_data data = new source_enum_data(enum_callback, param);
		 is_transition = new ();
		if (!ModernizedCProgram.data_valid(source, "obs_source_enum_active_tree")) {
			return ;
		} 
		obs_source_info generatedInfo = this.getInfo();
		obs_source_type generatedType = generatedInfo.getType();
		is_transition = generatedType == obs_source_type.OBS_SOURCE_TYPE_TRANSITION;
		Object generatedEnum_active_sources = generatedInfo.getEnum_active_sources();
		if (!is_transition && !generatedEnum_active_sources) {
			return ;
		} 
		source.obs_source_addref();
		if (generatedType == obs_source_type.OBS_SOURCE_TYPE_TRANSITION) {
			source.obs_transition_enum_sources(enum_source_active_tree_callback, data);
		} 
		obs_context_data generatedContext = this.getContext();
		Object generatedData = generatedContext.getData();
		if (generatedEnum_active_sources) {
			.UNRECOGNIZEDFUNCTIONNAME(generatedData, enum_source_active_tree_callback, data);
		} 
		source.obs_source_release();
	}
	public void enum_source_full_tree_callback(obs_source child, Object param) {
		source_enum_data data = param;
		obs_source_info generatedInfo = child.getInfo();
		obs_source_type generatedType = generatedInfo.getType();
		 is_transition = generatedType == obs_source_type.OBS_SOURCE_TYPE_TRANSITION;
		if (is_transition) {
			child.obs_transition_enum_sources(enum_source_full_tree_callback, param);
		} 
		Object generatedEnum_all_sources = generatedInfo.getEnum_all_sources();
		obs_context_data generatedContext = child.getContext();
		Object generatedData = generatedContext.getData();
		Object generatedEnum_active_sources = generatedInfo.getEnum_active_sources();
		if (generatedEnum_all_sources) {
			if (generatedData) {
				.UNRECOGNIZEDFUNCTIONNAME(generatedData, enum_source_full_tree_callback, data);
			} 
		}  else if (generatedEnum_active_sources) {
			if (generatedData) {
				.UNRECOGNIZEDFUNCTIONNAME(generatedData, enum_source_full_tree_callback, data);
			} 
		} 
		Object generatedParam = data.getParam();
		.UNRECOGNIZEDFUNCTIONNAME(parent, child, generatedParam);
	}
	public void obs_source_enum_full_tree(Object enum_callback, Object param) {
		source_enum_data data = new source_enum_data(enum_callback, param);
		 is_transition = new ();
		if (!ModernizedCProgram.data_valid(source, "obs_source_enum_active_tree")) {
			return ;
		} 
		obs_source_info generatedInfo = this.getInfo();
		obs_source_type generatedType = generatedInfo.getType();
		is_transition = generatedType == obs_source_type.OBS_SOURCE_TYPE_TRANSITION;
		Object generatedEnum_active_sources = generatedInfo.getEnum_active_sources();
		if (!is_transition && !generatedEnum_active_sources) {
			return ;
		} 
		source.obs_source_addref();
		if (generatedType == obs_source_type.OBS_SOURCE_TYPE_TRANSITION) {
			source.obs_transition_enum_sources(enum_source_full_tree_callback, data);
		} 
		Object generatedEnum_all_sources = generatedInfo.getEnum_all_sources();
		obs_context_data generatedContext = this.getContext();
		Object generatedData = generatedContext.getData();
		if (generatedEnum_all_sources) {
			.UNRECOGNIZEDFUNCTIONNAME(generatedData, enum_source_full_tree_callback, data);
		}  else if (generatedEnum_active_sources) {
			.UNRECOGNIZEDFUNCTIONNAME(generatedData, enum_source_full_tree_callback, data);
		} 
		source.obs_source_release();
	}
	public void check_descendant(obs_source child, Object param) {
		descendant_info info = param;
		obs_source generatedTarget = info.getTarget();
		if (child == generatedTarget || parent == generatedTarget) {
			info.setExists(true);
		} 
	}
	public Object obs_source_add_active_child(obs_source child) {
		descendant_info info = new descendant_info(false, parent);
		if (!ModernizedCProgram.obs_object_valid(parent, "obs_source_add_active_child", "parent")) {
			return false;
		} 
		if (!ModernizedCProgram.obs_object_valid(child, "obs_source_add_active_child", "child")) {
			return false;
		} 
		if (parent == child) {
			ModernizedCProgram.blog(LOG_WARNING, "obs_source_add_active_child: parent == child");
			return false;
		} 
		child.obs_source_enum_full_tree(check_descendant, info);
		Object generatedExists = info.getExists();
		if (generatedExists) {
			return false;
		} 
		Object generatedShow_refs = this.getShow_refs();
		Object generatedActivate_refs = this.getActivate_refs();
		for (int i = 0;
		 i < generatedShow_refs; i++) {
			view_type type;
			view_type.type = (i < generatedActivate_refs) ? view_type.MAIN_VIEW : view_type.AUX_VIEW;
			child.obs_source_activate(view_type.type);
		}
		return true;
	}
	public void obs_source_remove_active_child(obs_source child) {
		if (!ModernizedCProgram.obs_object_valid(parent, "obs_source_remove_active_child", "parent")) {
			return ;
		} 
		if (!ModernizedCProgram.obs_object_valid(child, "obs_source_remove_active_child", "child")) {
			return ;
		} 
		Object generatedShow_refs = this.getShow_refs();
		Object generatedActivate_refs = this.getActivate_refs();
		for (int i = 0;
		 i < generatedShow_refs; i++) {
			view_type type;
			view_type.type = (i < generatedActivate_refs) ? view_type.MAIN_VIEW : view_type.AUX_VIEW;
			child.obs_source_deactivate(view_type.type);
		}
	}
	public void obs_source_save() {
		if (!ModernizedCProgram.data_valid(source, "obs_source_save")) {
			return ;
		} 
		source.obs_source_dosignal("source_save", "save");
		obs_source_info generatedInfo = this.getInfo();
		Object generatedSave = generatedInfo.getSave();
		obs_context_data generatedContext = this.getContext();
		Object generatedData = generatedContext.getData();
		obs_data generatedSettings = generatedContext.getSettings();
		if (generatedSave) {
			.UNRECOGNIZEDFUNCTIONNAME(generatedData, generatedSettings);
		} 
	}
	public void obs_source_load() {
		if (!ModernizedCProgram.data_valid(source, "obs_source_load")) {
			return ;
		} 
		obs_source_info generatedInfo = this.getInfo();
		Object generatedLoad = generatedInfo.getLoad();
		obs_context_data generatedContext = this.getContext();
		Object generatedData = generatedContext.getData();
		obs_data generatedSettings = generatedContext.getSettings();
		if (generatedLoad) {
			.UNRECOGNIZEDFUNCTIONNAME(generatedData, generatedSettings);
		} 
		source.obs_source_dosignal("source_load", "load");
	}
	public void signal_flags_updated() {
		calldata data = new calldata();
		uint8_t[] stack = new uint8_t();
		data.calldata_init_fixed(stack, );
		data.calldata_set_ptr("source", source);
		Object generatedFlags = this.getFlags();
		data.calldata_set_int("flags", generatedFlags);
		obs_context_data generatedContext = this.getContext();
		Object generatedSignals = generatedContext.getSignals();
		.signal_handler_signal(generatedSignals, "update_flags", data);
	}
	public void obs_source_set_flags(Object flags) {
		if (!ModernizedCProgram.obs_object_valid(source, "obs_source_set_flags", "source")) {
			return ;
		} 
		Object generatedFlags = this.getFlags();
		if (flags != generatedFlags) {
			this.setFlags(flags);
			source.signal_flags_updated();
		} 
	}
	public void obs_source_set_default_flags(Object flags) {
		if (!ModernizedCProgram.obs_object_valid(source, "obs_source_set_default_flags", "source")) {
			return ;
		} 
		this.setDefault_flags(flags);
	}
	public void obs_source_set_audio_mixers(Object mixers) {
		calldata data = new calldata();
		uint8_t[] stack = new uint8_t();
		if (!ModernizedCProgram.obs_object_valid(source, "obs_source_set_audio_mixers", "source")) {
			return ;
		} 
		obs_source_info generatedInfo = this.getInfo();
		Object generatedOutput_flags = generatedInfo.getOutput_flags();
		if ((generatedOutput_flags & (1 << 1)) == 0) {
			return ;
		} 
		Object generatedAudio_mixers = this.getAudio_mixers();
		if (generatedAudio_mixers == mixers) {
			return ;
		} 
		data.calldata_init_fixed(stack, );
		data.calldata_set_ptr("source", source);
		data.calldata_set_int("mixers", mixers);
		obs_context_data generatedContext = this.getContext();
		Object generatedSignals = generatedContext.getSignals();
		.signal_handler_signal(generatedSignals, "audio_mixers", data);
		mixers = (uint32_t)ModernizedCProgram.calldata_int(data, "mixers");
		this.setAudio_mixers(mixers);
	}
	public void obs_source_inc_showing() {
		if (ModernizedCProgram.obs_object_valid(source, "obs_source_inc_showing", "source")) {
			source.obs_source_activate(view_type.AUX_VIEW);
		} 
	}
	public void obs_source_inc_active() {
		if (ModernizedCProgram.obs_object_valid(source, "obs_source_inc_active", "source")) {
			source.obs_source_activate(view_type.MAIN_VIEW);
		} 
	}
	public void obs_source_dec_showing() {
		if (ModernizedCProgram.obs_object_valid(source, "obs_source_dec_showing", "source")) {
			source.obs_source_deactivate(view_type.AUX_VIEW);
		} 
	}
	public void obs_source_dec_active() {
		if (ModernizedCProgram.obs_object_valid(source, "obs_source_dec_active", "source")) {
			source.obs_source_deactivate(view_type.MAIN_VIEW);
		} 
	}
	public void obs_source_enum_filters(Object callback, Object param) {
		if (!ModernizedCProgram.obs_object_valid(source, "obs_source_enum_filters", "source")) {
			return ;
		} 
		if (!ModernizedCProgram.obs_object_valid(callback, "obs_source_enum_filters", "callback")) {
			return ;
		} 
		Object generatedFilter_mutex = this.getFilter_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedFilter_mutex);
		Object generatedFilters = this.getFilters();
		for ( i = generatedFilters.getNum();
		 i > 0; i--) {
			obs_source filter = generatedFilters.getArray()[i - 1];
			.callback(source, filter, param);
		}
		ModernizedCProgram.pthread_mutex_unlock(generatedFilter_mutex);
	}
	public obs_source obs_source_get_filter_by_name(Object name) {
		obs_source_t filter = NULL;
		if (!ModernizedCProgram.obs_object_valid(source, "obs_source_get_filter_by_name", "source")) {
			return NULL;
		} 
		if (!ModernizedCProgram.obs_object_valid(name, "obs_source_get_filter_by_name", "name")) {
			return NULL;
		} 
		Object generatedFilter_mutex = this.getFilter_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedFilter_mutex);
		Object generatedFilters = this.getFilters();
		obs_context_data generatedContext = cur_filter.getContext();
		Byte generatedName = generatedContext.getName();
		for ( i = 0;
		 i < generatedFilters.getNum(); i++) {
			obs_source cur_filter = generatedFilters.getArray()[i];
			if (.strcmp(generatedName, name) == 0) {
				filter = cur_filter;
				filter.obs_source_addref();
				break;
			} 
		}
		ModernizedCProgram.pthread_mutex_unlock(generatedFilter_mutex);
		return filter;
	}
	public void obs_source_set_enabled(Object enabled) {
		calldata data = new calldata();
		uint8_t[] stack = new uint8_t();
		if (!ModernizedCProgram.obs_object_valid(source, "obs_source_set_enabled", "source")) {
			return ;
		} 
		this.setEnabled(enabled);
		data.calldata_init_fixed(stack, );
		data.calldata_set_ptr("source", source);
		data.calldata_set_bool("enabled", enabled);
		obs_context_data generatedContext = this.getContext();
		Object generatedSignals = generatedContext.getSignals();
		.signal_handler_signal(generatedSignals, "enable", data);
	}
	public void obs_source_set_muted(Object muted) {
		calldata data = new calldata();
		uint8_t[] stack = new uint8_t();
		audio_action action = new audio_action(, , );
		if (!ModernizedCProgram.obs_object_valid(source, "obs_source_set_muted", "source")) {
			return ;
		} 
		this.setUser_muted(muted);
		data.calldata_init_fixed(stack, );
		data.calldata_set_ptr("source", source);
		data.calldata_set_bool("muted", muted);
		obs_context_data generatedContext = this.getContext();
		Object generatedSignals = generatedContext.getSignals();
		.signal_handler_signal(generatedSignals, "mute", data);
		Object generatedAudio_actions_mutex = this.getAudio_actions_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedAudio_actions_mutex);
		Object generatedAudio_actions = this.getAudio_actions();
		.da_push_back(generatedAudio_actions, action);
		ModernizedCProgram.pthread_mutex_unlock(generatedAudio_actions_mutex);
	}
	public void source_signal_push_to_changed(Object signal, Object enabled) {
		calldata data = new calldata();
		uint8_t[] stack = new uint8_t();
		data.calldata_init_fixed(stack, );
		data.calldata_set_ptr("source", source);
		data.calldata_set_bool("enabled", enabled);
		obs_context_data generatedContext = this.getContext();
		Object generatedSignals = generatedContext.getSignals();
		.signal_handler_signal(generatedSignals, signal, data);
	}
	public void source_signal_push_to_delay(Object signal, Object delay) {
		calldata data = new calldata();
		uint8_t[] stack = new uint8_t();
		data.calldata_init_fixed(stack, );
		data.calldata_set_ptr("source", source);
		data.calldata_set_bool("delay", delay);
		obs_context_data generatedContext = this.getContext();
		Object generatedSignals = generatedContext.getSignals();
		.signal_handler_signal(generatedSignals, signal, data);
	}
	public Object obs_source_push_to_mute_enabled() {
		 enabled = new ();
		if (!ModernizedCProgram.obs_object_valid(source, "obs_source_push_to_mute_enabled", "source")) {
			return false;
		} 
		Object generatedAudio_mutex = this.getAudio_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedAudio_mutex);
		Object generatedPush_to_mute_enabled = this.getPush_to_mute_enabled();
		enabled = generatedPush_to_mute_enabled;
		ModernizedCProgram.pthread_mutex_unlock(generatedAudio_mutex);
		return enabled;
	}
	public void obs_source_enable_push_to_mute(Object enabled) {
		if (!ModernizedCProgram.obs_object_valid(source, "obs_source_enable_push_to_mute", "source")) {
			return ;
		} 
		Object generatedAudio_mutex = this.getAudio_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedAudio_mutex);
		Object generatedPush_to_mute_enabled = this.getPush_to_mute_enabled();
		 changed = generatedPush_to_mute_enabled != enabled;
		if (ModernizedCProgram.obs_source_get_output_flags(source) & (1 << 1) && changed) {
			ModernizedCProgram.blog(LOG_INFO, "source '%s' %s push-to-mute", ModernizedCProgram.obs_source_get_name(source), enabled ? "enabled" : "disabled");
		} 
		this.setPush_to_mute_enabled(enabled);
		if (changed) {
			source.source_signal_push_to_changed("push_to_mute_changed", enabled);
		} 
		ModernizedCProgram.pthread_mutex_unlock(generatedAudio_mutex);
	}
	public Object obs_source_get_push_to_mute_delay() {
		uint64_t delay = new uint64_t();
		if (!ModernizedCProgram.obs_object_valid(source, "obs_source_get_push_to_mute_delay", "source")) {
			return 0;
		} 
		Object generatedAudio_mutex = this.getAudio_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedAudio_mutex);
		Object generatedPush_to_mute_delay = this.getPush_to_mute_delay();
		delay = generatedPush_to_mute_delay;
		ModernizedCProgram.pthread_mutex_unlock(generatedAudio_mutex);
		return delay;
	}
	public void obs_source_set_push_to_mute_delay(Object delay) {
		if (!ModernizedCProgram.obs_object_valid(source, "obs_source_set_push_to_mute_delay", "source")) {
			return ;
		} 
		Object generatedAudio_mutex = this.getAudio_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedAudio_mutex);
		this.setPush_to_mute_delay(delay);
		source.source_signal_push_to_delay("push_to_mute_delay", delay);
		ModernizedCProgram.pthread_mutex_unlock(generatedAudio_mutex);
	}
	public Object obs_source_push_to_talk_enabled() {
		 enabled = new ();
		if (!ModernizedCProgram.obs_object_valid(source, "obs_source_push_to_talk_enabled", "source")) {
			return false;
		} 
		Object generatedAudio_mutex = this.getAudio_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedAudio_mutex);
		Object generatedPush_to_talk_enabled = this.getPush_to_talk_enabled();
		enabled = generatedPush_to_talk_enabled;
		ModernizedCProgram.pthread_mutex_unlock(generatedAudio_mutex);
		return enabled;
	}
	public void obs_source_enable_push_to_talk(Object enabled) {
		if (!ModernizedCProgram.obs_object_valid(source, "obs_source_enable_push_to_talk", "source")) {
			return ;
		} 
		Object generatedAudio_mutex = this.getAudio_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedAudio_mutex);
		Object generatedPush_to_talk_enabled = this.getPush_to_talk_enabled();
		 changed = generatedPush_to_talk_enabled != enabled;
		if (ModernizedCProgram.obs_source_get_output_flags(source) & (1 << 1) && changed) {
			ModernizedCProgram.blog(LOG_INFO, "source '%s' %s push-to-talk", ModernizedCProgram.obs_source_get_name(source), enabled ? "enabled" : "disabled");
		} 
		this.setPush_to_talk_enabled(enabled);
		if (changed) {
			source.source_signal_push_to_changed("push_to_talk_changed", enabled);
		} 
		ModernizedCProgram.pthread_mutex_unlock(generatedAudio_mutex);
	}
	public Object obs_source_get_push_to_talk_delay() {
		uint64_t delay = new uint64_t();
		if (!ModernizedCProgram.obs_object_valid(source, "obs_source_get_push_to_talk_delay", "source")) {
			return 0;
		} 
		Object generatedAudio_mutex = this.getAudio_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedAudio_mutex);
		Object generatedPush_to_talk_delay = this.getPush_to_talk_delay();
		delay = generatedPush_to_talk_delay;
		ModernizedCProgram.pthread_mutex_unlock(generatedAudio_mutex);
		return delay;
	}
	public void obs_source_set_push_to_talk_delay(Object delay) {
		if (!ModernizedCProgram.obs_object_valid(source, "obs_source_set_push_to_talk_delay", "source")) {
			return ;
		} 
		Object generatedAudio_mutex = this.getAudio_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedAudio_mutex);
		this.setPush_to_talk_delay(delay);
		source.source_signal_push_to_delay("push_to_talk_delay", delay);
		ModernizedCProgram.pthread_mutex_unlock(generatedAudio_mutex);
	}
	public Object obs_source_get_type_data() {
		obs_source_info generatedInfo = this.getInfo();
		Object generatedType_data = generatedInfo.getType_data();
		return ModernizedCProgram.obs_object_valid(source, "obs_source_get_type_data", "source") ? generatedType_data : NULL;
	}
	public double get_source_volume(Object os_time) {
		Object generatedPush_to_mute_enabled = this.getPush_to_mute_enabled();
		Object generatedPush_to_mute_pressed = this.getPush_to_mute_pressed();
		Object generatedPush_to_mute_delay = this.getPush_to_mute_delay();
		if (generatedPush_to_mute_enabled && generatedPush_to_mute_pressed) {
			this.setPush_to_mute_stop_time(os_time + generatedPush_to_mute_delay * 1000000);
		} 
		Object generatedPush_to_talk_enabled = this.getPush_to_talk_enabled();
		Object generatedPush_to_talk_pressed = this.getPush_to_talk_pressed();
		Object generatedPush_to_talk_delay = this.getPush_to_talk_delay();
		if (generatedPush_to_talk_enabled && generatedPush_to_talk_pressed) {
			this.setPush_to_talk_stop_time(os_time + generatedPush_to_talk_delay * 1000000);
		} 
		Object generatedPush_to_mute_stop_time = this.getPush_to_mute_stop_time();
		 push_to_mute_active = generatedPush_to_mute_pressed || os_time < generatedPush_to_mute_stop_time;
		Object generatedPush_to_talk_stop_time = this.getPush_to_talk_stop_time();
		 push_to_talk_active = generatedPush_to_talk_pressed || os_time < generatedPush_to_talk_stop_time;
		Object generatedEnabled = this.getEnabled();
		Object generatedMuted = this.getMuted();
		 muted = !generatedEnabled || generatedMuted || (generatedPush_to_mute_enabled && push_to_mute_active) || (generatedPush_to_talk_enabled && !push_to_talk_active);
		double generatedVolume = this.getVolume();
		if (muted || ModernizedCProgram.close_float(generatedVolume, 0.0, 1.0E-4)) {
			return 0.0;
		} 
		if (ModernizedCProgram.close_float(generatedVolume, 1.0, 1.0E-4)) {
			return 1.0;
		} 
		return generatedVolume;
	}
	public void multiply_output_audio(Object mix, Object channels, double vol) {
		Object generatedAudio_output_buf = this.getAudio_output_buf();
		double out = generatedAudio_output_buf[mix][0];
		double end = out + AUDIO_OUTPUT_FRAMES * channels;
		while (out < end) {
			(out++) *= vol;
		}
	}
	public void multiply_vol_data(Object mix, Object channels, Double vol_data) {
		Object generatedAudio_output_buf = this.getAudio_output_buf();
		for ( ch = 0;
		 ch < channels; ch++) {
			double out = generatedAudio_output_buf[mix][ch];
			double end = out + AUDIO_OUTPUT_FRAMES;
			double vol = vol_data;
			while (out < end) {
				(out++) *= (vol++);
			}
		}
	}
	public void apply_audio_action(Object action) {
		switch (action.getType()) {
		case audio_action_type.AUDIO_ACTION_VOL:
				this.setVolume(action.getVol());
				break;
		case audio_action_type.AUDIO_ACTION_PTT:
				this.setPush_to_talk_pressed(action.getSet());
				break;
		case audio_action_type.AUDIO_ACTION_MUTE:
				this.setMuted(action.getSet());
				break;
		case audio_action_type.AUDIO_ACTION_PTM:
				this.setPush_to_mute_pressed(action.getSet());
				break;
		}
	}
	public void apply_audio_actions(Object channels, Object sample_rate) {
		double vol_data = .malloc( * AUDIO_OUTPUT_FRAMES);
		Object generatedAudio_ts = this.getAudio_ts();
		double cur_vol = source.get_source_volume(generatedAudio_ts);
		 frame_num = 0;
		Object generatedAudio_actions_mutex = this.getAudio_actions_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedAudio_actions_mutex);
		Object generatedAudio_actions = this.getAudio_actions();
		Object generatedTimestamp = action.getTimestamp();
		for ( i = 0;
		 i < generatedAudio_actions.getNum(); i++) {
			audio_action action = generatedAudio_actions.getArray()[i];
			uint64_t timestamp = generatedTimestamp;
			 new_frame_num = new ();
			if (timestamp < generatedAudio_ts) {
				timestamp = generatedAudio_ts;
			} 
			new_frame_num = ModernizedCProgram.conv_time_to_frames(sample_rate, timestamp - generatedAudio_ts);
			if (new_frame_num >= AUDIO_OUTPUT_FRAMES) {
				break;
			} 
			.da_erase(generatedAudio_actions, i--);
			source.apply_audio_action(action);
			if (new_frame_num > frame_num) {
				for (; frame_num < new_frame_num; frame_num++) {
					vol_data[frame_num] = cur_vol;
				}
			} 
			cur_vol = source.get_source_volume(timestamp);
		}
		for (; frame_num < AUDIO_OUTPUT_FRAMES; frame_num++) {
			vol_data[frame_num] = cur_vol;
		}
		ModernizedCProgram.pthread_mutex_unlock(generatedAudio_actions_mutex);
		Object generatedAudio_mixers = this.getAudio_mixers();
		for ( mix = 0;
		 mix < MAX_AUDIO_MIXES; mix++) {
			if ((generatedAudio_mixers & (1 << mix)) != 0) {
				source.multiply_vol_data(mix, channels, vol_data);
			} 
		}
		.free(vol_data);
	}
	public void apply_audio_volume(Object mixers, Object channels, Object sample_rate) {
		audio_action action = new audio_action();
		 actions_pending = new ();
		double vol;
		Object generatedAudio_actions_mutex = this.getAudio_actions_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedAudio_actions_mutex);
		Object generatedAudio_actions = this.getAudio_actions();
		actions_pending = generatedAudio_actions.getNum() > 0;
		if (actions_pending) {
			action = generatedAudio_actions.getArray()[0];
		} 
		ModernizedCProgram.pthread_mutex_unlock(generatedAudio_actions_mutex);
		Object generatedTimestamp = action.getTimestamp();
		Object generatedAudio_ts = this.getAudio_ts();
		if (actions_pending) {
			uint64_t duration = ModernizedCProgram.conv_frames_to_time(sample_rate, AUDIO_OUTPUT_FRAMES);
			if (generatedTimestamp < (generatedAudio_ts + duration)) {
				source.apply_audio_actions(channels, sample_rate);
				return ;
			} 
		} 
		vol = source.get_source_volume(generatedAudio_ts);
		if (vol == 1.0) {
			return ;
		} 
		Object generatedAudio_output_buf = this.getAudio_output_buf();
		if (vol == 0.0 || mixers == 0) {
			.memset(generatedAudio_output_buf[0][0], 0, AUDIO_OUTPUT_FRAMES *  * MAX_AUDIO_CHANNELS * MAX_AUDIO_MIXES);
			return ;
		} 
		Object generatedAudio_mixers = this.getAudio_mixers();
		for ( mix = 0;
		 mix < MAX_AUDIO_MIXES; mix++) {
			uint32_t mix_and_val = (1 << mix);
			if ((generatedAudio_mixers & mix_and_val) != 0 && (mixers & mix_and_val) != 0) {
				source.multiply_output_audio(mix, channels, vol);
			} 
		}
	}
	public void custom_audio_render(Object mixers, Object channels, Object sample_rate) {
		obs_source_audio_mix audio_data = new obs_source_audio_mix();
		 success = new ();
		uint64_t ts = new uint64_t();
		Object generatedOutput = audio_data.getOutput();
		Object generatedAudio_output_buf = this.getAudio_output_buf();
		Object generatedAudio_mixers = this.getAudio_mixers();
		for ( mix = 0;
		 mix < MAX_AUDIO_MIXES; mix++) {
			for ( ch = 0;
			 ch < channels; ch++) {
				generatedOutput[mix].getAudio_output_data()[ch] = generatedAudio_output_buf[mix][ch];
			}
			if ((generatedAudio_mixers & mixers & (1 << mix)) != 0) {
				.memset(generatedAudio_output_buf[mix][0], 0,  * AUDIO_OUTPUT_FRAMES * channels);
			} 
		}
		obs_context_data generatedContext = this.getContext();
		Object generatedData = generatedContext.getData();
		success = .UNRECOGNIZEDFUNCTIONNAME(generatedData, ts, audio_data, mixers, channels, sample_rate);
		this.setAudio_ts(success ? ts : 0);
		this.setAudio_pending(!success);
		Object generatedAudio_ts = this.getAudio_ts();
		if (!success || !generatedAudio_ts || !mixers) {
			return ;
		} 
		for ( mix = 0;
		 mix < MAX_AUDIO_MIXES; mix++) {
			uint32_t mix_bit = 1 << mix;
			if ((mixers & mix_bit) == 0) {
				continue;
			} 
			if ((generatedAudio_mixers & mix_bit) == 0) {
				.memset(generatedAudio_output_buf[mix][0], 0,  * AUDIO_OUTPUT_FRAMES * channels);
			} 
		}
		source.apply_audio_volume(mixers, channels, sample_rate);
	}
	public void audio_submix(Object channels, Object sample_rate) {
		audio_output_data audio_data = new audio_output_data();
		obs_source_audio audio = new obs_source_audio(0);
		 success = new ();
		uint64_t ts = new uint64_t();
		Object generatedAudio_output_data = audio_data.getAudio_output_data();
		Object generatedAudio_mix_buf = this.getAudio_mix_buf();
		for ( ch = 0;
		 ch < channels; ch++) {
			generatedAudio_output_data[ch] = generatedAudio_mix_buf[ch];
		}
		.memset(generatedAudio_mix_buf[0], 0,  * AUDIO_OUTPUT_FRAMES * channels);
		obs_context_data generatedContext = this.getContext();
		Object generatedData = generatedContext.getData();
		success = .UNRECOGNIZEDFUNCTIONNAME(generatedData, ts, audio_data, channels, sample_rate);
		if (!success) {
			return ;
		} 
		for ( i = 0;
		 i < channels; i++) {
			generatedData[i] = (uint8_t)generatedAudio_output_data[i];
		}
		audio.setSamples_per_sec((uint32_t)sample_rate);
		audio.setFrames(AUDIO_OUTPUT_FRAMES);
		audio.setFormat(AUDIO_FORMAT_FLOAT_PLANAR);
		audio.setSpeakers((speaker_layout)channels);
		audio.setTimestamp(ts);
		source.obs_source_output_audio(audio);
	}
	public void process_audio_source_tick(Object mixers, Object channels, Object sample_rate, Object size) {
		obs_source_info generatedInfo = this.getInfo();
		Object generatedOutput_flags = generatedInfo.getOutput_flags();
		 audio_submix = !!(generatedOutput_flags & (1 << 12));
		Object generatedAudio_buf_mutex = this.getAudio_buf_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedAudio_buf_mutex);
		Object generatedAudio_input_buf = this.getAudio_input_buf();
		if (generatedAudio_input_buf[0].getCirclebuf() < size) {
			this.setAudio_pending(true);
			ModernizedCProgram.pthread_mutex_unlock(generatedAudio_buf_mutex);
			return ;
		} 
		Object generatedAudio_output_buf = this.getAudio_output_buf();
		for ( ch = 0;
		 ch < channels; ch++) {
			generatedAudio_input_buf[ch].circlebuf_peek_front(generatedAudio_output_buf[0][ch], size);
		}
		ModernizedCProgram.pthread_mutex_unlock(generatedAudio_buf_mutex);
		Object generatedAudio_mixers = this.getAudio_mixers();
		for ( mix = 1;
		 mix < MAX_AUDIO_MIXES; mix++) {
			uint32_t mix_and_val = (1 << mix);
			if (audio_submix) {
				if (mix > 1) {
					break;
				} 
				mixers = 1;
				mix_and_val = 1;
			} 
			if ((generatedAudio_mixers & mix_and_val) == 0 || (mixers & mix_and_val) == 0) {
				.memset(generatedAudio_output_buf[mix][0], 0, size * channels);
				continue;
			} 
			for ( ch = 0;
			 ch < channels; ch++) {
				.memcpy(generatedAudio_output_buf[mix][ch], generatedAudio_output_buf[0][ch], size);
			}
		}
		if (audio_submix) {
			this.setAudio_pending(false);
			return ;
		} 
		if ((generatedAudio_mixers & 1) == 0 || (mixers & 1) == 0) {
			.memset(generatedAudio_output_buf[0][0], 0, size * channels);
		} 
		source.apply_audio_volume(mixers, channels, sample_rate);
		this.setAudio_pending(false);
	}
	public void obs_source_audio_render(Object mixers, Object channels, Object sample_rate, Object size) {
		Object generatedAudio_output_buf = this.getAudio_output_buf();
		if (!generatedAudio_output_buf[0][0]) {
			this.setAudio_pending(true);
			return ;
		} 
		obs_source_info generatedInfo = this.getInfo();
		Object generatedAudio_render = generatedInfo.getAudio_render();
		if (generatedAudio_render) {
			source.custom_audio_render(mixers, channels, sample_rate);
			return ;
		} 
		Object generatedAudio_mix = generatedInfo.getAudio_mix();
		if (generatedAudio_mix) {
			source.audio_submix(channels, sample_rate);
		} 
		Object generatedAudio_ts = this.getAudio_ts();
		if (!generatedAudio_ts) {
			this.setAudio_pending(true);
			return ;
		} 
		source.process_audio_source_tick(mixers, channels, sample_rate, size);
	}
	public void obs_source_add_audio_capture_callback(Object callback, Object param) {
		audio_cb_info info = new audio_cb_info(callback, param);
		if (!ModernizedCProgram.obs_object_valid(source, "obs_source_add_audio_capture_callback", "source")) {
			return ;
		} 
		Object generatedAudio_cb_mutex = this.getAudio_cb_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedAudio_cb_mutex);
		Object generatedAudio_cb_list = this.getAudio_cb_list();
		.da_push_back(generatedAudio_cb_list, info);
		ModernizedCProgram.pthread_mutex_unlock(generatedAudio_cb_mutex);
	}
	public void obs_source_remove_audio_capture_callback(Object callback, Object param) {
		audio_cb_info info = new audio_cb_info(callback, param);
		if (!ModernizedCProgram.obs_object_valid(source, "obs_source_remove_audio_capture_callback", "source")) {
			return ;
		} 
		Object generatedAudio_cb_mutex = this.getAudio_cb_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedAudio_cb_mutex);
		Object generatedAudio_cb_list = this.getAudio_cb_list();
		.da_erase_item(generatedAudio_cb_list, info);
		ModernizedCProgram.pthread_mutex_unlock(generatedAudio_cb_mutex);
	}
	public void obs_source_set_monitoring_type(obs_monitoring_type type) {
		 was_on = new ();
		 now_on = new ();
		if (!ModernizedCProgram.obs_object_valid(source, "obs_source_set_monitoring_type", "source")) {
			return ;
		} 
		obs_monitoring_type generatedMonitoring_type = this.getMonitoring_type();
		if (generatedMonitoring_type == obs_monitoring_type.type) {
			return ;
		} 
		was_on = generatedMonitoring_type != obs_monitoring_type.OBS_MONITORING_TYPE_NONE;
		now_on = obs_monitoring_type.type != obs_monitoring_type.OBS_MONITORING_TYPE_NONE;
		audio_monitor audio_monitor = new audio_monitor();
		audio_monitor generatedMonitor = this.getMonitor();
		if (was_on != now_on) {
			if (!was_on) {
				this.setMonitor(audio_monitor.audio_monitor_create(source));
			} else {
					generatedMonitor.audio_monitor_destroy();
					this.setMonitor(NULL);
			} 
		} 
		this.setMonitoring_type(obs_monitoring_type.type);
	}
	public void obs_source_set_async_unbuffered(Object unbuffered) {
		if (!ModernizedCProgram.obs_object_valid(source, "obs_source_set_async_unbuffered", "source")) {
			return ;
		} 
		this.setAsync_unbuffered(unbuffered);
	}
	public void obs_source_set_async_decoupled(Object decouple) {
		if (!ModernizedCProgram.obs_object_valid(source, "obs_source_set_async_decoupled", "source")) {
			return ;
		} 
		this.setAsync_decoupled(decouple);
		Object generatedAudio_buf_mutex = this.getAudio_buf_mutex();
		if (decouple) {
			ModernizedCProgram.pthread_mutex_lock(generatedAudio_buf_mutex);
			this.setTiming_set(false);
			source.reset_audio_data(0);
			ModernizedCProgram.pthread_mutex_unlock(generatedAudio_buf_mutex);
		} 
	}
	public speaker_layout obs_source_get_speaker_layout() {
		if (!ModernizedCProgram.obs_object_valid(source, "obs_source_get_audio_channels", "source")) {
			return SPEAKERS_UNKNOWN;
		} 
		resample_info generatedSample_info = this.getSample_info();
		Object generatedResample_info = generatedSample_info.getResample_info();
		return generatedResample_info;
	}
	public void obs_source_set_balance_value(double balance) {
		if (!ModernizedCProgram.obs_object_valid(source, "obs_source_set_balance_value", "source")) {
			return ;
		} 
		this.setBalance(balance);
	}
	public void obs_source_set_audio_active(Object active) {
		if (!ModernizedCProgram.obs_object_valid(source, "obs_source_set_audio_active", "source")) {
			return ;
		} 
		Object generatedAudio_active = this.getAudio_active();
		if (ModernizedCProgram.os_atomic_set_bool(generatedAudio_active, active) == active) {
			return ;
		} 
		if (active) {
			source.obs_source_dosignal("source_audio_activate", "audio_activate");
		} else {
				source.obs_source_dosignal("source_audio_deactivate", "audio_deactivate");
		} 
	}
	/******************************************************************************
	    Copyright (C) 2016 by Hugh Bailey <obs.jim@gmail.com>
	
	    This program is free software: you can redistribute it and/or modify
	    it under the terms of the GNU General Public License as published by
	    the Free Software Foundation, either version 2 of the License, or
	    (at your option) any later version.
	
	    This program is distributed in the hope that it will be useful,
	    but WITHOUT ANY WARRANTY; without even the implied warranty of
	    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
	    GNU General Public License for more details.
	
	    You should have received a copy of the GNU General Public License
	    along with this program.  If not, see <http://www.gnu.org/licenses/>.
	******************************************************************************/
	public Object ready_deinterlace_frames(Object sys_time) {
		Object generatedAsync_frames = this.getAsync_frames();
		obs_source_frame next_frame = generatedAsync_frames.getArray()[0];
		obs_source_frame prev_frame = NULL;
		obs_source_frame frame = NULL;
		Object generatedLast_sys_timestamp = this.getLast_sys_timestamp();
		 sys_offset = sys_time - generatedLast_sys_timestamp;
		Object generatedTimestamp = next_frame.getTimestamp();
		 frame_time = generatedTimestamp;
		 frame_offset = 0;
		 idx = 1;
		Object generatedAsync_unbuffered = this.getAsync_unbuffered();
		Object generatedDeinterlace_offset = this.getDeinterlace_offset();
		if (generatedAsync_unbuffered) {
			while (generatedAsync_frames.getNum() > 2) {
				.da_erase(generatedAsync_frames, 0);
				ModernizedCProgram.remove_async_frame(source, next_frame);
				next_frame = generatedAsync_frames.getArray()[0];
			}
			if (generatedAsync_frames.getNum() == 2) {
				 prev_frame = true;
				if (generatedAsync_unbuffered && generatedDeinterlace_offset) {
					 timestamp = generatedTimestamp;
					 after_timestamp = generatedTimestamp;
					 duration = after_timestamp - timestamp;
					 frame_end = timestamp + generatedDeinterlace_offset + duration;
					if (sys_time < frame_end) {
						prev_frame = false;
						this.setDeinterlace_frame_ts(timestamp - duration);
					} 
				} 
				generatedAsync_frames.getArray()[0].setPrev_frame(prev_frame);
			} 
			this.setDeinterlace_offset(0);
			this.setLast_frame_ts(generatedTimestamp);
			return true;
		} 
		Object generatedLast_frame_ts = this.getLast_frame_ts();
		if (ModernizedCProgram.frame_out_of_bounds(source, /* account for timestamp invalidation */frame_time)) {
			this.setLast_frame_ts(generatedTimestamp);
			this.setDeinterlace_offset(0);
			return true;
		} else {
				frame_offset = frame_time - generatedLast_frame_ts;
				generatedLast_frame_ts += sys_offset;
		} 
		while (generatedLast_frame_ts > generatedTimestamp) {
			if ((generatedLast_frame_ts - generatedTimestamp) < 2000000) {
				break;
			} 
			if (prev_frame) {
				.da_erase(generatedAsync_frames, 0);
				ModernizedCProgram.remove_async_frame(source, prev_frame);
			} 
			if (generatedAsync_frames.getNum() <= 2) {
				 exit = true;
				if (prev_frame) {
					prev_frame.setPrev_frame(true);
				}  else if (!frame && generatedAsync_frames.getNum() == 2) {
					exit = false;
				} 
				if (exit) {
					this.setDeinterlace_offset(0);
					return true;
				} 
			} 
			if (frame) {
				idx = 2;
			} else {
					idx = 1;
			} 
			prev_frame = frame;
			frame = next_frame;
			next_frame = generatedAsync_frames.getArray()[idx];
			if ((generatedTimestamp - frame_time) > /* more timestamp checking and compensating */-1024) {
				this.setLast_frame_ts(generatedTimestamp - frame_offset);
				this.setDeinterlace_offset(0);
			} 
			frame_time = generatedTimestamp;
			frame_offset = frame_time - generatedLast_frame_ts;
		}
		if (prev_frame) {
			prev_frame.setPrev_frame(true);
		} 
		return frame != NULL;
	}
	public Object first_frame() {
		if (ModernizedCProgram.s.getLast_frame_ts()) {
			return false;
		} 
		if (ModernizedCProgram.s.getAsync_frames().getNum() >= 2) {
			ModernizedCProgram.s.getAsync_frames().getArray()[0].setPrev_frame(true);
		} 
		return true;
	}
	public void deinterlace_get_closest_frames(Object sys_time) {
		video_output_info info = new video_output_info();
		 half_interval = new ();
		if (ModernizedCProgram.s.getAsync_unbuffered() && ModernizedCProgram.s.getDeinterlace_offset()) {
			 frame_end = ModernizedCProgram.s.getDeinterlace_frame_ts() + ModernizedCProgram.s.getDeinterlace_offset() + (()ModernizedCProgram.s.getDeinterlace_half_duration() * 2) - 1000000;
			if (sys_time < frame_end) {
				 diff = frame_end - sys_time;
				if (diff < -1024) {
					return ;
				} 
			} 
		} 
		// Want to keep frame if it has not elapsed.
		if (!ModernizedCProgram.s.getAsync_frames().getNum()) {
			return ;
		} 
		info = ModernizedCProgram.video_output_get_info(ModernizedCProgram.obs.getVideo().getVideo());
		half_interval = ()info.getVideo_output_info() * -1024 / ()info.getVideo_output_info();
		if (ModernizedCProgram.s.first_frame() || ModernizedCProgram.s.ready_deinterlace_frames(sys_time)) {
			 offset = new ();
			ModernizedCProgram.s.setPrev_async_frame(NULL);
			ModernizedCProgram.s.setCur_async_frame(ModernizedCProgram.s.getAsync_frames().getArray()[0]);
			.da_erase(ModernizedCProgram.s.getAsync_frames(), 0);
			if (ModernizedCProgram.s.getCur_async_frame().getPrev_frame()) {
				ModernizedCProgram.s.setPrev_async_frame(ModernizedCProgram.s.getCur_async_frame());
				ModernizedCProgram.s.setCur_async_frame(ModernizedCProgram.s.getAsync_frames().getArray()[0]);
				.da_erase(ModernizedCProgram.s.getAsync_frames(), 0);
				ModernizedCProgram.s.setDeinterlace_half_duration(.UNRECOGNIZEDFUNCTIONNAME((ModernizedCProgram.s.getCur_async_frame().getTimestamp() - ModernizedCProgram.s.getPrev_async_frame().getTimestamp()) / 2));
			} else {
					ModernizedCProgram.s.setDeinterlace_half_duration(.UNRECOGNIZEDFUNCTIONNAME((ModernizedCProgram.s.getCur_async_frame().getTimestamp() - ModernizedCProgram.s.getDeinterlace_frame_ts()) / 2));
			} 
			if (!ModernizedCProgram.s.getLast_frame_ts()) {
				ModernizedCProgram.s.setLast_frame_ts(ModernizedCProgram.s.getCur_async_frame().getTimestamp());
			} 
			ModernizedCProgram.s.setDeinterlace_frame_ts(ModernizedCProgram.s.getCur_async_frame().getTimestamp());
			offset = ModernizedCProgram.obs.getVideo().getVideo_time() - ModernizedCProgram.s.getDeinterlace_frame_ts();
			if (!ModernizedCProgram.s.getDeinterlace_offset()) {
				ModernizedCProgram.s.setDeinterlace_offset(offset);
			} else {
					 offset_diff = ModernizedCProgram.uint64_diff(ModernizedCProgram.s.getDeinterlace_offset(), offset);
					if (offset_diff > half_interval) {
						ModernizedCProgram.s.setDeinterlace_offset(offset);
					} 
			} 
		} 
	}
	public void deinterlace_process_last_frame(Object sys_time) {
		if (ModernizedCProgram.s.getPrev_async_frame()) {
			ModernizedCProgram.remove_async_frame(ModernizedCProgram.s, ModernizedCProgram.s.getPrev_async_frame());
			ModernizedCProgram.s.setPrev_async_frame(NULL);
		} 
		if (ModernizedCProgram.s.getCur_async_frame()) {
			ModernizedCProgram.remove_async_frame(ModernizedCProgram.s, ModernizedCProgram.s.getCur_async_frame());
			ModernizedCProgram.s.setCur_async_frame(NULL);
		} 
		ModernizedCProgram.s.deinterlace_get_closest_frames(sys_time);
	}
	public void set_deinterlace_texture_size() {
		Object generatedAsync_gpu_conversion = this.getAsync_gpu_conversion();
		gs_texture_render gs_texture_render = new gs_texture_render();
		int generatedAsync_channel_count = this.getAsync_channel_count();
		Object generatedAsync_prev_textures = this.getAsync_prev_textures();
		Object generatedAsync_convert_width = this.getAsync_convert_width();
		Object generatedAsync_convert_height = this.getAsync_convert_height();
		Object generatedAsync_texture_formats = this.getAsync_texture_formats();
		gs_texture gs_texture = new gs_texture();
		video_format generatedAsync_format = this.getAsync_format();
		Object generatedAsync_width = this.getAsync_width();
		Object generatedAsync_height = this.getAsync_height();
		if (generatedAsync_gpu_conversion) {
			this.setAsync_prev_texrender(gs_texture_render.gs_texrender_create(GS_BGRX, GS_ZS_NONE));
			for (int c = 0;
			 c < generatedAsync_channel_count; c++) {
				generatedAsync_prev_textures[c] = gs_texture.gs_texture_create(generatedAsync_convert_width[c], generatedAsync_convert_height[c], generatedAsync_texture_formats[c], 1, NULL, GS_DYNAMIC);
			}
		} else {
				gs_color_format format = ModernizedCProgram.convert_video_format(generatedAsync_format);
				generatedAsync_prev_textures[0] = gs_texture.gs_texture_create(generatedAsync_width, generatedAsync_height, gs_color_format.format, 1, NULL, GS_DYNAMIC);
		} 
	}
	public void deinterlace_update_async_video() {
		obs_source_frame frame = new obs_source_frame();
		 updated = new ();
		Object generatedDeinterlace_rendered = this.getDeinterlace_rendered();
		if (generatedDeinterlace_rendered) {
			return ;
		} 
		obs_source_frame obs_source_frame = new obs_source_frame();
		frame = obs_source_frame.get_prev_frame(source, updated);
		this.setDeinterlace_rendered(true);
		if (frame) {
			frame = frame.filter_async_video(source);
		} 
		Object generatedAsync_prev_textures = this.getAsync_prev_textures();
		Object generatedAsync_prev_texrender = this.getAsync_prev_texrender();
		Object generatedAsync_textures = this.getAsync_textures();
		Object generatedAsync_texrender = this.getAsync_texrender();
		if (frame) {
			if (source.set_async_texture_size(frame)) {
				source.update_async_textures(frame, generatedAsync_prev_textures, generatedAsync_prev_texrender);
			} 
			ModernizedCProgram.obs_source_release_frame(source, frame);
		}  else if (/* swap cur/prev if no previous texture */updated) {
			for ( c = 0;
			 c < MAX_AV_PLANES; c++) {
				 prev_tex = generatedAsync_prev_textures[c];
				generatedAsync_prev_textures[c] = generatedAsync_textures[c];
				generatedAsync_textures[c] = prev_tex;
			}
			if (generatedAsync_texrender) {
				 prev = generatedAsync_prev_texrender;
				this.setAsync_prev_texrender(generatedAsync_texrender);
				this.setAsync_texrender(prev);
			} 
		} 
	}
	public void deinterlace_render() {
		 effect = ModernizedCProgram.s.getDeinterlace_effect();
		 frame2_ts = new ();
		gs_effect_param gs_effect_param = new gs_effect_param();
		 image = gs_effect_param.gs_effect_get_param_by_name(effect, "image");
		 prev = gs_effect_param.gs_effect_get_param_by_name(effect, "previous_image");
		 field = gs_effect_param.gs_effect_get_param_by_name(effect, "field_order");
		 frame2 = gs_effect_param.gs_effect_get_param_by_name(effect, "frame2");
		 dimensions = gs_effect_param.gs_effect_get_param_by_name(effect, "dimensions");
		vec2 size = new vec2((double)ModernizedCProgram.s.getAsync_width(), (double)ModernizedCProgram.s.getAsync_height());
		gs_texture gs_texture = new gs_texture();
		 cur_tex = ModernizedCProgram.s.getAsync_texrender() ? gs_texture.gs_texrender_get_texture(ModernizedCProgram.s.getAsync_texrender()) : ModernizedCProgram.s.getAsync_textures()[0];
		 prev_tex = ModernizedCProgram.s.getAsync_prev_texrender() ? gs_texture.gs_texrender_get_texture(ModernizedCProgram.s.getAsync_prev_texrender()) : ModernizedCProgram.s.getAsync_prev_textures()[0];
		if (!cur_tex || !prev_tex || !ModernizedCProgram.s.getAsync_width() || !ModernizedCProgram.s.getAsync_height()) {
			return ;
		} 
		ModernizedCProgram.gs_effect_set_texture(image, cur_tex);
		ModernizedCProgram.gs_effect_set_texture(prev, prev_tex);
		field.gs_effect_set_int(ModernizedCProgram.s.getDeinterlace_top_first());
		dimensions.gs_effect_set_vec2(size);
		frame2_ts = ModernizedCProgram.s.getDeinterlace_frame_ts() + ModernizedCProgram.s.getDeinterlace_offset() + ModernizedCProgram.s.getDeinterlace_half_duration() - 1000000;
		frame2.gs_effect_set_bool(ModernizedCProgram.obs.getVideo().getVideo_time() >= frame2_ts);
		while (effect.gs_effect_loop("Draw")) {
			NULL.gs_draw_sprite(ModernizedCProgram.s.getAsync_flip() ? GS_FLIP_V : 0, ModernizedCProgram.s.getAsync_width(), ModernizedCProgram.s.getAsync_height());
		}
	}
	public void enable_deinterlacing(obs_deinterlace_mode mode) {
		ModernizedCProgram.obs_enter_graphics();
		video_format generatedAsync_format = this.getAsync_format();
		Object generatedAsync_width = this.getAsync_width();
		Object generatedAsync_height = this.getAsync_height();
		if (generatedAsync_format != VIDEO_FORMAT_NONE && generatedAsync_width != 0 && generatedAsync_height != 0) {
			source.set_deinterlace_texture_size();
		} 
		this.setDeinterlace_mode(obs_deinterlace_mode.mode);
		this.setDeinterlace_effect(ModernizedCProgram.get_effect(obs_deinterlace_mode.mode));
		Object generatedAsync_mutex = this.getAsync_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedAsync_mutex);
		obs_source_frame generatedPrev_async_frame = this.getPrev_async_frame();
		if (generatedPrev_async_frame) {
			ModernizedCProgram.remove_async_frame(source, generatedPrev_async_frame);
			this.setPrev_async_frame(NULL);
		} 
		ModernizedCProgram.pthread_mutex_unlock(generatedAsync_mutex);
		ModernizedCProgram.obs_leave_graphics();
	}
	public void disable_deinterlacing() {
		ModernizedCProgram.obs_enter_graphics();
		Object generatedAsync_prev_textures = this.getAsync_prev_textures();
		ModernizedCProgram.gs_texture_destroy(generatedAsync_prev_textures[0]);
		ModernizedCProgram.gs_texture_destroy(generatedAsync_prev_textures[1]);
		ModernizedCProgram.gs_texture_destroy(generatedAsync_prev_textures[2]);
		Object generatedAsync_prev_texrender = this.getAsync_prev_texrender();
		generatedAsync_prev_texrender.gs_texrender_destroy();
		this.setDeinterlace_mode(obs_deinterlace_mode.OBS_DEINTERLACE_MODE_DISABLE);
		generatedAsync_prev_textures[0] = NULL;
		generatedAsync_prev_textures[1] = NULL;
		generatedAsync_prev_textures[2] = NULL;
		this.setAsync_prev_texrender(NULL);
		ModernizedCProgram.obs_leave_graphics();
	}
	public void obs_source_set_deinterlace_mode(obs_deinterlace_mode mode) {
		if (!ModernizedCProgram.obs_object_valid(source, "obs_source_set_deinterlace_mode", "source")) {
			return ;
		} 
		obs_deinterlace_mode generatedDeinterlace_mode = this.getDeinterlace_mode();
		if (generatedDeinterlace_mode == obs_deinterlace_mode.mode) {
			return ;
		} 
		if (generatedDeinterlace_mode == obs_deinterlace_mode.OBS_DEINTERLACE_MODE_DISABLE) {
			source.enable_deinterlacing(obs_deinterlace_mode.mode);
		}  else if (obs_deinterlace_mode.mode == obs_deinterlace_mode.OBS_DEINTERLACE_MODE_DISABLE) {
			source.disable_deinterlacing();
		} else {
				ModernizedCProgram.obs_enter_graphics();
				this.setDeinterlace_mode(obs_deinterlace_mode.mode);
				this.setDeinterlace_effect(ModernizedCProgram.get_effect(obs_deinterlace_mode.mode));
				ModernizedCProgram.obs_leave_graphics();
		} 
	}
	public void obs_source_set_deinterlace_field_order(obs_deinterlace_field_order field_order) {
		if (!ModernizedCProgram.obs_object_valid(source, "obs_source_set_deinterlace_field_order", "source")) {
			return ;
		} 
		this.setDeinterlace_top_first(obs_deinterlace_field_order.field_order == obs_deinterlace_field_order.OBS_DEINTERLACE_FIELD_ORDER_TOP);
	}
	public obs_source obs_view_get_source(obs_view view, Object channel) {
		obs_source_t source = new obs_source_t();
		.assert(channel < 64);
		if (!view) {
			return NULL;
		} 
		if (channel >= 64) {
			return NULL;
		} 
		Object generatedChannels_mutex = view.getChannels_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedChannels_mutex);
		Object generatedChannels = view.getChannels();
		source = generatedChannels[channel];
		if (source) {
			source.obs_source_addref();
		} 
		ModernizedCProgram.pthread_mutex_unlock(generatedChannels_mutex);
		return source;
	}
	public obs_context_data getContext() {
		return context;
	}
	public void setContext(obs_context_data newContext) {
		context = newContext;
	}
	public obs_source_info getInfo() {
		return info;
	}
	public void setInfo(obs_source_info newInfo) {
		info = newInfo;
	}
	public obs_weak_source getControl() {
		return control;
	}
	public void setControl(obs_weak_source newControl) {
		control = newControl;
	}
	public Object getFlags() {
		return flags;
	}
	public void setFlags(Object newFlags) {
		flags = newFlags;
	}
	public Object getDefault_flags() {
		return default_flags;
	}
	public void setDefault_flags(Object newDefault_flags) {
		default_flags = newDefault_flags;
	}
	public Object getLast_obs_ver() {
		return last_obs_ver;
	}
	public void setLast_obs_ver(Object newLast_obs_ver) {
		last_obs_ver = newLast_obs_ver;
	}
	public Object getOwns_info_id() {
		return owns_info_id;
	}
	public void setOwns_info_id(Object newOwns_info_id) {
		owns_info_id = newOwns_info_id;
	}
	public Object getDefer_update() {
		return defer_update;
	}
	public void setDefer_update(Object newDefer_update) {
		defer_update = newDefer_update;
	}
	public Object getShow_refs() {
		return show_refs;
	}
	public void setShow_refs(Object newShow_refs) {
		show_refs = newShow_refs;
	}
	public Object getActivate_refs() {
		return activate_refs;
	}
	public void setActivate_refs(Object newActivate_refs) {
		activate_refs = newActivate_refs;
	}
	public Object getRemoved() {
		return removed;
	}
	public void setRemoved(Object newRemoved) {
		removed = newRemoved;
	}
	public Object getActive() {
		return active;
	}
	public void setActive(Object newActive) {
		active = newActive;
	}
	public Object getShowing() {
		return showing;
	}
	public void setShowing(Object newShowing) {
		showing = newShowing;
	}
	public Object getEnabled() {
		return enabled;
	}
	public void setEnabled(Object newEnabled) {
		enabled = newEnabled;
	}
	public Object getTiming_set() {
		return timing_set;
	}
	public void setTiming_set(Object newTiming_set) {
		timing_set = newTiming_set;
	}
	public Object getTiming_adjust() {
		return timing_adjust;
	}
	public void setTiming_adjust(Object newTiming_adjust) {
		timing_adjust = newTiming_adjust;
	}
	public Object getResample_offset() {
		return resample_offset;
	}
	public void setResample_offset(Object newResample_offset) {
		resample_offset = newResample_offset;
	}
	public Object getLast_audio_ts() {
		return last_audio_ts;
	}
	public void setLast_audio_ts(Object newLast_audio_ts) {
		last_audio_ts = newLast_audio_ts;
	}
	public Object getNext_audio_ts_min() {
		return next_audio_ts_min;
	}
	public void setNext_audio_ts_min(Object newNext_audio_ts_min) {
		next_audio_ts_min = newNext_audio_ts_min;
	}
	public Object getNext_audio_sys_ts_min() {
		return next_audio_sys_ts_min;
	}
	public void setNext_audio_sys_ts_min(Object newNext_audio_sys_ts_min) {
		next_audio_sys_ts_min = newNext_audio_sys_ts_min;
	}
	public Object getLast_frame_ts() {
		return last_frame_ts;
	}
	public void setLast_frame_ts(Object newLast_frame_ts) {
		last_frame_ts = newLast_frame_ts;
	}
	public Object getLast_sys_timestamp() {
		return last_sys_timestamp;
	}
	public void setLast_sys_timestamp(Object newLast_sys_timestamp) {
		last_sys_timestamp = newLast_sys_timestamp;
	}
	public Object getAsync_rendered() {
		return async_rendered;
	}
	public void setAsync_rendered(Object newAsync_rendered) {
		async_rendered = newAsync_rendered;
	}
	public Object getAudio_failed() {
		return audio_failed;
	}
	public void setAudio_failed(Object newAudio_failed) {
		audio_failed = newAudio_failed;
	}
	public Object getAudio_pending() {
		return audio_pending;
	}
	public void setAudio_pending(Object newAudio_pending) {
		audio_pending = newAudio_pending;
	}
	public Object getPending_stop() {
		return pending_stop;
	}
	public void setPending_stop(Object newPending_stop) {
		pending_stop = newPending_stop;
	}
	public Object getAudio_active() {
		return audio_active;
	}
	public void setAudio_active(Object newAudio_active) {
		audio_active = newAudio_active;
	}
	public Object getUser_muted() {
		return user_muted;
	}
	public void setUser_muted(Object newUser_muted) {
		user_muted = newUser_muted;
	}
	public Object getMuted() {
		return muted;
	}
	public void setMuted(Object newMuted) {
		muted = newMuted;
	}
	public obs_source getNext_audio_source() {
		return next_audio_source;
	}
	public void setNext_audio_source(obs_source newNext_audio_source) {
		next_audio_source = newNext_audio_source;
	}
	public obs_source getPrev_next_audio_source() {
		return prev_next_audio_source;
	}
	public void setPrev_next_audio_source(obs_source newPrev_next_audio_source) {
		prev_next_audio_source = newPrev_next_audio_source;
	}
	public Object getAudio_ts() {
		return audio_ts;
	}
	public void setAudio_ts(Object newAudio_ts) {
		audio_ts = newAudio_ts;
	}
	public Object getAudio_input_buf() {
		return audio_input_buf;
	}
	public void setAudio_input_buf(Object newAudio_input_buf) {
		audio_input_buf = newAudio_input_buf;
	}
	public Object getLast_audio_input_buf_size() {
		return last_audio_input_buf_size;
	}
	public void setLast_audio_input_buf_size(Object newLast_audio_input_buf_size) {
		last_audio_input_buf_size = newLast_audio_input_buf_size;
	}
	public Object get() {
		return ;
	}
	public void set(Object new) {
		 = new;
	}
	public Object getAudio_output_buf() {
		return audio_output_buf;
	}
	public void setAudio_output_buf(Object newAudio_output_buf) {
		audio_output_buf = newAudio_output_buf;
	}
	public Object getAudio_mix_buf() {
		return audio_mix_buf;
	}
	public void setAudio_mix_buf(Object newAudio_mix_buf) {
		audio_mix_buf = newAudio_mix_buf;
	}
	public resample_info getSample_info() {
		return sample_info;
	}
	public void setSample_info(resample_info newSample_info) {
		sample_info = newSample_info;
	}
	public Object getResampler() {
		return resampler;
	}
	public void setResampler(Object newResampler) {
		resampler = newResampler;
	}
	public Object getAudio_actions_mutex() {
		return audio_actions_mutex;
	}
	public void setAudio_actions_mutex(Object newAudio_actions_mutex) {
		audio_actions_mutex = newAudio_actions_mutex;
	}
	public Object getAudio_buf_mutex() {
		return audio_buf_mutex;
	}
	public void setAudio_buf_mutex(Object newAudio_buf_mutex) {
		audio_buf_mutex = newAudio_buf_mutex;
	}
	public Object getAudio_mutex() {
		return audio_mutex;
	}
	public void setAudio_mutex(Object newAudio_mutex) {
		audio_mutex = newAudio_mutex;
	}
	public Object getAudio_cb_mutex() {
		return audio_cb_mutex;
	}
	public void setAudio_cb_mutex(Object newAudio_cb_mutex) {
		audio_cb_mutex = newAudio_cb_mutex;
	}
	public Object get() {
		return ;
	}
	public void set(Object new) {
		 = new;
	}
	public obs_audio_data getAudio_data() {
		return audio_data;
	}
	public void setAudio_data(obs_audio_data newAudio_data) {
		audio_data = newAudio_data;
	}
	public Object getAudio_storage_size() {
		return audio_storage_size;
	}
	public void setAudio_storage_size(Object newAudio_storage_size) {
		audio_storage_size = newAudio_storage_size;
	}
	public Object getAudio_mixers() {
		return audio_mixers;
	}
	public void setAudio_mixers(Object newAudio_mixers) {
		audio_mixers = newAudio_mixers;
	}
	public double getUser_volume() {
		return user_volume;
	}
	public void setUser_volume(double newUser_volume) {
		user_volume = newUser_volume;
	}
	public double getVolume() {
		return volume;
	}
	public void setVolume(double newVolume) {
		volume = newVolume;
	}
	public Object getSync_offset() {
		return sync_offset;
	}
	public void setSync_offset(Object newSync_offset) {
		sync_offset = newSync_offset;
	}
	public Object getLast_sync_offset() {
		return last_sync_offset;
	}
	public void setLast_sync_offset(Object newLast_sync_offset) {
		last_sync_offset = newLast_sync_offset;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double newBalance) {
		balance = newBalance;
	}
	public Object getAsync_textures() {
		return async_textures;
	}
	public void setAsync_textures(Object newAsync_textures) {
		async_textures = newAsync_textures;
	}
	public Object getAsync_texrender() {
		return async_texrender;
	}
	public void setAsync_texrender(Object newAsync_texrender) {
		async_texrender = newAsync_texrender;
	}
	public obs_source_frame getCur_async_frame() {
		return cur_async_frame;
	}
	public void setCur_async_frame(obs_source_frame newCur_async_frame) {
		cur_async_frame = newCur_async_frame;
	}
	public Object getAsync_gpu_conversion() {
		return async_gpu_conversion;
	}
	public void setAsync_gpu_conversion(Object newAsync_gpu_conversion) {
		async_gpu_conversion = newAsync_gpu_conversion;
	}
	public video_format getAsync_format() {
		return async_format;
	}
	public void setAsync_format(video_format newAsync_format) {
		async_format = newAsync_format;
	}
	public Object getAsync_full_range() {
		return async_full_range;
	}
	public void setAsync_full_range(Object newAsync_full_range) {
		async_full_range = newAsync_full_range;
	}
	public video_format getAsync_cache_format() {
		return async_cache_format;
	}
	public void setAsync_cache_format(video_format newAsync_cache_format) {
		async_cache_format = newAsync_cache_format;
	}
	public Object getAsync_cache_full_range() {
		return async_cache_full_range;
	}
	public void setAsync_cache_full_range(Object newAsync_cache_full_range) {
		async_cache_full_range = newAsync_cache_full_range;
	}
	public Object getAsync_texture_formats() {
		return async_texture_formats;
	}
	public void setAsync_texture_formats(Object newAsync_texture_formats) {
		async_texture_formats = newAsync_texture_formats;
	}
	public int getAsync_channel_count() {
		return async_channel_count;
	}
	public void setAsync_channel_count(int newAsync_channel_count) {
		async_channel_count = newAsync_channel_count;
	}
	public Object getAsync_flip() {
		return async_flip;
	}
	public void setAsync_flip(Object newAsync_flip) {
		async_flip = newAsync_flip;
	}
	public Object getAsync_active() {
		return async_active;
	}
	public void setAsync_active(Object newAsync_active) {
		async_active = newAsync_active;
	}
	public Object getAsync_update_texture() {
		return async_update_texture;
	}
	public void setAsync_update_texture(Object newAsync_update_texture) {
		async_update_texture = newAsync_update_texture;
	}
	public Object getAsync_unbuffered() {
		return async_unbuffered;
	}
	public void setAsync_unbuffered(Object newAsync_unbuffered) {
		async_unbuffered = newAsync_unbuffered;
	}
	public Object getAsync_decoupled() {
		return async_decoupled;
	}
	public void setAsync_decoupled(Object newAsync_decoupled) {
		async_decoupled = newAsync_decoupled;
	}
	public obs_source_frame getAsync_preload_frame() {
		return async_preload_frame;
	}
	public void setAsync_preload_frame(obs_source_frame newAsync_preload_frame) {
		async_preload_frame = newAsync_preload_frame;
	}
	public Object get() {
		return ;
	}
	public void set(Object new) {
		 = new;
	}
	public Object get() {
		return ;
	}
	public void set(Object new) {
		 = new;
	}
	public Object getAsync_mutex() {
		return async_mutex;
	}
	public void setAsync_mutex(Object newAsync_mutex) {
		async_mutex = newAsync_mutex;
	}
	public Object getAsync_width() {
		return async_width;
	}
	public void setAsync_width(Object newAsync_width) {
		async_width = newAsync_width;
	}
	public Object getAsync_height() {
		return async_height;
	}
	public void setAsync_height(Object newAsync_height) {
		async_height = newAsync_height;
	}
	public Object getAsync_cache_width() {
		return async_cache_width;
	}
	public void setAsync_cache_width(Object newAsync_cache_width) {
		async_cache_width = newAsync_cache_width;
	}
	public Object getAsync_cache_height() {
		return async_cache_height;
	}
	public void setAsync_cache_height(Object newAsync_cache_height) {
		async_cache_height = newAsync_cache_height;
	}
	public Object getAsync_convert_width() {
		return async_convert_width;
	}
	public void setAsync_convert_width(Object newAsync_convert_width) {
		async_convert_width = newAsync_convert_width;
	}
	public Object getAsync_convert_height() {
		return async_convert_height;
	}
	public void setAsync_convert_height(Object newAsync_convert_height) {
		async_convert_height = newAsync_convert_height;
	}
	public Object getDeinterlace_offset() {
		return deinterlace_offset;
	}
	public void setDeinterlace_offset(Object newDeinterlace_offset) {
		deinterlace_offset = newDeinterlace_offset;
	}
	public Object getDeinterlace_frame_ts() {
		return deinterlace_frame_ts;
	}
	public void setDeinterlace_frame_ts(Object newDeinterlace_frame_ts) {
		deinterlace_frame_ts = newDeinterlace_frame_ts;
	}
	public Object getDeinterlace_effect() {
		return deinterlace_effect;
	}
	public void setDeinterlace_effect(Object newDeinterlace_effect) {
		deinterlace_effect = newDeinterlace_effect;
	}
	public obs_source_frame getPrev_async_frame() {
		return prev_async_frame;
	}
	public void setPrev_async_frame(obs_source_frame newPrev_async_frame) {
		prev_async_frame = newPrev_async_frame;
	}
	public Object getAsync_prev_textures() {
		return async_prev_textures;
	}
	public void setAsync_prev_textures(Object newAsync_prev_textures) {
		async_prev_textures = newAsync_prev_textures;
	}
	public Object getAsync_prev_texrender() {
		return async_prev_texrender;
	}
	public void setAsync_prev_texrender(Object newAsync_prev_texrender) {
		async_prev_texrender = newAsync_prev_texrender;
	}
	public Object getDeinterlace_half_duration() {
		return deinterlace_half_duration;
	}
	public void setDeinterlace_half_duration(Object newDeinterlace_half_duration) {
		deinterlace_half_duration = newDeinterlace_half_duration;
	}
	public obs_deinterlace_mode getDeinterlace_mode() {
		return deinterlace_mode;
	}
	public void setDeinterlace_mode(obs_deinterlace_mode newDeinterlace_mode) {
		deinterlace_mode = newDeinterlace_mode;
	}
	public Object getDeinterlace_top_first() {
		return deinterlace_top_first;
	}
	public void setDeinterlace_top_first(Object newDeinterlace_top_first) {
		deinterlace_top_first = newDeinterlace_top_first;
	}
	public Object getDeinterlace_rendered() {
		return deinterlace_rendered;
	}
	public void setDeinterlace_rendered(Object newDeinterlace_rendered) {
		deinterlace_rendered = newDeinterlace_rendered;
	}
	public obs_source getFilter_parent() {
		return filter_parent;
	}
	public void setFilter_parent(obs_source newFilter_parent) {
		filter_parent = newFilter_parent;
	}
	public obs_source getFilter_target() {
		return filter_target;
	}
	public void setFilter_target(obs_source newFilter_target) {
		filter_target = newFilter_target;
	}
	public Object get() {
		return ;
	}
	public void set(Object new) {
		 = new;
	}
	public Object getFilter_mutex() {
		return filter_mutex;
	}
	public void setFilter_mutex(Object newFilter_mutex) {
		filter_mutex = newFilter_mutex;
	}
	public Object getFilter_texrender() {
		return filter_texrender;
	}
	public void setFilter_texrender(Object newFilter_texrender) {
		filter_texrender = newFilter_texrender;
	}
	public obs_allow_direct_render getAllow_direct() {
		return allow_direct;
	}
	public void setAllow_direct(obs_allow_direct_render newAllow_direct) {
		allow_direct = newAllow_direct;
	}
	public Object getRendering_filter() {
		return rendering_filter;
	}
	public void setRendering_filter(Object newRendering_filter) {
		rendering_filter = newRendering_filter;
	}
	public Object getMute_unmute_key() {
		return mute_unmute_key;
	}
	public void setMute_unmute_key(Object newMute_unmute_key) {
		mute_unmute_key = newMute_unmute_key;
	}
	public Object getPush_to_mute_key() {
		return push_to_mute_key;
	}
	public void setPush_to_mute_key(Object newPush_to_mute_key) {
		push_to_mute_key = newPush_to_mute_key;
	}
	public Object getPush_to_talk_key() {
		return push_to_talk_key;
	}
	public void setPush_to_talk_key(Object newPush_to_talk_key) {
		push_to_talk_key = newPush_to_talk_key;
	}
	public Object getPush_to_mute_enabled() {
		return push_to_mute_enabled;
	}
	public void setPush_to_mute_enabled(Object newPush_to_mute_enabled) {
		push_to_mute_enabled = newPush_to_mute_enabled;
	}
	public Object getPush_to_mute_pressed() {
		return push_to_mute_pressed;
	}
	public void setPush_to_mute_pressed(Object newPush_to_mute_pressed) {
		push_to_mute_pressed = newPush_to_mute_pressed;
	}
	public Object getUser_push_to_mute_pressed() {
		return user_push_to_mute_pressed;
	}
	public void setUser_push_to_mute_pressed(Object newUser_push_to_mute_pressed) {
		user_push_to_mute_pressed = newUser_push_to_mute_pressed;
	}
	public Object getPush_to_talk_enabled() {
		return push_to_talk_enabled;
	}
	public void setPush_to_talk_enabled(Object newPush_to_talk_enabled) {
		push_to_talk_enabled = newPush_to_talk_enabled;
	}
	public Object getPush_to_talk_pressed() {
		return push_to_talk_pressed;
	}
	public void setPush_to_talk_pressed(Object newPush_to_talk_pressed) {
		push_to_talk_pressed = newPush_to_talk_pressed;
	}
	public Object getUser_push_to_talk_pressed() {
		return user_push_to_talk_pressed;
	}
	public void setUser_push_to_talk_pressed(Object newUser_push_to_talk_pressed) {
		user_push_to_talk_pressed = newUser_push_to_talk_pressed;
	}
	public Object getPush_to_mute_delay() {
		return push_to_mute_delay;
	}
	public void setPush_to_mute_delay(Object newPush_to_mute_delay) {
		push_to_mute_delay = newPush_to_mute_delay;
	}
	public Object getPush_to_mute_stop_time() {
		return push_to_mute_stop_time;
	}
	public void setPush_to_mute_stop_time(Object newPush_to_mute_stop_time) {
		push_to_mute_stop_time = newPush_to_mute_stop_time;
	}
	public Object getPush_to_talk_delay() {
		return push_to_talk_delay;
	}
	public void setPush_to_talk_delay(Object newPush_to_talk_delay) {
		push_to_talk_delay = newPush_to_talk_delay;
	}
	public Object getPush_to_talk_stop_time() {
		return push_to_talk_stop_time;
	}
	public void setPush_to_talk_stop_time(Object newPush_to_talk_stop_time) {
		push_to_talk_stop_time = newPush_to_talk_stop_time;
	}
	public Object getTransition_start_time() {
		return transition_start_time;
	}
	public void setTransition_start_time(Object newTransition_start_time) {
		transition_start_time = newTransition_start_time;
	}
	public Object getTransition_duration() {
		return transition_duration;
	}
	public void setTransition_duration(Object newTransition_duration) {
		transition_duration = newTransition_duration;
	}
	public Object getTransition_tex_mutex() {
		return transition_tex_mutex;
	}
	public void setTransition_tex_mutex(Object newTransition_tex_mutex) {
		transition_tex_mutex = newTransition_tex_mutex;
	}
	public Object getTransition_texrender() {
		return transition_texrender;
	}
	public void setTransition_texrender(Object newTransition_texrender) {
		transition_texrender = newTransition_texrender;
	}
	public Object getTransition_mutex() {
		return transition_mutex;
	}
	public void setTransition_mutex(Object newTransition_mutex) {
		transition_mutex = newTransition_mutex;
	}
	public Object getTransition_sources() {
		return transition_sources;
	}
	public void setTransition_sources(Object newTransition_sources) {
		transition_sources = newTransition_sources;
	}
	public Object getTransitioning_video() {
		return transitioning_video;
	}
	public void setTransitioning_video(Object newTransitioning_video) {
		transitioning_video = newTransitioning_video;
	}
	public Object getTransitioning_audio() {
		return transitioning_audio;
	}
	public void setTransitioning_audio(Object newTransitioning_audio) {
		transitioning_audio = newTransitioning_audio;
	}
	public Object getTransition_source_active() {
		return transition_source_active;
	}
	public void setTransition_source_active(Object newTransition_source_active) {
		transition_source_active = newTransition_source_active;
	}
	public Object getTransition_alignment() {
		return transition_alignment;
	}
	public void setTransition_alignment(Object newTransition_alignment) {
		transition_alignment = newTransition_alignment;
	}
	public Object getTransition_actual_cx() {
		return transition_actual_cx;
	}
	public void setTransition_actual_cx(Object newTransition_actual_cx) {
		transition_actual_cx = newTransition_actual_cx;
	}
	public Object getTransition_actual_cy() {
		return transition_actual_cy;
	}
	public void setTransition_actual_cy(Object newTransition_actual_cy) {
		transition_actual_cy = newTransition_actual_cy;
	}
	public Object getTransition_cx() {
		return transition_cx;
	}
	public void setTransition_cx(Object newTransition_cx) {
		transition_cx = newTransition_cx;
	}
	public Object getTransition_cy() {
		return transition_cy;
	}
	public void setTransition_cy(Object newTransition_cy) {
		transition_cy = newTransition_cy;
	}
	public Object getTransition_fixed_duration() {
		return transition_fixed_duration;
	}
	public void setTransition_fixed_duration(Object newTransition_fixed_duration) {
		transition_fixed_duration = newTransition_fixed_duration;
	}
	public Object getTransition_use_fixed_duration() {
		return transition_use_fixed_duration;
	}
	public void setTransition_use_fixed_duration(Object newTransition_use_fixed_duration) {
		transition_use_fixed_duration = newTransition_use_fixed_duration;
	}
	public obs_transition_mode getTransition_mode() {
		return transition_mode;
	}
	public void setTransition_mode(obs_transition_mode newTransition_mode) {
		transition_mode = newTransition_mode;
	}
	public obs_transition_scale_type getTransition_scale_type() {
		return transition_scale_type;
	}
	public void setTransition_scale_type(obs_transition_scale_type newTransition_scale_type) {
		transition_scale_type = newTransition_scale_type;
	}
	public Object getTransition_matrices() {
		return transition_matrices;
	}
	public void setTransition_matrices(Object newTransition_matrices) {
		transition_matrices = newTransition_matrices;
	}
	public audio_monitor getMonitor() {
		return monitor;
	}
	public void setMonitor(audio_monitor newMonitor) {
		monitor = newMonitor;
	}
	public obs_monitoring_type getMonitoring_type() {
		return monitoring_type;
	}
	public void setMonitoring_type(obs_monitoring_type newMonitoring_type) {
		monitoring_type = newMonitoring_type;
	}
	public obs_data getPrivate_settings() {
		return private_settings;
	}
	public void setPrivate_settings(obs_data newPrivate_settings) {
		private_settings = newPrivate_settings;
	}
}

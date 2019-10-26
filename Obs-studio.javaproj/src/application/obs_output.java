package application;

public class obs_output {
	private obs_context_data context;
	private obs_output_info info;
	private obs_weak_output control;
	private Object owns_info_id;
	private Object received_video;
	private Object received_audio;
	private Object data_active;
	private Object end_data_capture_thread_active;
	private Object video_offset;
	private Object audio_offsets;
	private Object highest_audio_ts;
	private Object highest_video_ts;
	private Object end_data_capture_thread;
	private Object stopping_event;
	private Object interleaved_mutex;
	private Object ;
	private int stop_code;
	private int reconnect_retry_sec;
	private int reconnect_retry_max;
	private int reconnect_retries;
	private int reconnect_retry_cur_sec;
	private Object reconnect_thread;
	private Object reconnect_stop_event;
	private Object reconnecting;
	private Object reconnect_thread_active;
	private Object starting_drawn_count;
	private Object starting_lagged_count;
	private Object starting_frame_count;
	private int total_frames;
	private Object active;
	private Object paused;
	private Object video;
	private Object audio;
	private obs_encoder video_encoder;
	private Object audio_encoders;
	private obs_service service;
	private Object mixer_mask;
	private pause_data pause;
	private Object audio_buffer;
	private Object audio_start_ts;
	private Object video_start_ts;
	private Object audio_size;
	private Object planes;
	private Object sample_rate;
	private Object total_audio_frames;
	private Object scaled_width;
	private Object scaled_height;
	private Object video_conversion_set;
	private Object audio_conversion_set;
	private video_scale_info video_conversion;
	private audio_convert_info audio_conversion;
	private Object caption_mutex;
	private double caption_timestamp;
	private caption_text caption_head;
	private caption_text caption_tail;
	private Object valid;
	private Object active_delay_ns;
	private Object delay_callback;
	private circlebuf delay_data;
	private Object delay_mutex;
	private Object delay_sec;
	private Object delay_flags;
	private Object delay_cur_flags;
	private Object delay_restart_refs;
	private Object delay_active;
	private Object delay_capturing;
	private Byte last_error_message;
	private Object audio_data;
	
	public obs_output(obs_context_data context, obs_output_info info, obs_weak_output control, Object owns_info_id, Object received_video, Object received_audio, Object data_active, Object end_data_capture_thread_active, Object video_offset, Object audio_offsets, Object highest_audio_ts, Object highest_video_ts, Object end_data_capture_thread, Object stopping_event, Object interleaved_mutex, Object,  int stop_code, int reconnect_retry_sec, int reconnect_retry_max, int reconnect_retries, int reconnect_retry_cur_sec, Object reconnect_thread, Object reconnect_stop_event, Object reconnecting, Object reconnect_thread_active, Object starting_drawn_count, Object starting_lagged_count, Object starting_frame_count, int total_frames, Object active, Object paused, Object video, Object audio, obs_encoder video_encoder, Object audio_encoders, obs_service service, Object mixer_mask, pause_data pause, Object audio_buffer, Object audio_start_ts, Object video_start_ts, Object audio_size, Object planes, Object sample_rate, Object total_audio_frames, Object scaled_width, Object scaled_height, Object video_conversion_set, Object audio_conversion_set, video_scale_info video_conversion, audio_convert_info audio_conversion, Object caption_mutex, double caption_timestamp, caption_text caption_head, caption_text caption_tail, Object valid, Object active_delay_ns, Object delay_callback, circlebuf delay_data, Object delay_mutex, Object delay_sec, Object delay_flags, Object delay_cur_flags, Object delay_restart_refs, Object delay_active, Object delay_capturing, Byte last_error_message, Object audio_data) {
		setContext(context);
		setInfo(info);
		setControl(control);
		setOwns_info_id(owns_info_id);
		setReceived_video(received_video);
		setReceived_audio(received_audio);
		setData_active(data_active);
		setEnd_data_capture_thread_active(end_data_capture_thread_active);
		setVideo_offset(video_offset);
		setAudio_offsets(audio_offsets);
		setHighest_audio_ts(highest_audio_ts);
		setHighest_video_ts(highest_video_ts);
		setEnd_data_capture_thread(end_data_capture_thread);
		setStopping_event(stopping_event);
		setInterleaved_mutex(interleaved_mutex);
		set();
		setStop_code(stop_code);
		setReconnect_retry_sec(reconnect_retry_sec);
		setReconnect_retry_max(reconnect_retry_max);
		setReconnect_retries(reconnect_retries);
		setReconnect_retry_cur_sec(reconnect_retry_cur_sec);
		setReconnect_thread(reconnect_thread);
		setReconnect_stop_event(reconnect_stop_event);
		setReconnecting(reconnecting);
		setReconnect_thread_active(reconnect_thread_active);
		setStarting_drawn_count(starting_drawn_count);
		setStarting_lagged_count(starting_lagged_count);
		setStarting_frame_count(starting_frame_count);
		setTotal_frames(total_frames);
		setActive(active);
		setPaused(paused);
		setVideo(video);
		setAudio(audio);
		setVideo_encoder(video_encoder);
		setAudio_encoders(audio_encoders);
		setService(service);
		setMixer_mask(mixer_mask);
		setPause(pause);
		setAudio_buffer(audio_buffer);
		setAudio_start_ts(audio_start_ts);
		setVideo_start_ts(video_start_ts);
		setAudio_size(audio_size);
		setPlanes(planes);
		setSample_rate(sample_rate);
		setTotal_audio_frames(total_audio_frames);
		setScaled_width(scaled_width);
		setScaled_height(scaled_height);
		setVideo_conversion_set(video_conversion_set);
		setAudio_conversion_set(audio_conversion_set);
		setVideo_conversion(video_conversion);
		setAudio_conversion(audio_conversion);
		setCaption_mutex(caption_mutex);
		setCaption_timestamp(caption_timestamp);
		setCaption_head(caption_head);
		setCaption_tail(caption_tail);
		setValid(valid);
		setActive_delay_ns(active_delay_ns);
		setDelay_callback(delay_callback);
		setDelay_data(delay_data);
		setDelay_mutex(delay_mutex);
		setDelay_sec(delay_sec);
		setDelay_flags(delay_flags);
		setDelay_cur_flags(delay_cur_flags);
		setDelay_restart_refs(delay_restart_refs);
		setDelay_active(delay_active);
		setDelay_capturing(delay_capturing);
		setLast_error_message(last_error_message);
		setAudio_data(audio_data);
	}
	public obs_output() {
	}
	
	public void obs_output_cleanup_delay() {
		delay_data dd = new delay_data();
		circlebuf generatedDelay_data = this.getDelay_data();
		Object generatedCirclebuf = generatedDelay_data.getCirclebuf();
		delay_msg generatedMsg = dd.getMsg();
		encoder_packet generatedPacket = dd.getPacket();
		while (generatedCirclebuf) {
			generatedDelay_data.circlebuf_pop_front(dd, );
			if (generatedMsg == delay_msg.DELAY_MSG_PACKET) {
				generatedPacket.obs_encoder_packet_release();
			} 
		}
		this.setActive_delay_ns(0);
		Object generatedDelay_restart_refs = this.getDelay_restart_refs();
		ModernizedCProgram.os_atomic_set_long(generatedDelay_restart_refs, 0);
	}
	public Object pop_packet(Object t) {
		uint64_t elapsed_time = new uint64_t();
		delay_data dd = new delay_data();
		 popped = false;
		 preserve = new ();
		Object generatedDelay_cur_flags = this.getDelay_cur_flags();
		preserve = (generatedDelay_cur_flags & (1 << 0)) != /* ------------------------------------------------ */0;
		Object generatedDelay_mutex = this.getDelay_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedDelay_mutex);
		circlebuf generatedDelay_data = this.getDelay_data();
		Object generatedCirclebuf = generatedDelay_data.getCirclebuf();
		Object generatedTs = dd.getTs();
		Object generatedReconnecting = this.getReconnecting();
		Object generatedActive_delay_ns = this.getActive_delay_ns();
		if (generatedCirclebuf) {
			generatedDelay_data.circlebuf_peek_front(dd, );
			elapsed_time = (t - generatedTs);
			if (preserve && generatedReconnecting) {
				this.setActive_delay_ns(elapsed_time);
			}  else if (elapsed_time > generatedActive_delay_ns) {
				generatedDelay_data.circlebuf_pop_front(NULL, );
				popped = true;
			} 
		} 
		ModernizedCProgram.pthread_mutex_unlock(generatedDelay_mutex);
		if (/* ------------------------------------------------ */popped) {
			ModernizedCProgram.process_delay_data(output, dd);
		} 
		return popped;
	}
	public void obs_output_signal_delay(Object signal) {
		calldata params = new calldata();
		uint8_t[] stack = new uint8_t();
		params.calldata_init_fixed(stack, );
		params.calldata_set_ptr("output", output);
		Object generatedActive_delay_ns = this.getActive_delay_ns();
		params.calldata_set_int("sec", generatedActive_delay_ns / 1000000000);
		obs_context_data generatedContext = this.getContext();
		Object generatedSignals = generatedContext.getSignals();
		.signal_handler_signal(generatedSignals, signal, params);
	}
	public Object obs_output_delay_start() {
		delay_data dd = new delay_data(, );
		if (!ModernizedCProgram.delay_active(output)) {
			 can_begin = ModernizedCProgram.obs_output_can_begin_data_capture(output, 0);
			if (!can_begin) {
				return false;
			} 
			if (!output.obs_output_initialize_encoders(0)) {
				return false;
			} 
		} 
		Object generatedDelay_mutex = this.getDelay_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedDelay_mutex);
		circlebuf generatedDelay_data = this.getDelay_data();
		generatedDelay_data.circlebuf_push_back(dd, );
		ModernizedCProgram.pthread_mutex_unlock(generatedDelay_mutex);
		Object generatedDelay_restart_refs = this.getDelay_restart_refs();
		ModernizedCProgram.os_atomic_inc_long(generatedDelay_restart_refs);
		if (ModernizedCProgram.delay_active(output)) {
			output.do_output_signal("starting");
			return true;
		} 
		if (!output.obs_output_begin_data_capture(0)) {
			output.obs_output_cleanup_delay();
			return false;
		} 
		return true;
	}
	public void obs_output_delay_stop() {
		delay_data dd = new delay_data(, );
		Object generatedDelay_mutex = this.getDelay_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedDelay_mutex);
		circlebuf generatedDelay_data = this.getDelay_data();
		generatedDelay_data.circlebuf_push_back(dd, );
		ModernizedCProgram.pthread_mutex_unlock(generatedDelay_mutex);
		output.do_output_signal("stopping");
	}
	public void obs_output_set_delay(Object delay_sec, Object flags) {
		if (!ModernizedCProgram.obs_object_valid(output, "obs_output_set_delay", "output")) {
			return ;
		} 
		obs_output_info generatedInfo = this.getInfo();
		Object generatedFlags = generatedInfo.getFlags();
		obs_context_data generatedContext = this.getContext();
		Byte generatedName = generatedContext.getName();
		if ((generatedFlags & (1 << 2)) == 0) {
			ModernizedCProgram.blog(LOG_WARNING, "Output '%s': Tried to set a delay value on a non-encoded output", generatedName);
			return ;
		} 
		this.setDelay_sec(delay_sec);
		this.setDelay_flags(flags);
	}
	public Object obs_hotkey_register_output(Object name, Object description, Object func, Object data) {
		if (!output || !ModernizedCProgram.lock()) {
			return (~(obs_hotkey_id)0);
		} 
		obs_weak_output obs_weak_output = new obs_weak_output();
		obs_context_data generatedContext = this.getContext();
		obs_hotkey_id id = generatedContext.obs_hotkey_register_internal(obs_hotkey_registerer_type.OBS_HOTKEY_REGISTERER_OUTPUT, obs_weak_output.obs_output_get_weak_output(output), name, description, func, data);
		ModernizedCProgram.unlock();
		return id;
	}
	public Object obs_hotkey_pair_register_output(Object name0, Object description0, Object name1, Object description1, Object func0, Object func1, Object data0, Object data1) {
		if (!output) {
			return (~(obs_hotkey_pair_id)0);
		} 
		obs_context_data generatedContext = this.getContext();
		return generatedContext.register_hotkey_pair_internal(obs_hotkey_registerer_type.OBS_HOTKEY_REGISTERER_OUTPUT, output, weak_output_ref, name0, description0, name1, description1, func0, func1, data0, data1);
	}
	public Object build_flv_meta_data(Object output, Object size, Object a_idx) {
		obs_encoder obs_encoder = new obs_encoder();
		obs_encoder_t vencoder = obs_encoder.obs_output_get_video_encoder(context);
		obs_encoder obs_encoder = new obs_encoder();
		obs_encoder_t aencoder = obs_encoder.obs_output_get_audio_encoder(context, a_idx);
		 video = ModernizedCProgram.obs_encoder_video(vencoder);
		 audio = ModernizedCProgram.obs_encoder_audio(aencoder);
		byte[] buf = new byte[4096];
		byte enc = buf;
		byte end = enc + ;
		dstr encoder_name = new dstr(0);
		if (a_idx > 0 && !aencoder) {
			return false;
		} 
		ModernizedCProgram.enc_str(enc, end, "onMetaData");
		enc++ = AMF_ECMA_ARRAY;
		enc = ModernizedCProgram.AMF_EncodeInt32(enc, end, a_idx == 0 ? 20 : 15);
		ModernizedCProgram.enc_num_val(enc, end, "duration", 0.0);
		ModernizedCProgram.enc_num_val(enc, end, "fileSize", 0.0);
		if (a_idx == 0) {
			ModernizedCProgram.enc_num_val(enc, end, "width", (double)ModernizedCProgram.obs_encoder_get_width(vencoder));
			ModernizedCProgram.enc_num_val(enc, end, "height", (double)ModernizedCProgram.obs_encoder_get_height(vencoder));
			ModernizedCProgram.enc_str_val(enc, end, "videocodecid", "avc1");
			ModernizedCProgram.enc_num_val(enc, end, "videodatarate", vencoder.encoder_bitrate());
			ModernizedCProgram.enc_num_val(enc, end, "framerate", ModernizedCProgram.video_output_get_frame_rate(video));
		} 
		ModernizedCProgram.enc_str_val(enc, end, "audiocodecid", "mp4a");
		ModernizedCProgram.enc_num_val(enc, end, "audiodatarate", aencoder.encoder_bitrate());
		ModernizedCProgram.enc_num_val(enc, end, "audiosamplerate", (double)ModernizedCProgram.obs_encoder_get_sample_rate(aencoder));
		ModernizedCProgram.enc_num_val(enc, end, "audiosamplesize", 16.0);
		ModernizedCProgram.enc_num_val(enc, end, "audiochannels", (double)ModernizedCProgram.audio_output_get_channels(audio));
		ModernizedCProgram.enc_bool_val(enc, end, "stereo", ModernizedCProgram.audio_output_get_channels(audio) == 2);
		ModernizedCProgram.enc_bool_val(enc, end, "2.1", ModernizedCProgram.audio_output_get_channels(audio) == 3);
		ModernizedCProgram.enc_bool_val(enc, end, "3.1", ModernizedCProgram.audio_output_get_channels(audio) == 4);
		ModernizedCProgram.enc_bool_val(enc, end, "4.0", ModernizedCProgram.audio_output_get_channels(audio) == 4);
		ModernizedCProgram.enc_bool_val(enc, end, "4.1", ModernizedCProgram.audio_output_get_channels(audio) == 5);
		ModernizedCProgram.enc_bool_val(enc, end, "5.1", ModernizedCProgram.audio_output_get_channels(audio) == 6);
		ModernizedCProgram.enc_bool_val(enc, end, "7.1", ModernizedCProgram.audio_output_get_channels(audio) == 8);
		encoder_name.dstr_printf("%s (libobs version ", "obs-output module");
		encoder_name.dstr_catf("%d.%d.%d", 24, 0, 3);
		encoder_name.dstr_cat(")");
		Object generatedDstr = encoder_name.getDstr();
		ModernizedCProgram.enc_str_val(enc, end, "encoder", generatedDstr);
		encoder_name.dstr_free();
		enc++ = 0;
		enc++ = 0;
		enc++ = AMF_OBJECT_END;
		size = enc - buf;
		output = ModernizedCProgram.bmemdup(buf, size);
		return true;
	}
	public Object flv_meta_data(Object output, Object size, Object write_header, Object audio_idx) {
		array_output_data data = new array_output_data();
		serializer s = new serializer();
		 meta_data = ((Object)0);
		size_t meta_data_size = new size_t();
		 start_pos = new ();
		ModernizedCProgram.array_output_serializer_init(s, data);
		if (!context.build_flv_meta_data(meta_data, meta_data_size, audio_idx)) {
			ModernizedCProgram.bfree(meta_data);
			return false;
		} 
		if (write_header) {
			s.s_write("FLV", 3);
			s.s_w8(1);
			s.s_w8(5);
			s.s_wb32(9);
			s.s_wb32(0);
		} 
		start_pos = s.serializer_get_pos();
		s.s_w8(RTMP_PACKET_TYPE_INFO);
		s.s_wb24(()meta_data_size);
		s.s_wb32(0);
		s.s_wb24(0);
		s.s_write(meta_data, meta_data_size);
		s.s_wb32(()s.serializer_get_pos() - start_pos - 1);
		Object generatedArray_output_data = data.getArray_output_data();
		output = generatedArray_output_data.getArray();
		size = generatedArray_output_data.getNum();
		ModernizedCProgram.bfree(meta_data);
		return true;
	}
	public void do_output_signal(Object signal) {
		calldata params = new calldata(0);
		params.calldata_set_ptr("output", output);
		obs_context_data generatedContext = this.getContext();
		Object generatedSignals = generatedContext.getSignals();
		.signal_handler_signal(generatedSignals, signal, params);
		params.calldata_free();
	}
	public obs_output obs_get_output_by_name(Object name) {
		if (!ModernizedCProgram.obs) {
			return NULL;
		} 
		return ModernizedCProgram.get_context_by_name(ModernizedCProgram.obs.getData().getFirst_output(), name, ModernizedCProgram.obs.getData().getOutputs_mutex(), obs_output_addref_safe_);
	}
	public obs_output obs_output_create(Object id, Object name, obs_data settings, obs_data hotkey_data) {
		obs_output_info info = ModernizedCProgram.find_output(id);
		obs_output output = new obs_output();
		int ret;
		output = ModernizedCProgram.bzalloc();
		Object generatedInterleaved_mutex = output.getInterleaved_mutex();
		ModernizedCProgram.pthread_mutex_init_value(generatedInterleaved_mutex);
		Object generatedDelay_mutex = output.getDelay_mutex();
		ModernizedCProgram.pthread_mutex_init_value(generatedDelay_mutex);
		Object generatedCaption_mutex = output.getCaption_mutex();
		ModernizedCProgram.pthread_mutex_init_value(generatedCaption_mutex);
		pause_data generatedPause = output.getPause();
		Object generatedMutex = generatedPause.getMutex();
		ModernizedCProgram.pthread_mutex_init_value(generatedMutex);
		if (ModernizedCProgram.pthread_mutex_init(generatedInterleaved_mutex, NULL) != 0) {
			;
		} 
		if (ModernizedCProgram.pthread_mutex_init(generatedDelay_mutex, NULL) != 0) {
			;
		} 
		if (ModernizedCProgram.pthread_mutex_init(generatedCaption_mutex, NULL) != 0) {
			;
		} 
		if (ModernizedCProgram.pthread_mutex_init(generatedMutex, NULL) != 0) {
			;
		} 
		Object generatedStopping_event = output.getStopping_event();
		if (generatedStopping_event.os_event_init(OS_EVENT_TYPE_MANUAL) != 0) {
			;
		} 
		if (!ModernizedCProgram.init_output_handlers(output, name, settings, hotkey_data)) {
			;
		} 
		generatedStopping_event.os_event_signal();
		obs_output_info generatedInfo = output.getInfo();
		if (!info) {
			ModernizedCProgram.blog(LOG_ERROR, "Output ID '%s' not found", id);
			generatedInfo.setId(ModernizedCProgram.bstrdup(id));
			output.setOwns_info_id(true);
		} else {
				output.setInfo(info);
		} 
		output.setVideo(ModernizedCProgram.obs_get_video());
		output.setAudio(ModernizedCProgram.obs_get_audio());
		Object generatedGet_defaults = generatedInfo.getGet_defaults();
		obs_context_data generatedContext = output.getContext();
		obs_data generatedSettings = generatedContext.getSettings();
		if (generatedGet_defaults) {
			.UNRECOGNIZEDFUNCTIONNAME(generatedSettings);
		} 
		Object generatedReconnect_stop_event = output.getReconnect_stop_event();
		ret = generatedReconnect_stop_event.os_event_init(OS_EVENT_TYPE_MANUAL);
		if (ret < 0) {
			;
		} 
		output.setReconnect_retry_sec(2);
		output.setReconnect_retry_max(20);
		output.setValid(true);
		output.setControl(ModernizedCProgram.bzalloc());
		obs_weak_output generatedControl = output.getControl();
		generatedControl.setOutput(output);
		generatedContext.obs_context_data_insert(ModernizedCProgram.obs.getData().getOutputs_mutex(), ModernizedCProgram.obs.getData().getFirst_output());
		if (info) {
			generatedContext.setData(.UNRECOGNIZEDFUNCTIONNAME(generatedSettings, output));
		} 
		Object generatedData = generatedContext.getData();
		if (!generatedData) {
			ModernizedCProgram.blog(LOG_ERROR, "Failed to create output '%s'!", name);
		} 
		ModernizedCProgram.blog(LOG_DEBUG, "output '%s' (%s) created", name, id);
		return output;
		return NULL;
	}
	public void clear_audio_buffers() {
		Object generatedAudio_buffer = this.getAudio_buffer();
		for ( i = 0;
		 i < MAX_AUDIO_MIXES; i++) {
			for ( j = 0;
			 j < MAX_AV_PLANES; j++) {
				generatedAudio_buffer[i][j].circlebuf_free();
			}
		}
	}
	public void obs_output_destroy() {
		obs_context_data generatedContext = this.getContext();
		Byte generatedName = generatedContext.getName();
		Object generatedValid = this.getValid();
		Object generatedStopping_event = this.getStopping_event();
		Object generatedEnd_data_capture_thread = this.getEnd_data_capture_thread();
		obs_service generatedService = this.getService();
		Object generatedData = generatedContext.getData();
		obs_encoder generatedVideo_encoder = this.getVideo_encoder();
		Object generatedAudio_encoders = this.getAudio_encoders();
		pause_data generatedPause = this.getPause();
		Object generatedMutex = generatedPause.getMutex();
		Object generatedCaption_mutex = this.getCaption_mutex();
		Object generatedInterleaved_mutex = this.getInterleaved_mutex();
		Object generatedDelay_mutex = this.getDelay_mutex();
		Object generatedReconnect_stop_event = this.getReconnect_stop_event();
		circlebuf generatedDelay_data = this.getDelay_data();
		Object generatedOwns_info_id = this.getOwns_info_id();
		obs_output_info generatedInfo = this.getInfo();
		Object generatedId = generatedInfo.getId();
		Byte generatedLast_error_message = this.getLast_error_message();
		if (output) {
			generatedContext.obs_context_data_remove();
			ModernizedCProgram.blog(LOG_DEBUG, "output '%s' destroyed", generatedName);
			if (generatedValid && output.active()) {
				output.obs_output_actual_stop(true, 0);
			} 
			generatedStopping_event.os_event_wait();
			if (ModernizedCProgram.data_capture_ending(output)) {
				ModernizedCProgram.pthread_join(generatedEnd_data_capture_thread, NULL);
			} 
			if (generatedService) {
				generatedService.setOutput(NULL);
			} 
			if (generatedData) {
				.UNRECOGNIZEDFUNCTIONNAME(generatedData);
			} 
			output.free_packets();
			if (generatedVideo_encoder) {
				ModernizedCProgram.obs_encoder_remove_output(generatedVideo_encoder, output);
			} 
			for ( i = 0;
			 i < MAX_AUDIO_MIXES; i++) {
				if (generatedAudio_encoders[i]) {
					ModernizedCProgram.obs_encoder_remove_output(generatedAudio_encoders[i], output);
				} 
			}
			output.clear_audio_buffers();
			generatedStopping_event.os_event_destroy();
			ModernizedCProgram.pthread_mutex_destroy(generatedMutex);
			ModernizedCProgram.pthread_mutex_destroy(generatedCaption_mutex);
			ModernizedCProgram.pthread_mutex_destroy(generatedInterleaved_mutex);
			ModernizedCProgram.pthread_mutex_destroy(generatedDelay_mutex);
			generatedReconnect_stop_event.os_event_destroy();
			generatedContext.obs_context_data_free();
			generatedDelay_data.circlebuf_free();
			if (generatedOwns_info_id) {
				ModernizedCProgram.bfree((Object)generatedId);
			} 
			if (generatedLast_error_message) {
				ModernizedCProgram.bfree(generatedLast_error_message);
			} 
			ModernizedCProgram.bfree(output);
		} 
	}
	public Object obs_output_actual_start() {
		 success = false;
		Object generatedStopping_event = this.getStopping_event();
		generatedStopping_event.os_event_wait();
		this.setStop_code(0);
		Byte generatedLast_error_message = this.getLast_error_message();
		if (generatedLast_error_message) {
			ModernizedCProgram.bfree(generatedLast_error_message);
			this.setLast_error_message(NULL);
		} 
		obs_context_data generatedContext = this.getContext();
		Object generatedData = generatedContext.getData();
		if (generatedData) {
			success = .UNRECOGNIZEDFUNCTIONNAME(generatedData);
		} 
		Object generatedVideo = this.getVideo();
		if (success && generatedVideo) {
			this.setStarting_frame_count(ModernizedCProgram.video_output_get_total_frames(generatedVideo));
			this.setStarting_drawn_count(generatedVideo.getTotal_frames());
			this.setStarting_lagged_count(generatedVideo.getLagged_frames());
		} 
		Object generatedDelay_restart_refs = this.getDelay_restart_refs();
		if (ModernizedCProgram.os_atomic_load_long(generatedDelay_restart_refs)) {
			ModernizedCProgram.os_atomic_dec_long(generatedDelay_restart_refs);
		} 
		this.setCaption_timestamp(0);
		return success;
	}
	public Object obs_output_start() {
		 encoded = new ();
		 has_service = new ();
		if (!ModernizedCProgram.obs_object_valid(output, "obs_output_start", "output")) {
			return false;
		} 
		obs_context_data generatedContext = this.getContext();
		Object generatedData = generatedContext.getData();
		if (!generatedData) {
			return false;
		} 
		obs_output_info generatedInfo = this.getInfo();
		Object generatedFlags = generatedInfo.getFlags();
		has_service = (generatedFlags & (1 << 3)) != 0;
		obs_service generatedService = this.getService();
		if (has_service && !ModernizedCProgram.obs_service_initialize(generatedService, output)) {
			return false;
		} 
		encoded = (generatedFlags & (1 << 2)) != 0;
		Object generatedDelay_sec = this.getDelay_sec();
		if (encoded && generatedDelay_sec) {
			return output.obs_output_delay_start();
		} else {
				if (output.obs_output_actual_start()) {
					output.do_output_signal("starting");
					return true;
				} 
				return false;
		} 
	}
	public Object data_active() {
		Object generatedData_active = this.getData_active();
		return ModernizedCProgram.os_atomic_load_bool(generatedData_active);
	}
	public void log_frame_info() {
		obs_core_video video = ModernizedCProgram.obs.getVideo();
		Object generatedTotal_frames = video.getTotal_frames();
		Object generatedStarting_drawn_count = this.getStarting_drawn_count();
		uint32_t drawn = generatedTotal_frames - generatedStarting_drawn_count;
		Object generatedLagged_frames = video.getLagged_frames();
		Object generatedStarting_lagged_count = this.getStarting_lagged_count();
		uint32_t lagged = generatedLagged_frames - generatedStarting_lagged_count;
		int dropped = ModernizedCProgram.obs_output_get_frames_dropped(output);
		int total = generatedTotal_frames;
		double percentage_lagged = 0.0;
		double percentage_dropped = 0.0;
		if (drawn) {
			percentage_lagged = (double)lagged / (double)drawn * 100.0;
		} 
		if (dropped) {
			percentage_dropped = (double)dropped / (double)total * 100.0;
		} 
		obs_context_data generatedContext = this.getContext();
		Byte generatedName = generatedContext.getName();
		ModernizedCProgram.blog(LOG_INFO, "Output '%s': stopping", generatedName);
		if (!dropped || !total) {
			ModernizedCProgram.blog(LOG_INFO, "Output '%s': Total frames output: %d", generatedName, total);
		} else {
				ModernizedCProgram.blog(LOG_INFO, "Output '%s': Total frames output: %d (%d attempted)", generatedName, total - dropped, total);
		} 
		if (!lagged || !drawn) {
			ModernizedCProgram.blog(LOG_INFO, "Output '%s': Total drawn frames: %u", generatedName, drawn);
		} else {
				ModernizedCProgram.blog(LOG_INFO, "Output '%s': Total drawn frames: %u (%u attempted)", generatedName, drawn - lagged, drawn);
		} 
		if (drawn && lagged) {
			ModernizedCProgram.blog(LOG_INFO, "Output '%s': Number of lagged frames due to rendering lag/stalls: %u (%0.1f%%)", generatedName, lagged, percentage_lagged);
		} 
		if (total && dropped) {
			ModernizedCProgram.blog(LOG_INFO, "Output '%s': Number of dropped frames due to insufficient bandwidth/connection stalls: %d (%0.1f%%)", generatedName, dropped, percentage_dropped);
		} 
	}
	public void obs_output_actual_stop(Object force, Object ts) {
		 call_stop = true;
		 was_reconnecting = false;
		if (output.stopping() && !force) {
			return ;
		} 
		output.obs_output_pause(false);
		Object generatedStopping_event = this.getStopping_event();
		generatedStopping_event.os_event_reset();
		was_reconnecting = ModernizedCProgram.reconnecting(output) && !ModernizedCProgram.delay_active(output);
		Object generatedReconnect_stop_event = this.getReconnect_stop_event();
		Object generatedReconnect_thread_active = this.getReconnect_thread_active();
		Object generatedReconnect_thread = this.getReconnect_thread();
		if (ModernizedCProgram.reconnecting(output)) {
			generatedReconnect_stop_event.os_event_signal();
			if (generatedReconnect_thread_active) {
				ModernizedCProgram.pthread_join(generatedReconnect_thread, NULL);
			} 
		} 
		Object generatedDelay_active = this.getDelay_active();
		Object generatedDelay_capturing = this.getDelay_capturing();
		if (force) {
			if (ModernizedCProgram.delay_active(output)) {
				call_stop = ModernizedCProgram.delay_capturing(output);
				ModernizedCProgram.os_atomic_set_bool(generatedDelay_active, false);
				ModernizedCProgram.os_atomic_set_bool(generatedDelay_capturing, false);
				this.setStop_code(0);
				output.obs_output_end_data_capture();
				generatedStopping_event.os_event_signal();
			} else {
					call_stop = true;
			} 
		} else {
				call_stop = true;
		} 
		obs_context_data generatedContext = this.getContext();
		Object generatedData = generatedContext.getData();
		if (generatedData && call_stop) {
			.UNRECOGNIZEDFUNCTIONNAME(generatedData, ts);
		}  else if (was_reconnecting) {
			this.setStop_code(0);
			output.signal_stop();
			generatedStopping_event.os_event_signal();
		} 
		caption_text generatedCaption_head = this.getCaption_head();
		caption_text generatedNext = generatedCaption_head.getNext();
		caption_text generatedCaption_tail = this.getCaption_tail();
		while (generatedCaption_head) {
			this.setCaption_tail(generatedNext);
			ModernizedCProgram.bfree(generatedCaption_head);
			this.setCaption_head(generatedCaption_tail);
		}
	}
	public void obs_output_stop() {
		 encoded = new ();
		if (!ModernizedCProgram.obs_object_valid(output, "obs_output_stop", "output")) {
			return ;
		} 
		obs_context_data generatedContext = this.getContext();
		Object generatedData = generatedContext.getData();
		if (!generatedData) {
			return ;
		} 
		if (!output.active() && !ModernizedCProgram.reconnecting(output)) {
			return ;
		} 
		if (ModernizedCProgram.reconnecting(output)) {
			output.obs_output_force_stop();
			return ;
		} 
		obs_output_info generatedInfo = this.getInfo();
		Object generatedFlags = generatedInfo.getFlags();
		encoded = (generatedFlags & (1 << 2)) != 0;
		Object generatedActive_delay_ns = this.getActive_delay_ns();
		if (encoded && generatedActive_delay_ns) {
			output.obs_output_delay_stop();
		}  else if (!output.stopping()) {
			output.do_output_signal("stopping");
			output.obs_output_actual_stop(false, ModernizedCProgram.os_gettime_ns());
		} 
	}
	public void obs_output_force_stop() {
		if (!ModernizedCProgram.obs_object_valid(output, "obs_output_force_stop", "output")) {
			return ;
		} 
		if (!output.stopping()) {
			this.setStop_code(0);
			output.do_output_signal("stopping");
		} 
		output.obs_output_actual_stop(true, 0);
	}
	public Object obs_encoded_output_pause(Object pause) {
		obs_encoder_t venc = new obs_encoder_t();
		obs_encoder_t[] aenc = new obs_encoder_t();
		uint64_t closest_v_ts = new uint64_t();
		 success = false;
		obs_encoder generatedVideo_encoder = this.getVideo_encoder();
		venc = generatedVideo_encoder;
		Object generatedAudio_encoders = this.getAudio_encoders();
		for ( i = 0;
		 i < MAX_AUDIO_MIXES; i++) {
			aenc[i] = generatedAudio_encoders[i];
		}
		pause_data generatedPause = venc.getPause();
		Object generatedMutex = generatedPause.getMutex();
		ModernizedCProgram.pthread_mutex_lock(generatedMutex);
		for ( i = 0;
		 i < MAX_AUDIO_MIXES; i++) {
			if (aenc[i]) {
				ModernizedCProgram.pthread_mutex_lock(generatedMutex);
			} 
		}
		closest_v_ts = generatedPause.get_closest_v_ts();
		Object generatedPaused = venc.getPaused();
		if (pause) {
			if (!generatedPause.pause_can_start()) {
				;
			} 
			for ( i = 0;
			 i < MAX_AUDIO_MIXES; i++) {
				if (aenc[i] && !generatedPause.pause_can_start()) {
					;
				} 
			}
			ModernizedCProgram.os_atomic_set_bool(generatedPaused, true);
			generatedPause.setTs_start(closest_v_ts);
			for ( i = 0;
			 i < MAX_AUDIO_MIXES; i++) {
				if (aenc[i]) {
					ModernizedCProgram.os_atomic_set_bool(generatedPaused, true);
					generatedPause.setTs_start(closest_v_ts);
				} 
			}
		} else {
				if (!generatedPause.pause_can_stop()) {
					;
				} 
				for ( i = 0;
				 i < MAX_AUDIO_MIXES; i++) {
					if (aenc[i] && !generatedPause.pause_can_stop()) {
						;
					} 
				}
				ModernizedCProgram.os_atomic_set_bool(generatedPaused, false);
				generatedPause.end_pause(closest_v_ts);
				for ( i = 0;
				 i < MAX_AUDIO_MIXES; i++) {
					if (aenc[i]) {
						ModernizedCProgram.os_atomic_set_bool(generatedPaused, false);
						generatedPause.end_pause(closest_v_ts);
					} 
				}
		} 
		success = /* ---------------------------- */true;
		ModernizedCProgram.pthread_mutex_unlock(generatedMutex);
		return success;
	}
	public Object obs_raw_output_pause(Object pause) {
		 success = new ();
		uint64_t closest_v_ts = new uint64_t();
		pause_data generatedPause = this.getPause();
		Object generatedMutex = generatedPause.getMutex();
		ModernizedCProgram.pthread_mutex_lock(generatedMutex);
		closest_v_ts = generatedPause.get_closest_v_ts();
		if (pause) {
			success = generatedPause.pause_can_start();
			if (success) {
				generatedPause.setTs_start(closest_v_ts);
			} 
		} else {
				success = generatedPause.pause_can_stop();
				if (success) {
					generatedPause.end_pause(closest_v_ts);
				} 
		} 
		ModernizedCProgram.pthread_mutex_unlock(generatedMutex);
		return success;
	}
	public Object obs_output_pause(Object pause) {
		 success = new ();
		if (!ModernizedCProgram.obs_object_valid(output, "obs_output_pause", "output")) {
			return false;
		} 
		obs_output_info generatedInfo = this.getInfo();
		Object generatedFlags = generatedInfo.getFlags();
		if ((generatedFlags & (1 << 5)) == 0) {
			return false;
		} 
		Object generatedActive = this.getActive();
		if (!ModernizedCProgram.os_atomic_load_bool(generatedActive)) {
			return false;
		} 
		Object generatedPaused = this.getPaused();
		if (ModernizedCProgram.os_atomic_load_bool(generatedPaused) == pause) {
			return true;
		} 
		success = ((generatedFlags & (1 << 2)) != 0) ? output.obs_encoded_output_pause(pause) : output.obs_raw_output_pause(pause);
		obs_context_data generatedContext = this.getContext();
		Byte generatedName = generatedContext.getName();
		if (success) {
			ModernizedCProgram.os_atomic_set_bool(generatedPaused, pause);
			output.do_output_signal(pause ? "pause" : "unpause");
			ModernizedCProgram.blog(LOG_INFO, "output %s %spaused", generatedName, pause ? "" : "un");
		} 
		return success;
	}
	public Object obs_output_get_pause_offset() {
		uint64_t offset = new uint64_t();
		if (!ModernizedCProgram.obs_object_valid(output, "obs_output_get_pause_offset", "output")) {
			return 0;
		} 
		pause_data generatedPause = this.getPause();
		Object generatedMutex = generatedPause.getMutex();
		ModernizedCProgram.pthread_mutex_lock(generatedMutex);
		Object generatedTs_offset = generatedPause.getTs_offset();
		offset = generatedTs_offset;
		ModernizedCProgram.pthread_mutex_unlock(generatedMutex);
		return offset;
	}
	public void obs_output_set_media(Object video, Object audio) {
		if (!ModernizedCProgram.obs_object_valid(output, "obs_output_set_media", "output")) {
			return ;
		} 
		this.setVideo(video);
		this.setAudio(audio);
	}
	public void obs_output_set_mixer(Object mixer_idx) {
		if (!ModernizedCProgram.obs_object_valid(output, "obs_output_set_mixer", "output")) {
			return ;
		} 
		if (!output.active()) {
			this.setMixer_mask(()1 << mixer_idx);
		} 
	}
	public void obs_output_set_mixers(Object mixers) {
		if (!ModernizedCProgram.obs_object_valid(output, "obs_output_set_mixers", "output")) {
			return ;
		} 
		this.setMixer_mask(mixers);
	}
	public void obs_output_set_reconnect_settings(int retry_count, int retry_sec) {
		if (!ModernizedCProgram.obs_object_valid(output, "obs_output_set_reconnect_settings", "output")) {
			return ;
		} 
		this.setReconnect_retry_max(retry_count);
		this.setReconnect_retry_sec(retry_sec);
	}
	public void obs_output_set_preferred_size(Object width, Object height) {
		if (!ModernizedCProgram.obs_object_valid(output, "obs_output_set_preferred_size", "output")) {
			return ;
		} 
		obs_output_info generatedInfo = this.getInfo();
		Object generatedFlags = generatedInfo.getFlags();
		if ((generatedFlags & (1 << 0)) == 0) {
			return ;
		} 
		if (output.active()) {
			ModernizedCProgram.blog(LOG_WARNING, "output '%s': Cannot set the preferred resolution while the output is active", ModernizedCProgram.obs_output_get_name(output));
			return ;
		} 
		this.setScaled_width(width);
		this.setScaled_height(height);
		obs_encoder generatedVideo_encoder = this.getVideo_encoder();
		if (generatedFlags & (1 << 2)) {
			if (generatedVideo_encoder) {
				generatedVideo_encoder.obs_encoder_set_scaled_size(width, height);
			} 
		} 
	}
	public void obs_output_set_video_conversion(Object conversion) {
		if (!ModernizedCProgram.obs_object_valid(output, "obs_output_set_video_conversion", "output")) {
			return ;
		} 
		if (!ModernizedCProgram.obs_object_valid(conversion, "obs_output_set_video_conversion", "conversion")) {
			return ;
		} 
		this.setVideo_conversion(conversion);
		this.setVideo_conversion_set(true);
	}
	public void obs_output_set_audio_conversion(Object conversion) {
		if (!ModernizedCProgram.obs_object_valid(output, "obs_output_set_audio_conversion", "output")) {
			return ;
		} 
		if (!ModernizedCProgram.obs_object_valid(conversion, "obs_output_set_audio_conversion", "conversion")) {
			return ;
		} 
		this.setAudio_conversion(conversion);
		this.setAudio_conversion_set(true);
	}
	/* TODO SEI should come after AUD/SPS/PPS, but before any VCL */
	public void send_interleaved() {
		Object generatedInterleaved_packets = this.getInterleaved_packets();
		encoder_packet out = generatedInterleaved_packets.getArray()[0/* do not send an interleaved packet if there's no packet of the
			 * opposing type of a higher timestamp in the interleave buffer.
			 * this ensures that the timestamps are monotonic */];
		if (!ModernizedCProgram.has_higher_opposing_ts(output, out)) {
			return ;
		} 
		.da_erase(generatedInterleaved_packets, 0);
		obs_encoder_type generatedType = out.getType();
		int generatedTotal_frames = this.getTotal_frames();
		if (generatedType == obs_encoder_type.OBS_ENCODER_VIDEO) {
			generatedTotal_frames++;
		} 
		obs_context_data generatedContext = this.getContext();
		Object generatedData = generatedContext.getData();
		.UNRECOGNIZEDFUNCTIONNAME(generatedData, out);
		out.obs_encoder_packet_release();
	}
	/* gets the point where audio and video are closest together */
	public Object get_interleaved_start_idx() {
		int64_t closest_diff = -1024;
		encoder_packet encoder_packet = new encoder_packet();
		encoder_packet first_video = encoder_packet.find_first_packet_type(output, obs_encoder_type.OBS_ENCODER_VIDEO, 0);
		 video_idx = DARRAY_INVALID;
		 idx = 0;
		Object generatedInterleaved_packets = this.getInterleaved_packets();
		obs_encoder_type generatedType = packet.getType();
		Object generatedDts_usec = packet.getDts_usec();
		for ( i = 0;
		 i < generatedInterleaved_packets.getNum(); i++) {
			encoder_packet packet = generatedInterleaved_packets.getArray()[i];
			int64_t diff = new int64_t();
			if (generatedType != obs_encoder_type.OBS_ENCODER_AUDIO) {
				if (packet == first_video) {
					video_idx = i;
				} 
				continue;
			} 
			diff = .llabs(generatedDts_usec - generatedDts_usec);
			if (diff < closest_diff) {
				closest_diff = diff;
				idx = i;
			} 
		}
		return video_idx < idx ? video_idx : idx;
	}
	public int prune_premature_packets() {
		 audio_mixes = ModernizedCProgram.num_audio_mixes(output);
		encoder_packet video = new encoder_packet();
		int video_idx;
		int max_idx;
		int64_t duration_usec = new int64_t();
		int64_t max_diff = 0;
		int64_t diff = 0;
		video_idx = output.find_first_packet_type_idx(obs_encoder_type.OBS_ENCODER_VIDEO, 0);
		if (video_idx == -1) {
			this.setReceived_video(false);
			return -1;
		} 
		max_idx = video_idx;
		Object generatedInterleaved_packets = this.getInterleaved_packets();
		video = generatedInterleaved_packets.getArray()[video_idx];
		Object generatedTimebase_num = video.getTimebase_num();
		Object generatedTimebase_den = video.getTimebase_den();
		duration_usec = generatedTimebase_num * -1024 / generatedTimebase_den;
		Object generatedDts_usec = audio.getDts_usec();
		for ( i = 0;
		 i < audio_mixes; i++) {
			encoder_packet audio = new encoder_packet();
			int audio_idx;
			audio_idx = output.find_first_packet_type_idx(obs_encoder_type.OBS_ENCODER_AUDIO, i);
			if (audio_idx == -1) {
				this.setReceived_audio(false);
				return -1;
			} 
			audio = generatedInterleaved_packets.getArray()[audio_idx];
			if (audio_idx > max_idx) {
				max_idx = audio_idx;
			} 
			diff = generatedDts_usec - generatedDts_usec;
			if (diff > max_diff) {
				max_diff = diff;
			} 
		}
		return diff > duration_usec ? max_idx + 1 : 0;
	}
	public void discard_to_idx(Object idx) {
		Object generatedInterleaved_packets = this.getInterleaved_packets();
		for ( i = 0;
		 i < idx; i++) {
			encoder_packet packet = generatedInterleaved_packets.getArray()[i];
			packet.obs_encoder_packet_release();
		}
		.da_erase_range(generatedInterleaved_packets, 0, idx);
	}
	public Object prune_interleaved_packets() {
		 start_idx = 0;
		int prune_start = output.prune_premature_packets();
		if (prune_start == -/* prunes the first video packet if it's too far away from audio */1) {
			return false;
		}  else if (prune_start != 0) {
			start_idx = ()prune_start;
		} else {
				start_idx = output.get_interleaved_start_idx();
		} 
		if (start_idx) {
			output.discard_to_idx(start_idx);
		} 
		return true;
	}
	public int find_first_packet_type_idx(obs_encoder_type type, Object audio_idx) {
		Object generatedInterleaved_packets = this.getInterleaved_packets();
		obs_encoder_type generatedType = packet.getType();
		Object generatedTrack_idx = packet.getTrack_idx();
		for ( i = 0;
		 i < generatedInterleaved_packets.getNum(); i++) {
			encoder_packet packet = generatedInterleaved_packets.getArray()[i];
			if (generatedType == obs_encoder_type.type) {
				if (obs_encoder_type.type == obs_encoder_type.OBS_ENCODER_AUDIO && generatedTrack_idx != audio_idx) {
					continue;
				} 
				return (int)i;
			} 
		}
		return -1;
	}
	public int find_last_packet_type_idx(obs_encoder_type type, Object audio_idx) {
		Object generatedInterleaved_packets = this.getInterleaved_packets();
		obs_encoder_type generatedType = packet.getType();
		Object generatedTrack_idx = packet.getTrack_idx();
		for ( i = generatedInterleaved_packets.getNum();
		 i > 0; i--) {
			encoder_packet packet = generatedInterleaved_packets.getArray()[i - 1];
			if (generatedType == obs_encoder_type.type) {
				if (obs_encoder_type.type == obs_encoder_type.OBS_ENCODER_AUDIO && generatedTrack_idx != audio_idx) {
					continue;
				} 
				return (int)(i - 1);
			} 
		}
		return -1;
	}
	public Object initialize_interleaved_packets() {
		encoder_packet video = new encoder_packet();
		encoder_packet[] audio = new encoder_packet();
		encoder_packet[] last_audio = new encoder_packet();
		 audio_mixes = ModernizedCProgram.num_audio_mixes(output);
		 start_idx = new ();
		if (!ModernizedCProgram.get_audio_and_video_packets(output, video, audio, audio_mixes)) {
			return false;
		} 
		encoder_packet encoder_packet = new encoder_packet();
		for ( i = 0;
		 i < audio_mixes; i++) {
			last_audio[i] = encoder_packet.find_last_packet_type(output, obs_encoder_type.OBS_ENCODER_AUDIO, i);
		}
		Object generatedDts_usec = video.getDts_usec();
		for ( i = 0;
		 i < audio_mixes; /* ensure that there is audio past the first video packet */i++) {
			if (last_audio[i].getDts_usec() < generatedDts_usec) {
				this.setReceived_audio(false);
				return false;
			} 
		}
		start_idx = /* clear out excess starting audio if it hasn't been already */output.get_interleaved_start_idx();
		if (start_idx) {
			output.discard_to_idx(start_idx);
			if (!ModernizedCProgram.get_audio_and_video_packets(output, video, audio, audio_mixes)) {
				return false;
			} 
		} 
		Object generatedPts = video.getPts();
		this.setVideo_offset(generatedPts);
		Object generatedAudio_offsets = this.getAudio_offsets();
		for ( i = 0;
		 i < audio_mixes; i++) {
			generatedAudio_offsets[i] = audio[i].getDts();
		}
		Object generatedHighest_audio_ts = this.getHighest_audio_ts();
		generatedHighest_audio_ts -= generatedDts_usec;
		Object generatedHighest_video_ts = this.getHighest_video_ts();
		generatedHighest_video_ts -= generatedDts_usec;
		Object generatedInterleaved_packets = this.getInterleaved_packets();
		for ( i = 0;
		 i < generatedInterleaved_packets.getNum(); /* apply new offsets to all existing packet DTS/PTS values */i++) {
			encoder_packet packet = generatedInterleaved_packets.getArray()[i];
			ModernizedCProgram.apply_interleaved_packet_offset(output, packet);
		}
		return true;
	}
	public void resort_interleaved_packets() {
		Object generatedInterleaved_packets = this.getInterleaved_packets();
		old_array.setDa(generatedInterleaved_packets.getDa());
		.memset(generatedInterleaved_packets, 0, );
		for ( i = 0;
		 i < old_array.getNum(); i++) {
			ModernizedCProgram.insert_interleaved_packet(output, old_array.getArray()[i]);
		}
		.da_free(old_array);
	}
	public void discard_unused_audio_packets(Object dts_usec) {
		 idx = 0;
		Object generatedInterleaved_packets = this.getInterleaved_packets();
		Object generatedDts_usec = p.getDts_usec();
		for (; idx < generatedInterleaved_packets.getNum(); idx++) {
			encoder_packet p = generatedInterleaved_packets.getArray()[idx];
			if (generatedDts_usec >= dts_usec) {
				break;
			} 
		}
		if (idx) {
			output.discard_to_idx(idx);
		} 
	}
	public Object prepare_audio(Object old, Object new) {
		Object generatedVideo_start_ts = this.getVideo_start_ts();
		pause_data generatedPause = this.getPause();
		Object generatedMutex = generatedPause.getMutex();
		Object generatedLast_video_ts = generatedPause.getLast_video_ts();
		if (!generatedVideo_start_ts) {
			ModernizedCProgram.pthread_mutex_lock(generatedMutex);
			this.setVideo_start_ts(generatedLast_video_ts);
			ModernizedCProgram.pthread_mutex_unlock(generatedMutex);
		} 
		if (!generatedVideo_start_ts) {
			return false;
		} 
		new = /* ------------------ */old;
		Object generatedSample_rate = this.getSample_rate();
		Object generatedPlanes = this.getPlanes();
		Object generatedAudio_size = this.getAudio_size();
		if (old.getTimestamp() < generatedVideo_start_ts) {
			uint64_t duration = (uint64_t)old.getFrames() * 1000000000 / (uint64_t)generatedSample_rate;
			uint64_t end_ts = (old.getTimestamp() + duration);
			uint64_t cutoff = new uint64_t();
			if (end_ts <= generatedVideo_start_ts) {
				return false;
			} 
			cutoff = generatedVideo_start_ts - old.getTimestamp();
			new.getTimestamp() += cutoff;
			cutoff = cutoff * (uint64_t)generatedSample_rate / 1000000000;
			for ( i = 0;
			 i < generatedPlanes; i++) {
				new.getData()[i] += generatedAudio_size * (uint32_t)cutoff;
			}
			new.getFrames() -= (uint32_t)cutoff;
		} 
		return true;
	}
	public void start_audio_encoders(Object encoded_callback) {
		 num_mixes = ModernizedCProgram.num_audio_mixes(output);
		Object generatedAudio_encoders = this.getAudio_encoders();
		for ( i = 0;
		 i < num_mixes; i++) {
			generatedAudio_encoders[i].obs_encoder_start(encoded_callback, output);
		}
	}
	public void start_raw_audio() {
		obs_output_info generatedInfo = this.getInfo();
		Object generatedRaw_audio2 = generatedInfo.getRaw_audio2();
		Object generatedMixer_mask = this.getMixer_mask();
		Object generatedAudio = this.getAudio();
		audio_convert_info audio_convert_info = new audio_convert_info();
		if (generatedRaw_audio2) {
			for (int idx = 0;
			 idx < MAX_AUDIO_MIXES; idx++) {
				if ((generatedMixer_mask & (()1 << idx)) != 0) {
					generatedAudio.audio_output_connect(idx, audio_convert_info.get_audio_conversion(output), default_raw_audio_callback, output);
				} 
			}
		} else {
				generatedAudio.audio_output_connect(ModernizedCProgram.get_first_mixer(output), audio_convert_info.get_audio_conversion(output), default_raw_audio_callback, output);
		} 
	}
	public void reset_packet_data() {
		this.setReceived_audio(false);
		this.setReceived_video(false);
		this.setHighest_audio_ts(0);
		this.setHighest_video_ts(0);
		this.setVideo_offset(0);
		Object generatedAudio_offsets = this.getAudio_offsets();
		for ( i = 0;
		 i < MAX_AUDIO_MIXES; i++) {
			generatedAudio_offsets[i] = 0;
		}
		output.free_packets();
	}
	public Object preserve_active() {
		Object generatedDelay_flags = this.getDelay_flags();
		return (generatedDelay_flags & (1 << 0)) != 0;
	}
	public void hook_data_capture(Object encoded, Object has_video, Object has_audio) {
		encoded_callback_t encoded_callback = new encoded_callback_t();
		Object generatedInterleaved_mutex = this.getInterleaved_mutex();
		Object generatedDelay_sec = this.getDelay_sec();
		Object generatedDelay_flags = this.getDelay_flags();
		Object generatedDelay_active = this.getDelay_active();
		obs_context_data generatedContext = this.getContext();
		Byte generatedName = generatedContext.getName();
		obs_encoder generatedVideo_encoder = this.getVideo_encoder();
		Object generatedVideo = this.getVideo();
		video_scale_info video_scale_info = new video_scale_info();
		if (encoded) {
			ModernizedCProgram.pthread_mutex_lock(generatedInterleaved_mutex);
			output.reset_packet_data();
			ModernizedCProgram.pthread_mutex_unlock(generatedInterleaved_mutex);
			encoded_callback = (has_video && has_audio) ? interleave_packets : default_encoded_callback;
			if (generatedDelay_sec) {
				this.setActive_delay_ns((uint64_t)generatedDelay_sec * -1024);
				this.setDelay_cur_flags(generatedDelay_flags);
				this.setDelay_callback(encoded_callback);
				encoded_callback = ModernizedCProgram.process_delay;
				ModernizedCProgram.os_atomic_set_bool(generatedDelay_active, true);
				ModernizedCProgram.blog(LOG_INFO, "Output '%s': %u second delay active, preserve on disconnect is %s", generatedName, generatedDelay_sec, output.preserve_active() ? "on" : "off");
			} 
			if (has_audio) {
				output.start_audio_encoders(encoded_callback);
			} 
			if (has_video) {
				generatedVideo_encoder.obs_encoder_start(encoded_callback, output);
			} 
		} else {
				if (has_video) {
					ModernizedCProgram.start_raw_video(generatedVideo, video_scale_info.get_video_conversion(output), default_raw_video_callback, output);
				} 
				if (has_audio) {
					output.start_raw_audio();
				} 
		} 
	}
	public void signal_start() {
		output.do_output_signal("start");
	}
	public void signal_reconnect() {
		calldata params = new calldata();
		uint8_t[] stack = new uint8_t();
		params.calldata_init_fixed(stack, );
		int generatedReconnect_retry_cur_sec = this.getReconnect_retry_cur_sec();
		params.calldata_set_int("timeout_sec", generatedReconnect_retry_cur_sec);
		params.calldata_set_ptr("output", output);
		obs_context_data generatedContext = this.getContext();
		Object generatedSignals = generatedContext.getSignals();
		.signal_handler_signal(generatedSignals, "reconnect", params);
	}
	public void signal_reconnect_success() {
		output.do_output_signal("reconnect_success");
	}
	public void signal_stop() {
		calldata params = new calldata();
		params.calldata_init();
		Byte generatedLast_error_message = this.getLast_error_message();
		params.calldata_set_string("last_error", generatedLast_error_message);
		int generatedStop_code = this.getStop_code();
		params.calldata_set_int("code", generatedStop_code);
		params.calldata_set_ptr("output", output);
		obs_context_data generatedContext = this.getContext();
		Object generatedSignals = generatedContext.getSignals();
		.signal_handler_signal(generatedSignals, "stop", params);
		params.calldata_free();
	}
	public Object initialize_audio_encoders(Object num_mixes) {
		Object generatedAudio_encoders = this.getAudio_encoders();
		for ( i = 0;
		 i < num_mixes; i++) {
			if (!generatedAudio_encoders[i].obs_encoder_initialize()) {
				return false;
			} 
		}
		return true;
	}
	public void pair_encoders(Object num_mixes) {
		obs_encoder generatedVideo_encoder = this.getVideo_encoder();
		obs_encoder video = generatedVideo_encoder;
		obs_encoder obs_encoder = new obs_encoder();
		obs_encoder audio = obs_encoder.find_inactive_audio_encoder(output, num_mixes);
		Object generatedInit_mutex = audio.getInit_mutex();
		Object generatedActive = audio.getActive();
		obs_encoder generatedPaired_encoder = video.getPaired_encoder();
		if (video && audio) {
			ModernizedCProgram.pthread_mutex_lock(generatedInit_mutex);
			ModernizedCProgram.pthread_mutex_lock(generatedInit_mutex);
			if (!generatedActive && !generatedActive && !generatedPaired_encoder && !generatedPaired_encoder) {
				audio.setWait_for_video(true);
				audio.setPaired_encoder(video);
				video.setPaired_encoder(audio);
			} 
			ModernizedCProgram.pthread_mutex_unlock(generatedInit_mutex);
			ModernizedCProgram.pthread_mutex_unlock(generatedInit_mutex);
		} 
	}
	public Object obs_output_initialize_encoders(Object flags) {
		 encoded = new ();
		 has_video = new ();
		 has_audio = new ();
		 has_service = new ();
		 num_mixes = ModernizedCProgram.num_audio_mixes(output);
		if (!ModernizedCProgram.obs_object_valid(output, "obs_output_initialize_encoders", "output")) {
			return false;
		} 
		if (output.active()) {
			return ModernizedCProgram.delay_active(output);
		} 
		ModernizedCProgram.convert_flags(output, flags, encoded, has_video, has_audio, has_service);
		if (!encoded) {
			return false;
		} 
		obs_encoder generatedVideo_encoder = this.getVideo_encoder();
		if (has_video && !generatedVideo_encoder.obs_encoder_initialize()) {
			return false;
		} 
		if (has_audio && !output.initialize_audio_encoders(num_mixes)) {
			return false;
		} 
		return true;
	}
	public Object begin_delayed_capture() {
		if (ModernizedCProgram.delay_capturing(output)) {
			return false;
		} 
		Object generatedInterleaved_mutex = this.getInterleaved_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedInterleaved_mutex);
		output.reset_packet_data();
		Object generatedDelay_capturing = this.getDelay_capturing();
		ModernizedCProgram.os_atomic_set_bool(generatedDelay_capturing, true);
		ModernizedCProgram.pthread_mutex_unlock(generatedInterleaved_mutex);
		Object generatedReconnecting = this.getReconnecting();
		if (ModernizedCProgram.reconnecting(output)) {
			output.signal_reconnect_success();
			ModernizedCProgram.os_atomic_set_bool(generatedReconnecting, false);
		} else {
				output.signal_start();
		} 
		return true;
	}
	public void reset_raw_output() {
		output.clear_audio_buffers();
		Object generatedAudio = this.getAudio();
		audio_convert_info generatedAudio_conversion = this.getAudio_conversion();
		Object generatedAudio_conversion_set = this.getAudio_conversion_set();
		Object generatedAudio_convert_info = conv.getAudio_convert_info();
		if (generatedAudio) {
			audio_output_info aoi = ModernizedCProgram.audio_output_get_info(generatedAudio);
			audio_convert_info conv = generatedAudio_conversion;
			audio_convert_info info = new audio_convert_info(aoi.getAudio_output_info(), aoi.getAudio_output_info(), aoi.getAudio_output_info());
			if (generatedAudio_conversion_set) {
				if (generatedAudio_convert_info) {
					info.setAudio_convert_info(generatedAudio_convert_info);
				} 
				if (generatedAudio_convert_info != AUDIO_FORMAT_UNKNOWN) {
					info.setAudio_convert_info(generatedAudio_convert_info);
				} 
				if (generatedAudio_convert_info != SPEAKERS_UNKNOWN) {
					info.setAudio_convert_info(generatedAudio_convert_info);
				} 
			} 
			this.setSample_rate(generatedAudio_convert_info);
			this.setPlanes(ModernizedCProgram.get_audio_planes(generatedAudio_convert_info, generatedAudio_convert_info));
			this.setTotal_audio_frames(0);
			this.setAudio_size(ModernizedCProgram.get_audio_size(generatedAudio_convert_info, generatedAudio_convert_info, 1));
		} 
		this.setAudio_start_ts(0);
		this.setVideo_start_ts(0);
		pause_data generatedPause = this.getPause();
		generatedPause.pause_reset();
	}
	public Object obs_output_begin_data_capture(Object flags) {
		 encoded = new ();
		 has_video = new ();
		 has_audio = new ();
		 has_service = new ();
		 num_mixes = new ();
		if (!ModernizedCProgram.obs_object_valid(output, "obs_output_begin_data_capture", "output")) {
			return false;
		} 
		if (ModernizedCProgram.delay_active(output)) {
			return output.begin_delayed_capture();
		} 
		if (output.active()) {
			return false;
		} 
		this.setTotal_frames(0);
		obs_output_info generatedInfo = this.getInfo();
		Object generatedFlags = generatedInfo.getFlags();
		if ((generatedFlags & (1 << 2)) == 0) {
			output.reset_raw_output();
		} 
		ModernizedCProgram.convert_flags(output, flags, encoded, has_video, has_audio, has_service);
		if (!ModernizedCProgram.can_begin_data_capture(output, encoded, has_video, has_audio, has_service)) {
			return false;
		} 
		num_mixes = ModernizedCProgram.num_audio_mixes(output);
		if (has_video && has_audio) {
			output.pair_encoders(num_mixes);
		} 
		Object generatedData_active = this.getData_active();
		ModernizedCProgram.os_atomic_set_bool(generatedData_active, true);
		output.hook_data_capture(encoded, has_video, has_audio);
		obs_service generatedService = this.getService();
		if (has_service) {
			generatedService.obs_service_activate();
		} 
		output.do_output_signal("activate");
		Object generatedActive = this.getActive();
		ModernizedCProgram.os_atomic_set_bool(generatedActive, true);
		Object generatedReconnecting = this.getReconnecting();
		if (ModernizedCProgram.reconnecting(output)) {
			output.signal_reconnect_success();
			ModernizedCProgram.os_atomic_set_bool(generatedReconnecting, false);
		}  else if (ModernizedCProgram.delay_active(output)) {
			output.do_output_signal("starting");
		} else {
				output.signal_start();
		} 
		return true;
	}
	public void stop_audio_encoders(Object encoded_callback) {
		 num_mixes = ModernizedCProgram.num_audio_mixes(output);
		Object generatedAudio_encoders = this.getAudio_encoders();
		for ( i = 0;
		 i < num_mixes; i++) {
			generatedAudio_encoders[i].obs_encoder_stop(encoded_callback, output);
		}
	}
	public void stop_raw_audio() {
		obs_output_info generatedInfo = this.getInfo();
		Object generatedRaw_audio2 = generatedInfo.getRaw_audio2();
		Object generatedMixer_mask = this.getMixer_mask();
		Object generatedAudio = this.getAudio();
		if (generatedRaw_audio2) {
			for (int idx = 0;
			 idx < MAX_AUDIO_MIXES; idx++) {
				if ((generatedMixer_mask & (()1 << idx)) != 0) {
					generatedAudio.audio_output_disconnect(idx, default_raw_audio_callback, output);
				} 
			}
		} else {
				generatedAudio.audio_output_disconnect(ModernizedCProgram.get_first_mixer(output), default_raw_audio_callback, output);
		} 
	}
	public void obs_output_end_data_capture_internal(Object signal) {
		int ret;
		if (!ModernizedCProgram.obs_object_valid(output, "obs_output_end_data_capture", "output")) {
			return ;
		} 
		Object generatedStopping_event = this.getStopping_event();
		if (!output.active() || !output.data_active()) {
			if (signal) {
				output.signal_stop();
				this.setStop_code(0);
				generatedStopping_event.os_event_signal();
			} 
			return ;
		} 
		Object generatedDelay_capturing = this.getDelay_capturing();
		Object generatedDelay_restart_refs = this.getDelay_restart_refs();
		Object generatedDelay_active = this.getDelay_active();
		if (ModernizedCProgram.delay_active(output)) {
			ModernizedCProgram.os_atomic_set_bool(generatedDelay_capturing, false);
			if (!ModernizedCProgram.os_atomic_load_long(generatedDelay_restart_refs)) {
				ModernizedCProgram.os_atomic_set_bool(generatedDelay_active, false);
			} else {
					generatedStopping_event.os_event_signal();
					return ;
			} 
		} 
		Object generatedData_active = this.getData_active();
		ModernizedCProgram.os_atomic_set_bool(generatedData_active, false);
		Object generatedVideo = this.getVideo();
		if (generatedVideo) {
			output.log_frame_info();
		} 
		Object generatedEnd_data_capture_thread = this.getEnd_data_capture_thread();
		if (ModernizedCProgram.data_capture_ending(output)) {
			ModernizedCProgram.pthread_join(generatedEnd_data_capture_thread, NULL);
		} 
		Object generatedEnd_data_capture_thread_active = this.getEnd_data_capture_thread_active();
		ModernizedCProgram.os_atomic_set_bool(generatedEnd_data_capture_thread_active, true);
		ret = ModernizedCProgram.pthread_create(generatedEnd_data_capture_thread, NULL, end_data_capture_thread, output);
		obs_context_data generatedContext = this.getContext();
		Byte generatedName = generatedContext.getName();
		if (ret != 0) {
			ModernizedCProgram.blog(LOG_WARNING, "Failed to create end_data_capture_thread for output '%s'!", generatedName);
			ModernizedCProgram.end_data_capture_thread(output);
		} 
		if (signal) {
			output.signal_stop();
			this.setStop_code(0);
		} 
	}
	public void obs_output_end_data_capture() {
		output.obs_output_end_data_capture_internal(true);
	}
	public void output_reconnect() {
		int ret;
		int generatedReconnect_retry_sec = this.getReconnect_retry_sec();
		if (!ModernizedCProgram.reconnecting(output)) {
			this.setReconnect_retry_cur_sec(generatedReconnect_retry_sec);
			this.setReconnect_retries(0);
		} 
		int generatedReconnect_retries = this.getReconnect_retries();
		int generatedReconnect_retry_max = this.getReconnect_retry_max();
		Object generatedReconnecting = this.getReconnecting();
		Object generatedDelay_active = this.getDelay_active();
		if (generatedReconnect_retries >= generatedReconnect_retry_max) {
			this.setStop_code(-5);
			ModernizedCProgram.os_atomic_set_bool(generatedReconnecting, false);
			if (ModernizedCProgram.delay_active(output)) {
				ModernizedCProgram.os_atomic_set_bool(generatedDelay_active, false);
			} 
			output.obs_output_end_data_capture();
			return ;
		} 
		Object generatedReconnect_stop_event = this.getReconnect_stop_event();
		if (!ModernizedCProgram.reconnecting(output)) {
			ModernizedCProgram.os_atomic_set_bool(generatedReconnecting, true);
			generatedReconnect_stop_event.os_event_reset();
		} 
		int generatedReconnect_retry_cur_sec = this.getReconnect_retry_cur_sec();
		if (generatedReconnect_retries) {
			generatedReconnect_retry_cur_sec *= 2;
			if (generatedReconnect_retry_cur_sec > (15 * 60)) {
				this.setReconnect_retry_cur_sec((15 * 60));
			} 
		} 
		generatedReconnect_retries++;
		this.setStop_code(-5);
		Object generatedReconnect_thread = this.getReconnect_thread();
		ret = ModernizedCProgram.pthread_create(generatedReconnect_thread, NULL, reconnect_thread, output);
		obs_context_data generatedContext = this.getContext();
		Byte generatedName = generatedContext.getName();
		if (ret < 0) {
			ModernizedCProgram.blog(LOG_WARNING, "Failed to create reconnect thread");
			ModernizedCProgram.os_atomic_set_bool(generatedReconnecting, false);
		} else {
				ModernizedCProgram.blog(LOG_INFO, "Output '%s':  Reconnecting in %d seconds..", generatedName, generatedReconnect_retry_sec);
				output.signal_reconnect();
		} 
	}
	public void obs_output_signal_stop(int code) {
		if (!ModernizedCProgram.obs_object_valid(output, "obs_output_signal_stop", "output")) {
			return ;
		} 
		this.setStop_code(code);
		Object generatedDelay_restart_refs = this.getDelay_restart_refs();
		Object generatedDelay_active = this.getDelay_active();
		if (ModernizedCProgram.can_reconnect(output, code)) {
			if (ModernizedCProgram.delay_active(output)) {
				ModernizedCProgram.os_atomic_inc_long(generatedDelay_restart_refs);
			} 
			output.obs_output_end_data_capture_internal(false);
			output.output_reconnect();
		} else {
				if (ModernizedCProgram.delay_active(output)) {
					ModernizedCProgram.os_atomic_set_bool(generatedDelay_active, false);
				} 
				output.obs_output_end_data_capture();
		} 
	}
	public void obs_output_addref() {
		if (!output) {
			return ;
		} 
		obs_weak_output generatedControl = this.getControl();
		obs_weak_ref generatedRef = generatedControl.getRef();
		generatedRef.obs_ref_addref();
	}
	public void obs_output_release() {
		if (!output) {
			return ;
		} 
		obs_weak_output generatedControl = this.getControl();
		obs_weak_output_t control = generatedControl;
		obs_weak_ref generatedRef = control.getRef();
		if (generatedRef.obs_ref_release()) {
			output.obs_output_destroy();
			control.obs_weak_output_release();
		} 
		// The order of operations is important here since// get_context_by_name in obs.c relies on weak refs
	}
	public obs_output obs_output_get_ref() {
		if (!output) {
			return NULL;
		} 
		obs_weak_output generatedControl = this.getControl();
		obs_output obs_output = new obs_output();
		return obs_output.obs_weak_output_get_output(generatedControl);
	}
	public obs_output obs_weak_output_get_output(obs_weak_output weak) {
		if (!weak) {
			return NULL;
		} 
		obs_weak_ref generatedRef = weak.getRef();
		obs_output generatedOutput = weak.getOutput();
		if (generatedRef.obs_weak_ref_get_ref()) {
			return generatedOutput;
		} 
		return NULL;
	}
	public Object obs_output_get_type_data() {
		obs_output_info generatedInfo = this.getInfo();
		Object generatedType_data = generatedInfo.getType_data();
		return ModernizedCProgram.obs_object_valid(output, "obs_output_get_type_data", "output") ? generatedType_data : NULL;
	}
	// split text into 32 character strings
	public double obs_output_get_congestion() {
		if (!ModernizedCProgram.obs_object_valid(output, "obs_output_get_congestion", "output")) {
			return 0;
		} 
		obs_output_info generatedInfo = this.getInfo();
		Object generatedGet_congestion = generatedInfo.getGet_congestion();
		obs_context_data generatedContext = this.getContext();
		Object generatedData = generatedContext.getData();
		if (generatedGet_congestion) {
			double val = .UNRECOGNIZEDFUNCTIONNAME(generatedData);
			if (val < 0.0) {
				val = 0.0;
			}  else if (val > 1.0) {
				val = 1.0;
			} 
			return val;
		} 
		return 0;
	}
	public int obs_output_get_connect_time_ms() {
		if (!ModernizedCProgram.obs_object_valid(output, "obs_output_get_connect_time_ms", "output")) {
			return -1;
		} 
		obs_output_info generatedInfo = this.getInfo();
		Object generatedGet_connect_time_ms = generatedInfo.getGet_connect_time_ms();
		obs_context_data generatedContext = this.getContext();
		Object generatedData = generatedContext.getData();
		if (generatedGet_connect_time_ms) {
			return .UNRECOGNIZEDFUNCTIONNAME(generatedData);
		} 
		return -1;
	}
	public Object obs_output_get_last_error() {
		if (!ModernizedCProgram.obs_object_valid(output, "obs_output_get_last_error", "output")) {
			return NULL;
		} 
		Byte generatedLast_error_message = this.getLast_error_message();
		return generatedLast_error_message;
	}
	public void obs_output_set_last_error(Object message) {
		if (!ModernizedCProgram.obs_object_valid(output, "obs_output_set_last_error", "output")) {
			return ;
		} 
		Byte generatedLast_error_message = this.getLast_error_message();
		if (generatedLast_error_message) {
			ModernizedCProgram.bfree(generatedLast_error_message);
		} 
		if (message) {
			this.setLast_error_message(ModernizedCProgram.bstrdup(message));
		} else {
				this.setLast_error_message(NULL);
		} 
	}
	public obs_context_data getContext() {
		return context;
	}
	public void setContext(obs_context_data newContext) {
		context = newContext;
	}
	public obs_output_info getInfo() {
		return info;
	}
	public void setInfo(obs_output_info newInfo) {
		info = newInfo;
	}
	public obs_weak_output getControl() {
		return control;
	}
	public void setControl(obs_weak_output newControl) {
		control = newControl;
	}
	public Object getOwns_info_id() {
		return owns_info_id;
	}
	public void setOwns_info_id(Object newOwns_info_id) {
		owns_info_id = newOwns_info_id;
	}
	public Object getReceived_video() {
		return received_video;
	}
	public void setReceived_video(Object newReceived_video) {
		received_video = newReceived_video;
	}
	public Object getReceived_audio() {
		return received_audio;
	}
	public void setReceived_audio(Object newReceived_audio) {
		received_audio = newReceived_audio;
	}
	public Object getData_active() {
		return data_active;
	}
	public void setData_active(Object newData_active) {
		data_active = newData_active;
	}
	public Object getEnd_data_capture_thread_active() {
		return end_data_capture_thread_active;
	}
	public void setEnd_data_capture_thread_active(Object newEnd_data_capture_thread_active) {
		end_data_capture_thread_active = newEnd_data_capture_thread_active;
	}
	public Object getVideo_offset() {
		return video_offset;
	}
	public void setVideo_offset(Object newVideo_offset) {
		video_offset = newVideo_offset;
	}
	public Object getAudio_offsets() {
		return audio_offsets;
	}
	public void setAudio_offsets(Object newAudio_offsets) {
		audio_offsets = newAudio_offsets;
	}
	public Object getHighest_audio_ts() {
		return highest_audio_ts;
	}
	public void setHighest_audio_ts(Object newHighest_audio_ts) {
		highest_audio_ts = newHighest_audio_ts;
	}
	public Object getHighest_video_ts() {
		return highest_video_ts;
	}
	public void setHighest_video_ts(Object newHighest_video_ts) {
		highest_video_ts = newHighest_video_ts;
	}
	public Object getEnd_data_capture_thread() {
		return end_data_capture_thread;
	}
	public void setEnd_data_capture_thread(Object newEnd_data_capture_thread) {
		end_data_capture_thread = newEnd_data_capture_thread;
	}
	public Object getStopping_event() {
		return stopping_event;
	}
	public void setStopping_event(Object newStopping_event) {
		stopping_event = newStopping_event;
	}
	public Object getInterleaved_mutex() {
		return interleaved_mutex;
	}
	public void setInterleaved_mutex(Object newInterleaved_mutex) {
		interleaved_mutex = newInterleaved_mutex;
	}
	public Object get() {
		return ;
	}
	public void set(Object new) {
		 = new;
	}
	public int getStop_code() {
		return stop_code;
	}
	public void setStop_code(int newStop_code) {
		stop_code = newStop_code;
	}
	public int getReconnect_retry_sec() {
		return reconnect_retry_sec;
	}
	public void setReconnect_retry_sec(int newReconnect_retry_sec) {
		reconnect_retry_sec = newReconnect_retry_sec;
	}
	public int getReconnect_retry_max() {
		return reconnect_retry_max;
	}
	public void setReconnect_retry_max(int newReconnect_retry_max) {
		reconnect_retry_max = newReconnect_retry_max;
	}
	public int getReconnect_retries() {
		return reconnect_retries;
	}
	public void setReconnect_retries(int newReconnect_retries) {
		reconnect_retries = newReconnect_retries;
	}
	public int getReconnect_retry_cur_sec() {
		return reconnect_retry_cur_sec;
	}
	public void setReconnect_retry_cur_sec(int newReconnect_retry_cur_sec) {
		reconnect_retry_cur_sec = newReconnect_retry_cur_sec;
	}
	public Object getReconnect_thread() {
		return reconnect_thread;
	}
	public void setReconnect_thread(Object newReconnect_thread) {
		reconnect_thread = newReconnect_thread;
	}
	public Object getReconnect_stop_event() {
		return reconnect_stop_event;
	}
	public void setReconnect_stop_event(Object newReconnect_stop_event) {
		reconnect_stop_event = newReconnect_stop_event;
	}
	public Object getReconnecting() {
		return reconnecting;
	}
	public void setReconnecting(Object newReconnecting) {
		reconnecting = newReconnecting;
	}
	public Object getReconnect_thread_active() {
		return reconnect_thread_active;
	}
	public void setReconnect_thread_active(Object newReconnect_thread_active) {
		reconnect_thread_active = newReconnect_thread_active;
	}
	public Object getStarting_drawn_count() {
		return starting_drawn_count;
	}
	public void setStarting_drawn_count(Object newStarting_drawn_count) {
		starting_drawn_count = newStarting_drawn_count;
	}
	public Object getStarting_lagged_count() {
		return starting_lagged_count;
	}
	public void setStarting_lagged_count(Object newStarting_lagged_count) {
		starting_lagged_count = newStarting_lagged_count;
	}
	public Object getStarting_frame_count() {
		return starting_frame_count;
	}
	public void setStarting_frame_count(Object newStarting_frame_count) {
		starting_frame_count = newStarting_frame_count;
	}
	public int getTotal_frames() {
		return total_frames;
	}
	public void setTotal_frames(int newTotal_frames) {
		total_frames = newTotal_frames;
	}
	public Object getActive() {
		return active;
	}
	public void setActive(Object newActive) {
		active = newActive;
	}
	public Object getPaused() {
		return paused;
	}
	public void setPaused(Object newPaused) {
		paused = newPaused;
	}
	public Object getVideo() {
		return video;
	}
	public void setVideo(Object newVideo) {
		video = newVideo;
	}
	public Object getAudio() {
		return audio;
	}
	public void setAudio(Object newAudio) {
		audio = newAudio;
	}
	public obs_encoder getVideo_encoder() {
		return video_encoder;
	}
	public void setVideo_encoder(obs_encoder newVideo_encoder) {
		video_encoder = newVideo_encoder;
	}
	public Object getAudio_encoders() {
		return audio_encoders;
	}
	public void setAudio_encoders(Object newAudio_encoders) {
		audio_encoders = newAudio_encoders;
	}
	public obs_service getService() {
		return service;
	}
	public void setService(obs_service newService) {
		service = newService;
	}
	public Object getMixer_mask() {
		return mixer_mask;
	}
	public void setMixer_mask(Object newMixer_mask) {
		mixer_mask = newMixer_mask;
	}
	public pause_data getPause() {
		return pause;
	}
	public void setPause(pause_data newPause) {
		pause = newPause;
	}
	public Object getAudio_buffer() {
		return audio_buffer;
	}
	public void setAudio_buffer(Object newAudio_buffer) {
		audio_buffer = newAudio_buffer;
	}
	public Object getAudio_start_ts() {
		return audio_start_ts;
	}
	public void setAudio_start_ts(Object newAudio_start_ts) {
		audio_start_ts = newAudio_start_ts;
	}
	public Object getVideo_start_ts() {
		return video_start_ts;
	}
	public void setVideo_start_ts(Object newVideo_start_ts) {
		video_start_ts = newVideo_start_ts;
	}
	public Object getAudio_size() {
		return audio_size;
	}
	public void setAudio_size(Object newAudio_size) {
		audio_size = newAudio_size;
	}
	public Object getPlanes() {
		return planes;
	}
	public void setPlanes(Object newPlanes) {
		planes = newPlanes;
	}
	public Object getSample_rate() {
		return sample_rate;
	}
	public void setSample_rate(Object newSample_rate) {
		sample_rate = newSample_rate;
	}
	public Object getTotal_audio_frames() {
		return total_audio_frames;
	}
	public void setTotal_audio_frames(Object newTotal_audio_frames) {
		total_audio_frames = newTotal_audio_frames;
	}
	public Object getScaled_width() {
		return scaled_width;
	}
	public void setScaled_width(Object newScaled_width) {
		scaled_width = newScaled_width;
	}
	public Object getScaled_height() {
		return scaled_height;
	}
	public void setScaled_height(Object newScaled_height) {
		scaled_height = newScaled_height;
	}
	public Object getVideo_conversion_set() {
		return video_conversion_set;
	}
	public void setVideo_conversion_set(Object newVideo_conversion_set) {
		video_conversion_set = newVideo_conversion_set;
	}
	public Object getAudio_conversion_set() {
		return audio_conversion_set;
	}
	public void setAudio_conversion_set(Object newAudio_conversion_set) {
		audio_conversion_set = newAudio_conversion_set;
	}
	public video_scale_info getVideo_conversion() {
		return video_conversion;
	}
	public void setVideo_conversion(video_scale_info newVideo_conversion) {
		video_conversion = newVideo_conversion;
	}
	public audio_convert_info getAudio_conversion() {
		return audio_conversion;
	}
	public void setAudio_conversion(audio_convert_info newAudio_conversion) {
		audio_conversion = newAudio_conversion;
	}
	public Object getCaption_mutex() {
		return caption_mutex;
	}
	public void setCaption_mutex(Object newCaption_mutex) {
		caption_mutex = newCaption_mutex;
	}
	public double getCaption_timestamp() {
		return caption_timestamp;
	}
	public void setCaption_timestamp(double newCaption_timestamp) {
		caption_timestamp = newCaption_timestamp;
	}
	public caption_text getCaption_head() {
		return caption_head;
	}
	public void setCaption_head(caption_text newCaption_head) {
		caption_head = newCaption_head;
	}
	public caption_text getCaption_tail() {
		return caption_tail;
	}
	public void setCaption_tail(caption_text newCaption_tail) {
		caption_tail = newCaption_tail;
	}
	public Object getValid() {
		return valid;
	}
	public void setValid(Object newValid) {
		valid = newValid;
	}
	public Object getActive_delay_ns() {
		return active_delay_ns;
	}
	public void setActive_delay_ns(Object newActive_delay_ns) {
		active_delay_ns = newActive_delay_ns;
	}
	public Object getDelay_callback() {
		return delay_callback;
	}
	public void setDelay_callback(Object newDelay_callback) {
		delay_callback = newDelay_callback;
	}
	public circlebuf getDelay_data() {
		return delay_data;
	}
	public void setDelay_data(circlebuf newDelay_data) {
		delay_data = newDelay_data;
	}
	public Object getDelay_mutex() {
		return delay_mutex;
	}
	public void setDelay_mutex(Object newDelay_mutex) {
		delay_mutex = newDelay_mutex;
	}
	public Object getDelay_sec() {
		return delay_sec;
	}
	public void setDelay_sec(Object newDelay_sec) {
		delay_sec = newDelay_sec;
	}
	public Object getDelay_flags() {
		return delay_flags;
	}
	public void setDelay_flags(Object newDelay_flags) {
		delay_flags = newDelay_flags;
	}
	public Object getDelay_cur_flags() {
		return delay_cur_flags;
	}
	public void setDelay_cur_flags(Object newDelay_cur_flags) {
		delay_cur_flags = newDelay_cur_flags;
	}
	public Object getDelay_restart_refs() {
		return delay_restart_refs;
	}
	public void setDelay_restart_refs(Object newDelay_restart_refs) {
		delay_restart_refs = newDelay_restart_refs;
	}
	public Object getDelay_active() {
		return delay_active;
	}
	public void setDelay_active(Object newDelay_active) {
		delay_active = newDelay_active;
	}
	public Object getDelay_capturing() {
		return delay_capturing;
	}
	public void setDelay_capturing(Object newDelay_capturing) {
		delay_capturing = newDelay_capturing;
	}
	public Byte getLast_error_message() {
		return last_error_message;
	}
	public void setLast_error_message(Byte newLast_error_message) {
		last_error_message = newLast_error_message;
	}
	public Object getAudio_data() {
		return audio_data;
	}
	public void setAudio_data(Object newAudio_data) {
		audio_data = newAudio_data;
	}
}

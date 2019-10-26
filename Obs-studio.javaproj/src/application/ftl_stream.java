package application;

public class ftl_stream {
	private obs_output output;
	private Object packets_mutex;
	private circlebuf packets;
	private Object sent_headers;
	private Object frames_sent;
	private Object connecting;
	private Object connect_thread;
	private Object status_thread;
	private Object active;
	private Object disconnected;
	private Object encode_error;
	private Object send_thread;
	private int max_shutdown_time_sec;
	private Object send_sem;
	private Object stop_event;
	private Object stop_ts;
	private Object shutdown_timeout_ts;
	private dstr path;
	private Object channel_id;
	private dstr username;
	private dstr password;
	private dstr encoder_name;
	private dstr bind_ip;
	private Object drop_threshold_usec;
	private Object pframe_drop_threshold_usec;
	private int min_priority;
	private double congestion;
	private Object last_dts_usec;
	private Object total_bytes_sent;
	private Object dropped_frames;
	private Object last_nack_count;
	private Object ftl_handle;
	private Object params;
	private int peak_kbps;
	private Object scale_width;
	private Object scale_height;
	private Object width;
	private Object height;
	private _frame_of_nalus_t coded_pic_buffer;
	
	public ftl_stream(obs_output output, Object packets_mutex, circlebuf packets, Object sent_headers, Object frames_sent, Object connecting, Object connect_thread, Object status_thread, Object active, Object disconnected, Object encode_error, Object send_thread, int max_shutdown_time_sec, Object send_sem, Object stop_event, Object stop_ts, Object shutdown_timeout_ts, dstr path, Object channel_id, dstr username, dstr password, dstr encoder_name, dstr bind_ip, Object drop_threshold_usec, Object pframe_drop_threshold_usec, int min_priority, double congestion, Object last_dts_usec, Object total_bytes_sent, Object dropped_frames, Object last_nack_count, Object ftl_handle, Object params, int peak_kbps, Object scale_width, Object scale_height, Object width, Object height, _frame_of_nalus_t coded_pic_buffer) {
		setOutput(output);
		setPackets_mutex(packets_mutex);
		setPackets(packets);
		setSent_headers(sent_headers);
		setFrames_sent(frames_sent);
		setConnecting(connecting);
		setConnect_thread(connect_thread);
		setStatus_thread(status_thread);
		setActive(active);
		setDisconnected(disconnected);
		setEncode_error(encode_error);
		setSend_thread(send_thread);
		setMax_shutdown_time_sec(max_shutdown_time_sec);
		setSend_sem(send_sem);
		setStop_event(stop_event);
		setStop_ts(stop_ts);
		setShutdown_timeout_ts(shutdown_timeout_ts);
		setPath(path);
		setChannel_id(channel_id);
		setUsername(username);
		setPassword(password);
		setEncoder_name(encoder_name);
		setBind_ip(bind_ip);
		setDrop_threshold_usec(drop_threshold_usec);
		setPframe_drop_threshold_usec(pframe_drop_threshold_usec);
		setMin_priority(min_priority);
		setCongestion(congestion);
		setLast_dts_usec(last_dts_usec);
		setTotal_bytes_sent(total_bytes_sent);
		setDropped_frames(dropped_frames);
		setLast_nack_count(last_nack_count);
		setFtl_handle(ftl_handle);
		setParams(params);
		setPeak_kbps(peak_kbps);
		setScale_width(scale_width);
		setScale_height(scale_height);
		setWidth(width);
		setHeight(height);
		setCoded_pic_buffer(coded_pic_buffer);
	}
	public ftl_stream() {
	}
	
	public void free_packets() {
		size_t num_packets = new size_t();
		Object generatedPackets_mutex = this.getPackets_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedPackets_mutex);
		num_packets = stream.num_buffered_packets();
		obs_output generatedOutput = this.getOutput();
		if (num_packets) {
			ModernizedCProgram.blog(LOG_INFO, "[ftl stream: '%s'] Freeing %d remaining packets", ModernizedCProgram.obs_output_get_name(generatedOutput), (int)num_packets);
		} 
		circlebuf generatedPackets = this.getPackets();
		Object generatedCirclebuf = generatedPackets.getCirclebuf();
		while (generatedCirclebuf) {
			encoder_packet packet = new encoder_packet();
			generatedPackets.circlebuf_pop_front(packet, );
			packet.obs_encoder_packet_release();
		}
		ModernizedCProgram.pthread_mutex_unlock(generatedPackets_mutex);
		Object generatedInterleaved_packets = output.getInterleaved_packets();
		for ( i = 0;
		 i < generatedInterleaved_packets.getNum(); i++) {
			generatedInterleaved_packets.getArray() + i.obs_encoder_packet_release();
		}
		.da_free(generatedInterleaved_packets);
		size_t num_packets = new size_t();
		Object generatedPackets_mutex = this.getPackets_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedPackets_mutex);
		num_packets = stream.num_buffered_packets();
		Object generatedOutput = this.getOutput();
		if (num_packets) {
			ModernizedCProgram.blog(LOG_INFO, "[rtmp stream: '%s'] Freeing %d remaining packets", ModernizedCProgram.obs_output_get_name(generatedOutput), (int)num_packets);
		} 
		Object generatedPackets = this.getPackets();
		while (generatedPackets.getCirclebuf()) {
			encoder_packet packet = new encoder_packet();
			generatedPackets.circlebuf_pop_front(packet, );
			packet.obs_encoder_packet_release();
		}
		ModernizedCProgram.pthread_mutex_unlock(generatedPackets_mutex);
	}
	public Object connecting() {
		Object generatedConnecting = this.getConnecting();
		return ModernizedCProgram.os_atomic_load_bool(generatedConnecting);
		Object generatedConnecting = this.getConnecting();
		return ModernizedCProgram.os_atomic_load_bool(generatedConnecting);
	}
	public Object disconnected() {
		Object generatedDisconnected = this.getDisconnected();
		return ModernizedCProgram.os_atomic_load_bool(generatedDisconnected);
		Object generatedDisconnected = this.getDisconnected();
		return ModernizedCProgram.os_atomic_load_bool(generatedDisconnected);
	}
	public void set_peak_bitrate() {
		int speedtest_kbps = 15000;
		int speedtest_duration = 1000;
		 results = new ();
		 status_code = new ();
		Object generatedFtl_handle = this.getFtl_handle();
		status_code = .ftl_ingest_speed_test_ex(generatedFtl_handle, speedtest_kbps, speedtest_duration, results);
		double percent_lost = 0;
		obs_output generatedOutput = this.getOutput();
		if (status_code == FTL_SUCCESS) {
			percent_lost = (double)results.getLost_pkts() * 100.0 / (double)results.getPkts_sent();
		} else {
				ModernizedCProgram.blog(LOG_WARNING, "[ftl stream: '%s'] Speed test failed with: %s", ModernizedCProgram.obs_output_get_name(generatedOutput), .ftl_status_code_to_string(status_code));
		} 
		obs_encoder obs_encoder = new obs_encoder();
		// Get what the user set the encoding bitrate to.obs_encoder_t video_encoder = obs_encoder.obs_output_get_video_encoder(generatedOutput);
		obs_data obs_data = new obs_data();
		obs_data_t video_settings = obs_data.obs_encoder_get_settings(video_encoder);
		int user_desired_bitrate = (int)video_settings.obs_data_get_int("bitrate");
		video_settings.obs_data_release();
		// Report the results.// Report the results.ModernizedCProgram.blog(LOG_INFO, "[ftl stream: '%s'] Speed test completed: User desired bitrate %d, Peak kbps %d, initial rtt %d, final rtt %d, %3.2f lost packets", ModernizedCProgram.obs_output_get_name(generatedOutput), user_desired_bitrate, results.getPeak_kbps(), results.getStarting_rtt(), results.getEnding_rtt(), percent_lost);
		Object generatedParams = this.getParams();
		// We still want to set the peak to about 1.2x what the target bitrate is,// even if the speed test reported it should be lower. If we don't, FTL// will queue data on the client and start adding latency. If the internet// connection really can't handle the bitrate the user will see either lost frame// and recovered frame counts go up, which is reflect in the dropped_frames count.// We still want to set the peak to about 1.2x what the target bitrate is,// even if the speed test reported it should be lower. If we don't, FTL// will queue data on the client and start adding latency. If the internet// connection really can't handle the bitrate the user will see either lost frame// and recovered frame counts go up, which is reflect in the dropped_frames count.this.setPeak_kbps(generatedParams.setPeak_kbps(user_desired_bitrate * 12 / 10));
		.ftl_ingest_update_params(generatedFtl_handle, generatedParams);
	}
	public Object send_video_header(Object dts_usec) {
		obs_output generatedOutput = this.getOutput();
		obs_output_t context = generatedOutput;
		obs_encoder obs_encoder = new obs_encoder();
		obs_encoder_t vencoder = obs_encoder.obs_output_get_video_encoder(context);
		uint8_t header = new uint8_t();
		size_t size = new size_t();
		encoder_packet packet = new encoder_packet(, , , );
		ModernizedCProgram.obs_encoder_get_extra_data(vencoder, header, size);
		Object generatedData = packet.getData();
		packet.setSize(ModernizedCProgram.obs_parse_avc_header(generatedData, header, size));
		return ModernizedCProgram.send_packet(stream, packet, true) >= 0;
		Object generatedOutput = this.getOutput();
		obs_output_t context = generatedOutput;
		obs_encoder obs_encoder = new obs_encoder();
		obs_encoder_t vencoder = obs_encoder.obs_output_get_video_encoder(context);
		uint8_t header = new uint8_t();
		size_t size = new size_t();
		encoder_packet packet = new encoder_packet(, , );
		ModernizedCProgram.obs_encoder_get_extra_data(vencoder, header, size);
		Object generatedData = packet.getData();
		packet.setSize(ModernizedCProgram.obs_parse_avc_header(generatedData, header, size));
		return ModernizedCProgram.send_packet(stream, packet, true, 0) >= 0;
	}
	public Object send_headers(Object dts_usec) {
		this.setSent_headers(true);
		if (!stream.send_video_header(dts_usec)) {
			return false;
		} 
		return true;
		obs_encoder_t aencoder = new obs_encoder_t();
		 idx = 0;
		if (!stream.send_video_headers()) {
			return false;
		} 
		obs_output generatedOutput = this.getOutput();
		obs_encoder obs_encoder = new obs_encoder();
		do {
			aencoder = obs_encoder.obs_output_get_audio_encoder(generatedOutput, idx);
			if (aencoder) {
				if (!ModernizedCProgram.send_audio_headers(stream, aencoder, idx)) {
					return false;
				} 
				idx++;
			} 
		} while (aencoder);
		return true;
		this.setSent_headers(true);
		size_t i = 0;
		 next = true;
		if (!stream.send_audio_header(i++, next)) {
			return false;
		} 
		if (!stream.send_video_header()) {
			return false;
		} 
		while (next) {
			if (!stream.send_audio_header(i++, next)) {
				return false;
			} 
		}
		return true;
	}
	public Object reset_semaphore() {
		Object generatedSend_sem = this.getSend_sem();
		generatedSend_sem.os_sem_destroy();
		return generatedSend_sem.os_sem_init(0) == 0;
		Object generatedSend_sem = this.getSend_sem();
		generatedSend_sem.os_sem_destroy();
		return generatedSend_sem.os_sem_init(0) == 0;
	}
	public int init_send() {
		int ret;
		stream.reset_semaphore();
		Object generatedSend_thread = this.getSend_thread();
		ret = ModernizedCProgram.pthread_create(generatedSend_thread, ((Object)0), send_thread, stream);
		obs_output generatedOutput = this.getOutput();
		if (ret != 0) {
			ModernizedCProgram.blog(LOG_WARNING, "[ftl stream: '%s'] Failed to create send thread", ModernizedCProgram.obs_output_get_name(generatedOutput));
			return -4;
		} 
		Object generatedActive = this.getActive();
		ModernizedCProgram.os_atomic_set_bool(generatedActive, true);
		generatedOutput.obs_output_begin_data_capture(0);
		return 0;
		int ret;
		size_t idx = 0;
		 next = true;
		stream.adjust_sndbuf_size(65535);
		stream.reset_semaphore();
		Object generatedSend_thread = this.getSend_thread();
		ret = ModernizedCProgram.pthread_create(generatedSend_thread, ((Object)0), send_thread, stream);
		Object generatedRtmp = this.getRtmp();
		Object generatedOutput = this.getOutput();
		if (ret != 0) {
			generatedRtmp.RTMP_Close();
			ModernizedCProgram.blog(LOG_WARNING, "[rtmp stream: '%s'] Failed to create send thread", ModernizedCProgram.obs_output_get_name(generatedOutput));
			return -4;
		} 
		Object generatedNew_socket_loop = this.getNew_socket_loop();
		Object generatedSend_thread_signaled_exit = this.getSend_thread_signaled_exit();
		Object generatedLow_latency_mode = this.getLow_latency_mode();
		Object generatedWrite_buf = this.getWrite_buf();
		obs_encoder obs_encoder = new obs_encoder();
		obs_data obs_data = new obs_data();
		obs_encoder obs_encoder = new obs_encoder();
		Object generatedSocket_thread = this.getSocket_thread();
		if (generatedNew_socket_loop) {
			int one = 1;
			if (.ioctlsocket(generatedRtmp.getM_sb().getSb_socket(), (-1024 | (((long) & -1024) << 16) | (((byte)'f') << 8) | (true)), ModernizedCProgram.one)) {
				generatedRtmp.setLast_error_code(.WSAGetLastError());
				ModernizedCProgram.blog(LOG_WARNING, "[rtmp stream: '%s'] Failed to set non-blocking socket", ModernizedCProgram.obs_output_get_name(generatedOutput));
				return -4;
			} 
			generatedSend_thread_signaled_exit.os_event_reset();
			ModernizedCProgram.blog(LOG_INFO, "[rtmp stream: '%s'] New socket loop enabled by user", ModernizedCProgram.obs_output_get_name(generatedOutput));
			if (generatedLow_latency_mode) {
				ModernizedCProgram.blog(LOG_INFO, "[rtmp stream: '%s'] Low latency mode enabled by user", ModernizedCProgram.obs_output_get_name(generatedOutput));
			} 
			if (generatedWrite_buf) {
				ModernizedCProgram.bfree(generatedWrite_buf);
			} 
			int total_bitrate = 0;
			obs_output_t context = generatedOutput;
			obs_encoder_t vencoder = obs_encoder.obs_output_get_video_encoder(context);
			if (vencoder) {
				obs_data_t params = obs_data.obs_encoder_get_settings(vencoder);
				if (params) {
					int bitrate = params.obs_data_get_int("bitrate");
					if (!bitrate) {
						ModernizedCProgram.blog(LOG_WARNING, "[rtmp stream: '%s'] Video encoder didn't return a valid bitrate, new network code may function poorly. Low latency mode disabled.", ModernizedCProgram.obs_output_get_name(generatedOutput));
						this.setLow_latency_mode(false);
						bitrate = 10000;
					} 
					total_bitrate += bitrate;
					params.obs_data_release();
				} 
			} 
			obs_encoder_t aencoder = obs_encoder.obs_output_get_audio_encoder(context, 0);
			if (aencoder) {
				obs_data_t params = obs_data.obs_encoder_get_settings(aencoder);
				if (params) {
					int bitrate = params.obs_data_get_int("bitrate");
					if (!bitrate) {
						bitrate = 160;
					} 
					total_bitrate += bitrate;
					params.obs_data_release();
				} 
			} 
			int ideal_buffer_size = total_bitrate * 128;
			if (ideal_buffer_size < 131072) {
				ideal_buffer_size = 131072;
			} 
			this.setWrite_buf_size(ideal_buffer_size);
			this.setWrite_buf(ModernizedCProgram.bmalloc(ideal_buffer_size));
			ret = ModernizedCProgram.pthread_create(generatedSocket_thread, ((Object)0), ModernizedCProgram.socket_thread_windows, stream);
			if (ret != 0) {
				generatedRtmp.RTMP_Close();
				ModernizedCProgram.blog(LOG_WARNING, "[rtmp stream: '%s'] Failed to create socket thread", ModernizedCProgram.obs_output_get_name(generatedOutput));
				return -4;
			} 
			this.setSocket_thread_active(true);
			generatedRtmp.setM_bCustomSend(true);
			generatedRtmp.setM_customSendFunc(socket_queue_data);
			generatedRtmp.setM_customSendParam(stream);
		} 
		Object generatedActive = this.getActive();
		ModernizedCProgram.os_atomic_set_bool(generatedActive, true);
		while (next) {
			if (!stream.send_meta_data(idx++, next)) {
				ModernizedCProgram.blog(LOG_WARNING, "[rtmp stream: '%s'] Disconnected while attempting to connect to server.", ModernizedCProgram.obs_output_get_name(generatedOutput));
				stream.set_output_error();
				return -5;
			} 
		}
		generatedOutput.obs_output_begin_data_capture(0);
		return 0;
	}
	public Object num_buffered_packets() {
		circlebuf generatedPackets = this.getPackets();
		Object generatedCirclebuf = generatedPackets.getCirclebuf();
		return generatedCirclebuf / ;
		Object generatedPackets = this.getPackets();
		return generatedPackets.getCirclebuf() / ;
	}
	public void drop_frames(Object name, int highest_priority, Object pframes) {
		.UNUSED_PARAMETER(pframes);
		circlebuf new_buf = new circlebuf(0);
		int num_frames_dropped = 0;
		.UNUSED_PARAMETER(name);
		new_buf.circlebuf_reserve( * 8);
		circlebuf generatedPackets = this.getPackets();
		Object generatedCirclebuf = generatedPackets.getCirclebuf();
		obs_encoder_type generatedType = packet.getType();
		int generatedDrop_priority = packet.getDrop_priority();
		while (generatedCirclebuf) {
			encoder_packet packet = new encoder_packet();
			generatedPackets.circlebuf_pop_front(packet, );
			if (generatedType == /* do not drop audio data or video keyframes */obs_encoder_type.OBS_ENCODER_AUDIO || generatedDrop_priority >= highest_priority) {
				new_buf.circlebuf_push_back(packet, );
			} else {
					num_frames_dropped++;
					packet.obs_encoder_packet_release();
			} 
		}
		generatedPackets.circlebuf_free();
		this.setPackets(new_buf);
		int generatedMin_priority = this.getMin_priority();
		if (generatedMin_priority < highest_priority) {
			this.setMin_priority(highest_priority);
		} 
		if (!num_frames_dropped) {
			return ;
		} 
		Object generatedDropped_frames = this.getDropped_frames();
		generatedDropped_frames += num_frames_dropped;
		.UNUSED_PARAMETER(pframes);
		circlebuf new_buf = new circlebuf(0);
		int num_frames_dropped = 0;
		.UNUSED_PARAMETER(name);
		new_buf.circlebuf_reserve( * 8);
		Object generatedPackets = this.getPackets();
		obs_encoder_type generatedType = packet.getType();
		int generatedDrop_priority = packet.getDrop_priority();
		while (generatedPackets.getCirclebuf()) {
			encoder_packet packet = new encoder_packet();
			generatedPackets.circlebuf_pop_front(packet, );
			if (generatedType == /* do not drop audio data or video keyframes */obs_encoder_type.OBS_ENCODER_AUDIO || generatedDrop_priority >= highest_priority) {
				new_buf.circlebuf_push_back(packet, );
			} else {
					num_frames_dropped++;
					packet.obs_encoder_packet_release();
			} 
		}
		generatedPackets.circlebuf_free();
		this.setPackets(new_buf);
		Object generatedMin_priority = this.getMin_priority();
		if (generatedMin_priority < highest_priority) {
			this.setMin_priority(highest_priority);
		} 
		if (!num_frames_dropped) {
			return ;
		} 
		Object generatedDropped_frames = this.getDropped_frames();
		generatedDropped_frames += num_frames_dropped;
	}
	public void check_to_drop_frames(Object pframes) {
		encoder_packet first = new encoder_packet();
		int64_t buffer_duration_usec = new int64_t();
		size_t num_packets = stream.num_buffered_packets();
		byte name = pframes ? "p-frames" : "b-frames";
		int priority = pframes ? .OBS_NAL_PRIORITY_HIGHEST : .OBS_NAL_PRIORITY_HIGH;
		Object generatedPframe_drop_threshold_usec = this.getPframe_drop_threshold_usec();
		Object generatedDrop_threshold_usec = this.getDrop_threshold_usec();
		int64_t drop_threshold = pframes ? generatedPframe_drop_threshold_usec : generatedDrop_threshold_usec;
		if (num_packets < 5) {
			if (!pframes) {
				this.setCongestion(0.0);
			} 
			return ;
		} 
		if (!ModernizedCProgram.find_first_video_packet(stream, first)) {
			return ;
		} 
		Object generatedLast_dts_usec = this.getLast_dts_usec();
		Object generatedDts_usec = first.getDts_usec();
		buffer_duration_usec = generatedLast_dts_usec - generatedDts_usec;
		if (!pframes) {
			this.setCongestion((double)buffer_duration_usec / (double)drop_threshold);
		} 
		obs_output generatedOutput = this.getOutput();
		if (buffer_duration_usec > drop_threshold) {
			ModernizedCProgram.blog(LOG_DEBUG, "[ftl stream: '%s'] buffer_duration_usec: %I64d", ModernizedCProgram.obs_output_get_name(generatedOutput), buffer_duration_usec);
			stream.drop_frames(name, priority, pframes);
		} 
		encoder_packet first = new encoder_packet();
		int64_t buffer_duration_usec = new int64_t();
		size_t num_packets = stream.num_buffered_packets();
		byte name = pframes ? "p-frames" : "b-frames";
		int priority = pframes ? .OBS_NAL_PRIORITY_HIGHEST : .OBS_NAL_PRIORITY_HIGH;
		Object generatedPframe_drop_threshold_usec = this.getPframe_drop_threshold_usec();
		Object generatedDrop_threshold_usec = this.getDrop_threshold_usec();
		int64_t drop_threshold = pframes ? generatedPframe_drop_threshold_usec : generatedDrop_threshold_usec;
		Object generatedDbr_enabled = this.getDbr_enabled();
		Object generatedDbr_inc_timeout = this.getDbr_inc_timeout();
		if (!pframes && generatedDbr_enabled) {
			if (generatedDbr_inc_timeout) {
				uint64_t t = ModernizedCProgram.os_gettime_ns();
				if (t >= generatedDbr_inc_timeout) {
					this.setDbr_inc_timeout(0);
					stream.dbr_inc_bitrate();
					stream.dbr_set_bitrate();
				} 
			} 
		} 
		if (num_packets < 5) {
			if (!pframes) {
				this.setCongestion(0.0);
			} 
			return ;
		} 
		if (!ModernizedCProgram.find_first_video_packet(stream, first)) {
			return ;
		} 
		Object generatedLast_dts_usec = this.getLast_dts_usec();
		Object generatedDts_usec = first.getDts_usec();
		buffer_duration_usec = generatedLast_dts_usec - generatedDts_usec;
		if (!pframes) {
			this.setCongestion((double)buffer_duration_usec / (double)drop_threshold/* alternatively, drop only pframes:
				 * (!pframes && stream->dbr_enabled)
				 * but let's test without dropping frames
				 * at all first */);
		} 
		Object generatedDbr_mutex = this.getDbr_mutex();
		Object generatedOutput = this.getOutput();
		if (generatedDbr_enabled) {
			 bitrate_changed = false;
			if (pframes) {
				return ;
			} 
			if ((uint64_t)buffer_duration_usec >= (-1024 * -1024)) {
				ModernizedCProgram.pthread_mutex_lock(generatedDbr_mutex);
				bitrate_changed = stream.dbr_bitrate_lowered();
				ModernizedCProgram.pthread_mutex_unlock(generatedDbr_mutex);
			} 
			if (bitrate_changed) {
				ModernizedCProgram.blog(LOG_DEBUG, "[rtmp stream: '%s'] buffer_duration_msec: %I64d", ModernizedCProgram.obs_output_get_name(generatedOutput), buffer_duration_usec / 1000);
				stream.dbr_set_bitrate();
			} 
			return ;
		} 
		if (buffer_duration_usec > drop_threshold) {
			ModernizedCProgram.blog(LOG_DEBUG, "[rtmp stream: '%s'] buffer_duration_usec: %I64d", ModernizedCProgram.obs_output_get_name(generatedOutput), buffer_duration_usec);
			stream.drop_frames(name, priority, pframes);
		} 
	}
	public ret_type ftl_event(Object status) {
		if (status.getMsg().getEvent().getType() != FTL_STATUS_EVENT_TYPE_DISCONNECTED) {
			return ret_type.RET_CONTINUE;
		} 
		obs_output generatedOutput = this.getOutput();
		ModernizedCProgram.blog(LOG_INFO, "[ftl stream: '%s'] Disconnected from ingest with reason: %s", ModernizedCProgram.obs_output_get_name(generatedOutput), .ftl_status_code_to_string(status.getMsg().getEvent().getError_code()));
		if (status.getMsg().getEvent().getReason() == FTL_STATUS_EVENT_REASON_API_REQUEST) {
			return ret_type.RET_BREAK;
		} 
		//tell OBS and it will trigger a reconnection//tell OBS and it will trigger a reconnectionModernizedCProgram.blog(LOG_WARNING, "Reconnecting to Ingest");
		generatedOutput.obs_output_signal_stop(-5);
		return ret_type.RET_EXIT;
	}
	public int init_connect() {
		obs_service_t service = new obs_service_t();
		obs_data_t settings = new obs_data_t();
		byte bind_ip;
		byte key;
		 status_code = new ();
		obs_output generatedOutput = this.getOutput();
		ModernizedCProgram.blog(LOG_INFO, "[ftl stream: '%s'] init_connect", ModernizedCProgram.obs_output_get_name(generatedOutput));
		Object generatedSend_thread = this.getSend_thread();
		if (stream.stopping()) {
			ModernizedCProgram.pthread_join(generatedSend_thread, ((Object)0));
		} 
		stream.free_packets();
		obs_service obs_service = new obs_service();
		service = obs_service.obs_output_get_service(generatedOutput);
		if (!service) {
			return -4;
		} 
		Object generatedDisconnected = this.getDisconnected();
		ModernizedCProgram.os_atomic_set_bool(generatedDisconnected, false);
		Object generatedEncode_error = this.getEncode_error();
		ModernizedCProgram.os_atomic_set_bool(generatedEncode_error, false);
		this.setTotal_bytes_sent(0);
		this.setDropped_frames(0);
		this.setMin_priority(0);
		obs_data obs_data = new obs_data();
		settings = obs_data.obs_output_get_settings(generatedOutput);
		obs_encoder obs_encoder = new obs_encoder();
		obs_encoder_t video_encoder = obs_encoder.obs_output_get_video_encoder(generatedOutput);
		obs_data obs_data = new obs_data();
		obs_data_t video_settings = obs_data.obs_encoder_get_settings(video_encoder);
		dstr generatedPath = this.getPath();
		generatedPath.dstr_copy(ModernizedCProgram.obs_service_get_url(service));
		key = ModernizedCProgram.obs_service_get_key(service);
		int target_bitrate = (int)video_settings.obs_data_get_int("bitrate");
		int peak_bitrate = (int)((double)target_bitrate * 1.1);
		//minimum overshoot tolerance of 10%if (peak_bitrate < target_bitrate) {
			peak_bitrate = target_bitrate;
		} 
		Object generatedParams = this.getParams();
		generatedParams.setStream_key((byte)key);
		generatedParams.setVideo_codec(FTL_VIDEO_H264);
		generatedParams.setAudio_codec(FTL_AUDIO_OPUS);
		Object generatedDstr = generatedPath.getDstr();
		generatedParams.setIngest_hostname(generatedDstr);
		generatedParams.setVendor_name("OBS Studio");
		generatedParams.setVendor_version("unknown");
		int generatedPeak_kbps = this.getPeak_kbps();
		generatedParams.setPeak_kbps(generatedPeak_kbps < 0 ? 0 : generatedPeak_kbps);
		//not required when using ftl_ingest_send_media_dts//not required when using ftl_ingest_send_media_dtsgeneratedParams.setFps_num(0);
		generatedParams.setFps_den(0);
		Object generatedFtl_handle = this.getFtl_handle();
		status_code = .ftl_ingest_create(generatedFtl_handle, generatedParams);
		if (status_code != FTL_SUCCESS) {
			if (status_code == FTL_BAD_OR_INVALID_STREAM_KEY) {
				ModernizedCProgram.blog(LOG_ERROR, "Invalid Key (%s)", .ftl_status_code_to_string(status_code));
				return -3;
			} else {
					ModernizedCProgram.blog(LOG_ERROR, "Failed to create ingest handle (%s)", .ftl_status_code_to_string(status_code));
					return -4;
			} 
		} 
		dstr generatedUsername = this.getUsername();
		generatedUsername.dstr_copy(ModernizedCProgram.obs_service_get_username(service));
		dstr generatedPassword = this.getPassword();
		generatedPassword.dstr_copy(ModernizedCProgram.obs_service_get_password(service));
		generatedPath.dstr_depad();
		this.setDrop_threshold_usec((int64_t)settings.obs_data_get_int("drop_threshold_ms") * 1000);
		this.setMax_shutdown_time_sec((int)settings.obs_data_get_int("max_shutdown_time_sec"));
		bind_ip = settings.obs_data_get_string("bind_ip");
		dstr generatedBind_ip = this.getBind_ip();
		generatedBind_ip.dstr_copy(bind_ip);
		settings.obs_data_release();
		video_settings.obs_data_release();
		return 0;
		obs_service_t service = new obs_service_t();
		obs_data_t settings = new obs_data_t();
		byte bind_ip;
		int64_t drop_p = new int64_t();
		int64_t drop_b = new int64_t();
		uint32_t caps = new uint32_t();
		Object generatedSend_thread = this.getSend_thread();
		if (stream.stopping()) {
			ModernizedCProgram.pthread_join(generatedSend_thread, ((Object)0));
		} 
		stream.free_packets();
		Object generatedOutput = this.getOutput();
		obs_service obs_service = new obs_service();
		service = obs_service.obs_output_get_service(generatedOutput);
		if (!service) {
			return false;
		} 
		Object generatedDisconnected = this.getDisconnected();
		ModernizedCProgram.os_atomic_set_bool(generatedDisconnected, false);
		Object generatedEncode_error = this.getEncode_error();
		ModernizedCProgram.os_atomic_set_bool(generatedEncode_error, false);
		this.setTotal_bytes_sent(0);
		this.setDropped_frames(0);
		this.setMin_priority(0);
		this.setGot_first_video(false);
		obs_data obs_data = new obs_data();
		settings = obs_data.obs_output_get_settings(generatedOutput);
		Object generatedPath = this.getPath();
		generatedPath.dstr_copy(ModernizedCProgram.obs_service_get_url(service));
		Object generatedKey = this.getKey();
		generatedKey.dstr_copy(ModernizedCProgram.obs_service_get_key(service));
		Object generatedUsername = this.getUsername();
		generatedUsername.dstr_copy(ModernizedCProgram.obs_service_get_username(service));
		Object generatedPassword = this.getPassword();
		generatedPassword.dstr_copy(ModernizedCProgram.obs_service_get_password(service));
		generatedPath.dstr_depad();
		generatedKey.dstr_depad();
		drop_b = (int64_t)settings.obs_data_get_int("drop_threshold_ms");
		drop_p = (int64_t)settings.obs_data_get_int("pframe_drop_threshold_ms");
		this.setMax_shutdown_time_sec((int)settings.obs_data_get_int("max_shutdown_time_sec"));
		obs_encoder obs_encoder = new obs_encoder();
		obs_encoder_t venc = obs_encoder.obs_output_get_video_encoder(generatedOutput);
		obs_encoder obs_encoder = new obs_encoder();
		obs_encoder_t aenc = obs_encoder.obs_output_get_audio_encoder(generatedOutput, 0);
		obs_data obs_data = new obs_data();
		obs_data_t vsettings = obs_data.obs_encoder_get_settings(venc);
		obs_data_t asettings = obs_data.obs_encoder_get_settings(aenc);
		Object generatedDbr_frames = this.getDbr_frames();
		generatedDbr_frames.circlebuf_free();
		this.setAudio_bitrate((long)asettings.obs_data_get_int("bitrate"));
		this.setDbr_data_size(0);
		this.setDbr_orig_bitrate((long)vsettings.obs_data_get_int("bitrate"));
		Object generatedDbr_orig_bitrate = this.getDbr_orig_bitrate();
		this.setDbr_cur_bitrate(generatedDbr_orig_bitrate);
		this.setDbr_est_bitrate(0);
		this.setDbr_inc_bitrate(generatedDbr_orig_bitrate / 10);
		this.setDbr_inc_timeout(0);
		this.setDbr_enabled(settings.obs_data_get_bool("dyn_bitrate"));
		caps = ModernizedCProgram.obs_encoder_get_caps(venc);
		if ((caps & (1 << 2)) == 0) {
			this.setDbr_enabled(false);
		} 
		if (ModernizedCProgram.obs_output_get_delay(generatedOutput) != 0) {
			this.setDbr_enabled(false);
		} 
		Object generatedDbr_enabled = this.getDbr_enabled();
		if (generatedDbr_enabled) {
			ModernizedCProgram.blog(LOG_INFO, "[rtmp stream: '%s'] Dynamic bitrate enabled.  Dropped frames begone!", ModernizedCProgram.obs_output_get_name(generatedOutput));
		} 
		vsettings.obs_data_release();
		asettings.obs_data_release();
		if (drop_p < (drop_b + 200)) {
			drop_p = drop_b + 200;
		} 
		this.setDrop_threshold_usec(1000 * drop_b);
		this.setPframe_drop_threshold_usec(1000 * drop_p);
		bind_ip = settings.obs_data_get_string("bind_ip");
		Object generatedBind_ip = this.getBind_ip();
		generatedBind_ip.dstr_copy(bind_ip);
		this.setNew_socket_loop(settings.obs_data_get_bool("new_socket_loop_enabled"));
		this.setLow_latency_mode(settings.obs_data_get_bool("low_latency_mode_enabled"));
		settings.obs_data_release();
		return true;
	}
	public obs_output getOutput() {
		return output;
	}
	public void setOutput(obs_output newOutput) {
		output = newOutput;
	}
	public Object getPackets_mutex() {
		return packets_mutex;
	}
	public void setPackets_mutex(Object newPackets_mutex) {
		packets_mutex = newPackets_mutex;
	}
	public circlebuf getPackets() {
		return packets;
	}
	public void setPackets(circlebuf newPackets) {
		packets = newPackets;
	}
	public Object getSent_headers() {
		return sent_headers;
	}
	public void setSent_headers(Object newSent_headers) {
		sent_headers = newSent_headers;
	}
	public Object getFrames_sent() {
		return frames_sent;
	}
	public void setFrames_sent(Object newFrames_sent) {
		frames_sent = newFrames_sent;
	}
	public Object getConnecting() {
		return connecting;
	}
	public void setConnecting(Object newConnecting) {
		connecting = newConnecting;
	}
	public Object getConnect_thread() {
		return connect_thread;
	}
	public void setConnect_thread(Object newConnect_thread) {
		connect_thread = newConnect_thread;
	}
	public Object getStatus_thread() {
		return status_thread;
	}
	public void setStatus_thread(Object newStatus_thread) {
		status_thread = newStatus_thread;
	}
	public Object getActive() {
		return active;
	}
	public void setActive(Object newActive) {
		active = newActive;
	}
	public Object getDisconnected() {
		return disconnected;
	}
	public void setDisconnected(Object newDisconnected) {
		disconnected = newDisconnected;
	}
	public Object getEncode_error() {
		return encode_error;
	}
	public void setEncode_error(Object newEncode_error) {
		encode_error = newEncode_error;
	}
	public Object getSend_thread() {
		return send_thread;
	}
	public void setSend_thread(Object newSend_thread) {
		send_thread = newSend_thread;
	}
	public int getMax_shutdown_time_sec() {
		return max_shutdown_time_sec;
	}
	public void setMax_shutdown_time_sec(int newMax_shutdown_time_sec) {
		max_shutdown_time_sec = newMax_shutdown_time_sec;
	}
	public Object getSend_sem() {
		return send_sem;
	}
	public void setSend_sem(Object newSend_sem) {
		send_sem = newSend_sem;
	}
	public Object getStop_event() {
		return stop_event;
	}
	public void setStop_event(Object newStop_event) {
		stop_event = newStop_event;
	}
	public Object getStop_ts() {
		return stop_ts;
	}
	public void setStop_ts(Object newStop_ts) {
		stop_ts = newStop_ts;
	}
	public Object getShutdown_timeout_ts() {
		return shutdown_timeout_ts;
	}
	public void setShutdown_timeout_ts(Object newShutdown_timeout_ts) {
		shutdown_timeout_ts = newShutdown_timeout_ts;
	}
	public dstr getPath() {
		return path;
	}
	public void setPath(dstr newPath) {
		path = newPath;
	}
	public Object getChannel_id() {
		return channel_id;
	}
	public void setChannel_id(Object newChannel_id) {
		channel_id = newChannel_id;
	}
	public dstr getUsername() {
		return username;
	}
	public void setUsername(dstr newUsername) {
		username = newUsername;
	}
	public dstr getPassword() {
		return password;
	}
	public void setPassword(dstr newPassword) {
		password = newPassword;
	}
	public dstr getEncoder_name() {
		return encoder_name;
	}
	public void setEncoder_name(dstr newEncoder_name) {
		encoder_name = newEncoder_name;
	}
	public dstr getBind_ip() {
		return bind_ip;
	}
	public void setBind_ip(dstr newBind_ip) {
		bind_ip = newBind_ip;
	}
	public Object getDrop_threshold_usec() {
		return drop_threshold_usec;
	}
	public void setDrop_threshold_usec(Object newDrop_threshold_usec) {
		drop_threshold_usec = newDrop_threshold_usec;
	}
	public Object getPframe_drop_threshold_usec() {
		return pframe_drop_threshold_usec;
	}
	public void setPframe_drop_threshold_usec(Object newPframe_drop_threshold_usec) {
		pframe_drop_threshold_usec = newPframe_drop_threshold_usec;
	}
	public int getMin_priority() {
		return min_priority;
	}
	public void setMin_priority(int newMin_priority) {
		min_priority = newMin_priority;
	}
	public double getCongestion() {
		return congestion;
	}
	public void setCongestion(double newCongestion) {
		congestion = newCongestion;
	}
	public Object getLast_dts_usec() {
		return last_dts_usec;
	}
	public void setLast_dts_usec(Object newLast_dts_usec) {
		last_dts_usec = newLast_dts_usec;
	}
	public Object getTotal_bytes_sent() {
		return total_bytes_sent;
	}
	public void setTotal_bytes_sent(Object newTotal_bytes_sent) {
		total_bytes_sent = newTotal_bytes_sent;
	}
	public Object getDropped_frames() {
		return dropped_frames;
	}
	public void setDropped_frames(Object newDropped_frames) {
		dropped_frames = newDropped_frames;
	}
	public Object getLast_nack_count() {
		return last_nack_count;
	}
	public void setLast_nack_count(Object newLast_nack_count) {
		last_nack_count = newLast_nack_count;
	}
	public Object getFtl_handle() {
		return ftl_handle;
	}
	public void setFtl_handle(Object newFtl_handle) {
		ftl_handle = newFtl_handle;
	}
	public Object getParams() {
		return params;
	}
	public void setParams(Object newParams) {
		params = newParams;
	}
	public int getPeak_kbps() {
		return peak_kbps;
	}
	public void setPeak_kbps(int newPeak_kbps) {
		peak_kbps = newPeak_kbps;
	}
	public Object getScale_width() {
		return scale_width;
	}
	public void setScale_width(Object newScale_width) {
		scale_width = newScale_width;
	}
	public Object getScale_height() {
		return scale_height;
	}
	public void setScale_height(Object newScale_height) {
		scale_height = newScale_height;
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
	public _frame_of_nalus_t getCoded_pic_buffer() {
		return coded_pic_buffer;
	}
	public void setCoded_pic_buffer(_frame_of_nalus_t newCoded_pic_buffer) {
		coded_pic_buffer = newCoded_pic_buffer;
	}
}

package application;

public class ffmpeg_output {
	private obs_output output;
	private Object active;
	private ffmpeg_data ff_data;
	private Object connecting;
	private Object start_thread;
	private Object total_bytes;
	private Object audio_start_ts;
	private Object video_start_ts;
	private Object stop_ts;
	private Object stopping;
	private Object write_thread_active;
	private Object write_mutex;
	private Object write_thread;
	private Object write_sem;
	private Object stop_event;
	
	public ffmpeg_output(obs_output output, Object active, ffmpeg_data ff_data, Object connecting, Object start_thread, Object total_bytes, Object audio_start_ts, Object video_start_ts, Object stop_ts, Object stopping, Object write_thread_active, Object write_mutex, Object write_thread, Object write_sem, Object stop_event) {
		setOutput(output);
		setActive(active);
		setFf_data(ff_data);
		setConnecting(connecting);
		setStart_thread(start_thread);
		setTotal_bytes(total_bytes);
		setAudio_start_ts(audio_start_ts);
		setVideo_start_ts(video_start_ts);
		setStop_ts(stop_ts);
		setStopping(stopping);
		setWrite_thread_active(write_thread_active);
		setWrite_mutex(write_mutex);
		setWrite_thread(write_thread);
		setWrite_sem(write_sem);
		setStop_event(stop_event);
	}
	public ffmpeg_output() {
	}
	
	public void encode_audio(int idx, Object context, Object block_size) {
		ffmpeg_data generatedFf_data = this.getFf_data();
		ffmpeg_data data = generatedFf_data;
		 packet = new (0);
		int ret;
		int got_packet;
		int generatedFrame_size = data.getFrame_size();
		 total_size = generatedFrame_size * block_size * context.getChannels();
		Object generatedAframe = data.getAframe();
		generatedAframe[idx].setNb_samples(generatedFrame_size);
		Object generatedTotal_samples = data.getTotal_samples();
		generatedAframe[idx].setPts(.av_rescale_q(generatedTotal_samples[idx], , context.getTime_base()));
		Object generatedSamples = data.getSamples();
		ret = .avcodec_fill_audio_frame(generatedAframe[idx], context.getChannels(), context.getSample_fmt(), generatedSamples[idx][0], (int)total_size, 1);
		if (ret < 0) {
			ModernizedCProgram.blog(LOG_WARNING, "encode_audio: avcodec_fill_audio_frame failed: %s", .av_err2str(ret));
			return ;
		} 
		generatedTotal_samples[idx] += generatedFrame_size;
		ret = .avcodec_send_frame(context, generatedAframe[idx]);
		if (ret == 0) {
			ret = .avcodec_receive_packet(context, packet);
		} 
		got_packet = (ret == 0);
		if (ret == AVERROR_EOF || ret == .AVERROR(EAGAIN)) {
			ret = 0;
		} 
		if (ret < 0) {
			ModernizedCProgram.blog(LOG_WARNING, "encode_audio: Error encoding audio: %s", .av_err2str(ret));
			return ;
		} 
		if (!got_packet) {
			return ;
		} 
		Object generatedAudio_streams = data.getAudio_streams();
		packet.setPts(ModernizedCProgram.rescale_ts(packet.getPts(), context, generatedAudio_streams[idx].getTime_base()));
		packet.setDts(ModernizedCProgram.rescale_ts(packet.getDts(), context, generatedAudio_streams[idx].getTime_base()));
		packet.setDuration((int).av_rescale_q(packet.getDuration(), context.getTime_base(), generatedAudio_streams[idx].getTime_base()));
		packet.setStream_index(generatedAudio_streams[idx].getIndex());
		Object generatedWrite_mutex = this.getWrite_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedWrite_mutex);
		Object generatedPackets = this.getPackets();
		.da_push_back(generatedPackets, packet);
		ModernizedCProgram.pthread_mutex_unlock(generatedWrite_mutex);
		Object generatedWrite_sem = this.getWrite_sem();
		generatedWrite_sem.os_sem_post();
	}
	public Object get_packet_sys_dts(Object packet) {
		ffmpeg_data generatedFf_data = this.getFf_data();
		ffmpeg_data data = generatedFf_data;
		obs_output generatedOutput = this.getOutput();
		 pause_offset = generatedOutput.obs_output_get_pause_offset();
		 start_ts = new ();
		 time_base = new ();
		Object generatedVideo = data.getVideo();
		Object generatedVideo_start_ts = this.getVideo_start_ts();
		Object generatedAudio_streams = data.getAudio_streams();
		Object generatedAudio_start_ts = this.getAudio_start_ts();
		if (generatedVideo && generatedVideo.getIndex() == packet.getStream_index()) {
			time_base = generatedVideo.getTime_base();
			start_ts = generatedVideo_start_ts;
		} else {
				time_base = generatedAudio_streams[0].getTime_base();
				start_ts = generatedAudio_start_ts;
		} 
		return start_ts + pause_offset + ().av_rescale_q(packet.getDts(), time_base, );
	}
	public Object try_connect() {
		obs_output generatedOutput = this.getOutput();
		 video = ModernizedCProgram.obs_output_video(generatedOutput);
		video_output_info voi = ModernizedCProgram.video_output_get_info(video);
		ffmpeg_cfg config = new ffmpeg_cfg();
		obs_data_t settings = new obs_data_t();
		 success = new ();
		int ret;
		obs_data obs_data = new obs_data();
		settings = obs_data.obs_output_get_settings(generatedOutput);
		settings.obs_data_set_default_int("gop_size", 120);
		config.setUrl(settings.obs_data_get_string("url"));
		config.setFormat_name(settings.get_string_or_null("format_name"));
		config.setFormat_mime_type(settings.get_string_or_null("format_mime_type"));
		config.setMuxer_settings(settings.obs_data_get_string("muxer_settings"));
		config.setVideo_bitrate((int)settings.obs_data_get_int("video_bitrate"));
		config.setAudio_bitrate((int)settings.obs_data_get_int("audio_bitrate"));
		config.setGop_size((int)settings.obs_data_get_int("gop_size"));
		config.setVideo_encoder(settings.get_string_or_null("video_encoder"));
		config.setVideo_encoder_id((int)settings.obs_data_get_int("video_encoder_id"));
		config.setAudio_encoder(settings.get_string_or_null("audio_encoder"));
		config.setAudio_encoder_id((int)settings.obs_data_get_int("audio_encoder_id"));
		config.setVideo_settings(settings.obs_data_get_string("video_settings"));
		config.setAudio_settings(settings.obs_data_get_string("audio_settings"));
		config.setScale_width((int)settings.obs_data_get_int("scale_width"));
		config.setScale_height((int)settings.obs_data_get_int("scale_height"));
		config.setWidth((int)ModernizedCProgram.obs_output_get_width(generatedOutput));
		config.setHeight((int)ModernizedCProgram.obs_output_get_height(generatedOutput));
		config.setFormat(ModernizedCProgram.obs_to_ffmpeg_video_format(ModernizedCProgram.video_output_get_format(video)));
		config.setAudio_tracks((int)ModernizedCProgram.obs_output_get_mixers(generatedOutput));
		int generatedAudio_tracks = config.getAudio_tracks();
		config.setAudio_mix_count(ModernizedCProgram.get_audio_mix_count(generatedAudio_tracks));
		if (ModernizedCProgram.format_is_yuv(voi.getVideo_output_info())) {
			config.setColor_range(voi.getVideo_output_info() == VIDEO_RANGE_FULL ? AVCOL_RANGE_JPEG : AVCOL_RANGE_MPEG);
			config.setColor_space(voi.getVideo_output_info() == VIDEO_CS_709 ? AVCOL_SPC_BT709 : AVCOL_SPC_BT470BG);
		} else {
				config.setColor_range(AVCOL_RANGE_UNSPECIFIED);
				config.setColor_space(AVCOL_SPC_RGB);
		} 
		AVPixelFormat generatedFormat = config.getFormat();
		if (generatedFormat == AV_PIX_FMT_NONE) {
			ModernizedCProgram.blog(LOG_DEBUG, "invalid pixel format used for FFmpeg output");
			return false;
		} 
		int generatedScale_width = config.getScale_width();
		int generatedWidth = config.getWidth();
		if (!generatedScale_width) {
			config.setScale_width(generatedWidth);
		} 
		int generatedScale_height = config.getScale_height();
		int generatedHeight = config.getHeight();
		if (!generatedScale_height) {
			config.setScale_height(generatedHeight);
		} 
		ffmpeg_data generatedFf_data = this.getFf_data();
		success = ModernizedCProgram.ffmpeg_data_init(generatedFf_data, config);
		settings.obs_data_release();
		Byte generatedLast_error = generatedFf_data.getLast_error();
		if (!success) {
			if (generatedLast_error) {
				generatedOutput.obs_output_set_last_error(generatedLast_error);
			} 
			generatedFf_data.ffmpeg_data_free();
			return false;
		} 
		audio_convert_info aci = new audio_convert_info();
		this.setActive(true);
		if (!ModernizedCProgram.obs_output_can_begin_data_capture(generatedOutput, 0)) {
			return false;
		} 
		Object generatedWrite_thread = this.getWrite_thread();
		ret = ModernizedCProgram.pthread_create(generatedWrite_thread, NULL, write_thread, output);
		if (ret != 0) {
			generatedFf_data.ffmpeg_log_error(LOG_WARNING, "ffmpeg_output_start: failed to create write thread.");
			ModernizedCProgram.ffmpeg_output_full_stop(output);
			return false;
		} 
		generatedOutput.obs_output_set_video_conversion(NULL);
		generatedOutput.obs_output_set_audio_conversion(aci);
		generatedOutput.obs_output_begin_data_capture(0);
		this.setWrite_thread_active(true);
		return true;
		 status_code = new ();
		dstr generatedPath = stream.getPath();
		obs_output generatedOutput = stream.getOutput();
		if (ModernizedCProgram.dstr_is_empty(generatedPath)) {
			ModernizedCProgram.blog(LOG_WARNING, "[ftl stream: '%s'] URL is empty", ModernizedCProgram.obs_output_get_name(generatedOutput));
			return -1;
		} 
		Object generatedDstr = generatedPath.getDstr();
		ModernizedCProgram.blog(LOG_INFO, "[ftl stream: '%s'] Connecting to FTL Ingest URL %s...", ModernizedCProgram.obs_output_get_name(generatedOutput), generatedDstr);
		stream.setWidth((int)ModernizedCProgram.obs_output_get_width(generatedOutput));
		stream.setHeight((int)ModernizedCProgram.obs_output_get_height(generatedOutput));
		Object generatedFtl_handle = stream.getFtl_handle();
		status_code = .ftl_ingest_connect(generatedFtl_handle);
		if (status_code != FTL_SUCCESS) {
			if (status_code == FTL_BAD_OR_INVALID_STREAM_KEY) {
				ModernizedCProgram.blog(LOG_ERROR, "Invalid Key (%s)", .ftl_status_code_to_string(status_code));
				return -3;
			} else {
					ModernizedCProgram.blog(LOG_WARNING, "[ftl stream: '%s'] Ingest connect failed with: %s (%d)", ModernizedCProgram.obs_output_get_name(generatedOutput), .ftl_status_code_to_string(status_code), status_code);
					return ModernizedCProgram._ftl_error_to_obs_error(status_code);
			} 
		} 
		ModernizedCProgram.blog(LOG_INFO, "[ftl stream: '%s'] Connection to %s successful", ModernizedCProgram.obs_output_get_name(generatedOutput), generatedDstr);
		// Always get the peak bitrate when we are starting.// Always get the peak bitrate when we are starting.stream.set_peak_bitrate();
		Object generatedStatus_thread = stream.getStatus_thread();
		ModernizedCProgram.pthread_create(generatedStatus_thread, ((Object)0), ModernizedCProgram.status_thread, stream);
		return stream.init_send();
		Object generatedPath = stream.getPath();
		Object generatedOutput = stream.getOutput();
		if (ModernizedCProgram.dstr_is_empty(generatedPath)) {
			ModernizedCProgram.blog(LOG_WARNING, "[rtmp stream: '%s'] URL is empty", ModernizedCProgram.obs_output_get_name(generatedOutput));
			return -1;
		} 
		ModernizedCProgram.blog(LOG_INFO, "[rtmp stream: '%s'] Connecting to RTMP URL %s...", ModernizedCProgram.obs_output_get_name(generatedOutput), generatedPath.getDstr());
		Object generatedRtmp = stream.getRtmp();
		generatedRtmp.RTMP_Init();
		if (!generatedRtmp.RTMP_SetupURL(generatedPath.getDstr())) {
			return -1;
		} 
		generatedRtmp.RTMP_EnableWrite();
		Object generatedEncoder_name = stream.getEncoder_name();
		generatedEncoder_name.dstr_copy("FMLE/3.0 (compatible; FMSc/1.0)");
		Object generatedUsername = stream.getUsername();
		generatedUsername.set_rtmp_dstr(generatedRtmp.getLink().getPubUser());
		Object generatedPassword = stream.getPassword();
		generatedPassword.set_rtmp_dstr(generatedRtmp.getLink().getPubPasswd());
		generatedEncoder_name.set_rtmp_dstr(generatedRtmp.getLink().getFlashVer());
		generatedRtmp.getLink().setSwfUrl(generatedRtmp.getLink().getTcUrl());
		Object generatedBind_ip = stream.getBind_ip();
		if (ModernizedCProgram.dstr_is_empty(generatedBind_ip) || ModernizedCProgram.dstr_cmp(generatedBind_ip, "default") == 0) {
			.memset(generatedRtmp.getM_bindIP(), 0, );
		} else {
				 success = generatedRtmp.getM_bindIP().getAddr().netif_str_to_addr(generatedRtmp.getM_bindIP().getAddrLen(), generatedBind_ip.getDstr());
				if (success) {
					int len = generatedRtmp.getM_bindIP().getAddrLen();
					 ipv6 = len == ;
					ModernizedCProgram.blog(LOG_INFO, "[rtmp stream: '%s'] Binding to IPv%d", ModernizedCProgram.obs_output_get_name(generatedOutput), ipv6 ? 6 : 4);
				} 
		} 
		Object generatedKey = stream.getKey();
		generatedRtmp.RTMP_AddStream(generatedKey.getDstr());
		obs_encoder obs_encoder = new obs_encoder();
		for (size_t idx = 1;
		 ; idx++) {
			obs_encoder_t encoder = obs_encoder.obs_output_get_audio_encoder(generatedOutput, idx);
			byte encoder_name;
			if (!encoder) {
				break;
			} 
			encoder_name = ModernizedCProgram.obs_encoder_get_name(encoder);
			generatedRtmp.RTMP_AddStream(encoder_name);
		}
		generatedRtmp.setM_outChunkSize(4096);
		generatedRtmp.setM_bSendChunkSizeInfo(true);
		generatedRtmp.setM_bUseNagle(true);
		stream.win32_log_interface_type();
		if (!ModernizedCProgram.RTMP_Connect(generatedRtmp, ((Object)0))) {
			stream.set_output_error();
			return -2;
		} 
		if (!generatedRtmp.RTMP_ConnectStream(0)) {
			return -3;
		} 
		ModernizedCProgram.blog(LOG_INFO, "[rtmp stream: '%s'] Connection to %s successful", ModernizedCProgram.obs_output_get_name(generatedOutput), generatedPath.getDstr());
		return stream.init_send();
	}
	public void ffmpeg_deactivate() {
		Object generatedWrite_thread_active = this.getWrite_thread_active();
		Object generatedStop_event = this.getStop_event();
		Object generatedWrite_sem = this.getWrite_sem();
		Object generatedWrite_thread = this.getWrite_thread();
		if (generatedWrite_thread_active) {
			generatedStop_event.os_event_signal();
			generatedWrite_sem.os_sem_post();
			ModernizedCProgram.pthread_join(generatedWrite_thread, NULL);
			this.setWrite_thread_active(false);
		} 
		Object generatedWrite_mutex = this.getWrite_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedWrite_mutex);
		Object generatedPackets = this.getPackets();
		for ( i = 0;
		 i < generatedPackets.getNum(); i++) {
			.av_free_packet(generatedPackets.getArray() + i);
		}
		.da_free(generatedPackets);
		ModernizedCProgram.pthread_mutex_unlock(generatedWrite_mutex);
		ffmpeg_data generatedFf_data = this.getFf_data();
		generatedFf_data.ffmpeg_data_free();
	}
	public obs_output getOutput() {
		return output;
	}
	public void setOutput(obs_output newOutput) {
		output = newOutput;
	}
	public Object getActive() {
		return active;
	}
	public void setActive(Object newActive) {
		active = newActive;
	}
	public ffmpeg_data getFf_data() {
		return ff_data;
	}
	public void setFf_data(ffmpeg_data newFf_data) {
		ff_data = newFf_data;
	}
	public Object getConnecting() {
		return connecting;
	}
	public void setConnecting(Object newConnecting) {
		connecting = newConnecting;
	}
	public Object getStart_thread() {
		return start_thread;
	}
	public void setStart_thread(Object newStart_thread) {
		start_thread = newStart_thread;
	}
	public Object getTotal_bytes() {
		return total_bytes;
	}
	public void setTotal_bytes(Object newTotal_bytes) {
		total_bytes = newTotal_bytes;
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
	public Object getStop_ts() {
		return stop_ts;
	}
	public void setStop_ts(Object newStop_ts) {
		stop_ts = newStop_ts;
	}
	public Object getStopping() {
		return stopping;
	}
	public void setStopping(Object newStopping) {
		stopping = newStopping;
	}
	public Object getWrite_thread_active() {
		return write_thread_active;
	}
	public void setWrite_thread_active(Object newWrite_thread_active) {
		write_thread_active = newWrite_thread_active;
	}
	public Object getWrite_mutex() {
		return write_mutex;
	}
	public void setWrite_mutex(Object newWrite_mutex) {
		write_mutex = newWrite_mutex;
	}
	public Object getWrite_thread() {
		return write_thread;
	}
	public void setWrite_thread(Object newWrite_thread) {
		write_thread = newWrite_thread;
	}
	public Object getWrite_sem() {
		return write_sem;
	}
	public void setWrite_sem(Object newWrite_sem) {
		write_sem = newWrite_sem;
	}
	public Object getStop_event() {
		return stop_event;
	}
	public void setStop_event(Object newStop_event) {
		stop_event = newStop_event;
	}
}

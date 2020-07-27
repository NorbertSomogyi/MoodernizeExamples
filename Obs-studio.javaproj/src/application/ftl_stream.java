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
	
	public void set_peak_bitrate() {
		int speedtest_kbps = 15000;
		int speedtest_duration = 1000;
		 results = new ();
		 status_code = new ();
		Object generatedFtl_handle = this.getFtl_handle();
		status_code = /*Error: Function owner not recognized*/ftl_ingest_speed_test_ex(generatedFtl_handle, speedtest_kbps, speedtest_duration, results);
		double percent_lost = 0;
		obs_output generatedOutput = this.getOutput();
		if (status_code == FTL_SUCCESS) {
			percent_lost = (double)results.getLost_pkts() * 100.0 / (double)results.getPkts_sent();
		} else {
				ModernizedCProgram.blog(LOG_WARNING, "[ftl stream: '%s'] Speed test failed with: %s", ModernizedCProgram.obs_output_get_name(generatedOutput), /*Error: Function owner not recognized*/ftl_status_code_to_string(status_code));
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
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ftl_ingest_update_params(generatedFtl_handle, generatedParams);
	}
	public ret_type ftl_event(Object status) {
		if (status.getMsg().getEvent().getType() != FTL_STATUS_EVENT_TYPE_DISCONNECTED) {
			return ret_type.RET_CONTINUE;
		} 
		obs_output generatedOutput = this.getOutput();
		ModernizedCProgram.blog(LOG_INFO, "[ftl stream: '%s'] Disconnected from ingest with reason: %s", ModernizedCProgram.obs_output_get_name(generatedOutput), /*Error: Function owner not recognized*/ftl_status_code_to_string(status.getMsg().getEvent().getError_code()));
		if (status.getMsg().getEvent().getReason() == FTL_STATUS_EVENT_REASON_API_REQUEST) {
			return ret_type.RET_BREAK;
		} 
		//tell OBS and it will trigger a reconnection//tell OBS and it will trigger a reconnectionModernizedCProgram.blog(LOG_WARNING, "Reconnecting to Ingest");
		generatedOutput.obs_output_signal_stop(-5);
		return ret_type.RET_EXIT;
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

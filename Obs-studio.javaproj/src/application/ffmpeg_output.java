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
		generatedAframe[idx].setPts(/*Error: Function owner not recognized*/av_rescale_q(generatedTotal_samples[idx], /*Error: Unsupported expression*/, context.getTime_base()));
		Object generatedSamples = data.getSamples();
		ret = /*Error: Function owner not recognized*/avcodec_fill_audio_frame(generatedAframe[idx], context.getChannels(), context.getSample_fmt(), generatedSamples[idx][0], (int)total_size, 1);
		if (ret < 0) {
			ModernizedCProgram.blog(LOG_WARNING, "encode_audio: avcodec_fill_audio_frame failed: %s", /*Error: Function owner not recognized*/av_err2str(ret));
			return /*Error: Unsupported expression*/;
		} 
		generatedTotal_samples[idx] += generatedFrame_size;
		ret = /*Error: Function owner not recognized*/avcodec_send_frame(context, generatedAframe[idx]);
		if (ret == 0) {
			ret = /*Error: Function owner not recognized*/avcodec_receive_packet(context, packet);
		} 
		got_packet = (ret == 0);
		if (ret == AVERROR_EOF || ret == /*Error: Function owner not recognized*/AVERROR(EAGAIN)) {
			ret = 0;
		} 
		if (ret < 0) {
			ModernizedCProgram.blog(LOG_WARNING, "encode_audio: Error encoding audio: %s", /*Error: Function owner not recognized*/av_err2str(ret));
			return /*Error: Unsupported expression*/;
		} 
		if (!got_packet) {
			return /*Error: Unsupported expression*/;
		} 
		Object[][] generatedAudio_streams = data.getAudio_streams();
		packet.setPts(ModernizedCProgram.rescale_ts(packet.getPts(), context, generatedAudio_streams[idx].getTime_base()));
		packet.setDts(ModernizedCProgram.rescale_ts(packet.getDts(), context, generatedAudio_streams[idx].getTime_base()));
		packet.setDuration((int)/*Error: Function owner not recognized*/av_rescale_q(packet.getDuration(), context.getTime_base(), generatedAudio_streams[idx].getTime_base()));
		packet.setStream_index(generatedAudio_streams[idx].getIndex());
		Object generatedWrite_mutex = this.getWrite_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedWrite_mutex);
		Object generatedPackets = this.getPackets();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_push_back(generatedPackets, packet);
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
		Object[][] generatedAudio_streams = data.getAudio_streams();
		Object generatedAudio_start_ts = this.getAudio_start_ts();
		if (generatedVideo && generatedVideo.getIndex() == packet.getStream_index()) {
			time_base = generatedVideo.getTime_base();
			start_ts = generatedVideo_start_ts;
		} else {
				time_base = generatedAudio_streams[0].getTime_base();
				start_ts = generatedAudio_start_ts;
		} 
		return start_ts + pause_offset + ()/*Error: Function owner not recognized*/av_rescale_q(packet.getDts(), time_base, /*Error: Unsupported expression*/);
	}
	public int process_packet() {
		 packet = new ();
		 new_packet = false;
		int ret;
		Object generatedWrite_mutex = this.getWrite_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedWrite_mutex);
		Object generatedPackets = this.getPackets();
		if (generatedPackets.getNum()) {
			packet = generatedPackets.getArray()[0];
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_erase(generatedPackets, 0);
			new_packet = true;
		} 
		ModernizedCProgram.pthread_mutex_unlock(generatedWrite_mutex);
		if (!new_packet) {
			return 0/*blog(LOG_DEBUG, "size = %d, flags = %lX, stream = %d, "
						"packets queued: %lu",
						packet.size, packet.flags,
						packet.stream_index, output->packets.num);*/;
		} 
		Object generatedStop_ts = this.getStop_ts();
		if (output.stopping()) {
			 sys_ts = output.get_packet_sys_dts(packet);
			if (sys_ts >= generatedStop_ts) {
				ModernizedCProgram.ffmpeg_output_full_stop(output);
				return 0;
			} 
		} 
		Object generatedTotal_bytes = this.getTotal_bytes();
		generatedTotal_bytes += packet.getSize();
		ffmpeg_data generatedFf_data = this.getFf_data();
		Object generatedOutput = generatedFf_data.getOutput();
		ret = /*Error: Function owner not recognized*/av_interleaved_write_frame(generatedOutput, packet);
		if (ret < 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/av_free_packet(packet);
			generatedFf_data.ffmpeg_log_error(LOG_WARNING, "receive_audio: Error writing packet: %s", /*Error: Function owner not recognized*/av_err2str(ret));
			return ret;
		} 
		return 0;
		pkt.setPts(/*Error: Function owner not recognized*/av_rescale_q_rnd(pkt.getPts(), in_stream.getTime_base(), out_stream.getTime_base(), AV_ROUND_NEAR_INF | AV_ROUND_PASS_MINMAX));
		pkt.setDts(/*Error: Function owner not recognized*/av_rescale_q_rnd(pkt.getDts(), in_stream.getTime_base(), out_stream.getTime_base(), AV_ROUND_NEAR_INF | AV_ROUND_PASS_MINMAX));
		pkt.setDuration((int)/*Error: Function owner not recognized*/av_rescale_q(pkt.getDuration(), in_stream.getTime_base(), out_stream.getTime_base()));
		pkt.setPos(-1);
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
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/av_free_packet(generatedPackets.getArray() + i);
		}
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_free(generatedPackets);
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

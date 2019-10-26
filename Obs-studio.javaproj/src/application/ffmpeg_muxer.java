package application;

/******************************************************************************
    Copyright (C) 2015 by Hugh Bailey <obs.jim@gmail.com>

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
public class ffmpeg_muxer {
	private obs_output output;
	private Object pipe;
	private Object stop_ts;
	private Object total_bytes;
	private dstr path;
	private Object sent_headers;
	private Object active;
	private Object stopping;
	private Object capturing;
	private circlebuf packets;
	private Object cur_size;
	private Object cur_time;
	private Object max_size;
	private Object max_time;
	private Object save_ts;
	private int keyframes;
	private Object hotkey;
	private Object ;
	private Object mux_thread;
	private Object mux_thread_joinable;
	private Object muxing;
	
	public ffmpeg_muxer(obs_output output, Object pipe, Object stop_ts, Object total_bytes, dstr path, Object sent_headers, Object active, Object stopping, Object capturing, circlebuf packets, Object cur_size, Object cur_time, Object max_size, Object max_time, Object save_ts, int keyframes, Object hotkey, Object,  Object mux_thread, Object mux_thread_joinable, Object muxing) {
		setOutput(output);
		setPipe(pipe);
		setStop_ts(stop_ts);
		setTotal_bytes(total_bytes);
		setPath(path);
		setSent_headers(sent_headers);
		setActive(active);
		setStopping(stopping);
		setCapturing(capturing);
		setPackets(packets);
		setCur_size(cur_size);
		setCur_time(cur_time);
		setMax_size(max_size);
		setMax_time(max_time);
		setSave_ts(save_ts);
		setKeyframes(keyframes);
		setHotkey(hotkey);
		set();
		setMux_thread(mux_thread);
		setMux_thread_joinable(mux_thread_joinable);
		setMuxing(muxing);
	}
	public ffmpeg_muxer() {
	}
	
	public void replay_buffer_clear() {
		circlebuf generatedPackets = this.getPackets();
		Object generatedCirclebuf = generatedPackets.getCirclebuf();
		while (generatedCirclebuf > 0) {
			encoder_packet pkt = new encoder_packet();
			generatedPackets.circlebuf_pop_front(pkt, );
			pkt.obs_encoder_packet_release();
		}
		generatedPackets.circlebuf_free();
		this.setCur_size(0);
		this.setCur_time(0);
		this.setMax_size(0);
		this.setMax_time(0);
		this.setSave_ts(0);
		this.setKeyframes(0);
	}
	public Object capturing() {
		Object generatedCapturing = this.getCapturing();
		return ModernizedCProgram.os_atomic_load_bool(generatedCapturing);
	}
	public void log_muxer_params(Object settings) {
		int ret;
		 dict = NULL;
		obs_output generatedOutput = this.getOutput();
		if ((ret = .av_dict_parse_string(dict, settings, "=", " ", 0))) {
			ModernizedCProgram.blog(LOG_WARNING, "[ffmpeg muxer: '%s'] Failed to parse muxer settings: %s\n%s", ModernizedCProgram.obs_output_get_name(generatedOutput), .av_err2str(ret), settings);
			.av_dict_free(dict);
			return ;
		} 
		Object generatedDstr = str.getDstr();
		if (.av_dict_count(dict) > 0) {
			dstr str = new dstr(0);
			 entry = NULL;
			while ((entry = .av_dict_get(dict, "", entry, AV_DICT_IGNORE_SUFFIX))) {
				str.dstr_catf("\n\t%s=%s", entry.getKey(), entry.getValue());
			}
			ModernizedCProgram.blog(LOG_INFO, "[ffmpeg muxer: '%s'] Using muxer settings:%s", ModernizedCProgram.obs_output_get_name(generatedOutput), generatedDstr);
			str.dstr_free();
		} 
		.av_dict_free(dict);
	}
	public void start_pipe(Object path) {
		dstr cmd = new dstr();
		ModernizedCProgram.build_command_line(stream, cmd, path);
		Object generatedDstr = cmd.getDstr();
		this.setPipe(.os_process_pipe_create(generatedDstr, "w"));
		cmd.dstr_free();
	}
	public int deactivate(int code) {
		int ret = -1;
		Object generatedPipe = this.getPipe();
		Object generatedActive = this.getActive();
		Object generatedSent_headers = this.getSent_headers();
		obs_output generatedOutput = this.getOutput();
		dstr generatedPath = this.getPath();
		Object generatedDstr = generatedPath.getDstr();
		if (stream.active()) {
			ret = .os_process_pipe_destroy(generatedPipe);
			this.setPipe(NULL);
			ModernizedCProgram.os_atomic_set_bool(generatedActive, false);
			ModernizedCProgram.os_atomic_set_bool(generatedSent_headers, false);
			ModernizedCProgram.blog(LOG_INFO, "[ffmpeg muxer: '%s'] Output of file '%s' stopped", ModernizedCProgram.obs_output_get_name(generatedOutput), generatedDstr);
		} 
		if (code) {
			generatedOutput.obs_output_signal_stop(code);
		}  else if (stream.stopping()) {
			generatedOutput.obs_output_end_data_capture();
		} 
		Object generatedStopping = this.getStopping();
		ModernizedCProgram.os_atomic_set_bool(generatedStopping, false);
		return ret;
	}
	public void signal_failure() {
		byte[] error = new byte[1024];
		int ret;
		int code;
		 len = new ();
		Object generatedPipe = this.getPipe();
		len = .os_process_pipe_read_err(generatedPipe, ()error,  - 1);
		obs_output generatedOutput = this.getOutput();
		if (len > 0) {
			error[len] = 0;
			ModernizedCProgram.blog(LOG_WARNING, "[ffmpeg muxer: '%s'] ffmpeg-mux: %s", ModernizedCProgram.obs_output_get_name(generatedOutput), error);
			generatedOutput.obs_output_set_last_error(error);
		} 
		ret = stream.deactivate(0);
		switch (ret) {
		case FFM_UNSUPPORTED:
				code = -6;
				break;
		default:
				code = -4;
		}
		generatedOutput.obs_output_signal_stop(code);
		Object generatedCapturing = this.getCapturing();
		ModernizedCProgram.os_atomic_set_bool(generatedCapturing, false);
	}
	public Object send_video_headers() {
		obs_output generatedOutput = this.getOutput();
		obs_encoder obs_encoder = new obs_encoder();
		obs_encoder_t vencoder = obs_encoder.obs_output_get_video_encoder(generatedOutput);
		encoder_packet packet = new encoder_packet(, );
		Object generatedData = packet.getData();
		Object generatedSize = packet.getSize();
		ModernizedCProgram.obs_encoder_get_extra_data(vencoder, generatedData, generatedSize);
		return ModernizedCProgram.write_packet(stream, packet);
	}
	public Object purge_front() {
		encoder_packet pkt = new encoder_packet();
		 keyframe = new ();
		circlebuf generatedPackets = this.getPackets();
		generatedPackets.circlebuf_pop_front(pkt, );
		obs_encoder_type generatedType = pkt.getType();
		Object generatedKeyframe = pkt.getKeyframe();
		keyframe = generatedType == obs_encoder_type.OBS_ENCODER_VIDEO && generatedKeyframe;
		int generatedKeyframes = this.getKeyframes();
		if (keyframe) {
			generatedKeyframes--;
		} 
		Object generatedCirclebuf = generatedPackets.getCirclebuf();
		Object generatedDts_usec = first.getDts_usec();
		Object generatedCur_size = this.getCur_size();
		Object generatedSize = pkt.getSize();
		if (!generatedCirclebuf) {
			this.setCur_size(0);
			this.setCur_time(0);
		} else {
				encoder_packet first = new encoder_packet();
				generatedPackets.circlebuf_peek_front(first, );
				this.setCur_time(generatedDts_usec);
				generatedCur_size -= ()generatedSize;
		} 
		pkt.obs_encoder_packet_release();
		return keyframe;
	}
	public void purge() {
		circlebuf generatedPackets = this.getPackets();
		obs_encoder_type generatedType = pkt.getType();
		Object generatedKeyframe = pkt.getKeyframe();
		if (stream.purge_front()) {
			encoder_packet pkt = new encoder_packet();
			for (; ; ) {
				generatedPackets.circlebuf_peek_front(pkt, );
				if (generatedType == obs_encoder_type.OBS_ENCODER_VIDEO && generatedKeyframe) {
					return ;
				} 
				stream.purge_front();
			}
		} 
	}
	public void replay_buffer_save() {
		 size = ;
		circlebuf generatedPackets = this.getPackets();
		Object generatedCirclebuf = generatedPackets.getCirclebuf();
		 num_packets = generatedCirclebuf / size;
		Object generatedMux_packets = this.getMux_packets();
		.da_reserve(generatedMux_packets, num_packets/* ---------------------------- */);
		 found_video = /* reorder packets */false;
		[] found_audio = new []{0};
		 video_offset = 0;
		 video_dts_offset = 0;
		[] audio_offsets = new []{0};
		[] audio_dts_offsets = new []{0};
		obs_encoder_type generatedType = pkt.getType();
		Object generatedDts_usec = pkt.getDts_usec();
		Object generatedDts = pkt.getDts();
		Object generatedTrack_idx = pkt.getTrack_idx();
		for ( i = 0;
		 i < num_packets; i++) {
			encoder_packet pkt = new encoder_packet();
			pkt = generatedPackets.circlebuf_data(i * size);
			if (generatedType == obs_encoder_type.OBS_ENCODER_VIDEO) {
				if (!found_video) {
					video_offset = generatedDts_usec;
					video_dts_offset = generatedDts;
					found_video = true;
				} 
			} else {
					if (!found_audio[generatedTrack_idx]) {
						found_audio[generatedTrack_idx] = true;
						audio_offsets[generatedTrack_idx] = generatedDts_usec;
						audio_dts_offsets[generatedTrack_idx] = generatedDts;
					} 
			} 
			pkt.insert_packet(generatedMux_packets.getDa(), video_offset, audio_offsets, video_dts_offset, audio_dts_offsets);
		}
		obs_output generatedOutput = this.getOutput();
		obs_data obs_data = new obs_data();
		obs_data_t settings = obs_data.obs_output_get_settings(generatedOutput);
		byte dir = settings.obs_data_get_string("directory");
		byte fmt = settings.obs_data_get_string("format");
		byte ext = settings.obs_data_get_string("extension");
		 space = settings.obs_data_get_bool("allow_spaces");
		byte filename = ModernizedCProgram.os_generate_formatted_filename(ext, space, fmt);
		dstr generatedPath = this.getPath();
		generatedPath.dstr_copy(dir);
		generatedPath.dstr_replace("\\", "/");
		if (ModernizedCProgram.dstr_end(generatedPath) != (byte)'/') {
			generatedPath.dstr_cat_ch((byte)'/');
		} 
		generatedPath.dstr_cat(filename);
		ModernizedCProgram.bfree(filename);
		settings.obs_data_release();
		Object generatedMuxing = this.getMuxing();
		ModernizedCProgram.os_atomic_set_bool(generatedMuxing, /* ---------------------------- */true);
		Object generatedMux_thread = this.getMux_thread();
		this.setMux_thread_joinable(ModernizedCProgram.pthread_create(generatedMux_thread, NULL, replay_buffer_mux_thread, stream) == 0);
	}
	public void deactivate_replay_buffer(int code) {
		obs_output generatedOutput = this.getOutput();
		if (code) {
			generatedOutput.obs_output_signal_stop(code);
		}  else if (stream.stopping()) {
			generatedOutput.obs_output_end_data_capture();
		} 
		Object generatedActive = this.getActive();
		ModernizedCProgram.os_atomic_set_bool(generatedActive, false);
		Object generatedSent_headers = this.getSent_headers();
		ModernizedCProgram.os_atomic_set_bool(generatedSent_headers, false);
		Object generatedStopping = this.getStopping();
		ModernizedCProgram.os_atomic_set_bool(generatedStopping, false);
		stream.replay_buffer_clear();
	}
	public obs_output getOutput() {
		return output;
	}
	public void setOutput(obs_output newOutput) {
		output = newOutput;
	}
	public Object getPipe() {
		return pipe;
	}
	public void setPipe(Object newPipe) {
		pipe = newPipe;
	}
	public Object getStop_ts() {
		return stop_ts;
	}
	public void setStop_ts(Object newStop_ts) {
		stop_ts = newStop_ts;
	}
	public Object getTotal_bytes() {
		return total_bytes;
	}
	public void setTotal_bytes(Object newTotal_bytes) {
		total_bytes = newTotal_bytes;
	}
	public dstr getPath() {
		return path;
	}
	public void setPath(dstr newPath) {
		path = newPath;
	}
	public Object getSent_headers() {
		return sent_headers;
	}
	public void setSent_headers(Object newSent_headers) {
		sent_headers = newSent_headers;
	}
	public Object getActive() {
		return active;
	}
	public void setActive(Object newActive) {
		active = newActive;
	}
	public Object getStopping() {
		return stopping;
	}
	public void setStopping(Object newStopping) {
		stopping = newStopping;
	}
	public Object getCapturing() {
		return capturing;
	}
	public void setCapturing(Object newCapturing) {
		capturing = newCapturing;
	}
	public circlebuf getPackets() {
		return packets;
	}
	public void setPackets(circlebuf newPackets) {
		packets = newPackets;
	}
	public Object getCur_size() {
		return cur_size;
	}
	public void setCur_size(Object newCur_size) {
		cur_size = newCur_size;
	}
	public Object getCur_time() {
		return cur_time;
	}
	public void setCur_time(Object newCur_time) {
		cur_time = newCur_time;
	}
	public Object getMax_size() {
		return max_size;
	}
	public void setMax_size(Object newMax_size) {
		max_size = newMax_size;
	}
	public Object getMax_time() {
		return max_time;
	}
	public void setMax_time(Object newMax_time) {
		max_time = newMax_time;
	}
	public Object getSave_ts() {
		return save_ts;
	}
	public void setSave_ts(Object newSave_ts) {
		save_ts = newSave_ts;
	}
	public int getKeyframes() {
		return keyframes;
	}
	public void setKeyframes(int newKeyframes) {
		keyframes = newKeyframes;
	}
	public Object getHotkey() {
		return hotkey;
	}
	public void setHotkey(Object newHotkey) {
		hotkey = newHotkey;
	}
	public Object get() {
		return ;
	}
	public void set(Object new) {
		 = new;
	}
	public Object getMux_thread() {
		return mux_thread;
	}
	public void setMux_thread(Object newMux_thread) {
		mux_thread = newMux_thread;
	}
	public Object getMux_thread_joinable() {
		return mux_thread_joinable;
	}
	public void setMux_thread_joinable(Object newMux_thread_joinable) {
		mux_thread_joinable = newMux_thread_joinable;
	}
	public Object getMuxing() {
		return muxing;
	}
	public void setMuxing(Object newMuxing) {
		muxing = newMuxing;
	}
}

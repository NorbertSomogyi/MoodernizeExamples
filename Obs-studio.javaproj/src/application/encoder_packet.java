package application;

/** Encoder output packet */
public class encoder_packet {
	private Object data;
	private Object size;
	private Object pts;
	private Object dts;
	private Object timebase_num;
	private Object timebase_den;
	private obs_encoder_type type;
	private Object keyframe;
	private Object dts_usec;
	private Object sys_dts_usec;
	private int priority;
	private int drop_priority;
	private Object track_idx;
	private Object encoder;
	
	public encoder_packet(Object data, Object size, Object pts, Object dts, Object timebase_num, Object timebase_den, obs_encoder_type type, Object keyframe, Object dts_usec, Object sys_dts_usec, int priority, int drop_priority, Object track_idx, Object encoder) {
		setData(data);
		setSize(size);
		setPts(pts);
		setDts(dts);
		setTimebase_num(timebase_num);
		setTimebase_den(timebase_den);
		setType(type);
		setKeyframe(keyframe);
		setDts_usec(dts_usec);
		setSys_dts_usec(sys_dts_usec);
		setPriority(priority);
		setDrop_priority(drop_priority);
		setTrack_idx(track_idx);
		setEncoder(encoder);
	}
	public encoder_packet() {
	}
	
	public void process_delay(Object data) {
		obs_output output = data;
		uint64_t t = ModernizedCProgram.os_gettime_ns();
		ModernizedCProgram.push_packet(output, packet, t);
		while (output.pop_packet(t)) {
			;
		}
	}
	public void flv_packet_mux(Object dts_offset, Object output, Object size, Object is_header) {
		array_output_data data = new array_output_data();
		serializer s = new serializer();
		ModernizedCProgram.array_output_serializer_init(s, data);
		obs_encoder_type generatedType = this.getType();
		if (generatedType == obs_encoder_type.OBS_ENCODER_VIDEO) {
			ModernizedCProgram.flv_video(s, dts_offset, packet, is_header);
		} else {
				ModernizedCProgram.flv_audio(s, dts_offset, packet, is_header);
		} 
		Object generatedArray_output_data = data.getArray_output_data();
		output = generatedArray_output_data.getArray();
		size = generatedArray_output_data.getNum();
	}
	public void flv_output_data(Object data) {
		flv_output stream = data;
		encoder_packet parsed_packet = new encoder_packet();
		Object generatedMutex = stream.getMutex();
		ModernizedCProgram.pthread_mutex_lock(generatedMutex);
		if (!stream.active()) {
			;
		} 
		if (!packet) {
			stream.flv_output_actual_stop(-8);
			;
		} 
		Object generatedSys_dts_usec = this.getSys_dts_usec();
		Object generatedStop_ts = stream.getStop_ts();
		if (stream.stopping()) {
			if (generatedSys_dts_usec >= (int64_t)generatedStop_ts) {
				stream.flv_output_actual_stop(0);
				;
			} 
		} 
		Object generatedSent_headers = stream.getSent_headers();
		if (!generatedSent_headers) {
			stream.write_headers();
			stream.setSent_headers(true);
		} 
		obs_encoder_type generatedType = this.getType();
		Object generatedGot_first_video = stream.getGot_first_video();
		Object generatedDts = this.getDts();
		if (generatedType == obs_encoder_type.OBS_ENCODER_VIDEO) {
			if (!generatedGot_first_video) {
				stream.setStart_dts_offset(packet.get_ms_time(generatedDts));
				stream.setGot_first_video(true);
			} 
			parsed_packet.obs_parse_avc_packet(packet);
			ModernizedCProgram.write_packet(stream, parsed_packet, false);
			parsed_packet.obs_encoder_packet_release();
		} else {
				ModernizedCProgram.write_packet(stream, packet, false);
		} 
	}
	public Object nvenc_encode_tex(Object data, Object handle, Object pts, Object lock_key, Object next_key, Object received_packet) {
		nvenc_data enc = data;
		Object generatedDevice = enc.getDevice();
		 device = generatedDevice;
		Object generatedContext = enc.getContext();
		 context = generatedContext;
		 input_tex = new ();
		 output_tex = new ();
		 km = new ();
		nv_texture nvtex = new nv_texture();
		nv_bitstream bs = new nv_bitstream();
		NVENCSTATUS err = new NVENCSTATUS();
		obs_encoder generatedEncoder = enc.getEncoder();
		if (handle == GS_INVALID_HANDLE) {
			ModernizedCProgram.blog(LOG_ERROR, "[jim-nvenc: '%s'] Encode failed: bad texture handle", ModernizedCProgram.obs_encoder_get_name(generatedEncoder));
			next_key = lock_key;
			return false;
		} 
		Object generatedBitstreams = enc.getBitstreams();
		Object generatedNext_bitstream = enc.getNext_bitstream();
		bs = generatedBitstreams.getArray()[generatedNext_bitstream];
		Object generatedTextures = enc.getTextures();
		nvtex = generatedTextures.getArray()[generatedNext_bitstream];
		input_tex = enc.get_tex_from_handle(handle, km);
		Object generatedTex = nvtex.getTex();
		output_tex = generatedTex;
		if (!input_tex) {
			next_key = lock_key;
			return false;
		} 
		circlebuf generatedDts_list = enc.getDts_list();
		generatedDts_list.circlebuf_push_back(pts, );
		Object generatedEvent = bs.getEvent();
		.WaitForSingleObject(generatedEvent, /* wait for output bitstream/tex        */-1024/* ------------------------------------ */);
		.UNRECOGNIZEDFUNCTIONNAME(km, lock_key, /* copy to output tex                   */-1024);
		.UNRECOGNIZEDFUNCTIONNAME(context, ()output_tex, ()input_tex);
		.UNRECOGNIZEDFUNCTIONNAME(km, next_key/* ------------------------------------ */);
		 map = new (/* map output tex so nvenc can use it   */NV_ENC_MAP_INPUT_RESOURCE_VER);
		Object generatedRes = nvtex.getRes();
		map.setRegisteredResource(generatedRes);
		Object generatedSession = enc.getSession();
		if (enc.nv_failed(.UNRECOGNIZEDFUNCTIONNAME(generatedSession, map), __FUNCTION__, "nv.nvEncMapInputResource(enc->session, &map)")) {
			return false;
		} 
		nvtex.setMapped_res(map.getMappedResource());
		 params = new (/* do actual encode call                */0);
		params.setVersion(NV_ENC_PIC_PARAMS_VER);
		params.setPictureStruct(NV_ENC_PIC_STRUCT_FRAME);
		Object generatedMapped_res = nvtex.getMapped_res();
		params.setInputBuffer(generatedMapped_res);
		params.setBufferFmt(NV_ENC_BUFFER_FORMAT_NV12);
		params.setInputTimeStamp(()pts);
		Object generatedCx = enc.getCx();
		params.setInputWidth(generatedCx);
		Object generatedCy = enc.getCy();
		params.setInputHeight(generatedCy);
		Object generatedPtr = bs.getPtr();
		params.setOutputBitstream(generatedPtr);
		params.setCompletionEvent(generatedEvent);
		err = .UNRECOGNIZEDFUNCTIONNAME(generatedSession, params);
		if (err != NV_ENC_SUCCESS && err != NV_ENC_ERR_NEED_MORE_INPUT) {
			enc.nv_failed(err, __FUNCTION__, "nvEncEncodePicture");
			return false;
		} 
		enc.setEncode_started(true);
		Object generatedBuffers_queued = enc.getBuffers_queued();
		generatedBuffers_queued++;
		Object generatedBuf_count = enc.getBuf_count();
		if (++generatedNext_bitstream == generatedBuf_count) {
			enc.setNext_bitstream(0);
		} 
		if (!enc.get_encoded_packet(/* ------------------------------------ *//* check for encoded packet and parse   */false)) {
			return false;
		} 
		Object generatedPacket_data = enc.getPacket_data();
		Object generatedBframes = enc.getBframes();
		Object generatedTimebase_num = this.getTimebase_num();
		Object generatedPacket_pts = enc.getPacket_pts();
		Object generatedPacket_keyframe = enc.getPacket_keyframe();
		if (generatedPacket_data.getNum()) {
			 dts = new ();
			generatedDts_list.circlebuf_pop_front(dts, );
			if (generatedBframes) {
				dts -= generatedTimebase_num;
			} 
			received_packet = true;
			this.setData(generatedPacket_data.getArray());
			this.setSize(generatedPacket_data.getNum());
			this.setType(obs_encoder_type.OBS_ENCODER_VIDEO);
			this.setPts(generatedPacket_pts);
			this.setDts(dts);
			this.setKeyframe(generatedPacket_keyframe);
		} else {
				received_packet = false;
		} 
		return true;
	}
	/******************************************************************************
	    Copyright (C) 2013-2014 by Hugh Bailey <obs.jim@gmail.com>
	
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
	public Object packet_dts_usec() {
		Object generatedDts = this.getDts();
		Object generatedTimebase_den = this.getTimebase_den();
		return generatedDts * 1000000 / generatedTimebase_den;
	}
	public void obs_encoder_packet_create_instance(Object src) {
		long p_refs;
		dst = src;
		p_refs = ModernizedCProgram.bmalloc(src.getSize() + );
		this.setData((Object)(p_refs + 1));
		p_refs = 1;
		Object generatedData = this.getData();
		.memcpy(generatedData, generatedData, src.getSize());
	}
	public void obs_duplicate_encoder_packet(Object src) {
		dst.obs_encoder_packet_create_instance(src);
	}
	public void obs_free_encoder_packet() {
		packet.obs_encoder_packet_release();
	}
	public void obs_encoder_packet_ref(encoder_packet src) {
		if (!src) {
			return ;
		} 
		Object generatedData = src.getData();
		if (generatedData) {
			long p_refs = ((long)generatedData) - 1;
			ModernizedCProgram.os_atomic_inc_long(p_refs);
		} 
		dst = src;
	}
	public void obs_encoder_packet_release() {
		if (!pkt) {
			return ;
		} 
		Object generatedData = this.getData();
		if (generatedData) {
			long p_refs = ((long)generatedData) - 1;
			if (ModernizedCProgram.os_atomic_dec_long(p_refs) == 0) {
				ModernizedCProgram.bfree(p_refs);
			} 
		} 
		.memset(pkt, 0, );
	}
	public void obs_parse_avc_packet(Object src) {
		array_output_data output = new array_output_data();
		serializer s = new serializer();
		long ref = 1;
		ModernizedCProgram.array_output_serializer_init(s, output);
		avc_packet = src;
		s.serialize(ref, );
		Object generatedKeyframe = this.getKeyframe();
		int generatedPriority = this.getPriority();
		ModernizedCProgram.serialize_avc_data(s, src.getData(), src.getSize(), generatedKeyframe, generatedPriority);
		Object generatedArray_output_data = output.getArray_output_data();
		this.setData(generatedArray_output_data.getArray() + );
		this.setSize(generatedArray_output_data.getNum() - );
		this.setDrop_priority(ModernizedCProgram.get_drop_priority(generatedPriority));
	}
	public void null_output_data(Object data) {
		.UNUSED_PARAMETER(data);
		.UNUSED_PARAMETER(packet);
	}
	public void ftl_stream_data(Object data) {
		ftl_stream stream = data;
		encoder_packet new_packet = new encoder_packet();
		 added_packet = false;
		if (stream.disconnected() || !stream.active()) {
			return ;
		} 
		Object generatedEncode_error = stream.getEncode_error();
		Object generatedSend_sem = stream.getSend_sem();
		if (!/* encoder failure */packet) {
			ModernizedCProgram.os_atomic_set_bool(generatedEncode_error, true);
			generatedSend_sem.os_sem_post();
			return ;
		} 
		obs_encoder_type generatedType = this.getType();
		if (generatedType == obs_encoder_type.OBS_ENCODER_VIDEO) {
			new_packet.obs_parse_avc_packet(packet);
		} else {
				new_packet.obs_encoder_packet_ref(packet);
		} 
		Object generatedPackets_mutex = stream.getPackets_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedPackets_mutex);
		if (!stream.disconnected()) {
			added_packet = (generatedType == obs_encoder_type.OBS_ENCODER_VIDEO) ? ModernizedCProgram.add_video_packet(stream, new_packet) : ModernizedCProgram.add_packet(stream, new_packet);
		} 
		ModernizedCProgram.pthread_mutex_unlock(generatedPackets_mutex);
		if (added_packet) {
			generatedSend_sem.os_sem_post();
		} else {
				new_packet.obs_encoder_packet_release();
		} 
	}
	public void ffmpeg_mux_data(Object data) {
		ffmpeg_muxer stream = data;
		if (!stream.active()) {
			return ;
		} 
		if (!/* encoder failure */packet) {
			stream.deactivate(-8);
			return ;
		} 
		Object generatedSent_headers = stream.getSent_headers();
		if (!generatedSent_headers) {
			if (!stream.send_headers()) {
				return ;
			} 
			stream.setSent_headers(true);
		} 
		Object generatedSys_dts_usec = this.getSys_dts_usec();
		Object generatedStop_ts = stream.getStop_ts();
		if (stream.stopping()) {
			if (generatedSys_dts_usec >= generatedStop_ts) {
				stream.deactivate(0);
				return ;
			} 
		} 
		ModernizedCProgram.write_packet(stream, packet);
	}
	public void insert_packet(Object array, Object video_offset, Object audio_offsets, Object video_dts_offset, Object audio_dts_offsets) {
		encoder_packet pkt = new encoder_packet();
		packets.setDa(array);
		 idx = new ();
		pkt.obs_encoder_packet_ref(packet);
		obs_encoder_type generatedType = pkt.getType();
		Object generatedDts_usec = pkt.getDts_usec();
		Object generatedDts = pkt.getDts();
		Object generatedPts = pkt.getPts();
		Object generatedTrack_idx = pkt.getTrack_idx();
		if (generatedType == obs_encoder_type.OBS_ENCODER_VIDEO) {
			generatedDts_usec -= video_offset;
			generatedDts -= video_dts_offset;
			generatedPts -= video_dts_offset;
		} else {
				generatedDts_usec -= audio_offsets[generatedTrack_idx];
				generatedDts -= audio_dts_offsets[generatedTrack_idx];
				generatedPts -= audio_dts_offsets[generatedTrack_idx];
		} 
		for (idx = packets.getNum(); idx > 0; idx--) {
			encoder_packet p = packets.getArray() + (idx - 1);
			if (generatedDts_usec < generatedDts_usec) {
				break;
			} 
		}
		.da_insert(packets, idx, pkt);
		array = packets.getDa();
	}
	public void replay_buffer_data(Object data) {
		ffmpeg_muxer stream = data;
		encoder_packet pkt = new encoder_packet();
		if (!stream.active()) {
			return ;
		} 
		if (!/* encoder failure */packet) {
			stream.deactivate_replay_buffer(-8);
			return ;
		} 
		Object generatedSys_dts_usec = this.getSys_dts_usec();
		Object generatedStop_ts = stream.getStop_ts();
		if (stream.stopping()) {
			if (generatedSys_dts_usec >= generatedStop_ts) {
				stream.deactivate_replay_buffer(0);
				return ;
			} 
		} 
		pkt.obs_encoder_packet_ref(packet);
		ModernizedCProgram.replay_buffer_purge(stream, pkt);
		circlebuf generatedPackets = stream.getPackets();
		Object generatedCirclebuf = generatedPackets.getCirclebuf();
		Object generatedDts_usec = pkt.getDts_usec();
		if (!generatedCirclebuf) {
			stream.setCur_time(generatedDts_usec);
		} 
		Object generatedCur_size = stream.getCur_size();
		Object generatedSize = pkt.getSize();
		generatedCur_size += generatedSize;
		generatedPackets.circlebuf_push_back(packet, );
		obs_encoder_type generatedType = this.getType();
		Object generatedKeyframe = this.getKeyframe();
		int generatedKeyframes = stream.getKeyframes();
		if (generatedType == obs_encoder_type.OBS_ENCODER_VIDEO && generatedKeyframe) {
			generatedKeyframes++;
		} 
		Object generatedSave_ts = stream.getSave_ts();
		Object generatedMuxing = stream.getMuxing();
		Object generatedMux_thread_joinable = stream.getMux_thread_joinable();
		Object generatedMux_thread = stream.getMux_thread();
		if (generatedSave_ts && generatedSys_dts_usec >= generatedSave_ts) {
			if (ModernizedCProgram.os_atomic_load_bool(generatedMuxing)) {
				return ;
			} 
			if (generatedMux_thread_joinable) {
				ModernizedCProgram.pthread_join(generatedMux_thread, NULL);
				stream.setMux_thread_joinable(false);
			} 
			stream.setSave_ts(0);
			stream.replay_buffer_save();
		} 
	}
	/******************************************************************************
	    Copyright (C) 2014 by Hugh Bailey <obs.jim@gmail.com>
	
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
	public Object get_ms_time(Object val) {
		Object generatedTimebase_den = this.getTimebase_den();
		return .UNRECOGNIZEDFUNCTIONNAME(val * 1000 / generatedTimebase_den);
	}
	public Object get_track_index(Object output) {
		Object generatedEncoder = this.getEncoder();
		for ( i = 0;
		 i < MAX_AUDIO_MIXES; i++) {
			obs_encoder encoder = output.getAudio_encoders()[i];
			if (generatedEncoder == encoder) {
				return i;
			} 
		}
		.assert(false);
		return 0;
	}
	public encoder_packet find_first_packet_type(obs_output output, obs_encoder_type type, Object audio_idx) {
		int idx = output.find_first_packet_type_idx(obs_encoder_type.type, audio_idx);
		Object generatedInterleaved_packets = output.getInterleaved_packets();
		return (idx != -1) ? generatedInterleaved_packets.getArray()[idx] : NULL;
	}
	public encoder_packet find_last_packet_type(obs_output output, obs_encoder_type type, Object audio_idx) {
		int idx = output.find_last_packet_type_idx(obs_encoder_type.type, audio_idx);
		Object generatedInterleaved_packets = output.getInterleaved_packets();
		return (idx != -1) ? generatedInterleaved_packets.getArray()[idx] : NULL;
	}
	public void interleave_packets(Object data) {
		obs_output output = data;
		encoder_packet out = new encoder_packet();
		 was_started = new ();
		if (!output.active()) {
			return ;
		} 
		obs_encoder_type generatedType = this.getType();
		if (generatedType == obs_encoder_type.OBS_ENCODER_AUDIO) {
			this.setTrack_idx(packet.get_track_index(output));
		} 
		Object generatedInterleaved_mutex = output.getInterleaved_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedInterleaved_mutex);
		Object generatedReceived_video = output.getReceived_video();
		Object generatedKeyframe = this.getKeyframe();
		Object generatedDts_usec = this.getDts_usec();
		Object generatedActive_delay_ns = output.getActive_delay_ns();
		if (!generatedReceived_video && generatedType == /* if first video frame is not a keyframe, discard until received */obs_encoder_type.OBS_ENCODER_VIDEO && !generatedKeyframe) {
			output.discard_unused_audio_packets(generatedDts_usec);
			ModernizedCProgram.pthread_mutex_unlock(generatedInterleaved_mutex);
			if (generatedActive_delay_ns) {
				packet.obs_encoder_packet_release();
			} 
			return ;
		} 
		Object generatedReceived_audio = output.getReceived_audio();
		was_started = generatedReceived_audio && generatedReceived_video;
		if (generatedActive_delay_ns) {
			out = packet;
		} else {
				out.obs_encoder_packet_create_instance(packet);
		} 
		if (was_started) {
			ModernizedCProgram.apply_interleaved_packet_offset(output, out);
		} else {
				ModernizedCProgram.check_received(output, packet);
		} 
		ModernizedCProgram.insert_interleaved_packet(output, out);
		ModernizedCProgram.set_higher_ts(output, out);
		if (generatedReceived_audio && generatedReceived_video) {
			if (!was_started) {
				if (output.prune_interleaved_packets()) {
					if (output.initialize_interleaved_packets()) {
						output.resort_interleaved_packets();
						output.send_interleaved();
					} 
				} 
			} else {
					output.send_interleaved();
			} 
		} 
		ModernizedCProgram.pthread_mutex_unlock(generatedInterleaved_mutex);
	}
	public void default_encoded_callback(Object param) {
		obs_output output = param;
		obs_encoder_type generatedType = this.getType();
		obs_context_data generatedContext = output.getContext();
		Object generatedData = generatedContext.getData();
		int generatedTotal_frames = output.getTotal_frames();
		if (output.data_active()) {
			if (generatedType == obs_encoder_type.OBS_ENCODER_AUDIO) {
				this.setTrack_idx(packet.get_track_index(output));
			} 
			.UNRECOGNIZEDFUNCTIONNAME(generatedData, packet);
			if (generatedType == obs_encoder_type.OBS_ENCODER_VIDEO) {
				generatedTotal_frames++;
			} 
		} 
		Object generatedActive_delay_ns = output.getActive_delay_ns();
		if (generatedActive_delay_ns) {
			packet.obs_encoder_packet_release();
		} 
	}
	public void rtmp_stream_data(Object data) {
		rtmp_stream stream = data;
		encoder_packet new_packet = new encoder_packet();
		 added_packet = false;
		if (stream.disconnected() || !stream.active()) {
			return ;
		} 
		Object generatedEncode_error = stream.getEncode_error();
		Object generatedSend_sem = stream.getSend_sem();
		if (!/* encoder fail */packet) {
			ModernizedCProgram.os_atomic_set_bool(generatedEncode_error, true);
			generatedSend_sem.os_sem_post();
			return ;
		} 
		obs_encoder_type generatedType = this.getType();
		Object generatedGot_first_video = stream.getGot_first_video();
		Object generatedDts = this.getDts();
		if (generatedType == obs_encoder_type.OBS_ENCODER_VIDEO) {
			if (!generatedGot_first_video) {
				stream.setStart_dts_offset(packet.get_ms_time(generatedDts));
				stream.setGot_first_video(true);
			} 
			new_packet.obs_parse_avc_packet(packet);
		} else {
				new_packet.obs_encoder_packet_ref(packet);
		} 
		Object generatedPackets_mutex = stream.getPackets_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedPackets_mutex);
		if (!stream.disconnected()) {
			added_packet = (generatedType == obs_encoder_type.OBS_ENCODER_VIDEO) ? ModernizedCProgram.add_video_packet(stream, new_packet) : ModernizedCProgram.add_packet(stream, new_packet);
		} 
		ModernizedCProgram.pthread_mutex_unlock(generatedPackets_mutex);
		if (added_packet) {
			generatedSend_sem.os_sem_post();
		} else {
				new_packet.obs_encoder_packet_release();
		} 
	}
	public Object getData() {
		return data;
	}
	public void setData(Object newData) {
		data = newData;
	}
	public Object getSize() {
		return size;
	}
	public void setSize(Object newSize) {
		size = newSize;
	}
	public Object getPts() {
		return pts;
	}
	public void setPts(Object newPts) {
		pts = newPts;
	}
	public Object getDts() {
		return dts;
	}
	public void setDts(Object newDts) {
		dts = newDts;
	}
	public Object getTimebase_num() {
		return timebase_num;
	}
	public void setTimebase_num(Object newTimebase_num) {
		timebase_num = newTimebase_num;
	}
	public Object getTimebase_den() {
		return timebase_den;
	}
	public void setTimebase_den(Object newTimebase_den) {
		timebase_den = newTimebase_den;
	}
	public obs_encoder_type getType() {
		return type;
	}
	public void setType(obs_encoder_type newType) {
		type = newType;
	}
	public Object getKeyframe() {
		return keyframe;
	}
	public void setKeyframe(Object newKeyframe) {
		keyframe = newKeyframe;
	}
	public Object getDts_usec() {
		return dts_usec;
	}
	public void setDts_usec(Object newDts_usec) {
		dts_usec = newDts_usec;
	}
	public Object getSys_dts_usec() {
		return sys_dts_usec;
	}
	public void setSys_dts_usec(Object newSys_dts_usec) {
		sys_dts_usec = newSys_dts_usec;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int newPriority) {
		priority = newPriority;
	}
	public int getDrop_priority() {
		return drop_priority;
	}
	public void setDrop_priority(int newDrop_priority) {
		drop_priority = newDrop_priority;
	}
	public Object getTrack_idx() {
		return track_idx;
	}
	public void setTrack_idx(Object newTrack_idx) {
		track_idx = newTrack_idx;
	}
	public Object getEncoder() {
		return encoder;
	}
	public void setEncoder(Object newEncoder) {
		encoder = newEncoder;
	}
}

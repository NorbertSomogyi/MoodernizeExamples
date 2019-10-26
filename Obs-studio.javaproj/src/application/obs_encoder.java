package application;

public class obs_encoder {
	private obs_context_data context;
	private obs_encoder_info info;
	private obs_weak_encoder control;
	private obs_encoder_info orig_info;
	private Object init_mutex;
	private Object samplerate;
	private Object planes;
	private Object blocksize;
	private Object framesize;
	private Object framesize_bytes;
	private Object mixer_idx;
	private Object scaled_width;
	private Object scaled_height;
	private video_format preferred_format;
	private Object active;
	private Object paused;
	private Object initialized;
	private Object owns_info_id;
	private Object timebase_num;
	private Object timebase_den;
	private Object cur_pts;
	private Object audio_input_buffer;
	private Object audio_output_buffer;
	private Object wait_for_video;
	private Object first_received;
	private obs_encoder paired_encoder;
	private Object offset_usec;
	private Object first_raw_ts;
	private Object start_ts;
	private Object outputs_mutex;
	private Object ;
	private Object destroy_on_stop;
	private Object media;
	private Object callbacks_mutex;
	private Object ;
	private pause_data pause;
	private Object profile_encoder_encode_name;
	
	public obs_encoder(obs_context_data context, obs_encoder_info info, obs_weak_encoder control, obs_encoder_info orig_info, Object init_mutex, Object samplerate, Object planes, Object blocksize, Object framesize, Object framesize_bytes, Object mixer_idx, Object scaled_width, Object scaled_height, video_format preferred_format, Object active, Object paused, Object initialized, Object owns_info_id, Object timebase_num, Object timebase_den, Object cur_pts, Object audio_input_buffer, Object audio_output_buffer, Object wait_for_video, Object first_received, obs_encoder paired_encoder, Object offset_usec, Object first_raw_ts, Object start_ts, Object outputs_mutex, Object,  Object destroy_on_stop, Object media, Object callbacks_mutex, Object,  pause_data pause, Object profile_encoder_encode_name) {
		setContext(context);
		setInfo(info);
		setControl(control);
		setOrig_info(orig_info);
		setInit_mutex(init_mutex);
		setSamplerate(samplerate);
		setPlanes(planes);
		setBlocksize(blocksize);
		setFramesize(framesize);
		setFramesize_bytes(framesize_bytes);
		setMixer_idx(mixer_idx);
		setScaled_width(scaled_width);
		setScaled_height(scaled_height);
		setPreferred_format(preferred_format);
		setActive(active);
		setPaused(paused);
		setInitialized(initialized);
		setOwns_info_id(owns_info_id);
		setTimebase_num(timebase_num);
		setTimebase_den(timebase_den);
		setCur_pts(cur_pts);
		setAudio_input_buffer(audio_input_buffer);
		setAudio_output_buffer(audio_output_buffer);
		setWait_for_video(wait_for_video);
		setFirst_received(first_received);
		setPaired_encoder(paired_encoder);
		setOffset_usec(offset_usec);
		setFirst_raw_ts(first_raw_ts);
		setStart_ts(start_ts);
		setOutputs_mutex(outputs_mutex);
		set();
		setDestroy_on_stop(destroy_on_stop);
		setMedia(media);
		setCallbacks_mutex(callbacks_mutex);
		set();
		setPause(pause);
		setProfile_encoder_encode_name(profile_encoder_encode_name);
	}
	public obs_encoder() {
	}
	
	public Object obs_hotkey_register_encoder(Object name, Object description, Object func, Object data) {
		if (!encoder || !ModernizedCProgram.lock()) {
			return (~(obs_hotkey_id)0);
		} 
		obs_weak_encoder obs_weak_encoder = new obs_weak_encoder();
		obs_context_data generatedContext = this.getContext();
		obs_hotkey_id id = generatedContext.obs_hotkey_register_internal(obs_hotkey_registerer_type.OBS_HOTKEY_REGISTERER_ENCODER, obs_weak_encoder.obs_encoder_get_weak_encoder(encoder), name, description, func, data);
		ModernizedCProgram.unlock();
		return id;
	}
	public Object obs_hotkey_pair_register_encoder(Object name0, Object description0, Object name1, Object description1, Object func0, Object func1, Object data0, Object data1) {
		if (!encoder) {
			return (~(obs_hotkey_pair_id)0);
		} 
		obs_context_data generatedContext = this.getContext();
		return generatedContext.register_hotkey_pair_internal(obs_hotkey_registerer_type.OBS_HOTKEY_REGISTERER_ENCODER, encoder, weak_encoder_ref, name0, description0, name1, description1, func0, func1, data0, data1);
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
	/* TODO: FIXME: this is currently hard-coded to h264 and aac!  ..not that we'll
	 * use anything else for a long time. */
	//#define DEBUG_TIMESTAMPS
	//#define WRITE_FLV_HEADER
	public double encoder_bitrate() {
		obs_data obs_data = new obs_data();
		obs_data_t settings = obs_data.obs_encoder_get_settings(encoder);
		double bitrate = settings.obs_data_get_double("bitrate");
		settings.obs_data_release();
		return bitrate;
	}
	public obs_encoder obs_video_encoder_create(Object id, Object name, obs_data settings, obs_data hotkey_data) {
		if (!name || !id) {
			return NULL;
		} 
		return id.create_encoder(obs_encoder_type.OBS_ENCODER_VIDEO, name, settings, 0, hotkey_data);
	}
	public obs_encoder obs_audio_encoder_create(Object id, Object name, obs_data settings, Object mixer_idx, obs_data hotkey_data) {
		if (!name || !id) {
			return NULL;
		} 
		return id.create_encoder(obs_encoder_type.OBS_ENCODER_AUDIO, name, settings, mixer_idx, hotkey_data);
	}
	public void get_video_info(Object info) {
		video_output_info voi = new video_output_info();
		Object generatedMedia = this.getMedia();
		voi = ModernizedCProgram.video_output_get_info(generatedMedia);
		info.setFormat(voi.getVideo_output_info());
		info.setColorspace(voi.getVideo_output_info());
		info.setRange(voi.getVideo_output_info());
		info.setWidth(ModernizedCProgram.obs_encoder_get_width(encoder));
		info.setHeight(ModernizedCProgram.obs_encoder_get_height(encoder));
		obs_encoder_info generatedInfo = this.getInfo();
		Object generatedGet_video_info = generatedInfo.getGet_video_info();
		obs_context_data generatedContext = this.getContext();
		Object generatedData = generatedContext.getData();
		if (generatedGet_video_info) {
			.UNRECOGNIZEDFUNCTIONNAME(generatedData, info);
		} 
		if (info.getWidth() != voi.getVideo_output_info() || info.getHeight() != voi.getVideo_output_info()) {
			encoder.obs_encoder_set_scaled_size(info.getWidth(), info.getHeight());
		} 
	}
	public void add_connection() {
		obs_encoder_info generatedInfo = this.getInfo();
		obs_encoder_type generatedType = generatedInfo.getType();
		Object generatedMedia = this.getMedia();
		Object generatedMixer_idx = this.getMixer_idx();
		if (generatedType == obs_encoder_type.OBS_ENCODER_AUDIO) {
			audio_convert_info audio_info = new audio_convert_info(0);
			ModernizedCProgram.get_audio_info(encoder, audio_info);
			generatedMedia.audio_output_connect(generatedMixer_idx, audio_info, ModernizedCProgram.receive_audio, encoder);
		} else {
				video_scale_info info = new video_scale_info(0);
				encoder.get_video_info(info);
				if (ModernizedCProgram.gpu_encode_available(encoder)) {
					encoder.start_gpu_encode();
				} else {
						ModernizedCProgram.start_raw_video(generatedMedia, info, ModernizedCProgram.receive_video, encoder);
				} 
		} 
		Object generatedActive = this.getActive();
		ModernizedCProgram.os_atomic_set_bool(generatedActive, true);
	}
	public void remove_connection(Object shutdown) {
		obs_encoder_info generatedInfo = this.getInfo();
		obs_encoder_type generatedType = generatedInfo.getType();
		Object generatedMedia = this.getMedia();
		Object generatedMixer_idx = this.getMixer_idx();
		if (generatedType == obs_encoder_type.OBS_ENCODER_AUDIO) {
			generatedMedia.audio_output_disconnect(generatedMixer_idx, ModernizedCProgram.receive_audio, encoder);
		} else {
				if (ModernizedCProgram.gpu_encode_available(encoder)) {
					encoder.stop_gpu_encode();
				} else {
						ModernizedCProgram.stop_raw_video(generatedMedia, ModernizedCProgram.receive_video, encoder/* obs_encoder_shutdown locks init_mutex, so don't call it on encode
							 * errors, otherwise you can get a deadlock with outputs when they end
							 * data capture, which will lock init_mutex and the video callback
							 * mutex in the reverse order.  instead, call shutdown before starting
							 * up again */);
				} 
		} 
		if (shutdown) {
			encoder.obs_encoder_shutdown();
		} 
		Object generatedActive = this.getActive();
		ModernizedCProgram.os_atomic_set_bool(generatedActive, false);
	}
	public void free_audio_buffers() {
		Object generatedAudio_input_buffer = this.getAudio_input_buffer();
		Object generatedAudio_output_buffer = this.getAudio_output_buffer();
		for ( i = 0;
		 i < MAX_AV_PLANES; i++) {
			generatedAudio_input_buffer[i].circlebuf_free();
			ModernizedCProgram.bfree(generatedAudio_output_buffer[i]);
			generatedAudio_output_buffer[i] = NULL;
		}
	}
	public void obs_encoder_actually_destroy() {
		Object generatedOutputs_mutex = this.getOutputs_mutex();
		Object generatedOutputs = this.getOutputs();
		obs_context_data generatedContext = this.getContext();
		Byte generatedName = generatedContext.getName();
		Object generatedData = generatedContext.getData();
		Object generatedCallbacks = this.getCallbacks();
		Object generatedInit_mutex = this.getInit_mutex();
		Object generatedCallbacks_mutex = this.getCallbacks_mutex();
		pause_data generatedPause = this.getPause();
		Object generatedMutex = generatedPause.getMutex();
		Object generatedOwns_info_id = this.getOwns_info_id();
		obs_encoder_info generatedInfo = this.getInfo();
		Object generatedId = generatedInfo.getId();
		if (encoder) {
			ModernizedCProgram.pthread_mutex_lock(generatedOutputs_mutex);
			for ( i = 0;
			 i < generatedOutputs.getNum(); i++) {
				obs_output output = generatedOutputs.getArray()[i];
				ModernizedCProgram.obs_output_remove_encoder(output, encoder);
			}
			.da_free(generatedOutputs);
			ModernizedCProgram.pthread_mutex_unlock(generatedOutputs_mutex);
			ModernizedCProgram.blog(LOG_DEBUG, "encoder '%s' destroyed", generatedName);
			encoder.free_audio_buffers();
			if (generatedData) {
				.UNRECOGNIZEDFUNCTIONNAME(generatedData);
			} 
			.da_free(generatedCallbacks);
			ModernizedCProgram.pthread_mutex_destroy(generatedInit_mutex);
			ModernizedCProgram.pthread_mutex_destroy(generatedCallbacks_mutex);
			ModernizedCProgram.pthread_mutex_destroy(generatedOutputs_mutex);
			ModernizedCProgram.pthread_mutex_destroy(generatedMutex);
			generatedContext.obs_context_data_free();
			if (generatedOwns_info_id) {
				ModernizedCProgram.bfree((Object)generatedId);
			} 
			ModernizedCProgram.bfree(encoder);
		} 
	}
	/* does not actually destroy the encoder until all connections to it have been
	 * removed. (full reference counting really would have been superfluous) */
	public void obs_encoder_destroy() {
		obs_context_data generatedContext = this.getContext();
		Object generatedInit_mutex = this.getInit_mutex();
		Object generatedCallbacks_mutex = this.getCallbacks_mutex();
		Object generatedCallbacks = this.getCallbacks();
		if (encoder) {
			 destroy = new ();
			generatedContext.obs_context_data_remove();
			ModernizedCProgram.pthread_mutex_lock(generatedInit_mutex);
			ModernizedCProgram.pthread_mutex_lock(generatedCallbacks_mutex);
			destroy = generatedCallbacks.getNum() == 0;
			if (!destroy) {
				this.setDestroy_on_stop(true);
			} 
			ModernizedCProgram.pthread_mutex_unlock(generatedCallbacks_mutex);
			ModernizedCProgram.pthread_mutex_unlock(generatedInit_mutex);
			if (destroy) {
				encoder.obs_encoder_actually_destroy();
			} 
		} 
	}
	public void obs_encoder_set_name(Object name) {
		if (!ModernizedCProgram.obs_object_valid(encoder, "obs_encoder_set_name", "encoder")) {
			return ;
		} 
		obs_context_data generatedContext = this.getContext();
		Byte generatedName = generatedContext.getName();
		if (name && name && .strcmp(name, generatedName) != 0) {
			generatedContext.obs_context_data_setname(name);
		} 
	}
	public void reset_audio_buffers() {
		encoder.free_audio_buffers();
		Object generatedPlanes = this.getPlanes();
		Object generatedAudio_output_buffer = this.getAudio_output_buffer();
		Object generatedFramesize_bytes = this.getFramesize_bytes();
		for ( i = 0;
		 i < generatedPlanes; i++) {
			generatedAudio_output_buffer[i] = ModernizedCProgram.bmalloc(generatedFramesize_bytes);
		}
	}
	public void intitialize_audio_encoder() {
		audio_convert_info info = new audio_convert_info(0);
		ModernizedCProgram.get_audio_info(encoder, info);
		Object generatedAudio_convert_info = info.getAudio_convert_info();
		this.setSamplerate(generatedAudio_convert_info);
		this.setPlanes(ModernizedCProgram.get_audio_planes(generatedAudio_convert_info, generatedAudio_convert_info));
		this.setBlocksize(ModernizedCProgram.get_audio_size(generatedAudio_convert_info, generatedAudio_convert_info, 1));
		obs_context_data generatedContext = this.getContext();
		Object generatedData = generatedContext.getData();
		this.setFramesize(.UNRECOGNIZEDFUNCTIONNAME(generatedData));
		Object generatedBlocksize = this.getBlocksize();
		Object generatedFramesize = this.getFramesize();
		this.setFramesize_bytes(generatedBlocksize * generatedFramesize);
		encoder.reset_audio_buffers();
	}
	public Object obs_encoder_initialize_internal() {
		Object generatedActive = this.getActive();
		if (ModernizedCProgram.os_atomic_load_bool(generatedActive)) {
			return true;
		} 
		Object generatedInitialized = this.getInitialized();
		if (generatedInitialized) {
			return true;
		} 
		encoder.obs_encoder_shutdown();
		obs_encoder_info generatedOrig_info = this.getOrig_info();
		Object generatedCreate = generatedOrig_info.getCreate();
		obs_context_data generatedContext = this.getContext();
		obs_data generatedSettings = generatedContext.getSettings();
		if (generatedCreate) {
			can_reroute = true;
			this.setInfo(generatedOrig_info);
			generatedContext.setData(.UNRECOGNIZEDFUNCTIONNAME(generatedSettings, encoder));
			can_reroute = false;
		} 
		Object generatedData = generatedContext.getData();
		if (!generatedData) {
			return false;
		} 
		obs_encoder_type generatedType = generatedOrig_info.getType();
		if (generatedType == obs_encoder_type.OBS_ENCODER_AUDIO) {
			encoder.intitialize_audio_encoder();
		} 
		this.setInitialized(true);
		return true;
	}
	public Object obs_encoder_create_rerouted(Object reroute_id) {
		if (!ModernizedCProgram.obs_object_valid(encoder, "obs_encoder_reroute", "encoder")) {
			return NULL;
		} 
		if (!ModernizedCProgram.obs_object_valid(reroute_id, "obs_encoder_reroute", "reroute_id")) {
			return NULL;
		} 
		if (!can_reroute) {
			return NULL;
		} 
		obs_encoder_info obs_encoder_info = new obs_encoder_info();
		obs_encoder_info ei = obs_encoder_info.find_encoder(reroute_id);
		obs_encoder_info generatedOrig_info = this.getOrig_info();
		obs_encoder_type generatedType = generatedOrig_info.getType();
		Object generatedCodec = generatedOrig_info.getCodec();
		obs_context_data generatedContext = this.getContext();
		obs_data generatedSettings = generatedContext.getSettings();
		if (ei) {
			if (ei.getType() != generatedType || ModernizedCProgram.astrcmpi(ei.getCodec(), generatedCodec) != 0) {
				return NULL;
			} 
			this.setInfo(ei);
			return .UNRECOGNIZEDFUNCTIONNAME(generatedSettings, encoder);
		} 
		return NULL;
	}
	public Object obs_encoder_initialize() {
		 success = new ();
		if (!encoder) {
			return false;
		} 
		Object generatedInit_mutex = this.getInit_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedInit_mutex);
		success = encoder.obs_encoder_initialize_internal();
		ModernizedCProgram.pthread_mutex_unlock(generatedInit_mutex);
		return success;
	}
	public void obs_encoder_shutdown() {
		Object generatedInit_mutex = this.getInit_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedInit_mutex);
		obs_context_data generatedContext = this.getContext();
		Object generatedData = generatedContext.getData();
		if (generatedData) {
			.UNRECOGNIZEDFUNCTIONNAME(generatedData);
			generatedContext.setData(NULL);
			this.setPaired_encoder(NULL);
			this.setFirst_received(false);
			this.setOffset_usec(0);
			this.setStart_ts(0);
		} 
		ModernizedCProgram.pthread_mutex_unlock(generatedInit_mutex);
	}
	public void obs_encoder_start_internal(Object new_packet, Object param) {
		encoder_callback cb = new encoder_callback(false, new_packet, param);
		 first = false;
		obs_context_data generatedContext = this.getContext();
		Object generatedData = generatedContext.getData();
		if (!generatedData) {
			return ;
		} 
		Object generatedCallbacks_mutex = this.getCallbacks_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedCallbacks_mutex);
		Object generatedCallbacks = this.getCallbacks();
		first = (generatedCallbacks.getNum() == 0);
		 idx = ModernizedCProgram.get_callback_idx(encoder, new_packet, param);
		if (idx == DARRAY_INVALID) {
			.da_push_back(generatedCallbacks, cb);
		} 
		ModernizedCProgram.pthread_mutex_unlock(generatedCallbacks_mutex);
		Object generatedPaused = this.getPaused();
		pause_data generatedPause = this.getPause();
		if (first) {
			ModernizedCProgram.os_atomic_set_bool(generatedPaused, false);
			generatedPause.pause_reset();
			this.setCur_pts(0);
			encoder.add_connection();
		} 
	}
	public void obs_encoder_start(Object new_packet, Object param) {
		if (!ModernizedCProgram.obs_object_valid(encoder, "obs_encoder_start", "encoder")) {
			return ;
		} 
		if (!ModernizedCProgram.obs_object_valid(new_packet, "obs_encoder_start", "new_packet")) {
			return ;
		} 
		Object generatedInit_mutex = this.getInit_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedInit_mutex);
		encoder.obs_encoder_start_internal(new_packet, param);
		ModernizedCProgram.pthread_mutex_unlock(generatedInit_mutex);
	}
	public Object obs_encoder_stop_internal(Object new_packet, Object param) {
		 last = false;
		 idx = new ();
		Object generatedCallbacks_mutex = this.getCallbacks_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedCallbacks_mutex);
		idx = ModernizedCProgram.get_callback_idx(encoder, new_packet, param);
		Object generatedCallbacks = this.getCallbacks();
		if (idx != DARRAY_INVALID) {
			.da_erase(generatedCallbacks, idx);
			last = (generatedCallbacks.getNum() == 0);
		} 
		ModernizedCProgram.pthread_mutex_unlock(generatedCallbacks_mutex);
		Object generatedDestroy_on_stop = this.getDestroy_on_stop();
		Object generatedInit_mutex = this.getInit_mutex();
		if (last) {
			encoder.remove_connection(true);
			this.setInitialized(false);
			if (generatedDestroy_on_stop) {
				ModernizedCProgram.pthread_mutex_unlock(generatedInit_mutex);
				encoder.obs_encoder_actually_destroy();
				return true;
			} 
		} 
		return false;
	}
	public void obs_encoder_stop(Object new_packet, Object param) {
		 destroyed = new ();
		if (!ModernizedCProgram.obs_object_valid(encoder, "obs_encoder_stop", "encoder")) {
			return ;
		} 
		if (!ModernizedCProgram.obs_object_valid(new_packet, "obs_encoder_stop", "new_packet")) {
			return ;
		} 
		Object generatedInit_mutex = this.getInit_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedInit_mutex);
		destroyed = encoder.obs_encoder_stop_internal(new_packet, param);
		if (!destroyed) {
			ModernizedCProgram.pthread_mutex_unlock(generatedInit_mutex);
		} 
	}
	public void obs_encoder_set_scaled_size(Object width, Object height) {
		if (!ModernizedCProgram.obs_object_valid(encoder, "obs_encoder_set_scaled_size", "encoder")) {
			return ;
		} 
		obs_encoder_info generatedInfo = this.getInfo();
		obs_encoder_type generatedType = generatedInfo.getType();
		if (generatedType != obs_encoder_type.OBS_ENCODER_VIDEO) {
			ModernizedCProgram.blog(LOG_WARNING, "obs_encoder_set_scaled_size: encoder '%s' is not a video encoder", ModernizedCProgram.obs_encoder_get_name(encoder));
			return ;
		} 
		Object generatedActive = this.getActive();
		if (ModernizedCProgram.os_atomic_load_bool(generatedActive)) {
			ModernizedCProgram.blog(LOG_WARNING, "encoder '%s': Cannot set the scaled resolution while the encoder is active", ModernizedCProgram.obs_encoder_get_name(encoder));
			return ;
		} 
		this.setScaled_width(width);
		this.setScaled_height(height);
	}
	public void obs_encoder_set_video(Object video) {
		video_output_info voi = new video_output_info();
		if (!ModernizedCProgram.obs_object_valid(encoder, "obs_encoder_set_video", "encoder")) {
			return ;
		} 
		obs_encoder_info generatedInfo = this.getInfo();
		obs_encoder_type generatedType = generatedInfo.getType();
		if (generatedType != obs_encoder_type.OBS_ENCODER_VIDEO) {
			ModernizedCProgram.blog(LOG_WARNING, "obs_encoder_set_video: encoder '%s' is not a video encoder", ModernizedCProgram.obs_encoder_get_name(encoder));
			return ;
		} 
		if (!video) {
			return ;
		} 
		voi = ModernizedCProgram.video_output_get_info(video);
		this.setMedia(video);
		this.setTimebase_num(voi.getVideo_output_info());
		this.setTimebase_den(voi.getVideo_output_info());
	}
	public void obs_encoder_set_audio(Object audio) {
		if (!ModernizedCProgram.obs_object_valid(encoder, "obs_encoder_set_audio", "encoder")) {
			return ;
		} 
		obs_encoder_info generatedInfo = this.getInfo();
		obs_encoder_type generatedType = generatedInfo.getType();
		if (generatedType != obs_encoder_type.OBS_ENCODER_AUDIO) {
			ModernizedCProgram.blog(LOG_WARNING, "obs_encoder_set_audio: encoder '%s' is not an audio encoder", ModernizedCProgram.obs_encoder_get_name(encoder));
			return ;
		} 
		if (!audio) {
			return ;
		} 
		this.setMedia(audio);
		this.setTimebase_num(1);
		this.setTimebase_den(ModernizedCProgram.audio_output_get_sample_rate(audio));
	}
	public void full_stop() {
		Object generatedOutputs_mutex = this.getOutputs_mutex();
		Object generatedOutputs = this.getOutputs();
		Object generatedInterleaved_mutex = output.getInterleaved_mutex();
		obs_context_data generatedContext = output.getContext();
		Object generatedData = generatedContext.getData();
		Object generatedCallbacks_mutex = this.getCallbacks_mutex();
		Object generatedCallbacks = this.getCallbacks();
		if (encoder) {
			ModernizedCProgram.pthread_mutex_lock(generatedOutputs_mutex);
			for ( i = 0;
			 i < generatedOutputs.getNum(); i++) {
				obs_output output = generatedOutputs.getArray()[i];
				output.obs_output_force_stop();
				ModernizedCProgram.pthread_mutex_lock(generatedInterleaved_mutex);
				.UNRECOGNIZEDFUNCTIONNAME(generatedData, NULL);
				ModernizedCProgram.pthread_mutex_unlock(generatedInterleaved_mutex);
			}
			ModernizedCProgram.pthread_mutex_unlock(generatedOutputs_mutex);
			ModernizedCProgram.pthread_mutex_lock(generatedCallbacks_mutex);
			.da_free(generatedCallbacks);
			ModernizedCProgram.pthread_mutex_unlock(generatedCallbacks_mutex);
			encoder.remove_connection(false);
			this.setInitialized(false);
		} 
	}
	public void clear_audio() {
		Object generatedPlanes = this.getPlanes();
		Object generatedAudio_input_buffer = this.getAudio_input_buffer();
		for ( i = 0;
		 i < generatedPlanes; i++) {
			generatedAudio_input_buffer[i].circlebuf_free();
		}
	}
	public void push_back_audio(Object data, Object size, Object offset_size) {
		size -= offset_size;
		Object generatedPlanes = this.getPlanes();
		Object generatedAudio_input_buffer = this.getAudio_input_buffer();
		if (/* push in to the circular buffer */size) {
			for ( i = 0;
			 i < generatedPlanes; i++) {
				generatedAudio_input_buffer[i].circlebuf_push_back(data.getData()[i] + offset_size, size);
			}
		} 
	}
	public Object calc_offset_size(Object v_start_ts, Object a_start_ts) {
		 offset = v_start_ts - a_start_ts;
		Object generatedSamplerate = this.getSamplerate();
		offset = ()offset * ()generatedSamplerate / -1024;
		Object generatedBlocksize = this.getBlocksize();
		return ()offset * generatedBlocksize;
	}
	public void start_from_buffer(Object v_start_ts) {
		Object generatedAudio_input_buffer = this.getAudio_input_buffer();
		 size = generatedAudio_input_buffer[0].getCirclebuf();
		audio_data audio = new audio_data(0);
		 offset_size = 0;
		Object generatedAudio_data = audio.getAudio_data();
		for ( i = 0;
		 i < MAX_AV_PLANES; i++) {
			generatedAudio_data[i] = generatedAudio_input_buffer[i].getCirclebuf();
			.memset(generatedAudio_input_buffer[i], 0, );
		}
		Object generatedFirst_raw_ts = this.getFirst_raw_ts();
		if (generatedFirst_raw_ts < v_start_ts) {
			offset_size = encoder.calc_offset_size(v_start_ts, generatedFirst_raw_ts);
		} 
		encoder.push_back_audio(audio, size, offset_size);
		for ( i = 0;
		 i < MAX_AV_PLANES; i++) {
			ModernizedCProgram.bfree(generatedAudio_data[i]);
		}
	}
	public Object send_audio_data() {
		encoder_frame enc_frame = new encoder_frame();
		.memset(enc_frame, 0, );
		Object generatedPlanes = this.getPlanes();
		Object generatedAudio_input_buffer = this.getAudio_input_buffer();
		Object generatedAudio_output_buffer = this.getAudio_output_buffer();
		Object generatedFramesize_bytes = this.getFramesize_bytes();
		Object generatedData = enc_frame.getData();
		Object generatedLinesize = enc_frame.getLinesize();
		for ( i = 0;
		 i < generatedPlanes; i++) {
			generatedAudio_input_buffer[i].circlebuf_pop_front(generatedAudio_output_buffer[i], generatedFramesize_bytes);
			generatedData[i] = generatedAudio_output_buffer[i];
			generatedLinesize[i] = ()generatedFramesize_bytes;
		}
		Object generatedFramesize = this.getFramesize();
		enc_frame.setFrames(()generatedFramesize);
		Object generatedCur_pts = this.getCur_pts();
		enc_frame.setPts(generatedCur_pts);
		if (!ModernizedCProgram.do_encode(encoder, enc_frame)) {
			return false;
		} 
		generatedCur_pts += generatedFramesize;
		return true;
	}
	public void obs_encoder_set_preferred_video_format(video_format format) {
		obs_encoder_info generatedInfo = this.getInfo();
		obs_encoder_type generatedType = generatedInfo.getType();
		if (!encoder || generatedType != obs_encoder_type.OBS_ENCODER_VIDEO) {
			return ;
		} 
		this.setPreferred_format(video_format.format);
	}
	public void obs_encoder_addref() {
		if (!encoder) {
			return ;
		} 
		obs_weak_encoder generatedControl = this.getControl();
		obs_weak_ref generatedRef = generatedControl.getRef();
		generatedRef.obs_ref_addref();
	}
	public void obs_encoder_release() {
		if (!encoder) {
			return ;
		} 
		obs_weak_encoder generatedControl = this.getControl();
		obs_weak_encoder_t control = generatedControl;
		obs_weak_ref generatedRef = control.getRef();
		if (generatedRef.obs_ref_release()) {
			encoder.obs_encoder_destroy();
			control.obs_weak_encoder_release();
		} 
		// The order of operations is important here since// get_context_by_name in obs.c relies on weak refs
	}
	public obs_encoder obs_encoder_get_ref() {
		if (!encoder) {
			return NULL;
		} 
		obs_weak_encoder generatedControl = this.getControl();
		obs_encoder obs_encoder = new obs_encoder();
		return obs_encoder.obs_weak_encoder_get_encoder(generatedControl);
	}
	public obs_encoder obs_weak_encoder_get_encoder(obs_weak_encoder weak) {
		if (!weak) {
			return NULL;
		} 
		obs_weak_ref generatedRef = weak.getRef();
		obs_encoder generatedEncoder = weak.getEncoder();
		if (generatedRef.obs_weak_ref_get_ref()) {
			return generatedEncoder;
		} 
		return NULL;
	}
	public Object obs_encoder_get_type_data() {
		obs_encoder_info generatedOrig_info = this.getOrig_info();
		Object generatedType_data = generatedOrig_info.getType_data();
		return ModernizedCProgram.obs_object_valid(encoder, "obs_encoder_get_type_data", "encoder") ? generatedType_data : NULL;
	}
	public obs_encoder obs_get_encoder_by_name(Object name) {
		if (!ModernizedCProgram.obs) {
			return NULL;
		} 
		return ModernizedCProgram.get_context_by_name(ModernizedCProgram.obs.getData().getFirst_encoder(), name, ModernizedCProgram.obs.getData().getEncoders_mutex(), obs_encoder_addref_safe_);
	}
	public Object start_gpu_encode() {
		obs_core_video video = ModernizedCProgram.obs.getVideo();
		 success = true;
		ModernizedCProgram.obs_enter_graphics();
		Object generatedGpu_encoder_mutex = video.getGpu_encoder_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedGpu_encoder_mutex);
		Object generatedGpu_encoders = video.getGpu_encoders();
		if (!generatedGpu_encoders.getNum()) {
			success = video.init_gpu_encoding();
		} 
		if (success) {
			.da_push_back(generatedGpu_encoders, encoder);
		} else {
				video.free_gpu_encoding();
		} 
		ModernizedCProgram.pthread_mutex_unlock(generatedGpu_encoder_mutex);
		ModernizedCProgram.obs_leave_graphics();
		long generatedGpu_encoder_active = video.getGpu_encoder_active();
		Object generatedVideo = video.getVideo();
		if (success) {
			ModernizedCProgram.os_atomic_inc_long(generatedGpu_encoder_active);
			generatedVideo.video_output_inc_texture_encoders();
		} 
		return success;
	}
	public void stop_gpu_encode() {
		obs_core_video video = ModernizedCProgram.obs.getVideo();
		 call_free = false;
		long generatedGpu_encoder_active = video.getGpu_encoder_active();
		ModernizedCProgram.os_atomic_dec_long(generatedGpu_encoder_active);
		Object generatedVideo = video.getVideo();
		generatedVideo.video_output_dec_texture_encoders();
		Object generatedGpu_encoder_mutex = video.getGpu_encoder_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedGpu_encoder_mutex);
		Object generatedGpu_encoders = video.getGpu_encoders();
		.da_erase_item(generatedGpu_encoders, encoder);
		if (!generatedGpu_encoders.getNum()) {
			call_free = true;
		} 
		ModernizedCProgram.pthread_mutex_unlock(generatedGpu_encoder_mutex);
		Object generatedGpu_encode_inactive = video.getGpu_encode_inactive();
		generatedGpu_encode_inactive.os_event_wait();
		if (call_free) {
			video.stop_gpu_encoding_thread();
			ModernizedCProgram.obs_enter_graphics();
			ModernizedCProgram.pthread_mutex_lock(generatedGpu_encoder_mutex);
			video.free_gpu_encoding();
			ModernizedCProgram.pthread_mutex_unlock(generatedGpu_encoder_mutex);
			ModernizedCProgram.obs_leave_graphics();
		} 
	}
	public obs_encoder obs_output_get_video_encoder(Object output) {
		return ModernizedCProgram.obs_object_valid(output, "obs_output_get_video_encoder", "output") ? output.getVideo_encoder() : NULL;
	}
	public obs_encoder obs_output_get_audio_encoder(Object output, Object idx) {
		if (!ModernizedCProgram.obs_object_valid(output, "obs_output_get_audio_encoder", "output")) {
			return NULL;
		} 
		if ((output.getInfo().getFlags() & (1 << 4)) != 0) {
			if (idx >= MAX_AUDIO_MIXES) {
				return NULL;
			} 
		} else {
				if (idx > 0) {
					return NULL;
				} 
		} 
		return output.getAudio_encoders()[idx];
	}
	public obs_encoder find_inactive_audio_encoder(obs_output output, Object num_mixes) {
		Object generatedAudio_encoders = output.getAudio_encoders();
		Object generatedActive = audio.getActive();
		obs_encoder generatedPaired_encoder = audio.getPaired_encoder();
		for ( i = 0;
		 i < num_mixes; i++) {
			obs_encoder audio = generatedAudio_encoders[i];
			if (audio && !generatedActive && !generatedPaired_encoder) {
				return audio;
			} 
		}
		return NULL;
	}
	public void cap_resolution(Object info) {
		qsv_cpu_platform qsv_platform = .qsv_get_cpu_platform();
		uint32_t width = ModernizedCProgram.obs_encoder_get_width(encoder);
		uint32_t height = ModernizedCProgram.obs_encoder_get_height(encoder);
		info.setHeight(height);
		info.setWidth(width);
		if (qsv_cpu_platform.qsv_platform <= qsv_cpu_platform.QSV_CPU_PLATFORM_IVB) {
			if (width > 1920) {
				info.setWidth(1920);
			} 
			if (height > 1200) {
				info.setHeight(1200);
			} 
		} 
	}
	public obs_context_data getContext() {
		return context;
	}
	public void setContext(obs_context_data newContext) {
		context = newContext;
	}
	public obs_encoder_info getInfo() {
		return info;
	}
	public void setInfo(obs_encoder_info newInfo) {
		info = newInfo;
	}
	public obs_weak_encoder getControl() {
		return control;
	}
	public void setControl(obs_weak_encoder newControl) {
		control = newControl;
	}
	public obs_encoder_info getOrig_info() {
		return orig_info;
	}
	public void setOrig_info(obs_encoder_info newOrig_info) {
		orig_info = newOrig_info;
	}
	public Object getInit_mutex() {
		return init_mutex;
	}
	public void setInit_mutex(Object newInit_mutex) {
		init_mutex = newInit_mutex;
	}
	public Object getSamplerate() {
		return samplerate;
	}
	public void setSamplerate(Object newSamplerate) {
		samplerate = newSamplerate;
	}
	public Object getPlanes() {
		return planes;
	}
	public void setPlanes(Object newPlanes) {
		planes = newPlanes;
	}
	public Object getBlocksize() {
		return blocksize;
	}
	public void setBlocksize(Object newBlocksize) {
		blocksize = newBlocksize;
	}
	public Object getFramesize() {
		return framesize;
	}
	public void setFramesize(Object newFramesize) {
		framesize = newFramesize;
	}
	public Object getFramesize_bytes() {
		return framesize_bytes;
	}
	public void setFramesize_bytes(Object newFramesize_bytes) {
		framesize_bytes = newFramesize_bytes;
	}
	public Object getMixer_idx() {
		return mixer_idx;
	}
	public void setMixer_idx(Object newMixer_idx) {
		mixer_idx = newMixer_idx;
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
	public video_format getPreferred_format() {
		return preferred_format;
	}
	public void setPreferred_format(video_format newPreferred_format) {
		preferred_format = newPreferred_format;
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
	public Object getInitialized() {
		return initialized;
	}
	public void setInitialized(Object newInitialized) {
		initialized = newInitialized;
	}
	public Object getOwns_info_id() {
		return owns_info_id;
	}
	public void setOwns_info_id(Object newOwns_info_id) {
		owns_info_id = newOwns_info_id;
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
	public Object getCur_pts() {
		return cur_pts;
	}
	public void setCur_pts(Object newCur_pts) {
		cur_pts = newCur_pts;
	}
	public Object getAudio_input_buffer() {
		return audio_input_buffer;
	}
	public void setAudio_input_buffer(Object newAudio_input_buffer) {
		audio_input_buffer = newAudio_input_buffer;
	}
	public Object getAudio_output_buffer() {
		return audio_output_buffer;
	}
	public void setAudio_output_buffer(Object newAudio_output_buffer) {
		audio_output_buffer = newAudio_output_buffer;
	}
	public Object getWait_for_video() {
		return wait_for_video;
	}
	public void setWait_for_video(Object newWait_for_video) {
		wait_for_video = newWait_for_video;
	}
	public Object getFirst_received() {
		return first_received;
	}
	public void setFirst_received(Object newFirst_received) {
		first_received = newFirst_received;
	}
	public obs_encoder getPaired_encoder() {
		return paired_encoder;
	}
	public void setPaired_encoder(obs_encoder newPaired_encoder) {
		paired_encoder = newPaired_encoder;
	}
	public Object getOffset_usec() {
		return offset_usec;
	}
	public void setOffset_usec(Object newOffset_usec) {
		offset_usec = newOffset_usec;
	}
	public Object getFirst_raw_ts() {
		return first_raw_ts;
	}
	public void setFirst_raw_ts(Object newFirst_raw_ts) {
		first_raw_ts = newFirst_raw_ts;
	}
	public Object getStart_ts() {
		return start_ts;
	}
	public void setStart_ts(Object newStart_ts) {
		start_ts = newStart_ts;
	}
	public Object getOutputs_mutex() {
		return outputs_mutex;
	}
	public void setOutputs_mutex(Object newOutputs_mutex) {
		outputs_mutex = newOutputs_mutex;
	}
	public Object get() {
		return ;
	}
	public void set(Object new) {
		 = new;
	}
	public Object getDestroy_on_stop() {
		return destroy_on_stop;
	}
	public void setDestroy_on_stop(Object newDestroy_on_stop) {
		destroy_on_stop = newDestroy_on_stop;
	}
	public Object getMedia() {
		return media;
	}
	public void setMedia(Object newMedia) {
		media = newMedia;
	}
	public Object getCallbacks_mutex() {
		return callbacks_mutex;
	}
	public void setCallbacks_mutex(Object newCallbacks_mutex) {
		callbacks_mutex = newCallbacks_mutex;
	}
	public Object get() {
		return ;
	}
	public void set(Object new) {
		 = new;
	}
	public pause_data getPause() {
		return pause;
	}
	public void setPause(pause_data newPause) {
		pause = newPause;
	}
	public Object getProfile_encoder_encode_name() {
		return profile_encoder_encode_name;
	}
	public void setProfile_encoder_encode_name(Object newProfile_encoder_encode_name) {
		profile_encoder_encode_name = newProfile_encoder_encode_name;
	}
}

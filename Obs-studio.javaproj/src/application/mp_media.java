package application;

public class mp_media {
	private Object fmt;
	private Object v_preload_cb;
	private Object stop_cb;
	private Object v_cb;
	private Object a_cb;
	private Object opaque;
	private Byte path;
	private Byte format_name;
	private int buffering;
	private int speed;
	private AVPixelFormat scale_format;
	private SwsContext swscale;
	private Object scale_linesizes;
	private Object scale_pic;
	private mp_decode v;
	private mp_decode a;
	private Object is_local_file;
	private Object has_video;
	private Object has_audio;
	private Object is_file;
	private Object eof;
	private Object hw;
	private obs_source_frame obsframe;
	private video_colorspace cur_space;
	private video_range_type cur_range;
	private video_range_type force_range;
	private Object play_sys_ts;
	private Object next_pts_ns;
	private Object next_ns;
	private Object start_ts;
	private Object base_ts;
	private Object interrupt_poll_ts;
	private Object mutex;
	private Object sem;
	private Object stopping;
	private Object looping;
	private Object active;
	private Object reset;
	private Object kill;
	private Object thread_valid;
	private Object thread;
	
	public mp_media(Object fmt, Object v_preload_cb, Object stop_cb, Object v_cb, Object a_cb, Object opaque, Byte path, Byte format_name, int buffering, int speed, AVPixelFormat scale_format, SwsContext swscale, Object scale_linesizes, Object scale_pic, mp_decode v, mp_decode a, Object is_local_file, Object has_video, Object has_audio, Object is_file, Object eof, Object hw, obs_source_frame obsframe, video_colorspace cur_space, video_range_type cur_range, video_range_type force_range, Object play_sys_ts, Object next_pts_ns, Object next_ns, Object start_ts, Object base_ts, Object interrupt_poll_ts, Object mutex, Object sem, Object stopping, Object looping, Object active, Object reset, Object kill, Object thread_valid, Object thread) {
		setFmt(fmt);
		setV_preload_cb(v_preload_cb);
		setStop_cb(stop_cb);
		setV_cb(v_cb);
		setA_cb(a_cb);
		setOpaque(opaque);
		setPath(path);
		setFormat_name(format_name);
		setBuffering(buffering);
		setSpeed(speed);
		setScale_format(scale_format);
		setSwscale(swscale);
		setScale_linesizes(scale_linesizes);
		setScale_pic(scale_pic);
		setV(v);
		setA(a);
		setIs_local_file(is_local_file);
		setHas_video(has_video);
		setHas_audio(has_audio);
		setIs_file(is_file);
		setEof(eof);
		setHw(hw);
		setObsframe(obsframe);
		setCur_space(cur_space);
		setCur_range(cur_range);
		setForce_range(force_range);
		setPlay_sys_ts(play_sys_ts);
		setNext_pts_ns(next_pts_ns);
		setNext_ns(next_ns);
		setStart_ts(start_ts);
		setBase_ts(base_ts);
		setInterrupt_poll_ts(interrupt_poll_ts);
		setMutex(mutex);
		setSem(sem);
		setStopping(stopping);
		setLooping(looping);
		setActive(active);
		setReset(reset);
		setKill(kill);
		setThread_valid(thread_valid);
		setThread(thread);
	}
	public mp_media() {
	}
	
	public int mp_media_next_packet() {
		 new_pkt = new ();
		 pkt = new ();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/av_init_packet(pkt);
		new_pkt = pkt;
		Object generatedFmt = this.getFmt();
		int ret = /*Error: Function owner not recognized*/av_read_frame(generatedFmt, pkt);
		if (ret < 0) {
			if (ret != AVERROR_EOF) {
				ModernizedCProgram.blog(LOG_WARNING, "MP: av_read_frame failed: %s (%d)", /*Error: Function owner not recognized*/av_err2str(ret), ret);
			} 
			return ret;
		} 
		mp_decode mp_decode = new mp_decode();
		mp_decode d = mp_decode.get_packet_decoder(media, pkt);
		if (d && pkt.getSize()) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/av_packet_ref(new_pkt, pkt);
			d.mp_decode_push_packet(new_pkt);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/av_packet_unref(pkt);
		return ret;
	}
	public Object mp_media_ready_to_start() {
		Object generatedHas_audio = this.getHas_audio();
		mp_decode generatedA = this.getA();
		Object generatedEof = generatedA.getEof();
		Object generatedFrame_ready = generatedA.getFrame_ready();
		if (generatedHas_audio && !generatedEof && !generatedFrame_ready) {
			return false;
		} 
		Object generatedHas_video = this.getHas_video();
		if (generatedHas_video && !generatedEof && !generatedFrame_ready) {
			return false;
		} 
		return true;
	}
	public Object mp_media_init_scaling() {
		mp_decode generatedV = this.getV();
		Object generatedDecoder = generatedV.getDecoder();
		int space = ModernizedCProgram.get_sws_colorspace(generatedDecoder.getColorspace());
		int range = ModernizedCProgram.get_sws_range(generatedDecoder.getColor_range());
		int coeff = /*Error: Function owner not recognized*/sws_getCoefficients(space);
		AVPixelFormat generatedScale_format = this.getScale_format();
		this.setSwscale(/*Error: Function owner not recognized*/sws_getCachedContext(NULL, generatedDecoder.getWidth(), generatedDecoder.getHeight(), generatedDecoder.getPix_fmt(), generatedDecoder.getWidth(), generatedDecoder.getHeight(), generatedScale_format, SWS_FAST_BILINEAR, NULL, NULL, NULL));
		SwsContext generatedSwscale = this.getSwscale();
		if (!generatedSwscale) {
			ModernizedCProgram.blog(LOG_WARNING, "MP: Failed to initialize scaler");
			return false;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sws_setColorspaceDetails(generatedSwscale, coeff, range, coeff, range, 0, (1 << 16), (1 << 16));
		Object generatedScale_pic = this.getScale_pic();
		Object generatedScale_linesizes = this.getScale_linesizes();
		int ret = /*Error: Function owner not recognized*/av_image_alloc(generatedScale_pic, generatedScale_linesizes, generatedDecoder.getWidth(), generatedDecoder.getHeight(), generatedScale_format, 1);
		if (ret < 0) {
			ModernizedCProgram.blog(LOG_WARNING, "MP: Failed to create scale pic data");
			return false;
		} 
		return true;
	}
	public Object mp_media_prepare_frames() {
		Object generatedEof = this.getEof();
		Object generatedHas_video = this.getHas_video();
		mp_decode generatedV = this.getV();
		Object generatedHas_audio = this.getHas_audio();
		mp_decode generatedA = this.getA();
		while (!m.mp_media_ready_to_start()) {
			if (!generatedEof) {
				int ret = m.mp_media_next_packet();
				if (ret == AVERROR_EOF) {
					this.setEof(true);
				}  else if (ret < 0) {
					return false;
				} 
			} 
			if (generatedHas_video && !generatedV.mp_decode_frame()) {
				return false;
			} 
			if (generatedHas_audio && !generatedA.mp_decode_frame()) {
				return false;
			} 
		}
		Object generatedFrame_ready = generatedV.getFrame_ready();
		SwsContext generatedSwscale = this.getSwscale();
		Object generatedFrame = generatedV.getFrame();
		AVPixelFormat generatedScale_format = this.getScale_format();
		if (generatedHas_video && generatedFrame_ready && !generatedSwscale) {
			this.setScale_format(ModernizedCProgram.closest_format(generatedFrame.getFormat()));
			if (generatedScale_format != generatedFrame.getFormat()) {
				if (!m.mp_media_init_scaling()) {
					return false;
				} 
			} 
		} 
		return true;
	}
	public Object mp_media_get_next_min_pts() {
		 min_next_ns = -1024;
		Object generatedHas_video = this.getHas_video();
		mp_decode generatedV = this.getV();
		Object generatedFrame_ready = generatedV.getFrame_ready();
		Object generatedFrame_pts = generatedV.getFrame_pts();
		if (generatedHas_video && generatedFrame_ready) {
			if (generatedFrame_pts < min_next_ns) {
				min_next_ns = generatedFrame_pts;
			} 
		} 
		Object generatedHas_audio = this.getHas_audio();
		if (generatedHas_audio && generatedFrame_ready) {
			if (generatedFrame_pts < min_next_ns) {
				min_next_ns = generatedFrame_pts;
			} 
		} 
		return min_next_ns;
	}
	public Object mp_media_get_base_pts() {
		 base_ts = 0;
		Object generatedHas_video = this.getHas_video();
		mp_decode generatedV = this.getV();
		Object generatedNext_pts = generatedV.getNext_pts();
		if (generatedHas_video && generatedNext_pts > base_ts) {
			base_ts = generatedNext_pts;
		} 
		Object generatedHas_audio = this.getHas_audio();
		if (generatedHas_audio && generatedNext_pts > base_ts) {
			base_ts = generatedNext_pts;
		} 
		return base_ts;
	}
	public void mp_media_next_audio() {
		mp_decode generatedA = this.getA();
		mp_decode d = generatedA;
		obs_source_audio audio = new obs_source_audio(0);
		Object generatedFrame = d.getFrame();
		 f = generatedFrame;
		if (!ModernizedCProgram.mp_media_can_play_frame(m, d)) {
			return /*Error: Unsupported expression*/;
		} 
		d.setFrame_ready(false);
		Object generatedA_cb = this.getA_cb();
		if (!generatedA_cb) {
			return /*Error: Unsupported expression*/;
		} 
		Object generatedData = audio.getData();
		for ( i = 0;
		 i < MAX_AV_PLANES; i++) {
			generatedData[i] = generatedData[i];
		}
		int generatedSpeed = this.getSpeed();
		audio.setSamples_per_sec(f.getSample_rate() * generatedSpeed / 100);
		audio.setSpeakers(ModernizedCProgram.convert_speaker_layout(f.getChannels()));
		audio.setFormat(ModernizedCProgram.convert_sample_format(f.getFormat()));
		audio.setFrames(f.getNb_samples());
		Object generatedBase_ts = this.getBase_ts();
		Object generatedFrame_pts = d.getFrame_pts();
		Object generatedStart_ts = this.getStart_ts();
		Object generatedPlay_sys_ts = this.getPlay_sys_ts();
		audio.setTimestamp(generatedBase_ts + generatedFrame_pts - generatedStart_ts + generatedPlay_sys_ts - ModernizedCProgram.base_sys_ts);
		audio_format generatedFormat = audio.getFormat();
		if (generatedFormat == AUDIO_FORMAT_UNKNOWN) {
			return /*Error: Unsupported expression*/;
		} 
		Object generatedOpaque = this.getOpaque();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedOpaque, audio);
	}
	public void mp_media_next_video(Object preload) {
		mp_decode generatedV = this.getV();
		mp_decode d = generatedV;
		obs_source_frame generatedObsframe = this.getObsframe();
		obs_source_frame frame = generatedObsframe;
		video_format new_format;
		video_colorspace new_space;
		video_range_type new_range;
		Object generatedFrame = d.getFrame();
		 f = generatedFrame;
		Object generatedV_cb = this.getV_cb();
		Object generatedFrame_ready = d.getFrame_ready();
		if (!preload) {
			if (!ModernizedCProgram.mp_media_can_play_frame(m, d)) {
				return /*Error: Unsupported expression*/;
			} 
			d.setFrame_ready(false);
			if (!generatedV_cb) {
				return /*Error: Unsupported expression*/;
			} 
		}  else if (!generatedFrame_ready) {
			return /*Error: Unsupported expression*/;
		} 
		 flip = false;
		SwsContext generatedSwscale = this.getSwscale();
		Object generatedScale_pic = this.getScale_pic();
		Object generatedScale_linesizes = this.getScale_linesizes();
		Object generatedData = frame.getData();
		Object generatedLinesize = frame.getLinesize();
		if (generatedSwscale) {
			int ret = /*Error: Function owner not recognized*/sws_scale(generatedSwscale, ()f.getData(), f.getLinesize(), 0, f.getHeight(), generatedScale_pic, generatedScale_linesizes);
			if (ret < 0) {
				return /*Error: Unsupported expression*/;
			} 
			flip = generatedScale_linesizes[0] < 0 && generatedScale_linesizes[1] == 0;
			for ( i = 0;
			 i < 4; i++) {
				generatedData[i] = generatedScale_pic[i];
				generatedLinesize[i] = /*Error: Function owner not recognized*/abs(generatedScale_linesizes[i]);
			}
		} else {
				flip = generatedLinesize[0] < 0 && generatedLinesize[1] == 0;
				for ( i = 0;
				 i < MAX_AV_PLANES; i++) {
					generatedData[i] = generatedData[i];
					generatedLinesize[i] = /*Error: Function owner not recognized*/abs(generatedLinesize[i]);
				}
		} 
		if (flip) {
			generatedData[0] -= generatedLinesize[0] * (f.getHeight() - 1);
		} 
		AVPixelFormat generatedScale_format = this.getScale_format();
		video_format.new_format = ModernizedCProgram.convert_pixel_format(generatedScale_format);
		video_colorspace.new_space = ModernizedCProgram.convert_color_space(f.getColorspace());
		video_range_type generatedForce_range = this.getForce_range();
		video_range_type.new_range = generatedForce_range == VIDEO_RANGE_DEFAULT ? ModernizedCProgram.convert_color_range(f.getColor_range()) : generatedForce_range;
		video_format generatedFormat = frame.getFormat();
		video_colorspace generatedCur_space = this.getCur_space();
		video_range_type generatedCur_range = this.getCur_range();
		Object generatedColor_matrix = frame.getColor_matrix();
		Object generatedColor_range_min = frame.getColor_range_min();
		Object generatedColor_range_max = frame.getColor_range_max();
		if (video_format.new_format != generatedFormat || video_colorspace.new_space != generatedCur_space || video_range_type.new_range != generatedCur_range) {
			 success = new ();
			frame.setFormat(video_format.new_format);
			frame.setFull_range(video_range_type.new_range == VIDEO_RANGE_FULL);
			success = ModernizedCProgram.video_format_get_parameters(video_colorspace.new_space, video_range_type.new_range, generatedColor_matrix, generatedColor_range_min, generatedColor_range_max);
			frame.setFormat(video_format.new_format);
			this.setCur_space(video_colorspace.new_space);
			this.setCur_range(video_range_type.new_range);
			if (!success) {
				frame.setFormat(VIDEO_FORMAT_NONE);
				return /*Error: Unsupported expression*/;
			} 
		} 
		if (generatedFormat == VIDEO_FORMAT_NONE) {
			return /*Error: Unsupported expression*/;
		} 
		Object generatedBase_ts = this.getBase_ts();
		Object generatedFrame_pts = d.getFrame_pts();
		Object generatedStart_ts = this.getStart_ts();
		Object generatedPlay_sys_ts = this.getPlay_sys_ts();
		frame.setTimestamp(generatedBase_ts + generatedFrame_pts - generatedStart_ts + generatedPlay_sys_ts - ModernizedCProgram.base_sys_ts);
		frame.setWidth(f.getWidth());
		frame.setHeight(f.getHeight());
		frame.setFlip(flip);
		Object generatedIs_local_file = this.getIs_local_file();
		Object generatedGot_first_keyframe = d.getGot_first_keyframe();
		if (!generatedIs_local_file && !generatedGot_first_keyframe) {
			if (!f.getKey_frame()) {
				return /*Error: Unsupported expression*/;
			} 
			d.setGot_first_keyframe(true);
		} 
		Object generatedOpaque = this.getOpaque();
		if (preload) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedOpaque, frame);
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedOpaque, frame);
		} 
	}
	public void mp_media_calc_next_ns() {
		 min_next_ns = m.mp_media_get_next_min_pts();
		Object generatedNext_pts_ns = this.getNext_pts_ns();
		 delta = min_next_ns - generatedNext_pts_ns;
		if (delta < 0) {
			delta = 0;
		} 
		if (delta > -1024) {
			delta = 0;
		} 
		Object generatedNext_ns = this.getNext_ns();
		generatedNext_ns += delta;
		this.setNext_pts_ns(min_next_ns);
	}
	public Object mp_media_reset() {
		Object generatedFmt = this.getFmt();
		 stream = generatedFmt.getStreams()[0];
		 seek_pos = new ();
		int seek_flags;
		 stopping = new ();
		 active = new ();
		if (generatedFmt.getDuration() == AV_NOPTS_VALUE) {
			seek_pos = 0;
			seek_flags = AVSEEK_FLAG_FRAME;
		} else {
				seek_pos = generatedFmt.getStart_time();
				seek_flags = AVSEEK_FLAG_BACKWARD;
		} 
		 seek_target = seek_flags == AVSEEK_FLAG_BACKWARD ? /*Error: Function owner not recognized*/av_rescale_q(seek_pos, AV_TIME_BASE_Q, stream.getTime_base()) : seek_pos;
		Object generatedIs_local_file = this.getIs_local_file();
		if (generatedIs_local_file) {
			int ret = /*Error: Function owner not recognized*/av_seek_frame(generatedFmt, 0, seek_target, seek_flags);
			if (ret < 0) {
				ModernizedCProgram.blog(LOG_WARNING, "MP: Failed to seek: %s", /*Error: Function owner not recognized*/av_err2str(ret));
			} 
		} 
		Object generatedHas_video = this.getHas_video();
		mp_decode generatedV = this.getV();
		if (generatedHas_video && generatedIs_local_file) {
			generatedV.mp_decode_flush();
		} 
		Object generatedHas_audio = this.getHas_audio();
		mp_decode generatedA = this.getA();
		if (generatedHas_audio && generatedIs_local_file) {
			generatedA.mp_decode_flush();
		} 
		 next_ts = m.mp_media_get_base_pts();
		Object generatedNext_pts_ns = this.getNext_pts_ns();
		 offset = next_ts - generatedNext_pts_ns;
		this.setEof(false);
		Object generatedBase_ts = this.getBase_ts();
		generatedBase_ts += next_ts;
		Object generatedMutex = this.getMutex();
		ModernizedCProgram.pthread_mutex_lock(generatedMutex);
		Object generatedStopping = this.getStopping();
		stopping = generatedStopping;
		Object generatedActive = this.getActive();
		active = generatedActive;
		this.setStopping(false);
		ModernizedCProgram.pthread_mutex_unlock(generatedMutex);
		if (!m.mp_media_prepare_frames()) {
			return false;
		} 
		Object generatedPlay_sys_ts = this.getPlay_sys_ts();
		Object generatedNext_ns = this.getNext_ns();
		if (active) {
			if (!generatedPlay_sys_ts) {
				this.setPlay_sys_ts(()ModernizedCProgram.os_gettime_ns());
			} 
			this.setStart_ts(this.setNext_pts_ns(m.mp_media_get_next_min_pts()));
			if (generatedNext_ns) {
				generatedNext_ns += offset;
			} 
		} else {
				this.setStart_ts(this.setNext_pts_ns(m.mp_media_get_next_min_pts()));
				this.setPlay_sys_ts(()ModernizedCProgram.os_gettime_ns());
				this.setNext_ns(0);
		} 
		Object generatedV_preload_cb = this.getV_preload_cb();
		if (!active && generatedIs_local_file && generatedV_preload_cb) {
			m.mp_media_next_video(true);
		} 
		Object generatedStop_cb = this.getStop_cb();
		Object generatedOpaque = this.getOpaque();
		if (stopping && generatedStop_cb) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedOpaque);
		} 
		return true;
	}
	public Object mp_media_sleepto() {
		 timeout = false;
		Object generatedNext_ns = this.getNext_ns();
		if (!generatedNext_ns) {
			this.setNext_ns(ModernizedCProgram.os_gettime_ns());
		} else {
				 t = ModernizedCProgram.os_gettime_ns();
				 timeout_ns = 200000000;
				if (generatedNext_ns > t && (generatedNext_ns - t) > timeout_ns) {
					ModernizedCProgram.os_sleepto_ns(t + timeout_ns);
					timeout = true;
				} else {
						ModernizedCProgram.os_sleepto_ns(generatedNext_ns);
				} 
		} 
		return timeout;
	}
	public Object mp_media_eof() {
		Object generatedHas_video = this.getHas_video();
		mp_decode generatedV = this.getV();
		Object generatedFrame_ready = generatedV.getFrame_ready();
		 v_ended = !generatedHas_video || !generatedFrame_ready;
		Object generatedHas_audio = this.getHas_audio();
		 a_ended = !generatedHas_audio || !generatedFrame_ready;
		 eof = v_ended && a_ended;
		Object generatedMutex = this.getMutex();
		Object generatedLooping = this.getLooping();
		if (eof) {
			 looping = new ();
			ModernizedCProgram.pthread_mutex_lock(generatedMutex);
			looping = generatedLooping;
			if (!looping) {
				this.setActive(false);
				this.setStopping(true);
			} 
			ModernizedCProgram.pthread_mutex_unlock(generatedMutex);
			m.mp_media_reset();
		} 
		return eof;
	}
	public Object init_avformat() {
		 format = NULL;
		Byte generatedFormat_name = this.getFormat_name();
		Byte generatedPath = this.getPath();
		if (generatedFormat_name && generatedFormat_name) {
			format = /*Error: Function owner not recognized*/av_find_input_format(generatedFormat_name);
			if (!format) {
				ModernizedCProgram.blog(LOG_INFO, "MP: Unable to find input format for '%s'", generatedPath);
			} 
		} 
		 opts = NULL;
		int generatedBuffering = this.getBuffering();
		Object generatedIs_local_file = this.getIs_local_file();
		if (generatedBuffering && !generatedIs_local_file) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/av_dict_set_int(opts, "buffer_size", generatedBuffering, 0);
		} 
		this.setFmt(/*Error: Function owner not recognized*/avformat_alloc_context());
		Object generatedFmt = this.getFmt();
		generatedFmt.getInterrupt_callback().setCallback(interrupt_callback);
		generatedFmt.getInterrupt_callback().setOpaque(m);
		int ret = /*Error: Function owner not recognized*/avformat_open_input(generatedFmt, generatedPath, format, opts ? opts : NULL);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/av_dict_free(opts);
		if (ret < 0) {
			ModernizedCProgram.blog(LOG_WARNING, "MP: Failed to open media: '%s'", generatedPath);
			return false;
		} 
		if (/*Error: Function owner not recognized*/avformat_find_stream_info(generatedFmt, NULL) < 0) {
			ModernizedCProgram.blog(LOG_WARNING, "MP: Failed to find stream info for '%s'", generatedPath);
			return false;
		} 
		Object generatedHw = this.getHw();
		this.setHas_video(m.mp_decode_init(AVMEDIA_TYPE_VIDEO, generatedHw));
		this.setHas_audio(m.mp_decode_init(AVMEDIA_TYPE_AUDIO, generatedHw));
		Object generatedHas_video = this.getHas_video();
		Object generatedHas_audio = this.getHas_audio();
		if (!generatedHas_video && !generatedHas_audio) {
			ModernizedCProgram.blog(LOG_WARNING, "MP: Could not initialize audio or video: '%s'", generatedPath);
			return false;
		} 
		return true;
	}
	public Object mp_media_thread() {
		ModernizedCProgram.os_set_thread_name("mp_media_thread");
		if (!m.init_avformat()) {
			return false;
		} 
		if (!m.mp_media_reset()) {
			return false;
		} 
		Object generatedMutex = this.getMutex();
		Object generatedActive = this.getActive();
		Object generatedSem = this.getSem();
		Object generatedReset = this.getReset();
		Object generatedKill = this.getKill();
		Object generatedHas_video = this.getHas_video();
		Object generatedHas_audio = this.getHas_audio();
		for (; /*Error: Unsupported expression*/; /*Error: Unsupported expression*/) {
			 reset = new ();
			 kill = new ();
			 is_active = new ();
			 timeout = false;
			ModernizedCProgram.pthread_mutex_lock(generatedMutex);
			is_active = generatedActive;
			ModernizedCProgram.pthread_mutex_unlock(generatedMutex);
			if (!is_active) {
				if (generatedSem.os_sem_wait() < 0) {
					return false;
				} 
			} else {
					ModernizedCProgram.timeout = m.mp_media_sleepto();
			} 
			ModernizedCProgram.pthread_mutex_lock(generatedMutex);
			reset = generatedReset;
			kill = generatedKill;
			this.setReset(false);
			this.setKill(false);
			ModernizedCProgram.pthread_mutex_unlock(generatedMutex);
			if (kill) {
				break;
			} 
			if (reset) {
				m.mp_media_reset();
				continue;
			} 
			if (is_active && !/* frames are ready */ModernizedCProgram.timeout) {
				if (generatedHas_video) {
					m.mp_media_next_video(false);
				} 
				if (generatedHas_audio) {
					m.mp_media_next_audio();
				} 
				if (!m.mp_media_prepare_frames()) {
					return false;
				} 
				if (m.mp_media_eof()) {
					continue;
				} 
				m.mp_media_calc_next_ns();
			} 
		}
		return true;
	}
	public Object mp_media_init_internal(Object info) {
		Object generatedMutex = this.getMutex();
		if (ModernizedCProgram.pthread_mutex_init(generatedMutex, NULL) != 0) {
			ModernizedCProgram.blog(LOG_WARNING, "MP: Failed to init mutex");
			return false;
		} 
		Object generatedSem = this.getSem();
		if (generatedSem.os_sem_init(0) != 0) {
			ModernizedCProgram.blog(LOG_WARNING, "MP: Failed to init semaphore");
			return false;
		} 
		this.setPath(info.getPath() ? ModernizedCProgram.bstrdup(info.getPath()) : NULL);
		this.setFormat_name(info.getFormat() ? ModernizedCProgram.bstrdup(info.getFormat()) : NULL);
		this.setHw(info.getHardware_decoding());
		Object generatedThread = this.getThread();
		if (ModernizedCProgram.pthread_create(generatedThread, NULL, mp_media_thread_start, m) != 0) {
			ModernizedCProgram.blog(LOG_WARNING, "MP: Could not create media thread");
			return false;
		} 
		this.setThread_valid(true);
		return true;
	}
	public Object mp_media_init(Object info) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(media, 0, /*Error: sizeof expression not supported yet*/);
		Object generatedMutex = this.getMutex();
		ModernizedCProgram.pthread_mutex_init_value(generatedMutex);
		this.setOpaque(info.getOpaque());
		this.setV_cb(info.getV_cb());
		this.setA_cb(info.getA_cb());
		this.setStop_cb(info.getStop_cb());
		this.setV_preload_cb(info.getV_preload_cb());
		this.setForce_range(info.getForce_range());
		this.setBuffering(info.getBuffering());
		this.setSpeed(info.getSpeed());
		this.setIs_local_file(info.getIs_local_file());
		int generatedSpeed = this.getSpeed();
		if (!info.getIs_local_file() || generatedSpeed < 1 || generatedSpeed > 200) {
			this.setSpeed(100);
		} 
		 initialized = false;
		if (!initialized) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/avdevice_register_all();
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/avformat_network_init();
			initialized = true;
		} 
		if (!ModernizedCProgram.base_sys_ts) {
			ModernizedCProgram.base_sys_ts = ()ModernizedCProgram.os_gettime_ns();
		} 
		if (!media.mp_media_init_internal(info)) {
			media.mp_media_free();
			return false;
		} 
		return true;
	}
	public void mp_kill_thread() {
		Object generatedThread_valid = this.getThread_valid();
		Object generatedMutex = this.getMutex();
		Object generatedSem = this.getSem();
		Object generatedThread = this.getThread();
		if (generatedThread_valid) {
			ModernizedCProgram.pthread_mutex_lock(generatedMutex);
			this.setKill(true);
			ModernizedCProgram.pthread_mutex_unlock(generatedMutex);
			generatedSem.os_sem_post();
			ModernizedCProgram.pthread_join(generatedThread, NULL);
		} 
	}
	public void mp_media_free() {
		if (!media) {
			return /*Error: Unsupported expression*/;
		} 
		media.mp_media_stop();
		media.mp_kill_thread();
		mp_decode generatedV = this.getV();
		generatedV.mp_decode_free();
		mp_decode generatedA = this.getA();
		generatedA.mp_decode_free();
		Object generatedFmt = this.getFmt();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/avformat_close_input(generatedFmt);
		Object generatedMutex = this.getMutex();
		ModernizedCProgram.pthread_mutex_destroy(generatedMutex);
		Object generatedSem = this.getSem();
		generatedSem.os_sem_destroy();
		SwsContext generatedSwscale = this.getSwscale();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sws_freeContext(generatedSwscale);
		Object generatedScale_pic = this.getScale_pic();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/av_freep(generatedScale_pic[0]);
		Byte generatedPath = this.getPath();
		ModernizedCProgram.bfree(generatedPath);
		Byte generatedFormat_name = this.getFormat_name();
		ModernizedCProgram.bfree(generatedFormat_name);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(media, 0, /*Error: sizeof expression not supported yet*/);
		ModernizedCProgram.pthread_mutex_init_value(generatedMutex);
	}
	public void mp_media_play(Object loop) {
		Object generatedMutex = this.getMutex();
		ModernizedCProgram.pthread_mutex_lock(generatedMutex);
		Object generatedActive = this.getActive();
		if (generatedActive) {
			this.setReset(true);
		} 
		this.setLooping(loop);
		this.setActive(true);
		ModernizedCProgram.pthread_mutex_unlock(generatedMutex);
		Object generatedSem = this.getSem();
		generatedSem.os_sem_post();
	}
	public void mp_media_stop() {
		Object generatedMutex = this.getMutex();
		ModernizedCProgram.pthread_mutex_lock(generatedMutex);
		Object generatedActive = this.getActive();
		Object generatedSem = this.getSem();
		if (generatedActive) {
			this.setReset(true);
			this.setActive(false);
			this.setStopping(true);
			generatedSem.os_sem_post();
		} 
		ModernizedCProgram.pthread_mutex_unlock(generatedMutex);
	}
	public Object mp_decode_init(Object type, Object hw) {
		mp_decode generatedV = this.getV();
		mp_decode generatedA = this.getA();
		mp_decode d = type == AVMEDIA_TYPE_VIDEO ? generatedV : generatedA;
		AVCodecID id;
		 stream = new ();
		int ret;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(d, 0, /*Error: sizeof expression not supported yet*/);
		d.setM(m);
		d.setAudio(type == AVMEDIA_TYPE_AUDIO);
		Object generatedFmt = this.getFmt();
		ret = /*Error: Function owner not recognized*/av_find_best_stream(generatedFmt, type, -1, -1, NULL, 0);
		if (ret < 0) {
			return false;
		} 
		stream = d.setStream(generatedFmt.getStreams()[ret]);
		AVCodecID.id = stream.getCodecpar().getCodec_id();
		if (AVCodecID.id == AV_CODEC_ID_VP8 || AVCodecID.id == AV_CODEC_ID_VP9) {
			 tag = NULL;
			tag = /*Error: Function owner not recognized*/av_dict_get(stream.getMetadata(), "alpha_mode", tag, AV_DICT_IGNORE_SUFFIX);
			if (tag && /*Error: Function owner not recognized*/strcmp(tag.getValue(), "1") == 0) {
				byte codec = (AVCodecID.id == AV_CODEC_ID_VP8) ? "libvpx" : "libvpx-vp9";
				d.setCodec(/*Error: Function owner not recognized*/avcodec_find_decoder_by_name(codec));
			} 
		} 
		Object generatedCodec = d.getCodec();
		if (!generatedCodec) {
			d.setCodec(/*Error: Function owner not recognized*/avcodec_find_decoder(AVCodecID.id));
		} 
		if (!generatedCodec) {
			ModernizedCProgram.blog(LOG_WARNING, "MP: Failed to find %s codec", /*Error: Function owner not recognized*/av_get_media_type_string(type));
			return false;
		} 
		ret = d.mp_open_codec(hw);
		if (ret < 0) {
			ModernizedCProgram.blog(LOG_WARNING, "MP: Failed to open %s decoder: %s", /*Error: Function owner not recognized*/av_get_media_type_string(type), /*Error: Function owner not recognized*/av_err2str(ret));
			return false;
		} 
		d.setSw_frame(/*Error: Function owner not recognized*/av_frame_alloc());
		Object generatedSw_frame = d.getSw_frame();
		if (!generatedSw_frame) {
			ModernizedCProgram.blog(LOG_WARNING, "MP: Failed to allocate %s frame", /*Error: Function owner not recognized*/av_get_media_type_string(type));
			return false;
		} 
		Object generatedHw = d.getHw();
		Object generatedHw_frame = d.getHw_frame();
		if (generatedHw) {
			d.setHw_frame(/*Error: Function owner not recognized*/av_frame_alloc());
			if (!generatedHw_frame) {
				ModernizedCProgram.blog(LOG_WARNING, "MP: Failed to allocate %s hw frame", /*Error: Function owner not recognized*/av_get_media_type_string(type));
				return false;
			} 
			d.setIn_frame(generatedHw_frame);
		} else {
				d.setIn_frame(generatedSw_frame);
		} 
		Object generatedDecoder = d.getDecoder();
		if (generatedCodec.getCapabilities() & CODEC_CAP_TRUNCATED) {
			generatedDecoder.getFlags() |=  CODEC_FLAG_TRUNCATED;
		} 
		return true;
	}
	public Object getFmt() {
		return fmt;
	}
	public void setFmt(Object newFmt) {
		fmt = newFmt;
	}
	public Object getV_preload_cb() {
		return v_preload_cb;
	}
	public void setV_preload_cb(Object newV_preload_cb) {
		v_preload_cb = newV_preload_cb;
	}
	public Object getStop_cb() {
		return stop_cb;
	}
	public void setStop_cb(Object newStop_cb) {
		stop_cb = newStop_cb;
	}
	public Object getV_cb() {
		return v_cb;
	}
	public void setV_cb(Object newV_cb) {
		v_cb = newV_cb;
	}
	public Object getA_cb() {
		return a_cb;
	}
	public void setA_cb(Object newA_cb) {
		a_cb = newA_cb;
	}
	public Object getOpaque() {
		return opaque;
	}
	public void setOpaque(Object newOpaque) {
		opaque = newOpaque;
	}
	public Byte getPath() {
		return path;
	}
	public void setPath(Byte newPath) {
		path = newPath;
	}
	public Byte getFormat_name() {
		return format_name;
	}
	public void setFormat_name(Byte newFormat_name) {
		format_name = newFormat_name;
	}
	public int getBuffering() {
		return buffering;
	}
	public void setBuffering(int newBuffering) {
		buffering = newBuffering;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int newSpeed) {
		speed = newSpeed;
	}
	public AVPixelFormat getScale_format() {
		return scale_format;
	}
	public void setScale_format(AVPixelFormat newScale_format) {
		scale_format = newScale_format;
	}
	public SwsContext getSwscale() {
		return swscale;
	}
	public void setSwscale(SwsContext newSwscale) {
		swscale = newSwscale;
	}
	public Object getScale_linesizes() {
		return scale_linesizes;
	}
	public void setScale_linesizes(Object newScale_linesizes) {
		scale_linesizes = newScale_linesizes;
	}
	public Object getScale_pic() {
		return scale_pic;
	}
	public void setScale_pic(Object newScale_pic) {
		scale_pic = newScale_pic;
	}
	public mp_decode getV() {
		return v;
	}
	public void setV(mp_decode newV) {
		v = newV;
	}
	public mp_decode getA() {
		return a;
	}
	public void setA(mp_decode newA) {
		a = newA;
	}
	public Object getIs_local_file() {
		return is_local_file;
	}
	public void setIs_local_file(Object newIs_local_file) {
		is_local_file = newIs_local_file;
	}
	public Object getHas_video() {
		return has_video;
	}
	public void setHas_video(Object newHas_video) {
		has_video = newHas_video;
	}
	public Object getHas_audio() {
		return has_audio;
	}
	public void setHas_audio(Object newHas_audio) {
		has_audio = newHas_audio;
	}
	public Object getIs_file() {
		return is_file;
	}
	public void setIs_file(Object newIs_file) {
		is_file = newIs_file;
	}
	public Object getEof() {
		return eof;
	}
	public void setEof(Object newEof) {
		eof = newEof;
	}
	public Object getHw() {
		return hw;
	}
	public void setHw(Object newHw) {
		hw = newHw;
	}
	public obs_source_frame getObsframe() {
		return obsframe;
	}
	public void setObsframe(obs_source_frame newObsframe) {
		obsframe = newObsframe;
	}
	public video_colorspace getCur_space() {
		return cur_space;
	}
	public void setCur_space(video_colorspace newCur_space) {
		cur_space = newCur_space;
	}
	public video_range_type getCur_range() {
		return cur_range;
	}
	public void setCur_range(video_range_type newCur_range) {
		cur_range = newCur_range;
	}
	public video_range_type getForce_range() {
		return force_range;
	}
	public void setForce_range(video_range_type newForce_range) {
		force_range = newForce_range;
	}
	public Object getPlay_sys_ts() {
		return play_sys_ts;
	}
	public void setPlay_sys_ts(Object newPlay_sys_ts) {
		play_sys_ts = newPlay_sys_ts;
	}
	public Object getNext_pts_ns() {
		return next_pts_ns;
	}
	public void setNext_pts_ns(Object newNext_pts_ns) {
		next_pts_ns = newNext_pts_ns;
	}
	public Object getNext_ns() {
		return next_ns;
	}
	public void setNext_ns(Object newNext_ns) {
		next_ns = newNext_ns;
	}
	public Object getStart_ts() {
		return start_ts;
	}
	public void setStart_ts(Object newStart_ts) {
		start_ts = newStart_ts;
	}
	public Object getBase_ts() {
		return base_ts;
	}
	public void setBase_ts(Object newBase_ts) {
		base_ts = newBase_ts;
	}
	public Object getInterrupt_poll_ts() {
		return interrupt_poll_ts;
	}
	public void setInterrupt_poll_ts(Object newInterrupt_poll_ts) {
		interrupt_poll_ts = newInterrupt_poll_ts;
	}
	public Object getMutex() {
		return mutex;
	}
	public void setMutex(Object newMutex) {
		mutex = newMutex;
	}
	public Object getSem() {
		return sem;
	}
	public void setSem(Object newSem) {
		sem = newSem;
	}
	public Object getStopping() {
		return stopping;
	}
	public void setStopping(Object newStopping) {
		stopping = newStopping;
	}
	public Object getLooping() {
		return looping;
	}
	public void setLooping(Object newLooping) {
		looping = newLooping;
	}
	public Object getActive() {
		return active;
	}
	public void setActive(Object newActive) {
		active = newActive;
	}
	public Object getReset() {
		return reset;
	}
	public void setReset(Object newReset) {
		reset = newReset;
	}
	public Object getKill() {
		return kill;
	}
	public void setKill(Object newKill) {
		kill = newKill;
	}
	public Object getThread_valid() {
		return thread_valid;
	}
	public void setThread_valid(Object newThread_valid) {
		thread_valid = newThread_valid;
	}
	public Object getThread() {
		return thread;
	}
	public void setThread(Object newThread) {
		thread = newThread;
	}
}

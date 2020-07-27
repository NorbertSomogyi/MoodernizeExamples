package application;

public class ff_demuxer {
	private Object io_context;
	private Object format_context;
	private ff_clock clock;
	private ff_demuxer_options options;
	private ff_decoder audio_decoder;
	private ff_callbacks audio_callbacks;
	private ff_decoder video_decoder;
	private ff_callbacks video_callbacks;
	private Object demuxer_thread;
	private Object seek_pos;
	private boolean seek_request;
	private int seek_flags;
	private boolean seek_flush;
	private boolean abort;
	private Byte input;
	private Byte input_format;
	
	public ff_demuxer(Object io_context, Object format_context, ff_clock clock, ff_demuxer_options options, ff_decoder audio_decoder, ff_callbacks audio_callbacks, ff_decoder video_decoder, ff_callbacks video_callbacks, Object demuxer_thread, Object seek_pos, boolean seek_request, int seek_flags, boolean seek_flush, boolean abort, Byte input, Byte input_format) {
		setIo_context(io_context);
		setFormat_context(format_context);
		setClock(clock);
		setOptions(options);
		setAudio_decoder(audio_decoder);
		setAudio_callbacks(audio_callbacks);
		setVideo_decoder(video_decoder);
		setVideo_callbacks(video_callbacks);
		setDemuxer_thread(demuxer_thread);
		setSeek_pos(seek_pos);
		setSeek_request(seek_request);
		setSeek_flags(seek_flags);
		setSeek_flush(seek_flush);
		setAbort(abort);
		setInput(input);
		setInput_format(input_format);
	}
	public ff_demuxer() {
	}
	
	public ff_demuxer ff_demuxer_init() {
		ff_demuxer demuxer = new ff_demuxer();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/av_register_all();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/avdevice_register_all();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/avfilter_register_all();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/avformat_network_init();
		demuxer = /*Error: Function owner not recognized*/av_mallocz(/*Error: Unsupported expression*/);
		if (demuxer == ((Object)0)) {
			return ((Object)0);
		} 
		ff_clock generatedClock = demuxer.getClock();
		generatedClock.setSync_type(ff_av_sync_type.AV_SYNC_VIDEO_MASTER);
		ff_demuxer_options generatedOptions = demuxer.getOptions();
		generatedOptions.setFrame_drop(AVDISCARD_DEFAULT);
		generatedOptions.setAudio_frame_queue_size(1);
		generatedOptions.setVideo_frame_queue_size(1);
		generatedOptions.setAudio_packet_queue_size((5 * 16 * 1024));
		generatedOptions.setVideo_packet_queue_size((5 * 256 * 1024));
		generatedOptions.setIs_hw_decoding(0);
		return demuxer;
	}
	public boolean ff_demuxer_open(Byte input, Byte input_format) {
		int ret;
		this.setInput(/*Error: Function owner not recognized*/av_strdup(input));
		if (input_format != ((Object)0)) {
			this.setInput_format(/*Error: Function owner not recognized*/av_strdup(input_format));
		} 
		Object generatedDemuxer_thread = this.getDemuxer_thread();
		ret = ModernizedCProgram.pthread_create(generatedDemuxer_thread, ((Object)0), ModernizedCProgram.demux_thread, demuxer);
		return ret == 0;
	}
	public void ff_demuxer_free() {
		Object demuxer_thread_result;
		this.setAbort(1);
		Object generatedDemuxer_thread = this.getDemuxer_thread();
		ModernizedCProgram.pthread_join(generatedDemuxer_thread, demuxer_thread_result);
		Byte generatedInput = this.getInput();
		if (generatedInput != ((Object)0)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/av_free(generatedInput);
		} 
		Byte generatedInput_format = this.getInput_format();
		if (generatedInput_format != ((Object)0)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/av_free(generatedInput_format);
		} 
		ff_decoder generatedAudio_decoder = this.getAudio_decoder();
		if (generatedAudio_decoder != ((Object)0)) {
			generatedAudio_decoder.ff_decoder_free();
		} 
		ff_decoder generatedVideo_decoder = this.getVideo_decoder();
		if (generatedVideo_decoder != ((Object)0)) {
			generatedVideo_decoder.ff_decoder_free();
		} 
		Object generatedFormat_context = this.getFormat_context();
		if (generatedFormat_context) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/avformat_close_input(generatedFormat_context);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/av_free(demuxer);
	}
	public boolean set_clock_sync_type() {
		ff_decoder generatedVideo_decoder = this.getVideo_decoder();
		ff_clock generatedClock = this.getClock();
		ff_av_sync_type generatedSync_type = generatedClock.getSync_type();
		if (generatedVideo_decoder == ((Object)0)) {
			if (generatedSync_type == ff_av_sync_type.AV_SYNC_VIDEO_MASTER) {
				generatedClock.setSync_type(ff_av_sync_type.AV_SYNC_AUDIO_MASTER);
			} 
		} 
		ff_decoder generatedAudio_decoder = this.getAudio_decoder();
		if (generatedAudio_decoder == ((Object)0)) {
			if (generatedSync_type == ff_av_sync_type.AV_SYNC_AUDIO_MASTER) {
				generatedClock.setSync_type(ff_av_sync_type.AV_SYNC_VIDEO_MASTER);
			} 
		} 
		switch (generatedSync_type) {
		case ff_av_sync_type.AV_SYNC_EXTERNAL_MASTER:
				generatedClock.setSync_clock(ff_external_clock);
				generatedClock.setOpaque(((Object)0));
				break;
		case ff_av_sync_type.AV_SYNC_AUDIO_MASTER:
				generatedClock.setSync_clock(ModernizedCProgram.ff_decoder_clock);
				generatedClock.setOpaque(generatedAudio_decoder);
				break;
		case ff_av_sync_type.AV_SYNC_VIDEO_MASTER:
				generatedClock.setSync_clock(ModernizedCProgram.ff_decoder_clock);
				generatedClock.setOpaque(generatedVideo_decoder);
				break;
		default:
				return 0;
		}
		return 1;
	}
	public boolean initialize_decoder(Object codec_context, Object stream, boolean hwaccel_decoder) {
		ff_demuxer_options generatedOptions = this.getOptions();
		int generatedAudio_packet_queue_size = generatedOptions.getAudio_packet_queue_size();
		int generatedAudio_frame_queue_size = generatedOptions.getAudio_frame_queue_size();
		ff_decoder ff_decoder = new ff_decoder();
		ff_decoder generatedAudio_decoder = this.getAudio_decoder();
		AVDiscard generatedFrame_drop = generatedOptions.getFrame_drop();
		ff_callbacks generatedAudio_callbacks = this.getAudio_callbacks();
		int generatedVideo_packet_queue_size = generatedOptions.getVideo_packet_queue_size();
		int generatedVideo_frame_queue_size = generatedOptions.getVideo_frame_queue_size();
		ff_decoder generatedVideo_decoder = this.getVideo_decoder();
		ff_callbacks generatedVideo_callbacks = this.getVideo_callbacks();
		switch (codec_context.getCodec_type()) {
		case AVMEDIA_TYPE_VIDEO:
				this.setVideo_decoder(ff_decoder.ff_decoder_init(codec_context, stream, generatedVideo_packet_queue_size, generatedVideo_frame_queue_size));
				generatedVideo_decoder.setHwaccel_decoder(hwaccel_decoder);
				generatedVideo_decoder.setFrame_drop(generatedFrame_drop);
				generatedVideo_decoder.setNatural_sync_clock(ff_av_sync_type.AV_SYNC_VIDEO_MASTER);
				generatedVideo_decoder.setCallbacks(generatedVideo_callbacks);
				if (!generatedVideo_callbacks.ff_callbacks_format(codec_context)) {
					generatedVideo_decoder.ff_decoder_free();
					this.setVideo_decoder(((Object)0));
					return 0;
				} 
				return 1;
		case AVMEDIA_TYPE_AUDIO:
				this.setAudio_decoder(ff_decoder.ff_decoder_init(codec_context, stream, generatedAudio_packet_queue_size, generatedAudio_frame_queue_size));
				generatedAudio_decoder.setHwaccel_decoder(hwaccel_decoder);
				generatedAudio_decoder.setFrame_drop(generatedFrame_drop);
				generatedAudio_decoder.setNatural_sync_clock(ff_av_sync_type.AV_SYNC_AUDIO_MASTER);
				generatedAudio_decoder.setCallbacks(generatedAudio_callbacks);
				if (!generatedAudio_callbacks.ff_callbacks_format(codec_context)) {
					generatedAudio_decoder.ff_decoder_free();
					this.setAudio_decoder(((Object)0));
					return 0;
				} 
				this.setAudio_decoder(generatedAudio_decoder);
				return 1;
		default:
				return 0;
		}
	}
	public boolean find_decoder(Object stream) {
		 codec_context = ((Object)0);
		 codec = ((Object)0);
		 options_dict = ((Object)0);
		int ret;
		boolean hwaccel_decoder = false;
		codec_context = stream.getCodec()// enable reference counted frames since we may have a buffer size;// enable reference counted frames since we may have a buffer size
		// > 1// > 1codec_context.setRefcounted_frames(1);
		// png/tiff decoders have serious issues with multiple threadsif (codec_context.getCodec_id() == AV_CODEC_ID_PNG || codec_context.getCodec_id() == AV_CODEC_ID_TIFF || codec_context.getCodec_id() == AV_CODEC_ID_JPEG2000 || codec_context.getCodec_id() == AV_CODEC_ID_WEBP) {
			codec_context.setThread_count(1);
		} 
		ff_demuxer_options generatedOptions = this.getOptions();
		boolean generatedIs_hw_decoding = generatedOptions.getIs_hw_decoding();
		if (generatedIs_hw_decoding) {
			 hwaccel = ModernizedCProgram.find_hwaccel_codec(codec_context);
			if (hwaccel) {
				 codec_vda = /*Error: Function owner not recognized*/avcodec_find_decoder_by_name(hwaccel.getName());
				if (codec_vda != ((Object)0)) {
					AVGetFormatCb original_get_format = codec_context.getGet_format();
					codec_context.setGet_format(get_hwaccel_format);
					codec_context.setOpaque(hwaccel);
					ret = /*Error: Function owner not recognized*/avcodec_open2(codec_context, codec_vda, options_dict);
					if (ret < 0) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/av_log(((Object)0), AV_LOG_WARNING, "no hardware decoder found for codec with id %d", codec_context.getCodec_id());
						codec_context.setGet_format(original_get_format);
						codec_context.setOpaque(((Object)0));
					} else {
							codec = codec_vda;
							hwaccel_decoder = true;
					} 
				} 
			} 
		} 
		if (codec == ((Object)0)) {
			if (codec_context.getCodec_id() == AV_CODEC_ID_VP8) {
				codec = /*Error: Function owner not recognized*/avcodec_find_decoder_by_name("libvpx");
			}  else if (codec_context.getCodec_id() == AV_CODEC_ID_VP9) {
				codec = /*Error: Function owner not recognized*/avcodec_find_decoder_by_name("libvpx-vp9");
			} 
			if (!codec) {
				codec = /*Error: Function owner not recognized*/avcodec_find_decoder(codec_context.getCodec_id());
			} 
			if (codec == ((Object)0)) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/av_log(((Object)0), AV_LOG_WARNING, "no decoder found for codec with id %d", codec_context.getCodec_id());
				return 0;
			} 
			if (/*Error: Function owner not recognized*/avcodec_open2(codec_context, codec, options_dict) < 0) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/av_log(((Object)0), AV_LOG_WARNING, "unable to open decoder with codec id %d", codec_context.getCodec_id());
				return 0;
			} 
		} 
		return demuxer.initialize_decoder(codec_context, stream, hwaccel_decoder);
	}
	public void ff_demuxer_flush() {
		ff_decoder generatedVideo_decoder = this.getVideo_decoder();
		Object generatedStream = generatedVideo_decoder.getStream();
		ff_packet_queue generatedPacket_queue = generatedVideo_decoder.getPacket_queue();
		if (generatedVideo_decoder != ((Object)0) && generatedStream != ((Object)0)) {
			generatedPacket_queue.packet_queue_flush();
			generatedPacket_queue.packet_queue_put_flush_packet();
		} 
		ff_decoder generatedAudio_decoder = this.getAudio_decoder();
		if (generatedAudio_decoder != ((Object)0) && generatedStream != ((Object)0)) {
			generatedPacket_queue.packet_queue_flush();
			generatedPacket_queue.packet_queue_put_flush_packet();
		} 
	}
	public void ff_demuxer_reset() {
		ff_packet packet = new ff_packet(0);
		ff_clock ff_clock = new ff_clock();
		ff_clock clock = ff_clock.ff_clock_init();
		ff_clock generatedClock = this.getClock();
		ff_av_sync_type generatedSync_type = generatedClock.getSync_type();
		clock.setSync_type(generatedSync_type);
		Object generatedSync_clock = generatedClock.getSync_clock();
		clock.setSync_clock(generatedSync_clock);
		Object generatedOpaque = generatedClock.getOpaque();
		clock.setOpaque(generatedOpaque);
		packet.setClock(clock);
		ff_decoder generatedAudio_decoder = this.getAudio_decoder();
		ff_packet_queue generatedPacket_queue = generatedAudio_decoder.getPacket_queue();
		if (generatedAudio_decoder != ((Object)0)) {
			clock.ff_clock_retain();
			ModernizedCProgram.packet_queue_put(generatedPacket_queue, packet);
		} 
		ff_decoder generatedVideo_decoder = this.getVideo_decoder();
		if (generatedVideo_decoder != ((Object)0)) {
			clock.ff_clock_retain();
			ModernizedCProgram.packet_queue_put(generatedPacket_queue, packet);
		} 
	}
	public boolean open_input(Object format_context) {
		 input_format = ((Object)0);
		 interrupted_callback = new ();
		interrupted_callback.setCallback(demuxer_interrupted_callback);
		interrupted_callback.setOpaque(demuxer);
		format_context = /*Error: Function owner not recognized*/avformat_alloc_context();
		(format_context).setInterrupt_callback(interrupted_callback);
		Byte generatedInput_format = this.getInput_format();
		if (generatedInput_format != ((Object)0)) {
			input_format = /*Error: Function owner not recognized*/av_find_input_format(generatedInput_format);
			if (input_format == ((Object)0)) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/av_log(((Object)0), AV_LOG_WARNING, "unable to find input format %s", generatedInput_format);
			} 
		} 
		Byte generatedInput = this.getInput();
		ff_demuxer_options generatedOptions = this.getOptions();
		Object generatedCustom_options = generatedOptions.getCustom_options();
		if (/*Error: Function owner not recognized*/avformat_open_input(format_context, generatedInput, input_format, generatedCustom_options) != 0) {
			return 0;
		} 
		return /*Error: Function owner not recognized*/avformat_find_stream_info(format_context, ((Object)0)) >= 0;
	}
	public boolean find_and_initialize_stream_decoders() {
		Object generatedFormat_context = this.getFormat_context();
		 format_context = generatedFormat_context;
		int i;
		 audio_stream = ((Object)0);
		 video_stream = ((Object)0);
		int64_t start_time = -1024;
		for (i = 0; i < format_context.getNb_streams(); i++) {
			 codec = format_context.getStreams()[i].getCodec();
			if (codec.getCodec_type() == AVMEDIA_TYPE_VIDEO && !video_stream) {
				video_stream = format_context.getStreams()[i];
			} 
			if (codec.getCodec_type() == AVMEDIA_TYPE_AUDIO && !audio_stream) {
				audio_stream = format_context.getStreams()[i];
			} 
		}
		int default_stream_index = /*Error: Function owner not recognized*/av_find_default_stream_index(generatedFormat_context);
		ff_clock generatedClock = this.getClock();
		if (default_stream_index >= 0) {
			 stream = format_context.getStreams()[default_stream_index];
			if (stream.getCodec().getCodec_type() == AVMEDIA_TYPE_AUDIO) {
				generatedClock.setSync_type(ff_av_sync_type.AV_SYNC_AUDIO_MASTER);
			}  else if (stream.getCodec().getCodec_type() == AVMEDIA_TYPE_VIDEO) {
				generatedClock.setSync_type(ff_av_sync_type.AV_SYNC_VIDEO_MASTER);
			} 
		} 
		if (video_stream != ((Object)0)) {
			demuxer.find_decoder(video_stream);
		} 
		if (audio_stream != ((Object)0)) {
			demuxer.find_decoder(audio_stream);
		} 
		ff_decoder generatedVideo_decoder = this.getVideo_decoder();
		ff_decoder generatedAudio_decoder = this.getAudio_decoder();
		if (generatedVideo_decoder == ((Object)0) && generatedAudio_decoder == ((Object)0)) {
			return 0;
		} 
		if (!demuxer.set_clock_sync_type()) {
			return 0;
		} 
		for (i = 0; i < format_context.getNb_streams(); i++) {
			 st = format_context.getStreams()[i];
			int64_t st_start_time = new int64_t();
			if (st.getDiscard() == AVDISCARD_ALL || st.getStart_time() == AV_NOPTS_VALUE) {
				continue;
			} 
			st_start_time = /*Error: Function owner not recognized*/av_rescale_q(st.getStart_time(), st.getTime_base(), AV_TIME_BASE_Q);
			start_time = /*Error: Function owner not recognized*/FFMIN(start_time, st_start_time);
		}
		if (format_context.getStart_time() != AV_NOPTS_VALUE) {
			if (start_time > format_context.getStart_time() || start_time == -1024) {
				start_time = format_context.getStart_time();
			} 
		} 
		if (start_time != -1024) {
			generatedVideo_decoder.set_decoder_start_time(start_time);
			generatedAudio_decoder.set_decoder_start_time(start_time);
		} 
		ff_callbacks generatedAudio_callbacks = this.getAudio_callbacks();
		if (generatedAudio_decoder != ((Object)0)) {
			if (generatedAudio_callbacks.ff_callbacks_initialize()) {
				generatedAudio_decoder.ff_decoder_start();
			} else {
					generatedAudio_decoder.ff_decoder_free();
					this.setAudio_decoder(((Object)0));
					if (!demuxer.set_clock_sync_type()) {
						return 0;
					} 
			} 
		} 
		ff_callbacks generatedVideo_callbacks = this.getVideo_callbacks();
		if (generatedVideo_decoder != ((Object)0)) {
			if (generatedVideo_callbacks.ff_callbacks_initialize()) {
				generatedVideo_decoder.ff_decoder_start();
			} else {
					generatedVideo_decoder.ff_decoder_free();
					this.setVideo_decoder(((Object)0));
					if (!demuxer.set_clock_sync_type()) {
						return 0;
					} 
			} 
		} 
		return demuxer.set_clock_sync_type();
	}
	public boolean handle_seek() {
		int ret;
		boolean generatedSeek_request = this.getSeek_request();
		Object generatedSeek_pos = this.getSeek_pos();
		ff_decoder generatedVideo_decoder = this.getVideo_decoder();
		Object generatedStream = generatedVideo_decoder.getStream();
		ff_decoder generatedAudio_decoder = this.getAudio_decoder();
		Object generatedFormat_context = this.getFormat_context();
		int generatedSeek_flags = this.getSeek_flags();
		boolean generatedSeek_flush = this.getSeek_flush();
		if (generatedSeek_request) {
			 seek_stream = ((Object)0);
			int64_t seek_target = generatedSeek_pos;
			if (generatedVideo_decoder != ((Object)0)) {
				seek_stream = generatedStream;
			}  else if (generatedAudio_decoder != ((Object)0)) {
				seek_stream = generatedStream;
			} 
			if (seek_stream != ((Object)0) && generatedFormat_context.getDuration() != AV_NOPTS_VALUE) {
				seek_target = /*Error: Function owner not recognized*/av_rescale_q(seek_target, AV_TIME_BASE_Q, seek_stream.getTime_base());
			} 
			ret = /*Error: Function owner not recognized*/av_seek_frame(generatedFormat_context, 0, seek_target, generatedSeek_flags);
			if (ret < 0) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/av_log(((Object)0), AV_LOG_ERROR, "unable to seek stream: %s", /*Error: Function owner not recognized*/av_err2str(ret));
				this.setSeek_pos(0);
				this.setSeek_request(0);
				return 0;
			} else {
					if (generatedSeek_flush) {
						demuxer.ff_demuxer_flush();
					} 
					demuxer.ff_demuxer_reset();
			} 
			this.setSeek_request(0);
		} 
		return 1;
	}
	public void seek_beginning() {
		Object generatedFormat_context = this.getFormat_context();
		if (generatedFormat_context.getDuration() == AV_NOPTS_VALUE) {
			this.setSeek_flags(AVSEEK_FLAG_FRAME);
			this.setSeek_pos(0);
		} else {
				this.setSeek_flags(AVSEEK_FLAG_BACKWARD);
				this.setSeek_pos(generatedFormat_context.getStart_time());
		} 
		this.setSeek_request(1);
		this.setSeek_flush(0);
		Byte generatedInput = this.getInput();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/av_log(((Object)0), AV_LOG_VERBOSE, "looping media %s", generatedInput);
	}
	public Object getIo_context() {
		return io_context;
	}
	public void setIo_context(Object newIo_context) {
		io_context = newIo_context;
	}
	public Object getFormat_context() {
		return format_context;
	}
	public void setFormat_context(Object newFormat_context) {
		format_context = newFormat_context;
	}
	public ff_clock getClock() {
		return clock;
	}
	public void setClock(ff_clock newClock) {
		clock = newClock;
	}
	public ff_demuxer_options getOptions() {
		return options;
	}
	public void setOptions(ff_demuxer_options newOptions) {
		options = newOptions;
	}
	public ff_decoder getAudio_decoder() {
		return audio_decoder;
	}
	public void setAudio_decoder(ff_decoder newAudio_decoder) {
		audio_decoder = newAudio_decoder;
	}
	public ff_callbacks getAudio_callbacks() {
		return audio_callbacks;
	}
	public void setAudio_callbacks(ff_callbacks newAudio_callbacks) {
		audio_callbacks = newAudio_callbacks;
	}
	public ff_decoder getVideo_decoder() {
		return video_decoder;
	}
	public void setVideo_decoder(ff_decoder newVideo_decoder) {
		video_decoder = newVideo_decoder;
	}
	public ff_callbacks getVideo_callbacks() {
		return video_callbacks;
	}
	public void setVideo_callbacks(ff_callbacks newVideo_callbacks) {
		video_callbacks = newVideo_callbacks;
	}
	public Object getDemuxer_thread() {
		return demuxer_thread;
	}
	public void setDemuxer_thread(Object newDemuxer_thread) {
		demuxer_thread = newDemuxer_thread;
	}
	public Object getSeek_pos() {
		return seek_pos;
	}
	public void setSeek_pos(Object newSeek_pos) {
		seek_pos = newSeek_pos;
	}
	public boolean getSeek_request() {
		return seek_request;
	}
	public void setSeek_request(boolean newSeek_request) {
		seek_request = newSeek_request;
	}
	public int getSeek_flags() {
		return seek_flags;
	}
	public void setSeek_flags(int newSeek_flags) {
		seek_flags = newSeek_flags;
	}
	public boolean getSeek_flush() {
		return seek_flush;
	}
	public void setSeek_flush(boolean newSeek_flush) {
		seek_flush = newSeek_flush;
	}
	public boolean getAbort() {
		return abort;
	}
	public void setAbort(boolean newAbort) {
		abort = newAbort;
	}
	public Byte getInput() {
		return input;
	}
	public void setInput(Byte newInput) {
		input = newInput;
	}
	public Byte getInput_format() {
		return input_format;
	}
	public void setInput_format(Byte newInput_format) {
		input_format = newInput_format;
	}
}

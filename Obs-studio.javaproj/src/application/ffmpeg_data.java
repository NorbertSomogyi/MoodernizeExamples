package application;

public class ffmpeg_data {
	private Object video;
	private Object[][] audio_streams;
	private Object acodec;
	private Object vcodec;
	private Object output;
	private SwsContext swscale;
	private Object total_frames;
	private Object vframe;
	private int frame_size;
	private Object start_timestamp;
	private Object total_samples;
	private Object audio_samplerate;
	private audio_format audio_format;
	private Object audio_planes;
	private Object audio_size;
	private int num_audio_streams;
	private int audio_tracks;
	private Object excess_frames;
	private Object samples;
	private Object aframe;
	private ffmpeg_cfg config;
	private Object initialized;
	private Byte last_error;
	
	public ffmpeg_data(Object video, Object[][] audio_streams, Object acodec, Object vcodec, Object output, SwsContext swscale, Object total_frames, Object vframe, int frame_size, Object start_timestamp, Object total_samples, Object audio_samplerate, audio_format audio_format, Object audio_planes, Object audio_size, int num_audio_streams, int audio_tracks, Object excess_frames, Object samples, Object aframe, ffmpeg_cfg config, Object initialized, Byte last_error) {
		setVideo(video);
		setAudio_streams(audio_streams);
		setAcodec(acodec);
		setVcodec(vcodec);
		setOutput(output);
		setSwscale(swscale);
		setTotal_frames(total_frames);
		setVframe(vframe);
		setFrame_size(frame_size);
		setStart_timestamp(start_timestamp);
		setTotal_samples(total_samples);
		setAudio_samplerate(audio_samplerate);
		setAudio_format(audio_format);
		setAudio_planes(audio_planes);
		setAudio_size(audio_size);
		setNum_audio_streams(num_audio_streams);
		setAudio_tracks(audio_tracks);
		setExcess_frames(excess_frames);
		setSamples(samples);
		setAframe(aframe);
		setConfig(config);
		setInitialized(initialized);
		setLast_error(last_error);
	}
	public ffmpeg_data() {
	}
	
	/* ------------------------------------------------------------------------- */
	public void ffmpeg_output_set_last_error(Object error) {
		if (ModernizedCProgram.data.getLast_error()) {
			ModernizedCProgram.bfree(ModernizedCProgram.data.getLast_error());
		} 
		ModernizedCProgram.data.setLast_error(ModernizedCProgram.bstrdup(error));
	}
	public void ffmpeg_log_error(int log_level, Object format) {
		 args = new ();
		byte[] out = new byte[4096];
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/va_start(args, format);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/vsnprintf(out, /*Error: sizeof expression not supported yet*/, format, args);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/va_end(args);
		ModernizedCProgram.data.ffmpeg_output_set_last_error(out);
		ModernizedCProgram.blog(log_level, "%s", out);
	}
	public Object new_stream(Object stream, Object codec, Object id, Object name) {
		codec = (!!name && name) ? /*Error: Function owner not recognized*/avcodec_find_encoder_by_name(name) : /*Error: Function owner not recognized*/avcodec_find_encoder(id);
		if (!codec) {
			ModernizedCProgram.data.ffmpeg_log_error(LOG_WARNING, "Couldn't find encoder '%s'", /*Error: Function owner not recognized*/avcodec_get_name(id));
			return false;
		} 
		stream = /*Error: Function owner not recognized*/avformat_new_stream(ModernizedCProgram.data.getOutput(), codec);
		if (!stream) {
			ModernizedCProgram.data.ffmpeg_log_error(LOG_WARNING, "Couldn't create stream for encoder '%s'", /*Error: Function owner not recognized*/avcodec_get_name(id));
			return false;
		} 
		(stream).setId(ModernizedCProgram.data.getOutput().getNb_streams() - 1);
		return true;
		 desc = /*Error: Function owner not recognized*/avcodec_descriptor_get_by_name(name);
		 codec = new ();
		if (!desc) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "Couldn't find encoder '%s'\n", name);
			return 0;
		} 
		id = desc.getId();
		codec = /*Error: Function owner not recognized*/avcodec_find_encoder(desc.getId());
		if (!codec) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "Couldn't create encoder");
			return 0;
		} 
		Object generatedOutput = ffm.getOutput();
		stream = /*Error: Function owner not recognized*/avformat_new_stream(generatedOutput, codec);
		if (!stream) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "Couldn't create stream for encoder '%s'\n", name);
			return 0;
		} 
		(stream).setId(generatedOutput.getNb_streams() - 1);
		return 1;
	}
	public Object open_video_codec() {
		 context = ModernizedCProgram.data.getVideo().getCodec();
		byte opts = ModernizedCProgram.strlist_split(ModernizedCProgram.data.getConfig().getVideo_settings(), (byte)' ', false);
		int ret;
		if (/*Error: Function owner not recognized*/strcmp(ModernizedCProgram.data.getVcodec().getName(), "libx264") == 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/av_opt_set(context.getPriv_data(), "preset", "veryfast", 0);
		} 
		if (opts) {
			if (!opts.parse_params(context) && /*Error: Function owner not recognized*/strcmp(ModernizedCProgram.data.getVcodec().getName(), "libx264") == 0) {
				ModernizedCProgram.blog(LOG_WARNING, "If you're trying to set x264 parameters, use x264-params=name=value:name=value");
			} 
			ModernizedCProgram.strlist_free(opts);
		} 
		// libav requires x264 parameters in a special format which may be non-obvious
		ret = /*Error: Function owner not recognized*/avcodec_open2(context, ModernizedCProgram.data.getVcodec(), NULL);
		if (ret < 0) {
			ModernizedCProgram.data.ffmpeg_log_error(LOG_WARNING, "Failed to open video codec: %s", /*Error: Function owner not recognized*/av_err2str(ret));
			return false;
		} 
		ModernizedCProgram.data.setVframe(/*Error: Function owner not recognized*/avcodec_alloc_frame());
		if (!ModernizedCProgram.data.getVframe()) {
			ModernizedCProgram.data.ffmpeg_log_error(LOG_WARNING, "Failed to allocate video frame");
			return false;
		} 
		ModernizedCProgram.data.getVframe().setFormat(context.getPix_fmt());
		ModernizedCProgram.data.getVframe().setWidth(context.getWidth());
		ModernizedCProgram.data.getVframe().setHeight(context.getHeight());
		ModernizedCProgram.data.getVframe().setColorspace(ModernizedCProgram.data.getConfig().getColor_space());
		ModernizedCProgram.data.getVframe().setColor_range(ModernizedCProgram.data.getConfig().getColor_range());
		ret = /*Error: Function owner not recognized*/av_frame_get_buffer(ModernizedCProgram.data.getVframe(), ModernizedCProgram.base_get_alignment());
		if (ret < 0) {
			ModernizedCProgram.data.ffmpeg_log_error(LOG_WARNING, "Failed to allocate vframe: %s", /*Error: Function owner not recognized*/av_err2str(ret));
			return false;
		} 
		return true;
	}
	public Object init_swscale(Object context) {
		ModernizedCProgram.data.setSwscale(/*Error: Function owner not recognized*/sws_getContext(ModernizedCProgram.data.getConfig().getWidth(), ModernizedCProgram.data.getConfig().getHeight(), ModernizedCProgram.data.getConfig().getFormat(), ModernizedCProgram.data.getConfig().getScale_width(), ModernizedCProgram.data.getConfig().getScale_height(), context.getPix_fmt(), SWS_BICUBIC, NULL, NULL, NULL));
		if (!ModernizedCProgram.data.getSwscale()) {
			ModernizedCProgram.data.ffmpeg_log_error(LOG_WARNING, "Could not initialize swscale");
			return false;
		} 
		return true;
	}
	public Object create_video_stream() {
		AVPixelFormat closest_format;
		 context = new ();
		obs_video_info ovi = new obs_video_info();
		if (!ovi.obs_get_video_info()) {
			ModernizedCProgram.data.ffmpeg_log_error(LOG_WARNING, "No active video");
			return false;
		} 
		if (!ModernizedCProgram.data.new_stream(ModernizedCProgram.data.getVideo(), ModernizedCProgram.data.getVcodec(), ModernizedCProgram.data.getOutput().getOformat().getVideo_codec(), ModernizedCProgram.data.getConfig().getVideo_encoder())) {
			return false;
		} 
		AVPixelFormat.closest_format = /*Error: Function owner not recognized*/avcodec_find_best_pix_fmt_of_list(ModernizedCProgram.data.getVcodec().getPix_fmts(), ModernizedCProgram.data.getConfig().getFormat(), 0, NULL);
		context = ModernizedCProgram.data.getVideo().getCodec();
		context.setBit_rate(ModernizedCProgram.data.getConfig().getVideo_bitrate() * 1000);
		context.setWidth(ModernizedCProgram.data.getConfig().getScale_width());
		context.setHeight(ModernizedCProgram.data.getConfig().getScale_height());
		context.setTime_base(/*Error: Unsupported expression*/);
		context.setGop_size(ModernizedCProgram.data.getConfig().getGop_size());
		context.setPix_fmt(AVPixelFormat.closest_format);
		context.setColorspace(ModernizedCProgram.data.getConfig().getColor_space());
		context.setColor_range(ModernizedCProgram.data.getConfig().getColor_range());
		context.setThread_count(0);
		ModernizedCProgram.data.getVideo().setTime_base(context.getTime_base());
		if (ModernizedCProgram.data.getOutput().getOformat().getFlags() & AVFMT_GLOBALHEADER) {
			context.getFlags() |=  CODEC_FLAG_GLOBAL_H;
		} 
		if (!ModernizedCProgram.data.open_video_codec()) {
			return false;
		} 
		if (context.getPix_fmt() != ModernizedCProgram.data.getConfig().getFormat() || ModernizedCProgram.data.getConfig().getWidth() != ModernizedCProgram.data.getConfig().getScale_width() || ModernizedCProgram.data.getConfig().getHeight() != ModernizedCProgram.data.getConfig().getScale_height()) {
			if (!ModernizedCProgram.data.init_swscale(context)) {
				return false;
			} 
		} 
		return true;
		 context = new ();
		Object extradata = ((Object)0);
		Object generatedVideo_stream = ffm.getVideo_stream();
		main_params generatedParams = ffm.getParams();
		Byte generatedVcodec = generatedParams.getVcodec();
		Object generatedOutput = ffm.getOutput();
		if (!ffm.new_stream(generatedVideo_stream, generatedVcodec, generatedOutput.getOformat().getVideo_codec())) {
			return /*Error: Unsupported expression*/;
		} 
		header generatedVideo_header = ffm.getVideo_header();
		int generatedSize = generatedVideo_header.getSize();
		Object generatedData = generatedVideo_header.getData();
		if (generatedSize) {
			extradata = /*Error: Function owner not recognized*/av_memdup(generatedData, generatedSize);
		} 
		context = generatedVideo_stream.getCodec();
		int generatedVbitrate = generatedParams.getVbitrate();
		context.setBit_rate(generatedVbitrate * 1000);
		int generatedWidth = generatedParams.getWidth();
		context.setWidth(generatedWidth);
		int generatedHeight = generatedParams.getHeight();
		context.setHeight(generatedHeight);
		context.setCoded_width(generatedWidth);
		context.setCoded_height(generatedHeight);
		context.setExtradata(extradata);
		context.setExtradata_size(generatedSize);
		context.setTime_base(/*Error: Unsupported expression*/);
		generatedVideo_stream.setTime_base(context.getTime_base());
		generatedVideo_stream.setAvg_frame_rate(/*Error: Function owner not recognized*/av_inv_q(context.getTime_base()));
		if (generatedOutput.getOformat().getFlags() & AVFMT_GLOBALHEADER) {
			context.getFlags() |=  CODEC_FLAG_GLOBAL_HEADER;
		} 
	}
	public Object open_audio_codec(int idx) {
		 context = ModernizedCProgram.data.getAudio_streams()[idx].getCodec();
		byte opts = ModernizedCProgram.strlist_split(ModernizedCProgram.data.getConfig().getAudio_settings(), (byte)' ', false);
		int ret;
		if (opts) {
			opts.parse_params(context);
			ModernizedCProgram.strlist_free(opts);
		} 
		ModernizedCProgram.data.getAframe()[idx] = /*Error: Function owner not recognized*/avcodec_alloc_frame();
		if (!ModernizedCProgram.data.getAframe()[idx]) {
			ModernizedCProgram.data.ffmpeg_log_error(LOG_WARNING, "Failed to allocate audio frame");
			return false;
		} 
		ModernizedCProgram.data.getAframe()[idx].setFormat(context.getSample_fmt());
		ModernizedCProgram.data.getAframe()[idx].setChannels(context.getChannels());
		ModernizedCProgram.data.getAframe()[idx].setChannel_layout(context.getChannel_layout());
		ModernizedCProgram.data.getAframe()[idx].setSample_rate(context.getSample_rate());
		context.setStrict_std_compliance(-2);
		ret = /*Error: Function owner not recognized*/avcodec_open2(context, ModernizedCProgram.data.getAcodec(), NULL);
		if (ret < 0) {
			ModernizedCProgram.data.ffmpeg_log_error(LOG_WARNING, "Failed to open audio codec: %s", /*Error: Function owner not recognized*/av_err2str(ret));
			return false;
		} 
		ModernizedCProgram.data.setFrame_size(context.getFrame_size() ? context.getFrame_size() : 1024);
		ret = /*Error: Function owner not recognized*/av_samples_alloc(ModernizedCProgram.data.getSamples()[idx], NULL, context.getChannels(), ModernizedCProgram.data.getFrame_size(), context.getSample_fmt(), 0);
		if (ret < 0) {
			ModernizedCProgram.data.ffmpeg_log_error(LOG_WARNING, "Failed to create audio buffer: %s", /*Error: Function owner not recognized*/av_err2str(ret));
			return false;
		} 
		return true;
	}
	public Object create_audio_stream(int idx) {
		 context = new ();
		 stream = new ();
		obs_audio_info aoi = new obs_audio_info();
		if (!aoi.obs_get_audio_info()) {
			ModernizedCProgram.data.ffmpeg_log_error(LOG_WARNING, "No active audio");
			return false;
		} 
		if (!ModernizedCProgram.data.new_stream(stream, ModernizedCProgram.data.getAcodec(), ModernizedCProgram.data.getOutput().getOformat().getAudio_codec(), ModernizedCProgram.data.getConfig().getAudio_encoder())) {
			return false;
		} 
		ModernizedCProgram.data.getAudio_streams()[idx] = stream;
		context = ModernizedCProgram.data.getAudio_streams()[idx].getCodec();
		context.setBit_rate(ModernizedCProgram.data.getConfig().getAudio_bitrate() * 1000);
		context.setTime_base(/*Error: Unsupported expression*/);
		speaker_layout generatedSpeakers = aoi.getSpeakers();
		context.setChannels(ModernizedCProgram.get_audio_channels(generatedSpeakers));
		Object generatedSamples_per_sec = aoi.getSamples_per_sec();
		context.setSample_rate(generatedSamples_per_sec);
		context.setChannel_layout(/*Error: Function owner not recognized*/av_get_default_channel_layout(context.getChannels()));
		//AVlib default channel layout for 5 channels is 5.0 ; fix for 4.1if (generatedSpeakers == SPEAKERS_4POINT1) {
			context.setChannel_layout(/*Error: Function owner not recognized*/av_get_channel_layout("4.1"));
		} 
		context.setSample_fmt(ModernizedCProgram.data.getAcodec().getSample_fmts() ? ModernizedCProgram.data.getAcodec().getSample_fmts()[0] : AV_SAMPLE_FMT_FLTP);
		ModernizedCProgram.data.getAudio_streams()[idx].setTime_base(context.getTime_base());
		ModernizedCProgram.data.setAudio_samplerate(generatedSamples_per_sec);
		ModernizedCProgram.data.setAudio_format(ModernizedCProgram.convert_ffmpeg_sample_format(context.getSample_fmt()));
		ModernizedCProgram.data.setAudio_planes(ModernizedCProgram.get_audio_planes(ModernizedCProgram.data.getAudio_format(), generatedSpeakers));
		ModernizedCProgram.data.setAudio_size(ModernizedCProgram.get_audio_size(ModernizedCProgram.data.getAudio_format(), generatedSpeakers, 1));
		if (ModernizedCProgram.data.getOutput().getOformat().getFlags() & AVFMT_GLOBALHEADER) {
			context.getFlags() |=  CODEC_FLAG_GLOBAL_H;
		} 
		return ModernizedCProgram.data.open_audio_codec(idx);
		 context = new ();
		 stream = new ();
		Object extradata = ((Object)0);
		main_params generatedParams = ffm.getParams();
		Byte generatedAcodec = generatedParams.getAcodec();
		Object generatedOutput = ffm.getOutput();
		if (!ffm.new_stream(stream, generatedAcodec, generatedOutput.getOformat().getAudio_codec())) {
			return /*Error: Unsupported expression*/;
		} 
		Object[][] generatedAudio_streams = ffm.getAudio_streams();
		generatedAudio_streams[idx] = stream;
		audio_params[] generatedAudio = ffm.getAudio();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/av_dict_set(stream.getMetadata(), "title", generatedAudio[idx].getName(), 0);
		stream.setTime_base(/*Error: Unsupported expression*/);
		header[] generatedAudio_header = ffm.getAudio_header();
		if (generatedAudio_header[idx].getSize()) {
			extradata = /*Error: Function owner not recognized*/av_memdup(generatedAudio_header[idx].getData(), generatedAudio_header[idx].getSize());
		} 
		context = stream.getCodec();
		context.setBit_rate(generatedAudio[idx].getAbitrate() * 1000);
		context.setChannels(generatedAudio[idx].getChannels());
		context.setSample_rate(generatedAudio[idx].getSample_rate());
		context.setSample_fmt(AV_SAMPLE_FMT_S16);
		context.setTime_base(stream.getTime_base());
		context.setExtradata(extradata);
		context.setExtradata_size(generatedAudio_header[idx].getSize());
		context.setChannel_layout(/*Error: Function owner not recognized*/av_get_default_channel_layout(context.getChannels()));
		//AVlib default channel layout for 4 channels is 4.0 ; fix for quadif (context.getChannels() == 4) {
			context.setChannel_layout(/*Error: Function owner not recognized*/av_get_channel_layout("quad"));
		} 
		if (context.getChannels() == 5) {
			context.setChannel_layout(/*Error: Function owner not recognized*/av_get_channel_layout("4.1"));
		} 
		if (generatedOutput.getOformat().getFlags() & AVFMT_GLOBALHEADER) {
			context.getFlags() |=  CODEC_FLAG_GLOBAL_HEADER;
		} 
		int generatedNum_audio_streams = ffm.getNum_audio_streams();
		generatedNum_audio_streams++;
	}
	public Object init_streams() {
		 format = ModernizedCProgram.data.getOutput().getOformat();
		if (format.getVideo_codec() != AV_CODEC_ID_NONE) {
			if (!ModernizedCProgram.data.create_video_stream()) {
				return false;
			} 
		} 
		if (format.getAudio_codec() != AV_CODEC_ID_NONE && ModernizedCProgram.data.getNum_audio_streams()) {
			ModernizedCProgram.data.setAudio_streams(/*Error: Function owner not recognized*/calloc(1, ModernizedCProgram.data.getNum_audio_streams() * /*Error: Unsupported expression*/));
			for (int i = 0;
			 i < ModernizedCProgram.data.getNum_audio_streams(); i++) {
				if (!ModernizedCProgram.data.create_audio_stream(i)) {
					return false;
				} 
			}
		} 
		return true;
		main_params generatedParams = ffm.getParams();
		int generatedHas_video = generatedParams.getHas_video();
		if (generatedHas_video) {
			ffm.create_video_stream();
		} 
		int generatedTracks = generatedParams.getTracks();
		if (generatedTracks) {
			ffm.setAudio_streams(/*Error: Function owner not recognized*/calloc(1, generatedTracks * /*Error: Unsupported expression*/));
			for (int i = 0;
			 i < generatedTracks; i++) {
				ffm.create_audio_stream(i);
			}
		} 
		Object generatedVideo_stream = ffm.getVideo_stream();
		int generatedNum_audio_streams = ffm.getNum_audio_streams();
		if (!generatedVideo_stream && !generatedNum_audio_streams) {
			return 0;
		} 
		return 1;
	}
	public Object open_output_file() {
		 format = ModernizedCProgram.data.getOutput().getOformat();
		int ret;
		 dict = NULL;
		if ((ret = /*Error: Function owner not recognized*/av_dict_parse_string(dict, ModernizedCProgram.data.getConfig().getMuxer_settings(), "=", " ", 0))) {
			ModernizedCProgram.data.ffmpeg_log_error(LOG_WARNING, "Failed to parse muxer settings: %s\n%s", /*Error: Function owner not recognized*/av_err2str(ret), ModernizedCProgram.data.getConfig().getMuxer_settings());
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/av_dict_free(dict);
			return false;
		} 
		Object generatedDstr = str.getDstr();
		if (/*Error: Function owner not recognized*/av_dict_count(dict) > 0) {
			dstr str = new dstr(0);
			 entry = NULL;
			while ((entry = /*Error: Function owner not recognized*/av_dict_get(dict, "", entry, AV_DICT_IGNORE_SUFFIX))) {
				str.dstr_catf("\n\t%s=%s", entry.getKey(), entry.getValue());
			}
			ModernizedCProgram.blog(LOG_INFO, "Using muxer settings: %s", generatedDstr);
			str.dstr_free();
		} 
		if ((format.getFlags() & AVFMT_NOFILE) == 0) {
			ret = /*Error: Function owner not recognized*/avio_open2(ModernizedCProgram.data.getOutput().getPb(), ModernizedCProgram.data.getConfig().getUrl(), AVIO_FLAG_WRITE, NULL, dict);
			if (ret < 0) {
				ModernizedCProgram.data.ffmpeg_log_error(LOG_WARNING, "Couldn't open '%s', %s", ModernizedCProgram.data.getConfig().getUrl(), /*Error: Function owner not recognized*/av_err2str(ret));
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/av_dict_free(dict);
				return false;
			} 
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strncpy(ModernizedCProgram.data.getOutput().getFilename(), ModernizedCProgram.data.getConfig().getUrl(), /*Error: sizeof expression not supported yet*/);
		ModernizedCProgram.data.getOutput().getFilename()[/*Error: sizeof expression not supported yet*/ - 1] = 0;
		ret = /*Error: Function owner not recognized*/avformat_write_header(ModernizedCProgram.data.getOutput(), dict);
		if (ret < 0) {
			ModernizedCProgram.data.ffmpeg_log_error(LOG_WARNING, "Error opening '%s': %s", ModernizedCProgram.data.getConfig().getUrl(), /*Error: Function owner not recognized*/av_err2str(ret));
			return false;
		} 
		if (/*Error: Function owner not recognized*/av_dict_count(dict) > 0) {
			dstr str = new dstr(0);
			 entry = NULL;
			while ((entry = /*Error: Function owner not recognized*/av_dict_get(dict, "", entry, AV_DICT_IGNORE_SUFFIX))) {
				str.dstr_catf("\n\t%s=%s", entry.getKey(), entry.getValue());
			}
			ModernizedCProgram.blog(LOG_INFO, "Invalid muxer settings: %s", generatedDstr);
			str.dstr_free();
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/av_dict_free(dict);
		return true;
		Object generatedOutput = ffm.getOutput();
		 format = generatedOutput.getOformat();
		int ret;
		main_params generatedParams = ffm.getParams();
		Byte generatedFile = generatedParams.getFile();
		if ((format.getFlags() & AVFMT_NOFILE) == 0) {
			ret = /*Error: Function owner not recognized*/avio_open(generatedOutput.getPb(), generatedFile, AVIO_FLAG_WRITE);
			if (ret < 0) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "Couldn't open '%s', %s", generatedFile, /*Error: Function owner not recognized*/av_err2str(ret));
				return -1;
			} 
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/strncpy(generatedOutput.getFilename(), generatedFile, /*Error: sizeof expression not supported yet*/);
		generatedOutput.getFilename()[/*Error: sizeof expression not supported yet*/ - 1] = 0;
		 dict = ((Object)0);
		Byte generatedMuxer_settings = generatedParams.getMuxer_settings();
		if ((ret = /*Error: Function owner not recognized*/av_dict_parse_string(dict, generatedMuxer_settings, "=", " ", 0))) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "Failed to parse muxer settings: %s\n%s", /*Error: Function owner not recognized*/av_err2str(ret), generatedMuxer_settings);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/av_dict_free(dict);
		} 
		if (/*Error: Function owner not recognized*/av_dict_count(dict) > 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("Using muxer settings:");
			 entry = ((Object)0);
			while ((entry = /*Error: Function owner not recognized*/av_dict_get(dict, "", entry, AV_DICT_IGNORE_SUFFIX))) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("\n\t%s=%s", entry.getKey(), entry.getValue());
			}
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/printf("\n");
		} 
		ret = /*Error: Function owner not recognized*/avformat_write_header(generatedOutput, dict);
		if (ret < 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "Error opening '%s': %s", generatedFile, /*Error: Function owner not recognized*/av_err2str(ret));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/av_dict_free(dict);
			return ret == -22 ? -2 : -1;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/av_dict_free(dict);
		return 0;
	}
	public void close_video() {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/avcodec_close(ModernizedCProgram.data.getVideo().getCodec());
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/avcodec_get_frame_defaults(ModernizedCProgram.data.getVframe())// This format for some reason derefs video frame;// This format for some reason derefs video frame
		// too many timesif (ModernizedCProgram.data.getVcodec().getId() == AV_CODEC_ID_A64_MULTI || ModernizedCProgram.data.getVcodec().getId() == AV_CODEC_ID_A64_MULTI5) {
			return /*Error: Unsupported expression*/;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/avcodec_free_frame(ModernizedCProgram.data.getVframe());
	}
	public void close_audio() {
		for (int idx = 0;
		 idx < ModernizedCProgram.data.getNum_audio_streams(); idx++) {
			for ( i = 0;
			 i < MAX_AV_PLANES; i++) {
				ModernizedCProgram.data.getExcess_frames()[idx][i].circlebuf_free();
			}
			if (ModernizedCProgram.data.getSamples()[idx][0]) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/av_freep(ModernizedCProgram.data.getSamples()[idx][0]);
			} 
			if (ModernizedCProgram.data.getAudio_streams()[idx]) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/avcodec_close(ModernizedCProgram.data.getAudio_streams()[idx].getCodec());
			} 
			if (ModernizedCProgram.data.getAframe()[idx]) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/avcodec_free_frame(ModernizedCProgram.data.getAframe()[idx]);
			} 
		}
	}
	public void ffmpeg_data_free() {
		if (ModernizedCProgram.data.getInitialized()) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/av_write_trailer(ModernizedCProgram.data.getOutput());
		} 
		if (ModernizedCProgram.data.getVideo()) {
			ModernizedCProgram.data.close_video();
		} 
		if (ModernizedCProgram.data.getAudio_streams()) {
			ModernizedCProgram.data.close_audio();
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(ModernizedCProgram.data.getAudio_streams());
			ModernizedCProgram.data.setAudio_streams(NULL);
		} 
		if (ModernizedCProgram.data.getOutput()) {
			if ((ModernizedCProgram.data.getOutput().getOformat().getFlags() & AVFMT_NOFILE) == 0) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/avio_close(ModernizedCProgram.data.getOutput().getPb());
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/avformat_free_context(ModernizedCProgram.data.getOutput());
		} 
		if (ModernizedCProgram.data.getLast_error()) {
			ModernizedCProgram.bfree(ModernizedCProgram.data.getLast_error());
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(ModernizedCProgram.data, 0, /*Error: Unsupported expression*/);
	}
	public void set_encoder_ids() {
		ModernizedCProgram.data.getOutput().getOformat().setVideo_codec(ModernizedCProgram.get_codec_id(ModernizedCProgram.data.getConfig().getVideo_encoder(), ModernizedCProgram.data.getConfig().getVideo_encoder_id()));
		ModernizedCProgram.data.getOutput().getOformat().setAudio_codec(ModernizedCProgram.get_codec_id(ModernizedCProgram.data.getConfig().getAudio_encoder(), ModernizedCProgram.data.getConfig().getAudio_encoder_id()));
	}
	public Object getVideo() {
		return video;
	}
	public void setVideo(Object newVideo) {
		video = newVideo;
	}
	public Object[][] getAudio_streams() {
		return audio_streams;
	}
	public void setAudio_streams(Object[][] newAudio_streams) {
		audio_streams = newAudio_streams;
	}
	public Object getAcodec() {
		return acodec;
	}
	public void setAcodec(Object newAcodec) {
		acodec = newAcodec;
	}
	public Object getVcodec() {
		return vcodec;
	}
	public void setVcodec(Object newVcodec) {
		vcodec = newVcodec;
	}
	public Object getOutput() {
		return output;
	}
	public void setOutput(Object newOutput) {
		output = newOutput;
	}
	public SwsContext getSwscale() {
		return swscale;
	}
	public void setSwscale(SwsContext newSwscale) {
		swscale = newSwscale;
	}
	public Object getTotal_frames() {
		return total_frames;
	}
	public void setTotal_frames(Object newTotal_frames) {
		total_frames = newTotal_frames;
	}
	public Object getVframe() {
		return vframe;
	}
	public void setVframe(Object newVframe) {
		vframe = newVframe;
	}
	public int getFrame_size() {
		return frame_size;
	}
	public void setFrame_size(int newFrame_size) {
		frame_size = newFrame_size;
	}
	public Object getStart_timestamp() {
		return start_timestamp;
	}
	public void setStart_timestamp(Object newStart_timestamp) {
		start_timestamp = newStart_timestamp;
	}
	public Object getTotal_samples() {
		return total_samples;
	}
	public void setTotal_samples(Object newTotal_samples) {
		total_samples = newTotal_samples;
	}
	public Object getAudio_samplerate() {
		return audio_samplerate;
	}
	public void setAudio_samplerate(Object newAudio_samplerate) {
		audio_samplerate = newAudio_samplerate;
	}
	public audio_format getAudio_format() {
		return audio_format;
	}
	public void setAudio_format(audio_format newAudio_format) {
		audio_format = newAudio_format;
	}
	public Object getAudio_planes() {
		return audio_planes;
	}
	public void setAudio_planes(Object newAudio_planes) {
		audio_planes = newAudio_planes;
	}
	public Object getAudio_size() {
		return audio_size;
	}
	public void setAudio_size(Object newAudio_size) {
		audio_size = newAudio_size;
	}
	public int getNum_audio_streams() {
		return num_audio_streams;
	}
	public void setNum_audio_streams(int newNum_audio_streams) {
		num_audio_streams = newNum_audio_streams;
	}
	public int getAudio_tracks() {
		return audio_tracks;
	}
	public void setAudio_tracks(int newAudio_tracks) {
		audio_tracks = newAudio_tracks;
	}
	public Object getExcess_frames() {
		return excess_frames;
	}
	public void setExcess_frames(Object newExcess_frames) {
		excess_frames = newExcess_frames;
	}
	public Object getSamples() {
		return samples;
	}
	public void setSamples(Object newSamples) {
		samples = newSamples;
	}
	public Object getAframe() {
		return aframe;
	}
	public void setAframe(Object newAframe) {
		aframe = newAframe;
	}
	public ffmpeg_cfg getConfig() {
		return config;
	}
	public void setConfig(ffmpeg_cfg newConfig) {
		config = newConfig;
	}
	public Object getInitialized() {
		return initialized;
	}
	public void setInitialized(Object newInitialized) {
		initialized = newInitialized;
	}
	public Byte getLast_error() {
		return last_error;
	}
	public void setLast_error(Byte newLast_error) {
		last_error = newLast_error;
	}
}

package application;

public class ffmpeg_mux {
	private Object output;
	private Object video_stream;
	private Object[][] audio_streams;
	private main_params params;
	private audio_params[] audio;
	private header video_header;
	private header[] audio_header;
	private int num_audio_streams;
	private boolean initialized;
	private Object error;
	
	public ffmpeg_mux(Object output, Object video_stream, Object[][] audio_streams, main_params params, audio_params[] audio, header video_header, header[] audio_header, int num_audio_streams, boolean initialized, Object error) {
		setOutput(output);
		setVideo_stream(video_stream);
		setAudio_streams(audio_streams);
		setParams(params);
		setAudio(audio);
		setVideo_header(video_header);
		setAudio_header(audio_header);
		setNum_audio_streams(num_audio_streams);
		setInitialized(initialized);
		setError(error);
	}
	public ffmpeg_mux() {
	}
	
	public void free_avformat() {
		Object generatedOutput = this.getOutput();
		if (generatedOutput) {
			if ((generatedOutput.getOformat().getFlags() & AVFMT_NOFILE) == 0) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/avio_close(generatedOutput.getPb());
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/avformat_free_context(generatedOutput);
			this.setOutput(((Object)0));
		} 
		Object[][] generatedAudio_streams = this.getAudio_streams();
		if (generatedAudio_streams) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedAudio_streams);
		} 
		this.setVideo_stream(((Object)0));
		this.setAudio_streams(((Object)0));
		this.setNum_audio_streams(0);
	}
	public void ffmpeg_mux_free() {
		boolean generatedInitialized = this.getInitialized();
		Object generatedOutput = this.getOutput();
		if (generatedInitialized) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/av_write_trailer(generatedOutput);
		} 
		ffm.free_avformat();
		header generatedVideo_header = this.getVideo_header();
		generatedVideo_header.header_free();
		header[] generatedAudio_header = this.getAudio_header();
		main_params generatedParams = this.getParams();
		int generatedTracks = generatedParams.getTracks();
		if (generatedAudio_header) {
			for (int i = 0;
			 i < generatedTracks; i++) {
				generatedAudio_header[i].header_free();
			}
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedAudio_header);
		} 
		audio_params[] generatedAudio = this.getAudio();
		if (generatedAudio) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(generatedAudio);
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(ffm, 0, /*Error: sizeof expression not supported yet*/);
	}
	public boolean ffmpeg_mux_get_header() {
		ffm_packet_info info = new ffm_packet_info(0);
		boolean success = ModernizedCProgram.safe_read(info, /*Error: sizeof expression not supported yet*/) == /*Error: sizeof expression not supported yet*/;
		Object generatedSize = info.getSize();
		if (success) {
			uint8_t data = /*Error: Function owner not recognized*/malloc(generatedSize);
			if (ModernizedCProgram.safe_read(ModernizedCProgram.data, generatedSize) == generatedSize) {
				ModernizedCProgram.ffmpeg_mux_header(ffm, ModernizedCProgram.data, info);
			} else {
					success = false;
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(ModernizedCProgram.data);
		} 
		return success;
	}
	public boolean ffmpeg_mux_get_extra_data() {
		main_params generatedParams = this.getParams();
		int generatedHas_video = generatedParams.getHas_video();
		if (generatedHas_video) {
			if (!ffm.ffmpeg_mux_get_header()) {
				return 0;
			} 
		} 
		int generatedTracks = generatedParams.getTracks();
		for (int i = 0;
		 i < generatedTracks; i++) {
			if (!ffm.ffmpeg_mux_get_header()) {
				return 0;
			} 
		}
		return 1;
	}
	public int ffmpeg_mux_init_context() {
		 output_format = new ();
		int ret;
		main_params generatedParams = this.getParams();
		Byte generatedFile = generatedParams.getFile();
		output_format = /*Error: Function owner not recognized*/av_guess_format(((Object)0), generatedFile, ((Object)0));
		if (output_format == ((Object)0)) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "Couldn't find an appropriate muxer for '%s'\n", generatedFile);
			return -1;
		} 
		Object generatedOutput = this.getOutput();
		ret = /*Error: Function owner not recognized*/avformat_alloc_output_context2(generatedOutput, output_format, ((Object)0), ((Object)0));
		if (ret < 0) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fprintf((_iob[2]), "Couldn't initialize output context: %s\n", /*Error: Function owner not recognized*/av_err2str(ret));
			return -1;
		} 
		generatedOutput.getOformat().setVideo_codec(AV_CODEC_ID_NONE);
		generatedOutput.getOformat().setAudio_codec(AV_CODEC_ID_NONE);
		if (!ffm.init_streams()) {
			ffm.free_avformat();
			return -1;
		} 
		ret = ffm.open_output_file();
		if (ret != 0) {
			ffm.free_avformat();
			return ret;
		} 
		return 0;
	}
	public int ffmpeg_mux_init_internal(int argc, Byte argv) {
		argc--;
		argv++;
		main_params generatedParams = this.getParams();
		audio_params[] generatedAudio = this.getAudio();
		if (!ModernizedCProgram.init_params(argc, argv, generatedParams, generatedAudio)) {
			return -1;
		} 
		int generatedTracks = generatedParams.getTracks();
		if (generatedTracks) {
			this.setAudio_header(/*Error: Function owner not recognized*/calloc(1, /*Error: Unsupported expression*/ * generatedTracks));
		} 
		if (!ffm.ffmpeg_mux_get_extra_data()) {
			return -1;
		} 
		return /* ffmpeg does not have a way of telling what's supported
			 * for a given output format, so we try each possibility */ffm.ffmpeg_mux_init_context();
	}
	public int ffmpeg_mux_init(int argc, Byte argv) {
		int ret = ffm.ffmpeg_mux_init_internal(argc, argv);
		if (ret != 0) {
			ffm.ffmpeg_mux_free();
			return ret;
		} 
		this.setInitialized(1);
		return ret;
	}
	public Object get_stream(int idx) {
		Object generatedOutput = this.getOutput();
		return generatedOutput.getStreams()[idx];
	}
	public Object getOutput() {
		return output;
	}
	public void setOutput(Object newOutput) {
		output = newOutput;
	}
	public Object getVideo_stream() {
		return video_stream;
	}
	public void setVideo_stream(Object newVideo_stream) {
		video_stream = newVideo_stream;
	}
	public Object[][] getAudio_streams() {
		return audio_streams;
	}
	public void setAudio_streams(Object[][] newAudio_streams) {
		audio_streams = newAudio_streams;
	}
	public main_params getParams() {
		return params;
	}
	public void setParams(main_params newParams) {
		params = newParams;
	}
	public audio_params[] getAudio() {
		return audio;
	}
	public void setAudio(audio_params[] newAudio) {
		audio = newAudio;
	}
	public header getVideo_header() {
		return video_header;
	}
	public void setVideo_header(header newVideo_header) {
		video_header = newVideo_header;
	}
	public header[] getAudio_header() {
		return audio_header;
	}
	public void setAudio_header(header[] newAudio_header) {
		audio_header = newAudio_header;
	}
	public int getNum_audio_streams() {
		return num_audio_streams;
	}
	public void setNum_audio_streams(int newNum_audio_streams) {
		num_audio_streams = newNum_audio_streams;
	}
	public boolean getInitialized() {
		return initialized;
	}
	public void setInitialized(boolean newInitialized) {
		initialized = newInitialized;
	}
	public Object getError() {
		return error;
	}
	public void setError(Object newError) {
		error = newError;
	}
}

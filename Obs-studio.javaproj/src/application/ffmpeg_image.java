package application;

public class ffmpeg_image {
	private Object file;
	private Object fmt_ctx;
	private Object decoder_ctx;
	private Object decoder;
	private Object stream;
	private int stream_idx;
	private int cx;
	private int cy;
	private AVPixelFormat format;
	
	public ffmpeg_image(Object file, Object fmt_ctx, Object decoder_ctx, Object decoder, Object stream, int stream_idx, int cx, int cy, AVPixelFormat format) {
		setFile(file);
		setFmt_ctx(fmt_ctx);
		setDecoder_ctx(decoder_ctx);
		setDecoder(decoder);
		setStream(stream);
		setStream_idx(stream_idx);
		setCx(cx);
		setCy(cy);
		setFormat(format);
	}
	public ffmpeg_image() {
	}
	
	public Object ffmpeg_image_open_decoder_context() {
		Object generatedFmt_ctx = this.getFmt_ctx();
		int ret = /*Error: Function owner not recognized*/av_find_best_stream(generatedFmt_ctx, AVMEDIA_TYPE_VIDEO, -1, 1, NULL, 0);
		Object generatedFile = this.getFile();
		if (ret < 0) {
			ModernizedCProgram.blog(LOG_WARNING, "Couldn't find video stream in file '%s': %s", generatedFile, /*Error: Function owner not recognized*/av_err2str(ret));
			return false;
		} 
		this.setStream_idx(ret);
		this.setStream(generatedFmt_ctx.getStreams()[ret]);
		Object generatedStream = this.getStream();
		this.setDecoder_ctx(generatedStream.getCodec());
		Object generatedDecoder_ctx = this.getDecoder_ctx();
		this.setDecoder(/*Error: Function owner not recognized*/avcodec_find_decoder(generatedDecoder_ctx.getCodec_id()));
		Object generatedDecoder = this.getDecoder();
		if (!generatedDecoder) {
			ModernizedCProgram.blog(LOG_WARNING, "Failed to find decoder for file '%s'", generatedFile);
			return false;
		} 
		ret = /*Error: Function owner not recognized*/avcodec_open2(generatedDecoder_ctx, generatedDecoder, NULL);
		if (ret < 0) {
			ModernizedCProgram.blog(LOG_WARNING, "Failed to open video codec for file '%s': %s", generatedFile, /*Error: Function owner not recognized*/av_err2str(ret));
			return false;
		} 
		return true;
	}
	public void ffmpeg_image_free() {
		Object generatedDecoder_ctx = this.getDecoder_ctx();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/avcodec_close(generatedDecoder_ctx);
		Object generatedFmt_ctx = this.getFmt_ctx();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/avformat_close_input(generatedFmt_ctx);
	}
	public Object ffmpeg_image_init(Object file) {
		int ret;
		if (!file || !file) {
			return false;
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(info, 0, /*Error: Unsupported expression*/);
		this.setFile(file);
		this.setStream_idx(-1);
		Object generatedFmt_ctx = this.getFmt_ctx();
		ret = /*Error: Function owner not recognized*/avformat_open_input(generatedFmt_ctx, file, NULL, NULL);
		Object generatedFile = this.getFile();
		if (ret < 0) {
			ModernizedCProgram.blog(LOG_WARNING, "Failed to open file '%s': %s", generatedFile, /*Error: Function owner not recognized*/av_err2str(ret));
			return false;
		} 
		ret = /*Error: Function owner not recognized*/avformat_find_stream_info(generatedFmt_ctx, NULL);
		if (ret < 0) {
			ModernizedCProgram.blog(LOG_WARNING, "Could not find stream info for file '%s': %s", generatedFile, /*Error: Function owner not recognized*/av_err2str(ret));
			;
		} 
		if (!info.ffmpeg_image_open_decoder_context()) {
			;
		} 
		Object generatedDecoder_ctx = this.getDecoder_ctx();
		this.setCx(generatedDecoder_ctx.getWidth());
		this.setCy(generatedDecoder_ctx.getHeight());
		this.setFormat(generatedDecoder_ctx.getPix_fmt());
		return true;
		return false;
	}
	public Object ffmpeg_image_reformat_frame(Object frame, Object out, int linesize) {
		SwsContext sws_ctx = NULL;
		int ret = 0;
		AVPixelFormat generatedFormat = this.getFormat();
		int generatedCy = this.getCy();
		int generatedCx = this.getCx();
		Object generatedFile = this.getFile();
		if (generatedFormat == AV_PIX_FMT_RGBA || generatedFormat == AV_PIX_FMT_BGRA || generatedFormat == AV_PIX_FMT_BGR0) {
			if (linesize != frame.getLinesize()[0]) {
				int min_line = linesize < frame.getLinesize()[0] ? linesize : frame.getLinesize()[0];
				for (int y = 0;
				 y < generatedCy; y++) {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(out + y * linesize, frame.getData()[0] + y * frame.getLinesize()[0], min_line);
				}
			} else {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(out, frame.getData()[0], linesize * generatedCy);
			} 
		} else {
				sws_ctx = /*Error: Function owner not recognized*/sws_getContext(generatedCx, generatedCy, generatedFormat, generatedCx, generatedCy, AV_PIX_FMT_BGRA, SWS_POINT, NULL, NULL, NULL);
				if (!sws_ctx) {
					ModernizedCProgram.blog(LOG_WARNING, "Failed to create scale context for '%s'", generatedFile);
					return false;
				} 
				ret = /*Error: Function owner not recognized*/sws_scale(sws_ctx, ()frame.getData(), frame.getLinesize(), 0, generatedCy, out, linesize);
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/sws_freeContext(sws_ctx);
				if (ret < 0) {
					ModernizedCProgram.blog(LOG_WARNING, "sws_scale failed for '%s': %s", generatedFile, /*Error: Function owner not recognized*/av_err2str(ret));
					return false;
				} 
				this.setFormat(AV_PIX_FMT_BGRA);
		} 
		return true;
	}
	public Object ffmpeg_image_decode(Object out, int linesize) {
		 packet = new (0);
		 success = false;
		 frame = /*Error: Function owner not recognized*/avcodec_alloc_frame();
		int got_frame = 0;
		int ret;
		Object generatedFile = this.getFile();
		if (!frame) {
			ModernizedCProgram.blog(LOG_WARNING, "Failed to create frame data for '%s'", generatedFile);
			return false;
		} 
		Object generatedFmt_ctx = this.getFmt_ctx();
		ret = /*Error: Function owner not recognized*/av_read_frame(generatedFmt_ctx, packet);
		if (ret < 0) {
			ModernizedCProgram.blog(LOG_WARNING, "Failed to read image frame from '%s': %s", generatedFile, /*Error: Function owner not recognized*/av_err2str(ret));
			;
		} 
		Object generatedDecoder_ctx = this.getDecoder_ctx();
		while (!got_frame) {
			ret = /*Error: Function owner not recognized*/avcodec_send_packet(generatedDecoder_ctx, packet);
			if (ret == 0) {
				ret = /*Error: Function owner not recognized*/avcodec_receive_frame(generatedDecoder_ctx, frame);
			} 
			got_frame = (ret == 0);
			if (ret == AVERROR_EOF || ret == /*Error: Function owner not recognized*/AVERROR(EAGAIN)) {
				ret = 0;
			} 
			if (ret < 0) {
				ModernizedCProgram.blog(LOG_WARNING, "Failed to decode frame for '%s': %s", generatedFile, /*Error: Function owner not recognized*/av_err2str(ret));
				;
			} 
		}
		success = info.ffmpeg_image_reformat_frame(frame, out, linesize);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/avcodec_free_frame(frame);
		return success;
	}
	public Object getFile() {
		return file;
	}
	public void setFile(Object newFile) {
		file = newFile;
	}
	public Object getFmt_ctx() {
		return fmt_ctx;
	}
	public void setFmt_ctx(Object newFmt_ctx) {
		fmt_ctx = newFmt_ctx;
	}
	public Object getDecoder_ctx() {
		return decoder_ctx;
	}
	public void setDecoder_ctx(Object newDecoder_ctx) {
		decoder_ctx = newDecoder_ctx;
	}
	public Object getDecoder() {
		return decoder;
	}
	public void setDecoder(Object newDecoder) {
		decoder = newDecoder;
	}
	public Object getStream() {
		return stream;
	}
	public void setStream(Object newStream) {
		stream = newStream;
	}
	public int getStream_idx() {
		return stream_idx;
	}
	public void setStream_idx(int newStream_idx) {
		stream_idx = newStream_idx;
	}
	public int getCx() {
		return cx;
	}
	public void setCx(int newCx) {
		cx = newCx;
	}
	public int getCy() {
		return cy;
	}
	public void setCy(int newCy) {
		cy = newCy;
	}
	public AVPixelFormat getFormat() {
		return format;
	}
	public void setFormat(AVPixelFormat newFormat) {
		format = newFormat;
	}
}

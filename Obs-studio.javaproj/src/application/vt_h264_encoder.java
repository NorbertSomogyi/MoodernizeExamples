package application;

public class vt_h264_encoder {
	private obs_encoder encoder;
	private Object vt_encoder_id;
	private Object width;
	private Object height;
	private Object keyint;
	private Object fps_num;
	private Object fps_den;
	private Object bitrate;
	private Object limit_bitrate;
	private Object rc_max_bitrate;
	private double rc_max_bitrate_window;
	private Object profile;
	private Object bframes;
	private video_format obs_pix_fmt;
	private int vt_pix_fmt;
	private video_colorspace colorspace;
	private Object fullrange;
	private Object session;
	private Object queue;
	private Object hw_enc;
	
	public vt_h264_encoder(obs_encoder encoder, Object vt_encoder_id, Object width, Object height, Object keyint, Object fps_num, Object fps_den, Object bitrate, Object limit_bitrate, Object rc_max_bitrate, double rc_max_bitrate_window, Object profile, Object bframes, video_format obs_pix_fmt, int vt_pix_fmt, video_colorspace colorspace, Object fullrange, Object session, Object queue, Object hw_enc) {
		setEncoder(encoder);
		setVt_encoder_id(vt_encoder_id);
		setWidth(width);
		setHeight(height);
		setKeyint(keyint);
		setFps_num(fps_num);
		setFps_den(fps_den);
		setBitrate(bitrate);
		setLimit_bitrate(limit_bitrate);
		setRc_max_bitrate(rc_max_bitrate);
		setRc_max_bitrate_window(rc_max_bitrate_window);
		setProfile(profile);
		setBframes(bframes);
		setObs_pix_fmt(obs_pix_fmt);
		setVt_pix_fmt(vt_pix_fmt);
		setColorspace(colorspace);
		setFullrange(fullrange);
		setSession(session);
		setQueue(queue);
		setHw_enc(hw_enc);
	}
	public vt_h264_encoder() {
	}
	
	public void log_osstatus(int log_level, Object context, Object code) {
		byte c_str = NULL;
		 err = /*Error: Function owner not recognized*/CFErrorCreate(kCFAllocatorDefault, kCFErrorDomainOSStatus, code, NULL);
		 str = /*Error: Function owner not recognized*/CFErrorCopyDescription(err);
		c_str = /*Error: Function owner not recognized*/cfstr_copy_cstr(str, kCFStringEncodingUTF8);
		obs_encoder generatedEncoder = this.getEncoder();
		if (c_str) {
			if (enc) {
				ModernizedCProgram.blog(log_level, "[VideoToolbox %s: 'h264']: Error in %s: %s", ModernizedCProgram.obs_encoder_get_name(generatedEncoder), context, c_str);
			} else {
					ModernizedCProgram.blog(log_level, "[VideoToolbox encoder]: Error in %s: %s", context, c_str);
			} 
		} 
		ModernizedCProgram.bfree(c_str);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CFRelease(str);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CFRelease(err);
	}
	public Object create_pixbuf_spec() {
		 pixbuf_spec = /*Error: Function owner not recognized*/CFDictionaryCreateMutable(kCFAllocatorDefault, 3, kCFTypeDictionaryKeyCallBacks, kCFTypeDictionaryValueCallBacks);
		int generatedVt_pix_fmt = this.getVt_pix_fmt();
		 n = /*Error: Function owner not recognized*/CFNumberCreate(NULL, kCFNumberSInt32Type, generatedVt_pix_fmt);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CFDictionaryAddValue(pixbuf_spec, kCVPixelBufferPixelFormatTypeKey, n);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CFRelease(n);
		Object generatedWidth = this.getWidth();
		n = /*Error: Function owner not recognized*/CFNumberCreate(NULL, kCFNumberSInt32Type, generatedWidth);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CFDictionaryAddValue(pixbuf_spec, kCVPixelBufferWidthKey, n);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CFRelease(n);
		Object generatedHeight = this.getHeight();
		n = /*Error: Function owner not recognized*/CFNumberCreate(NULL, kCFNumberSInt32Type, generatedHeight);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CFDictionaryAddValue(pixbuf_spec, kCVPixelBufferHeightKey, n);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CFRelease(n);
		return pixbuf_spec;
	}
	public Object create_encoder() {
		 code = new ();
		 s = new ();
		Object generatedVt_encoder_id = this.getVt_encoder_id();
		 encoder_spec = ModernizedCProgram.create_encoder_spec(generatedVt_encoder_id);
		 pixbuf_spec = enc.create_pixbuf_spec();
		Object generatedWidth = this.getWidth();
		Object generatedHeight = this.getHeight();
		Object generatedQueue = this.getQueue();
		code = /*Error: Function owner not recognized*/VTCompressionSessionCreate(kCFAllocatorDefault, generatedWidth, generatedHeight, kCMVideoCodecType_H264, encoder_spec, pixbuf_spec, NULL, sample_encoded_callback, generatedQueue, s);
		if (code) {
			enc.log_osstatus(LOG_ERROR, "VTCompressionSessionCreate( kCFAllocatorDefault, enc->width, enc->height, kCMVideoCodecType_H264, encoder_spec, pixbuf_spec, NULL, &sample_encoded_callback, enc->queue, &s)", code);
			;
		} 
		;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CFRelease(encoder_spec);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CFRelease(pixbuf_spec);
		 b = NULL;
		code = /*Error: Function owner not recognized*/VTSessionCopyProperty(s, kVTCompressionPropertyKey_UsingHardwareAcceleratedVideoEncoder, NULL, b);
		obs_encoder generatedEncoder = this.getEncoder();
		if (code == noErr && (this.setHw_enc(/*Error: Function owner not recognized*/CFBooleanGetValue(b)))) {
			ModernizedCProgram.blog(LOG_INFO, "[VideoToolbox %s: 'h264']: session created with hardware encoding", ModernizedCProgram.obs_encoder_get_name(generatedEncoder));
		} else {
				this.setHw_enc(false);
		} 
		if (b != NULL) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CFRelease(b);
		} 
		Object generatedKeyint = this.getKeyint();
		code = ModernizedCProgram.session_set_prop_int(s, kVTCompressionPropertyKey_MaxKeyFrameIntervalDuration, generatedKeyint);
		if (code) {
			enc.log_osstatus(LOG_ERROR, "session_set_prop_int( s, kVTCompressionPropertyKey_MaxKeyFrameIntervalDuration, enc->keyint)", code);
			;
		} 
		;
		Object generatedFps_num = this.getFps_num();
		Object generatedFps_den = this.getFps_den();
		code = ModernizedCProgram.session_set_prop_int(s, kVTCompressionPropertyKey_MaxKeyFrameInterval, generatedKeyint * ((double)generatedFps_num / generatedFps_den));
		if (code) {
			enc.log_osstatus(LOG_ERROR, "session_set_prop_int( s, kVTCompressionPropertyKey_MaxKeyFrameInterval, enc->keyint * ((float)enc->fps_num / enc->fps_den))", code);
			;
		} 
		;
		code = ModernizedCProgram.session_set_prop_int(s, kVTCompressionPropertyKey_ExpectedFrameRate, /*Error: Function owner not recognized*/ceil((double)generatedFps_num / generatedFps_den));
		if (code) {
			enc.log_osstatus(LOG_ERROR, "session_set_prop_int( s, kVTCompressionPropertyKey_ExpectedFrameRate, ceil((float)enc->fps_num / enc->fps_den))", code);
			;
		} 
		;
		Object generatedBframes = this.getBframes();
		code = ModernizedCProgram.session_set_prop(s, kVTCompressionPropertyKey_AllowFrameReordering, generatedBframes ? kCFBooleanTrue : kCFBooleanFalse);
		if (code) {
			enc.log_osstatus(LOG_ERROR, "session_set_prop( s, kVTCompressionPropertyKey_AllowFrameReordering, enc->bframes ? kCFBooleanTrue : kCFBooleanFalse)", code);
			;
		} 
		;
		// This can fail depending on hardware configuration// This can fail depending on hardware configurationcode = ModernizedCProgram.session_set_prop(s, kVTCompressionPropertyKey_RealTime, kCFBooleanTrue);
		if (code != noErr) {
			enc.log_osstatus(LOG_WARNING, "setting kVTCompressionPropertyKey_RealTime, frame delay might be increased", code);
		} 
		Object generatedProfile = this.getProfile();
		code = ModernizedCProgram.session_set_prop(s, kVTCompressionPropertyKey_ProfileLevel, ModernizedCProgram.obs_to_vt_profile(generatedProfile));
		if (code) {
			enc.log_osstatus(LOG_ERROR, "session_set_prop(s, kVTCompressionPropertyKey_ProfileLevel, obs_to_vt_profile(enc->profile))", code);
			;
		} 
		;
		Object generatedBitrate = this.getBitrate();
		Object generatedLimit_bitrate = this.getLimit_bitrate();
		Object generatedRc_max_bitrate = this.getRc_max_bitrate();
		double generatedRc_max_bitrate_window = this.getRc_max_bitrate_window();
		code = ModernizedCProgram.session_set_bitrate(s, generatedBitrate, generatedLimit_bitrate, generatedRc_max_bitrate, generatedRc_max_bitrate_window);
		if (code) {
			enc.log_osstatus(LOG_ERROR, "session_set_bitrate(s, enc->bitrate, enc->limit_bitrate, enc->rc_max_bitrate, enc->rc_max_bitrate_window)", code);
			;
		} 
		;
		video_colorspace generatedColorspace = this.getColorspace();
		code = ModernizedCProgram.session_set_colorspace(s, generatedColorspace);
		if (code) {
			enc.log_osstatus(LOG_ERROR, "session_set_colorspace(s, enc->colorspace)", code);
			;
		} 
		;
		code = /*Error: Function owner not recognized*/VTCompressionSessionPrepareToEncodeFrames(s);
		if (code) {
			enc.log_osstatus(LOG_ERROR, "VTCompressionSessionPrepareToEncodeFrames(s)", code);
			;
		} 
		;
		this.setSession(s);
		return true;
		if (pixbuf_spec != NULL) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CFRelease(pixbuf_spec);
		} 
		return false;
		obs_encoder encoder = new obs_encoder();
		obs_encoder_info obs_encoder_info = new obs_encoder_info();
		obs_encoder_info ei = obs_encoder_info.find_encoder(id);
		 success = new ();
		obs_encoder_type generatedType = ei.getType();
		if (ei && generatedType != obs_encoder_type.type) {
			return NULL;
		} 
		encoder = ModernizedCProgram.bzalloc(/*Error: Unsupported expression*/);
		encoder.setMixer_idx(mixer_idx);
		obs_encoder_info generatedInfo = encoder.getInfo();
		if (!ei) {
			ModernizedCProgram.blog(LOG_ERROR, "Encoder ID '%s' not found", id);
			generatedInfo.setId(ModernizedCProgram.bstrdup(id));
			generatedInfo.setType(obs_encoder_type.type);
			encoder.setOwns_info_id(true);
			encoder.setOrig_info(generatedInfo);
		} else {
				encoder.setInfo(ei);
				encoder.setOrig_info(ei);
		} 
		success = ModernizedCProgram.init_encoder(encoder, name, settings, hotkey_data);
		if (!success) {
			ModernizedCProgram.blog(LOG_ERROR, "creating encoder '%s' (%s) failed", name, id);
			encoder.obs_encoder_destroy();
			return NULL;
		} 
		encoder.setControl(ModernizedCProgram.bzalloc(/*Error: Unsupported expression*/));
		obs_weak_encoder generatedControl = encoder.getControl();
		generatedControl.setEncoder(encoder);
		obs_context_data generatedContext = encoder.getContext();
		generatedContext.obs_context_data_insert(ModernizedCProgram.obs.getData().getEncoders_mutex(), ModernizedCProgram.obs.getData().getFirst_encoder());
		ModernizedCProgram.blog(LOG_DEBUG, "encoder '%s' (%s) created", name, id);
		return encoder;
	}
	public void dump_encoder_info() {
		obs_encoder generatedEncoder = this.getEncoder();
		Object generatedVt_encoder_id = this.getVt_encoder_id();
		Object generatedBitrate = this.getBitrate();
		Object generatedFps_num = this.getFps_num();
		Object generatedFps_den = this.getFps_den();
		Object generatedWidth = this.getWidth();
		Object generatedHeight = this.getHeight();
		Object generatedKeyint = this.getKeyint();
		Object generatedLimit_bitrate = this.getLimit_bitrate();
		Object generatedRc_max_bitrate = this.getRc_max_bitrate();
		double generatedRc_max_bitrate_window = this.getRc_max_bitrate_window();
		Object generatedHw_enc = this.getHw_enc();
		Object generatedProfile = this.getProfile();
		ModernizedCProgram.blog(LOG_INFO, "[VideoToolbox %s: 'h264']: settings:\n\tvt_encoder_id          %s\n\tbitrate:               %d (kbps)\n\tfps_num:               %d\n\tfps_den:               %d\n\twidth:                 %d\n\theight:                %d\n\tkeyint:                %d (s)\n\tlimit_bitrate:         %s\n\trc_max_bitrate:        %d (kbps)\n\trc_max_bitrate_window: %f (s)\n\thw_enc:                %s\n\tprofile:               %s\n", ModernizedCProgram.obs_encoder_get_name(generatedEncoder), generatedVt_encoder_id, generatedBitrate, generatedFps_num, generatedFps_den, generatedWidth, generatedHeight, generatedKeyint, generatedLimit_bitrate ? "on" : "off", generatedRc_max_bitrate, generatedRc_max_bitrate_window, generatedHw_enc ? "on" : "off", (generatedProfile != NULL && !!/*Error: Function owner not recognized*/strlen(generatedProfile)) ? generatedProfile : "default");
	}
	public void convert_block_nals_to_annexb(Object packet, Object block, int nal_length_bytes) {
		 block_size = new ();
		 block_buf = new ();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CMBlockBufferGetDataPointer(block, 0, NULL, block_size, (byte)block_buf);
		 bytes_remaining = block_size;
		obs_encoder generatedEncoder = this.getEncoder();
		while (bytes_remaining > 0) {
			 nal_size = new ();
			if (nal_length_bytes == 1) {
				nal_size = block_buf[0];
			}  else if (nal_length_bytes == 2) {
				nal_size = /*Error: Function owner not recognized*/CFSwapInt16BigToHost((()block_buf)[0]);
			}  else if (nal_length_bytes == 4) {
				nal_size = /*Error: Function owner not recognized*/CFSwapInt32BigToHost((()block_buf)[0]);
			} else {
					return /*Error: Unsupported expression*/;
			} 
			bytes_remaining -= nal_length_bytes;
			block_buf += nal_length_bytes;
			if (bytes_remaining < nal_size) {
				ModernizedCProgram.blog(LOG_ERROR, "[VideoToolbox %s: 'h264']: invalid nal block", ModernizedCProgram.obs_encoder_get_name(generatedEncoder));
				return /*Error: Unsupported expression*/;
			} 
			ModernizedCProgram.packet_put_startcode(packet, 3);
			ModernizedCProgram.packet_put(packet, block_buf, nal_size);
			bytes_remaining -= nal_size;
			block_buf += nal_size;
		}
	}
	public Object handle_keyframe(Object format_desc, Object param_count, Object packet, Object extra_data) {
		 code = new ();
		 param = new ();
		 param_size = new ();
		for ( i = 0;
		 i < param_count; i++) {
			code = /*Error: Function owner not recognized*/CMVideoFormatDescriptionGetH264ParameterSetAtIndex(format_desc, i, param, param_size, NULL, NULL);
			if (code != noErr) {
				enc.log_osstatus(LOG_ERROR, "getting NAL parameter at index", code);
				return false;
			} 
			ModernizedCProgram.packet_put_startcode(packet, 4);
			ModernizedCProgram.packet_put(packet, param, param_size);
		}
		// if we were passed an extra_data array, fill it with// SPS, PPS, etc.if (extra_data != NULL) {
			ModernizedCProgram.packet_put(extra_data, packet.getArray(), packet.getNum());
		} 
		return true;
	}
	public Object convert_sample_to_annexb(Object packet, Object extra_data, Object buffer, Object keyframe) {
		 code = new ();
		 format_desc = /*Error: Function owner not recognized*/CMSampleBufferGetFormatDescription(buffer);
		 param_count = new ();
		int nal_length_bytes;
		code = /*Error: Function owner not recognized*/CMVideoFormatDescriptionGetH264ParameterSetAtIndex(format_desc, 0, NULL, NULL, param_count, nal_length_bytes)// it is not clear what errors this function can return;// it is not clear what errors this function can return
		obs_encoder generatedEncoder = this.getEncoder();
		// so we check the two most reasonableif (code == .kCMFormatDescriptionBridgeError_InvalidParameter_ || code == kCMFormatDescriptionError_InvalidParameter) {
			ModernizedCProgram.blog(LOG_WARNING, "[VideoToolbox %s: 'h264']: assuming 2 parameter sets and 4 byte NAL length header", ModernizedCProgram.obs_encoder_get_name(generatedEncoder));
			param_count = 2;
			nal_length_bytes = 4;
		}  else if (code != noErr) {
			enc.log_osstatus(LOG_ERROR, "getting parameter count from sample", code);
			return false;
		} 
		if (keyframe && !enc.handle_keyframe(format_desc, param_count, packet, extra_data)) {
			return false;
		} 
		 block = /*Error: Function owner not recognized*/CMSampleBufferGetDataBuffer(buffer);
		enc.convert_block_nals_to_annexb(packet, block, nal_length_bytes);
		return true;
	}
	public Object get_cached_pixel_buffer(Object buf) {
		 code = new ();
		Object generatedSession = this.getSession();
		 pool = /*Error: Function owner not recognized*/VTCompressionSessionGetPixelBufferPool(generatedSession);
		if (!pool) {
			return kCVReturnError;
		} 
		 pixbuf = new ();
		code = /*Error: Function owner not recognized*/CVPixelBufferPoolCreatePixelBuffer(NULL, pool, pixbuf)// Why aren't these already set on the pixel buffer?// I would have expected pixel buffers from the session's;// Why aren't these already set on the pixel buffer?// I would have expected pixel buffers from the session's
		if (code) {
			enc.log_osstatus(LOG_ERROR, "CVPixelBufferPoolCreatePixelBuffer(NULL, pool, &pixbuf)", code);
			;
		} 
		;
		video_colorspace generatedColorspace = this.getColorspace();
		// pool to have the correct color space stuff set matrix = ModernizedCProgram.obs_to_vt_colorspace(generatedColorspace);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CVBufferSetAttachment(pixbuf, kCVImageBufferYCbCrMatrixKey, matrix, kCVAttachmentMode_ShouldPropagate);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CVBufferSetAttachment(pixbuf, kCVImageBufferColorPrimariesKey, kCVImageBufferColorPrimaries_ITU_R_709_2, kCVAttachmentMode_ShouldPropagate);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/CVBufferSetAttachment(pixbuf, kCVImageBufferTransferFunctionKey, kCVImageBufferTransferFunction_ITU_R_709_2, kCVAttachmentMode_ShouldPropagate);
		buf = pixbuf;
		return true;
	}
	public obs_encoder getEncoder() {
		return encoder;
	}
	public void setEncoder(obs_encoder newEncoder) {
		encoder = newEncoder;
	}
	public Object getVt_encoder_id() {
		return vt_encoder_id;
	}
	public void setVt_encoder_id(Object newVt_encoder_id) {
		vt_encoder_id = newVt_encoder_id;
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
	public Object getKeyint() {
		return keyint;
	}
	public void setKeyint(Object newKeyint) {
		keyint = newKeyint;
	}
	public Object getFps_num() {
		return fps_num;
	}
	public void setFps_num(Object newFps_num) {
		fps_num = newFps_num;
	}
	public Object getFps_den() {
		return fps_den;
	}
	public void setFps_den(Object newFps_den) {
		fps_den = newFps_den;
	}
	public Object getBitrate() {
		return bitrate;
	}
	public void setBitrate(Object newBitrate) {
		bitrate = newBitrate;
	}
	public Object getLimit_bitrate() {
		return limit_bitrate;
	}
	public void setLimit_bitrate(Object newLimit_bitrate) {
		limit_bitrate = newLimit_bitrate;
	}
	public Object getRc_max_bitrate() {
		return rc_max_bitrate;
	}
	public void setRc_max_bitrate(Object newRc_max_bitrate) {
		rc_max_bitrate = newRc_max_bitrate;
	}
	public double getRc_max_bitrate_window() {
		return rc_max_bitrate_window;
	}
	public void setRc_max_bitrate_window(double newRc_max_bitrate_window) {
		rc_max_bitrate_window = newRc_max_bitrate_window;
	}
	public Object getProfile() {
		return profile;
	}
	public void setProfile(Object newProfile) {
		profile = newProfile;
	}
	public Object getBframes() {
		return bframes;
	}
	public void setBframes(Object newBframes) {
		bframes = newBframes;
	}
	public video_format getObs_pix_fmt() {
		return obs_pix_fmt;
	}
	public void setObs_pix_fmt(video_format newObs_pix_fmt) {
		obs_pix_fmt = newObs_pix_fmt;
	}
	public int getVt_pix_fmt() {
		return vt_pix_fmt;
	}
	public void setVt_pix_fmt(int newVt_pix_fmt) {
		vt_pix_fmt = newVt_pix_fmt;
	}
	public video_colorspace getColorspace() {
		return colorspace;
	}
	public void setColorspace(video_colorspace newColorspace) {
		colorspace = newColorspace;
	}
	public Object getFullrange() {
		return fullrange;
	}
	public void setFullrange(Object newFullrange) {
		fullrange = newFullrange;
	}
	public Object getSession() {
		return session;
	}
	public void setSession(Object newSession) {
		session = newSession;
	}
	public Object getQueue() {
		return queue;
	}
	public void setQueue(Object newQueue) {
		queue = newQueue;
	}
	public Object getHw_enc() {
		return hw_enc;
	}
	public void setHw_enc(Object newHw_enc) {
		hw_enc = newHw_enc;
	}
}

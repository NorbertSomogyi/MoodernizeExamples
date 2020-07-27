package application;

/** Gets the current async video frame */
public class obs_source_frame {
	private Object data;
	private Object linesize;
	private Object width;
	private Object height;
	private Object timestamp;
	private video_format format;
	private Object color_matrix;
	private Object full_range;
	private Object color_range_min;
	private Object color_range_max;
	private Object flip;
	private Object refs;
	private Object prev_frame;
	
	public obs_source_frame(Object data, Object linesize, Object width, Object height, Object timestamp, video_format format, Object color_matrix, Object full_range, Object color_range_min, Object color_range_max, Object flip, Object refs, Object prev_frame) {
		setData(data);
		setLinesize(linesize);
		setWidth(width);
		setHeight(height);
		setTimestamp(timestamp);
		setFormat(format);
		setColor_matrix(color_matrix);
		setFull_range(full_range);
		setColor_range_min(color_range_min);
		setColor_range_max(color_range_max);
		setFlip(flip);
		setRefs(refs);
		setPrev_frame(prev_frame);
	}
	public obs_source_frame() {
	}
	
	public void get_frame(Object opaque) {
		ffmpeg_source s = opaque;
		obs_source generatedSource = s.getSource();
		generatedSource.obs_source_output_video(f);
	}
	public void preload_frame(Object opaque) {
		ffmpeg_source s = opaque;
		Object generatedClose_when_inactive = s.getClose_when_inactive();
		if (generatedClose_when_inactive) {
			return /*Error: Unsupported expression*/;
		} 
		Object generatedIs_clear_on_media_end = s.getIs_clear_on_media_end();
		Object generatedIs_looping = s.getIs_looping();
		obs_source generatedSource = s.getSource();
		if (generatedIs_clear_on_media_end || generatedIs_looping) {
			generatedSource.obs_source_preload_video(f);
		} 
	}
	public obs_source_frame get_prev_frame(obs_source source, Object updated) {
		obs_source_frame frame = NULL;
		Object generatedAsync_mutex = source.getAsync_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedAsync_mutex);
		obs_source_frame generatedCur_async_frame = source.getCur_async_frame();
		updated = generatedCur_async_frame != NULL;
		obs_source_frame generatedPrev_async_frame = source.getPrev_async_frame();
		frame = generatedPrev_async_frame;
		source.setPrev_async_frame(NULL);
		Object generatedRefs = frame.getRefs();
		if (frame) {
			ModernizedCProgram.os_atomic_inc_long(generatedRefs);
		} 
		ModernizedCProgram.pthread_mutex_unlock(generatedAsync_mutex);
		return frame;
	}
	public void obs_source_frame_init(video_format format, Object width, Object height) {
		video_frame vid_frame = new video_frame();
		if (!ModernizedCProgram.obs_object_valid(frame, "obs_source_frame_init", "frame")) {
			return /*Error: Unsupported expression*/;
		} 
		vid_frame.video_frame_init(video_format.format, width, height);
		this.setFormat(video_format.format);
		this.setWidth(width);
		this.setHeight(height);
		Object generatedData = this.getData();
		Object generatedVideo_frame = vid_frame.getVideo_frame();
		Object generatedLinesize = this.getLinesize();
		for ( i = 0;
		 i < MAX_AV_PLANES; i++) {
			generatedData[i] = generatedVideo_frame[i];
			generatedLinesize[i] = generatedVideo_frame[i];
		}
	}
	public void obs_source_frame_decref() {
		Object generatedRefs = this.getRefs();
		if (ModernizedCProgram.os_atomic_dec_long(generatedRefs) == 0) {
			frame.obs_source_frame_destroy();
		} 
	}
	public obs_source_frame filter_async_video(obs_source source) {
		 i = new ();
		Object generatedFilter_mutex = source.getFilter_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedFilter_mutex);
		Object generatedFilters = source.getFilters();
		Object generatedEnabled = filter.getEnabled();
		obs_context_data generatedContext = filter.getContext();
		Object[] generatedData = generatedContext.getData();
		obs_source_info generatedInfo = filter.getInfo();
		Object generatedFilter_video = generatedInfo.getFilter_video();
		for (i = generatedFilters.getNum(); i > 0; i--) {
			obs_source filter = generatedFilters.getArray()[i - 1];
			if (!generatedEnabled) {
				continue;
			} 
			if (generatedData && generatedFilter_video) {
				in = /*Error: Function owner not recognized*/ERROR_UNRECOGNIZED_FUNCTIONNAME(generatedData, in);
				if (!in) {
					break;
				} 
			} 
		}
		ModernizedCProgram.pthread_mutex_unlock(generatedFilter_mutex);
		return in;
	}
	public void copy_frame_data_line(Object src, Object plane, Object y) {
		uint32_t pos_src = y * src.getLinesize()[plane];
		Object generatedLinesize = this.getLinesize();
		uint32_t pos_dst = y * generatedLinesize[plane];
		uint32_t bytes = generatedLinesize[plane] < generatedLinesize[plane] ? generatedLinesize[plane] : generatedLinesize[plane];
		Object generatedData = this.getData();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedData[plane] + pos_dst, generatedData[plane] + pos_src, bytes);
	}
	public void copy_frame_data_plane(Object src, Object plane, Object lines) {
		Object generatedLinesize = this.getLinesize();
		Object generatedData = this.getData();
		if (generatedLinesize[plane] != generatedLinesize[plane]) {
			for (uint32_t y = 0;
			 y < lines; y++) {
				dst.copy_frame_data_line(src, plane, y);
			}
		} else {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedData[plane], generatedData[plane], generatedLinesize[plane] * lines);
		} 
	}
	public void copy_frame_data(Object src) {
		this.setFlip(src.getFlip());
		this.setFull_range(src.getFull_range());
		this.setTimestamp(src.getTimestamp());
		Object generatedColor_matrix = this.getColor_matrix();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedColor_matrix, generatedColor_matrix, /*Error: Unsupported expression*/ * 16);
		Object generatedFull_range = this.getFull_range();
		Object generatedColor_range_min = this.getColor_range_min();
		Object generatedColor_range_max = this.getColor_range_max();
		if (!generatedFull_range) {
			 size = /*Error: Unsupported expression*/ * 3;
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedColor_range_min, generatedColor_range_min, size);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memcpy(generatedColor_range_max, generatedColor_range_max, size);
		} 
		Object generatedHeight = this.getHeight();
		switch (src.getFormat()) {
		case VIDEO_FORMAT_YUY2:
		case VIDEO_FORMAT_BGRX:
		case VIDEO_FORMAT_I420:
				dst.copy_frame_data_plane(src, 0, generatedHeight);
				dst.copy_frame_data_plane(src, 1, generatedHeight / 2);
				dst.copy_frame_data_plane(src, 2, generatedHeight / 2);
				break;
		case VIDEO_FORMAT_BGR3:
		case VIDEO_FORMAT_UYVY:
		case VIDEO_FORMAT_RGBA:
		case VIDEO_FORMAT_NONE:
		case VIDEO_FORMAT_BGRA:
		case VIDEO_FORMAT_Y800:
		case VIDEO_FORMAT_AYUV:
				dst.copy_frame_data_plane(src, 0, generatedHeight);
				break;
		case VIDEO_FORMAT_I422:
				dst.copy_frame_data_plane(src, 0, generatedHeight);
				dst.copy_frame_data_plane(src, 1, generatedHeight);
				dst.copy_frame_data_plane(src, 2, generatedHeight);
				break;
		case VIDEO_FORMAT_I40A:
				dst.copy_frame_data_plane(src, 0, generatedHeight);
				dst.copy_frame_data_plane(src, 1, generatedHeight / 2);
				dst.copy_frame_data_plane(src, 2, generatedHeight / 2);
				dst.copy_frame_data_plane(src, 3, generatedHeight);
				break;
		case VIDEO_FORMAT_YUVA:
				dst.copy_frame_data_plane(src, 0, generatedHeight);
				dst.copy_frame_data_plane(src, 1, generatedHeight);
				dst.copy_frame_data_plane(src, 2, generatedHeight);
				dst.copy_frame_data_plane(src, 3, generatedHeight);
				break;
		case VIDEO_FORMAT_I42A:
		case VIDEO_FORMAT_NV12:
				dst.copy_frame_data_plane(src, 0, generatedHeight);
				dst.copy_frame_data_plane(src, 1, generatedHeight / 2);
				break;
		case VIDEO_FORMAT_YVYU:
		case VIDEO_FORMAT_I444:
		}
	}
	public void obs_source_frame_copy(Object src) {
		dst.copy_frame_data(src);
	}
	public obs_source_frame cache_video(obs_source source, Object frame) {
		obs_source_frame new_frame = NULL;
		Object generatedAsync_mutex = source.getAsync_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedAsync_mutex);
		Object generatedAsync_frames = source.getAsync_frames();
		if (generatedAsync_frames.getNum() >= 30) {
			source.free_async_cache();
			source.setLast_frame_ts(0);
			ModernizedCProgram.pthread_mutex_unlock(generatedAsync_mutex);
			return NULL;
		} 
		if (source.async_texture_changed(frame)) {
			source.free_async_cache();
			source.setAsync_cache_width(frame.getWidth());
			source.setAsync_cache_height(frame.getHeight());
		} 
		video_format format = frame.getFormat();
		source.setAsync_cache_format(format);
		source.setAsync_cache_full_range(frame.getFull_range());
		Object generatedAsync_cache = source.getAsync_cache();
		Object generatedUsed = af.getUsed();
		obs_source_frame generatedFrame = af.getFrame();
		for ( i = 0;
		 i < generatedAsync_cache.getNum(); i++) {
			async_frame af = generatedAsync_cache.getArray()[i];
			if (!generatedUsed) {
				new_frame = generatedFrame;
				new_frame.setFormat(format);
				af.setUsed(true);
				af.setUnused_count(0);
				break;
			} 
		}
		source.clean_cache();
		obs_source_frame obs_source_frame = new obs_source_frame();
		if (!new_frame) {
			async_frame new_af = new async_frame();
			new_frame = obs_source_frame.obs_source_frame_create(format, frame.getWidth(), frame.getHeight());
			new_af.setFrame(new_frame);
			new_af.setUsed(true);
			new_af.setUnused_count(0);
			new_frame.setRefs(1);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_push_back(generatedAsync_cache, new_af);
		} 
		Object generatedRefs = new_frame.getRefs();
		ModernizedCProgram.os_atomic_inc_long(generatedRefs);
		ModernizedCProgram.pthread_mutex_unlock(generatedAsync_mutex);
		new_frame.copy_frame_data(frame);
		return new_frame;
	}
	public obs_source_frame get_closest_frame(obs_source source, Object sys_time) {
		Object generatedAsync_frames = source.getAsync_frames();
		if (!generatedAsync_frames.getNum()) {
			return NULL;
		} 
		Object generatedLast_frame_ts = source.getLast_frame_ts();
		Object generatedTimestamp = frame.getTimestamp();
		if (!generatedLast_frame_ts || source.ready_async_frame(sys_time)) {
			obs_source_frame frame = generatedAsync_frames.getArray()[0];
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_erase(generatedAsync_frames, 0);
			if (!generatedLast_frame_ts) {
				source.setLast_frame_ts(generatedTimestamp);
			} 
			return frame;
		} 
		return NULL/*
		 * Ensures that cached frames are displayed on time.  If multiple frames
		 * were cached between renders, then releases the unnecessary frames and uses
		 * the frame with the closest timing to ensure sync.  Also ensures that timing
		 * with audio is synchronized.
		 */;
	}
	public obs_source_frame obs_source_get_frame(obs_source source) {
		obs_source_frame frame = NULL;
		if (!ModernizedCProgram.obs_object_valid(source, "obs_source_get_frame", "source")) {
			return NULL;
		} 
		Object generatedAsync_mutex = source.getAsync_mutex();
		ModernizedCProgram.pthread_mutex_lock(generatedAsync_mutex);
		obs_source_frame generatedCur_async_frame = source.getCur_async_frame();
		frame = generatedCur_async_frame;
		source.setCur_async_frame(NULL);
		Object generatedRefs = frame.getRefs();
		if (frame) {
			ModernizedCProgram.os_atomic_inc_long(generatedRefs);
		} 
		ModernizedCProgram.pthread_mutex_unlock(generatedAsync_mutex);
		return frame;
	}
	public void obs_source_frame_free() {
		Object generatedData = this.getData();
		if (frame) {
			ModernizedCProgram.bfree(generatedData[0]);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(frame, 0, /*Error: sizeof expression not supported yet*/);
		} 
	}
	public obs_source_frame obs_source_frame_create(video_format format, Object width, Object height) {
		obs_source_frame frame = new obs_source_frame();
		frame = (obs_source_frame)ModernizedCProgram.bzalloc(/*Error: sizeof expression not supported yet*/);
		frame.obs_source_frame_init(video_format.format, width, height);
		return frame;
	}
	public void obs_source_frame_destroy() {
		Object generatedData = this.getData();
		if (frame) {
			ModernizedCProgram.bfree(generatedData[0]);
			ModernizedCProgram.bfree(frame);
		} 
	}
	public obs_source_frame async_delay_filter_video(Object data) {
		async_delay_data filter = data;
		obs_source generatedContext = filter.getContext();
		obs_source obs_source = new obs_source();
		obs_source_t parent = obs_source.obs_filter_get_parent(generatedContext);
		obs_source_frame output = new obs_source_frame();
		 cur_interval = new ();
		Object generatedReset_video = filter.getReset_video();
		Object generatedTimestamp = this.getTimestamp();
		Object generatedLast_video_ts = filter.getLast_video_ts();
		if (generatedReset_video || ModernizedCProgram.is_timestamp_jump(generatedTimestamp, generatedLast_video_ts)) {
			ModernizedCProgram.free_video_data(filter, parent);
			filter.setVideo_delay_reached(false);
			filter.setReset_video(false);
		} 
		filter.setLast_video_ts(generatedTimestamp);
		circlebuf generatedVideo_frames = filter.getVideo_frames();
		generatedVideo_frames.circlebuf_push_back(frame, /*Error: Unsupported expression*/);
		generatedVideo_frames.circlebuf_peek_front(output, /*Error: Unsupported expression*/);
		cur_interval = generatedTimestamp - generatedTimestamp;
		Object generatedVideo_delay_reached = filter.getVideo_delay_reached();
		Object generatedInterval = filter.getInterval();
		if (!generatedVideo_delay_reached && cur_interval < generatedInterval) {
			return NULL;
		} 
		generatedVideo_frames.circlebuf_pop_front(NULL, /*Error: Unsupported expression*/);
		if (!generatedVideo_delay_reached) {
			filter.setVideo_delay_reached(true);
		} 
		return output/* NOTE: Delaying audio shouldn't be necessary because the audio subsystem will
		 * automatically sync audio to video frames */;/* #define DELAY_AUDIO */
	}
	public Object getData() {
		return data;
	}
	public void setData(Object newData) {
		data = newData;
	}
	public Object getLinesize() {
		return linesize;
	}
	public void setLinesize(Object newLinesize) {
		linesize = newLinesize;
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
	public Object getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Object newTimestamp) {
		timestamp = newTimestamp;
	}
	public video_format getFormat() {
		return format;
	}
	public void setFormat(video_format newFormat) {
		format = newFormat;
	}
	public Object getColor_matrix() {
		return color_matrix;
	}
	public void setColor_matrix(Object newColor_matrix) {
		color_matrix = newColor_matrix;
	}
	public Object getFull_range() {
		return full_range;
	}
	public void setFull_range(Object newFull_range) {
		full_range = newFull_range;
	}
	public Object getColor_range_min() {
		return color_range_min;
	}
	public void setColor_range_min(Object newColor_range_min) {
		color_range_min = newColor_range_min;
	}
	public Object getColor_range_max() {
		return color_range_max;
	}
	public void setColor_range_max(Object newColor_range_max) {
		color_range_max = newColor_range_max;
	}
	public Object getFlip() {
		return flip;
	}
	public void setFlip(Object newFlip) {
		flip = newFlip;
	}
	public Object getRefs() {
		return refs;
	}
	public void setRefs(Object newRefs) {
		refs = newRefs;
	}
	public Object getPrev_frame() {
		return prev_frame;
	}
	public void setPrev_frame(Object newPrev_frame) {
		prev_frame = newPrev_frame;
	}
}
/**
 * Default RGB filter handler for generic effect filters.  Processes the
 * filter chain and renders them to texture if needed, then the filter is
 * drawn with
 *
 * After calling this, set your parameters for the effect, then call
 * obs_source_process_filter_end to draw the filter.
 *
 * Returns true if filtering should continue, false if the filter is bypassed
 * for whatever reason.
 */

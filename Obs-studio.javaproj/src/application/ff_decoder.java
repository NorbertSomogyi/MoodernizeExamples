package application;

/*
 * Copyright (c) 2015 John R. Bradley <jrb@turrettech.com>
 *
 * Permission to use, copy, modify, and distribute this software for any
 * purpose with or without fee is hereby granted, provided that the above
 * copyright notice and this permission notice appear in all copies.
 *
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES
 * WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR
 * ANY SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
 * WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN
 * ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF
 * OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 */
public class ff_decoder {
	private Object codec;
	private Object stream;
	private Object decoder_thread;
	private ff_timer refresh_timer;
	private ff_callbacks callbacks;
	private ff_packet_queue packet_queue;
	private ff_circular_queue frame_queue;
	private int packet_queue_size;
	private double timer_next_wake;
	private double previous_pts;
	private double previous_pts_diff;
	private double predicted_pts;
	private double current_pts;
	private Object current_pts_time;
	private Object start_pts;
	private boolean hwaccel_decoder;
	private AVDiscard frame_drop;
	private ff_clock clock;
	private ff_av_sync_type natural_sync_clock;
	private boolean first_frame;
	private boolean eof;
	private boolean abort;
	private boolean finished;
	
	public ff_decoder(Object codec, Object stream, Object decoder_thread, ff_timer refresh_timer, ff_callbacks callbacks, ff_packet_queue packet_queue, ff_circular_queue frame_queue, int packet_queue_size, double timer_next_wake, double previous_pts, double previous_pts_diff, double predicted_pts, double current_pts, Object current_pts_time, Object start_pts, boolean hwaccel_decoder, AVDiscard frame_drop, ff_clock clock, ff_av_sync_type natural_sync_clock, boolean first_frame, boolean eof, boolean abort, boolean finished) {
		setCodec(codec);
		setStream(stream);
		setDecoder_thread(decoder_thread);
		setRefresh_timer(refresh_timer);
		setCallbacks(callbacks);
		setPacket_queue(packet_queue);
		setFrame_queue(frame_queue);
		setPacket_queue_size(packet_queue_size);
		setTimer_next_wake(timer_next_wake);
		setPrevious_pts(previous_pts);
		setPrevious_pts_diff(previous_pts_diff);
		setPredicted_pts(predicted_pts);
		setCurrent_pts(current_pts);
		setCurrent_pts_time(current_pts_time);
		setStart_pts(start_pts);
		setHwaccel_decoder(hwaccel_decoder);
		setFrame_drop(frame_drop);
		setClock(clock);
		setNatural_sync_clock(natural_sync_clock);
		setFirst_frame(first_frame);
		setEof(eof);
		setAbort(abort);
		setFinished(finished);
	}
	public ff_decoder() {
	}
	
	public ff_decoder ff_decoder_init(Object codec_context, Object stream, int packet_queue_size, int frame_queue_size) {
		boolean success;
		((codec_context != ((Object)0)) ? (Object)0 : ._assert("codec_context != NULL", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\ff-decoder.c", 34));
		((stream != ((Object)0)) ? (Object)0 : ._assert("stream != NULL", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\ff-decoder.c", 35));
		ff_decoder decoder = .av_mallocz();
		if (decoder == ((Object)0)) {
			;
		} 
		decoder.setCodec(codec_context);
		Object generatedCodec = decoder.getCodec();
		generatedCodec.setOpaque(decoder);
		decoder.setStream(stream);
		decoder.setAbort(0);
		decoder.setFinished(0);
		decoder.setPacket_queue_size(packet_queue_size);
		ff_packet_queue generatedPacket_queue = decoder.getPacket_queue();
		if (!generatedPacket_queue.packet_queue_init()) {
			;
		} 
		decoder.setTimer_next_wake((double).av_gettime() / 1000000.0);
		decoder.setPrevious_pts_diff(0.04);
		decoder.setCurrent_pts_time(.av_gettime());
		decoder.setStart_pts(0);
		decoder.setPredicted_pts(0);
		decoder.setFirst_frame(1);
		ff_timer generatedRefresh_timer = decoder.getRefresh_timer();
		success = generatedRefresh_timer.ff_timer_init(ModernizedCProgram.ff_decoder_refresh, decoder);
		if (!success) {
			;
		} 
		ff_circular_queue generatedFrame_queue = decoder.getFrame_queue();
		success = generatedFrame_queue.ff_circular_queue_init(, frame_queue_size);
		if (!success) {
			;
		} 
		return decoder;
	}
	public boolean ff_decoder_start() {
		((decoder != ((Object)0)) ? (Object)0 : ._assert("decoder != NULL", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\ff-decoder.c", 84));
		ff_decoder_thread_t decoder_thread = new ff_decoder_thread_t();
		Object generatedCodec = this.getCodec();
		if (generatedCodec.getCodec_type() == AVMEDIA_TYPE_AUDIO) {
			decoder_thread = ModernizedCProgram.ff_audio_decoder_thread;
		}  else if (generatedCodec.getCodec_type() == AVMEDIA_TYPE_VIDEO) {
			decoder_thread = ModernizedCProgram.ff_video_decoder_thread;
		} else {
				.av_log(((Object)0), AV_LOG_ERROR, "no decoder found for type %d", generatedCodec.getCodec_type());
				return 0;
		} 
		decoder.ff_decoder_schedule_refresh(40);
		Object generatedDecoder_thread = this.getDecoder_thread();
		return (ModernizedCProgram.pthread_create(generatedDecoder_thread, ((Object)0), decoder_thread, decoder) != 0);
	}
	public void ff_decoder_free() {
		Object decoder_thread_result;
		int i;
		((decoder != ((Object)0)) ? (Object)0 : ._assert("decoder != NULL", "E:\\Programfiles\\Eclipse\\Workspaces\\runtime-EclipseApplication\\Obs-studio\\src\\ff-decoder.c", 108));
		this.setAbort(1);
		ff_circular_queue generatedFrame_queue = this.getFrame_queue();
		generatedFrame_queue.ff_circular_queue_abort();
		ff_packet_queue generatedPacket_queue = this.getPacket_queue();
		generatedPacket_queue.packet_queue_abort();
		ff_timer generatedRefresh_timer = this.getRefresh_timer();
		generatedRefresh_timer.ff_timer_free();
		Object generatedDecoder_thread = this.getDecoder_thread();
		ModernizedCProgram.pthread_join(generatedDecoder_thread, decoder_thread_result);
		int generatedCapacity = generatedFrame_queue.getCapacity();
		Object generatedSlots = generatedFrame_queue.getSlots();
		ff_callbacks generatedCallbacks = this.getCallbacks();
		Object generatedFrame = frame.getFrame();
		ff_clock generatedClock = frame.getClock();
		for (i = 0; i < generatedCapacity; i++) {
			Object item = generatedSlots[i];
			ff_frame frame = (ff_frame)item;
			ModernizedCProgram.ff_callbacks_frame_free(frame, generatedCallbacks);
			if (frame != ((Object)0)) {
				if (generatedFrame != ((Object)0)) {
					.av_frame_unref(generatedFrame);
				} 
				if (generatedClock != ((Object)0)) {
					generatedClock.ff_clock_release();
				} 
				.av_free(frame);
			} 
		}
		generatedPacket_queue.packet_queue_free();
		generatedFrame_queue.ff_circular_queue_free();
		Object generatedCodec = this.getCodec();
		.avcodec_close(generatedCodec);
		.av_free(decoder);
	}
	public void ff_decoder_schedule_refresh(int delay) {
		ff_timer generatedRefresh_timer = this.getRefresh_timer();
		generatedRefresh_timer.ff_timer_schedule(1000 * delay);
	}
	public boolean ff_decoder_full() {
		if (decoder == ((Object)0)) {
			return 0;
		} 
		ff_packet_queue generatedPacket_queue = this.getPacket_queue();
		int generatedTotal_size = generatedPacket_queue.getTotal_size();
		int generatedPacket_queue_size = this.getPacket_queue_size();
		return (generatedTotal_size > generatedPacket_queue_size);
	}
	public double ff_decoder_get_best_effort_pts(Object frame) {
		// this is how long each frame is added to the amount of repeated frames// according to the codecdouble estimated_frame_delay;
		int64_t best_effort_pts = new int64_t();
		double d_pts;
		// This function is ffmpeg only, replace with frame->pkt_pts
		// if you are trying to compile for libav as a temporary// measure// if you are trying to compile for libav as a temporary// measurebest_effort_pts = .av_frame_get_best_effort_timestamp(frame);
		Object generatedStart_pts = this.getStart_pts();
		boolean generatedFirst_frame = this.getFirst_frame();
		Object generatedStream = this.getStream();
		double generatedPredicted_pts = this.getPredicted_pts();
		if (best_effort_pts != AV_NOPTS_VALUE) {
			if (best_effort_pts < generatedStart_pts) {
				if (generatedFirst_frame) {
					best_effort_pts = generatedStart_pts;
				} else {
						.av_log(((Object)0), AV_LOG_WARNING, "multiple pts < start_pts; setting start pts to 0");
						this.setStart_pts(0);
				} 
			} 
			best_effort_pts -= generatedStart_pts;
			d_pts = best_effort_pts * .av_q2d(generatedStream.getTime_base());
			this.setPredicted_pts(d_pts);
		} else {
				d_pts = generatedPredicted_pts;
		} 
		// Fix the first pts if less than start_pts
		Object generatedCodec = this.getCodec();
		// Update our predicted pts to include the repeated picture count// Our predicted pts clock is based on the codecs time base// Update our predicted pts to include the repeated picture count// Our predicted pts clock is based on the codecs time baseestimated_frame_delay = .av_frame_get_pkt_duration(frame) * .av_q2d(generatedCodec.getTime_base());
		// Add repeat frame delay// Add repeat frame delayestimated_frame_delay += frame.getRepeat_pict() / (-1024.0 / estimated_frame_delay);
		generatedPredicted_pts += estimated_frame_delay;
		return d_pts;
	}
	public boolean ff_decoder_set_frame_drop_state(Object start_time, Object pts) {
		Object generatedStream = this.getStream();
		AVDiscard generatedFrame_drop = this.getFrame_drop();
		Object generatedCodec = this.getCodec();
		if (pts != AV_NOPTS_VALUE) {
			int64_t rescaled_pts = .av_rescale_q(pts, generatedStream.getTime_base(), AV_TIME_BASE_Q);
			int64_t master_clock = .av_gettime() - start_time;
			int64_t diff = master_clock - rescaled_pts;
			if (diff > (AV_TIME_BASE / 2)) {
				generatedCodec.setSkip_frame(generatedFrame_drop);
				generatedCodec.setSkip_idct(generatedFrame_drop);
				generatedCodec.setSkip_loop_filter(generatedFrame_drop);
				return 1;
			} else {
					generatedCodec.setSkip_frame(AVDISCARD_DEFAULT);
					generatedCodec.setSkip_idct(AVDISCARD_DEFAULT);
					generatedCodec.setSkip_loop_filter(AVDISCARD_DEFAULT);
					return 0;
			} 
		} 
		return 0;
	}
	public boolean queue_frame(Object frame, double best_effort_pts) {
		ff_frame queue_frame = new ff_frame();
		boolean call_initialize;
		ff_circular_queue generatedFrame_queue = this.getFrame_queue();
		generatedFrame_queue.ff_circular_queue_wait_write();
		boolean generatedAbort = this.getAbort();
		if (generatedAbort) {
			return 0;
		} 
		queue_frame = generatedFrame_queue.ff_circular_queue_peek_write();
		Object generatedCodec = this.getCodec();
		 codec = generatedCodec;
		Object generatedFrame = queue_frame.getFrame();
		call_initialize = (generatedFrame == ((Object)0) || generatedFrame.getChannels() != codec.getChannels() || generatedFrame.getSample_rate() != codec.getSample_rate() || generatedFrame.getFormat() != codec.getSample_fmt());
		if (generatedFrame != ((Object)0)) {
			.av_frame_free(generatedFrame);
		} 
		//FIXME: this shouldn't happen any more!
		queue_frame.setFrame(.av_frame_clone(frame));
		ff_clock generatedClock = this.getClock();
		queue_frame.setClock(generatedClock.ff_clock_retain());
		ff_callbacks generatedCallbacks = this.getCallbacks();
		if (call_initialize) {
			ModernizedCProgram.ff_callbacks_frame_initialize(queue_frame, generatedCallbacks);
		} 
		queue_frame.setPts(best_effort_pts);
		generatedFrame_queue.ff_circular_queue_advance_write(queue_frame);
		return 1;
		circlebuf generatedGpu_encoder_avail_queue = video.getGpu_encoder_avail_queue();
		Object generatedCirclebuf = generatedGpu_encoder_avail_queue.getCirclebuf();
		int generatedCount = vframe_info.getCount();
		 duplicate = !generatedCirclebuf || (generatedCirclebuf && generatedCount > 1);
		circlebuf generatedGpu_encoder_queue = video.getGpu_encoder_queue();
		Object generatedGpu_encode_semaphore = video.getGpu_encode_semaphore();
		if (duplicate) {
			obs_tex_frame tf = generatedGpu_encoder_queue.circlebuf_data(generatedCirclebuf - );
			if (!/* texture-based encoding is stopping */tf) {
				return false;
			} 
			generatedCount++;
			generatedGpu_encode_semaphore.os_sem_post();
			;
		} 
		obs_tex_frame tf = new obs_tex_frame();
		generatedGpu_encoder_avail_queue.circlebuf_pop_front(tf, );
		Object generatedReleased = tf.getReleased();
		Object generatedTex = tf.getTex();
		Object generatedLock_key = tf.getLock_key();
		if (generatedReleased) {
			generatedTex.gs_texture_acquire_sync(generatedLock_key, GS_WAIT_INFINITE);
			tf.setReleased(false/* the vframe_info->count > 1 case causing a copy can only happen if by
				 * some chance the very first frame has to be duplicated for whatever
				 * reason.  otherwise, it goes to the 'duplicate' case above, which
				 * will ensure better performance. */);
		} 
		Object generatedConvert_textures = video.getConvert_textures();
		Object generatedTex_uv = tf.getTex_uv();
		if (raw_active || generatedCount > 1) {
			generatedTex.gs_copy_texture(generatedConvert_textures[0]);
		} else {
				 tex = generatedConvert_textures[0];
				 tex_uv = generatedConvert_textures[1];
				generatedConvert_textures[0] = generatedTex;
				generatedConvert_textures[1] = generatedTex_uv;
				tf.setTex(tex);
				tf.setTex_uv(tex_uv);
		} 
		tf.setCount(1);
		Object generatedTimestamp = vframe_info.getTimestamp();
		tf.setTimestamp(generatedTimestamp);
		tf.setReleased(true);
		tf.setHandle(generatedTex.gs_texture_get_shared_handle());
		generatedTex.gs_texture_release_sync(++generatedLock_key);
		generatedGpu_encoder_queue.circlebuf_push_back(tf, );
		generatedGpu_encode_semaphore.os_sem_post();
		ff_frame queue_frame = new ff_frame();
		boolean call_initialize;
		ff_circular_queue generatedFrame_queue = this.getFrame_queue();
		generatedFrame_queue.ff_circular_queue_wait_write();
		boolean generatedAbort = this.getAbort();
		if (generatedAbort) {
			return 0;
		} 
		queue_frame = generatedFrame_queue.ff_circular_queue_peek_write()// Check if we need to communicate a different format has been received;// Check if we need to communicate a different format has been received
		Object generatedCodec = this.getCodec();
		// to any callbacks codec = generatedCodec;
		Object generatedFrame = queue_frame.getFrame();
		call_initialize = (generatedFrame == ((Object)0) || generatedFrame.getWidth() != codec.getWidth() || generatedFrame.getHeight() != codec.getHeight() || generatedFrame.getFormat() != codec.getPix_fmt());
		if (generatedFrame != ((Object)0)) {
			.av_frame_free(generatedFrame);
		} 
		// This shouldn't happen any more, the frames are freed in
		queue_frame.setFrame(.av_frame_clone(frame));
		ff_clock generatedClock = this.getClock();
		queue_frame.setClock(generatedClock.ff_clock_retain());
		ff_callbacks generatedCallbacks = this.getCallbacks();
		if (call_initialize) {
			ModernizedCProgram.ff_callbacks_frame_initialize(queue_frame, generatedCallbacks);
		} 
		queue_frame.setPts(best_effort_pts);
		generatedFrame_queue.ff_circular_queue_advance_write(queue_frame);
		return 1;
	}
	public void set_decoder_start_time(Object start_time) {
		Object generatedStream = this.getStream();
		if (decoder) {
			this.setStart_pts(.av_rescale_q(start_time, AV_TIME_BASE_Q, generatedStream.getTime_base()));
		} 
	}
	public Object getCodec() {
		return codec;
	}
	public void setCodec(Object newCodec) {
		codec = newCodec;
	}
	public Object getStream() {
		return stream;
	}
	public void setStream(Object newStream) {
		stream = newStream;
	}
	public Object getDecoder_thread() {
		return decoder_thread;
	}
	public void setDecoder_thread(Object newDecoder_thread) {
		decoder_thread = newDecoder_thread;
	}
	public ff_timer getRefresh_timer() {
		return refresh_timer;
	}
	public void setRefresh_timer(ff_timer newRefresh_timer) {
		refresh_timer = newRefresh_timer;
	}
	public ff_callbacks getCallbacks() {
		return callbacks;
	}
	public void setCallbacks(ff_callbacks newCallbacks) {
		callbacks = newCallbacks;
	}
	public ff_packet_queue getPacket_queue() {
		return packet_queue;
	}
	public void setPacket_queue(ff_packet_queue newPacket_queue) {
		packet_queue = newPacket_queue;
	}
	public ff_circular_queue getFrame_queue() {
		return frame_queue;
	}
	public void setFrame_queue(ff_circular_queue newFrame_queue) {
		frame_queue = newFrame_queue;
	}
	public int getPacket_queue_size() {
		return packet_queue_size;
	}
	public void setPacket_queue_size(int newPacket_queue_size) {
		packet_queue_size = newPacket_queue_size;
	}
	public double getTimer_next_wake() {
		return timer_next_wake;
	}
	public void setTimer_next_wake(double newTimer_next_wake) {
		timer_next_wake = newTimer_next_wake;
	}
	public double getPrevious_pts() {
		return previous_pts;
	}
	public void setPrevious_pts(double newPrevious_pts) {
		previous_pts = newPrevious_pts;
	}
	public double getPrevious_pts_diff() {
		return previous_pts_diff;
	}
	public void setPrevious_pts_diff(double newPrevious_pts_diff) {
		previous_pts_diff = newPrevious_pts_diff;
	}
	public double getPredicted_pts() {
		return predicted_pts;
	}
	public void setPredicted_pts(double newPredicted_pts) {
		predicted_pts = newPredicted_pts;
	}
	public double getCurrent_pts() {
		return current_pts;
	}
	public void setCurrent_pts(double newCurrent_pts) {
		current_pts = newCurrent_pts;
	}
	public Object getCurrent_pts_time() {
		return current_pts_time;
	}
	public void setCurrent_pts_time(Object newCurrent_pts_time) {
		current_pts_time = newCurrent_pts_time;
	}
	public Object getStart_pts() {
		return start_pts;
	}
	public void setStart_pts(Object newStart_pts) {
		start_pts = newStart_pts;
	}
	public boolean getHwaccel_decoder() {
		return hwaccel_decoder;
	}
	public void setHwaccel_decoder(boolean newHwaccel_decoder) {
		hwaccel_decoder = newHwaccel_decoder;
	}
	public AVDiscard getFrame_drop() {
		return frame_drop;
	}
	public void setFrame_drop(AVDiscard newFrame_drop) {
		frame_drop = newFrame_drop;
	}
	public ff_clock getClock() {
		return clock;
	}
	public void setClock(ff_clock newClock) {
		clock = newClock;
	}
	public ff_av_sync_type getNatural_sync_clock() {
		return natural_sync_clock;
	}
	public void setNatural_sync_clock(ff_av_sync_type newNatural_sync_clock) {
		natural_sync_clock = newNatural_sync_clock;
	}
	public boolean getFirst_frame() {
		return first_frame;
	}
	public void setFirst_frame(boolean newFirst_frame) {
		first_frame = newFirst_frame;
	}
	public boolean getEof() {
		return eof;
	}
	public void setEof(boolean newEof) {
		eof = newEof;
	}
	public boolean getAbort() {
		return abort;
	}
	public void setAbort(boolean newAbort) {
		abort = newAbort;
	}
	public boolean getFinished() {
		return finished;
	}
	public void setFinished(boolean newFinished) {
		finished = newFinished;
	}
}

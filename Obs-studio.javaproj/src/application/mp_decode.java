package application;

public class mp_decode {
	private mp_media m;
	private Object stream;
	private Object audio;
	private Object decoder;
	private Object hw_ctx;
	private Object codec;
	private Object last_duration;
	private Object frame_pts;
	private Object next_pts;
	private Object in_frame;
	private Object sw_frame;
	private Object hw_frame;
	private Object frame;
	private AVPixelFormat hw_format;
	private Object got_first_keyframe;
	private Object frame_ready;
	private Object eof;
	private Object hw;
	private Object orig_pkt;
	private Object pkt;
	private Object packet_pending;
	private circlebuf packets;
	
	public mp_decode(mp_media m, Object stream, Object audio, Object decoder, Object hw_ctx, Object codec, Object last_duration, Object frame_pts, Object next_pts, Object in_frame, Object sw_frame, Object hw_frame, Object frame, AVPixelFormat hw_format, Object got_first_keyframe, Object frame_ready, Object eof, Object hw, Object orig_pkt, Object pkt, Object packet_pending, circlebuf packets) {
		setM(m);
		setStream(stream);
		setAudio(audio);
		setDecoder(decoder);
		setHw_ctx(hw_ctx);
		setCodec(codec);
		setLast_duration(last_duration);
		setFrame_pts(frame_pts);
		setNext_pts(next_pts);
		setIn_frame(in_frame);
		setSw_frame(sw_frame);
		setHw_frame(hw_frame);
		setFrame(frame);
		setHw_format(hw_format);
		setGot_first_keyframe(got_first_keyframe);
		setFrame_ready(frame_ready);
		setEof(eof);
		setHw(hw);
		setOrig_pkt(orig_pkt);
		setPkt(pkt);
		setPacket_pending(packet_pending);
		setPackets(packets);
	}
	public mp_decode() {
	}
	
	public mp_decode get_packet_decoder(mp_media media, Object pkt) {
		Object generatedHas_audio = media.getHas_audio();
		mp_decode generatedA = media.getA();
		Object generatedStream = generatedA.getStream();
		if (generatedHas_audio && pkt.getStream_index() == generatedStream.getIndex()) {
			return generatedA;
		} 
		Object generatedHas_video = media.getHas_video();
		mp_decode generatedV = media.getV();
		if (generatedHas_video && pkt.getStream_index() == generatedStream.getIndex()) {
			return generatedV;
		} 
		return NULL;
	}
	public Object mp_decode_frame() {
		Object generatedFrame_ready = this.getFrame_ready();
		return generatedFrame_ready || d.mp_decode_next();
	}
	/*
	 * Copyright (c) 2017 Hugh Bailey <obs.jim@gmail.com>
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
	public int mp_open_codec(Object hw) {
		 c = new ();
		int ret;
		Object generatedCodec = this.getCodec();
		c = .avcodec_alloc_context3(generatedCodec);
		if (!c) {
			ModernizedCProgram.blog(LOG_WARNING, "MP: Failed to allocate context");
			return -1;
		} 
		Object generatedStream = this.getStream();
		ret = .avcodec_parameters_to_context(c, generatedStream.getCodecpar());
		if (ret < 0) {
			;
		} 
		this.setHw(false);
		if (c.getThread_count() == 1 && c.getCodec_id() != AV_CODEC_ID_PNG && c.getCodec_id() != AV_CODEC_ID_TIFF && c.getCodec_id() != AV_CODEC_ID_JPEG2000 && c.getCodec_id() != AV_CODEC_ID_MPEG4 && c.getCodec_id() != AV_CODEC_ID_WEBP) {
			c.setThread_count(0);
		} 
		ret = .avcodec_open2(c, generatedCodec, NULL);
		if (ret < 0) {
			;
		} 
		this.setDecoder(c);
		return ret;
		Object generatedDecoder = this.getDecoder();
		.av_free(generatedDecoder);
		return ret;
	}
	public void mp_decode_clear_packets() {
		Object generatedPacket_pending = this.getPacket_pending();
		Object generatedOrig_pkt = this.getOrig_pkt();
		if (generatedPacket_pending) {
			.av_packet_unref(generatedOrig_pkt);
			this.setPacket_pending(false);
		} 
		circlebuf generatedPackets = this.getPackets();
		Object generatedCirclebuf = generatedPackets.getCirclebuf();
		while (generatedCirclebuf) {
			 pkt = new ();
			generatedPackets.circlebuf_pop_front(pkt, );
			.av_packet_unref(pkt);
		}
	}
	public void mp_decode_free() {
		d.mp_decode_clear_packets();
		circlebuf generatedPackets = this.getPackets();
		generatedPackets.circlebuf_free();
		Object generatedHw_frame = this.getHw_frame();
		if (generatedHw_frame) {
			.av_frame_unref(generatedHw_frame);
			.av_free(generatedHw_frame);
		} 
		Object generatedDecoder = this.getDecoder();
		if (generatedDecoder) {
			.avcodec_free_context(generatedDecoder);
		} 
		Object generatedSw_frame = this.getSw_frame();
		if (generatedSw_frame) {
			.av_frame_unref(generatedSw_frame);
			.av_free(generatedSw_frame);
		} 
		.memset(d, 0, );
	}
	public void mp_decode_push_packet(Object packet) {
		circlebuf generatedPackets = this.getPackets();
		generatedPackets.circlebuf_push_back(packet, );
	}
	public Object get_estimated_duration(Object last_pts) {
		Object generatedFrame_pts = this.getFrame_pts();
		if (last_pts) {
			return generatedFrame_pts - last_pts;
		} 
		Object generatedAudio = this.getAudio();
		Object generatedIn_frame = this.getIn_frame();
		Object generatedLast_duration = this.getLast_duration();
		Object generatedDecoder = this.getDecoder();
		if (generatedAudio) {
			return .av_rescale_q(generatedIn_frame.getNb_samples(), , );
		} else {
				if (generatedLast_duration) {
					return generatedLast_duration;
				} 
				return .av_rescale_q(generatedDecoder.getTime_base().getNum(), generatedDecoder.getTime_base(), );
		} 
	}
	public int decode_packet(int got_frame) {
		int ret;
		got_frame = 0;
		Object generatedDecoder = this.getDecoder();
		Object generatedIn_frame = this.getIn_frame();
		ret = .avcodec_receive_frame(generatedDecoder, generatedIn_frame);
		if (ret != 0 && ret != .AVERROR(EAGAIN)) {
			if (ret == AVERROR_EOF) {
				ret = 0;
			} 
			return ret;
		} 
		Object generatedPkt = this.getPkt();
		if (ret != 0) {
			ret = .avcodec_send_packet(generatedDecoder, generatedPkt);
			if (ret != 0 && ret != .AVERROR(EAGAIN)) {
				if (ret == AVERROR_EOF) {
					ret = 0;
				} 
				return ret;
			} 
			ret = .avcodec_receive_frame(generatedDecoder, generatedIn_frame);
			if (ret != 0 && ret != .AVERROR(EAGAIN)) {
				if (ret == AVERROR_EOF) {
					ret = 0;
				} 
				return ret;
			} 
			got_frame = (ret == 0);
			ret = generatedPkt.getSize();
		} else {
				ret = 0;
				got_frame = 1;
		} 
		Object generatedSw_frame = this.getSw_frame();
		this.setFrame(generatedSw_frame);
		return ret;
	}
	public Object mp_decode_next() {
		mp_media generatedM = this.getM();
		Object generatedEof = generatedM.getEof();
		 eof = generatedEof;
		int got_frame;
		int ret;
		this.setFrame_ready(false);
		circlebuf generatedPackets = this.getPackets();
		Object generatedCirclebuf = generatedPackets.getCirclebuf();
		if (!eof && !generatedCirclebuf) {
			return true;
		} 
		Object generatedFrame_ready = this.getFrame_ready();
		Object generatedPacket_pending = this.getPacket_pending();
		Object generatedPkt = this.getPkt();
		Object generatedOrig_pkt = this.getOrig_pkt();
		while (!generatedFrame_ready) {
			if (!generatedPacket_pending) {
				if (!generatedCirclebuf) {
					if (eof) {
						generatedPkt.setData(NULL);
						generatedPkt.setSize(0);
					} else {
							return true;
					} 
				} else {
						generatedPackets.circlebuf_pop_front(generatedOrig_pkt, );
						this.setPkt(generatedOrig_pkt);
						this.setPacket_pending(true);
				} 
			} 
			ret = d.decode_packet(got_frame);
			if (!got_frame && ret == 0) {
				this.setEof(true);
				return true;
			} 
			if (ret < 0) {
				if (generatedPacket_pending) {
					.av_packet_unref(generatedOrig_pkt);
					.av_init_packet(generatedOrig_pkt);
					.av_init_packet(generatedPkt);
					this.setPacket_pending(false);
				} 
				return true;
			} 
			this.setFrame_ready(!!got_frame);
			if (generatedPacket_pending) {
				if (generatedPkt.getSize()) {
					generatedPkt.getData() += ret;
					generatedPkt.getSize() -= ret;
				} 
				if (generatedPkt.getSize() <= 0) {
					.av_packet_unref(generatedOrig_pkt);
					.av_init_packet(generatedOrig_pkt);
					.av_init_packet(generatedPkt);
					this.setPacket_pending(false);
				} 
			} 
		}
		Object generatedFrame_pts = this.getFrame_pts();
		Object generatedIn_frame = this.getIn_frame();
		Object generatedNext_pts = this.getNext_pts();
		Object generatedStream = this.getStream();
		int generatedSpeed = generatedM.getSpeed();
		if (generatedFrame_ready) {
			 last_pts = generatedFrame_pts;
			if (generatedIn_frame.getBest_effort_timestamp() == AV_NOPTS_VALUE) {
				this.setFrame_pts(generatedNext_pts);
			} else {
					this.setFrame_pts(.av_rescale_q(generatedIn_frame.getBest_effort_timestamp(), generatedStream.getTime_base(), ));
			} 
			 duration = generatedIn_frame.getPkt_duration();
			if (!duration) {
				duration = d.get_estimated_duration(last_pts);
			} else {
					duration = .av_rescale_q(duration, generatedStream.getTime_base(), );
			} 
			if (generatedSpeed != 100) {
				this.setFrame_pts(.av_rescale_q(generatedFrame_pts, , ));
				duration = .av_rescale_q(duration, , );
			} 
			this.setLast_duration(duration);
			this.setNext_pts(generatedFrame_pts + duration);
		} 
		return true;
	}
	public void mp_decode_flush() {
		Object generatedDecoder = this.getDecoder();
		.avcodec_flush_buffers(generatedDecoder);
		d.mp_decode_clear_packets();
		this.setEof(false);
		this.setFrame_pts(0);
		this.setFrame_ready(false);
	}
	public mp_media getM() {
		return m;
	}
	public void setM(mp_media newM) {
		m = newM;
	}
	public Object getStream() {
		return stream;
	}
	public void setStream(Object newStream) {
		stream = newStream;
	}
	public Object getAudio() {
		return audio;
	}
	public void setAudio(Object newAudio) {
		audio = newAudio;
	}
	public Object getDecoder() {
		return decoder;
	}
	public void setDecoder(Object newDecoder) {
		decoder = newDecoder;
	}
	public Object getHw_ctx() {
		return hw_ctx;
	}
	public void setHw_ctx(Object newHw_ctx) {
		hw_ctx = newHw_ctx;
	}
	public Object getCodec() {
		return codec;
	}
	public void setCodec(Object newCodec) {
		codec = newCodec;
	}
	public Object getLast_duration() {
		return last_duration;
	}
	public void setLast_duration(Object newLast_duration) {
		last_duration = newLast_duration;
	}
	public Object getFrame_pts() {
		return frame_pts;
	}
	public void setFrame_pts(Object newFrame_pts) {
		frame_pts = newFrame_pts;
	}
	public Object getNext_pts() {
		return next_pts;
	}
	public void setNext_pts(Object newNext_pts) {
		next_pts = newNext_pts;
	}
	public Object getIn_frame() {
		return in_frame;
	}
	public void setIn_frame(Object newIn_frame) {
		in_frame = newIn_frame;
	}
	public Object getSw_frame() {
		return sw_frame;
	}
	public void setSw_frame(Object newSw_frame) {
		sw_frame = newSw_frame;
	}
	public Object getHw_frame() {
		return hw_frame;
	}
	public void setHw_frame(Object newHw_frame) {
		hw_frame = newHw_frame;
	}
	public Object getFrame() {
		return frame;
	}
	public void setFrame(Object newFrame) {
		frame = newFrame;
	}
	public AVPixelFormat getHw_format() {
		return hw_format;
	}
	public void setHw_format(AVPixelFormat newHw_format) {
		hw_format = newHw_format;
	}
	public Object getGot_first_keyframe() {
		return got_first_keyframe;
	}
	public void setGot_first_keyframe(Object newGot_first_keyframe) {
		got_first_keyframe = newGot_first_keyframe;
	}
	public Object getFrame_ready() {
		return frame_ready;
	}
	public void setFrame_ready(Object newFrame_ready) {
		frame_ready = newFrame_ready;
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
	public Object getOrig_pkt() {
		return orig_pkt;
	}
	public void setOrig_pkt(Object newOrig_pkt) {
		orig_pkt = newOrig_pkt;
	}
	public Object getPkt() {
		return pkt;
	}
	public void setPkt(Object newPkt) {
		pkt = newPkt;
	}
	public Object getPacket_pending() {
		return packet_pending;
	}
	public void setPacket_pending(Object newPacket_pending) {
		packet_pending = newPacket_pending;
	}
	public circlebuf getPackets() {
		return packets;
	}
	public void setPackets(circlebuf newPackets) {
		packets = newPackets;
	}
}

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
public class ff_demuxer_options {
	private int audio_packet_queue_size;
	private int video_packet_queue_size;
	private int audio_frame_queue_size;
	private int video_frame_queue_size;
	private boolean is_hw_decoding;
	private boolean is_looping;
	private AVDiscard frame_drop;
	private Object custom_options;
	
	public ff_demuxer_options(int audio_packet_queue_size, int video_packet_queue_size, int audio_frame_queue_size, int video_frame_queue_size, boolean is_hw_decoding, boolean is_looping, AVDiscard frame_drop, Object custom_options) {
		setAudio_packet_queue_size(audio_packet_queue_size);
		setVideo_packet_queue_size(video_packet_queue_size);
		setAudio_frame_queue_size(audio_frame_queue_size);
		setVideo_frame_queue_size(video_frame_queue_size);
		setIs_hw_decoding(is_hw_decoding);
		setIs_looping(is_looping);
		setFrame_drop(frame_drop);
		setCustom_options(custom_options);
	}
	public ff_demuxer_options() {
	}
	
	public int getAudio_packet_queue_size() {
		return audio_packet_queue_size;
	}
	public void setAudio_packet_queue_size(int newAudio_packet_queue_size) {
		audio_packet_queue_size = newAudio_packet_queue_size;
	}
	public int getVideo_packet_queue_size() {
		return video_packet_queue_size;
	}
	public void setVideo_packet_queue_size(int newVideo_packet_queue_size) {
		video_packet_queue_size = newVideo_packet_queue_size;
	}
	public int getAudio_frame_queue_size() {
		return audio_frame_queue_size;
	}
	public void setAudio_frame_queue_size(int newAudio_frame_queue_size) {
		audio_frame_queue_size = newAudio_frame_queue_size;
	}
	public int getVideo_frame_queue_size() {
		return video_frame_queue_size;
	}
	public void setVideo_frame_queue_size(int newVideo_frame_queue_size) {
		video_frame_queue_size = newVideo_frame_queue_size;
	}
	public boolean getIs_hw_decoding() {
		return is_hw_decoding;
	}
	public void setIs_hw_decoding(boolean newIs_hw_decoding) {
		is_hw_decoding = newIs_hw_decoding;
	}
	public boolean getIs_looping() {
		return is_looping;
	}
	public void setIs_looping(boolean newIs_looping) {
		is_looping = newIs_looping;
	}
	public AVDiscard getFrame_drop() {
		return frame_drop;
	}
	public void setFrame_drop(AVDiscard newFrame_drop) {
		frame_drop = newFrame_drop;
	}
	public Object getCustom_options() {
		return custom_options;
	}
	public void setCustom_options(Object newCustom_options) {
		custom_options = newCustom_options;
	}
}

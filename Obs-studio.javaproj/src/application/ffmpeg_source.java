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
public class ffmpeg_source {
	private Object media;
	private Object media_valid;
	private Object destroy_media;
	private SwsContext sws_ctx;
	private int sws_width;
	private int sws_height;
	private AVPixelFormat sws_format;
	private Object sws_data;
	private int sws_linesize;
	private video_range_type range;
	private obs_source source;
	private Object hotkey;
	private byte input;
	private Byte input_format;
	private int buffering_mb;
	private int speed_percent;
	private Object is_looping;
	private Object is_local_file;
	private Object is_hw_decoding;
	private Object is_clear_on_media_end;
	private Object restart_on_activate;
	private Object close_when_inactive;
	private Object seekable;
	
	public ffmpeg_source(Object media, Object media_valid, Object destroy_media, SwsContext sws_ctx, int sws_width, int sws_height, AVPixelFormat sws_format, Object sws_data, int sws_linesize, video_range_type range, obs_source source, Object hotkey, byte input, Byte input_format, int buffering_mb, int speed_percent, Object is_looping, Object is_local_file, Object is_hw_decoding, Object is_clear_on_media_end, Object restart_on_activate, Object close_when_inactive, Object seekable) {
		setMedia(media);
		setMedia_valid(media_valid);
		setDestroy_media(destroy_media);
		setSws_ctx(sws_ctx);
		setSws_width(sws_width);
		setSws_height(sws_height);
		setSws_format(sws_format);
		setSws_data(sws_data);
		setSws_linesize(sws_linesize);
		setRange(range);
		setSource(source);
		setHotkey(hotkey);
		setInput(input);
		setInput_format(input_format);
		setBuffering_mb(buffering_mb);
		setSpeed_percent(speed_percent);
		setIs_looping(is_looping);
		setIs_local_file(is_local_file);
		setIs_hw_decoding(is_hw_decoding);
		setIs_clear_on_media_end(is_clear_on_media_end);
		setRestart_on_activate(restart_on_activate);
		setClose_when_inactive(close_when_inactive);
		setSeekable(seekable);
	}
	public ffmpeg_source() {
	}
	
	public void dump_source_info(Object input, Object input_format) {
		ModernizedCProgram.blog(LOG_INFO, "[Media Source '%s']: settings:\n\tinput:                   %s\n\tinput_format:            %s\n\tspeed:                   %d\n\tis_looping:              %s\n\tis_hw_decoding:          %s\n\tis_clear_on_media_end:   %s\n\trestart_on_activate:     %s\n\tclose_when_inactive:     %s", ModernizedCProgram.obs_source_get_name(ModernizedCProgram.s.getSource()), input ? input : "(null)", input_format ? input_format : "(null)", ModernizedCProgram.s.getSpeed_percent(), ModernizedCProgram.s.getIs_looping() ? "yes" : "no", ModernizedCProgram.s.getIs_hw_decoding() ? "yes" : "no", ModernizedCProgram.s.getIs_clear_on_media_end() ? "yes" : "no", ModernizedCProgram.s.getRestart_on_activate() ? "yes" : "no", ModernizedCProgram.s.getClose_when_inactive() ? "yes" : "no");
	}
	public void ffmpeg_source_open() {
		if (ModernizedCProgram.s.getInput() && ModernizedCProgram.s.getInput()) {
			mp_media_info info = new mp_media_info(, , , , , , , , , , , );
			ModernizedCProgram.s.setMedia_valid(ModernizedCProgram.s.getMedia().mp_media_init(info));
		} 
	}
	public void ffmpeg_source_start() {
		if (!ModernizedCProgram.s.getMedia_valid()) {
			ModernizedCProgram.s.ffmpeg_source_open();
		} 
		if (ModernizedCProgram.s.getMedia_valid()) {
			ModernizedCProgram.s.getMedia().mp_media_play(ModernizedCProgram.s.getIs_looping());
			if (ModernizedCProgram.s.getIs_local_file()) {
				ModernizedCProgram.s.getSource().obs_source_show_preloaded_video();
			} 
		} 
	}
	public Object getMedia() {
		return media;
	}
	public void setMedia(Object newMedia) {
		media = newMedia;
	}
	public Object getMedia_valid() {
		return media_valid;
	}
	public void setMedia_valid(Object newMedia_valid) {
		media_valid = newMedia_valid;
	}
	public Object getDestroy_media() {
		return destroy_media;
	}
	public void setDestroy_media(Object newDestroy_media) {
		destroy_media = newDestroy_media;
	}
	public SwsContext getSws_ctx() {
		return sws_ctx;
	}
	public void setSws_ctx(SwsContext newSws_ctx) {
		sws_ctx = newSws_ctx;
	}
	public int getSws_width() {
		return sws_width;
	}
	public void setSws_width(int newSws_width) {
		sws_width = newSws_width;
	}
	public int getSws_height() {
		return sws_height;
	}
	public void setSws_height(int newSws_height) {
		sws_height = newSws_height;
	}
	public AVPixelFormat getSws_format() {
		return sws_format;
	}
	public void setSws_format(AVPixelFormat newSws_format) {
		sws_format = newSws_format;
	}
	public Object getSws_data() {
		return sws_data;
	}
	public void setSws_data(Object newSws_data) {
		sws_data = newSws_data;
	}
	public int getSws_linesize() {
		return sws_linesize;
	}
	public void setSws_linesize(int newSws_linesize) {
		sws_linesize = newSws_linesize;
	}
	public video_range_type getRange() {
		return range;
	}
	public void setRange(video_range_type newRange) {
		range = newRange;
	}
	public obs_source getSource() {
		return source;
	}
	public void setSource(obs_source newSource) {
		source = newSource;
	}
	public Object getHotkey() {
		return hotkey;
	}
	public void setHotkey(Object newHotkey) {
		hotkey = newHotkey;
	}
	public byte getInput() {
		return input;
	}
	public void setInput(byte newInput) {
		input = newInput;
	}
	public Byte getInput_format() {
		return input_format;
	}
	public void setInput_format(Byte newInput_format) {
		input_format = newInput_format;
	}
	public int getBuffering_mb() {
		return buffering_mb;
	}
	public void setBuffering_mb(int newBuffering_mb) {
		buffering_mb = newBuffering_mb;
	}
	public int getSpeed_percent() {
		return speed_percent;
	}
	public void setSpeed_percent(int newSpeed_percent) {
		speed_percent = newSpeed_percent;
	}
	public Object getIs_looping() {
		return is_looping;
	}
	public void setIs_looping(Object newIs_looping) {
		is_looping = newIs_looping;
	}
	public Object getIs_local_file() {
		return is_local_file;
	}
	public void setIs_local_file(Object newIs_local_file) {
		is_local_file = newIs_local_file;
	}
	public Object getIs_hw_decoding() {
		return is_hw_decoding;
	}
	public void setIs_hw_decoding(Object newIs_hw_decoding) {
		is_hw_decoding = newIs_hw_decoding;
	}
	public Object getIs_clear_on_media_end() {
		return is_clear_on_media_end;
	}
	public void setIs_clear_on_media_end(Object newIs_clear_on_media_end) {
		is_clear_on_media_end = newIs_clear_on_media_end;
	}
	public Object getRestart_on_activate() {
		return restart_on_activate;
	}
	public void setRestart_on_activate(Object newRestart_on_activate) {
		restart_on_activate = newRestart_on_activate;
	}
	public Object getClose_when_inactive() {
		return close_when_inactive;
	}
	public void setClose_when_inactive(Object newClose_when_inactive) {
		close_when_inactive = newClose_when_inactive;
	}
	public Object getSeekable() {
		return seekable;
	}
	public void setSeekable(Object newSeekable) {
		seekable = newSeekable;
	}
}

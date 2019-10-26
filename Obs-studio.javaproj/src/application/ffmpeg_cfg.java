package application;

/******************************************************************************
    Copyright (C) 2014 by Hugh Bailey <obs.jim@gmail.com>

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 2 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
******************************************************************************/
public class ffmpeg_cfg {
	private Object url;
	private Object format_name;
	private Object format_mime_type;
	private Object muxer_settings;
	private int gop_size;
	private int video_bitrate;
	private int audio_bitrate;
	private Object video_encoder;
	private int video_encoder_id;
	private Object audio_encoder;
	private int audio_encoder_id;
	private Object video_settings;
	private Object audio_settings;
	private int audio_mix_count;
	private int audio_tracks;
	private AVPixelFormat format;
	private AVColorRange color_range;
	private AVColorSpace color_space;
	private int scale_width;
	private int scale_height;
	private int width;
	private int height;
	
	public ffmpeg_cfg(Object url, Object format_name, Object format_mime_type, Object muxer_settings, int gop_size, int video_bitrate, int audio_bitrate, Object video_encoder, int video_encoder_id, Object audio_encoder, int audio_encoder_id, Object video_settings, Object audio_settings, int audio_mix_count, int audio_tracks, AVPixelFormat format, AVColorRange color_range, AVColorSpace color_space, int scale_width, int scale_height, int width, int height) {
		setUrl(url);
		setFormat_name(format_name);
		setFormat_mime_type(format_mime_type);
		setMuxer_settings(muxer_settings);
		setGop_size(gop_size);
		setVideo_bitrate(video_bitrate);
		setAudio_bitrate(audio_bitrate);
		setVideo_encoder(video_encoder);
		setVideo_encoder_id(video_encoder_id);
		setAudio_encoder(audio_encoder);
		setAudio_encoder_id(audio_encoder_id);
		setVideo_settings(video_settings);
		setAudio_settings(audio_settings);
		setAudio_mix_count(audio_mix_count);
		setAudio_tracks(audio_tracks);
		setFormat(format);
		setColor_range(color_range);
		setColor_space(color_space);
		setScale_width(scale_width);
		setScale_height(scale_height);
		setWidth(width);
		setHeight(height);
	}
	public ffmpeg_cfg() {
	}
	
	public Object getUrl() {
		return url;
	}
	public void setUrl(Object newUrl) {
		url = newUrl;
	}
	public Object getFormat_name() {
		return format_name;
	}
	public void setFormat_name(Object newFormat_name) {
		format_name = newFormat_name;
	}
	public Object getFormat_mime_type() {
		return format_mime_type;
	}
	public void setFormat_mime_type(Object newFormat_mime_type) {
		format_mime_type = newFormat_mime_type;
	}
	public Object getMuxer_settings() {
		return muxer_settings;
	}
	public void setMuxer_settings(Object newMuxer_settings) {
		muxer_settings = newMuxer_settings;
	}
	public int getGop_size() {
		return gop_size;
	}
	public void setGop_size(int newGop_size) {
		gop_size = newGop_size;
	}
	public int getVideo_bitrate() {
		return video_bitrate;
	}
	public void setVideo_bitrate(int newVideo_bitrate) {
		video_bitrate = newVideo_bitrate;
	}
	public int getAudio_bitrate() {
		return audio_bitrate;
	}
	public void setAudio_bitrate(int newAudio_bitrate) {
		audio_bitrate = newAudio_bitrate;
	}
	public Object getVideo_encoder() {
		return video_encoder;
	}
	public void setVideo_encoder(Object newVideo_encoder) {
		video_encoder = newVideo_encoder;
	}
	public int getVideo_encoder_id() {
		return video_encoder_id;
	}
	public void setVideo_encoder_id(int newVideo_encoder_id) {
		video_encoder_id = newVideo_encoder_id;
	}
	public Object getAudio_encoder() {
		return audio_encoder;
	}
	public void setAudio_encoder(Object newAudio_encoder) {
		audio_encoder = newAudio_encoder;
	}
	public int getAudio_encoder_id() {
		return audio_encoder_id;
	}
	public void setAudio_encoder_id(int newAudio_encoder_id) {
		audio_encoder_id = newAudio_encoder_id;
	}
	public Object getVideo_settings() {
		return video_settings;
	}
	public void setVideo_settings(Object newVideo_settings) {
		video_settings = newVideo_settings;
	}
	public Object getAudio_settings() {
		return audio_settings;
	}
	public void setAudio_settings(Object newAudio_settings) {
		audio_settings = newAudio_settings;
	}
	public int getAudio_mix_count() {
		return audio_mix_count;
	}
	public void setAudio_mix_count(int newAudio_mix_count) {
		audio_mix_count = newAudio_mix_count;
	}
	public int getAudio_tracks() {
		return audio_tracks;
	}
	public void setAudio_tracks(int newAudio_tracks) {
		audio_tracks = newAudio_tracks;
	}
	public AVPixelFormat getFormat() {
		return format;
	}
	public void setFormat(AVPixelFormat newFormat) {
		format = newFormat;
	}
	public AVColorRange getColor_range() {
		return color_range;
	}
	public void setColor_range(AVColorRange newColor_range) {
		color_range = newColor_range;
	}
	public AVColorSpace getColor_space() {
		return color_space;
	}
	public void setColor_space(AVColorSpace newColor_space) {
		color_space = newColor_space;
	}
	public int getScale_width() {
		return scale_width;
	}
	public void setScale_width(int newScale_width) {
		scale_width = newScale_width;
	}
	public int getScale_height() {
		return scale_height;
	}
	public void setScale_height(int newScale_height) {
		scale_height = newScale_height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int newWidth) {
		width = newWidth;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int newHeight) {
		height = newHeight;
	}
}

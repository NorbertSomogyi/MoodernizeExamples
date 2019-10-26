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
public class ff_format_desc {
	private Object name;
	private Object long_name;
	private Object mime_type;
	private Object extensions;
	private AVCodecID audio_codec;
	private AVCodecID video_codec;
	private Object codec_tags;
	private Object next;
	
	public ff_format_desc(Object name, Object long_name, Object mime_type, Object extensions, AVCodecID audio_codec, AVCodecID video_codec, Object codec_tags, Object next) {
		setName(name);
		setLong_name(long_name);
		setMime_type(mime_type);
		setExtensions(extensions);
		setAudio_codec(audio_codec);
		setVideo_codec(video_codec);
		setCodec_tags(codec_tags);
		setNext(next);
	}
	public ff_format_desc() {
	}
	
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
	public Object getLong_name() {
		return long_name;
	}
	public void setLong_name(Object newLong_name) {
		long_name = newLong_name;
	}
	public Object getMime_type() {
		return mime_type;
	}
	public void setMime_type(Object newMime_type) {
		mime_type = newMime_type;
	}
	public Object getExtensions() {
		return extensions;
	}
	public void setExtensions(Object newExtensions) {
		extensions = newExtensions;
	}
	public AVCodecID getAudio_codec() {
		return audio_codec;
	}
	public void setAudio_codec(AVCodecID newAudio_codec) {
		audio_codec = newAudio_codec;
	}
	public AVCodecID getVideo_codec() {
		return video_codec;
	}
	public void setVideo_codec(AVCodecID newVideo_codec) {
		video_codec = newVideo_codec;
	}
	public Object getCodec_tags() {
		return codec_tags;
	}
	public void setCodec_tags(Object newCodec_tags) {
		codec_tags = newCodec_tags;
	}
	public Object getNext() {
		return next;
	}
	public void setNext(Object newNext) {
		next = newNext;
	}
}

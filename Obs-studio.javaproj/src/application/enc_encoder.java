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
public class enc_encoder {
	private obs_encoder encoder;
	private Object type;
	private Object codec;
	private Object context;
	private Object samples;
	private Object aframe;
	private Object total_samples;
	private Object audio_planes;
	private Object audio_size;
	private int frame_size;
	private int frame_size_bytes;
	
	public enc_encoder(obs_encoder encoder, Object type, Object codec, Object context, Object samples, Object aframe, Object total_samples, Object audio_planes, Object audio_size, int frame_size, int frame_size_bytes) {
		setEncoder(encoder);
		setType(type);
		setCodec(codec);
		setContext(context);
		setSamples(samples);
		setAframe(aframe);
		setTotal_samples(total_samples);
		setAudio_planes(audio_planes);
		setAudio_size(audio_size);
		setFrame_size(frame_size);
		setFrame_size_bytes(frame_size_bytes);
	}
	public enc_encoder() {
	}
	
	public Object initialize_codec() {
		int ret;
		this.setAframe(/*Error: Function owner not recognized*/avcodec_alloc_frame());
		Object generatedAframe = this.getAframe();
		Object generatedType = this.getType();
		obs_encoder generatedEncoder = this.getEncoder();
		if (!generatedAframe) {
			ModernizedCProgram.blog(LOG_WARNING, "[FFmpeg %s encoder: '%s'] Failed to allocate audio frame", generatedType, ModernizedCProgram.obs_encoder_get_name(generatedEncoder));
			return false;
		} 
		Object generatedContext = this.getContext();
		Object generatedCodec = this.getCodec();
		ret = /*Error: Function owner not recognized*/avcodec_open2(generatedContext, generatedCodec, NULL);
		if (ret < 0) {
			ModernizedCProgram.blog(LOG_WARNING, "[FFmpeg %s encoder: '%s'] Failed to open AAC codec: %s", generatedType, ModernizedCProgram.obs_encoder_get_name(generatedEncoder), /*Error: Function owner not recognized*/av_err2str(ret));
			return false;
		} 
		generatedAframe.setFormat(generatedContext.getSample_fmt());
		generatedAframe.setChannels(generatedContext.getChannels());
		generatedAframe.setChannel_layout(generatedContext.getChannel_layout());
		generatedAframe.setSample_rate(generatedContext.getSample_rate());
		this.setFrame_size(generatedContext.getFrame_size());
		int generatedFrame_size = this.getFrame_size();
		if (!generatedFrame_size) {
			this.setFrame_size(1024);
		} 
		Object generatedAudio_size = this.getAudio_size();
		this.setFrame_size_bytes(generatedFrame_size * (int)generatedAudio_size);
		Object generatedSamples = this.getSamples();
		ret = /*Error: Function owner not recognized*/av_samples_alloc(generatedSamples, NULL, generatedContext.getChannels(), generatedFrame_size, generatedContext.getSample_fmt(), 0);
		if (ret < 0) {
			ModernizedCProgram.blog(LOG_WARNING, "[FFmpeg %s encoder: '%s'] Failed to create audio buffer: %s", generatedType, ModernizedCProgram.obs_encoder_get_name(generatedEncoder), /*Error: Function owner not recognized*/av_err2str(ret));
			return false;
		} 
		return true;
	}
	public void init_sizes(Object audio) {
		audio_output_info aoi = new audio_output_info();
		audio_format format;
		aoi = ModernizedCProgram.audio_output_get_info(audio);
		Object generatedContext = this.getContext();
		audio_format.format = ModernizedCProgram.convert_ffmpeg_sample_format(generatedContext.getSample_fmt());
		this.setAudio_planes(ModernizedCProgram.get_audio_planes(audio_format.format, aoi.getAudio_output_info()));
		this.setAudio_size(ModernizedCProgram.get_audio_size(audio_format.format, aoi.getAudio_output_info(), 1));
	}
	public obs_encoder getEncoder() {
		return encoder;
	}
	public void setEncoder(obs_encoder newEncoder) {
		encoder = newEncoder;
	}
	public Object getType() {
		return type;
	}
	public void setType(Object newType) {
		type = newType;
	}
	public Object getCodec() {
		return codec;
	}
	public void setCodec(Object newCodec) {
		codec = newCodec;
	}
	public Object getContext() {
		return context;
	}
	public void setContext(Object newContext) {
		context = newContext;
	}
	public Object getSamples() {
		return samples;
	}
	public void setSamples(Object newSamples) {
		samples = newSamples;
	}
	public Object getAframe() {
		return aframe;
	}
	public void setAframe(Object newAframe) {
		aframe = newAframe;
	}
	public Object getTotal_samples() {
		return total_samples;
	}
	public void setTotal_samples(Object newTotal_samples) {
		total_samples = newTotal_samples;
	}
	public Object getAudio_planes() {
		return audio_planes;
	}
	public void setAudio_planes(Object newAudio_planes) {
		audio_planes = newAudio_planes;
	}
	public Object getAudio_size() {
		return audio_size;
	}
	public void setAudio_size(Object newAudio_size) {
		audio_size = newAudio_size;
	}
	public int getFrame_size() {
		return frame_size;
	}
	public void setFrame_size(int newFrame_size) {
		frame_size = newFrame_size;
	}
	public int getFrame_size_bytes() {
		return frame_size_bytes;
	}
	public void setFrame_size_bytes(int newFrame_size_bytes) {
		frame_size_bytes = newFrame_size_bytes;
	}
}

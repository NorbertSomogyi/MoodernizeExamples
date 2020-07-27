package application;

/******************************************************************************
    Copyright (C) 2016 by Hugh Bailey <obs.jim@gmail.com>

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
public class nvenc_encoder {
	private obs_encoder encoder;
	private Object nvenc;
	private Object context;
	private Object vframe;
	private Object header;
	private Object header_size;
	private Object sei;
	private Object sei_size;
	private int height;
	private Object first_packet;
	private Object initialized;
	
	public nvenc_encoder(obs_encoder encoder, Object nvenc, Object context, Object vframe, Object header, Object header_size, Object sei, Object sei_size, int height, Object first_packet, Object initialized) {
		setEncoder(encoder);
		setNvenc(nvenc);
		setContext(context);
		setVframe(vframe);
		setHeader(header);
		setHeader_size(header_size);
		setSei(sei);
		setSei_size(sei_size);
		setHeight(height);
		setFirst_packet(first_packet);
		setInitialized(initialized);
	}
	public nvenc_encoder() {
	}
	
	public Object nvenc_init_codec() {
		int ret;
		Object generatedContext = this.getContext();
		Object generatedNvenc = this.getNvenc();
		ret = /*Error: Function owner not recognized*/avcodec_open2(generatedContext, generatedNvenc, NULL);
		obs_encoder generatedEncoder = this.getEncoder();
		if (ret < 0) {
			ModernizedCProgram.blog(LOG_WARNING, "[NVENC encoder: '%s'] Failed to open NVENC codec: %s", ModernizedCProgram.obs_encoder_get_name(generatedEncoder), /*Error: Function owner not recognized*/av_err2str(ret));
			return false;
		} 
		this.setVframe(/*Error: Function owner not recognized*/av_frame_alloc());
		Object generatedVframe = this.getVframe();
		if (!generatedVframe) {
			ModernizedCProgram.blog(LOG_WARNING, "[NVENC encoder: '%s'] Failed to allocate video frame", ModernizedCProgram.obs_encoder_get_name(generatedEncoder));
			return false;
		} 
		generatedVframe.setFormat(generatedContext.getPix_fmt());
		generatedVframe.setWidth(generatedContext.getWidth());
		generatedVframe.setHeight(generatedContext.getHeight());
		generatedVframe.setColorspace(generatedContext.getColorspace());
		generatedVframe.setColor_range(generatedContext.getColor_range());
		ret = /*Error: Function owner not recognized*/av_frame_get_buffer(generatedVframe, ModernizedCProgram.base_get_alignment());
		if (ret < 0) {
			ModernizedCProgram.blog(LOG_WARNING, "[NVENC encoder: '%s'] Failed to allocate vframe: %s", ModernizedCProgram.obs_encoder_get_name(generatedEncoder), /*Error: Function owner not recognized*/av_err2str(ret));
			return false;
		} 
		this.setInitialized(true);
		return true;
	}
	public obs_encoder getEncoder() {
		return encoder;
	}
	public void setEncoder(obs_encoder newEncoder) {
		encoder = newEncoder;
	}
	public Object getNvenc() {
		return nvenc;
	}
	public void setNvenc(Object newNvenc) {
		nvenc = newNvenc;
	}
	public Object getContext() {
		return context;
	}
	public void setContext(Object newContext) {
		context = newContext;
	}
	public Object getVframe() {
		return vframe;
	}
	public void setVframe(Object newVframe) {
		vframe = newVframe;
	}
	public Object getHeader() {
		return header;
	}
	public void setHeader(Object newHeader) {
		header = newHeader;
	}
	public Object getHeader_size() {
		return header_size;
	}
	public void setHeader_size(Object newHeader_size) {
		header_size = newHeader_size;
	}
	public Object getSei() {
		return sei;
	}
	public void setSei(Object newSei) {
		sei = newSei;
	}
	public Object getSei_size() {
		return sei_size;
	}
	public void setSei_size(Object newSei_size) {
		sei_size = newSei_size;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int newHeight) {
		height = newHeight;
	}
	public Object getFirst_packet() {
		return first_packet;
	}
	public void setFirst_packet(Object newFirst_packet) {
		first_packet = newFirst_packet;
	}
	public Object getInitialized() {
		return initialized;
	}
	public void setInitialized(Object newInitialized) {
		initialized = newInitialized;
	}
}

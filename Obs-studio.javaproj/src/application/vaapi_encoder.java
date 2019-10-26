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
public class vaapi_encoder {
	private obs_encoder encoder;
	private Object vadevice_ref;
	private Object vaframes_ref;
	private Object vaapi;
	private Object context;
	private Object vframe;
	private Object header;
	private Object header_size;
	private Object sei;
	private Object sei_size;
	private int height;
	private Object first_packet;
	private Object initialized;
	
	public vaapi_encoder(obs_encoder encoder, Object vadevice_ref, Object vaframes_ref, Object vaapi, Object context, Object vframe, Object header, Object header_size, Object sei, Object sei_size, int height, Object first_packet, Object initialized) {
		setEncoder(encoder);
		setVadevice_ref(vadevice_ref);
		setVaframes_ref(vaframes_ref);
		setVaapi(vaapi);
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
	public vaapi_encoder() {
	}
	
	public Object vaapi_init_codec(Object path) {
		int ret;
		Object generatedVadevice_ref = this.getVadevice_ref();
		ret = .av_hwdevice_ctx_create(generatedVadevice_ref, AV_HWDEVICE_TYPE_VAAPI, path, NULL, 0);
		obs_encoder generatedEncoder = this.getEncoder();
		if (ret < 0) {
			ModernizedCProgram.blog(LOG_WARNING, "[FFMPEG VAAPI encoder: '%s'] Failed to create VAAPI device context: %s", ModernizedCProgram.obs_encoder_get_name(generatedEncoder), .av_err2str(ret));
			return false;
		} 
		this.setVaframes_ref(.av_hwframe_ctx_alloc(generatedVadevice_ref));
		Object generatedVaframes_ref = this.getVaframes_ref();
		if (!generatedVaframes_ref) {
			ModernizedCProgram.blog(LOG_WARNING, "[FFMPEG VAAPI encoder: '%s'] Failed to alloc HW frames context", ModernizedCProgram.obs_encoder_get_name(generatedEncoder));
			return false;
		} 
		 frames_ctx = ()generatedVaframes_ref.getData();
		frames_ctx.setFormat(AV_PIX_FMT_VAAPI);
		frames_ctx.setSw_format(AV_PIX_FMT_NV12);
		Object generatedContext = this.getContext();
		frames_ctx.setWidth(generatedContext.getWidth());
		frames_ctx.setHeight(generatedContext.getHeight());
		frames_ctx.setInitial_pool_size(20);
		ret = .av_hwframe_ctx_init(generatedVaframes_ref);
		if (ret < 0) {
			ModernizedCProgram.blog(LOG_WARNING, "[FFMPEG VAAPI encoder: '%s'] Failed to init HW frames context: %s", ModernizedCProgram.obs_encoder_get_name(generatedEncoder), .av_err2str(ret));
			return false;
		} 
		this.setVframe(.av_frame_alloc());
		Object generatedVframe = this.getVframe();
		if (!generatedVframe) {
			ModernizedCProgram.blog(LOG_WARNING, "[FFMPEG VAAPI encoder: '%s'] Failed to allocate video frame", ModernizedCProgram.obs_encoder_get_name(generatedEncoder));
			return false;
		} 
		generatedVframe.setFormat(generatedContext.getPix_fmt());
		generatedVframe.setWidth(generatedContext.getWidth());
		generatedVframe.setHeight(generatedContext.getHeight());
		generatedVframe.setColorspace(generatedContext.getColorspace());
		generatedVframe.setColor_range(generatedContext.getColor_range());
		ret = .av_frame_get_buffer(generatedVframe, ModernizedCProgram.base_get_alignment());
		if (ret < 0) {
			ModernizedCProgram.blog(LOG_WARNING, "[FFMPEG VAAPI encoder: '%s'] Failed to allocate vframe: %s", ModernizedCProgram.obs_encoder_get_name(generatedEncoder), .av_err2str(ret));
			return false;
		} 
		generatedContext.setPix_fmt(/* 3. set up codec */AV_PIX_FMT_VAAPI);
		generatedContext.setHw_frames_ctx(.av_buffer_ref(generatedVaframes_ref));
		Object generatedVaapi = this.getVaapi();
		ret = .avcodec_open2(generatedContext, generatedVaapi, NULL);
		if (ret < 0) {
			ModernizedCProgram.blog(LOG_WARNING, "[FFMPEG VAAPI encoder: '%s'] Failed to open VAAPI codec: %s", ModernizedCProgram.obs_encoder_get_name(generatedEncoder), .av_err2str(ret));
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
	public Object getVadevice_ref() {
		return vadevice_ref;
	}
	public void setVadevice_ref(Object newVadevice_ref) {
		vadevice_ref = newVadevice_ref;
	}
	public Object getVaframes_ref() {
		return vaframes_ref;
	}
	public void setVaframes_ref(Object newVaframes_ref) {
		vaframes_ref = newVaframes_ref;
	}
	public Object getVaapi() {
		return vaapi;
	}
	public void setVaapi(Object newVaapi) {
		vaapi = newVaapi;
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

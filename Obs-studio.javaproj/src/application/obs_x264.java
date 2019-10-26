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
//#define ENABLE_VFR
/* ------------------------------------------------------------------------- */
public class obs_x264 {
	private obs_encoder encoder;
	private Object params;
	private Object context;
	private Object extra_data;
	private Object sei;
	private Object extra_data_size;
	private Object sei_size;
	private Object performance_token;
	
	public obs_x264(obs_encoder encoder, Object params, Object context, Object extra_data, Object sei, Object extra_data_size, Object sei_size, Object performance_token) {
		setEncoder(encoder);
		setParams(params);
		setContext(context);
		setExtra_data(extra_data);
		setSei(sei);
		setExtra_data_size(extra_data_size);
		setSei_size(sei_size);
		setPerformance_token(performance_token);
	}
	public obs_x264() {
	}
	
	public void clear_data() {
		Object generatedContext = this.getContext();
		Object generatedSei = this.getSei();
		Object generatedExtra_data = this.getExtra_data();
		if (generatedContext) {
			.x264_encoder_close(generatedContext);
			ModernizedCProgram.bfree(generatedSei);
			ModernizedCProgram.bfree(generatedExtra_data);
			this.setContext(((Object)0));
			this.setSei(((Object)0));
			this.setExtra_data(((Object)0));
		} 
		qsv_t generatedContext = obsqsv.getContext();
		Object generatedExtra_data = obsqsv.getExtra_data();
		if (generatedContext) {
			.EnterCriticalSection(ModernizedCProgram.g_QsvCs);
			.qsv_encoder_close(generatedContext);
			obsqsv.setContext(((Object)0));
			.LeaveCriticalSection(ModernizedCProgram.g_QsvCs);
			ModernizedCProgram.bfree(generatedExtra_data);
			obsqsv.setExtra_data(((Object)0));
		} 
	}
	public Object validate(Object val, Object name, Object list) {
		if (!val || !val) {
			return val;
		} 
		while (list) {
			if (.strcmp(val, list) == 0) {
				return val;
			} 
			list++;
		}
		obs_encoder generatedEncoder = this.getEncoder();
		ModernizedCProgram.blog(LOG_WARNING, "[x264 encoder: '%s'] Invalid %s: %s", ModernizedCProgram.obs_encoder_get_name(generatedEncoder), name, val);
		return ((Object)0);
	}
	public void override_base_param(Object param, byte preset, byte profile, byte tune) {
		byte name;
		byte val;
		if (ModernizedCProgram.getparam(param, name, val)) {
			if (ModernizedCProgram.astrcmpi(name, "preset") == 0) {
				byte valid_name = obsx264.validate(val, "preset", x264_preset_names);
				if (valid_name) {
					ModernizedCProgram.bfree(preset);
					preset = ModernizedCProgram.bstrdup(val);
				} 
			}  else if (ModernizedCProgram.astrcmpi(name, "profile") == 0) {
				byte valid_name = obsx264.validate(val, "profile", x264_profile_names);
				if (valid_name) {
					ModernizedCProgram.bfree(profile);
					profile = ModernizedCProgram.bstrdup(val);
				} 
			}  else if (ModernizedCProgram.astrcmpi(name, "tune") == 0) {
				byte valid_name = obsx264.validate(val, "tune", x264_tune_names);
				if (valid_name) {
					ModernizedCProgram.bfree(tune);
					tune = ModernizedCProgram.bstrdup(val);
				} 
			} 
			ModernizedCProgram.bfree(name);
		} 
	}
	public void override_base_params(byte params, Byte preset, Byte profile, Byte tune) {
		while (params) {
			obsx264.override_base_param((params++), preset, profile, tune);
		}
	}
	public void set_param(Object param) {
		byte name;
		byte val;
		Object generatedParams = this.getParams();
		obs_encoder generatedEncoder = this.getEncoder();
		if (ModernizedCProgram.getparam(param, name, val)) {
			if (.strcmp(name, "preset") != 0 && .strcmp(name, "profile") != 0 && .strcmp(name, "tune") != 0 && .strcmp(name, "fps") != 0 && .strcmp(name, "force-cfr") != 0 && .strcmp(name, "width") != 0 && .strcmp(name, "height") != 0 && .strcmp(name, "opencl") != 0) {
				if (.strcmp(name, "opencl_is_experimental_and_potentially_unstable") == 0) {
					.strcpy(name, "opencl");
				} 
				if (.x264_param_parse(generatedParams, name, val) != 0) {
					ModernizedCProgram.blog(LOG_WARNING, "[x264 encoder: '%s'] x264 param: %s failed", ModernizedCProgram.obs_encoder_get_name(generatedEncoder), param);
				} 
			} 
			ModernizedCProgram.bfree(name);
		} 
	}
	public void apply_x264_profile(Object profile) {
		Object generatedContext = this.getContext();
		Object generatedParams = this.getParams();
		obs_encoder generatedEncoder = this.getEncoder();
		if (!generatedContext && profile && profile) {
			int ret = .x264_param_apply_profile(generatedParams, profile);
			if (ret != 0) {
				ModernizedCProgram.blog(LOG_WARNING, "[x264 encoder: '%s'] Failed to set x264 profile '%s'", ModernizedCProgram.obs_encoder_get_name(generatedEncoder), profile);
			} 
		} 
	}
	public Object validate_preset(Object preset) {
		byte new_preset = obsx264.validate(preset, "preset", x264_preset_names);
		return new_preset ? new_preset : "veryfast";
	}
	public Object reset_x264_params(Object preset, Object tune) {
		Object generatedParams = this.getParams();
		int ret = .x264_param_default_preset(generatedParams, obsx264.validate_preset(preset), obsx264.validate(tune, "tune", x264_tune_names));
		return ret == 0;
	}
	public void load_headers() {
		 nals = new ();
		int nal_count;
		 uint8_t = new ();
		header;
		 uint8_t = new ();
		sei;
		.da_init(header);
		.da_init(sei);
		Object generatedContext = this.getContext();
		.x264_encoder_headers(generatedContext, nals, nal_count);
		for (int i = 0;
		 i < nal_count; i++) {
			 nal = nals + i;
			if (nal.getI_type() == NAL_SEI) {
				.da_push_back_array(sei, nal.getP_payload(), nal.getI_payload());
			} else {
					.da_push_back_array(header, nal.getP_payload(), nal.getI_payload());
			} 
		}
		this.setExtra_data(header.getArray());
		this.setExtra_data_size(header.getNum());
		this.setSei(sei.getArray());
		this.setSei_size(sei.getNum());
		 uint8_t = new ();
		header;
		 sei = 0;
		// Not sure if SEI is needed.// Just filling in empty meaningless SEI message.
		// Seems to work fine.// DARRAY(uint8_t) sei;// Seems to work fine.// DARRAY(uint8_t) sei;.da_init(header)// da_init(sei);;// da_init(sei);
		 pSPS = new ();
		 pPPS = new ();
		uint16_t nSPS = new uint16_t();
		uint16_t nPPS = new uint16_t();
		qsv_t generatedContext = obsqsv.getContext();
		.qsv_encoder_headers(generatedContext, pSPS, pPPS, nSPS, nPPS);
		.da_push_back_array(header, pSPS, nSPS);
		.da_push_back_array(header, pPPS, nPPS);
		obsqsv.setExtra_data(header.getArray());
		obsqsv.setExtra_data_size(header.getNum());
		obsqsv.setSei(sei);
		obsqsv.setSei_size(1);
	}
	public obs_encoder getEncoder() {
		return encoder;
	}
	public void setEncoder(obs_encoder newEncoder) {
		encoder = newEncoder;
	}
	public Object getParams() {
		return params;
	}
	public void setParams(Object newParams) {
		params = newParams;
	}
	public Object getContext() {
		return context;
	}
	public void setContext(Object newContext) {
		context = newContext;
	}
	public Object getExtra_data() {
		return extra_data;
	}
	public void setExtra_data(Object newExtra_data) {
		extra_data = newExtra_data;
	}
	public Object getSei() {
		return sei;
	}
	public void setSei(Object newSei) {
		sei = newSei;
	}
	public Object getExtra_data_size() {
		return extra_data_size;
	}
	public void setExtra_data_size(Object newExtra_data_size) {
		extra_data_size = newExtra_data_size;
	}
	public Object getSei_size() {
		return sei_size;
	}
	public void setSei_size(Object newSei_size) {
		sei_size = newSei_size;
	}
	public Object getPerformance_token() {
		return performance_token;
	}
	public void setPerformance_token(Object newPerformance_token) {
		performance_token = newPerformance_token;
	}
}

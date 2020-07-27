package application;

/*

This file is provided under a dual BSD/GPLv2 license.  When using or
redistributing this file, you may do so under either license.

GPL LICENSE SUMMARY

Copyright(c) Oct. 2015 Intel Corporation.

This program is free software; you can redistribute it and/or modify
it under the terms of version 2 of the GNU General Public License as
published by the Free Software Foundation.

This program is distributed in the hope that it will be useful, but
WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
General Public License for more details.

Contact Information:

Seung-Woo Kim, seung-woo.kim@intel.com
705 5th Ave S #500, Seattle, WA 98104

BSD LICENSE

Copyright(c) <date> Intel Corporation.

Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions
are met:

* Redistributions of source code must retain the above copyright
notice, this list of conditions and the following disclaimer.

* Redistributions in binary form must reproduce the above copyright
notice, this list of conditions and the following disclaimer in
the documentation and/or other materials provided with the
distribution.

* Neither the name of Intel Corporation nor the names of its
contributors may be used to endorse or promote products derived
from this software without specific prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
"AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
(INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/
/* ------------------------------------------------------------------------- */
public class obs_qsv {
	private obs_encoder encoder;
	private  params;
	private qsv_t context;
	private Object extra_data;
	private Object sei;
	private Object extra_data_size;
	private Object sei_size;
	private Object performance_token;
	
	public obs_qsv(obs_encoder encoder,  params, qsv_t context, Object extra_data, Object sei, Object extra_data_size, Object sei_size, Object performance_token) {
		setEncoder(encoder);
		setParams(params);
		setContext(context);
		setExtra_data(extra_data);
		setSei(sei);
		setExtra_data_size(extra_data_size);
		setSei_size(sei_size);
		setPerformance_token(performance_token);
	}
	public obs_qsv() {
	}
	
	public void clear_data() {
		qsv_t generatedContext = this.getContext();
		Object generatedExtra_data = this.getExtra_data();
		if (generatedContext) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/EnterCriticalSection(ModernizedCProgram.g_QsvCs);
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/qsv_encoder_close(generatedContext);
			this.setContext(((Object)0));
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/LeaveCriticalSection(ModernizedCProgram.g_QsvCs);
			ModernizedCProgram.bfree(generatedExtra_data);
			this.setExtra_data(((Object)0));
		} 
		Object generatedContext = obsx264.getContext();
		Object generatedSei = obsx264.getSei();
		Object generatedExtra_data = obsx264.getExtra_data();
		if (generatedContext) {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/x264_encoder_close(generatedContext);
			ModernizedCProgram.bfree(generatedSei);
			ModernizedCProgram.bfree(generatedExtra_data);
			obsx264.setContext(((Object)0));
			obsx264.setSei(((Object)0));
			obsx264.setExtra_data(((Object)0));
		} 
	}
	public void load_headers() {
		 uint8_t = new ();
		header;
		 sei = 0;
		// Not sure if SEI is needed.// Just filling in empty meaningless SEI message.
		/*Error: Function owner not recognized*/// Seems to work fine.// DARRAY(uint8_t) sei;/*Error: Function owner not recognized*/// Seems to work fine.// DARRAY(uint8_t) sei;da_init(header)// da_init(sei);;// da_init(sei);
		 pSPS = new ();
		 pPPS = new ();
		uint16_t nSPS = new uint16_t();
		uint16_t nPPS = new uint16_t();
		qsv_t generatedContext = this.getContext();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/qsv_encoder_headers(generatedContext, pSPS, pPPS, nSPS, nPPS);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_push_back_array(header, pSPS, nSPS);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_push_back_array(header, pPPS, nPPS);
		this.setExtra_data(header.getArray());
		this.setExtra_data_size(header.getNum());
		this.setSei(sei);
		this.setSei_size(1);
		 nals = new ();
		int nal_count;
		 uint8_t = new ();
		header;
		 uint8_t = new ();
		sei;
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_init(header);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_init(sei);
		Object generatedContext = obsx264.getContext();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/x264_encoder_headers(generatedContext, nals, nal_count);
		for (int i = 0;
		 i < nal_count; i++) {
			 nal = nals + i;
			if (nal.getI_type() == NAL_SEI) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_push_back_array(sei, nal.getP_payload(), nal.getI_payload());
			} else {
					/*Error: Function owner not recognized*//*Error: Function owner not recognized*/da_push_back_array(header, nal.getP_payload(), nal.getI_payload());
			} 
		}
		obsx264.setExtra_data(header.getArray());
		obsx264.setExtra_data_size(header.getNum());
		obsx264.setSei(sei.getArray());
		obsx264.setSei_size(sei.getNum());
	}
	public obs_encoder getEncoder() {
		return encoder;
	}
	public void setEncoder(obs_encoder newEncoder) {
		encoder = newEncoder;
	}
	public  getParams() {
		return params;
	}
	public void setParams( newParams) {
		params = newParams;
	}
	public qsv_t getContext() {
		return context;
	}
	public void setContext(qsv_t newContext) {
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

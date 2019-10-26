package application;

/******************************************************************************
    Copyright (C) 2013 by Hugh Bailey <obs.jim@gmail.com>

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
public class audio_resampler {
	private SwrContext context;
	private Object opened;
	private Object input_freq;
	private Object input_layout;
	private AVSampleFormat input_format;
	private Object output_buffer;
	private Object output_layout;
	private AVSampleFormat output_format;
	private int output_size;
	private Object output_ch;
	private Object output_freq;
	private Object output_planes;
	
	public audio_resampler(SwrContext context, Object opened, Object input_freq, Object input_layout, AVSampleFormat input_format, Object output_buffer, Object output_layout, AVSampleFormat output_format, int output_size, Object output_ch, Object output_freq, Object output_planes) {
		setContext(context);
		setOpened(opened);
		setInput_freq(input_freq);
		setInput_layout(input_layout);
		setInput_format(input_format);
		setOutput_buffer(output_buffer);
		setOutput_layout(output_layout);
		setOutput_format(output_format);
		setOutput_size(output_size);
		setOutput_ch(output_ch);
		setOutput_freq(output_freq);
		setOutput_planes(output_planes);
	}
	public audio_resampler() {
	}
	
	public audio_resampler audio_resampler_create(Object dst, Object src) {
		audio_resampler rs = ModernizedCProgram.bzalloc();
		int errcode;
		rs.setOpened(false);
		rs.setInput_freq(src.getSamples_per_sec());
		rs.setInput_layout(ModernizedCProgram.convert_speaker_layout(src.getSpeakers()));
		rs.setInput_format(ModernizedCProgram.convert_audio_format(src.getFormat()));
		rs.setOutput_size(0);
		rs.setOutput_ch(ModernizedCProgram.get_audio_channels(dst.getSpeakers()));
		rs.setOutput_freq(dst.getSamples_per_sec());
		rs.setOutput_layout(ModernizedCProgram.convert_speaker_layout(dst.getSpeakers()));
		rs.setOutput_format(ModernizedCProgram.convert_audio_format(dst.getFormat()));
		Object generatedOutput_ch = rs.getOutput_ch();
		rs.setOutput_planes(ModernizedCProgram.is_audio_planar(dst.getFormat()) ? generatedOutput_ch : 1);
		Object generatedOutput_layout = rs.getOutput_layout();
		AVSampleFormat generatedOutput_format = rs.getOutput_format();
		Object generatedInput_layout = rs.getInput_layout();
		AVSampleFormat generatedInput_format = rs.getInput_format();
		rs.setContext(.swr_alloc_set_opts(NULL, generatedOutput_layout, generatedOutput_format, dst.getSamples_per_sec(), generatedInput_layout, generatedInput_format, src.getSamples_per_sec(), 0, NULL));
		SwrContext generatedContext = rs.getContext();
		if (!generatedContext) {
			ModernizedCProgram.blog(LOG_ERROR, "swr_alloc_set_opts failed");
			rs.audio_resampler_destroy();
			return NULL;
		} 
		if (generatedInput_layout == AV_CH_LAYOUT_MONO && generatedOutput_ch > 1) {
			double[][] matrix = new double[][]{{1}, {1, 1}, {1, 1, 0}, {1, 1, 1, 1}, {1, 1, 1, 0, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 0, 1, 1, 1}, {1, 1, 1, 0, 1, 1, 1, 1}};
			if (.swr_set_matrix(generatedContext, matrix[generatedOutput_ch - 1], 1) < 0) {
				ModernizedCProgram.blog(LOG_DEBUG, "swr_set_matrix failed for mono upmix\n");
			} 
		} 
		errcode = .swr_init(generatedContext);
		if (errcode != 0) {
			ModernizedCProgram.blog(LOG_ERROR, "avresample_open failed: error code %d", errcode);
			rs.audio_resampler_destroy();
			return NULL;
		} 
		return rs;
	}
	public void audio_resampler_destroy() {
		SwrContext generatedContext = this.getContext();
		Object generatedOutput_buffer = this.getOutput_buffer();
		if (rs) {
			if (generatedContext) {
				.swr_free(generatedContext);
			} 
			if (generatedOutput_buffer[0]) {
				.av_freep(generatedOutput_buffer[0]);
			} 
			ModernizedCProgram.bfree(rs);
		} 
	}
	public Object audio_resampler_resample(Object output, Object out_frames, Object ts_offset, Object input, Object in_frames) {
		if (!rs) {
			return false;
		} 
		SwrContext generatedContext = this.getContext();
		SwrContext context = generatedContext;
		int ret;
		Object generatedInput_freq = this.getInput_freq();
		 delay = .swr_get_delay(context, generatedInput_freq);
		Object generatedOutput_freq = this.getOutput_freq();
		int estimated = (int).av_rescale_rnd(delay + ()in_frames, ()generatedOutput_freq, ()generatedInput_freq, AV_ROUND_UP);
		ts_offset = ().swr_get_delay(context, 1000000000);
		int generatedOutput_size = this.getOutput_size();
		Object generatedOutput_buffer = this.getOutput_buffer();
		Object generatedOutput_ch = this.getOutput_ch();
		AVSampleFormat generatedOutput_format = this.getOutput_format();
		if (estimated > generatedOutput_size) {
			if (generatedOutput_buffer[0]) {
				.av_freep(generatedOutput_buffer[0]);
			} 
			.av_samples_alloc(generatedOutput_buffer, NULL, generatedOutput_ch, estimated, generatedOutput_format, 0);
			this.setOutput_size(estimated);
		} 
		ret = .swr_convert(context, generatedOutput_buffer, generatedOutput_size, ()input, in_frames);
		if (ret < 0) {
			ModernizedCProgram.blog(LOG_ERROR, "swr_convert failed: %d", ret);
			return false;
		} 
		Object generatedOutput_planes = this.getOutput_planes();
		for ( i = 0;
		 i < generatedOutput_planes; i++) {
			output[i] = generatedOutput_buffer[i];
		}
		out_frames = ()ret;
		return true;
	}
	public SwrContext getContext() {
		return context;
	}
	public void setContext(SwrContext newContext) {
		context = newContext;
	}
	public Object getOpened() {
		return opened;
	}
	public void setOpened(Object newOpened) {
		opened = newOpened;
	}
	public Object getInput_freq() {
		return input_freq;
	}
	public void setInput_freq(Object newInput_freq) {
		input_freq = newInput_freq;
	}
	public Object getInput_layout() {
		return input_layout;
	}
	public void setInput_layout(Object newInput_layout) {
		input_layout = newInput_layout;
	}
	public AVSampleFormat getInput_format() {
		return input_format;
	}
	public void setInput_format(AVSampleFormat newInput_format) {
		input_format = newInput_format;
	}
	public Object getOutput_buffer() {
		return output_buffer;
	}
	public void setOutput_buffer(Object newOutput_buffer) {
		output_buffer = newOutput_buffer;
	}
	public Object getOutput_layout() {
		return output_layout;
	}
	public void setOutput_layout(Object newOutput_layout) {
		output_layout = newOutput_layout;
	}
	public AVSampleFormat getOutput_format() {
		return output_format;
	}
	public void setOutput_format(AVSampleFormat newOutput_format) {
		output_format = newOutput_format;
	}
	public int getOutput_size() {
		return output_size;
	}
	public void setOutput_size(int newOutput_size) {
		output_size = newOutput_size;
	}
	public Object getOutput_ch() {
		return output_ch;
	}
	public void setOutput_ch(Object newOutput_ch) {
		output_ch = newOutput_ch;
	}
	public Object getOutput_freq() {
		return output_freq;
	}
	public void setOutput_freq(Object newOutput_freq) {
		output_freq = newOutput_freq;
	}
	public Object getOutput_planes() {
		return output_planes;
	}
	public void setOutput_planes(Object newOutput_planes) {
		output_planes = newOutput_planes;
	}
}

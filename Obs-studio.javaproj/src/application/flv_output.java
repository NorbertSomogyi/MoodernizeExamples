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
public class flv_output {
	private obs_output output;
	private dstr path;
	private _iobuf file;
	private Object active;
	private Object stopping;
	private Object stop_ts;
	private Object sent_headers;
	private Object last_packet_ts;
	private Object mutex;
	private Object got_first_video;
	private Object start_dts_offset;
	
	public flv_output(obs_output output, dstr path, _iobuf file, Object active, Object stopping, Object stop_ts, Object sent_headers, Object last_packet_ts, Object mutex, Object got_first_video, Object start_dts_offset) {
		setOutput(output);
		setPath(path);
		setFile(file);
		setActive(active);
		setStopping(stopping);
		setStop_ts(stop_ts);
		setSent_headers(sent_headers);
		setLast_packet_ts(last_packet_ts);
		setMutex(mutex);
		setGot_first_video(got_first_video);
		setStart_dts_offset(start_dts_offset);
	}
	public flv_output() {
	}
	
	public void write_meta_data() {
		uint8_t meta_data = new uint8_t();
		size_t meta_data_size = new size_t();
		obs_output generatedOutput = this.getOutput();
		generatedOutput.flv_meta_data(meta_data, meta_data_size, true, 0);
		_iobuf generatedFile = this.getFile();
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fwrite(meta_data, 1, meta_data_size, generatedFile);
		ModernizedCProgram.bfree(meta_data);
	}
	public void write_audio_header() {
		obs_output generatedOutput = this.getOutput();
		obs_output_t context = generatedOutput;
		obs_encoder obs_encoder = new obs_encoder();
		obs_encoder_t aencoder = obs_encoder.obs_output_get_audio_encoder(context, 0);
		encoder_packet packet = new encoder_packet(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		Object generatedData = packet.getData();
		Object generatedSize = packet.getSize();
		ModernizedCProgram.obs_encoder_get_extra_data(aencoder, generatedData, generatedSize);
		ModernizedCProgram.write_packet(stream, packet, true);
	}
	public void write_video_header() {
		obs_output generatedOutput = this.getOutput();
		obs_output_t context = generatedOutput;
		obs_encoder obs_encoder = new obs_encoder();
		obs_encoder_t vencoder = obs_encoder.obs_output_get_video_encoder(context);
		uint8_t header = new uint8_t();
		size_t size = new size_t();
		encoder_packet packet = new encoder_packet(/*Error: Invalid initializer*/, /*Error: Invalid initializer*/, /*Error: Invalid initializer*/);
		ModernizedCProgram.obs_encoder_get_extra_data(vencoder, header, size);
		Object generatedData = packet.getData();
		packet.setSize(ModernizedCProgram.obs_parse_avc_header(generatedData, header, size));
		ModernizedCProgram.write_packet(stream, packet, true);
		ModernizedCProgram.bfree(generatedData);
	}
	public void write_headers() {
		stream.write_meta_data();
		stream.write_video_header();
		stream.write_audio_header();
	}
	public void flv_output_actual_stop(int code) {
		Object generatedActive = this.getActive();
		ModernizedCProgram.os_atomic_set_bool(generatedActive, false);
		_iobuf generatedFile = this.getFile();
		Object generatedLast_packet_ts = this.getLast_packet_ts();
		if (generatedFile) {
			generatedFile.write_file_info(generatedLast_packet_ts, generatedFile.os_ftelli64());
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/fclose(generatedFile);
		} 
		obs_output generatedOutput = this.getOutput();
		if (code) {
			generatedOutput.obs_output_signal_stop(code);
		} else {
				generatedOutput.obs_output_end_data_capture();
		} 
		ModernizedCProgram.blog(LOG_INFO, "[flv output: '%s'] FLV file output complete", ModernizedCProgram.obs_output_get_name(generatedOutput));
	}
	public obs_output getOutput() {
		return output;
	}
	public void setOutput(obs_output newOutput) {
		output = newOutput;
	}
	public dstr getPath() {
		return path;
	}
	public void setPath(dstr newPath) {
		path = newPath;
	}
	public _iobuf getFile() {
		return file;
	}
	public void setFile(_iobuf newFile) {
		file = newFile;
	}
	public Object getActive() {
		return active;
	}
	public void setActive(Object newActive) {
		active = newActive;
	}
	public Object getStopping() {
		return stopping;
	}
	public void setStopping(Object newStopping) {
		stopping = newStopping;
	}
	public Object getStop_ts() {
		return stop_ts;
	}
	public void setStop_ts(Object newStop_ts) {
		stop_ts = newStop_ts;
	}
	public Object getSent_headers() {
		return sent_headers;
	}
	public void setSent_headers(Object newSent_headers) {
		sent_headers = newSent_headers;
	}
	public Object getLast_packet_ts() {
		return last_packet_ts;
	}
	public void setLast_packet_ts(Object newLast_packet_ts) {
		last_packet_ts = newLast_packet_ts;
	}
	public Object getMutex() {
		return mutex;
	}
	public void setMutex(Object newMutex) {
		mutex = newMutex;
	}
	public Object getGot_first_video() {
		return got_first_video;
	}
	public void setGot_first_video(Object newGot_first_video) {
		got_first_video = newGot_first_video;
	}
	public Object getStart_dts_offset() {
		return start_dts_offset;
	}
	public void setStart_dts_offset(Object newStart_dts_offset) {
		start_dts_offset = newStart_dts_offset;
	}
}

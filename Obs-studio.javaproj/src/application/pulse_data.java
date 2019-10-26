package application;

/*
Copyright (C) 2014 by Leonhard Oelke <leonhard@in-verted.de>

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
*/
public class pulse_data {
	private obs_source source;
	private Object stream;
	private Byte device;
	private Object input;
	private speaker_layout speakers;
	private Object format;
	private Object samples_per_sec;
	private Object bytes_per_frame;
	private Object channels;
	private Object first_ts;
	private Object packets;
	private Object frames;
	
	public pulse_data(obs_source source, Object stream, Byte device, Object input, speaker_layout speakers, Object format, Object samples_per_sec, Object bytes_per_frame, Object channels, Object first_ts, Object packets, Object frames) {
		setSource(source);
		setStream(stream);
		setDevice(device);
		setInput(input);
		setSpeakers(speakers);
		setFormat(format);
		setSamples_per_sec(samples_per_sec);
		setBytes_per_frame(bytes_per_frame);
		setChannels(channels);
		setFirst_ts(first_ts);
		setPackets(packets);
		setFrames(frames);
	}
	public pulse_data() {
	}
	
	public Object pulse_start_recording() {
		if (ModernizedCProgram.pulse_get_server_info(pulse_server_info, (Object)ModernizedCProgram.data) < 0) {
			ModernizedCProgram.blog(LOG_ERROR, "pulse-input: Unable to get server info !");
			return -1;
		} 
		if (ModernizedCProgram.pulse_get_source_info(pulse_source_info, ModernizedCProgram.data.getDevice(), (Object)ModernizedCProgram.data) < 0) {
			ModernizedCProgram.blog(LOG_ERROR, "pulse-input: Unable to get source info !");
			return -1;
		} 
		if (ModernizedCProgram.data.getFormat() == PA_SAMPLE_INVALID) {
			ModernizedCProgram.blog(LOG_ERROR, "pulse-input: An error occurred while getting the source info!");
			return -1;
		} 
		 spec = new ();
		spec.setFormat(ModernizedCProgram.data.getFormat());
		spec.setRate(ModernizedCProgram.data.getSamples_per_sec());
		spec.setChannels(ModernizedCProgram.data.getChannels());
		if (!.pa_sample_spec_valid(spec)) {
			ModernizedCProgram.blog(LOG_ERROR, "pulse-input: Sample spec is not valid");
			return -1;
		} 
		ModernizedCProgram.data.setSpeakers(ModernizedCProgram.pulse_channels_to_obs_speakers(spec.getChannels()));
		ModernizedCProgram.data.setBytes_per_frame(.pa_frame_size(spec));
		 channel_map = ModernizedCProgram.pulse_channel_map(ModernizedCProgram.data.getSpeakers());
		ModernizedCProgram.data.setStream(ModernizedCProgram.pulse_stream_new(ModernizedCProgram.obs_source_get_name(ModernizedCProgram.data.getSource()), spec, channel_map));
		if (!ModernizedCProgram.data.getStream()) {
			ModernizedCProgram.blog(LOG_ERROR, "pulse-input: Unable to create stream");
			return -1;
		} 
		ModernizedCProgram.pulse_lock();
		.pa_stream_set_read_callback(ModernizedCProgram.data.getStream(), pulse_stream_read, (Object)ModernizedCProgram.data);
		ModernizedCProgram.pulse_unlock();
		 attr = new ();
		attr.setFragsize(.pa_usec_to_bytes(25000, spec));
		attr.setMaxlength((uint32_t)-1);
		attr.setMinreq((uint32_t)-1);
		attr.setPrebuf((uint32_t)-1);
		attr.setTlength((uint32_t)-1);
		 flags = PA_STREAM_ADJUST_LATENCY;
		ModernizedCProgram.pulse_lock();
		int_fast32_t ret = .pa_stream_connect_record(ModernizedCProgram.data.getStream(), ModernizedCProgram.data.getDevice(), attr, flags);
		ModernizedCProgram.pulse_unlock();
		if (ret < 0) {
			ModernizedCProgram.data.pulse_stop_recording();
			ModernizedCProgram.blog(LOG_ERROR, "pulse-input: Unable to connect to stream");
			return -1;
		} 
		ModernizedCProgram.blog(LOG_INFO, "pulse-input: Started recording from '%s'", ModernizedCProgram.data.getDevice());
		return 0/**
		 * stop recording
		 */;
	}
	public void pulse_stop_recording() {
		if (ModernizedCProgram.data.getStream()) {
			ModernizedCProgram.pulse_lock();
			.pa_stream_disconnect(ModernizedCProgram.data.getStream());
			.pa_stream_unref(ModernizedCProgram.data.getStream());
			ModernizedCProgram.data.setStream(NULL);
			ModernizedCProgram.pulse_unlock();
		} 
		ModernizedCProgram.blog(LOG_INFO, "pulse-input: Stopped recording from '%s'", ModernizedCProgram.data.getDevice());
		ModernizedCProgram.blog(LOG_INFO, "pulse-input: Got %u packets with %I64u frames", ModernizedCProgram.data.getPackets(), ModernizedCProgram.data.getFrames());
		ModernizedCProgram.data.setFirst_ts(0);
		ModernizedCProgram.data.setPackets(0);
		ModernizedCProgram.data.setFrames(0/**
		 * input info callback
		 */);
	}
	/**
	 * get obs from pulse audio format
	 */
	public obs_source getSource() {
		return source;
	}
	public void setSource(obs_source newSource) {
		source = newSource;
	}
	public Object getStream() {
		return stream;
	}
	public void setStream(Object newStream) {
		stream = newStream;
	}
	public Byte getDevice() {
		return device;
	}
	public void setDevice(Byte newDevice) {
		device = newDevice;
	}
	public Object getInput() {
		return input;
	}
	public void setInput(Object newInput) {
		input = newInput;
	}
	public speaker_layout getSpeakers() {
		return speakers;
	}
	public void setSpeakers(speaker_layout newSpeakers) {
		speakers = newSpeakers;
	}
	public Object getFormat() {
		return format;
	}
	public void setFormat(Object newFormat) {
		format = newFormat;
	}
	public Object getSamples_per_sec() {
		return samples_per_sec;
	}
	public void setSamples_per_sec(Object newSamples_per_sec) {
		samples_per_sec = newSamples_per_sec;
	}
	public Object getBytes_per_frame() {
		return bytes_per_frame;
	}
	public void setBytes_per_frame(Object newBytes_per_frame) {
		bytes_per_frame = newBytes_per_frame;
	}
	public Object getChannels() {
		return channels;
	}
	public void setChannels(Object newChannels) {
		channels = newChannels;
	}
	public Object getFirst_ts() {
		return first_ts;
	}
	public void setFirst_ts(Object newFirst_ts) {
		first_ts = newFirst_ts;
	}
	public Object getPackets() {
		return packets;
	}
	public void setPackets(Object newPackets) {
		packets = newPackets;
	}
	public Object getFrames() {
		return frames;
	}
	public void setFrames(Object newFrames) {
		frames = newFrames;
	}
}

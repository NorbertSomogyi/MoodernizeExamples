package application;

/*
Copyright (C) 2015 by Bernd Buschinski <b.buschinski@gmail.com>

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
public class jack_data {
	private obs_source source;
	private Byte device;
	private Object channels;
	private Object start_jack_server;
	private speaker_layout speakers;
	private Object samples_per_sec;
	private Object bytes_per_frame;
	private Object jack_client;
	private Object[][] jack_ports;
	private Object jack_mutex;
	
	public jack_data(obs_source source, Byte device, Object channels, Object start_jack_server, speaker_layout speakers, Object samples_per_sec, Object bytes_per_frame, Object jack_client, Object[][] jack_ports, Object jack_mutex) {
		setSource(source);
		setDevice(device);
		setChannels(channels);
		setStart_jack_server(start_jack_server);
		setSpeakers(speakers);
		setSamples_per_sec(samples_per_sec);
		setBytes_per_frame(bytes_per_frame);
		setJack_client(jack_client);
		setJack_ports(jack_ports);
		setJack_mutex(jack_mutex);
	}
	public jack_data() {
	}
	
	public Object jack_init() {
		ModernizedCProgram.pthread_mutex_lock(ModernizedCProgram.data.getJack_mutex());
		if (ModernizedCProgram.data.getJack_client() != ((Object)0)) {
			;
		} 
		 jack_option = ModernizedCProgram.data.getStart_jack_server() ? JackNullOption : JackNoStartServer;
		ModernizedCProgram.data.setJack_client(/*Error: Function owner not recognized*/jack_client_open(ModernizedCProgram.data.getDevice(), jack_option, 0));
		if (ModernizedCProgram.data.getJack_client() == ((Object)0)) {
			ModernizedCProgram.blog(LOG_ERROR, "jack-input: jack_client_open Error:Could not create JACK client! %s", ModernizedCProgram.data.getDevice());
			;
		} 
		ModernizedCProgram.data.setJack_ports(()ModernizedCProgram.bzalloc(/*Error: Unsupported expression*/ * ModernizedCProgram.data.getChannels()));
		for (int i = 0;
		 i < ModernizedCProgram.data.getChannels(); ++i) {
			byte[] port_name = new byte[]{(byte)'\0'};
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/snprintf(port_name, /*Error: sizeof expression not supported yet*/, "in_%u", i + 1);
			ModernizedCProgram.data.getJack_ports()[i] = /*Error: Function owner not recognized*/jack_port_register(ModernizedCProgram.data.getJack_client(), port_name, JACK_DEFAULT_AUDIO_TYPE, JackPortIsInput, 0);
			if (ModernizedCProgram.data.getJack_ports()[i] == ((Object)0)) {
				ModernizedCProgram.blog(LOG_ERROR, "jack-input: jack_port_register Error:Could not create JACK port! %s", port_name);
				;
			} 
		}
		if (/*Error: Function owner not recognized*/jack_set_process_callback(ModernizedCProgram.data.getJack_client(), jack_process_callback, ModernizedCProgram.data) != 0) {
			ModernizedCProgram.blog(LOG_ERROR, "jack-input: jack_set_process_callback Error");
			;
		} 
		if (/*Error: Function owner not recognized*/jack_activate(ModernizedCProgram.data.getJack_client()) != 0) {
			ModernizedCProgram.blog(LOG_ERROR, "jack-input: jack_activate Error:Could not activate JACK client!");
			;
		} 
		return 0;
		return 1;
	}
	public void deactivate_jack() {
		ModernizedCProgram.pthread_mutex_lock(ModernizedCProgram.data.getJack_mutex());
		if (ModernizedCProgram.data.getJack_client()) {
			if (ModernizedCProgram.data.getJack_ports() != ((Object)0)) {
				for (int i = 0;
				 i < ModernizedCProgram.data.getChannels(); ++i) {
					if (ModernizedCProgram.data.getJack_ports()[i] != ((Object)0)) {
						/*Error: Function owner not recognized*//*Error: Function owner not recognized*/jack_port_unregister(ModernizedCProgram.data.getJack_client(), ModernizedCProgram.data.getJack_ports()[i]);
					} 
				}
				ModernizedCProgram.bfree(ModernizedCProgram.data.getJack_ports());
				ModernizedCProgram.data.setJack_ports(((Object)0));
			} 
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/jack_client_close(ModernizedCProgram.data.getJack_client());
			ModernizedCProgram.data.setJack_client(((Object)0));
		} 
		ModernizedCProgram.pthread_mutex_unlock(ModernizedCProgram.data.getJack_mutex());
	}
	public obs_source getSource() {
		return source;
	}
	public void setSource(obs_source newSource) {
		source = newSource;
	}
	public Byte getDevice() {
		return device;
	}
	public void setDevice(Byte newDevice) {
		device = newDevice;
	}
	public Object getChannels() {
		return channels;
	}
	public void setChannels(Object newChannels) {
		channels = newChannels;
	}
	public Object getStart_jack_server() {
		return start_jack_server;
	}
	public void setStart_jack_server(Object newStart_jack_server) {
		start_jack_server = newStart_jack_server;
	}
	public speaker_layout getSpeakers() {
		return speakers;
	}
	public void setSpeakers(speaker_layout newSpeakers) {
		speakers = newSpeakers;
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
	public Object getJack_client() {
		return jack_client;
	}
	public void setJack_client(Object newJack_client) {
		jack_client = newJack_client;
	}
	public Object[][] getJack_ports() {
		return jack_ports;
	}
	public void setJack_ports(Object[][] newJack_ports) {
		jack_ports = newJack_ports;
	}
	public Object getJack_mutex() {
		return jack_mutex;
	}
	public void setJack_mutex(Object newJack_mutex) {
		jack_mutex = newJack_mutex;
	}
}

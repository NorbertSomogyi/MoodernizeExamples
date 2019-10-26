package application;

/*
Copyright (C) 2015. Guillermo A. Amaral B. <g@maral.me>

Based on Pulse Input plugin by Leonhard Oelke.

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
public class alsa_data {
	private obs_source source;
	private Byte device;
	private Object listen_thread;
	private Object reopen_thread;
	private Object abort_event;
	private Object listen;
	private Object reopen;
	private Object handle;
	private Object format;
	private Object period_size;
	private int channels;
	private int rate;
	private int sample_size;
	private Object buffer;
	private Object first_ts;
	
	public alsa_data(obs_source source, Byte device, Object listen_thread, Object reopen_thread, Object abort_event, Object listen, Object reopen, Object handle, Object format, Object period_size, int channels, int rate, int sample_size, Object buffer, Object first_ts) {
		setSource(source);
		setDevice(device);
		setListen_thread(listen_thread);
		setReopen_thread(reopen_thread);
		setAbort_event(abort_event);
		setListen(listen);
		setReopen(reopen);
		setHandle(handle);
		setFormat(format);
		setPeriod_size(period_size);
		setChannels(channels);
		setRate(rate);
		setSample_size(sample_size);
		setBuffer(buffer);
		setFirst_ts(first_ts);
	}
	public alsa_data() {
	}
	
	/*****************************************************************************/
	public Object _alsa_try_open() {
		ModernizedCProgram.data._alsa_stop_reopen();
		if (ModernizedCProgram.data._alsa_open()) {
			return true;
		} 
		ModernizedCProgram.data._alsa_start_reopen();
		return false;
	}
	public Object _alsa_open() {
		pthread_attr_t attr = new pthread_attr_t();
		int err;
		err = .snd_pcm_open(ModernizedCProgram.data.getHandle(), ModernizedCProgram.data.getDevice(), SND_PCM_STREAM_CAPTURE, 0);
		if (err < 0) {
			ModernizedCProgram.blog(LOG_ERROR, "alsa-input: Failed to open '%s': %s", ModernizedCProgram.data.getDevice(), .snd_strerror(err));
			return false;
		} 
		if (!ModernizedCProgram.data._alsa_configure()) {
			;
		} 
		if (.snd_pcm_state(ModernizedCProgram.data.getHandle()) != SND_PCM_STATE_PREPARED) {
			ModernizedCProgram.blog(LOG_ERROR, "alsa-input: Device not prepared: '%s'", ModernizedCProgram.data.getDevice());
			;
		} 
		err = .snd_pcm_start(ModernizedCProgram.data.getHandle());
		if (err < 0) {
			ModernizedCProgram.blog(LOG_ERROR, "alsa-input: Failed to start '%s': %s", ModernizedCProgram.data.getDevice(), .snd_strerror(err));
			;
		} 
		ModernizedCProgram.pthread_attr_init(/* create capture thread */attr);
		ModernizedCProgram.pthread_attr_setdetachstate(attr, 0);
		err = ModernizedCProgram.pthread_create(ModernizedCProgram.data.getListen_thread(), attr, ModernizedCProgram._alsa_listen, ModernizedCProgram.data);
		if (err) {
			ModernizedCProgram.pthread_attr_destroy(attr);
			ModernizedCProgram.blog(LOG_ERROR, "alsa-input: Failed to create capture thread for device '%s'.", ModernizedCProgram.data.getDevice());
			;
		} 
		ModernizedCProgram.pthread_attr_destroy(attr);
		return true;
		return false;
	}
	public void _alsa_close() {
		if (ModernizedCProgram.data.getListen_thread()) {
			ModernizedCProgram.os_atomic_set_bool(ModernizedCProgram.data.getListen(), false);
			ModernizedCProgram.pthread_join(ModernizedCProgram.data.getListen_thread(), ((Object)0));
			ModernizedCProgram.data.setListen_thread(0);
		} 
		if (ModernizedCProgram.data.getHandle()) {
			.snd_pcm_drop(ModernizedCProgram.data.getHandle());
			;
		} 
		if (ModernizedCProgram.data.getBuffer()) {
			;
		} 
	}
	public Object _alsa_configure() {
		 hwparams = new ();
		int err;
		int dir;
		.snd_pcm_hw_params_alloca(hwparams);
		err = .snd_pcm_hw_params_any(ModernizedCProgram.data.getHandle(), hwparams);
		if (err < 0) {
			ModernizedCProgram.blog(LOG_ERROR, "alsa-input: snd_pcm_hw_params_any failed: %s", .snd_strerror(err));
			return false;
		} 
		err = .snd_pcm_hw_params_set_access(ModernizedCProgram.data.getHandle(), hwparams, SND_PCM_ACCESS_RW_INTERLEAVED);
		if (err < 0) {
			ModernizedCProgram.blog(LOG_ERROR, "alsa-input: snd_pcm_hw_params_set_access failed: %s", .snd_strerror(err));
			return false;
		} 
		ModernizedCProgram.data.setFormat(SND_PCM_FORMAT_S16);
		err = .snd_pcm_hw_params_set_format(ModernizedCProgram.data.getHandle(), hwparams, ModernizedCProgram.data.getFormat());
		if (err < 0) {
			ModernizedCProgram.blog(LOG_ERROR, "alsa-input: snd_pcm_hw_params_set_format failed: %s", .snd_strerror(err));
			return false;
		} 
		err = .snd_pcm_hw_params_set_rate_near(ModernizedCProgram.data.getHandle(), hwparams, ModernizedCProgram.data.getRate(), 0);
		if (err < 0) {
			ModernizedCProgram.blog(LOG_ERROR, "alsa-input: snd_pcm_hw_params_set_rate_near failed: %s", .snd_strerror(err));
			return false;
		} 
		ModernizedCProgram.blog(LOG_INFO, "alsa-input: PCM '%s' rate set to %d", ModernizedCProgram.data.getDevice(), ModernizedCProgram.data.getRate());
		err = .snd_pcm_hw_params_get_channels(hwparams, ModernizedCProgram.data.getChannels());
		if (err < 0) {
			ModernizedCProgram.data.setChannels(2);
		} 
		err = .snd_pcm_hw_params_set_channels_near(ModernizedCProgram.data.getHandle(), hwparams, ModernizedCProgram.data.getChannels());
		if (err < 0) {
			ModernizedCProgram.blog(LOG_ERROR, "alsa-input: snd_pcm_hw_params_set_channels_near failed: %s", .snd_strerror(err));
			return false;
		} 
		ModernizedCProgram.blog(LOG_INFO, "alsa-input: PCM '%s' channels set to %d", ModernizedCProgram.data.getDevice(), ModernizedCProgram.data.getChannels());
		err = .snd_pcm_hw_params(ModernizedCProgram.data.getHandle(), hwparams);
		if (err < 0) {
			ModernizedCProgram.blog(LOG_ERROR, "alsa-input: snd_pcm_hw_params failed: %s", .snd_strerror(err));
			return false;
		} 
		err = .snd_pcm_hw_params_get_period_size(hwparams, ModernizedCProgram.data.getPeriod_size(), dir);
		if (err < 0) {
			ModernizedCProgram.blog(LOG_ERROR, "alsa-input: snd_pcm_hw_params_get_period_size failed: %s", .snd_strerror(err));
			return false;
		} 
		ModernizedCProgram.data.setSample_size((ModernizedCProgram.data.getChannels() * .snd_pcm_format_physical_width(ModernizedCProgram.data.getFormat())) / 8);
		if (ModernizedCProgram.data.getBuffer()) {
			ModernizedCProgram.bfree(ModernizedCProgram.data.getBuffer());
		} 
		ModernizedCProgram.data.setBuffer(ModernizedCProgram.bzalloc(ModernizedCProgram.data.getPeriod_size() * ModernizedCProgram.data.getSample_size()));
		return true;
	}
	public void _alsa_start_reopen() {
		pthread_attr_t attr = new pthread_attr_t();
		int err;
		if (ModernizedCProgram.os_atomic_load_bool(ModernizedCProgram.data.getReopen())) {
			return ;
		} 
		ModernizedCProgram.pthread_attr_init(attr);
		ModernizedCProgram.pthread_attr_setdetachstate(attr, 0);
		err = ModernizedCProgram.pthread_create(ModernizedCProgram.data.getReopen_thread(), attr, ModernizedCProgram._alsa_reopen, ModernizedCProgram.data);
		if (err) {
			ModernizedCProgram.blog(LOG_ERROR, "alsa-input: Failed to create reopen thread for device '%s'.", ModernizedCProgram.data.getDevice());
		} 
		ModernizedCProgram.pthread_attr_destroy(attr);
	}
	public void _alsa_stop_reopen() {
		if (ModernizedCProgram.os_atomic_load_bool(ModernizedCProgram.data.getReopen())) {
			ModernizedCProgram.data.getAbort_event().os_event_signal();
		} 
		if (ModernizedCProgram.data.getReopen_thread()) {
			ModernizedCProgram.pthread_join(ModernizedCProgram.data.getReopen_thread(), ((Object)0));
			ModernizedCProgram.data.setReopen_thread(0);
		} 
		ModernizedCProgram.data.getAbort_event().os_event_reset();
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
	public Object getListen_thread() {
		return listen_thread;
	}
	public void setListen_thread(Object newListen_thread) {
		listen_thread = newListen_thread;
	}
	public Object getReopen_thread() {
		return reopen_thread;
	}
	public void setReopen_thread(Object newReopen_thread) {
		reopen_thread = newReopen_thread;
	}
	public Object getAbort_event() {
		return abort_event;
	}
	public void setAbort_event(Object newAbort_event) {
		abort_event = newAbort_event;
	}
	public Object getListen() {
		return listen;
	}
	public void setListen(Object newListen) {
		listen = newListen;
	}
	public Object getReopen() {
		return reopen;
	}
	public void setReopen(Object newReopen) {
		reopen = newReopen;
	}
	public Object getHandle() {
		return handle;
	}
	public void setHandle(Object newHandle) {
		handle = newHandle;
	}
	public Object getFormat() {
		return format;
	}
	public void setFormat(Object newFormat) {
		format = newFormat;
	}
	public Object getPeriod_size() {
		return period_size;
	}
	public void setPeriod_size(Object newPeriod_size) {
		period_size = newPeriod_size;
	}
	public int getChannels() {
		return channels;
	}
	public void setChannels(int newChannels) {
		channels = newChannels;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int newRate) {
		rate = newRate;
	}
	public int getSample_size() {
		return sample_size;
	}
	public void setSample_size(int newSample_size) {
		sample_size = newSample_size;
	}
	public Object getBuffer() {
		return buffer;
	}
	public void setBuffer(Object newBuffer) {
		buffer = newBuffer;
	}
	public Object getFirst_ts() {
		return first_ts;
	}
	public void setFirst_ts(Object newFirst_ts) {
		first_ts = newFirst_ts;
	}
}

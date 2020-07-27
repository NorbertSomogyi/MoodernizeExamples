package application;

/* user sources, output channels, and displays */
public class obs_core_data {
	private obs_source first_source;
	private obs_source first_audio_source;
	private obs_display first_display;
	private obs_output first_output;
	private obs_encoder first_encoder;
	private obs_service first_service;
	private Object sources_mutex;
	private Object displays_mutex;
	private Object outputs_mutex;
	private Object encoders_mutex;
	private Object services_mutex;
	private Object audio_sources_mutex;
	private Object draw_callbacks_mutex;
	private Object ;
	private Object ;
	private obs_view main_view;
	private int unnamed_index;
	private obs_data private_data;
	private Object valid;
	
	public obs_core_data(obs_source first_source, obs_source first_audio_source, obs_display first_display, obs_output first_output, obs_encoder first_encoder, obs_service first_service, Object sources_mutex, Object displays_mutex, Object outputs_mutex, Object encoders_mutex, Object services_mutex, Object audio_sources_mutex, Object draw_callbacks_mutex, Object,  Object,  obs_view main_view, int unnamed_index, obs_data private_data, Object valid) {
		setFirst_source(first_source);
		setFirst_audio_source(first_audio_source);
		setFirst_display(first_display);
		setFirst_output(first_output);
		setFirst_encoder(first_encoder);
		setFirst_service(first_service);
		setSources_mutex(sources_mutex);
		setDisplays_mutex(displays_mutex);
		setOutputs_mutex(outputs_mutex);
		setEncoders_mutex(encoders_mutex);
		setServices_mutex(services_mutex);
		setAudio_sources_mutex(audio_sources_mutex);
		setDraw_callbacks_mutex(draw_callbacks_mutex);
		set();
		set();
		setMain_view(main_view);
		setUnnamed_index(unnamed_index);
		setPrivate_data(private_data);
		setValid(valid);
	}
	public obs_core_data() {
	}
	
	public Object find_min_ts(Object min_ts) {
		obs_source_t buffering_source = NULL;
		obs_source source = ModernizedCProgram.data.getFirst_audio_source();
		Object generatedAudio_pending = source.getAudio_pending();
		Object generatedAudio_ts = source.getAudio_ts();
		obs_source generatedNext_audio_source = source.getNext_audio_source();
		while (source) {
			if (!generatedAudio_pending && generatedAudio_ts && generatedAudio_ts < min_ts) {
				min_ts = generatedAudio_ts;
				buffering_source = source;
			} 
			source = (obs_source)generatedNext_audio_source;
		}
		return buffering_source ? ModernizedCProgram.obs_source_get_name(buffering_source) : NULL;
	}
	public Object mark_invalid_sources(Object sample_rate, Object min_ts) {
		 recalculate = false;
		obs_source source = ModernizedCProgram.data.getFirst_audio_source();
		obs_source generatedNext_audio_source = source.getNext_audio_source();
		while (source) {
			recalculate |=  source.audio_buffer_insuffient(sample_rate, min_ts);
			source = (obs_source)generatedNext_audio_source;
		}
		return recalculate;
	}
	public Object calc_min_ts(Object sample_rate, Object min_ts) {
		byte buffering_name = ModernizedCProgram.data.find_min_ts(min_ts);
		if (ModernizedCProgram.data.mark_invalid_sources(sample_rate, min_ts)) {
			buffering_name = ModernizedCProgram.data.find_min_ts(min_ts);
		} 
		return buffering_name;
		 min_ts = 0;
		for ( i = 0;
		 i < 2; i++) {
			if (sources[i] && !sources[i].getAudio_pending()) {
				if (!min_ts || sources[i].getAudio_ts() < min_ts) {
					min_ts = sources[i].getAudio_ts();
				} 
			} 
		}
		return min_ts;
	}
	public obs_source getFirst_source() {
		return first_source;
	}
	public void setFirst_source(obs_source newFirst_source) {
		first_source = newFirst_source;
	}
	public obs_source getFirst_audio_source() {
		return first_audio_source;
	}
	public void setFirst_audio_source(obs_source newFirst_audio_source) {
		first_audio_source = newFirst_audio_source;
	}
	public obs_display getFirst_display() {
		return first_display;
	}
	public void setFirst_display(obs_display newFirst_display) {
		first_display = newFirst_display;
	}
	public obs_output getFirst_output() {
		return first_output;
	}
	public void setFirst_output(obs_output newFirst_output) {
		first_output = newFirst_output;
	}
	public obs_encoder getFirst_encoder() {
		return first_encoder;
	}
	public void setFirst_encoder(obs_encoder newFirst_encoder) {
		first_encoder = newFirst_encoder;
	}
	public obs_service getFirst_service() {
		return first_service;
	}
	public void setFirst_service(obs_service newFirst_service) {
		first_service = newFirst_service;
	}
	public Object getSources_mutex() {
		return sources_mutex;
	}
	public void setSources_mutex(Object newSources_mutex) {
		sources_mutex = newSources_mutex;
	}
	public Object getDisplays_mutex() {
		return displays_mutex;
	}
	public void setDisplays_mutex(Object newDisplays_mutex) {
		displays_mutex = newDisplays_mutex;
	}
	public Object getOutputs_mutex() {
		return outputs_mutex;
	}
	public void setOutputs_mutex(Object newOutputs_mutex) {
		outputs_mutex = newOutputs_mutex;
	}
	public Object getEncoders_mutex() {
		return encoders_mutex;
	}
	public void setEncoders_mutex(Object newEncoders_mutex) {
		encoders_mutex = newEncoders_mutex;
	}
	public Object getServices_mutex() {
		return services_mutex;
	}
	public void setServices_mutex(Object newServices_mutex) {
		services_mutex = newServices_mutex;
	}
	public Object getAudio_sources_mutex() {
		return audio_sources_mutex;
	}
	public void setAudio_sources_mutex(Object newAudio_sources_mutex) {
		audio_sources_mutex = newAudio_sources_mutex;
	}
	public Object getDraw_callbacks_mutex() {
		return draw_callbacks_mutex;
	}
	public void setDraw_callbacks_mutex(Object newDraw_callbacks_mutex) {
		draw_callbacks_mutex = newDraw_callbacks_mutex;
	}
	public Object get() {
		return ;
	}
	public void set(Object new) {
		 = new;
	}
	public Object get() {
		return ;
	}
	public void set(Object new) {
		 = new;
	}
	public obs_view getMain_view() {
		return main_view;
	}
	public void setMain_view(obs_view newMain_view) {
		main_view = newMain_view;
	}
	public int getUnnamed_index() {
		return unnamed_index;
	}
	public void setUnnamed_index(int newUnnamed_index) {
		unnamed_index = newUnnamed_index;
	}
	public obs_data getPrivate_data() {
		return private_data;
	}
	public void setPrivate_data(obs_data newPrivate_data) {
		private_data = newPrivate_data;
	}
	public Object getValid() {
		return valid;
	}
	public void setValid(Object newValid) {
		valid = newValid;
	}
}

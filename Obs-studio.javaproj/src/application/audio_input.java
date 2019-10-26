package application;

public class audio_input {
	private audio_convert_info conversion;
	private audio_resampler resampler;
	private Object callback;
	private Object param;
	
	public audio_input(audio_convert_info conversion, audio_resampler resampler, Object callback, Object param) {
		setConversion(conversion);
		setResampler(resampler);
		setCallback(callback);
		setParam(param);
	}
	public audio_input() {
	}
	
	public void audio_input_free() {
		audio_resampler generatedResampler = this.getResampler();
		generatedResampler.audio_resampler_destroy();
	}
	public audio_convert_info getConversion() {
		return conversion;
	}
	public void setConversion(audio_convert_info newConversion) {
		conversion = newConversion;
	}
	public audio_resampler getResampler() {
		return resampler;
	}
	public void setResampler(audio_resampler newResampler) {
		resampler = newResampler;
	}
	public Object getCallback() {
		return callback;
	}
	public void setCallback(Object newCallback) {
		callback = newCallback;
	}
	public Object getParam() {
		return param;
	}
	public void setParam(Object newParam) {
		param = newParam;
	}
}

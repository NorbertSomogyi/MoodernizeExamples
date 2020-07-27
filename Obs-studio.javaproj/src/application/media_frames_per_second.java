package application;

public class media_frames_per_second {
	private Object numerator;
	private Object denominator;
	
	public media_frames_per_second(Object numerator, Object denominator) {
		setNumerator(numerator);
		setDenominator(denominator);
	}
	public media_frames_per_second() {
	}
	
	public double media_frames_per_second_to_frame_interval() {
		Object generatedDenominator = this.getDenominator();
		Object generatedNumerator = this.getNumerator();
		return (double)generatedDenominator / generatedNumerator;
	}
	public double media_frames_per_second_to_fps() {
		Object generatedNumerator = this.getNumerator();
		Object generatedDenominator = this.getDenominator();
		return (double)generatedNumerator / generatedDenominator;
	}
	public Object media_frames_per_second_is_valid() {
		Object generatedNumerator = this.getNumerator();
		Object generatedDenominator = this.getDenominator();
		return generatedNumerator && generatedDenominator;
	}
	public media_frames_per_second obs_property_frame_rate_fps_range_min(obs_property p, Object idx) {
		frame_rate_data data = p.get_type_data(obs_property_type.OBS_PROPERTY_FRAME_RATE);
		Object generatedRanges = data.getRanges();
		return data && generatedRanges.getNum() > idx ? generatedRanges.getArray()[idx].getMin_time() : /*Error: Unsupported expression*/;
	}
	public media_frames_per_second obs_property_frame_rate_fps_range_max(obs_property p, Object idx) {
		frame_rate_data data = p.get_type_data(obs_property_type.OBS_PROPERTY_FRAME_RATE);
		Object generatedRanges = data.getRanges();
		return data && generatedRanges.getNum() > idx ? generatedRanges.getArray()[idx].getMax_time() : /*Error: Unsupported expression*/;
	}
	public Object getNumerator() {
		return numerator;
	}
	public void setNumerator(Object newNumerator) {
		numerator = newNumerator;
	}
	public Object getDenominator() {
		return denominator;
	}
	public void setDenominator(Object newDenominator) {
		denominator = newDenominator;
	}
}

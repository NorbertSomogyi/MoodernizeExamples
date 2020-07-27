package application;

/* -------------------------------------------------------- */
/* -------------------------------------------------------- */
/* -------------------------------------------------------- */
public class noise_suppress_data {
	private obs_source context;
	private int suppress_level;
	private Object last_timestamp;
	private Object frames;
	private Object channels;
	private circlebuf info_buffer;
	private Object input_buffers;
	private Object output_buffers;
	private Object states;
	private Object copy_buffers;
	private Object segment_buffers;
	private obs_audio_data output_audio;
	private Object ;
	
	public noise_suppress_data(obs_source context, int suppress_level, Object last_timestamp, Object frames, Object channels, circlebuf info_buffer, Object input_buffers, Object output_buffers, Object states, Object copy_buffers, Object segment_buffers, obs_audio_data output_audio, Object ) {
		setContext(context);
		setSuppress_level(suppress_level);
		setLast_timestamp(last_timestamp);
		setFrames(frames);
		setChannels(channels);
		setInfo_buffer(info_buffer);
		setInput_buffers(input_buffers);
		setOutput_buffers(output_buffers);
		setStates(states);
		setCopy_buffers(copy_buffers);
		setSegment_buffers(segment_buffers);
		setOutput_audio(output_audio);
		set();
	}
	public noise_suppress_data() {
	}
	
	public void alloc_channel(Object sample_rate, Object channel, Object frames) {
		Object generatedStates = this.getStates();
		generatedStates[channel] = /*Error: Function owner not recognized*/speex_preprocess_state_init((int)frames, sample_rate);
		Object generatedInput_buffers = this.getInput_buffers();
		generatedInput_buffers[channel].circlebuf_reserve(frames * /*Error: Unsupported expression*/);
		Object generatedOutput_buffers = this.getOutput_buffers();
		generatedOutput_buffers[channel].circlebuf_reserve(frames * /*Error: Unsupported expression*/);
	}
	public void reset_data() {
		Object generatedChannels = this.getChannels();
		Object generatedInput_buffers = this.getInput_buffers();
		Object generatedOutput_buffers = this.getOutput_buffers();
		for ( i = 0;
		 i < generatedChannels; i++) {
			generatedInput_buffers[i].clear_circlebuf();
			generatedOutput_buffers[i].clear_circlebuf();
		}
		circlebuf generatedInfo_buffer = this.getInfo_buffer();
		generatedInfo_buffer.clear_circlebuf();
	}
	public obs_source getContext() {
		return context;
	}
	public void setContext(obs_source newContext) {
		context = newContext;
	}
	public int getSuppress_level() {
		return suppress_level;
	}
	public void setSuppress_level(int newSuppress_level) {
		suppress_level = newSuppress_level;
	}
	public Object getLast_timestamp() {
		return last_timestamp;
	}
	public void setLast_timestamp(Object newLast_timestamp) {
		last_timestamp = newLast_timestamp;
	}
	public Object getFrames() {
		return frames;
	}
	public void setFrames(Object newFrames) {
		frames = newFrames;
	}
	public Object getChannels() {
		return channels;
	}
	public void setChannels(Object newChannels) {
		channels = newChannels;
	}
	public circlebuf getInfo_buffer() {
		return info_buffer;
	}
	public void setInfo_buffer(circlebuf newInfo_buffer) {
		info_buffer = newInfo_buffer;
	}
	public Object getInput_buffers() {
		return input_buffers;
	}
	public void setInput_buffers(Object newInput_buffers) {
		input_buffers = newInput_buffers;
	}
	public Object getOutput_buffers() {
		return output_buffers;
	}
	public void setOutput_buffers(Object newOutput_buffers) {
		output_buffers = newOutput_buffers;
	}
	public Object getStates() {
		return states;
	}
	public void setStates(Object newStates) {
		states = newStates;
	}
	public Object getCopy_buffers() {
		return copy_buffers;
	}
	public void setCopy_buffers(Object newCopy_buffers) {
		copy_buffers = newCopy_buffers;
	}
	public Object getSegment_buffers() {
		return segment_buffers;
	}
	public void setSegment_buffers(Object newSegment_buffers) {
		segment_buffers = newSegment_buffers;
	}
	public obs_audio_data getOutput_audio() {
		return output_audio;
	}
	public void setOutput_audio(obs_audio_data newOutput_audio) {
		output_audio = newOutput_audio;
	}
	public Object get() {
		return ;
	}
	public void set(Object new) {
		 = new;
	}
}

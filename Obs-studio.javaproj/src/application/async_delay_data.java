package application;

public class async_delay_data {
	private obs_source context;
	private circlebuf video_frames;
	private circlebuf audio_frames;
	private obs_audio_data audio_output;
	private Object last_video_ts;
	private Object last_audio_ts;
	private Object interval;
	private Object samplerate;
	private Object video_delay_reached;
	private Object audio_delay_reached;
	private Object reset_video;
	private Object reset_audio;
	
	public async_delay_data(obs_source context, circlebuf video_frames, circlebuf audio_frames, obs_audio_data audio_output, Object last_video_ts, Object last_audio_ts, Object interval, Object samplerate, Object video_delay_reached, Object audio_delay_reached, Object reset_video, Object reset_audio) {
		setContext(context);
		setVideo_frames(video_frames);
		setAudio_frames(audio_frames);
		setAudio_output(audio_output);
		setLast_video_ts(last_video_ts);
		setLast_audio_ts(last_audio_ts);
		setInterval(interval);
		setSamplerate(samplerate);
		setVideo_delay_reached(video_delay_reached);
		setAudio_delay_reached(audio_delay_reached);
		setReset_video(reset_video);
		setReset_audio(reset_audio);
	}
	public async_delay_data() {
	}
	
	public void free_audio_data() {
		circlebuf generatedAudio_frames = this.getAudio_frames();
		Object generatedCirclebuf = generatedAudio_frames.getCirclebuf();
		while (generatedCirclebuf) {
			obs_audio_data audio = new obs_audio_data();
			generatedAudio_frames.circlebuf_pop_front(audio, );
			audio.free_audio_packet();
		}
	}
	public obs_source getContext() {
		return context;
	}
	public void setContext(obs_source newContext) {
		context = newContext;
	}
	public circlebuf getVideo_frames() {
		return video_frames;
	}
	public void setVideo_frames(circlebuf newVideo_frames) {
		video_frames = newVideo_frames;
	}
	public circlebuf getAudio_frames() {
		return audio_frames;
	}
	public void setAudio_frames(circlebuf newAudio_frames) {
		audio_frames = newAudio_frames;
	}
	public obs_audio_data getAudio_output() {
		return audio_output;
	}
	public void setAudio_output(obs_audio_data newAudio_output) {
		audio_output = newAudio_output;
	}
	public Object getLast_video_ts() {
		return last_video_ts;
	}
	public void setLast_video_ts(Object newLast_video_ts) {
		last_video_ts = newLast_video_ts;
	}
	public Object getLast_audio_ts() {
		return last_audio_ts;
	}
	public void setLast_audio_ts(Object newLast_audio_ts) {
		last_audio_ts = newLast_audio_ts;
	}
	public Object getInterval() {
		return interval;
	}
	public void setInterval(Object newInterval) {
		interval = newInterval;
	}
	public Object getSamplerate() {
		return samplerate;
	}
	public void setSamplerate(Object newSamplerate) {
		samplerate = newSamplerate;
	}
	public Object getVideo_delay_reached() {
		return video_delay_reached;
	}
	public void setVideo_delay_reached(Object newVideo_delay_reached) {
		video_delay_reached = newVideo_delay_reached;
	}
	public Object getAudio_delay_reached() {
		return audio_delay_reached;
	}
	public void setAudio_delay_reached(Object newAudio_delay_reached) {
		audio_delay_reached = newAudio_delay_reached;
	}
	public Object getReset_video() {
		return reset_video;
	}
	public void setReset_video(Object newReset_video) {
		reset_video = newReset_video;
	}
	public Object getReset_audio() {
		return reset_audio;
	}
	public void setReset_audio(Object newReset_audio) {
		reset_audio = newReset_audio;
	}
}

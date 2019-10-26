package application;

public class transition_state {
	private Object s;
	private Object transitioning_video;
	private Object transitioning_audio;
	
	public transition_state(Object s, Object transitioning_video, Object transitioning_audio) {
		setS(s);
		setTransitioning_video(transitioning_video);
		setTransitioning_audio(transitioning_audio);
	}
	public transition_state() {
	}
	
	public Object getS() {
		return s;
	}
	public void setS(Object newS) {
		s = newS;
	}
	public Object getTransitioning_video() {
		return transitioning_video;
	}
	public void setTransitioning_video(Object newTransitioning_video) {
		transitioning_video = newTransitioning_video;
	}
	public Object getTransitioning_audio() {
		return transitioning_audio;
	}
	public void setTransitioning_audio(Object newTransitioning_audio) {
		transitioning_audio = newTransitioning_audio;
	}
}

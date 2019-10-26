package application;

public class sync_pair_aud {
	private Object initialized_thread;
	private Object thread;
	private Object event;
	private obs_source source;
	
	public sync_pair_aud(Object initialized_thread, Object thread, Object event, obs_source source) {
		setInitialized_thread(initialized_thread);
		setThread(thread);
		setEvent(event);
		setSource(source);
	}
	public sync_pair_aud() {
	}
	
	public Object getInitialized_thread() {
		return initialized_thread;
	}
	public void setInitialized_thread(Object newInitialized_thread) {
		initialized_thread = newInitialized_thread;
	}
	public Object getThread() {
		return thread;
	}
	public void setThread(Object newThread) {
		thread = newThread;
	}
	public Object getEvent() {
		return event;
	}
	public void setEvent(Object newEvent) {
		event = newEvent;
	}
	public obs_source getSource() {
		return source;
	}
	public void setSource(obs_source newSource) {
		source = newSource;
	}
}

package application;

public class random_tex {
	private obs_source source;
	private Object stop_signal;
	private Object thread;
	private Object initialized;
	
	public random_tex(obs_source source, Object stop_signal, Object thread, Object initialized) {
		setSource(source);
		setStop_signal(stop_signal);
		setThread(thread);
		setInitialized(initialized);
	}
	public random_tex() {
	}
	
	public obs_source getSource() {
		return source;
	}
	public void setSource(obs_source newSource) {
		source = newSource;
	}
	public Object getStop_signal() {
		return stop_signal;
	}
	public void setStop_signal(Object newStop_signal) {
		stop_signal = newStop_signal;
	}
	public Object getThread() {
		return thread;
	}
	public void setThread(Object newThread) {
		thread = newThread;
	}
	public Object getInitialized() {
		return initialized;
	}
	public void setInitialized(Object newInitialized) {
		initialized = newInitialized;
	}
}

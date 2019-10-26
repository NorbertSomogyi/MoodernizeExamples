package application;

public class buffering_async_sync_test {
	private obs_source source;
	private Object stop_signal;
	private Object thread;
	private Object initialized;
	private Object buffer_audio;
	
	public buffering_async_sync_test(obs_source source, Object stop_signal, Object thread, Object initialized, Object buffer_audio) {
		setSource(source);
		setStop_signal(stop_signal);
		setThread(thread);
		setInitialized(initialized);
		setBuffer_audio(buffer_audio);
	}
	public buffering_async_sync_test() {
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
	public Object getBuffer_audio() {
		return buffer_audio;
	}
	public void setBuffer_audio(Object newBuffer_audio) {
		buffer_audio = newBuffer_audio;
	}
}

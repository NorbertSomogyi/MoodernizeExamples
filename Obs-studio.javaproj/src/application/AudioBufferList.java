package application;

public class AudioBufferList {
	private Object mNumberBuffers;
	private Object mBuffers;
	
	public AudioBufferList(Object mNumberBuffers, Object mBuffers) {
		setMNumberBuffers(mNumberBuffers);
		setMBuffers(mBuffers);
	}
	public AudioBufferList() {
	}
	
	public Object getMNumberBuffers() {
		return mNumberBuffers;
	}
	public void setMNumberBuffers(Object newMNumberBuffers) {
		mNumberBuffers = newMNumberBuffers;
	}
	public Object getMBuffers() {
		return mBuffers;
	}
	public void setMBuffers(Object newMBuffers) {
		mBuffers = newMBuffers;
	}
}

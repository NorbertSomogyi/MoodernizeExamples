package application;

public class AudioBuffer {
	private Object mNumberChannels;
	private Object mDataByteSize;
	private Object mData;
	
	public AudioBuffer(Object mNumberChannels, Object mDataByteSize, Object mData) {
		setMNumberChannels(mNumberChannels);
		setMDataByteSize(mDataByteSize);
		setMData(mData);
	}
	public AudioBuffer() {
	}
	
	public Object getMNumberChannels() {
		return mNumberChannels;
	}
	public void setMNumberChannels(Object newMNumberChannels) {
		mNumberChannels = newMNumberChannels;
	}
	public Object getMDataByteSize() {
		return mDataByteSize;
	}
	public void setMDataByteSize(Object newMDataByteSize) {
		mDataByteSize = newMDataByteSize;
	}
	public Object getMData() {
		return mData;
	}
	public void setMData(Object newMData) {
		mData = newMData;
	}
}

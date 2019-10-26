package application;

public class AudioStreamBasicDescription {
	private Object mSampleRate;
	private Object mFormatID;
	private Object mFormatFlags;
	private Object mBytesPerPacket;
	private Object mFramesPerPacket;
	private Object mBytesPerFrame;
	private Object mChannelsPerFrame;
	private Object mBitsPerChannel;
	private Object mReserved;
	
	public AudioStreamBasicDescription(Object mSampleRate, Object mFormatID, Object mFormatFlags, Object mBytesPerPacket, Object mFramesPerPacket, Object mBytesPerFrame, Object mChannelsPerFrame, Object mBitsPerChannel, Object mReserved) {
		setMSampleRate(mSampleRate);
		setMFormatID(mFormatID);
		setMFormatFlags(mFormatFlags);
		setMBytesPerPacket(mBytesPerPacket);
		setMFramesPerPacket(mFramesPerPacket);
		setMBytesPerFrame(mBytesPerFrame);
		setMChannelsPerFrame(mChannelsPerFrame);
		setMBitsPerChannel(mBitsPerChannel);
		setMReserved(mReserved);
	}
	public AudioStreamBasicDescription() {
	}
	
	public Object getMSampleRate() {
		return mSampleRate;
	}
	public void setMSampleRate(Object newMSampleRate) {
		mSampleRate = newMSampleRate;
	}
	public Object getMFormatID() {
		return mFormatID;
	}
	public void setMFormatID(Object newMFormatID) {
		mFormatID = newMFormatID;
	}
	public Object getMFormatFlags() {
		return mFormatFlags;
	}
	public void setMFormatFlags(Object newMFormatFlags) {
		mFormatFlags = newMFormatFlags;
	}
	public Object getMBytesPerPacket() {
		return mBytesPerPacket;
	}
	public void setMBytesPerPacket(Object newMBytesPerPacket) {
		mBytesPerPacket = newMBytesPerPacket;
	}
	public Object getMFramesPerPacket() {
		return mFramesPerPacket;
	}
	public void setMFramesPerPacket(Object newMFramesPerPacket) {
		mFramesPerPacket = newMFramesPerPacket;
	}
	public Object getMBytesPerFrame() {
		return mBytesPerFrame;
	}
	public void setMBytesPerFrame(Object newMBytesPerFrame) {
		mBytesPerFrame = newMBytesPerFrame;
	}
	public Object getMChannelsPerFrame() {
		return mChannelsPerFrame;
	}
	public void setMChannelsPerFrame(Object newMChannelsPerFrame) {
		mChannelsPerFrame = newMChannelsPerFrame;
	}
	public Object getMBitsPerChannel() {
		return mBitsPerChannel;
	}
	public void setMBitsPerChannel(Object newMBitsPerChannel) {
		mBitsPerChannel = newMBitsPerChannel;
	}
	public Object getMReserved() {
		return mReserved;
	}
	public void setMReserved(Object newMReserved) {
		mReserved = newMReserved;
	}
}

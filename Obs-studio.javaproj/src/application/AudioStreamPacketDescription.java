package application;

public class AudioStreamPacketDescription {
	private Object mStartOffset;
	private Object mVariableFramesInPacket;
	private Object mDataByteSize;
	
	public AudioStreamPacketDescription(Object mStartOffset, Object mVariableFramesInPacket, Object mDataByteSize) {
		setMStartOffset(mStartOffset);
		setMVariableFramesInPacket(mVariableFramesInPacket);
		setMDataByteSize(mDataByteSize);
	}
	public AudioStreamPacketDescription() {
	}
	
	public Object getMStartOffset() {
		return mStartOffset;
	}
	public void setMStartOffset(Object newMStartOffset) {
		mStartOffset = newMStartOffset;
	}
	public Object getMVariableFramesInPacket() {
		return mVariableFramesInPacket;
	}
	public void setMVariableFramesInPacket(Object newMVariableFramesInPacket) {
		mVariableFramesInPacket = newMVariableFramesInPacket;
	}
	public Object getMDataByteSize() {
		return mDataByteSize;
	}
	public void setMDataByteSize(Object newMDataByteSize) {
		mDataByteSize = newMDataByteSize;
	}
}
//kAudioCodecPropertyHasVariablePacketByteSizes          = 'vpk?',
// AudioStreamBasicDescription structure properties

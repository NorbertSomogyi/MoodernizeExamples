package application;

public class mfxCoreParam {
	private Object reserved;
	private Object Impl;
	private  Version;
	private Object NumWorkingThread;
	
	public mfxCoreParam(Object reserved, Object Impl,  Version, Object NumWorkingThread) {
		setReserved(reserved);
		setImpl(Impl);
		setVersion(Version);
		setNumWorkingThread(NumWorkingThread);
	}
	public mfxCoreParam() {
	}
	
	public Object getReserved() {
		return reserved;
	}
	public void setReserved(Object newReserved) {
		reserved = newReserved;
	}
	public Object getImpl() {
		return Impl;
	}
	public void setImpl(Object newImpl) {
		Impl = newImpl;
	}
	public  getVersion() {
		return Version;
	}
	public void setVersion( newVersion) {
		Version = newVersion;
	}
	public Object getNumWorkingThread() {
		return NumWorkingThread;
	}
	public void setNumWorkingThread(Object newNumWorkingThread) {
		NumWorkingThread = newNumWorkingThread;
	}
}

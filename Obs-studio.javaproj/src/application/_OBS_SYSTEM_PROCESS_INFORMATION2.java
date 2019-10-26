package application;

public class _OBS_SYSTEM_PROCESS_INFORMATION2 {
	private Object NextEntryOffset;
	private Object ThreadCount;
	private Object Reserved1;
	private Object Reserved2;
	private Object UniqueProcessId;
	private Object Reserved3;
	private Object HandleCount;
	private Object Reserved4;
	private Object Reserved5;
	private Object PeakPagefileUsage;
	private Object PrivatePageCount;
	private Object Reserved6;
	
	public _OBS_SYSTEM_PROCESS_INFORMATION2(Object NextEntryOffset, Object ThreadCount, Object Reserved1, Object Reserved2, Object UniqueProcessId, Object Reserved3, Object HandleCount, Object Reserved4, Object Reserved5, Object PeakPagefileUsage, Object PrivatePageCount, Object Reserved6) {
		setNextEntryOffset(NextEntryOffset);
		setThreadCount(ThreadCount);
		setReserved1(Reserved1);
		setReserved2(Reserved2);
		setUniqueProcessId(UniqueProcessId);
		setReserved3(Reserved3);
		setHandleCount(HandleCount);
		setReserved4(Reserved4);
		setReserved5(Reserved5);
		setPeakPagefileUsage(PeakPagefileUsage);
		setPrivatePageCount(PrivatePageCount);
		setReserved6(Reserved6);
	}
	public _OBS_SYSTEM_PROCESS_INFORMATION2() {
	}
	
	public Object getNextEntryOffset() {
		return NextEntryOffset;
	}
	public void setNextEntryOffset(Object newNextEntryOffset) {
		NextEntryOffset = newNextEntryOffset;
	}
	public Object getThreadCount() {
		return ThreadCount;
	}
	public void setThreadCount(Object newThreadCount) {
		ThreadCount = newThreadCount;
	}
	public Object getReserved1() {
		return Reserved1;
	}
	public void setReserved1(Object newReserved1) {
		Reserved1 = newReserved1;
	}
	public Object getReserved2() {
		return Reserved2;
	}
	public void setReserved2(Object newReserved2) {
		Reserved2 = newReserved2;
	}
	public Object getUniqueProcessId() {
		return UniqueProcessId;
	}
	public void setUniqueProcessId(Object newUniqueProcessId) {
		UniqueProcessId = newUniqueProcessId;
	}
	public Object getReserved3() {
		return Reserved3;
	}
	public void setReserved3(Object newReserved3) {
		Reserved3 = newReserved3;
	}
	public Object getHandleCount() {
		return HandleCount;
	}
	public void setHandleCount(Object newHandleCount) {
		HandleCount = newHandleCount;
	}
	public Object getReserved4() {
		return Reserved4;
	}
	public void setReserved4(Object newReserved4) {
		Reserved4 = newReserved4;
	}
	public Object getReserved5() {
		return Reserved5;
	}
	public void setReserved5(Object newReserved5) {
		Reserved5 = newReserved5;
	}
	public Object getPeakPagefileUsage() {
		return PeakPagefileUsage;
	}
	public void setPeakPagefileUsage(Object newPeakPagefileUsage) {
		PeakPagefileUsage = newPeakPagefileUsage;
	}
	public Object getPrivatePageCount() {
		return PrivatePageCount;
	}
	public void setPrivatePageCount(Object newPrivatePageCount) {
		PrivatePageCount = newPrivatePageCount;
	}
	public Object getReserved6() {
		return Reserved6;
	}
	public void setReserved6(Object newReserved6) {
		Reserved6 = newReserved6;
	}
}

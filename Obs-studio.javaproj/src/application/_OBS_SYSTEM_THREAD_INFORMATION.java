package application;

public class _OBS_SYSTEM_THREAD_INFORMATION {
	private Object KernelTime;
	private Object UserTime;
	private Object CreateTime;
	private Object WaitTime;
	private Object Address;
	private Object UniqueProcessId;
	private Object UniqueThreadId;
	private Object Priority;
	private Object BasePriority;
	private Object ContextSwitches;
	private Object ThreadState;
	private Object WaitReason;
	private Object Reserved1;
	
	public _OBS_SYSTEM_THREAD_INFORMATION(Object KernelTime, Object UserTime, Object CreateTime, Object WaitTime, Object Address, Object UniqueProcessId, Object UniqueThreadId, Object Priority, Object BasePriority, Object ContextSwitches, Object ThreadState, Object WaitReason, Object Reserved1) {
		setKernelTime(KernelTime);
		setUserTime(UserTime);
		setCreateTime(CreateTime);
		setWaitTime(WaitTime);
		setAddress(Address);
		setUniqueProcessId(UniqueProcessId);
		setUniqueThreadId(UniqueThreadId);
		setPriority(Priority);
		setBasePriority(BasePriority);
		setContextSwitches(ContextSwitches);
		setThreadState(ThreadState);
		setWaitReason(WaitReason);
		setReserved1(Reserved1);
	}
	public _OBS_SYSTEM_THREAD_INFORMATION() {
	}
	
	public Object getKernelTime() {
		return KernelTime;
	}
	public void setKernelTime(Object newKernelTime) {
		KernelTime = newKernelTime;
	}
	public Object getUserTime() {
		return UserTime;
	}
	public void setUserTime(Object newUserTime) {
		UserTime = newUserTime;
	}
	public Object getCreateTime() {
		return CreateTime;
	}
	public void setCreateTime(Object newCreateTime) {
		CreateTime = newCreateTime;
	}
	public Object getWaitTime() {
		return WaitTime;
	}
	public void setWaitTime(Object newWaitTime) {
		WaitTime = newWaitTime;
	}
	public Object getAddress() {
		return Address;
	}
	public void setAddress(Object newAddress) {
		Address = newAddress;
	}
	public Object getUniqueProcessId() {
		return UniqueProcessId;
	}
	public void setUniqueProcessId(Object newUniqueProcessId) {
		UniqueProcessId = newUniqueProcessId;
	}
	public Object getUniqueThreadId() {
		return UniqueThreadId;
	}
	public void setUniqueThreadId(Object newUniqueThreadId) {
		UniqueThreadId = newUniqueThreadId;
	}
	public Object getPriority() {
		return Priority;
	}
	public void setPriority(Object newPriority) {
		Priority = newPriority;
	}
	public Object getBasePriority() {
		return BasePriority;
	}
	public void setBasePriority(Object newBasePriority) {
		BasePriority = newBasePriority;
	}
	public Object getContextSwitches() {
		return ContextSwitches;
	}
	public void setContextSwitches(Object newContextSwitches) {
		ContextSwitches = newContextSwitches;
	}
	public Object getThreadState() {
		return ThreadState;
	}
	public void setThreadState(Object newThreadState) {
		ThreadState = newThreadState;
	}
	public Object getWaitReason() {
		return WaitReason;
	}
	public void setWaitReason(Object newWaitReason) {
		WaitReason = newWaitReason;
	}
	public Object getReserved1() {
		return Reserved1;
	}
	public void setReserved1(Object newReserved1) {
		Reserved1 = newReserved1;
	}
}

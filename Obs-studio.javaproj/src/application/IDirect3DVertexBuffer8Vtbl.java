package application;

public class IDirect3DVertexBuffer8Vtbl {
	private Object QueryInterface;
	private Object AddRef;
	private Object Release;
	private Object GetDevice;
	private Object SetPrivateData;
	private Object GetPrivateData;
	private Object FreePrivateData;
	private Object SetPriority;
	private Object GetPriority;
	private Object PreLoad;
	private Object GetType;
	private Object Lock;
	private Object Unlock;
	private Object GetDesc;
	
	public IDirect3DVertexBuffer8Vtbl(Object QueryInterface, Object AddRef, Object Release, Object GetDevice, Object SetPrivateData, Object GetPrivateData, Object FreePrivateData, Object SetPriority, Object GetPriority, Object PreLoad, Object GetType, Object Lock, Object Unlock, Object GetDesc) {
		setQueryInterface(QueryInterface);
		setAddRef(AddRef);
		setRelease(Release);
		setGetDevice(GetDevice);
		setSetPrivateData(SetPrivateData);
		setGetPrivateData(GetPrivateData);
		setFreePrivateData(FreePrivateData);
		setSetPriority(SetPriority);
		setGetPriority(GetPriority);
		setPreLoad(PreLoad);
		setGetType(GetType);
		setLock(Lock);
		setUnlock(Unlock);
		setGetDesc(GetDesc);
	}
	public IDirect3DVertexBuffer8Vtbl() {
	}
	
	public Object getQueryInterface() {
		return QueryInterface;
	}
	public void setQueryInterface(Object newQueryInterface) {
		QueryInterface = newQueryInterface;
	}
	public Object getAddRef() {
		return AddRef;
	}
	public void setAddRef(Object newAddRef) {
		AddRef = newAddRef;
	}
	public Object getRelease() {
		return Release;
	}
	public void setRelease(Object newRelease) {
		Release = newRelease;
	}
	public Object getGetDevice() {
		return GetDevice;
	}
	public void setGetDevice(Object newGetDevice) {
		GetDevice = newGetDevice;
	}
	public Object getSetPrivateData() {
		return SetPrivateData;
	}
	public void setSetPrivateData(Object newSetPrivateData) {
		SetPrivateData = newSetPrivateData;
	}
	public Object getGetPrivateData() {
		return GetPrivateData;
	}
	public void setGetPrivateData(Object newGetPrivateData) {
		GetPrivateData = newGetPrivateData;
	}
	public Object getFreePrivateData() {
		return FreePrivateData;
	}
	public void setFreePrivateData(Object newFreePrivateData) {
		FreePrivateData = newFreePrivateData;
	}
	public Object getSetPriority() {
		return SetPriority;
	}
	public void setSetPriority(Object newSetPriority) {
		SetPriority = newSetPriority;
	}
	public Object getGetPriority() {
		return GetPriority;
	}
	public void setGetPriority(Object newGetPriority) {
		GetPriority = newGetPriority;
	}
	public Object getPreLoad() {
		return PreLoad;
	}
	public void setPreLoad(Object newPreLoad) {
		PreLoad = newPreLoad;
	}
	public Object getGetType() {
		return GetType;
	}
	public void setGetType(Object newGetType) {
		GetType = newGetType;
	}
	public Object getLock() {
		return Lock;
	}
	public void setLock(Object newLock) {
		Lock = newLock;
	}
	public Object getUnlock() {
		return Unlock;
	}
	public void setUnlock(Object newUnlock) {
		Unlock = newUnlock;
	}
	public Object getGetDesc() {
		return GetDesc;
	}
	public void setGetDesc(Object newGetDesc) {
		GetDesc = newGetDesc;
	}
}

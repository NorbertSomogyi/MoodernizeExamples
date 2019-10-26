package application;

public class IDirect3DVolume8Vtbl {
	private Object QueryInterface;
	private Object AddRef;
	private Object Release;
	private Object GetDevice;
	private Object SetPrivateData;
	private Object GetPrivateData;
	private Object FreePrivateData;
	private Object GetContainer;
	private Object GetDesc;
	private Object LockBox;
	private Object UnlockBox;
	
	public IDirect3DVolume8Vtbl(Object QueryInterface, Object AddRef, Object Release, Object GetDevice, Object SetPrivateData, Object GetPrivateData, Object FreePrivateData, Object GetContainer, Object GetDesc, Object LockBox, Object UnlockBox) {
		setQueryInterface(QueryInterface);
		setAddRef(AddRef);
		setRelease(Release);
		setGetDevice(GetDevice);
		setSetPrivateData(SetPrivateData);
		setGetPrivateData(GetPrivateData);
		setFreePrivateData(FreePrivateData);
		setGetContainer(GetContainer);
		setGetDesc(GetDesc);
		setLockBox(LockBox);
		setUnlockBox(UnlockBox);
	}
	public IDirect3DVolume8Vtbl() {
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
	public Object getGetContainer() {
		return GetContainer;
	}
	public void setGetContainer(Object newGetContainer) {
		GetContainer = newGetContainer;
	}
	public Object getGetDesc() {
		return GetDesc;
	}
	public void setGetDesc(Object newGetDesc) {
		GetDesc = newGetDesc;
	}
	public Object getLockBox() {
		return LockBox;
	}
	public void setLockBox(Object newLockBox) {
		LockBox = newLockBox;
	}
	public Object getUnlockBox() {
		return UnlockBox;
	}
	public void setUnlockBox(Object newUnlockBox) {
		UnlockBox = newUnlockBox;
	}
}

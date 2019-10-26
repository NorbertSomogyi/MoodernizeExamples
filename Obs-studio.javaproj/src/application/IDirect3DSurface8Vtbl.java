package application;

public class IDirect3DSurface8Vtbl {
	private Object QueryInterface;
	private Object AddRef;
	private Object Release;
	private Object GetDevice;
	private Object SetPrivateData;
	private Object GetPrivateData;
	private Object FreePrivateData;
	private Object GetContainer;
	private Object GetDesc;
	private Object LockRect;
	private Object UnlockRect;
	
	public IDirect3DSurface8Vtbl(Object QueryInterface, Object AddRef, Object Release, Object GetDevice, Object SetPrivateData, Object GetPrivateData, Object FreePrivateData, Object GetContainer, Object GetDesc, Object LockRect, Object UnlockRect) {
		setQueryInterface(QueryInterface);
		setAddRef(AddRef);
		setRelease(Release);
		setGetDevice(GetDevice);
		setSetPrivateData(SetPrivateData);
		setGetPrivateData(GetPrivateData);
		setFreePrivateData(FreePrivateData);
		setGetContainer(GetContainer);
		setGetDesc(GetDesc);
		setLockRect(LockRect);
		setUnlockRect(UnlockRect);
	}
	public IDirect3DSurface8Vtbl() {
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
	public Object getLockRect() {
		return LockRect;
	}
	public void setLockRect(Object newLockRect) {
		LockRect = newLockRect;
	}
	public Object getUnlockRect() {
		return UnlockRect;
	}
	public void setUnlockRect(Object newUnlockRect) {
		UnlockRect = newUnlockRect;
	}
}

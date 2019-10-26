package application;

public class IDirect3DSwapChain8Vtbl {
	private Object QueryInterface;
	private Object AddRef;
	private Object Release;
	private Object Present;
	private Object GetBackBuffer;
	
	public IDirect3DSwapChain8Vtbl(Object QueryInterface, Object AddRef, Object Release, Object Present, Object GetBackBuffer) {
		setQueryInterface(QueryInterface);
		setAddRef(AddRef);
		setRelease(Release);
		setPresent(Present);
		setGetBackBuffer(GetBackBuffer);
	}
	public IDirect3DSwapChain8Vtbl() {
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
	public Object getPresent() {
		return Present;
	}
	public void setPresent(Object newPresent) {
		Present = newPresent;
	}
	public Object getGetBackBuffer() {
		return GetBackBuffer;
	}
	public void setGetBackBuffer(Object newGetBackBuffer) {
		GetBackBuffer = newGetBackBuffer;
	}
}

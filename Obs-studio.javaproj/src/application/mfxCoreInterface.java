package application;

public class mfxCoreInterface {
	private Object pthis;
	private Object reserved1;
	private  FrameAllocator;
	private  reserved3;
	private Object GetCoreParam;
	private Object GetHandle;
	private Object IncreaseReference;
	private Object DecreaseReference;
	private Object CopyFrame;
	private Object CopyBuffer;
	private Object MapOpaqueSurface;
	private Object UnmapOpaqueSurface;
	private Object GetRealSurface;
	private Object GetOpaqueSurface;
	private Object CreateAccelerationDevice;
	private Object GetFrameHandle;
	private Object QueryPlatform;
	private Object reserved4;
	
	public mfxCoreInterface(Object pthis, Object reserved1,  FrameAllocator,  reserved3, Object GetCoreParam, Object GetHandle, Object IncreaseReference, Object DecreaseReference, Object CopyFrame, Object CopyBuffer, Object MapOpaqueSurface, Object UnmapOpaqueSurface, Object GetRealSurface, Object GetOpaqueSurface, Object CreateAccelerationDevice, Object GetFrameHandle, Object QueryPlatform, Object reserved4) {
		setPthis(pthis);
		setReserved1(reserved1);
		setFrameAllocator(FrameAllocator);
		setReserved3(reserved3);
		setGetCoreParam(GetCoreParam);
		setGetHandle(GetHandle);
		setIncreaseReference(IncreaseReference);
		setDecreaseReference(DecreaseReference);
		setCopyFrame(CopyFrame);
		setCopyBuffer(CopyBuffer);
		setMapOpaqueSurface(MapOpaqueSurface);
		setUnmapOpaqueSurface(UnmapOpaqueSurface);
		setGetRealSurface(GetRealSurface);
		setGetOpaqueSurface(GetOpaqueSurface);
		setCreateAccelerationDevice(CreateAccelerationDevice);
		setGetFrameHandle(GetFrameHandle);
		setQueryPlatform(QueryPlatform);
		setReserved4(reserved4);
	}
	public mfxCoreInterface() {
	}
	
	//for generic plugin application should call it
	//MediaSDK mfxPlugin API mapping
	public  PluginInit() {
	}
	//release CoreInterface, and destroy plugin state, not destroy plugin instance
	public Object getPthis() {
		return pthis;
	}
	public void setPthis(Object newPthis) {
		pthis = newPthis;
	}
	public Object getReserved1() {
		return reserved1;
	}
	public void setReserved1(Object newReserved1) {
		reserved1 = newReserved1;
	}
	public  getFrameAllocator() {
		return FrameAllocator;
	}
	public void setFrameAllocator( newFrameAllocator) {
		FrameAllocator = newFrameAllocator;
	}
	public  getReserved3() {
		return reserved3;
	}
	public void setReserved3( newReserved3) {
		reserved3 = newReserved3;
	}
	public Object getGetCoreParam() {
		return GetCoreParam;
	}
	public void setGetCoreParam(Object newGetCoreParam) {
		GetCoreParam = newGetCoreParam;
	}
	public Object getGetHandle() {
		return GetHandle;
	}
	public void setGetHandle(Object newGetHandle) {
		GetHandle = newGetHandle;
	}
	public Object getIncreaseReference() {
		return IncreaseReference;
	}
	public void setIncreaseReference(Object newIncreaseReference) {
		IncreaseReference = newIncreaseReference;
	}
	public Object getDecreaseReference() {
		return DecreaseReference;
	}
	public void setDecreaseReference(Object newDecreaseReference) {
		DecreaseReference = newDecreaseReference;
	}
	public Object getCopyFrame() {
		return CopyFrame;
	}
	public void setCopyFrame(Object newCopyFrame) {
		CopyFrame = newCopyFrame;
	}
	public Object getCopyBuffer() {
		return CopyBuffer;
	}
	public void setCopyBuffer(Object newCopyBuffer) {
		CopyBuffer = newCopyBuffer;
	}
	public Object getMapOpaqueSurface() {
		return MapOpaqueSurface;
	}
	public void setMapOpaqueSurface(Object newMapOpaqueSurface) {
		MapOpaqueSurface = newMapOpaqueSurface;
	}
	public Object getUnmapOpaqueSurface() {
		return UnmapOpaqueSurface;
	}
	public void setUnmapOpaqueSurface(Object newUnmapOpaqueSurface) {
		UnmapOpaqueSurface = newUnmapOpaqueSurface;
	}
	public Object getGetRealSurface() {
		return GetRealSurface;
	}
	public void setGetRealSurface(Object newGetRealSurface) {
		GetRealSurface = newGetRealSurface;
	}
	public Object getGetOpaqueSurface() {
		return GetOpaqueSurface;
	}
	public void setGetOpaqueSurface(Object newGetOpaqueSurface) {
		GetOpaqueSurface = newGetOpaqueSurface;
	}
	public Object getCreateAccelerationDevice() {
		return CreateAccelerationDevice;
	}
	public void setCreateAccelerationDevice(Object newCreateAccelerationDevice) {
		CreateAccelerationDevice = newCreateAccelerationDevice;
	}
	public Object getGetFrameHandle() {
		return GetFrameHandle;
	}
	public void setGetFrameHandle(Object newGetFrameHandle) {
		GetFrameHandle = newGetFrameHandle;
	}
	public Object getQueryPlatform() {
		return QueryPlatform;
	}
	public void setQueryPlatform(Object newQueryPlatform) {
		QueryPlatform = newQueryPlatform;
	}
	public Object getReserved4() {
		return reserved4;
	}
	public void setReserved4(Object newReserved4) {
		reserved4 = newReserved4;
	}
}

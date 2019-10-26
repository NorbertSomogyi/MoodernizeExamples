package application;

public class CUDA_MEMCPY2D_st {
	private Object srcXInBytes;
	private Object srcY;
	private CUmemorytype_enum srcMemoryType;
	private Object srcHost;
	private Object srcDevice;
	private Object srcArray;
	private Object srcPitch;
	private Object dstXInBytes;
	private Object dstY;
	private CUmemorytype_enum dstMemoryType;
	private Object dstHost;
	private Object dstDevice;
	private Object dstArray;
	private Object dstPitch;
	private Object WidthInBytes;
	private Object Height;
	
	public CUDA_MEMCPY2D_st(Object srcXInBytes, Object srcY, CUmemorytype_enum srcMemoryType, Object srcHost, Object srcDevice, Object srcArray, Object srcPitch, Object dstXInBytes, Object dstY, CUmemorytype_enum dstMemoryType, Object dstHost, Object dstDevice, Object dstArray, Object dstPitch, Object WidthInBytes, Object Height) {
		setSrcXInBytes(srcXInBytes);
		setSrcY(srcY);
		setSrcMemoryType(srcMemoryType);
		setSrcHost(srcHost);
		setSrcDevice(srcDevice);
		setSrcArray(srcArray);
		setSrcPitch(srcPitch);
		setDstXInBytes(dstXInBytes);
		setDstY(dstY);
		setDstMemoryType(dstMemoryType);
		setDstHost(dstHost);
		setDstDevice(dstDevice);
		setDstArray(dstArray);
		setDstPitch(dstPitch);
		setWidthInBytes(WidthInBytes);
		setHeight(Height);
	}
	public CUDA_MEMCPY2D_st() {
	}
	
	public Object getSrcXInBytes() {
		return srcXInBytes;
	}
	public void setSrcXInBytes(Object newSrcXInBytes) {
		srcXInBytes = newSrcXInBytes;
	}
	public Object getSrcY() {
		return srcY;
	}
	public void setSrcY(Object newSrcY) {
		srcY = newSrcY;
	}
	public CUmemorytype_enum getSrcMemoryType() {
		return srcMemoryType;
	}
	public void setSrcMemoryType(CUmemorytype_enum newSrcMemoryType) {
		srcMemoryType = newSrcMemoryType;
	}
	public Object getSrcHost() {
		return srcHost;
	}
	public void setSrcHost(Object newSrcHost) {
		srcHost = newSrcHost;
	}
	public Object getSrcDevice() {
		return srcDevice;
	}
	public void setSrcDevice(Object newSrcDevice) {
		srcDevice = newSrcDevice;
	}
	public Object getSrcArray() {
		return srcArray;
	}
	public void setSrcArray(Object newSrcArray) {
		srcArray = newSrcArray;
	}
	public Object getSrcPitch() {
		return srcPitch;
	}
	public void setSrcPitch(Object newSrcPitch) {
		srcPitch = newSrcPitch;
	}
	public Object getDstXInBytes() {
		return dstXInBytes;
	}
	public void setDstXInBytes(Object newDstXInBytes) {
		dstXInBytes = newDstXInBytes;
	}
	public Object getDstY() {
		return dstY;
	}
	public void setDstY(Object newDstY) {
		dstY = newDstY;
	}
	public CUmemorytype_enum getDstMemoryType() {
		return dstMemoryType;
	}
	public void setDstMemoryType(CUmemorytype_enum newDstMemoryType) {
		dstMemoryType = newDstMemoryType;
	}
	public Object getDstHost() {
		return dstHost;
	}
	public void setDstHost(Object newDstHost) {
		dstHost = newDstHost;
	}
	public Object getDstDevice() {
		return dstDevice;
	}
	public void setDstDevice(Object newDstDevice) {
		dstDevice = newDstDevice;
	}
	public Object getDstArray() {
		return dstArray;
	}
	public void setDstArray(Object newDstArray) {
		dstArray = newDstArray;
	}
	public Object getDstPitch() {
		return dstPitch;
	}
	public void setDstPitch(Object newDstPitch) {
		dstPitch = newDstPitch;
	}
	public Object getWidthInBytes() {
		return WidthInBytes;
	}
	public void setWidthInBytes(Object newWidthInBytes) {
		WidthInBytes = newWidthInBytes;
	}
	public Object getHeight() {
		return Height;
	}
	public void setHeight(Object newHeight) {
		Height = newHeight;
	}
}

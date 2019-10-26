package application;

/**
 * Creation parameters for input buffer.
 */
public class _NV_ENC_CREATE_INPUT_BUFFER {
	private Object version;
	private Object width;
	private Object height;
	private _NV_ENC_MEMORY_HEAP memoryHeap;
	private _NV_ENC_BUFFER_FORMAT bufferFmt;
	private Object reserved;
	private Object inputBuffer;
	private Object pSysMemBuffer;
	private Object reserved1;
	private Object reserved2;
	
	public _NV_ENC_CREATE_INPUT_BUFFER(Object version, Object width, Object height, _NV_ENC_MEMORY_HEAP memoryHeap, _NV_ENC_BUFFER_FORMAT bufferFmt, Object reserved, Object inputBuffer, Object pSysMemBuffer, Object reserved1, Object reserved2) {
		setVersion(version);
		setWidth(width);
		setHeight(height);
		setMemoryHeap(memoryHeap);
		setBufferFmt(bufferFmt);
		setReserved(reserved);
		setInputBuffer(inputBuffer);
		setPSysMemBuffer(pSysMemBuffer);
		setReserved1(reserved1);
		setReserved2(reserved2);
	}
	public _NV_ENC_CREATE_INPUT_BUFFER() {
	}
	
	public Object getVersion() {
		return version;
	}
	public void setVersion(Object newVersion) {
		version = newVersion;
	}
	public Object getWidth() {
		return width;
	}
	public void setWidth(Object newWidth) {
		width = newWidth;
	}
	public Object getHeight() {
		return height;
	}
	public void setHeight(Object newHeight) {
		height = newHeight;
	}
	public _NV_ENC_MEMORY_HEAP getMemoryHeap() {
		return memoryHeap;
	}
	public void setMemoryHeap(_NV_ENC_MEMORY_HEAP newMemoryHeap) {
		memoryHeap = newMemoryHeap;
	}
	public _NV_ENC_BUFFER_FORMAT getBufferFmt() {
		return bufferFmt;
	}
	public void setBufferFmt(_NV_ENC_BUFFER_FORMAT newBufferFmt) {
		bufferFmt = newBufferFmt;
	}
	public Object getReserved() {
		return reserved;
	}
	public void setReserved(Object newReserved) {
		reserved = newReserved;
	}
	public Object getInputBuffer() {
		return inputBuffer;
	}
	public void setInputBuffer(Object newInputBuffer) {
		inputBuffer = newInputBuffer;
	}
	public Object getPSysMemBuffer() {
		return pSysMemBuffer;
	}
	public void setPSysMemBuffer(Object newPSysMemBuffer) {
		pSysMemBuffer = newPSysMemBuffer;
	}
	public Object getReserved1() {
		return reserved1;
	}
	public void setReserved1(Object newReserved1) {
		reserved1 = newReserved1;
	}
	public Object getReserved2() {
		return reserved2;
	}
	public void setReserved2(Object newReserved2) {
		reserved2 = newReserved2;
	}
}

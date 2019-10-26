package application;

/**
 * Creation parameters for output bitstream buffer.
 */
public class _NV_ENC_CREATE_BITSTREAM_BUFFER {
	private Object version;
	private Object size;
	private _NV_ENC_MEMORY_HEAP memoryHeap;
	private Object reserved;
	private Object bitstreamBuffer;
	private Object bitstreamBufferPtr;
	private Object reserved1;
	private Object reserved2;
	
	public _NV_ENC_CREATE_BITSTREAM_BUFFER(Object version, Object size, _NV_ENC_MEMORY_HEAP memoryHeap, Object reserved, Object bitstreamBuffer, Object bitstreamBufferPtr, Object reserved1, Object reserved2) {
		setVersion(version);
		setSize(size);
		setMemoryHeap(memoryHeap);
		setReserved(reserved);
		setBitstreamBuffer(bitstreamBuffer);
		setBitstreamBufferPtr(bitstreamBufferPtr);
		setReserved1(reserved1);
		setReserved2(reserved2);
	}
	public _NV_ENC_CREATE_BITSTREAM_BUFFER() {
	}
	
	public Object getVersion() {
		return version;
	}
	public void setVersion(Object newVersion) {
		version = newVersion;
	}
	public Object getSize() {
		return size;
	}
	public void setSize(Object newSize) {
		size = newSize;
	}
	public _NV_ENC_MEMORY_HEAP getMemoryHeap() {
		return memoryHeap;
	}
	public void setMemoryHeap(_NV_ENC_MEMORY_HEAP newMemoryHeap) {
		memoryHeap = newMemoryHeap;
	}
	public Object getReserved() {
		return reserved;
	}
	public void setReserved(Object newReserved) {
		reserved = newReserved;
	}
	public Object getBitstreamBuffer() {
		return bitstreamBuffer;
	}
	public void setBitstreamBuffer(Object newBitstreamBuffer) {
		bitstreamBuffer = newBitstreamBuffer;
	}
	public Object getBitstreamBufferPtr() {
		return bitstreamBufferPtr;
	}
	public void setBitstreamBufferPtr(Object newBitstreamBufferPtr) {
		bitstreamBufferPtr = newBitstreamBufferPtr;
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

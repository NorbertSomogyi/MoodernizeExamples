package application;

// Heaps
public class _RTL_HEAP_ENTRY {
	private Object Size;
	private Object Flags;
	private Object AllocatorBackTraceIndex;
	private  u;
	
	public _RTL_HEAP_ENTRY(Object Size, Object Flags, Object AllocatorBackTraceIndex,  u) {
		setSize(Size);
		setFlags(Flags);
		setAllocatorBackTraceIndex(AllocatorBackTraceIndex);
		setU(u);
	}
	public _RTL_HEAP_ENTRY() {
	}
	
	public Object getSize() {
		return Size;
	}
	public void setSize(Object newSize) {
		Size = newSize;
	}
	public Object getFlags() {
		return Flags;
	}
	public void setFlags(Object newFlags) {
		Flags = newFlags;
	}
	public Object getAllocatorBackTraceIndex() {
		return AllocatorBackTraceIndex;
	}
	public void setAllocatorBackTraceIndex(Object newAllocatorBackTraceIndex) {
		AllocatorBackTraceIndex = newAllocatorBackTraceIndex;
	}
	public  getU() {
		return u;
	}
	public void setU( newU) {
		u = newU;
	}
}

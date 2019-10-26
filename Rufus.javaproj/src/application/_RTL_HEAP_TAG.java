package application;

public class _RTL_HEAP_TAG {
	private Object NumberOfAllocations;
	private Object NumberOfFrees;
	private Object BytesAllocated;
	private Object TagIndex;
	private Object CreatorBackTraceIndex;
	private Object TagName;
	
	public _RTL_HEAP_TAG(Object NumberOfAllocations, Object NumberOfFrees, Object BytesAllocated, Object TagIndex, Object CreatorBackTraceIndex, Object TagName) {
		setNumberOfAllocations(NumberOfAllocations);
		setNumberOfFrees(NumberOfFrees);
		setBytesAllocated(BytesAllocated);
		setTagIndex(TagIndex);
		setCreatorBackTraceIndex(CreatorBackTraceIndex);
		setTagName(TagName);
	}
	public _RTL_HEAP_TAG() {
	}
	
	public Object getNumberOfAllocations() {
		return NumberOfAllocations;
	}
	public void setNumberOfAllocations(Object newNumberOfAllocations) {
		NumberOfAllocations = newNumberOfAllocations;
	}
	public Object getNumberOfFrees() {
		return NumberOfFrees;
	}
	public void setNumberOfFrees(Object newNumberOfFrees) {
		NumberOfFrees = newNumberOfFrees;
	}
	public Object getBytesAllocated() {
		return BytesAllocated;
	}
	public void setBytesAllocated(Object newBytesAllocated) {
		BytesAllocated = newBytesAllocated;
	}
	public Object getTagIndex() {
		return TagIndex;
	}
	public void setTagIndex(Object newTagIndex) {
		TagIndex = newTagIndex;
	}
	public Object getCreatorBackTraceIndex() {
		return CreatorBackTraceIndex;
	}
	public void setCreatorBackTraceIndex(Object newCreatorBackTraceIndex) {
		CreatorBackTraceIndex = newCreatorBackTraceIndex;
	}
	public Object getTagName() {
		return TagName;
	}
	public void setTagName(Object newTagName) {
		TagName = newTagName;
	}
}

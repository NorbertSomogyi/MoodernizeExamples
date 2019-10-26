package application;

public class _RTL_HEAP_INFORMATION {
	private Object BaseAddress;
	private Object Flags;
	private Object EntryOverhead;
	private Object CreatorBackTraceIndex;
	private Object BytesAllocated;
	private Object BytesCommitted;
	private Object NumberOfTags;
	private Object NumberOfEntries;
	private Object NumberOfPseudoTags;
	private Object PseudoTagGranularity;
	private Object Reserved;
	private Object Tags;
	private Object Entries;
	
	public _RTL_HEAP_INFORMATION(Object BaseAddress, Object Flags, Object EntryOverhead, Object CreatorBackTraceIndex, Object BytesAllocated, Object BytesCommitted, Object NumberOfTags, Object NumberOfEntries, Object NumberOfPseudoTags, Object PseudoTagGranularity, Object Reserved, Object Tags, Object Entries) {
		setBaseAddress(BaseAddress);
		setFlags(Flags);
		setEntryOverhead(EntryOverhead);
		setCreatorBackTraceIndex(CreatorBackTraceIndex);
		setBytesAllocated(BytesAllocated);
		setBytesCommitted(BytesCommitted);
		setNumberOfTags(NumberOfTags);
		setNumberOfEntries(NumberOfEntries);
		setNumberOfPseudoTags(NumberOfPseudoTags);
		setPseudoTagGranularity(PseudoTagGranularity);
		setReserved(Reserved);
		setTags(Tags);
		setEntries(Entries);
	}
	public _RTL_HEAP_INFORMATION() {
	}
	
	public Object getBaseAddress() {
		return BaseAddress;
	}
	public void setBaseAddress(Object newBaseAddress) {
		BaseAddress = newBaseAddress;
	}
	public Object getFlags() {
		return Flags;
	}
	public void setFlags(Object newFlags) {
		Flags = newFlags;
	}
	public Object getEntryOverhead() {
		return EntryOverhead;
	}
	public void setEntryOverhead(Object newEntryOverhead) {
		EntryOverhead = newEntryOverhead;
	}
	public Object getCreatorBackTraceIndex() {
		return CreatorBackTraceIndex;
	}
	public void setCreatorBackTraceIndex(Object newCreatorBackTraceIndex) {
		CreatorBackTraceIndex = newCreatorBackTraceIndex;
	}
	public Object getBytesAllocated() {
		return BytesAllocated;
	}
	public void setBytesAllocated(Object newBytesAllocated) {
		BytesAllocated = newBytesAllocated;
	}
	public Object getBytesCommitted() {
		return BytesCommitted;
	}
	public void setBytesCommitted(Object newBytesCommitted) {
		BytesCommitted = newBytesCommitted;
	}
	public Object getNumberOfTags() {
		return NumberOfTags;
	}
	public void setNumberOfTags(Object newNumberOfTags) {
		NumberOfTags = newNumberOfTags;
	}
	public Object getNumberOfEntries() {
		return NumberOfEntries;
	}
	public void setNumberOfEntries(Object newNumberOfEntries) {
		NumberOfEntries = newNumberOfEntries;
	}
	public Object getNumberOfPseudoTags() {
		return NumberOfPseudoTags;
	}
	public void setNumberOfPseudoTags(Object newNumberOfPseudoTags) {
		NumberOfPseudoTags = newNumberOfPseudoTags;
	}
	public Object getPseudoTagGranularity() {
		return PseudoTagGranularity;
	}
	public void setPseudoTagGranularity(Object newPseudoTagGranularity) {
		PseudoTagGranularity = newPseudoTagGranularity;
	}
	public Object getReserved() {
		return Reserved;
	}
	public void setReserved(Object newReserved) {
		Reserved = newReserved;
	}
	public Object getTags() {
		return Tags;
	}
	public void setTags(Object newTags) {
		Tags = newTags;
	}
	public Object getEntries() {
		return Entries;
	}
	public void setEntries(Object newEntries) {
		Entries = newEntries;
	}
}

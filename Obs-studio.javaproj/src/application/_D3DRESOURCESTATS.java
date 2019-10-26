package application;

// GetInfo IDs
/* Used with D3DDEVINFO_RESOURCEMANAGER */
/* Used with D3DDEVINFO_D3DVERTEXSTATS */
public class _D3DRESOURCESTATS {
	private Object bThrashing;
	private Object ApproxBytesDownloaded;
	private Object NumEvicts;
	private Object NumVidCreates;
	private Object LastPri;
	private Object NumUsed;
	private Object NumUsedInVidMem;
	private Object WorkingSet;
	private Object WorkingSetBytes;
	private Object TotalManaged;
	private Object TotalBytes;
	
	public _D3DRESOURCESTATS(Object bThrashing, Object ApproxBytesDownloaded, Object NumEvicts, Object NumVidCreates, Object LastPri, Object NumUsed, Object NumUsedInVidMem, Object WorkingSet, Object WorkingSetBytes, Object TotalManaged, Object TotalBytes) {
		setBThrashing(bThrashing);
		setApproxBytesDownloaded(ApproxBytesDownloaded);
		setNumEvicts(NumEvicts);
		setNumVidCreates(NumVidCreates);
		setLastPri(LastPri);
		setNumUsed(NumUsed);
		setNumUsedInVidMem(NumUsedInVidMem);
		setWorkingSet(WorkingSet);
		setWorkingSetBytes(WorkingSetBytes);
		setTotalManaged(TotalManaged);
		setTotalBytes(TotalBytes);
	}
	public _D3DRESOURCESTATS() {
	}
	
	public Object getBThrashing() {
		return bThrashing;
	}
	public void setBThrashing(Object newBThrashing) {
		bThrashing = newBThrashing;
	}
	public Object getApproxBytesDownloaded() {
		return ApproxBytesDownloaded;
	}
	public void setApproxBytesDownloaded(Object newApproxBytesDownloaded) {
		ApproxBytesDownloaded = newApproxBytesDownloaded;
	}
	public Object getNumEvicts() {
		return NumEvicts;
	}
	public void setNumEvicts(Object newNumEvicts) {
		NumEvicts = newNumEvicts;
	}
	public Object getNumVidCreates() {
		return NumVidCreates;
	}
	public void setNumVidCreates(Object newNumVidCreates) {
		NumVidCreates = newNumVidCreates;
	}
	public Object getLastPri() {
		return LastPri;
	}
	public void setLastPri(Object newLastPri) {
		LastPri = newLastPri;
	}
	public Object getNumUsed() {
		return NumUsed;
	}
	public void setNumUsed(Object newNumUsed) {
		NumUsed = newNumUsed;
	}
	public Object getNumUsedInVidMem() {
		return NumUsedInVidMem;
	}
	public void setNumUsedInVidMem(Object newNumUsedInVidMem) {
		NumUsedInVidMem = newNumUsedInVidMem;
	}
	public Object getWorkingSet() {
		return WorkingSet;
	}
	public void setWorkingSet(Object newWorkingSet) {
		WorkingSet = newWorkingSet;
	}
	public Object getWorkingSetBytes() {
		return WorkingSetBytes;
	}
	public void setWorkingSetBytes(Object newWorkingSetBytes) {
		WorkingSetBytes = newWorkingSetBytes;
	}
	public Object getTotalManaged() {
		return TotalManaged;
	}
	public void setTotalManaged(Object newTotalManaged) {
		TotalManaged = newTotalManaged;
	}
	public Object getTotalBytes() {
		return TotalBytes;
	}
	public void setTotalBytes(Object newTotalBytes) {
		TotalBytes = newTotalBytes;
	}
}

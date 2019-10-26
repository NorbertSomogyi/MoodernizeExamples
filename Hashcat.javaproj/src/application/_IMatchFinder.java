package application;

public class _IMatchFinder {
	private Object Init;
	private Object GetNumAvailableBytes;
	private Object GetPointerToCurrentPos;
	private Object GetMatches;
	private Object Skip;
	
	public _IMatchFinder(Object Init, Object GetNumAvailableBytes, Object GetPointerToCurrentPos, Object GetMatches, Object Skip) {
		setInit(Init);
		setGetNumAvailableBytes(GetNumAvailableBytes);
		setGetPointerToCurrentPos(GetPointerToCurrentPos);
		setGetMatches(GetMatches);
		setSkip(Skip);
	}
	public _IMatchFinder() {
	}
	
	public Object getInit() {
		return Init;
	}
	public void setInit(Object newInit) {
		Init = newInit;
	}
	public Object getGetNumAvailableBytes() {
		return GetNumAvailableBytes;
	}
	public void setGetNumAvailableBytes(Object newGetNumAvailableBytes) {
		GetNumAvailableBytes = newGetNumAvailableBytes;
	}
	public Object getGetPointerToCurrentPos() {
		return GetPointerToCurrentPos;
	}
	public void setGetPointerToCurrentPos(Object newGetPointerToCurrentPos) {
		GetPointerToCurrentPos = newGetPointerToCurrentPos;
	}
	public Object getGetMatches() {
		return GetMatches;
	}
	public void setGetMatches(Object newGetMatches) {
		GetMatches = newGetMatches;
	}
	public Object getSkip() {
		return Skip;
	}
	public void setSkip(Object newSkip) {
		Skip = newSkip;
	}
}

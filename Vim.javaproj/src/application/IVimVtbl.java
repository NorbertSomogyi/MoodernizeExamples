package application;

/* [in] */
/* [in] */
/* [retval][out] */
/* [retval][out] */
/* C style interface */
public class IVimVtbl {
	private Object QueryInterface;
	private Object AddRef;
	private Object Release;
	private Object GetTypeInfoCount;
	private Object GetTypeInfo;
	private Object GetIDsOfNames;
	private Object Invoke;
	private Object SendKeys;
	private Object Eval;
	private Object SetForeground;
	private Object GetHwnd;
	
	public IVimVtbl(Object QueryInterface, Object AddRef, Object Release, Object GetTypeInfoCount, Object GetTypeInfo, Object GetIDsOfNames, Object Invoke, Object SendKeys, Object Eval, Object SetForeground, Object GetHwnd) {
		setQueryInterface(QueryInterface);
		setAddRef(AddRef);
		setRelease(Release);
		setGetTypeInfoCount(GetTypeInfoCount);
		setGetTypeInfo(GetTypeInfo);
		setGetIDsOfNames(GetIDsOfNames);
		setInvoke(Invoke);
		setSendKeys(SendKeys);
		setEval(Eval);
		setSetForeground(SetForeground);
		setGetHwnd(GetHwnd);
	}
	public IVimVtbl() {
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
	public Object getGetTypeInfoCount() {
		return GetTypeInfoCount;
	}
	public void setGetTypeInfoCount(Object newGetTypeInfoCount) {
		GetTypeInfoCount = newGetTypeInfoCount;
	}
	public Object getGetTypeInfo() {
		return GetTypeInfo;
	}
	public void setGetTypeInfo(Object newGetTypeInfo) {
		GetTypeInfo = newGetTypeInfo;
	}
	public Object getGetIDsOfNames() {
		return GetIDsOfNames;
	}
	public void setGetIDsOfNames(Object newGetIDsOfNames) {
		GetIDsOfNames = newGetIDsOfNames;
	}
	public Object getInvoke() {
		return Invoke;
	}
	public void setInvoke(Object newInvoke) {
		Invoke = newInvoke;
	}
	public Object getSendKeys() {
		return SendKeys;
	}
	public void setSendKeys(Object newSendKeys) {
		SendKeys = newSendKeys;
	}
	public Object getEval() {
		return Eval;
	}
	public void setEval(Object newEval) {
		Eval = newEval;
	}
	public Object getSetForeground() {
		return SetForeground;
	}
	public void setSetForeground(Object newSetForeground) {
		SetForeground = newSetForeground;
	}
	public Object getGetHwnd() {
		return GetHwnd;
	}
	public void setGetHwnd(Object newGetHwnd) {
		GetHwnd = newGetHwnd;
	}
}

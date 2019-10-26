package application;

// declare dispatcher's version
public class _mfxSession {
	private Object session;
	private Object callTable;
	private Object callPlugInsTable;
	private Object callAudioTable;
	private Object impl;
	
	public _mfxSession(Object session, Object callTable, Object callPlugInsTable, Object callAudioTable, Object impl) {
		setSession(session);
		setCallTable(callTable);
		setCallPlugInsTable(callPlugInsTable);
		setCallAudioTable(callAudioTable);
		setImpl(impl);
	}
	public _mfxSession() {
	}
	
	public Object getSession() {
		return session;
	}
	public void setSession(Object newSession) {
		session = newSession;
	}
	public Object getCallTable() {
		return callTable;
	}
	public void setCallTable(Object newCallTable) {
		callTable = newCallTable;
	}
	public Object getCallPlugInsTable() {
		return callPlugInsTable;
	}
	public void setCallPlugInsTable(Object newCallPlugInsTable) {
		callPlugInsTable = newCallPlugInsTable;
	}
	public Object getCallAudioTable() {
		return callAudioTable;
	}
	public void setCallAudioTable(Object newCallAudioTable) {
		callAudioTable = newCallAudioTable;
	}
	public Object getImpl() {
		return impl;
	}
	public void setImpl(Object newImpl) {
		impl = newImpl;
	}
}

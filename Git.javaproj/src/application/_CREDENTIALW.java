package application;

public class _CREDENTIALW {
	private Object Flags;
	private Object Type;
	private Object TargetName;
	private Object Comment;
	private _FILETIME LastWritten;
	private Object CredentialBlobSize;
	private Object CredentialBlob;
	private Object Persist;
	private Object AttributeCount;
	private Object Attributes;
	private Object TargetAlias;
	private Object UserName;
	
	public _CREDENTIALW(Object Flags, Object Type, Object TargetName, Object Comment, _FILETIME LastWritten, Object CredentialBlobSize, Object CredentialBlob, Object Persist, Object AttributeCount, Object Attributes, Object TargetAlias, Object UserName) {
		setFlags(Flags);
		setType(Type);
		setTargetName(TargetName);
		setComment(Comment);
		setLastWritten(LastWritten);
		setCredentialBlobSize(CredentialBlobSize);
		setCredentialBlob(CredentialBlob);
		setPersist(Persist);
		setAttributeCount(AttributeCount);
		setAttributes(Attributes);
		setTargetAlias(TargetAlias);
		setUserName(UserName);
	}
	public _CREDENTIALW() {
	}
	
	public Object getFlags() {
		return Flags;
	}
	public void setFlags(Object newFlags) {
		Flags = newFlags;
	}
	public Object getType() {
		return Type;
	}
	public void setType(Object newType) {
		Type = newType;
	}
	public Object getTargetName() {
		return TargetName;
	}
	public void setTargetName(Object newTargetName) {
		TargetName = newTargetName;
	}
	public Object getComment() {
		return Comment;
	}
	public void setComment(Object newComment) {
		Comment = newComment;
	}
	public _FILETIME getLastWritten() {
		return LastWritten;
	}
	public void setLastWritten(_FILETIME newLastWritten) {
		LastWritten = newLastWritten;
	}
	public Object getCredentialBlobSize() {
		return CredentialBlobSize;
	}
	public void setCredentialBlobSize(Object newCredentialBlobSize) {
		CredentialBlobSize = newCredentialBlobSize;
	}
	public Object getCredentialBlob() {
		return CredentialBlob;
	}
	public void setCredentialBlob(Object newCredentialBlob) {
		CredentialBlob = newCredentialBlob;
	}
	public Object getPersist() {
		return Persist;
	}
	public void setPersist(Object newPersist) {
		Persist = newPersist;
	}
	public Object getAttributeCount() {
		return AttributeCount;
	}
	public void setAttributeCount(Object newAttributeCount) {
		AttributeCount = newAttributeCount;
	}
	public Object getAttributes() {
		return Attributes;
	}
	public void setAttributes(Object newAttributes) {
		Attributes = newAttributes;
	}
	public Object getTargetAlias() {
		return TargetAlias;
	}
	public void setTargetAlias(Object newTargetAlias) {
		TargetAlias = newTargetAlias;
	}
	public Object getUserName() {
		return UserName;
	}
	public void setUserName(Object newUserName) {
		UserName = newUserName;
	}
}

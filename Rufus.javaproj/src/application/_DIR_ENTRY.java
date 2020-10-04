package application;

//
//
public class _DIR_ENTRY {
	private Object[] FileName;
	private Object Attributes;
	private Object Case;
	private Object CreationTimeTenMs;
	private _FAT_DATETIME CreationDateTime;
	private _FAT_DATE LastAccessDate;
	private Object ExtendedAttributes;
	private Object FirstClusterOfFileHi;
	private _FAT_DATETIME LastWriteDateTime;
	private Object FirstCluster;
	private Object FileSize;
	
	public _DIR_ENTRY(Object[] FileName, Object Attributes, Object Case, Object CreationTimeTenMs, _FAT_DATETIME CreationDateTime, _FAT_DATE LastAccessDate, Object ExtendedAttributes, Object FirstClusterOfFileHi, _FAT_DATETIME LastWriteDateTime, Object FirstCluster, Object FileSize) {
		setFileName(FileName);
		setAttributes(Attributes);
		setCase(Case);
		setCreationTimeTenMs(CreationTimeTenMs);
		setCreationDateTime(CreationDateTime);
		setLastAccessDate(LastAccessDate);
		setExtendedAttributes(ExtendedAttributes);
		setFirstClusterOfFileHi(FirstClusterOfFileHi);
		setLastWriteDateTime(LastWriteDateTime);
		setFirstCluster(FirstCluster);
		setFileSize(FileSize);
	}
	public _DIR_ENTRY() {
	}
	
	public Object[] getFileName() {
		return FileName;
	}
	public void setFileName(Object[] newFileName) {
		FileName = newFileName;
	}
	public Object getAttributes() {
		return Attributes;
	}
	public void setAttributes(Object newAttributes) {
		Attributes = newAttributes;
	}
	public Object getCase() {
		return Case;
	}
	public void setCase(Object newCase) {
		Case = newCase;
	}
	public Object getCreationTimeTenMs() {
		return CreationTimeTenMs;
	}
	public void setCreationTimeTenMs(Object newCreationTimeTenMs) {
		CreationTimeTenMs = newCreationTimeTenMs;
	}
	public _FAT_DATETIME getCreationDateTime() {
		return CreationDateTime;
	}
	public void setCreationDateTime(_FAT_DATETIME newCreationDateTime) {
		CreationDateTime = newCreationDateTime;
	}
	public _FAT_DATE getLastAccessDate() {
		return LastAccessDate;
	}
	public void setLastAccessDate(_FAT_DATE newLastAccessDate) {
		LastAccessDate = newLastAccessDate;
	}
	public Object getExtendedAttributes() {
		return ExtendedAttributes;
	}
	public void setExtendedAttributes(Object newExtendedAttributes) {
		ExtendedAttributes = newExtendedAttributes;
	}
	public Object getFirstClusterOfFileHi() {
		return FirstClusterOfFileHi;
	}
	public void setFirstClusterOfFileHi(Object newFirstClusterOfFileHi) {
		FirstClusterOfFileHi = newFirstClusterOfFileHi;
	}
	public _FAT_DATETIME getLastWriteDateTime() {
		return LastWriteDateTime;
	}
	public void setLastWriteDateTime(_FAT_DATETIME newLastWriteDateTime) {
		LastWriteDateTime = newLastWriteDateTime;
	}
	public Object getFirstCluster() {
		return FirstCluster;
	}
	public void setFirstCluster(Object newFirstCluster) {
		FirstCluster = newFirstCluster;
	}
	public Object getFileSize() {
		return FileSize;
	}
	public void setFileSize(Object newFileSize) {
		FileSize = newFileSize;
	}
}

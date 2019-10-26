package application;

// FILE_SYSTEM_PROP_FLAG
/* Large FAT32 */
public class tagFAT_BOOTSECTOR32 {
	private Object sJmpBoot;
	private Object sOEMName;
	private Object wBytsPerSec;
	private Object bSecPerClus;
	private Object wRsvdSecCnt;
	private Object bNumFATs;
	private Object wRootEntCnt;
	private Object wTotSec16;
	private Object bMedia;
	private Object wFATSz16;
	private Object wSecPerTrk;
	private Object wNumHeads;
	private Object dHiddSec;
	private Object dTotSec32;
	private Object dFATSz32;
	private Object wExtFlags;
	private Object wFSVer;
	private Object dRootClus;
	private Object wFSInfo;
	private Object wBkBootSec;
	private Object Reserved;
	private Object bDrvNum;
	private Object Reserved1;
	private Object bBootSig;
	private Object dBS_VolID;
	private Object sVolLab;
	private Object sBS_FilSysType;
	
	public tagFAT_BOOTSECTOR32(Object sJmpBoot, Object sOEMName, Object wBytsPerSec, Object bSecPerClus, Object wRsvdSecCnt, Object bNumFATs, Object wRootEntCnt, Object wTotSec16, Object bMedia, Object wFATSz16, Object wSecPerTrk, Object wNumHeads, Object dHiddSec, Object dTotSec32, Object dFATSz32, Object wExtFlags, Object wFSVer, Object dRootClus, Object wFSInfo, Object wBkBootSec, Object Reserved, Object bDrvNum, Object Reserved1, Object bBootSig, Object dBS_VolID, Object sVolLab, Object sBS_FilSysType) {
		setSJmpBoot(sJmpBoot);
		setSOEMName(sOEMName);
		setWBytsPerSec(wBytsPerSec);
		setBSecPerClus(bSecPerClus);
		setWRsvdSecCnt(wRsvdSecCnt);
		setBNumFATs(bNumFATs);
		setWRootEntCnt(wRootEntCnt);
		setWTotSec16(wTotSec16);
		setBMedia(bMedia);
		setWFATSz16(wFATSz16);
		setWSecPerTrk(wSecPerTrk);
		setWNumHeads(wNumHeads);
		setDHiddSec(dHiddSec);
		setDTotSec32(dTotSec32);
		setDFATSz32(dFATSz32);
		setWExtFlags(wExtFlags);
		setWFSVer(wFSVer);
		setDRootClus(dRootClus);
		setWFSInfo(wFSInfo);
		setWBkBootSec(wBkBootSec);
		setReserved(Reserved);
		setBDrvNum(bDrvNum);
		setReserved1(Reserved1);
		setBBootSig(bBootSig);
		setDBS_VolID(dBS_VolID);
		setSVolLab(sVolLab);
		setSBS_FilSysType(sBS_FilSysType);
	}
	public tagFAT_BOOTSECTOR32() {
	}
	
	public Object getSJmpBoot() {
		return sJmpBoot;
	}
	public void setSJmpBoot(Object newSJmpBoot) {
		sJmpBoot = newSJmpBoot;
	}
	public Object getSOEMName() {
		return sOEMName;
	}
	public void setSOEMName(Object newSOEMName) {
		sOEMName = newSOEMName;
	}
	public Object getWBytsPerSec() {
		return wBytsPerSec;
	}
	public void setWBytsPerSec(Object newWBytsPerSec) {
		wBytsPerSec = newWBytsPerSec;
	}
	public Object getBSecPerClus() {
		return bSecPerClus;
	}
	public void setBSecPerClus(Object newBSecPerClus) {
		bSecPerClus = newBSecPerClus;
	}
	public Object getWRsvdSecCnt() {
		return wRsvdSecCnt;
	}
	public void setWRsvdSecCnt(Object newWRsvdSecCnt) {
		wRsvdSecCnt = newWRsvdSecCnt;
	}
	public Object getBNumFATs() {
		return bNumFATs;
	}
	public void setBNumFATs(Object newBNumFATs) {
		bNumFATs = newBNumFATs;
	}
	public Object getWRootEntCnt() {
		return wRootEntCnt;
	}
	public void setWRootEntCnt(Object newWRootEntCnt) {
		wRootEntCnt = newWRootEntCnt;
	}
	public Object getWTotSec16() {
		return wTotSec16;
	}
	public void setWTotSec16(Object newWTotSec16) {
		wTotSec16 = newWTotSec16;
	}
	public Object getBMedia() {
		return bMedia;
	}
	public void setBMedia(Object newBMedia) {
		bMedia = newBMedia;
	}
	public Object getWFATSz16() {
		return wFATSz16;
	}
	public void setWFATSz16(Object newWFATSz16) {
		wFATSz16 = newWFATSz16;
	}
	public Object getWSecPerTrk() {
		return wSecPerTrk;
	}
	public void setWSecPerTrk(Object newWSecPerTrk) {
		wSecPerTrk = newWSecPerTrk;
	}
	public Object getWNumHeads() {
		return wNumHeads;
	}
	public void setWNumHeads(Object newWNumHeads) {
		wNumHeads = newWNumHeads;
	}
	public Object getDHiddSec() {
		return dHiddSec;
	}
	public void setDHiddSec(Object newDHiddSec) {
		dHiddSec = newDHiddSec;
	}
	public Object getDTotSec32() {
		return dTotSec32;
	}
	public void setDTotSec32(Object newDTotSec32) {
		dTotSec32 = newDTotSec32;
	}
	public Object getDFATSz32() {
		return dFATSz32;
	}
	public void setDFATSz32(Object newDFATSz32) {
		dFATSz32 = newDFATSz32;
	}
	public Object getWExtFlags() {
		return wExtFlags;
	}
	public void setWExtFlags(Object newWExtFlags) {
		wExtFlags = newWExtFlags;
	}
	public Object getWFSVer() {
		return wFSVer;
	}
	public void setWFSVer(Object newWFSVer) {
		wFSVer = newWFSVer;
	}
	public Object getDRootClus() {
		return dRootClus;
	}
	public void setDRootClus(Object newDRootClus) {
		dRootClus = newDRootClus;
	}
	public Object getWFSInfo() {
		return wFSInfo;
	}
	public void setWFSInfo(Object newWFSInfo) {
		wFSInfo = newWFSInfo;
	}
	public Object getWBkBootSec() {
		return wBkBootSec;
	}
	public void setWBkBootSec(Object newWBkBootSec) {
		wBkBootSec = newWBkBootSec;
	}
	public Object getReserved() {
		return Reserved;
	}
	public void setReserved(Object newReserved) {
		Reserved = newReserved;
	}
	public Object getBDrvNum() {
		return bDrvNum;
	}
	public void setBDrvNum(Object newBDrvNum) {
		bDrvNum = newBDrvNum;
	}
	public Object getReserved1() {
		return Reserved1;
	}
	public void setReserved1(Object newReserved1) {
		Reserved1 = newReserved1;
	}
	public Object getBBootSig() {
		return bBootSig;
	}
	public void setBBootSig(Object newBBootSig) {
		bBootSig = newBBootSig;
	}
	public Object getDBS_VolID() {
		return dBS_VolID;
	}
	public void setDBS_VolID(Object newDBS_VolID) {
		dBS_VolID = newDBS_VolID;
	}
	public Object getSVolLab() {
		return sVolLab;
	}
	public void setSVolLab(Object newSVolLab) {
		sVolLab = newSVolLab;
	}
	public Object getSBS_FilSysType() {
		return sBS_FilSysType;
	}
	public void setSBS_FilSysType(Object newSBS_FilSysType) {
		sBS_FilSysType = newSBS_FilSysType;
	}
}

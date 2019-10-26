package application;

/* NTFS bootsector format */
public class ntfs_boot_sector {
	private Object bsJump;
	private Object bsOemName;
	private Object bsBytesPerSec;
	private Object bsSecPerClust;
	private Object bsResSectors;
	private Object bsZeroed_0;
	private Object bsZeroed_1;
	private Object bsMedia;
	private Object bsZeroed_2;
	private Object bsUnused_0;
	private Object bsUnused_1;
	private Object bsUnused_2;
	private Object bsZeroed_3;
	private Object bsUnused_3;
	private Object bsTotalSectors;
	private Object bsMFTLogicalClustNr;
	private Object bsMFTMirrLogicalClustNr;
	private Object bsClustPerMFTrecord;
	private Object bsUnused_4;
	private Object bsClustPerIdxBuf;
	private Object bsUnused_5;
	private Object bsVolSerialNr;
	private Object bsUnused_6;
	private Object Code;
	private Object bsMagic;
	private Object bsForwardPtr;
	private Object bsSignature;
	
	public ntfs_boot_sector(Object bsJump, Object bsOemName, Object bsBytesPerSec, Object bsSecPerClust, Object bsResSectors, Object bsZeroed_0, Object bsZeroed_1, Object bsMedia, Object bsZeroed_2, Object bsUnused_0, Object bsUnused_1, Object bsUnused_2, Object bsZeroed_3, Object bsUnused_3, Object bsTotalSectors, Object bsMFTLogicalClustNr, Object bsMFTMirrLogicalClustNr, Object bsClustPerMFTrecord, Object bsUnused_4, Object bsClustPerIdxBuf, Object bsUnused_5, Object bsVolSerialNr, Object bsUnused_6, Object Code, Object bsMagic, Object bsForwardPtr, Object bsSignature) {
		setBsJump(bsJump);
		setBsOemName(bsOemName);
		setBsBytesPerSec(bsBytesPerSec);
		setBsSecPerClust(bsSecPerClust);
		setBsResSectors(bsResSectors);
		setBsZeroed_0(bsZeroed_0);
		setBsZeroed_1(bsZeroed_1);
		setBsMedia(bsMedia);
		setBsZeroed_2(bsZeroed_2);
		setBsUnused_0(bsUnused_0);
		setBsUnused_1(bsUnused_1);
		setBsUnused_2(bsUnused_2);
		setBsZeroed_3(bsZeroed_3);
		setBsUnused_3(bsUnused_3);
		setBsTotalSectors(bsTotalSectors);
		setBsMFTLogicalClustNr(bsMFTLogicalClustNr);
		setBsMFTMirrLogicalClustNr(bsMFTMirrLogicalClustNr);
		setBsClustPerMFTrecord(bsClustPerMFTrecord);
		setBsUnused_4(bsUnused_4);
		setBsClustPerIdxBuf(bsClustPerIdxBuf);
		setBsUnused_5(bsUnused_5);
		setBsVolSerialNr(bsVolSerialNr);
		setBsUnused_6(bsUnused_6);
		setCode(Code);
		setBsMagic(bsMagic);
		setBsForwardPtr(bsForwardPtr);
		setBsSignature(bsSignature);
	}
	public ntfs_boot_sector() {
	}
	
	public Object getBsJump() {
		return bsJump;
	}
	public void setBsJump(Object newBsJump) {
		bsJump = newBsJump;
	}
	public Object getBsOemName() {
		return bsOemName;
	}
	public void setBsOemName(Object newBsOemName) {
		bsOemName = newBsOemName;
	}
	public Object getBsBytesPerSec() {
		return bsBytesPerSec;
	}
	public void setBsBytesPerSec(Object newBsBytesPerSec) {
		bsBytesPerSec = newBsBytesPerSec;
	}
	public Object getBsSecPerClust() {
		return bsSecPerClust;
	}
	public void setBsSecPerClust(Object newBsSecPerClust) {
		bsSecPerClust = newBsSecPerClust;
	}
	public Object getBsResSectors() {
		return bsResSectors;
	}
	public void setBsResSectors(Object newBsResSectors) {
		bsResSectors = newBsResSectors;
	}
	public Object getBsZeroed_0() {
		return bsZeroed_0;
	}
	public void setBsZeroed_0(Object newBsZeroed_0) {
		bsZeroed_0 = newBsZeroed_0;
	}
	public Object getBsZeroed_1() {
		return bsZeroed_1;
	}
	public void setBsZeroed_1(Object newBsZeroed_1) {
		bsZeroed_1 = newBsZeroed_1;
	}
	public Object getBsMedia() {
		return bsMedia;
	}
	public void setBsMedia(Object newBsMedia) {
		bsMedia = newBsMedia;
	}
	public Object getBsZeroed_2() {
		return bsZeroed_2;
	}
	public void setBsZeroed_2(Object newBsZeroed_2) {
		bsZeroed_2 = newBsZeroed_2;
	}
	public Object getBsUnused_0() {
		return bsUnused_0;
	}
	public void setBsUnused_0(Object newBsUnused_0) {
		bsUnused_0 = newBsUnused_0;
	}
	public Object getBsUnused_1() {
		return bsUnused_1;
	}
	public void setBsUnused_1(Object newBsUnused_1) {
		bsUnused_1 = newBsUnused_1;
	}
	public Object getBsUnused_2() {
		return bsUnused_2;
	}
	public void setBsUnused_2(Object newBsUnused_2) {
		bsUnused_2 = newBsUnused_2;
	}
	public Object getBsZeroed_3() {
		return bsZeroed_3;
	}
	public void setBsZeroed_3(Object newBsZeroed_3) {
		bsZeroed_3 = newBsZeroed_3;
	}
	public Object getBsUnused_3() {
		return bsUnused_3;
	}
	public void setBsUnused_3(Object newBsUnused_3) {
		bsUnused_3 = newBsUnused_3;
	}
	public Object getBsTotalSectors() {
		return bsTotalSectors;
	}
	public void setBsTotalSectors(Object newBsTotalSectors) {
		bsTotalSectors = newBsTotalSectors;
	}
	public Object getBsMFTLogicalClustNr() {
		return bsMFTLogicalClustNr;
	}
	public void setBsMFTLogicalClustNr(Object newBsMFTLogicalClustNr) {
		bsMFTLogicalClustNr = newBsMFTLogicalClustNr;
	}
	public Object getBsMFTMirrLogicalClustNr() {
		return bsMFTMirrLogicalClustNr;
	}
	public void setBsMFTMirrLogicalClustNr(Object newBsMFTMirrLogicalClustNr) {
		bsMFTMirrLogicalClustNr = newBsMFTMirrLogicalClustNr;
	}
	public Object getBsClustPerMFTrecord() {
		return bsClustPerMFTrecord;
	}
	public void setBsClustPerMFTrecord(Object newBsClustPerMFTrecord) {
		bsClustPerMFTrecord = newBsClustPerMFTrecord;
	}
	public Object getBsUnused_4() {
		return bsUnused_4;
	}
	public void setBsUnused_4(Object newBsUnused_4) {
		bsUnused_4 = newBsUnused_4;
	}
	public Object getBsClustPerIdxBuf() {
		return bsClustPerIdxBuf;
	}
	public void setBsClustPerIdxBuf(Object newBsClustPerIdxBuf) {
		bsClustPerIdxBuf = newBsClustPerIdxBuf;
	}
	public Object getBsUnused_5() {
		return bsUnused_5;
	}
	public void setBsUnused_5(Object newBsUnused_5) {
		bsUnused_5 = newBsUnused_5;
	}
	public Object getBsVolSerialNr() {
		return bsVolSerialNr;
	}
	public void setBsVolSerialNr(Object newBsVolSerialNr) {
		bsVolSerialNr = newBsVolSerialNr;
	}
	public Object getBsUnused_6() {
		return bsUnused_6;
	}
	public void setBsUnused_6(Object newBsUnused_6) {
		bsUnused_6 = newBsUnused_6;
	}
	public Object getCode() {
		return Code;
	}
	public void setCode(Object newCode) {
		Code = newCode;
	}
	public Object getBsMagic() {
		return bsMagic;
	}
	public void setBsMagic(Object newBsMagic) {
		bsMagic = newBsMagic;
	}
	public Object getBsForwardPtr() {
		return bsForwardPtr;
	}
	public void setBsForwardPtr(Object newBsForwardPtr) {
		bsForwardPtr = newBsForwardPtr;
	}
	public Object getBsSignature() {
		return bsSignature;
	}
	public void setBsSignature(Object newBsSignature) {
		bsSignature = newBsSignature;
	}
}

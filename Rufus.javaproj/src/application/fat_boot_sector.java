package application;

/* FAT bootsector format, also used by other disk-based derivatives */
public class fat_boot_sector {
	private Object bsJump;
	private Object bsOemName;
	private Object bsBytesPerSec;
	private Object bsSecPerClust;
	private Object bsResSectors;
	private Object bsFATs;
	private Object bsRootDirEnts;
	private Object bsSectors;
	private Object bsMedia;
	private Object bsFATsecs;
	private Object bsSecPerTrack;
	private Object bsHeads;
	private Object bsHiddenSecs;
	private Object bsHugeSectors;
	private  bs16;
	private  bs32;
	private Object bsMagic;
	private Object bsForwardPtr;
	private Object bsSignature;
	
	public fat_boot_sector(Object bsJump, Object bsOemName, Object bsBytesPerSec, Object bsSecPerClust, Object bsResSectors, Object bsFATs, Object bsRootDirEnts, Object bsSectors, Object bsMedia, Object bsFATsecs, Object bsSecPerTrack, Object bsHeads, Object bsHiddenSecs, Object bsHugeSectors,  bs16,  bs32, Object bsMagic, Object bsForwardPtr, Object bsSignature) {
		setBsJump(bsJump);
		setBsOemName(bsOemName);
		setBsBytesPerSec(bsBytesPerSec);
		setBsSecPerClust(bsSecPerClust);
		setBsResSectors(bsResSectors);
		setBsFATs(bsFATs);
		setBsRootDirEnts(bsRootDirEnts);
		setBsSectors(bsSectors);
		setBsMedia(bsMedia);
		setBsFATsecs(bsFATsecs);
		setBsSecPerTrack(bsSecPerTrack);
		setBsHeads(bsHeads);
		setBsHiddenSecs(bsHiddenSecs);
		setBsHugeSectors(bsHugeSectors);
		setBs16(bs16);
		setBs32(bs32);
		setBsMagic(bsMagic);
		setBsForwardPtr(bsForwardPtr);
		setBsSignature(bsSignature);
	}
	public fat_boot_sector() {
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
	public Object getBsFATs() {
		return bsFATs;
	}
	public void setBsFATs(Object newBsFATs) {
		bsFATs = newBsFATs;
	}
	public Object getBsRootDirEnts() {
		return bsRootDirEnts;
	}
	public void setBsRootDirEnts(Object newBsRootDirEnts) {
		bsRootDirEnts = newBsRootDirEnts;
	}
	public Object getBsSectors() {
		return bsSectors;
	}
	public void setBsSectors(Object newBsSectors) {
		bsSectors = newBsSectors;
	}
	public Object getBsMedia() {
		return bsMedia;
	}
	public void setBsMedia(Object newBsMedia) {
		bsMedia = newBsMedia;
	}
	public Object getBsFATsecs() {
		return bsFATsecs;
	}
	public void setBsFATsecs(Object newBsFATsecs) {
		bsFATsecs = newBsFATsecs;
	}
	public Object getBsSecPerTrack() {
		return bsSecPerTrack;
	}
	public void setBsSecPerTrack(Object newBsSecPerTrack) {
		bsSecPerTrack = newBsSecPerTrack;
	}
	public Object getBsHeads() {
		return bsHeads;
	}
	public void setBsHeads(Object newBsHeads) {
		bsHeads = newBsHeads;
	}
	public Object getBsHiddenSecs() {
		return bsHiddenSecs;
	}
	public void setBsHiddenSecs(Object newBsHiddenSecs) {
		bsHiddenSecs = newBsHiddenSecs;
	}
	public Object getBsHugeSectors() {
		return bsHugeSectors;
	}
	public void setBsHugeSectors(Object newBsHugeSectors) {
		bsHugeSectors = newBsHugeSectors;
	}
	public  getBs16() {
		return bs16;
	}
	public void setBs16( newBs16) {
		bs16 = newBs16;
	}
	public  getBs32() {
		return bs32;
	}
	public void setBs32( newBs32) {
		bs32 = newBs32;
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

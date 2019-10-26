package application;

public class ext_patch_area {
	private Object advptroffset;
	private Object diroffset;
	private Object dirlen;
	private Object subvoloffset;
	private Object subvollen;
	private Object secptroffset;
	private Object secptrcnt;
	private Object sect1ptr0;
	private Object sect1ptr1;
	private Object raidpatch;
	
	public ext_patch_area(Object advptroffset, Object diroffset, Object dirlen, Object subvoloffset, Object subvollen, Object secptroffset, Object secptrcnt, Object sect1ptr0, Object sect1ptr1, Object raidpatch) {
		setAdvptroffset(advptroffset);
		setDiroffset(diroffset);
		setDirlen(dirlen);
		setSubvoloffset(subvoloffset);
		setSubvollen(subvollen);
		setSecptroffset(secptroffset);
		setSecptrcnt(secptrcnt);
		setSect1ptr0(sect1ptr0);
		setSect1ptr1(sect1ptr1);
		setRaidpatch(raidpatch);
	}
	public ext_patch_area() {
	}
	
	public Object getAdvptroffset() {
		return advptroffset;
	}
	public void setAdvptroffset(Object newAdvptroffset) {
		advptroffset = newAdvptroffset;
	}
	public Object getDiroffset() {
		return diroffset;
	}
	public void setDiroffset(Object newDiroffset) {
		diroffset = newDiroffset;
	}
	public Object getDirlen() {
		return dirlen;
	}
	public void setDirlen(Object newDirlen) {
		dirlen = newDirlen;
	}
	public Object getSubvoloffset() {
		return subvoloffset;
	}
	public void setSubvoloffset(Object newSubvoloffset) {
		subvoloffset = newSubvoloffset;
	}
	public Object getSubvollen() {
		return subvollen;
	}
	public void setSubvollen(Object newSubvollen) {
		subvollen = newSubvollen;
	}
	public Object getSecptroffset() {
		return secptroffset;
	}
	public void setSecptroffset(Object newSecptroffset) {
		secptroffset = newSecptroffset;
	}
	public Object getSecptrcnt() {
		return secptrcnt;
	}
	public void setSecptrcnt(Object newSecptrcnt) {
		secptrcnt = newSecptrcnt;
	}
	public Object getSect1ptr0() {
		return sect1ptr0;
	}
	public void setSect1ptr0(Object newSect1ptr0) {
		sect1ptr0 = newSect1ptr0;
	}
	public Object getSect1ptr1() {
		return sect1ptr1;
	}
	public void setSect1ptr1(Object newSect1ptr1) {
		sect1ptr1 = newSect1ptr1;
	}
	public Object getRaidpatch() {
		return raidpatch;
	}
	public void setRaidpatch(Object newRaidpatch) {
		raidpatch = newRaidpatch;
	}
}

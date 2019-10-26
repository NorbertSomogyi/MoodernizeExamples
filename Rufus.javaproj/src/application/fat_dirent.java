package application;

/* A FAT filesystem directory entry */
public class fat_dirent {
	private Object name;
	private Object attribute;
	private Object caseflags;
	private Object ctime_ms;
	private Object ctime;
	private Object atime;
	private Object clusthi;
	private Object mtime;
	private Object clustlo;
	private Object size;
	
	public fat_dirent(Object name, Object attribute, Object caseflags, Object ctime_ms, Object ctime, Object atime, Object clusthi, Object mtime, Object clustlo, Object size) {
		setName(name);
		setAttribute(attribute);
		setCaseflags(caseflags);
		setCtime_ms(ctime_ms);
		setCtime(ctime);
		setAtime(atime);
		setClusthi(clusthi);
		setMtime(mtime);
		setClustlo(clustlo);
		setSize(size);
	}
	public fat_dirent() {
	}
	
	public fat_dirent get_next_dirent(libfat_filesystem fs, Object sector, int offset) {
		fat_dirent dep = new fat_dirent();
		offset += ;
		if (offset >= ModernizedCProgram.LIBFAT_SECTOR_SIZE) {
			offset = 0;
			sector = fs.libfat_nextsector(sector);
			if ((sector == 0) || (sector == (libfat_sector_t)-1)) {
				return ((Object)0);
			} 
		} 
		dep = fs.libfat_get_sector(sector);
		if (!dep) {
			return ((Object)0);
		} 
		dep = (fat_dirent)((byte)dep)[offset];
		return dep;
	}
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
	public Object getAttribute() {
		return attribute;
	}
	public void setAttribute(Object newAttribute) {
		attribute = newAttribute;
	}
	public Object getCaseflags() {
		return caseflags;
	}
	public void setCaseflags(Object newCaseflags) {
		caseflags = newCaseflags;
	}
	public Object getCtime_ms() {
		return ctime_ms;
	}
	public void setCtime_ms(Object newCtime_ms) {
		ctime_ms = newCtime_ms;
	}
	public Object getCtime() {
		return ctime;
	}
	public void setCtime(Object newCtime) {
		ctime = newCtime;
	}
	public Object getAtime() {
		return atime;
	}
	public void setAtime(Object newAtime) {
		atime = newAtime;
	}
	public Object getClusthi() {
		return clusthi;
	}
	public void setClusthi(Object newClusthi) {
		clusthi = newClusthi;
	}
	public Object getMtime() {
		return mtime;
	}
	public void setMtime(Object newMtime) {
		mtime = newMtime;
	}
	public Object getClustlo() {
		return clustlo;
	}
	public void setClustlo(Object newClustlo) {
		clustlo = newClustlo;
	}
	public Object getSize() {
		return size;
	}
	public void setSize(Object newSize) {
		size = newSize;
	}
}

package application;

public class archiver {
	private Object[] name;
	private Object write_archive;
	private int flags;
	private Object data;
	
	public archiver(Object[] name, Object write_archive, int flags, Object data) {
		setName(name);
		setWrite_archive(write_archive);
		setFlags(flags);
		setData(data);
	}
	public archiver() {
	}
	
	public void register_archiver() {
		do {
			if ((ModernizedCProgram.nr_archivers + 1) > ModernizedCProgram.alloc_archivers) {
				if ((((ModernizedCProgram.alloc_archivers) + 16) * 3 / 2) < (ModernizedCProgram.nr_archivers + 1)) {
					ModernizedCProgram.alloc_archivers = (ModernizedCProgram.nr_archivers + 1);
				} else {
						ModernizedCProgram.alloc_archivers = (((ModernizedCProgram.alloc_archivers) + 16) * 3 / 2);
				} 
				(ModernizedCProgram.archivers) = ModernizedCProgram.xrealloc((ModernizedCProgram.archivers), ModernizedCProgram.st_mult(/*Error: sizeof expression not supported yet*/, (ModernizedCProgram.alloc_archivers)));
			} 
		} while (0);
		ModernizedCProgram.archivers[ModernizedCProgram.nr_archivers++] = ar;
	}
	public archiver find_tar_filter(Object name, int len) {
		int i;
		Object[] generatedName = ar.getName();
		for (i = 0; i < ModernizedCProgram.nr_tar_filters; i++) {
			archiver ar = ModernizedCProgram.tar_filters[i];
			if (!/*Error: Function owner not recognized*/strncmp(generatedName, name, len) && !generatedName[len]) {
				return ar;
			} 
		}
		return ((Object)0);
	}
	public Object[] getName() {
		return name;
	}
	public void setName(Object[] newName) {
		name = newName;
	}
	public Object getWrite_archive() {
		return write_archive;
	}
	public void setWrite_archive(Object newWrite_archive) {
		write_archive = newWrite_archive;
	}
	public int getFlags() {
		return flags;
	}
	public void setFlags(int newFlags) {
		flags = newFlags;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object newData) {
		data = newData;
	}
}

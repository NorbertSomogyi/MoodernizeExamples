package application;

public class bitmap_disk_header {
	private Object magic;
	private Object version;
	private Object options;
	private Object entry_count;
	private Object checksum;
	
	public bitmap_disk_header(Object magic, Object version, Object options, Object entry_count, Object checksum) {
		setMagic(magic);
		setVersion(version);
		setOptions(options);
		setEntry_count(entry_count);
		setChecksum(checksum);
	}
	public bitmap_disk_header() {
	}
	
	public Object getMagic() {
		return magic;
	}
	public void setMagic(Object newMagic) {
		magic = newMagic;
	}
	public Object getVersion() {
		return version;
	}
	public void setVersion(Object newVersion) {
		version = newVersion;
	}
	public Object getOptions() {
		return options;
	}
	public void setOptions(Object newOptions) {
		options = newOptions;
	}
	public Object getEntry_count() {
		return entry_count;
	}
	public void setEntry_count(Object newEntry_count) {
		entry_count = newEntry_count;
	}
	public Object getChecksum() {
		return checksum;
	}
	public void setChecksum(Object newChecksum) {
		checksum = newChecksum;
	}
}

package application;

/*
 * Flags used by ext2fs_extent_insert()
 */
/* insert after handle loc'n */
/* insert may not cause split */
/*
 * Flags used by ext2fs_extent_delete()
 */
/* keep node if last extent gone */
/*
 * Flags used by ext2fs_extent_set_bmap()
 */
/*
 * Data structure returned by ext2fs_extent_get_info()
 */
public class ext2_extent_info {
	private int curr_entry;
	private int curr_level;
	private int num_entries;
	private int max_entries;
	private int max_depth;
	private int bytes_avail;
	private Object max_lblk;
	private Object max_pblk;
	private Object max_len;
	private Object max_uninit_len;
	
	public ext2_extent_info(int curr_entry, int curr_level, int num_entries, int max_entries, int max_depth, int bytes_avail, Object max_lblk, Object max_pblk, Object max_len, Object max_uninit_len) {
		setCurr_entry(curr_entry);
		setCurr_level(curr_level);
		setNum_entries(num_entries);
		setMax_entries(max_entries);
		setMax_depth(max_depth);
		setBytes_avail(bytes_avail);
		setMax_lblk(max_lblk);
		setMax_pblk(max_pblk);
		setMax_len(max_len);
		setMax_uninit_len(max_uninit_len);
	}
	public ext2_extent_info() {
	}
	
	public Object ext2fs_extent_get_info(Object handle) {
		extent_path path = new extent_path();
		if (!(handle) || (handle).getMagic() != (EXT2_ET_MAGIC_EXTENT_HANDLE)) {
			return (EXT2_ET_MAGIC_EXTENT_HANDLE);
		} 
		.memset(info, 0, );
		path = handle.getPath() + handle.getLevel();
		Object generatedCurr = path.getCurr();
		Byte generatedBuf = path.getBuf();
		int generatedEntries = path.getEntries();
		int generatedMax_entries = path.getMax_entries();
		if (path) {
			if (generatedCurr) {
				this.setCurr_entry(((byte)generatedCurr - generatedBuf) / );
			} else {
					this.setCurr_entry(0);
			} 
			this.setNum_entries(generatedEntries);
			this.setMax_entries(generatedMax_entries);
			this.setBytes_avail((generatedMax_entries - generatedEntries) * );
		} 
		this.setCurr_level(handle.getLevel());
		this.setMax_depth(handle.getMax_depth());
		this.setMax_lblk(EXT_MAX_EXTENT_LBLK);
		this.setMax_pblk(EXT_MAX_EXTENT_PBLK);
		this.setMax_len(EXT_INIT_MAX_LEN);
		this.setMax_uninit_len(EXT_UNINIT_MAX_LEN);
		return 0;
	}
	public int getCurr_entry() {
		return curr_entry;
	}
	public void setCurr_entry(int newCurr_entry) {
		curr_entry = newCurr_entry;
	}
	public int getCurr_level() {
		return curr_level;
	}
	public void setCurr_level(int newCurr_level) {
		curr_level = newCurr_level;
	}
	public int getNum_entries() {
		return num_entries;
	}
	public void setNum_entries(int newNum_entries) {
		num_entries = newNum_entries;
	}
	public int getMax_entries() {
		return max_entries;
	}
	public void setMax_entries(int newMax_entries) {
		max_entries = newMax_entries;
	}
	public int getMax_depth() {
		return max_depth;
	}
	public void setMax_depth(int newMax_depth) {
		max_depth = newMax_depth;
	}
	public int getBytes_avail() {
		return bytes_avail;
	}
	public void setBytes_avail(int newBytes_avail) {
		bytes_avail = newBytes_avail;
	}
	public Object getMax_lblk() {
		return max_lblk;
	}
	public void setMax_lblk(Object newMax_lblk) {
		max_lblk = newMax_lblk;
	}
	public Object getMax_pblk() {
		return max_pblk;
	}
	public void setMax_pblk(Object newMax_pblk) {
		max_pblk = newMax_pblk;
	}
	public Object getMax_len() {
		return max_len;
	}
	public void setMax_len(Object newMax_len) {
		max_len = newMax_len;
	}
	public Object getMax_uninit_len() {
		return max_uninit_len;
	}
	public void setMax_uninit_len(Object newMax_uninit_len) {
		max_uninit_len = newMax_uninit_len;
	}
}

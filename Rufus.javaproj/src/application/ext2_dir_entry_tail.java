package application;

public class ext2_dir_entry_tail {
	private Object det_reserved_zero1;
	private Object det_rec_len;
	private Object det_reserved_name_len;
	private Object det_checksum;
	
	public ext2_dir_entry_tail(Object det_reserved_zero1, Object det_rec_len, Object det_reserved_name_len, Object det_checksum) {
		setDet_reserved_zero1(det_reserved_zero1);
		setDet_rec_len(det_rec_len);
		setDet_reserved_name_len(det_reserved_name_len);
		setDet_checksum(det_checksum);
	}
	public ext2_dir_entry_tail() {
	}
	
	public void ext2fs_initialize_dirent_tail(Object fs) {
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/memset(t, 0, /*Error: Unsupported expression*/);
		(ext2_dir_entry)t.ext2fs_set_rec_len(fs, /*Error: Unsupported expression*/);
		this.setDet_reserved_name_len(-1024);
	}
	public Object getDet_reserved_zero1() {
		return det_reserved_zero1;
	}
	public void setDet_reserved_zero1(Object newDet_reserved_zero1) {
		det_reserved_zero1 = newDet_reserved_zero1;
	}
	public Object getDet_rec_len() {
		return det_rec_len;
	}
	public void setDet_rec_len(Object newDet_rec_len) {
		det_rec_len = newDet_rec_len;
	}
	public Object getDet_reserved_name_len() {
		return det_reserved_name_len;
	}
	public void setDet_reserved_name_len(Object newDet_reserved_name_len) {
		det_reserved_name_len = newDet_reserved_name_len;
	}
	public Object getDet_checksum() {
		return det_checksum;
	}
	public void setDet_checksum(Object newDet_checksum) {
		det_checksum = newDet_checksum;
	}
}

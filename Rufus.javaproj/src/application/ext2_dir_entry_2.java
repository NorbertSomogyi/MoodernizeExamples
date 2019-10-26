package application;

public class ext2_dir_entry_2 {
	private Object inode;
	private Object rec_len;
	private Object name_len;
	private Object file_type;
	private Object name;
	
	public ext2_dir_entry_2(Object inode, Object rec_len, Object name_len, Object file_type, Object name) {
		setInode(inode);
		setRec_len(rec_len);
		setName_len(name_len);
		setFile_type(file_type);
		setName(name);
	}
	public ext2_dir_entry_2() {
	}
	
	public Object getInode() {
		return inode;
	}
	public void setInode(Object newInode) {
		inode = newInode;
	}
	public Object getRec_len() {
		return rec_len;
	}
	public void setRec_len(Object newRec_len) {
		rec_len = newRec_len;
	}
	public Object getName_len() {
		return name_len;
	}
	public void setName_len(Object newName_len) {
		name_len = newName_len;
	}
	public Object getFile_type() {
		return file_type;
	}
	public void setFile_type(Object newFile_type) {
		file_type = newFile_type;
	}
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
		name = newName;
	}
}

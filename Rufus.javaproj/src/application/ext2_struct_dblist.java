package application;

/*
 * Directory block iterator definition
 */
public class ext2_struct_dblist {
	private int magic;
	private Object fs;
	private int size;
	private int count;
	private int sorted;
	private ext2_db_entry2 list;
	
	public ext2_struct_dblist(int magic, Object fs, int size, int count, int sorted, ext2_db_entry2 list) {
		setMagic(magic);
		setFs(fs);
		setSize(size);
		setCount(count);
		setSorted(sorted);
		setList(list);
	}
	public ext2_struct_dblist() {
	}
	
	public int getMagic() {
		return magic;
	}
	public void setMagic(int newMagic) {
		magic = newMagic;
	}
	public Object getFs() {
		return fs;
	}
	public void setFs(Object newFs) {
		fs = newFs;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int newSize) {
		size = newSize;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int newCount) {
		count = newCount;
	}
	public int getSorted() {
		return sorted;
	}
	public void setSorted(int newSorted) {
		sorted = newSorted;
	}
	public ext2_db_entry2 getList() {
		return list;
	}
	public void setList(ext2_db_entry2 newList) {
		list = newList;
	}
}

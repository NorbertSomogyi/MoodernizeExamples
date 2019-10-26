package application;

/*
 * Badblocks list
 */
public class bb_struct_u64_list {
	private int magic;
	private int num;
	private int size;
	private Object list;
	private int badblocks_flags;
	
	public bb_struct_u64_list(int magic, int num, int size, Object list, int badblocks_flags) {
		setMagic(magic);
		setNum(num);
		setSize(size);
		setList(list);
		setBadblocks_flags(badblocks_flags);
	}
	public bb_struct_u64_list() {
	}
	
	public int getMagic() {
		return magic;
	}
	public void setMagic(int newMagic) {
		magic = newMagic;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int newNum) {
		num = newNum;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int newSize) {
		size = newSize;
	}
	public Object getList() {
		return list;
	}
	public void setList(Object newList) {
		list = newList;
	}
	public int getBadblocks_flags() {
		return badblocks_flags;
	}
	public void setBadblocks_flags(int newBadblocks_flags) {
		badblocks_flags = newBadblocks_flags;
	}
}

package application;

public class struct_io_channel {
	private Object magic;
	private Object manager;
	private Byte name;
	private int block_size;
	private Object read_error;
	private Object write_error;
	private int refcount;
	private int flags;
	private Object[] reserved;
	private Object private_data;
	private Object app_data;
	private int align;
	
	public struct_io_channel(Object magic, Object manager, Byte name, int block_size, Object read_error, Object write_error, int refcount, int flags, Object[] reserved, Object private_data, Object app_data, int align) {
		setMagic(magic);
		setManager(manager);
		setName(name);
		setBlock_size(block_size);
		setRead_error(read_error);
		setWrite_error(write_error);
		setRefcount(refcount);
		setFlags(flags);
		setReserved(reserved);
		setPrivate_data(private_data);
		setApp_data(app_data);
		setAlign(align);
	}
	public struct_io_channel() {
	}
	
	public Object getMagic() {
		return magic;
	}
	public void setMagic(Object newMagic) {
		magic = newMagic;
	}
	public Object getManager() {
		return manager;
	}
	public void setManager(Object newManager) {
		manager = newManager;
	}
	public Byte getName() {
		return name;
	}
	public void setName(Byte newName) {
		name = newName;
	}
	public int getBlock_size() {
		return block_size;
	}
	public void setBlock_size(int newBlock_size) {
		block_size = newBlock_size;
	}
	public Object getRead_error() {
		return read_error;
	}
	public void setRead_error(Object newRead_error) {
		read_error = newRead_error;
	}
	public Object getWrite_error() {
		return write_error;
	}
	public void setWrite_error(Object newWrite_error) {
		write_error = newWrite_error;
	}
	public int getRefcount() {
		return refcount;
	}
	public void setRefcount(int newRefcount) {
		refcount = newRefcount;
	}
	public int getFlags() {
		return flags;
	}
	public void setFlags(int newFlags) {
		flags = newFlags;
	}
	public Object[] getReserved() {
		return reserved;
	}
	public void setReserved(Object[] newReserved) {
		reserved = newReserved;
	}
	public Object getPrivate_data() {
		return private_data;
	}
	public void setPrivate_data(Object newPrivate_data) {
		private_data = newPrivate_data;
	}
	public Object getApp_data() {
		return app_data;
	}
	public void setApp_data(Object newApp_data) {
		app_data = newApp_data;
	}
	public int getAlign() {
		return align;
	}
	public void setAlign(int newAlign) {
		align = newAlign;
	}
}

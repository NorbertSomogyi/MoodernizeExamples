package application;

public class outfile_data {
	private Byte file_name;
	private Object seek;
	private Object ctime;
	
	public outfile_data(Byte file_name, Object seek, Object ctime) {
		setFile_name(file_name);
		setSeek(seek);
		setCtime(ctime);
	}
	public outfile_data() {
	}
	
	public Byte getFile_name() {
		return file_name;
	}
	public void setFile_name(Byte newFile_name) {
		file_name = newFile_name;
	}
	public Object getSeek() {
		return seek;
	}
	public void setSeek(Object newSeek) {
		seek = newSeek;
	}
	public Object getCtime() {
		return ctime;
	}
	public void setCtime(Object newCtime) {
		ctime = newCtime;
	}
}

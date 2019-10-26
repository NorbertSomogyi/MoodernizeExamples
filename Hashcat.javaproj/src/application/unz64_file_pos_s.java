package application;

public class unz64_file_pos_s {
	private Object pos_in_zip_directory;
	private Object num_of_file;
	
	public unz64_file_pos_s(Object pos_in_zip_directory, Object num_of_file) {
		setPos_in_zip_directory(pos_in_zip_directory);
		setNum_of_file(num_of_file);
	}
	public unz64_file_pos_s() {
	}
	
	/*
	typedef struct unz_file_pos_s
	{
	    ZPOS64_T pos_in_zip_directory;   // offset in file
	    ZPOS64_T num_of_file;            // # of file
	} unz_file_pos;
	*/
	public int unzGetFilePos64(Object file) {
		unz64_s s = new unz64_s();
		if (file == ((Object)0) || file_pos == ((Object)0)) {
			return (true);
		} 
		s = (unz64_s)file;
		Object generatedCurrent_file_ok = s.getCurrent_file_ok();
		if (!generatedCurrent_file_ok) {
			return (true);
		} 
		Object generatedPos_in_central_dir = s.getPos_in_central_dir();
		this.setPos_in_zip_directory(generatedPos_in_central_dir);
		Object generatedNum_file = s.getNum_file();
		this.setNum_of_file(generatedNum_file);
		return (false);
	}
	public Object getPos_in_zip_directory() {
		return pos_in_zip_directory;
	}
	public void setPos_in_zip_directory(Object newPos_in_zip_directory) {
		pos_in_zip_directory = newPos_in_zip_directory;
	}
	public Object getNum_of_file() {
		return num_of_file;
	}
	public void setNum_of_file(Object newNum_of_file) {
		num_of_file = newNum_of_file;
	}
}

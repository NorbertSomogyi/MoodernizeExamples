package application;

/* ****************************************** */
/* Ryan supplied functions */
/* unz_file_info contain information about a file in the zipfile */
public class unz_file_pos_s {
	private Object pos_in_zip_directory;
	private Object num_of_file;
	
	public unz_file_pos_s(Object pos_in_zip_directory, Object num_of_file) {
		setPos_in_zip_directory(pos_in_zip_directory);
		setNum_of_file(num_of_file);
	}
	public unz_file_pos_s() {
	}
	
	public int unzGetFilePos(Object file) {
		unz64_file_pos file_pos64 = new unz64_file_pos();
		int err = file_pos64.unzGetFilePos64(file);
		Object generatedPos_in_zip_directory = file_pos64.getPos_in_zip_directory();
		Object generatedNum_of_file = file_pos64.getNum_of_file();
		if (err == (false)) {
			this.setPos_in_zip_directory((uLong)generatedPos_in_zip_directory);
			this.setNum_of_file((uLong)generatedNum_of_file);
		} 
		return err;
	}
	public int unzGoToFilePos(Object file) {
		unz64_file_pos file_pos64 = new unz64_file_pos();
		if (file_pos == ((Object)0)) {
			return (true);
		} 
		Object generatedPos_in_zip_directory = this.getPos_in_zip_directory();
		file_pos64.setPos_in_zip_directory(generatedPos_in_zip_directory);
		Object generatedNum_of_file = this.getNum_of_file();
		file_pos64.setNum_of_file(generatedNum_of_file);
		return ModernizedCProgram.unzGoToFilePos64(file, file_pos64/*
		// Unzip Helper Functions - should be here?
		///////////////////////////////////////////
		*/);
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

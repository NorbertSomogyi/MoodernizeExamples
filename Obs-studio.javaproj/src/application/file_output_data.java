package application;

/* ------------------------------------------------------------------------- */
public class file_output_data {
	private _iobuf file;
	private Byte temp_name;
	private Byte file_name;
	
	public file_output_data(_iobuf file, Byte temp_name, Byte file_name) {
		setFile(file);
		setTemp_name(temp_name);
		setFile_name(file_name);
	}
	public file_output_data() {
	}
	
	public _iobuf getFile() {
		return file;
	}
	public void setFile(_iobuf newFile) {
		file = newFile;
	}
	public Byte getTemp_name() {
		return temp_name;
	}
	public void setTemp_name(Byte newTemp_name) {
		temp_name = newTemp_name;
	}
	public Byte getFile_name() {
		return file_name;
	}
	public void setFile_name(Byte newFile_name) {
		file_name = newFile_name;
	}
}

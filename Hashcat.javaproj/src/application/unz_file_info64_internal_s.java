package application;

/* unz_file_info_interntal contain internal info about a file in zipfile*/
public class unz_file_info64_internal_s {
	private Object offset_curfile;
	
	public unz_file_info64_internal_s(Object offset_curfile) {
		setOffset_curfile(offset_curfile);
	}
	public unz_file_info64_internal_s() {
	}
	
	public Object getOffset_curfile() {
		return offset_curfile;
	}
	public void setOffset_curfile(Object newOffset_curfile) {
		offset_curfile = newOffset_curfile;
	}
}

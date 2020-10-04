package application;

/* unz_global_info structure contain global data about the ZIPfile
   These data comes from the end of central dir */
public class unz_global_info64_s {
	private Object number_entry;
	private Object size_comment;
	
	public unz_global_info64_s(Object number_entry, Object size_comment) {
		setNumber_entry(number_entry);
		setSize_comment(size_comment);
	}
	public unz_global_info64_s() {
	}
	
	public int unzGetGlobalInfo64(Object file) {
		unz64_s s = new unz64_s();
		if (file == (null)) {
			return (true);
		} 
		s = (unz64_s)file;
		Object generatedGi = s.getGi();
		pglobal_info = generatedGi;
		return (false);
	}
	public Object getNumber_entry() {
		return number_entry;
	}
	public void setNumber_entry(Object newNumber_entry) {
		number_entry = newNumber_entry;
	}
	public Object getSize_comment() {
		return size_comment;
	}
	public void setSize_comment(Object newSize_comment) {
		size_comment = newSize_comment;
	}
}

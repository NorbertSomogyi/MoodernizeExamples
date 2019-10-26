package application;

public class unz_global_info_s {
	private Object number_entry;
	private Object size_comment;
	
	public unz_global_info_s(Object number_entry, Object size_comment) {
		setNumber_entry(number_entry);
		setSize_comment(size_comment);
	}
	public unz_global_info_s() {
	}
	
	public int unzGetGlobalInfo(Object file) {
		unz64_s s = new unz64_s();
		if (file == ((Object)0)) {
			return (true);
		} 
		s = (unz64_s)file;
		Object generatedGi = s.getGi();
		this.setNumber_entry((uLong)generatedGi.getNumber_entry());
		this.setSize_comment(generatedGi.getSize_comment());
		return (false/*
		   Translate date/time from Dos format to tm_unz (readable more easilty)
		*/);
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

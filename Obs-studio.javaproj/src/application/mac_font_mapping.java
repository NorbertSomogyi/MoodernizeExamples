package application;

public class mac_font_mapping {
	private int encoding_id;
	private int language_id;
	private Object code_page;
	
	public mac_font_mapping(int encoding_id, int language_id, Object code_page) {
		setEncoding_id(encoding_id);
		setLanguage_id(language_id);
		setCode_page(code_page);
	}
	public mac_font_mapping() {
	}
	
	public int getEncoding_id() {
		return encoding_id;
	}
	public void setEncoding_id(int newEncoding_id) {
		encoding_id = newEncoding_id;
	}
	public int getLanguage_id() {
		return language_id;
	}
	public void setLanguage_id(int newLanguage_id) {
		language_id = newLanguage_id;
	}
	public Object getCode_page() {
		return code_page;
	}
	public void setCode_page(Object newCode_page) {
		code_page = newCode_page;
	}
}

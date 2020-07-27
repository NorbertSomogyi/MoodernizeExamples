package application;

/* This struct is used in wildcard downloading - for parsing LIST response */
public class ftp_parselist_data {
	private  os_type;
	private  state;
	private Object error;
	private fileinfo file_data;
	private int item_length;
	private Object item_offset;
	private  offsets;
	
	public ftp_parselist_data( os_type,  state, Object error, fileinfo file_data, int item_length, Object item_offset,  offsets) {
		setOs_type(os_type);
		setState(state);
		setError(error);
		setFile_data(file_data);
		setItem_length(item_length);
		setItem_offset(item_offset);
		setOffsets(offsets);
	}
	public ftp_parselist_data() {
	}
	
	public ftp_parselist_data Curl_ftp_parselist_data_alloc() {
		return /*Error: Function owner not recognized*/Curl_ccalloc(1, /*Error: Unsupported expression*/);
	}
	public void Curl_ftp_parselist_data_free() {
		ftp_parselist_data parser = parserp;
		fileinfo generatedFile_data = parser.getFile_data();
		if (parser) {
			generatedFile_data.Curl_fileinfo_cleanup();
		} 
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree(parser);
		parserp = ((Object)0);
	}
	public Object Curl_ftp_parselist_geterror() {
		Object generatedError = this.getError();
		return generatedError;
	}
	public  getOs_type() {
		return os_type;
	}
	public void setOs_type( newOs_type) {
		os_type = newOs_type;
	}
	public  getState() {
		return state;
	}
	public void setState( newState) {
		state = newState;
	}
	public Object getError() {
		return error;
	}
	public void setError(Object newError) {
		error = newError;
	}
	public fileinfo getFile_data() {
		return file_data;
	}
	public void setFile_data(fileinfo newFile_data) {
		file_data = newFile_data;
	}
	public int getItem_length() {
		return item_length;
	}
	public void setItem_length(int newItem_length) {
		item_length = newItem_length;
	}
	public Object getItem_offset() {
		return item_offset;
	}
	public void setItem_offset(Object newItem_offset) {
		item_offset = newItem_offset;
	}
	public  getOffsets() {
		return offsets;
	}
	public void setOffsets( newOffsets) {
		offsets = newOffsets;
	}
}

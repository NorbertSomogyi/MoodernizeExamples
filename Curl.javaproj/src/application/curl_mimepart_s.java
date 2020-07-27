package application;

/* A mime part. */
public class curl_mimepart_s {
	private Curl_easy easy;
	private Object parent;
	private Object nextpart;
	private mimekind kind;
	private Byte data;
	private Object readfunc;
	private Object seekfunc;
	private Object freefunc;
	private Object arg;
	private _iobuf fp;
	private curl_slist curlheaders;
	private curl_slist userheaders;
	private Byte mimetype;
	private Byte filename;
	private Byte name;
	private Object datasize;
	private int flags;
	private  state;
	private Object encoder;
	private  encstate;
	
	public curl_mimepart_s(Curl_easy easy, Object parent, Object nextpart, mimekind kind, Byte data, Object readfunc, Object seekfunc, Object freefunc, Object arg, _iobuf fp, curl_slist curlheaders, curl_slist userheaders, Byte mimetype, Byte filename, Byte name, Object datasize, int flags,  state, Object encoder,  encstate) {
		setEasy(easy);
		setParent(parent);
		setNextpart(nextpart);
		setKind(kind);
		setData(data);
		setReadfunc(readfunc);
		setSeekfunc(seekfunc);
		setFreefunc(freefunc);
		setArg(arg);
		setFp(fp);
		setCurlheaders(curlheaders);
		setUserheaders(userheaders);
		setMimetype(mimetype);
		setFilename(filename);
		setName(name);
		setDatasize(datasize);
		setFlags(flags);
		setState(state);
		setEncoder(encoder);
		setEncstate(encstate);
	}
	public curl_mimepart_s() {
	}
	
	public  mime_string_call(Object string, int ccsid, Object mimefunc) {
		byte s = (byte)((Object)0);
		CURLcode result = new CURLcode();
		if (!string) {
			return /*Error: Function owner not recognized*/mimefunc(part, string);
		} 
		s = ModernizedCProgram.dynconvert(819, string, -1, ccsid);
		if (!s) {
			return .CURLE_OUT_OF_MEMORY;
		} 
		result = /*Error: Function owner not recognized*/mimefunc(part, s);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(s);
		return result;
	}
	public  curl_mime_name_ccsid(Object name, int ccsid) {
		return part.mime_string_call(name, ccsid, ModernizedCProgram.curl_mime_name);
	}
	public  curl_mime_filename_ccsid(Object filename, int ccsid) {
		return part.mime_string_call(filename, ccsid, ModernizedCProgram.curl_mime_filename);
	}
	public  curl_mime_type_ccsid(Object mimetype, int ccsid) {
		return part.mime_string_call(mimetype, ccsid, ModernizedCProgram.curl_mime_type);
	}
	public  curl_mime_encoder_ccsid(Object encoding, int ccsid) {
		return part.mime_string_call(encoding, ccsid, ModernizedCProgram.curl_mime_encoder);
	}
	public  curl_mime_filedata_ccsid(Object filename, int ccsid) {
		return part.mime_string_call(filename, ccsid, ModernizedCProgram.curl_mime_filedata);
	}
	public  curl_mime_data_ccsid(Object data, Object datasize, int ccsid) {
		byte s = (byte)((Object)0);
		CURLcode result = new CURLcode();
		if (!data) {
			return ModernizedCProgram.curl_mime_data(part, data, datasize);
		} 
		s = ModernizedCProgram.dynconvert(819, data, datasize, ccsid);
		if (!s) {
			return .CURLE_OUT_OF_MEMORY;
		} 
		result = ModernizedCProgram.curl_mime_data(part, s, datasize);
		/*Error: Function owner not recognized*//*Error: Function owner not recognized*/free(s);
		return result;
	}
	public Curl_easy getEasy() {
		return easy;
	}
	public void setEasy(Curl_easy newEasy) {
		easy = newEasy;
	}
	public Object getParent() {
		return parent;
	}
	public void setParent(Object newParent) {
		parent = newParent;
	}
	public Object getNextpart() {
		return nextpart;
	}
	public void setNextpart(Object newNextpart) {
		nextpart = newNextpart;
	}
	public mimekind getKind() {
		return kind;
	}
	public void setKind(mimekind newKind) {
		kind = newKind;
	}
	public Byte getData() {
		return data;
	}
	public void setData(Byte newData) {
		data = newData;
	}
	public Object getReadfunc() {
		return readfunc;
	}
	public void setReadfunc(Object newReadfunc) {
		readfunc = newReadfunc;
	}
	public Object getSeekfunc() {
		return seekfunc;
	}
	public void setSeekfunc(Object newSeekfunc) {
		seekfunc = newSeekfunc;
	}
	public Object getFreefunc() {
		return freefunc;
	}
	public void setFreefunc(Object newFreefunc) {
		freefunc = newFreefunc;
	}
	public Object getArg() {
		return arg;
	}
	public void setArg(Object newArg) {
		arg = newArg;
	}
	public _iobuf getFp() {
		return fp;
	}
	public void setFp(_iobuf newFp) {
		fp = newFp;
	}
	public curl_slist getCurlheaders() {
		return curlheaders;
	}
	public void setCurlheaders(curl_slist newCurlheaders) {
		curlheaders = newCurlheaders;
	}
	public curl_slist getUserheaders() {
		return userheaders;
	}
	public void setUserheaders(curl_slist newUserheaders) {
		userheaders = newUserheaders;
	}
	public Byte getMimetype() {
		return mimetype;
	}
	public void setMimetype(Byte newMimetype) {
		mimetype = newMimetype;
	}
	public Byte getFilename() {
		return filename;
	}
	public void setFilename(Byte newFilename) {
		filename = newFilename;
	}
	public Byte getName() {
		return name;
	}
	public void setName(Byte newName) {
		name = newName;
	}
	public Object getDatasize() {
		return datasize;
	}
	public void setDatasize(Object newDatasize) {
		datasize = newDatasize;
	}
	public int getFlags() {
		return flags;
	}
	public void setFlags(int newFlags) {
		flags = newFlags;
	}
	public  getState() {
		return state;
	}
	public void setState( newState) {
		state = newState;
	}
	public Object getEncoder() {
		return encoder;
	}
	public void setEncoder(Object newEncoder) {
		encoder = newEncoder;
	}
	public  getEncstate() {
		return encstate;
	}
	public void setEncstate( newEncstate) {
		encstate = newEncstate;
	}
}

package application;

/* A mime part. */
public class curl_mimepart_s {
	private Object easy;
	private Object parent;
	private Object nextpart;
	private mimekind kind;
	private Object data;
	private Object readfunc;
	private Object seekfunc;
	private Object freefunc;
	private Object arg;
	private Object fp;
	private Object curlheaders;
	private Object userheaders;
	private Object mimetype;
	private Object filename;
	private Object name;
	private Object datasize;
	private int flags;
	private  state;
	private Object encoder;
	private  encstate;
	
	public curl_mimepart_s(Object easy, Object parent, Object nextpart, mimekind kind, Object data, Object readfunc, Object seekfunc, Object freefunc, Object arg, Object fp, Object curlheaders, Object userheaders, Object mimetype, Object filename, Object name, Object datasize, int flags,  state, Object encoder,  encstate) {
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
	
	public Object getEasy() {
		return easy;
	}
	public void setEasy(Object newEasy) {
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
	public Object getData() {
		return data;
	}
	public void setData(Object newData) {
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
	public Object getFp() {
		return fp;
	}
	public void setFp(Object newFp) {
		fp = newFp;
	}
	public Object getCurlheaders() {
		return curlheaders;
	}
	public void setCurlheaders(Object newCurlheaders) {
		curlheaders = newCurlheaders;
	}
	public Object getUserheaders() {
		return userheaders;
	}
	public void setUserheaders(Object newUserheaders) {
		userheaders = newUserheaders;
	}
	public Object getMimetype() {
		return mimetype;
	}
	public void setMimetype(Object newMimetype) {
		mimetype = newMimetype;
	}
	public Object getFilename() {
		return filename;
	}
	public void setFilename(Object newFilename) {
		filename = newFilename;
	}
	public Object getName() {
		return name;
	}
	public void setName(Object newName) {
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

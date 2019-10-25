package application;

/* Request-specific data */
public class SingleRequest {
	private Object size;
	private Object maxdownload;
	private Object bytecount;
	private Object writebytecount;
	private Object headerbytecount;
	private Object deductheadercount;
	private curltime start;
	private curltime now;
	private  badheader;
	private int headerline;
	private Object hbufp;
	private Object hbuflen;
	private Object str;
	private Object str_start;
	private Object end_ptr;
	private Object p;
	private Object offset;
	private int httpcode;
	private curltime start100;
	private expect100 exp100;
	private upgrade101 upgr101;
	private Object writer_stack;
	private Object timeofdoc;
	private long bodywrites;
	private Object buf;
	private int keepon;
	private Object location;
	private Object newurl;
	private Object upload_present;
	private Object upload_fromhere;
	private Object protop;
	private dohdata doh;
	private Object header;
	private Object content_range;
	private Object upload_done;
	private Object ignorebody;
	private Object http_bodyless;
	private Object chunk;
	private Object upload_chunky;
	private Object getheader;
	private Object forbidchunk;
	
	public SingleRequest(Object size, Object maxdownload, Object bytecount, Object writebytecount, Object headerbytecount, Object deductheadercount, curltime start, curltime now,  badheader, int headerline, Object hbufp, Object hbuflen, Object str, Object str_start, Object end_ptr, Object p, Object offset, int httpcode, curltime start100, expect100 exp100, upgrade101 upgr101, Object writer_stack, Object timeofdoc, long bodywrites, Object buf, int keepon, Object location, Object newurl, Object upload_present, Object upload_fromhere, Object protop, dohdata doh, Object header, Object content_range, Object upload_done, Object ignorebody, Object http_bodyless, Object chunk, Object upload_chunky, Object getheader, Object forbidchunk) {
		setSize(size);
		setMaxdownload(maxdownload);
		setBytecount(bytecount);
		setWritebytecount(writebytecount);
		setHeaderbytecount(headerbytecount);
		setDeductheadercount(deductheadercount);
		setStart(start);
		setNow(now);
		setBadheader(badheader);
		setHeaderline(headerline);
		setHbufp(hbufp);
		setHbuflen(hbuflen);
		setStr(str);
		setStr_start(str_start);
		setEnd_ptr(end_ptr);
		setP(p);
		setOffset(offset);
		setHttpcode(httpcode);
		setStart100(start100);
		setExp100(exp100);
		setUpgr101(upgr101);
		setWriter_stack(writer_stack);
		setTimeofdoc(timeofdoc);
		setBodywrites(bodywrites);
		setBuf(buf);
		setKeepon(keepon);
		setLocation(location);
		setNewurl(newurl);
		setUpload_present(upload_present);
		setUpload_fromhere(upload_fromhere);
		setProtop(protop);
		setDoh(doh);
		setHeader(header);
		setContent_range(content_range);
		setUpload_done(upload_done);
		setIgnorebody(ignorebody);
		setHttp_bodyless(http_bodyless);
		setChunk(chunk);
		setUpload_chunky(upload_chunky);
		setGetheader(getheader);
		setForbidchunk(forbidchunk);
	}
	public SingleRequest() {
	}
	
	public Object getSize() {
		return size;
	}
	public void setSize(Object newSize) {
		size = newSize;
	}
	public Object getMaxdownload() {
		return maxdownload;
	}
	public void setMaxdownload(Object newMaxdownload) {
		maxdownload = newMaxdownload;
	}
	public Object getBytecount() {
		return bytecount;
	}
	public void setBytecount(Object newBytecount) {
		bytecount = newBytecount;
	}
	public Object getWritebytecount() {
		return writebytecount;
	}
	public void setWritebytecount(Object newWritebytecount) {
		writebytecount = newWritebytecount;
	}
	public Object getHeaderbytecount() {
		return headerbytecount;
	}
	public void setHeaderbytecount(Object newHeaderbytecount) {
		headerbytecount = newHeaderbytecount;
	}
	public Object getDeductheadercount() {
		return deductheadercount;
	}
	public void setDeductheadercount(Object newDeductheadercount) {
		deductheadercount = newDeductheadercount;
	}
	public curltime getStart() {
		return start;
	}
	public void setStart(curltime newStart) {
		start = newStart;
	}
	public curltime getNow() {
		return now;
	}
	public void setNow(curltime newNow) {
		now = newNow;
	}
	public  getBadheader() {
		return badheader;
	}
	public void setBadheader( newBadheader) {
		badheader = newBadheader;
	}
	public int getHeaderline() {
		return headerline;
	}
	public void setHeaderline(int newHeaderline) {
		headerline = newHeaderline;
	}
	public Object getHbufp() {
		return hbufp;
	}
	public void setHbufp(Object newHbufp) {
		hbufp = newHbufp;
	}
	public Object getHbuflen() {
		return hbuflen;
	}
	public void setHbuflen(Object newHbuflen) {
		hbuflen = newHbuflen;
	}
	public Object getStr() {
		return str;
	}
	public void setStr(Object newStr) {
		str = newStr;
	}
	public Object getStr_start() {
		return str_start;
	}
	public void setStr_start(Object newStr_start) {
		str_start = newStr_start;
	}
	public Object getEnd_ptr() {
		return end_ptr;
	}
	public void setEnd_ptr(Object newEnd_ptr) {
		end_ptr = newEnd_ptr;
	}
	public Object getP() {
		return p;
	}
	public void setP(Object newP) {
		p = newP;
	}
	public Object getOffset() {
		return offset;
	}
	public void setOffset(Object newOffset) {
		offset = newOffset;
	}
	public int getHttpcode() {
		return httpcode;
	}
	public void setHttpcode(int newHttpcode) {
		httpcode = newHttpcode;
	}
	public curltime getStart100() {
		return start100;
	}
	public void setStart100(curltime newStart100) {
		start100 = newStart100;
	}
	public expect100 getExp100() {
		return exp100;
	}
	public void setExp100(expect100 newExp100) {
		exp100 = newExp100;
	}
	public upgrade101 getUpgr101() {
		return upgr101;
	}
	public void setUpgr101(upgrade101 newUpgr101) {
		upgr101 = newUpgr101;
	}
	public Object getWriter_stack() {
		return writer_stack;
	}
	public void setWriter_stack(Object newWriter_stack) {
		writer_stack = newWriter_stack;
	}
	public Object getTimeofdoc() {
		return timeofdoc;
	}
	public void setTimeofdoc(Object newTimeofdoc) {
		timeofdoc = newTimeofdoc;
	}
	public long getBodywrites() {
		return bodywrites;
	}
	public void setBodywrites(long newBodywrites) {
		bodywrites = newBodywrites;
	}
	public Object getBuf() {
		return buf;
	}
	public void setBuf(Object newBuf) {
		buf = newBuf;
	}
	public int getKeepon() {
		return keepon;
	}
	public void setKeepon(int newKeepon) {
		keepon = newKeepon;
	}
	public Object getLocation() {
		return location;
	}
	public void setLocation(Object newLocation) {
		location = newLocation;
	}
	public Object getNewurl() {
		return newurl;
	}
	public void setNewurl(Object newNewurl) {
		newurl = newNewurl;
	}
	public Object getUpload_present() {
		return upload_present;
	}
	public void setUpload_present(Object newUpload_present) {
		upload_present = newUpload_present;
	}
	public Object getUpload_fromhere() {
		return upload_fromhere;
	}
	public void setUpload_fromhere(Object newUpload_fromhere) {
		upload_fromhere = newUpload_fromhere;
	}
	public Object getProtop() {
		return protop;
	}
	public void setProtop(Object newProtop) {
		protop = newProtop;
	}
	public dohdata getDoh() {
		return doh;
	}
	public void setDoh(dohdata newDoh) {
		doh = newDoh;
	}
	public Object getHeader() {
		return header;
	}
	public void setHeader(Object newHeader) {
		header = newHeader;
	}
	public Object getContent_range() {
		return content_range;
	}
	public void setContent_range(Object newContent_range) {
		content_range = newContent_range;
	}
	public Object getUpload_done() {
		return upload_done;
	}
	public void setUpload_done(Object newUpload_done) {
		upload_done = newUpload_done;
	}
	public Object getIgnorebody() {
		return ignorebody;
	}
	public void setIgnorebody(Object newIgnorebody) {
		ignorebody = newIgnorebody;
	}
	public Object getHttp_bodyless() {
		return http_bodyless;
	}
	public void setHttp_bodyless(Object newHttp_bodyless) {
		http_bodyless = newHttp_bodyless;
	}
	public Object getChunk() {
		return chunk;
	}
	public void setChunk(Object newChunk) {
		chunk = newChunk;
	}
	public Object getUpload_chunky() {
		return upload_chunky;
	}
	public void setUpload_chunky(Object newUpload_chunky) {
		upload_chunky = newUpload_chunky;
	}
	public Object getGetheader() {
		return getheader;
	}
	public void setGetheader(Object newGetheader) {
		getheader = newGetheader;
	}
	public Object getForbidchunk() {
		return forbidchunk;
	}
	public void setForbidchunk(Object newForbidchunk) {
		forbidchunk = newForbidchunk;
	}
}

package application;

/* the alt-svc cache */
/* for all the progress meter data */
public class Progress {
	private Object lastshow;
	private Object size_dl;
	private Object size_ul;
	private Object downloaded;
	private Object uploaded;
	private Object current_speed;
	private int width;
	private int flags;
	private Object timespent;
	private Object dlspeed;
	private Object ulspeed;
	private Object t_nslookup;
	private Object t_connect;
	private Object t_appconnect;
	private Object t_pretransfer;
	private Object t_starttransfer;
	private Object t_redirect;
	private curltime start;
	private curltime t_startsingle;
	private curltime t_startop;
	private curltime t_acceptdata;
	private curltime ul_limit_start;
	private Object ul_limit_size;
	private curltime dl_limit_start;
	private Object dl_limit_size;
	private Object speeder;
	private Object speeder_time;
	private int speeder_c;
	private Object callback;
	private Object is_t_startransfer_set;
	
	public Progress(Object lastshow, Object size_dl, Object size_ul, Object downloaded, Object uploaded, Object current_speed, int width, int flags, Object timespent, Object dlspeed, Object ulspeed, Object t_nslookup, Object t_connect, Object t_appconnect, Object t_pretransfer, Object t_starttransfer, Object t_redirect, curltime start, curltime t_startsingle, curltime t_startop, curltime t_acceptdata, curltime ul_limit_start, Object ul_limit_size, curltime dl_limit_start, Object dl_limit_size, Object speeder, Object speeder_time, int speeder_c, Object callback, Object is_t_startransfer_set) {
		setLastshow(lastshow);
		setSize_dl(size_dl);
		setSize_ul(size_ul);
		setDownloaded(downloaded);
		setUploaded(uploaded);
		setCurrent_speed(current_speed);
		setWidth(width);
		setFlags(flags);
		setTimespent(timespent);
		setDlspeed(dlspeed);
		setUlspeed(ulspeed);
		setT_nslookup(t_nslookup);
		setT_connect(t_connect);
		setT_appconnect(t_appconnect);
		setT_pretransfer(t_pretransfer);
		setT_starttransfer(t_starttransfer);
		setT_redirect(t_redirect);
		setStart(start);
		setT_startsingle(t_startsingle);
		setT_startop(t_startop);
		setT_acceptdata(t_acceptdata);
		setUl_limit_start(ul_limit_start);
		setUl_limit_size(ul_limit_size);
		setDl_limit_start(dl_limit_start);
		setDl_limit_size(dl_limit_size);
		setSpeeder(speeder);
		setSpeeder_time(speeder_time);
		setSpeeder_c(speeder_c);
		setCallback(callback);
		setIs_t_startransfer_set(is_t_startransfer_set);
	}
	public Progress() {
	}
	
	public Object getLastshow() {
		return lastshow;
	}
	public void setLastshow(Object newLastshow) {
		lastshow = newLastshow;
	}
	public Object getSize_dl() {
		return size_dl;
	}
	public void setSize_dl(Object newSize_dl) {
		size_dl = newSize_dl;
	}
	public Object getSize_ul() {
		return size_ul;
	}
	public void setSize_ul(Object newSize_ul) {
		size_ul = newSize_ul;
	}
	public Object getDownloaded() {
		return downloaded;
	}
	public void setDownloaded(Object newDownloaded) {
		downloaded = newDownloaded;
	}
	public Object getUploaded() {
		return uploaded;
	}
	public void setUploaded(Object newUploaded) {
		uploaded = newUploaded;
	}
	public Object getCurrent_speed() {
		return current_speed;
	}
	public void setCurrent_speed(Object newCurrent_speed) {
		current_speed = newCurrent_speed;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int newWidth) {
		width = newWidth;
	}
	public int getFlags() {
		return flags;
	}
	public void setFlags(int newFlags) {
		flags = newFlags;
	}
	public Object getTimespent() {
		return timespent;
	}
	public void setTimespent(Object newTimespent) {
		timespent = newTimespent;
	}
	public Object getDlspeed() {
		return dlspeed;
	}
	public void setDlspeed(Object newDlspeed) {
		dlspeed = newDlspeed;
	}
	public Object getUlspeed() {
		return ulspeed;
	}
	public void setUlspeed(Object newUlspeed) {
		ulspeed = newUlspeed;
	}
	public Object getT_nslookup() {
		return t_nslookup;
	}
	public void setT_nslookup(Object newT_nslookup) {
		t_nslookup = newT_nslookup;
	}
	public Object getT_connect() {
		return t_connect;
	}
	public void setT_connect(Object newT_connect) {
		t_connect = newT_connect;
	}
	public Object getT_appconnect() {
		return t_appconnect;
	}
	public void setT_appconnect(Object newT_appconnect) {
		t_appconnect = newT_appconnect;
	}
	public Object getT_pretransfer() {
		return t_pretransfer;
	}
	public void setT_pretransfer(Object newT_pretransfer) {
		t_pretransfer = newT_pretransfer;
	}
	public Object getT_starttransfer() {
		return t_starttransfer;
	}
	public void setT_starttransfer(Object newT_starttransfer) {
		t_starttransfer = newT_starttransfer;
	}
	public Object getT_redirect() {
		return t_redirect;
	}
	public void setT_redirect(Object newT_redirect) {
		t_redirect = newT_redirect;
	}
	public curltime getStart() {
		return start;
	}
	public void setStart(curltime newStart) {
		start = newStart;
	}
	public curltime getT_startsingle() {
		return t_startsingle;
	}
	public void setT_startsingle(curltime newT_startsingle) {
		t_startsingle = newT_startsingle;
	}
	public curltime getT_startop() {
		return t_startop;
	}
	public void setT_startop(curltime newT_startop) {
		t_startop = newT_startop;
	}
	public curltime getT_acceptdata() {
		return t_acceptdata;
	}
	public void setT_acceptdata(curltime newT_acceptdata) {
		t_acceptdata = newT_acceptdata;
	}
	public curltime getUl_limit_start() {
		return ul_limit_start;
	}
	public void setUl_limit_start(curltime newUl_limit_start) {
		ul_limit_start = newUl_limit_start;
	}
	public Object getUl_limit_size() {
		return ul_limit_size;
	}
	public void setUl_limit_size(Object newUl_limit_size) {
		ul_limit_size = newUl_limit_size;
	}
	public curltime getDl_limit_start() {
		return dl_limit_start;
	}
	public void setDl_limit_start(curltime newDl_limit_start) {
		dl_limit_start = newDl_limit_start;
	}
	public Object getDl_limit_size() {
		return dl_limit_size;
	}
	public void setDl_limit_size(Object newDl_limit_size) {
		dl_limit_size = newDl_limit_size;
	}
	public Object getSpeeder() {
		return speeder;
	}
	public void setSpeeder(Object newSpeeder) {
		speeder = newSpeeder;
	}
	public Object getSpeeder_time() {
		return speeder_time;
	}
	public void setSpeeder_time(Object newSpeeder_time) {
		speeder_time = newSpeeder_time;
	}
	public int getSpeeder_c() {
		return speeder_c;
	}
	public void setSpeeder_c(int newSpeeder_c) {
		speeder_c = newSpeeder_c;
	}
	public Object getCallback() {
		return callback;
	}
	public void setCallback(Object newCallback) {
		callback = newCallback;
	}
	public Object getIs_t_startransfer_set() {
		return is_t_startransfer_set;
	}
	public void setIs_t_startransfer_set(Object newIs_t_startransfer_set) {
		is_t_startransfer_set = newIs_t_startransfer_set;
	}
}

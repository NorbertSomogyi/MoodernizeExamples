package application;

/* last in list */
/*
 * Values that are generated, temporary or calculated internally for a
 * "session handle" must be defined within the 'struct UrlState'.  This struct
 * will be used within the Curl_easy struct. When the 'Curl_easy'
 * struct is cloned, this data MUST NOT be copied.
 *
 * Remember that any "state" information goes globally for the curl handle.
 * Session-data MUST be put in the connectdata struct and here.  */
/* auth details for host */
/* auth details for proxy */
public class auth {
	private long want;
	private long picked;
	private long avail;
	private Object done;
	private Object multipass;
	private Object iestyle;
	
	public auth(long want, long picked, long avail, Object done, Object multipass, Object iestyle) {
		setWant(want);
		setPicked(picked);
		setAvail(avail);
		setDone(done);
		setMultipass(multipass);
		setIestyle(iestyle);
	}
	public auth() {
	}
	
	public long getWant() {
		return want;
	}
	public void setWant(long newWant) {
		want = newWant;
	}
	public long getPicked() {
		return picked;
	}
	public void setPicked(long newPicked) {
		picked = newPicked;
	}
	public long getAvail() {
		return avail;
	}
	public void setAvail(long newAvail) {
		avail = newAvail;
	}
	public Object getDone() {
		return done;
	}
	public void setDone(Object newDone) {
		done = newDone;
	}
	public Object getMultipass() {
		return multipass;
	}
	public void setMultipass(Object newMultipass) {
		multipass = newMultipass;
	}
	public Object getIestyle() {
		return iestyle;
	}
	public void setIestyle(Object newIestyle) {
		iestyle = newIestyle;
	}
}

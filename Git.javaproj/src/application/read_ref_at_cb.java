package application;

public class read_ref_at_cb {
	private Object refname;
	private Object at_time;
	private int cnt;
	private int reccnt;
	private object_id oid;
	private int found_it;
	private object_id ooid;
	private object_id noid;
	private int tz;
	private Object date;
	private Byte msg;
	private Object cutoff_time;
	private Integer cutoff_tz;
	private Integer cutoff_cnt;
	
	public read_ref_at_cb(Object refname, Object at_time, int cnt, int reccnt, object_id oid, int found_it, object_id ooid, object_id noid, int tz, Object date, Byte msg, Object cutoff_time, Integer cutoff_tz, Integer cutoff_cnt) {
		setRefname(refname);
		setAt_time(at_time);
		setCnt(cnt);
		setReccnt(reccnt);
		setOid(oid);
		setFound_it(found_it);
		setOoid(ooid);
		setNoid(noid);
		setTz(tz);
		setDate(date);
		setMsg(msg);
		setCutoff_time(cutoff_time);
		setCutoff_tz(cutoff_tz);
		setCutoff_cnt(cutoff_cnt);
	}
	public read_ref_at_cb() {
	}
	
	public Object getRefname() {
		return refname;
	}
	public void setRefname(Object newRefname) {
		refname = newRefname;
	}
	public Object getAt_time() {
		return at_time;
	}
	public void setAt_time(Object newAt_time) {
		at_time = newAt_time;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int newCnt) {
		cnt = newCnt;
	}
	public int getReccnt() {
		return reccnt;
	}
	public void setReccnt(int newReccnt) {
		reccnt = newReccnt;
	}
	public object_id getOid() {
		return oid;
	}
	public void setOid(object_id newOid) {
		oid = newOid;
	}
	public int getFound_it() {
		return found_it;
	}
	public void setFound_it(int newFound_it) {
		found_it = newFound_it;
	}
	public object_id getOoid() {
		return ooid;
	}
	public void setOoid(object_id newOoid) {
		ooid = newOoid;
	}
	public object_id getNoid() {
		return noid;
	}
	public void setNoid(object_id newNoid) {
		noid = newNoid;
	}
	public int getTz() {
		return tz;
	}
	public void setTz(int newTz) {
		tz = newTz;
	}
	public Object getDate() {
		return date;
	}
	public void setDate(Object newDate) {
		date = newDate;
	}
	public Byte getMsg() {
		return msg;
	}
	public void setMsg(Byte newMsg) {
		msg = newMsg;
	}
	public Object getCutoff_time() {
		return cutoff_time;
	}
	public void setCutoff_time(Object newCutoff_time) {
		cutoff_time = newCutoff_time;
	}
	public Integer getCutoff_tz() {
		return cutoff_tz;
	}
	public void setCutoff_tz(Integer newCutoff_tz) {
		cutoff_tz = newCutoff_tz;
	}
	public Integer getCutoff_cnt() {
		return cutoff_cnt;
	}
	public void setCutoff_cnt(Integer newCutoff_cnt) {
		cutoff_cnt = newCutoff_cnt;
	}
}

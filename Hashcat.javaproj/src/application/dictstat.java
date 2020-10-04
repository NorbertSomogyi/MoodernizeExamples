package application;

public class dictstat {
	private Object cnt;
	private stat stat;
	private Object[] encoding_from;
	private Object[] encoding_to;
	
	public dictstat(Object cnt, stat stat, Object[] encoding_from, Object[] encoding_to) {
		setCnt(cnt);
		setStat(stat);
		setEncoding_from(encoding_from);
		setEncoding_to(encoding_to);
	}
	public dictstat() {
	}
	
	public Object getCnt() {
		return cnt;
	}
	public void setCnt(Object newCnt) {
		cnt = newCnt;
	}
	public stat getStat() {
		return stat;
	}
	public void setStat(stat newStat) {
		stat = newStat;
	}
	public Object[] getEncoding_from() {
		return encoding_from;
	}
	public void setEncoding_from(Object[] newEncoding_from) {
		encoding_from = newEncoding_from;
	}
	public Object[] getEncoding_to() {
		return encoding_to;
	}
	public void setEncoding_to(Object[] newEncoding_to) {
		encoding_to = newEncoding_to;
	}
}

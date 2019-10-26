package application;

public class thread_param {
	private Object tid;
	private hashcat_ctx hashcat_ctx;
	
	public thread_param(Object tid, hashcat_ctx hashcat_ctx) {
		setTid(tid);
		setHashcat_ctx(hashcat_ctx);
	}
	public thread_param() {
	}
	
	public Object getTid() {
		return tid;
	}
	public void setTid(Object newTid) {
		tid = newTid;
	}
	public hashcat_ctx getHashcat_ctx() {
		return hashcat_ctx;
	}
	public void setHashcat_ctx(hashcat_ctx newHashcat_ctx) {
		hashcat_ctx = newHashcat_ctx;
	}
}

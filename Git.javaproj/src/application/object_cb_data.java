package application;

public class object_cb_data {
	private batch_options opt;
	private expand_data expand;
	private oidset seen;
	private strbuf scratch;
	
	public object_cb_data(batch_options opt, expand_data expand, oidset seen, strbuf scratch) {
		setOpt(opt);
		setExpand(expand);
		setSeen(seen);
		setScratch(scratch);
	}
	public object_cb_data() {
	}
	
	public batch_options getOpt() {
		return opt;
	}
	public void setOpt(batch_options newOpt) {
		opt = newOpt;
	}
	public expand_data getExpand() {
		return expand;
	}
	public void setExpand(expand_data newExpand) {
		expand = newExpand;
	}
	public oidset getSeen() {
		return seen;
	}
	public void setSeen(oidset newSeen) {
		seen = newSeen;
	}
	public strbuf getScratch() {
		return scratch;
	}
	public void setScratch(strbuf newScratch) {
		scratch = newScratch;
	}
}

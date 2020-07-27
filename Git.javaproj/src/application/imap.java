package application;

public class imap {
	private int uidnext;
	private int caps;
	private int rcaps;
	private int nexttag;
	private int num_in_progress;
	private int literal_pending;
	private imap_cmd in_progress;
	private imap_cmd in_progress_append;
	private imap_buffer buf;
	
	public imap(int uidnext, int caps, int rcaps, int nexttag, int num_in_progress, int literal_pending, imap_cmd in_progress, imap_cmd in_progress_append, imap_buffer buf) {
		setUidnext(uidnext);
		setCaps(caps);
		setRcaps(rcaps);
		setNexttag(nexttag);
		setNum_in_progress(num_in_progress);
		setLiteral_pending(literal_pending);
		setIn_progress(in_progress);
		setIn_progress_append(in_progress_append);
		setBuf(buf);
	}
	public imap() {
	}
	
	public void parse_capability(Byte cmd) {
		byte arg;
		int i;
		this.setCaps(-1024);
		int generatedCaps = this.getCaps();
		while ((arg = ModernizedCProgram.next_arg(cmd))) {
			for (i = 0; i < (/*Error: sizeof expression not supported yet*/ / /*Error: sizeof expression not supported yet*/ + (/*Error: Unsupported expression*/ - 1)); i++) {
				if (!/*Error: Function owner not recognized*/strcmp(ModernizedCProgram.cap_list[i], arg)) {
					generatedCaps |=  1 << i;
				} 
			}
		}
		this.setRcaps(generatedCaps);
	}
	public int getUidnext() {
		return uidnext;
	}
	public void setUidnext(int newUidnext) {
		uidnext = newUidnext;
	}
	public int getCaps() {
		return caps;
	}
	public void setCaps(int newCaps) {
		caps = newCaps;
	}
	public int getRcaps() {
		return rcaps;
	}
	public void setRcaps(int newRcaps) {
		rcaps = newRcaps;
	}
	public int getNexttag() {
		return nexttag;
	}
	public void setNexttag(int newNexttag) {
		nexttag = newNexttag;
	}
	public int getNum_in_progress() {
		return num_in_progress;
	}
	public void setNum_in_progress(int newNum_in_progress) {
		num_in_progress = newNum_in_progress;
	}
	public int getLiteral_pending() {
		return literal_pending;
	}
	public void setLiteral_pending(int newLiteral_pending) {
		literal_pending = newLiteral_pending;
	}
	public imap_cmd getIn_progress() {
		return in_progress;
	}
	public void setIn_progress(imap_cmd newIn_progress) {
		in_progress = newIn_progress;
	}
	public imap_cmd getIn_progress_append() {
		return in_progress_append;
	}
	public void setIn_progress_append(imap_cmd newIn_progress_append) {
		in_progress_append = newIn_progress_append;
	}
	public imap_buffer getBuf() {
		return buf;
	}
	public void setBuf(imap_buffer newBuf) {
		buf = newBuf;
	}
}

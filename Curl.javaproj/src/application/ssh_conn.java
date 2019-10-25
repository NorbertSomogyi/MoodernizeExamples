package application;

/* ssh_conn is used for struct connection-oriented data in the connectdata
   struct */
public class ssh_conn {
	private Object authlist;
	private Object passphrase;
	private Object rsa_pub;
	private Object rsa;
	private  authed;
	private  state;
	private  nextstate;
	private  actualcode;
	private Object quote_item;
	private Object quote_path1;
	private Object quote_path2;
	private  acceptfail;
	private Object homedir;
	private Object readdir_len;
	private Object readdir_totalLen;
	private Object readdir_currLen;
	private Object readdir_line;
	private Object readdir_linkPath;
	private int secondCreateDirs;
	private Object slash_pos;
	private int orig_waitfor;
	
	public ssh_conn(Object authlist, Object passphrase, Object rsa_pub, Object rsa,  authed,  state,  nextstate,  actualcode, Object quote_item, Object quote_path1, Object quote_path2,  acceptfail, Object homedir, Object readdir_len, Object readdir_totalLen, Object readdir_currLen, Object readdir_line, Object readdir_linkPath, int secondCreateDirs, Object slash_pos, int orig_waitfor) {
		setAuthlist(authlist);
		setPassphrase(passphrase);
		setRsa_pub(rsa_pub);
		setRsa(rsa);
		setAuthed(authed);
		setState(state);
		setNextstate(nextstate);
		setActualcode(actualcode);
		setQuote_item(quote_item);
		setQuote_path1(quote_path1);
		setQuote_path2(quote_path2);
		setAcceptfail(acceptfail);
		setHomedir(homedir);
		setReaddir_len(readdir_len);
		setReaddir_totalLen(readdir_totalLen);
		setReaddir_currLen(readdir_currLen);
		setReaddir_line(readdir_line);
		setReaddir_linkPath(readdir_linkPath);
		setSecondCreateDirs(secondCreateDirs);
		setSlash_pos(slash_pos);
		setOrig_waitfor(orig_waitfor);
	}
	public ssh_conn() {
	}
	
	public Object getAuthlist() {
		return authlist;
	}
	public void setAuthlist(Object newAuthlist) {
		authlist = newAuthlist;
	}
	public Object getPassphrase() {
		return passphrase;
	}
	public void setPassphrase(Object newPassphrase) {
		passphrase = newPassphrase;
	}
	public Object getRsa_pub() {
		return rsa_pub;
	}
	public void setRsa_pub(Object newRsa_pub) {
		rsa_pub = newRsa_pub;
	}
	public Object getRsa() {
		return rsa;
	}
	public void setRsa(Object newRsa) {
		rsa = newRsa;
	}
	public  getAuthed() {
		return authed;
	}
	public void setAuthed( newAuthed) {
		authed = newAuthed;
	}
	public  getState() {
		return state;
	}
	public void setState( newState) {
		state = newState;
	}
	public  getNextstate() {
		return nextstate;
	}
	public void setNextstate( newNextstate) {
		nextstate = newNextstate;
	}
	public  getActualcode() {
		return actualcode;
	}
	public void setActualcode( newActualcode) {
		actualcode = newActualcode;
	}
	public Object getQuote_item() {
		return quote_item;
	}
	public void setQuote_item(Object newQuote_item) {
		quote_item = newQuote_item;
	}
	public Object getQuote_path1() {
		return quote_path1;
	}
	public void setQuote_path1(Object newQuote_path1) {
		quote_path1 = newQuote_path1;
	}
	public Object getQuote_path2() {
		return quote_path2;
	}
	public void setQuote_path2(Object newQuote_path2) {
		quote_path2 = newQuote_path2;
	}
	public  getAcceptfail() {
		return acceptfail;
	}
	public void setAcceptfail( newAcceptfail) {
		acceptfail = newAcceptfail;
	}
	public Object getHomedir() {
		return homedir;
	}
	public void setHomedir(Object newHomedir) {
		homedir = newHomedir;
	}
	public Object getReaddir_len() {
		return readdir_len;
	}
	public void setReaddir_len(Object newReaddir_len) {
		readdir_len = newReaddir_len;
	}
	public Object getReaddir_totalLen() {
		return readdir_totalLen;
	}
	public void setReaddir_totalLen(Object newReaddir_totalLen) {
		readdir_totalLen = newReaddir_totalLen;
	}
	public Object getReaddir_currLen() {
		return readdir_currLen;
	}
	public void setReaddir_currLen(Object newReaddir_currLen) {
		readdir_currLen = newReaddir_currLen;
	}
	public Object getReaddir_line() {
		return readdir_line;
	}
	public void setReaddir_line(Object newReaddir_line) {
		readdir_line = newReaddir_line;
	}
	public Object getReaddir_linkPath() {
		return readdir_linkPath;
	}
	public void setReaddir_linkPath(Object newReaddir_linkPath) {
		readdir_linkPath = newReaddir_linkPath;
	}
	public int getSecondCreateDirs() {
		return secondCreateDirs;
	}
	public void setSecondCreateDirs(int newSecondCreateDirs) {
		secondCreateDirs = newSecondCreateDirs;
	}
	public Object getSlash_pos() {
		return slash_pos;
	}
	public void setSlash_pos(Object newSlash_pos) {
		slash_pos = newSlash_pos;
	}
	public int getOrig_waitfor() {
		return orig_waitfor;
	}
	public void setOrig_waitfor(int newOrig_waitfor) {
		orig_waitfor = newOrig_waitfor;
	}
}

package application;

/* ssh_conn is used for struct connection-oriented data in the connectdata
   struct */
public class ssh_conn {
	private Object authlist;
	private Object passphrase;
	private Byte rsa_pub;
	private Byte rsa;
	private  authed;
	private  state;
	private  nextstate;
	private Object actualcode;
	private curl_slist quote_item;
	private Byte quote_path1;
	private Byte quote_path2;
	private  acceptfail;
	private Byte homedir;
	private Object readdir_len;
	private Object readdir_totalLen;
	private Object readdir_currLen;
	private Byte readdir_line;
	private Byte readdir_linkPath;
	private int secondCreateDirs;
	private Byte slash_pos;
	private int orig_waitfor;
	
	public ssh_conn(Object authlist, Object passphrase, Byte rsa_pub, Byte rsa,  authed,  state,  nextstate, Object actualcode, curl_slist quote_item, Byte quote_path1, Byte quote_path2,  acceptfail, Byte homedir, Object readdir_len, Object readdir_totalLen, Object readdir_currLen, Byte readdir_line, Byte readdir_linkPath, int secondCreateDirs, Byte slash_pos, int orig_waitfor) {
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
	public Byte getRsa_pub() {
		return rsa_pub;
	}
	public void setRsa_pub(Byte newRsa_pub) {
		rsa_pub = newRsa_pub;
	}
	public Byte getRsa() {
		return rsa;
	}
	public void setRsa(Byte newRsa) {
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
	public Object getActualcode() {
		return actualcode;
	}
	public void setActualcode(Object newActualcode) {
		actualcode = newActualcode;
	}
	public curl_slist getQuote_item() {
		return quote_item;
	}
	public void setQuote_item(curl_slist newQuote_item) {
		quote_item = newQuote_item;
	}
	public Byte getQuote_path1() {
		return quote_path1;
	}
	public void setQuote_path1(Byte newQuote_path1) {
		quote_path1 = newQuote_path1;
	}
	public Byte getQuote_path2() {
		return quote_path2;
	}
	public void setQuote_path2(Byte newQuote_path2) {
		quote_path2 = newQuote_path2;
	}
	public  getAcceptfail() {
		return acceptfail;
	}
	public void setAcceptfail( newAcceptfail) {
		acceptfail = newAcceptfail;
	}
	public Byte getHomedir() {
		return homedir;
	}
	public void setHomedir(Byte newHomedir) {
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
	public Byte getReaddir_line() {
		return readdir_line;
	}
	public void setReaddir_line(Byte newReaddir_line) {
		readdir_line = newReaddir_line;
	}
	public Byte getReaddir_linkPath() {
		return readdir_linkPath;
	}
	public void setReaddir_linkPath(Byte newReaddir_linkPath) {
		readdir_linkPath = newReaddir_linkPath;
	}
	public int getSecondCreateDirs() {
		return secondCreateDirs;
	}
	public void setSecondCreateDirs(int newSecondCreateDirs) {
		secondCreateDirs = newSecondCreateDirs;
	}
	public Byte getSlash_pos() {
		return slash_pos;
	}
	public void setSlash_pos(Byte newSlash_pos) {
		slash_pos = newSlash_pos;
	}
	public int getOrig_waitfor() {
		return orig_waitfor;
	}
	public void setOrig_waitfor(int newOrig_waitfor) {
		orig_waitfor = newOrig_waitfor;
	}
}

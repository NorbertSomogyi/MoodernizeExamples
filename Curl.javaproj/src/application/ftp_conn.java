package application;

/* ftp_conn is used for struct connection-oriented data in the connectdata
   struct */
public class ftp_conn {
	private pingpong pp;
	private Byte entrypath;
	private byte[][] dirs;
	private int dirdepth;
	private Byte file;
	private  dont_check;
	private  ctl_valid;
	private  cwddone;
	private int cwdcount;
	private  cwdfail;
	private  wait_data_conn;
	private Byte prevpath;
	private byte transfertype;
	private int count1;
	private int count2;
	private int count3;
	private  state;
	private  state_saved;
	private Object retr_size_saved;
	private Byte server_os;
	private Object known_filesize;
	private Byte newhost;
	private int newport;
	
	public ftp_conn(pingpong pp, Byte entrypath, byte[][] dirs, int dirdepth, Byte file,  dont_check,  ctl_valid,  cwddone, int cwdcount,  cwdfail,  wait_data_conn, Byte prevpath, byte transfertype, int count1, int count2, int count3,  state,  state_saved, Object retr_size_saved, Byte server_os, Object known_filesize, Byte newhost, int newport) {
		setPp(pp);
		setEntrypath(entrypath);
		setDirs(dirs);
		setDirdepth(dirdepth);
		setFile(file);
		setDont_check(dont_check);
		setCtl_valid(ctl_valid);
		setCwddone(cwddone);
		setCwdcount(cwdcount);
		setCwdfail(cwdfail);
		setWait_data_conn(wait_data_conn);
		setPrevpath(prevpath);
		setTransfertype(transfertype);
		setCount1(count1);
		setCount2(count2);
		setCount3(count3);
		setState(state);
		setState_saved(state_saved);
		setRetr_size_saved(retr_size_saved);
		setServer_os(server_os);
		setKnown_filesize(known_filesize);
		setNewhost(newhost);
		setNewport(newport);
	}
	public ftp_conn() {
	}
	
	public void freedirs() {
		byte[][] generatedDirs = this.getDirs();
		int generatedDirdepth = this.getDirdepth();
		if (generatedDirs) {
			int i;
			for (i = 0; i < generatedDirdepth; i++) {
				/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree(generatedDirs[i]);
				generatedDirs[i] = ((Object)0);
			}
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree(generatedDirs);
			this.setDirs(((Object)0));
			this.setDirdepth(0);
		} 
		Byte generatedFile = this.getFile();
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree((generatedFile));
			(generatedFile) = ((Object)0);
		} while (0);
		Byte generatedNewhost = this.getNewhost();
		do {
			/*Error: Function owner not recognized*//*Error: Function owner not recognized*/Curl_cfree((generatedNewhost));
			(generatedNewhost) = ((Object)0);
		} while (/* no longer of any use */0/* Returns non-zero if the given string contains CR (\r) or LF (\n),
		   which are not allowed within RFC 959 <string>.
		   Note: The input string is in the client's encoding which might
		   not be ASCII, so escape sequences \r & \n must be used instead
		   of hex values 0x0d & 0x0a.
		*/);
	}
	public pingpong getPp() {
		return pp;
	}
	public void setPp(pingpong newPp) {
		pp = newPp;
	}
	public Byte getEntrypath() {
		return entrypath;
	}
	public void setEntrypath(Byte newEntrypath) {
		entrypath = newEntrypath;
	}
	public byte[][] getDirs() {
		return dirs;
	}
	public void setDirs(byte[][] newDirs) {
		dirs = newDirs;
	}
	public int getDirdepth() {
		return dirdepth;
	}
	public void setDirdepth(int newDirdepth) {
		dirdepth = newDirdepth;
	}
	public Byte getFile() {
		return file;
	}
	public void setFile(Byte newFile) {
		file = newFile;
	}
	public  getDont_check() {
		return dont_check;
	}
	public void setDont_check( newDont_check) {
		dont_check = newDont_check;
	}
	public  getCtl_valid() {
		return ctl_valid;
	}
	public void setCtl_valid( newCtl_valid) {
		ctl_valid = newCtl_valid;
	}
	public  getCwddone() {
		return cwddone;
	}
	public void setCwddone( newCwddone) {
		cwddone = newCwddone;
	}
	public int getCwdcount() {
		return cwdcount;
	}
	public void setCwdcount(int newCwdcount) {
		cwdcount = newCwdcount;
	}
	public  getCwdfail() {
		return cwdfail;
	}
	public void setCwdfail( newCwdfail) {
		cwdfail = newCwdfail;
	}
	public  getWait_data_conn() {
		return wait_data_conn;
	}
	public void setWait_data_conn( newWait_data_conn) {
		wait_data_conn = newWait_data_conn;
	}
	public Byte getPrevpath() {
		return prevpath;
	}
	public void setPrevpath(Byte newPrevpath) {
		prevpath = newPrevpath;
	}
	public byte getTransfertype() {
		return transfertype;
	}
	public void setTransfertype(byte newTransfertype) {
		transfertype = newTransfertype;
	}
	public int getCount1() {
		return count1;
	}
	public void setCount1(int newCount1) {
		count1 = newCount1;
	}
	public int getCount2() {
		return count2;
	}
	public void setCount2(int newCount2) {
		count2 = newCount2;
	}
	public int getCount3() {
		return count3;
	}
	public void setCount3(int newCount3) {
		count3 = newCount3;
	}
	public  getState() {
		return state;
	}
	public void setState( newState) {
		state = newState;
	}
	public  getState_saved() {
		return state_saved;
	}
	public void setState_saved( newState_saved) {
		state_saved = newState_saved;
	}
	public Object getRetr_size_saved() {
		return retr_size_saved;
	}
	public void setRetr_size_saved(Object newRetr_size_saved) {
		retr_size_saved = newRetr_size_saved;
	}
	public Byte getServer_os() {
		return server_os;
	}
	public void setServer_os(Byte newServer_os) {
		server_os = newServer_os;
	}
	public Object getKnown_filesize() {
		return known_filesize;
	}
	public void setKnown_filesize(Object newKnown_filesize) {
		known_filesize = newKnown_filesize;
	}
	public Byte getNewhost() {
		return newhost;
	}
	public void setNewhost(Byte newNewhost) {
		newhost = newNewhost;
	}
	public int getNewport() {
		return newport;
	}
	public void setNewport(int newNewport) {
		newport = newNewport;
	}
}

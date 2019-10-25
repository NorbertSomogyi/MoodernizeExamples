package application;

/* ftp_conn is used for struct connection-oriented data in the connectdata
   struct */
public class ftp_conn {
	private pingpong pp;
	private Object entrypath;
	private Object dirs;
	private int dirdepth;
	private Object file;
	private  dont_check;
	private  ctl_valid;
	private  cwddone;
	private int cwdcount;
	private  cwdfail;
	private  wait_data_conn;
	private Object prevpath;
	private byte transfertype;
	private int count1;
	private int count2;
	private int count3;
	private  state;
	private  state_saved;
	private Object retr_size_saved;
	private Object server_os;
	private Object known_filesize;
	private Object newhost;
	private int newport;
	
	public ftp_conn(pingpong pp, Object entrypath, Object dirs, int dirdepth, Object file,  dont_check,  ctl_valid,  cwddone, int cwdcount,  cwdfail,  wait_data_conn, Object prevpath, byte transfertype, int count1, int count2, int count3,  state,  state_saved, Object retr_size_saved, Object server_os, Object known_filesize, Object newhost, int newport) {
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
	
	public pingpong getPp() {
		return pp;
	}
	public void setPp(pingpong newPp) {
		pp = newPp;
	}
	public Object getEntrypath() {
		return entrypath;
	}
	public void setEntrypath(Object newEntrypath) {
		entrypath = newEntrypath;
	}
	public Object getDirs() {
		return dirs;
	}
	public void setDirs(Object newDirs) {
		dirs = newDirs;
	}
	public int getDirdepth() {
		return dirdepth;
	}
	public void setDirdepth(int newDirdepth) {
		dirdepth = newDirdepth;
	}
	public Object getFile() {
		return file;
	}
	public void setFile(Object newFile) {
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
	public Object getPrevpath() {
		return prevpath;
	}
	public void setPrevpath(Object newPrevpath) {
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
	public Object getServer_os() {
		return server_os;
	}
	public void setServer_os(Object newServer_os) {
		server_os = newServer_os;
	}
	public Object getKnown_filesize() {
		return known_filesize;
	}
	public void setKnown_filesize(Object newKnown_filesize) {
		known_filesize = newKnown_filesize;
	}
	public Object getNewhost() {
		return newhost;
	}
	public void setNewhost(Object newNewhost) {
		newhost = newNewhost;
	}
	public int getNewport() {
		return newport;
	}
	public void setNewport(int newNewport) {
		newport = newNewport;
	}
}

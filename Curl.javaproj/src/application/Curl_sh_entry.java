package application;

/*
 * We add one of these structs to the sockhash for each socket
 */
/* look up a given socket in the socket hash, skip invalid sockets */
/* make sure this socket is present in the hash for this handle */
public class Curl_sh_entry {
	private curl_hash transfers;
	private int action;
	private Object socketp;
	private int users;
	private int readers;
	private int writers;
	
	public Curl_sh_entry(curl_hash transfers, int action, Object socketp, int users, int readers, int writers) {
		setTransfers(transfers);
		setAction(action);
		setSocketp(socketp);
		setUsers(users);
		setReaders(readers);
		setWriters(writers);
	}
	public Curl_sh_entry() {
	}
	
	public Curl_sh_entry sh_getentry(curl_hash sh, Object s) {
		if (s != CURL_SOCKET_BAD) {
			return sh.Curl_hash_pick((byte)s, /* only look for proper sockets */);
		} 
		return ((Object)0);
	}
	public Curl_sh_entry sh_addentry(curl_hash sh, Object s) {
		Curl_sh_entry curl_sh_entry = new Curl_sh_entry();
		Curl_sh_entry there = curl_sh_entry.sh_getentry(sh, s);
		Curl_sh_entry check = new Curl_sh_entry();
		if (there) {
			return /* it is present, return fine */there;
		} 
		check = .Curl_ccalloc(1, /* not present, add it */);
		if (!check) {
			return ((Object)/* major failure */0);
		} 
		curl_hash generatedTransfers = check.getTransfers();
		if (generatedTransfers.Curl_hash_init(13, trhash, trhash_compare, trhash_dtor)) {
			.Curl_cfree(check);
			return ((Object)0);
		} 
		if (!sh.Curl_hash_add((byte)s, , /* make/add new hash entry */check)) {
			.Curl_cfree(check);
			return ((Object)/* major failure */0);
		} 
		return /* things are good in sockhash land */check;
	}
	public curl_hash getTransfers() {
		return transfers;
	}
	public void setTransfers(curl_hash newTransfers) {
		transfers = newTransfers;
	}
	public int getAction() {
		return action;
	}
	public void setAction(int newAction) {
		action = newAction;
	}
	public Object getSocketp() {
		return socketp;
	}
	public void setSocketp(Object newSocketp) {
		socketp = newSocketp;
	}
	public int getUsers() {
		return users;
	}
	public void setUsers(int newUsers) {
		users = newUsers;
	}
	public int getReaders() {
		return readers;
	}
	public void setReaders(int newReaders) {
		readers = newReaders;
	}
	public int getWriters() {
		return writers;
	}
	public void setWriters(int newWriters) {
		writers = newWriters;
	}
}

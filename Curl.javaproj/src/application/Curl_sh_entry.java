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

package application;

public class flickcurl_contact_s {
	private Object nsid;
	private Object username;
	private int iconserver;
	private Object realname;
	private int is_friend;
	private int is_family;
	private int ignored;
	private int uploaded;
	
	public flickcurl_contact_s(Object nsid, Object username, int iconserver, Object realname, int is_friend, int is_family, int ignored, int uploaded) {
		setNsid(nsid);
		setUsername(username);
		setIconserver(iconserver);
		setRealname(realname);
		setIs_friend(is_friend);
		setIs_family(is_family);
		setIgnored(ignored);
		setUploaded(uploaded);
	}
	public flickcurl_contact_s() {
	}
	
	public Object getNsid() {
		return nsid;
	}
	public void setNsid(Object newNsid) {
		nsid = newNsid;
	}
	public Object getUsername() {
		return username;
	}
	public void setUsername(Object newUsername) {
		username = newUsername;
	}
	public int getIconserver() {
		return iconserver;
	}
	public void setIconserver(int newIconserver) {
		iconserver = newIconserver;
	}
	public Object getRealname() {
		return realname;
	}
	public void setRealname(Object newRealname) {
		realname = newRealname;
	}
	public int getIs_friend() {
		return is_friend;
	}
	public void setIs_friend(int newIs_friend) {
		is_friend = newIs_friend;
	}
	public int getIs_family() {
		return is_family;
	}
	public void setIs_family(int newIs_family) {
		is_family = newIs_family;
	}
	public int getIgnored() {
		return ignored;
	}
	public void setIgnored(int newIgnored) {
		ignored = newIgnored;
	}
	public int getUploaded() {
		return uploaded;
	}
	public void setUploaded(int newUploaded) {
		uploaded = newUploaded;
	}
}

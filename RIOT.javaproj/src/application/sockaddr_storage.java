package application;

public class sockaddr_storage {
	private Object ss_family;
	private Object[] ss_data;
	
	public sockaddr_storage(Object ss_family, Object[] ss_data) {
		setSs_family(ss_family);
		setSs_data(ss_data);
	}
	public sockaddr_storage() {
	}
	
	public Object getSs_family() {
		return ss_family;
	}
	public void setSs_family(Object newSs_family) {
		ss_family = newSs_family;
	}
	public Object[] getSs_data() {
		return ss_data;
	}
	public void setSs_data(Object[] newSs_data) {
		ss_data = newSs_data;
	}
}

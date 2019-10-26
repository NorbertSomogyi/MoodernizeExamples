package application;

public class rename_info {
	private Object old_name;
	private Object new_name;
	private string_list remote_branches;
	
	public rename_info(Object old_name, Object new_name, string_list remote_branches) {
		setOld_name(old_name);
		setNew_name(new_name);
		setRemote_branches(remote_branches);
	}
	public rename_info() {
	}
	
	public Object getOld_name() {
		return old_name;
	}
	public void setOld_name(Object newOld_name) {
		old_name = newOld_name;
	}
	public Object getNew_name() {
		return new_name;
	}
	public void setNew_name(Object newNew_name) {
		new_name = newNew_name;
	}
	public string_list getRemote_branches() {
		return remote_branches;
	}
	public void setRemote_branches(string_list newRemote_branches) {
		remote_branches = newRemote_branches;
	}
}

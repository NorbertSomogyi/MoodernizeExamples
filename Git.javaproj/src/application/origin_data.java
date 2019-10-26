package application;

public class origin_data {
	private object_id oid;
	private int is_local_branch;
	
	public origin_data(object_id oid, int is_local_branch) {
		setOid(oid);
		setIs_local_branch(is_local_branch);
	}
	public origin_data() {
	}
	
	public object_id getOid() {
		return oid;
	}
	public void setOid(object_id newOid) {
		oid = newOid;
	}
	public int getIs_local_branch() {
		return is_local_branch;
	}
	public void setIs_local_branch(int newIs_local_branch) {
		is_local_branch = newIs_local_branch;
	}
}

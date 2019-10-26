package application;

/* to be consumed by git-submodule.sh */
public class update_clone_data {
	private Object sub;
	private object_id oid;
	private int just_cloned;
	
	public update_clone_data(Object sub, object_id oid, int just_cloned) {
		setSub(sub);
		setOid(oid);
		setJust_cloned(just_cloned);
	}
	public update_clone_data() {
	}
	
	public void update_submodule() {
		object_id generatedOid = this.getOid();
		int generatedJust_cloned = this.getJust_cloned();
		Object generatedSub = this.getSub();
		.fprintf((_iob[1]), "dummy %s %d\t%s\n", ModernizedCProgram.oid_to_hex(generatedOid), generatedJust_cloned, generatedSub.getPath());
	}
	public Object getSub() {
		return sub;
	}
	public void setSub(Object newSub) {
		sub = newSub;
	}
	public object_id getOid() {
		return oid;
	}
	public void setOid(object_id newOid) {
		oid = newOid;
	}
	public int getJust_cloned() {
		return just_cloned;
	}
	public void setJust_cloned(int newJust_cloned) {
		just_cloned = newJust_cloned;
	}
}

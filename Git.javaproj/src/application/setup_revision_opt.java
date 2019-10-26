package application;

public class setup_revision_opt {
	private Object def;
	private Object tweak;
	private Object submodule;
	private int assume_dashdash;
	private int allow_exclude_promisor_objects;
	private int revarg_opt;
	
	public setup_revision_opt(Object def, Object tweak, Object submodule, int assume_dashdash, int allow_exclude_promisor_objects, int revarg_opt) {
		setDef(def);
		setTweak(tweak);
		setSubmodule(submodule);
		setAssume_dashdash(assume_dashdash);
		setAllow_exclude_promisor_objects(allow_exclude_promisor_objects);
		setRevarg_opt(revarg_opt);
	}
	public setup_revision_opt() {
	}
	
	public Object getDef() {
		return def;
	}
	public void setDef(Object newDef) {
		def = newDef;
	}
	public Object getTweak() {
		return tweak;
	}
	public void setTweak(Object newTweak) {
		tweak = newTweak;
	}
	public Object getSubmodule() {
		return submodule;
	}
	public void setSubmodule(Object newSubmodule) {
		submodule = newSubmodule;
	}
	public int getAssume_dashdash() {
		return assume_dashdash;
	}
	public void setAssume_dashdash(int newAssume_dashdash) {
		assume_dashdash = newAssume_dashdash;
	}
	public int getAllow_exclude_promisor_objects() {
		return allow_exclude_promisor_objects;
	}
	public void setAllow_exclude_promisor_objects(int newAllow_exclude_promisor_objects) {
		allow_exclude_promisor_objects = newAllow_exclude_promisor_objects;
	}
	public int getRevarg_opt() {
		return revarg_opt;
	}
	public void setRevarg_opt(int newRevarg_opt) {
		revarg_opt = newRevarg_opt;
	}
}
